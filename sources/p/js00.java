package p;

import android.content.DialogInterface;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class js00 implements DialogInterface.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kp00 b;

    public /* synthetic */ js00(kp00 kp00Var, mev mevVar, byte b) {
        this.a = b;
        this.b = kp00Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        byte b = this.a;
        b7x b7xVar = b7x.a;
        kp00 kp00Var = this.b;
        switch (b) {
            case 0:
                uny unyVar = (uny) kp00Var.c;
                i8h1 i8h1Var = (i8h1) unyVar.b;
                i6l0 i6l0VarP = unyVar.p();
                i6l0VarP.getClass();
                x6h1 x6h1VarC = i6l0VarP.b.c();
                x6h1VarC.i.add(new a7h1("explicit_dialog_when_not_locked", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                x6h1 x6h1VarC2 = x6h1VarC.a().c();
                x6h1VarC2.i.add(new a7h1("not_now_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC2.a(), i6l0VarP.a, System.currentTimeMillis()), (xj61) null);
                break;
            case 1:
                uny unyVar2 = (uny) kp00Var.c;
                i8h1 i8h1Var2 = (i8h1) unyVar2.b;
                i6l0 i6l0VarP2 = unyVar2.p();
                i6l0VarP2.getClass();
                x6h1 x6h1VarC3 = i6l0VarP2.b.c();
                x6h1VarC3.i.add(new a7h1("explicit_dialog_when_locked", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = false;
                x6h1 x6h1VarC4 = x6h1VarC3.a().c();
                x6h1VarC4.i.add(new a7h1("close_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC4.j = false;
                i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC4.a(), i6l0VarP2.a, System.currentTimeMillis()), (xj61) null);
                break;
            default:
                uny unyVar3 = (uny) kp00Var.c;
                i8h1 i8h1Var3 = (i8h1) unyVar3.b;
                i6l0 i6l0VarP3 = unyVar3.p();
                i6l0VarP3.getClass();
                x6h1 x6h1VarC5 = i6l0VarP3.b.c();
                x6h1VarC5.i.add(new a7h1("explicit_dialog_when_child", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC5.j = false;
                x6h1 x6h1VarC6 = x6h1VarC5.a().c();
                x6h1VarC6.i.add(new a7h1("close_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC6.j = false;
                i8h1Var3.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC6.a(), i6l0VarP3.a, System.currentTimeMillis()), (xj61) null);
                break;
        }
    }
}
