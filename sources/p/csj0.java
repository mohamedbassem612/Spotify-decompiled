package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class csj0 {
    public static csj0 h;
    public final flb0 a;
    public final lee1 b;
    public final xat c;
    public final f930 d;
    public final lee1 e;
    public float f = Float.NaN;
    public float g = Float.NaN;

    public csj0(flb0 flb0Var, lee1 lee1Var, xat xatVar, f930 f930Var) {
        this.a = flb0Var;
        this.b = lee1Var;
        this.c = xatVar;
        this.d = f930Var;
        this.e = z6p1.F(lee1Var, flb0Var);
    }

    public final long a(int i, long j) {
        int iJ;
        float f = this.g;
        float f2 = this.f;
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            String str = dsj0.a;
            lee1 lee1Var = this.e;
            z6x z6xVar = z6x.a;
            f930 f930Var = this.d;
            xat xatVar = this.c;
            float f3 = vgo1.j(new rw4(str, lee1Var, z6xVar, z6xVar, f930Var, xatVar, false), jjl.b(0, 0, 0, 0, 15), 1, 1).f;
            float f4 = vgo1.j(new rw4(dsj0.b, lee1Var, z6xVar, z6xVar, this.d, xatVar, true), jjl.b(0, 0, 0, 0, 15), 2, 1).f - f3;
            this.g = f3;
            this.f = f4;
            f2 = f4;
            f = f3;
        }
        if (i != 1) {
            int iRound = Math.round((f2 * (i - 1)) + f);
            iJ = iRound >= 0 ? iRound : 0;
            int iH = hjl.h(j);
            if (iJ > iH) {
                iJ = iH;
            }
        } else {
            iJ = hjl.j(j);
        }
        return jjl.a(hjl.k(j), hjl.i(j), iJ, hjl.h(j));
    }
}
