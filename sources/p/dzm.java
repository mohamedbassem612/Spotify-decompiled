package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class dzm extends hab0 implements iu30 {
    public final /* synthetic */ long a;
    public final /* synthetic */ pmg1 b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ float f;
    public final /* synthetic */ ven0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dzm(long j, pmg1 pmg1Var, float f, float f2, float f3, float f4, ven0 ven0Var) {
        super(1);
        this.a = j;
        this.b = pmg1Var;
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = f4;
        this.g = ven0Var;
    }

    public final Object invoke(Object obj) {
        long j = ((yr80) this.g.getValue()).a;
        pmg1 pmg1Var = this.b;
        float f = pmg1Var.g;
        long j2 = this.a;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) * f;
        float fIntBitsToFloat2 = 1.0f - Float.intBitsToFloat((int) (j2 & 4294967295L));
        float f2 = this.d;
        float f3 = this.c;
        float f4 = (fIntBitsToFloat2 * f2) + f3;
        float f5 = (f3 * 2.0f) + f2;
        float f6 = pmg1Var.i;
        float f7 = -f6;
        if (f7 < 0.0f) {
            f7 = 0.0f;
        }
        float f8 = pmg1Var.a - f6;
        if (f8 <= f) {
            f = f8;
        }
        float f9 = (int) (j >> 32);
        float f10 = f - f9;
        if (f10 < f7) {
            f10 = f7;
        }
        float fO = yoi1.o(fIntBitsToFloat - (f9 / 2.0f), f7, f10);
        float f11 = this.e;
        float f12 = this.f;
        float f13 = (int) (j & 4294967295L);
        float f14 = ((f4 - f11) - f12) - f13;
        if (f14 < 0.0f) {
            f14 = f4 + f11 + f12;
        }
        float f15 = f5 - f13;
        if (f15 < 0.0f) {
            f15 = 0.0f;
        }
        return new qr80((((long) ((int) fO)) << 32) | (((long) ((int) yoi1.o(f14, 0.0f, f15))) & 4294967295L));
    }
}
