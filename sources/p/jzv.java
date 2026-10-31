package p;

import android.content.DialogInterface;
import io.reactivex.rxjava3.subjects.SingleSubject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class jzv implements DialogInterface.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ r0w b;
    public final /* synthetic */ SingleSubject c;

    public /* synthetic */ jzv(SingleSubject singleSubject, r0w r0wVar, byte b) {
        this.a = b;
        this.c = singleSubject;
        this.b = r0wVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        byte b = this.a;
        SingleSubject singleSubject = this.c;
        b7x b7xVar = b7x.a;
        r0w r0wVar = this.b;
        switch (b) {
            case 0:
                i8h1 i8h1Var = r0wVar.a;
                x6h1 x6h1VarC = r0wVar.b.b.c();
                x6h1VarC.i.add(new a7h1("camera_permission_denied_dialog", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                x6h1 x6h1VarC2 = x6h1VarC.a().c();
                x6h1VarC2.i.add(new a7h1("go_to_settings", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                String str = i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null).a.a;
                singleSubject.onSuccess(mzv.a);
                break;
            case 1:
                i8h1 i8h1Var2 = r0wVar.a;
                x6h1 x6h1VarC3 = r0wVar.b.b.c();
                x6h1VarC3.i.add(new a7h1("camera_permission_denied_dialog", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = false;
                x6h1 x6h1VarC4 = x6h1VarC3.a().c();
                x6h1VarC4.i.add(new a7h1("cancel", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC4.j = false;
                String str2 = i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC4.a(), r6h1.c, System.currentTimeMillis()), (xj61) null).a.a;
                singleSubject.onSuccess(lzv.a);
                break;
            case 2:
                singleSubject.onSuccess(szv.a);
                i8h1 i8h1Var3 = r0wVar.a;
                x6h1 x6h1VarC5 = r0wVar.b.b.c();
                x6h1VarC5.i.add(new a7h1("change_photo_dialog", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC5.j = false;
                x6h1 x6h1VarC6 = x6h1VarC5.a().c();
                x6h1VarC6.i.add(new a7h1("choose_photo_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC6.j = false;
                String str3 = i8h1Var3.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC6.a(), r6h1.c, System.currentTimeMillis()), (xj61) null).a.a;
                break;
            case 3:
                singleSubject.onSuccess(k0w.a);
                i8h1 i8h1Var4 = r0wVar.a;
                x6h1 x6h1VarC7 = r0wVar.b.b.c();
                x6h1VarC7.i.add(new a7h1("change_photo_dialog", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC7.j = false;
                x6h1 x6h1VarC8 = x6h1VarC7.a().c();
                x6h1VarC8.i.add(new a7h1("take_photo_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC8.j = false;
                String str4 = i8h1Var4.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC8.a(), r6h1.c, System.currentTimeMillis()), (xj61) null).a.a;
                break;
            case 4:
                singleSubject.onSuccess(g0w.a);
                i8h1 i8h1Var5 = r0wVar.a;
                x6h1 x6h1VarC9 = r0wVar.b.b.c();
                x6h1VarC9.i.add(new a7h1("change_photo_dialog", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC9.j = false;
                x6h1 x6h1VarC10 = x6h1VarC9.a().c();
                x6h1VarC10.i.add(new a7h1("remove_current_photo_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC10.j = false;
                String str5 = i8h1Var5.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC10.a(), r6h1.c, System.currentTimeMillis()), (xj61) null).a.a;
                break;
            case 5:
                i8h1 i8h1Var6 = r0wVar.a;
                x6h1 x6h1VarC11 = r0wVar.b.b.c();
                x6h1VarC11.i.add(new a7h1("confirm_discard_dialog", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC11.j = false;
                x6h1 x6h1VarC12 = x6h1VarC11.a().c();
                x6h1VarC12.i.add(new a7h1("keep_editing_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC12.j = false;
                String str6 = i8h1Var6.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC12.a(), r6h1.c, System.currentTimeMillis()), (xj61) null).a.a;
                singleSubject.onSuccess(tzv.a);
                break;
            default:
                i8h1 i8h1Var7 = r0wVar.a;
                x6h1 x6h1VarC13 = r0wVar.b.b.c();
                x6h1VarC13.i.add(new a7h1("confirm_discard_dialog", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC13.j = false;
                x6h1 x6h1VarC14 = x6h1VarC13.a().c();
                x6h1VarC14.i.add(new a7h1("discard_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC14.j = false;
                String str7 = i8h1Var7.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC14.a(), r6h1.c, System.currentTimeMillis()), (xj61) null).a.a;
                singleSubject.onSuccess(vzv.a);
                break;
        }
    }

    public /* synthetic */ jzv(r0w r0wVar, SingleSubject singleSubject, byte b) {
        this.a = b;
        this.b = r0wVar;
        this.c = singleSubject;
    }
}
