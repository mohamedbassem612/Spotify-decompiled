package p;

import android.content.DialogInterface;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class p6u implements DialogInterface.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;

    public p6u(boolean z, mp8 mp8Var) {
        this.a = (byte) 2;
        this.c = z;
        this.b = mp8Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        byte b = this.a;
        Object obj = this.b;
        boolean z = this.c;
        b7x b7xVar = b7x.a;
        switch (b) {
            case 0:
                q6u q6uVar = (q6u) obj;
                hzu0 hzu0Var = q6uVar.d;
                if (hzu0Var != null) {
                    hzu0Var.invoke(o6u.a);
                }
                mtx0 mtx0Var = q6uVar.c;
                if (!z) {
                    i8h1 i8h1Var = mtx0Var.a;
                    x6h1 x6h1VarC = mtx0Var.b.b.c();
                    x6h1VarC.i.add(new a7h1("discard_dialog", "creation", (Integer) null, (String) null, (String) null));
                    x6h1VarC.j = true;
                    x6h1 x6h1VarC2 = x6h1VarC.a().c();
                    x6h1VarC2.i.add(new a7h1("yes_im_sure_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC2.j = false;
                    i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                } else {
                    i8h1 i8h1Var2 = mtx0Var.a;
                    x6h1 x6h1VarC3 = mtx0Var.b.b.c();
                    x6h1VarC3.i.add(new a7h1("discard_dialog", "reedit", (Integer) null, (String) null, (String) null));
                    x6h1VarC3.j = true;
                    x6h1 x6h1VarC4 = x6h1VarC3.a().c();
                    x6h1VarC4.i.add(new a7h1("yes_im_sure_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC4.j = false;
                    i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC4.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                }
                break;
            case 1:
                q6u q6uVar2 = (q6u) obj;
                hzu0 hzu0Var2 = q6uVar2.d;
                if (hzu0Var2 != null) {
                    hzu0Var2.invoke(o6u.b);
                }
                mtx0 mtx0Var2 = q6uVar2.c;
                if (!z) {
                    i8h1 i8h1Var3 = mtx0Var2.a;
                    x6h1 x6h1VarC5 = mtx0Var2.b.b.c();
                    x6h1VarC5.i.add(new a7h1("discard_dialog", "creation", (Integer) null, (String) null, (String) null));
                    x6h1VarC5.j = true;
                    x6h1 x6h1VarC6 = x6h1VarC5.a().c();
                    x6h1VarC6.i.add(new a7h1("cancel_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC6.j = false;
                    i8h1Var3.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC6.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                } else {
                    i8h1 i8h1Var4 = mtx0Var2.a;
                    x6h1 x6h1VarC7 = mtx0Var2.b.b.c();
                    x6h1VarC7.i.add(new a7h1("discard_dialog", "reedit", (Integer) null, (String) null, (String) null));
                    x6h1VarC7.j = true;
                    x6h1 x6h1VarC8 = x6h1VarC7.a().c();
                    x6h1VarC8.i.add(new a7h1("cancel_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC8.j = false;
                    i8h1Var4.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC8.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                }
                break;
            default:
                zwg zwgVar = (zwg) ((mp8) obj).b;
                if (!z) {
                    q59 q59VarS = zwgVar.s();
                    i8h1 i8h1Var5 = (i8h1) q59VarS.b;
                    x6h1 x6h1VarC9 = ((rrk0) q59VarS.c).b.c();
                    x6h1VarC9.i.add(new a7h1("ok_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC9.j = false;
                    i8h1Var5.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC9.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                } else {
                    ((lzn0) zwgVar.a).e();
                    q59 q59VarS2 = zwgVar.s();
                    i8h1 i8h1Var6 = (i8h1) q59VarS2.b;
                    x6h1 x6h1VarC10 = ((rrk0) q59VarS2.c).b.c();
                    x6h1VarC10.i.add(new a7h1("ok_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC10.j = false;
                    i8h1Var6.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), x6h1VarC10.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                }
                break;
        }
    }

    public /* synthetic */ p6u(q6u q6uVar, boolean z, byte b) {
        this.a = b;
        this.b = q6uVar;
        this.c = z;
    }
}
