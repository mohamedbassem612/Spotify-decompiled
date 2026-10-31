package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class i5r0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ ven0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i5r0(iu30 iu30Var, ven0 ven0Var) {
        super(1);
        this.a = (byte) 0;
        this.c = ven0Var;
        this.b = iu30Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        n511 n511Var = null;
        a8y0 a8y0Var = a8y0.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.b;
        ven0 ven0Var = this.c;
        switch (b) {
            case 0:
                ixb ixbVar = (ixb) obj;
                if (((Boolean) ven0Var.getValue()).booleanValue()) {
                    ven0Var.setValue(Boolean.FALSE);
                } else {
                    int iOrdinal = ixbVar.ordinal();
                    if (iOrdinal == 0) {
                        iu30Var.invoke(c5r0.a);
                    } else if (iOrdinal == 1) {
                        iu30Var.invoke(d5r0.a);
                    } else if (iOrdinal != 2) {
                        eg.o();
                        return null;
                    }
                }
                return rih1Var;
            case 1:
                y9e1 y9e1Var = (y9e1) obj;
                zrm0 zrm0Var = y9e1Var.b;
                int i = zrm0Var.f;
                if (i != 0) {
                    float fMax = Float.NEGATIVE_INFINITY;
                    float fMin = Float.POSITIVE_INFINITY;
                    float fMax2 = Float.NEGATIVE_INFINITY;
                    float fMin2 = Float.POSITIVE_INFINITY;
                    for (int i2 = 0; i2 < i; i2++) {
                        fMin2 = Math.min(fMin2, y9e1Var.g(i2));
                        fMin = Math.min(fMin, zrm0Var.f(i2));
                        fMax = Math.max(fMax, y9e1Var.h(i2));
                        fMax2 = Math.max(fMax2, zrm0Var.b(i2));
                    }
                    if (fMin2 < fMax && fMin < fMax2) {
                        n511Var = new n511(fMin2, fMin, fMax, fMax2);
                    }
                }
                ven0Var.setValue(n511Var);
                iu30Var.invoke(y9e1Var);
                return rih1Var;
            case 2:
                ven0Var.setValue(Boolean.FALSE);
                iu30Var.invoke(a8y0Var);
                return rih1Var;
            case 3:
                ven0Var.setValue(Boolean.FALSE);
                iu30Var.invoke(a8y0Var);
                return rih1Var;
            case 4:
                j251 j251Var = (j251) obj;
                if (j251Var.equals(c251.b)) {
                    ven0Var.setValue(Boolean.TRUE);
                }
                iu30Var.invoke(j251Var);
                return rih1Var;
            case 5:
                iu30Var.invoke((id01) obj);
                float f = yy51.c;
                ven0Var.setValue(Boolean.FALSE);
                return rih1Var;
            case 6:
                iu30Var.invoke(new ux71((mw71) obj));
                ven0Var.setValue(Boolean.FALSE);
                return rih1Var;
            default:
                g3j1 g3j1Var = (g3j1) obj;
                if ((g3j1Var instanceof d3j1) || (g3j1Var instanceof e3j1)) {
                    ven0Var.setValue(Boolean.FALSE);
                }
                iu30Var.invoke(g3j1Var);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i5r0(iu30 iu30Var, ven0 ven0Var, byte b) {
        super(1);
        this.a = b;
        this.b = iu30Var;
        this.c = ven0Var;
    }
}
