package p;

import android.content.DialogInterface;
import io.reactivex.rxjava3.subjects.SingleSubject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class iyw0 implements DialogInterface.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lis b;
    public final /* synthetic */ SingleSubject c;

    public /* synthetic */ iyw0(lis lisVar, SingleSubject singleSubject, byte b) {
        this.a = b;
        this.b = lisVar;
        this.c = singleSubject;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        byte b = this.a;
        SingleSubject singleSubject = this.c;
        b7x b7xVar = b7x.a;
        lis lisVar = this.b;
        switch (b) {
            case 0:
                i8h1 i8h1Var = lisVar.a;
                x6h1 x6h1VarC = lisVar.c.b.c();
                x6h1VarC.i.add(new a7h1("profile_picture_step", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = true;
                x6h1 x6h1VarC2 = x6h1VarC.a().c();
                x6h1VarC2.i.add(new a7h1("change_photo_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                x6h1 x6h1VarC3 = x6h1VarC2.a().c();
                x6h1VarC3.i.add(new a7h1("change_photo_dialog", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = false;
                x6h1 x6h1VarC4 = x6h1VarC3.a().c();
                x6h1VarC4.i.add(new a7h1("choose_photo_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC4.j = false;
                String str = i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC4.a(), r6h1.c, System.currentTimeMillis()), (xj61) null).a.a;
                singleSubject.onSuccess(yyw0.a);
                break;
            case 1:
                i8h1 i8h1Var2 = lisVar.a;
                x6h1 x6h1VarC5 = lisVar.c.b.c();
                x6h1VarC5.i.add(new a7h1("profile_picture_step", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC5.j = true;
                x6h1 x6h1VarC6 = x6h1VarC5.a().c();
                x6h1VarC6.i.add(new a7h1("change_photo_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC6.j = false;
                x6h1 x6h1VarC7 = x6h1VarC6.a().c();
                x6h1VarC7.i.add(new a7h1("change_photo_dialog", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC7.j = false;
                x6h1 x6h1VarC8 = x6h1VarC7.a().c();
                x6h1VarC8.i.add(new a7h1("take_photo_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC8.j = false;
                String str2 = i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC8.a(), r6h1.c, System.currentTimeMillis()), (xj61) null).a.a;
                singleSubject.onSuccess(zyw0.a);
                break;
            case 2:
                i8h1 i8h1Var3 = lisVar.a;
                x6h1 x6h1VarC9 = lisVar.c.b.c();
                x6h1VarC9.i.add(new a7h1("result_step", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC9.j = true;
                x6h1 x6h1VarC10 = x6h1VarC9.a().c();
                x6h1VarC10.i.add(new a7h1("save_failed_dialog", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC10.j = true;
                x6h1 x6h1VarC11 = x6h1VarC10.a().c();
                x6h1VarC11.i.add(new a7h1("retry_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC11.j = false;
                String str3 = i8h1Var3.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("retry", 1, b7xVar), x6h1VarC11.a(), r6h1.c, System.currentTimeMillis()), (xj61) null).a.a;
                singleSubject.onSuccess(dzw0.a);
                break;
            default:
                i8h1 i8h1Var4 = lisVar.a;
                x6h1 x6h1VarC12 = lisVar.c.b.c();
                x6h1VarC12.i.add(new a7h1("result_step", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC12.j = true;
                x6h1 x6h1VarC13 = x6h1VarC12.a().c();
                x6h1VarC13.i.add(new a7h1("save_failed_dialog", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC13.j = true;
                x6h1 x6h1VarC14 = x6h1VarC13.a().c();
                x6h1VarC14.i.add(new a7h1("cancel_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC14.j = false;
                String str4 = i8h1Var4.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC14.a(), r6h1.c, System.currentTimeMillis()), (xj61) null).a.a;
                singleSubject.onSuccess(czw0.a);
                break;
        }
    }
}
