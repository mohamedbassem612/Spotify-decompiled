package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class tcl extends ucl {
    public final je31 e;
    public final je31 f;
    public final float[] g;

    public tcl(je31 je31Var, je31 je31Var2) {
        float[] fArrD;
        super(je31Var2, je31Var, je31Var2, (float[]) null);
        this.e = je31Var;
        this.f = je31Var2;
        float[] fArr = (float[]) dp5.e.b;
        fol1 fol1Var = je31Var.d;
        float[] fArr2 = je31Var.i;
        fol1 fol1Var2 = je31Var2.d;
        float[] fArr3 = je31Var2.j;
        if (h5p1.u(fol1Var, fol1Var2)) {
            fArrD = h5p1.D(fArr3, fArr2);
        } else {
            float[] fArrA = fol1Var.a();
            float[] fArrA2 = fol1Var2.a();
            fol1 fol1Var3 = dm5.c;
            fArrD = h5p1.D(h5p1.u(fol1Var2, fol1Var3) ? fArr3 : h5p1.A(h5p1.D(h5p1.p(fArr, fArrA2, new float[]{0.964212f, 1.0f, 0.825188f}), je31Var2.i)), h5p1.u(fol1Var, fol1Var3) ? fArr2 : h5p1.D(h5p1.p(fArr, fArrA, new float[]{0.964212f, 1.0f, 0.825188f}), fArr2));
        }
        this.g = fArrD;
    }

    public final long a(long j) {
        float fG = u7h.g(j);
        float f = u7h.f(j);
        float fD = u7h.d(j);
        float fC = u7h.c(j);
        ge31 ge31Var = this.e.p;
        float fC2 = (float) ge31Var.c(fG);
        float fC3 = (float) ge31Var.c(f);
        float fC4 = (float) ge31Var.c(fD);
        float[] fArr = this.g;
        float f2 = (fArr[6] * fC4) + (fArr[3] * fC3) + (fArr[0] * fC2);
        float f3 = (fArr[7] * fC4) + (fArr[4] * fC3) + (fArr[1] * fC2);
        float f4 = (fArr[8] * fC4) + (fArr[5] * fC3) + (fArr[2] * fC2);
        je31 je31Var = this.f;
        ge31 ge31Var2 = je31Var.m;
        return z4p1.d((float) ge31Var2.c(f2), (float) ge31Var2.c(f3), (float) ge31Var2.c(f4), fC, je31Var);
    }
}
