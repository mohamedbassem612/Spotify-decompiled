package p;

import androidx.compose.ui.geometry.Offset;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class otj1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ otj1(iu30 iu30Var, byte b) {
        super(1);
        this.a = b;
        this.b = iu30Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.b;
        switch (b) {
            case 0:
                pn11 pn11Var = (pn11) obj;
                Object jtj1Var = null;
                if (pn11Var instanceof jn11) {
                    jn11 jn11Var = (jn11) pn11Var;
                    int i = jn11Var.a;
                    String str = jn11Var.b;
                    String str2 = jn11Var.c;
                    int iOrdinal = jn11Var.d.ordinal();
                    int i2 = 1;
                    if (iOrdinal != 0) {
                        if (iOrdinal == 1) {
                            i2 = 2;
                        } else {
                            if (iOrdinal != 2) {
                                eg.o();
                                return null;
                            }
                            i2 = 3;
                        }
                    }
                    jtj1Var = new etj1(i, str, str2, i2);
                } else if (pn11Var instanceof kn11) {
                    jtj1Var = new ftj1();
                } else if (pn11Var instanceof ln11) {
                    ln11 ln11Var = (ln11) pn11Var;
                    jtj1Var = new gtj1(ln11Var.a, ln11Var.b);
                } else if (pn11Var instanceof mn11) {
                    mn11 mn11Var = (mn11) pn11Var;
                    jtj1Var = new jtj1(mn11Var.a, mn11Var.b);
                } else if (pn11Var.equals(nn11.a)) {
                    jtj1Var = itj1.a;
                }
                if (jtj1Var == null) {
                    return rih1Var;
                }
                iu30Var.invoke(jtj1Var);
                return rih1Var;
            case 1:
                long j = ((Offset) obj).a;
                iu30Var.invoke(xwj1.b);
                return rih1Var;
            case 2:
                long j2 = ((Offset) obj).a;
                iu30Var.invoke(xwj1.a);
                return rih1Var;
            case 3:
                iu30Var.invoke(new ezj1((syj1) obj));
                return rih1Var;
            case 4:
                iu30Var.invoke(new ezj1(new nyj1((String) obj)));
                return rih1Var;
            case 5:
                iu30Var.invoke(new cqk1((String) obj));
                return rih1Var;
            case 6:
                iu30Var.invoke(new fqk1((String) obj));
                return rih1Var;
            case 7:
                iu30Var.invoke(Boolean.FALSE);
                return rih1Var;
            case 8:
                iu30Var.invoke(new r7m1((String) obj));
                return rih1Var;
            default:
                if (((ezn) obj).equals(czn.d)) {
                    iu30Var.invoke(yam1.a);
                }
                return rih1Var;
        }
    }
}
