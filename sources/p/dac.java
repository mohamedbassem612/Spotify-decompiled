package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class dac implements phi1 {
    public final /* synthetic */ byte a;
    public final l6m0 b;

    public /* synthetic */ dac(l6m0 l6m0Var, byte b) {
        this.a = b;
        this.b = l6m0Var;
    }

    public final qhi1 a(dtb1 dtb1Var, i2g1 i2g1Var) {
        byte b = this.a;
        l6m0 l6m0Var = this.b;
        switch (b) {
            case 0:
                bac bacVar = dtb1Var instanceof bac ? (bac) dtb1Var : null;
                if (bacVar == null) {
                    return null;
                }
                return lro1.l(new cac(l6m0Var), bacVar);
            case 1:
                jmd0 jmd0Var = dtb1Var instanceof jmd0 ? (jmd0) dtb1Var : null;
                if (jmd0Var == null) {
                    return null;
                }
                return lro1.l(new lmd0(l6m0Var, (byte) 0), jmd0Var);
            default:
                xtg0 xtg0Var = dtb1Var instanceof xtg0 ? (xtg0) dtb1Var : null;
                if (xtg0Var == null) {
                    return null;
                }
                return lro1.l(new lmd0(l6m0Var, (byte) 1), xtg0Var);
        }
    }
}
