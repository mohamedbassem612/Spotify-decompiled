package p;

import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class pri0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qri0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pri0(qri0 qri0Var, byte b) {
        super(1);
        this.a = b;
        this.b = qri0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        qri0 qri0Var = this.b;
        switch (b) {
            case 0:
                gxb gxbVar = (hxb) obj;
                if ((gxbVar instanceof gxb) && gxbVar.a == 3) {
                    kqi0 kqi0Var = qri0Var.g;
                    i8h1 i8h1Var = (i8h1) kqi0Var.b;
                    n1m0 n1m0Var = (n1m0) ((idd1) kqi0Var.c).getValue();
                    n1m0Var.getClass();
                    x6h1 x6h1VarC = n1m0Var.a.c();
                    x6h1VarC.i.add(new a7h1("scrim", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC.j = false;
                    y6h1 y6h1VarA = x6h1VarC.a();
                    b7x b7xVar = b7x.a;
                    i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null);
                }
                break;
            default:
                String str = (String) obj;
                if (str.length() > 0) {
                    qri0Var.c.f(new dwn0(str, "", false, false, 0, 0, false, (a690) null, (Bundle) null, (cwn0) null));
                }
                break;
        }
        return rih1Var;
    }
}
