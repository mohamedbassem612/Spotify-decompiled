package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ck0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ck0(iu30 iu30Var, int i, byte b) {
        super(0);
        this.a = b;
        this.b = iu30Var;
        this.c = i;
    }

    public final Object invoke() {
        y9h0 y9h0Var;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.c;
        iu30 iu30Var = this.b;
        switch (b) {
            case 0:
                iu30Var.invoke(new izd(i));
                return rih1Var;
            case 1:
                iu30Var.invoke(new pg1(i));
                return rih1Var;
            case 2:
                iu30Var.invoke(new pg1(i));
                return rih1Var;
            case 3:
                iu30Var.invoke(new jm2(s2j1.b, i));
                return rih1Var;
            case 4:
                iu30Var.invoke(new jm2(s2j1.a, i));
                return rih1Var;
            case 5:
                iu30Var.invoke(Integer.valueOf(i));
                return Boolean.TRUE;
            case 6:
                iu30Var.invoke(Integer.valueOf(i));
                return rih1Var;
            case 7:
                iu30Var.invoke(new w7h(i));
                return rih1Var;
            case 8:
                iu30Var.invoke(Integer.valueOf(i));
                return rih1Var;
            case 9:
                iu30Var.invoke(Integer.valueOf(i));
                return rih1Var;
            case 10:
                iu30Var.invoke(new m180(i));
                return rih1Var;
            case 11:
                return (Float) iu30Var.invoke(Integer.valueOf(i));
            case 12:
                iu30Var.invoke(new iqe0(new l50(i)));
                return rih1Var;
            case 13:
                iu30Var.invoke(new iqe0(new u50(i)));
                return rih1Var;
            case 14:
                iu30Var.invoke(Integer.valueOf(i));
                return rih1Var;
            case 15:
                int iC = l1d.C(i);
                if (iC == 0) {
                    y9h0Var = n9h0.a;
                } else if (iC == 1) {
                    y9h0Var = t9h0.a;
                } else {
                    if (iC != 2) {
                        eg.o();
                        return null;
                    }
                    y9h0Var = y9h0.a;
                }
                iu30Var.invoke(y9h0Var);
                return rih1Var;
            case 16:
                iu30Var.invoke(Integer.valueOf(i));
                return rih1Var;
            case 17:
                iu30Var.invoke(Integer.valueOf(i));
                return rih1Var;
            case 18:
                iu30Var.invoke(Integer.valueOf(i));
                return rih1Var;
            case 19:
                iu30Var.invoke(Integer.valueOf(i));
                return rih1Var;
            case 20:
                iu30Var.invoke(Integer.valueOf(i));
                return rih1Var;
            case 21:
                iu30Var.invoke(Integer.valueOf(i));
                return rih1Var;
            case 22:
                iu30Var.invoke(Integer.valueOf(i));
                return Boolean.TRUE;
            case 23:
                iu30Var.invoke(new jde1(i));
                return rih1Var;
            case 24:
                iu30Var.invoke(Integer.valueOf(i));
                return rih1Var;
            case 25:
                iu30Var.invoke(Integer.valueOf(i + 1));
                return Boolean.TRUE;
            case 26:
                iu30Var.invoke(Integer.valueOf(i - 1));
                return Boolean.TRUE;
            case 27:
                iu30Var.invoke(Integer.valueOf(i));
                return rih1Var;
            case 28:
                iu30Var.invoke(new lz(i));
                return rih1Var;
            default:
                iu30Var.invoke(new jz(i));
                return rih1Var;
        }
    }
}
