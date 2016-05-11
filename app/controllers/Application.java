package controllers;

import play.*;
import play.mvc.*;
import play.data.*;
import play.data.Form;
import play.data.validation.ValidationError;
import static play.data.Form.*;
import play.data.validation.Constraints.Required;

import views.html.*;
import java.util.*;
import models.*;



public class Application extends Controller {

    public static Result index() {
        List<Message> datas = Message.find.all();
        return ok(index.render("DBサンプル", datas));
    }

    public static Result add() {
     	Form<Message> myForm = form(Message.class);
        String msg = "投稿フォーム";
        return ok(add.render(msg,myForm));
    }

    public static Result create(){
        Form<Message> f = form(Message.class).bindFromRequest();
        if(!f.hasErrors()){
            Message data = f.get();
            data.postdate = new Date();
            data.save();
            return redirect("/");
        }else{
            String msg = "Error";
            return ok(add.render(msg,f));
        }      
    }

    public static Result setItem() {
        Form<Message> f = form(Message.class).bindFromRequest();
        String msg = "ID番号を入力してください。";
        return ok(setItem.render(msg,f));
    }

    public static Result edit() {
        Form<Message> f = form(Message.class).bindFromRequest();
        if(!f.hasErrors()){
            Message data = Message.find.byId(f.get().id);
            if(data != null){
                String msg = "ID = " + data.id +"の投稿を編集";
                f = f.fill(data);
                return ok(edit.render(msg,f));
            }else{
                String msg = "ERROR:IDの投稿が見つかりません。";
                return ok(setItem.render(msg,f));
            }
        }else{
            String msg = "ERROR:入力に問題があります。";
            return ok(setItem.render(msg,f));
        }
    }

    public static Result doEdit() {
        Form<Message> f = form(Message.class).bindFromRequest();
        if(!f.hasErrors()){
            Message data = Message.find.byId(f.get().id);
            f = f.fill(data).bindFromRequest();
            if(!f.hasErrors()){
                f.get().update();
                return redirect("/");
            }else{
                String msg = "ERROR:再度idを入力してください。";
                 return ok(setItem.render(msg,f));
            }
        }else{
            String msg = "ERROR:再度入力してください。";
            return ok(setItem.render(msg,f));
        }
    }

    public static Result delete() {
        Form<Message> myForm = form(Message.class);
        String msg = "削除するID番号を入力してください。";
        return ok(delete.render(msg,myForm));
    }

    public static Result doDelete(){
        Form<Message> f = form(Message.class).bindFromRequest();
        if(!f.hasErrors()){
                Message data = Message.find.byId(f.get().id);

            if(data != null){
                data.delete();
                return redirect("/");

            }else{
                String msg = "ERROR:そのIDは見つかりません。";
                return ok(delete.render(msg,f));
            }

        }else{
            String msg = "ERROR:入力にエラーが発生しました。";
            return ok(delete.render(msg,f));
        }
    }

  
    public static Result find() {
        Form<Message> f = form(Message.class).bindFromRequest();
        List<Message> datas = null;
        String msg = "投稿者検索";
        if(!f.hasErrors()){
            datas = Message.find.where().eq("name", f.get().name).findList();
            return ok(find.render(msg,f,datas));
        }else{
          return ok(find.render(msg,f,datas));  
        }  
    }

}