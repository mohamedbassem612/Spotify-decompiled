package p;

import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class tn91 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ un91 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tn91(un91 un91Var, byte b) {
        super(1);
        this.a = b;
        this.b = un91Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        un91 un91Var = this.b;
        switch (b) {
            case 0:
                int iOrdinal = ((wnt0) obj).ordinal();
                if (iOrdinal == 0) {
                    un91Var.p1(rn91.a);
                    return rih1Var;
                }
                if (iOrdinal == 1) {
                    return rih1Var;
                }
                eg.o();
                return null;
            default:
                int iOrdinal2 = ((wnt0) obj).ordinal();
                if (iOrdinal2 == 0) {
                    un91Var.p1(rn91.b);
                    return rih1Var;
                }
                if (iOrdinal2 != 1) {
                    eg.o();
                    return null;
                }
                vn91 vn91Var = (vn91) un91Var.h2.getValue();
                i8h1 i8h1Var = vn91Var.a;
                z5l0 z5l0Var = (z5l0) vn91Var.b.getValue();
                z5l0Var.getClass();
                x6h1 x6h1VarC = z5l0Var.a.c();
                x6h1VarC.i.add(new a7h1("learn_more_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                y6h1 y6h1VarA = x6h1VarC.a();
                b7x b7xVar = b7x.a;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null);
                lzn0 lzn0Var = un91Var.d2;
                if (lzn0Var == null) {
                    u890.C("navigator");
                    throw null;
                }
                lzn0Var.f(new dwn0(nik1.L4.a, "", false, false, 0, 0, false, (a690) null, (Bundle) null, (cwn0) null));
                un91Var.dismiss();
                return rih1Var;
        }
    }
}
