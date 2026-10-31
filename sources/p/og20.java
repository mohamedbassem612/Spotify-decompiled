package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class og20 implements phi1 {
    public final /* synthetic */ byte a;
    public final l6m0 b;
    public final Object c;
    public final Object d;

    public /* synthetic */ og20(Object obj, Object obj2, l6m0 l6m0Var, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = l6m0Var;
    }

    public final qhi1 a(dtb1 dtb1Var, i2g1 i2g1Var) {
        byte b = this.a;
        l6m0 l6m0Var = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                jg20 jg20Var = dtb1Var instanceof jg20 ? (jg20) dtb1Var : null;
                if (jg20Var == null) {
                    return null;
                }
                return lro1.l(new ng20((lzn0) obj2, (fg60) obj, l6m0Var), jg20Var);
            default:
                pkm0 pkm0Var = dtb1Var instanceof pkm0 ? (pkm0) dtb1Var : null;
                if (pkm0Var == null) {
                    return null;
                }
                return lro1.l(new ng20((gw70) obj2, (ytp0) obj, new fhk0(i2g1Var, (byte) 2), l6m0Var), pkm0Var);
        }
    }
}
