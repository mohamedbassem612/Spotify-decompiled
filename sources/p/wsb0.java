package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class wsb0 implements iu30 {
    public final /* synthetic */ p811 X;
    public final /* synthetic */ vsb0 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ float c;
    public final /* synthetic */ m811 d;
    public final /* synthetic */ l811 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ float g;
    public final /* synthetic */ n811 h;
    public final /* synthetic */ int i;
    public final /* synthetic */ int t;

    public /* synthetic */ wsb0(vsb0 vsb0Var, int i, float f, m811 m811Var, l811 l811Var, boolean z, float f2, n811 n811Var, int i2, int i3, p811 p811Var) {
        this.a = vsb0Var;
        this.b = i;
        this.c = f;
        this.d = m811Var;
        this.e = l811Var;
        this.f = z;
        this.g = f2;
        this.h = n811Var;
        this.i = i2;
        this.t = i3;
        this.X = p811Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: p.jj90 */
    /* JADX WARN: Code duplicated, block: B:9:0x002d A[PHI: r2
      0x002d: PHI (r2v20 float) = (r2v7 float), (r2v24 float) binds: [B:11:0x003d, B:7:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    public final Object invoke(Object obj) throws jj90 {
        float fFloatValue;
        de5 de5Var = (de5) obj;
        vsb0 vsb0Var = this.a;
        int i = this.b;
        boolean zG = o0c.G(vsb0Var, i);
        l811 l811Var = this.e;
        boolean z = this.f;
        int i2 = this.t;
        rih1 rih1Var = rih1.a;
        if (!zG) {
            float f = this.c;
            if (f > 0.0f) {
                fFloatValue = ((Number) de5Var.e.getValue()).floatValue();
                if (fFloatValue <= f) {
                    f = fFloatValue;
                }
            } else {
                fFloatValue = ((Number) de5Var.e.getValue()).floatValue();
                if (fFloatValue >= f) {
                    f = fFloatValue;
                }
            }
            m811 m811Var = this.d;
            float f2 = f - m811Var.a;
            float f3 = vsb0Var.f(f2);
            if (!o0c.G(vsb0Var, i) && !o0c.f(z, vsb0Var, i, i2)) {
                if (f2 != f3) {
                    de5Var.a();
                    l811Var.a = false;
                    return rih1Var;
                }
                m811Var.a += f2;
                float f4 = this.g;
                if (z) {
                    if (((Number) de5Var.e.getValue()).floatValue() > f4) {
                        de5Var.a();
                    }
                } else if (((Number) de5Var.e.getValue()).floatValue() < (-f4)) {
                    de5Var.a();
                }
                int i3 = this.h.a;
                int i4 = this.i;
                if (z) {
                    if (i3 >= 2 && i - vsb0Var.b() > i4) {
                        vsb0Var.c(i - i4, 0);
                    }
                } else if (i3 >= 2 && vsb0Var.h() - i > i4) {
                    vsb0Var.c(i4 + i, 0);
                }
            }
        }
        if (!o0c.f(z, vsb0Var, i, i2)) {
            if (o0c.G(vsb0Var, i)) {
                throw new jj90(vsb0Var.e(i), (ie5) this.X.a);
            }
            return rih1Var;
        }
        vsb0Var.c(i, i2);
        l811Var.a = false;
        de5Var.a();
        return rih1Var;
    }
}
