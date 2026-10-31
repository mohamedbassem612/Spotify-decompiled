package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class rik0 extends hab0 implements iu30 {
    public final /* synthetic */ tob1 N0;
    public final /* synthetic */ q5t0 X;
    public final /* synthetic */ q5t0 Y;
    public final /* synthetic */ int Z;
    public final /* synthetic */ es41 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ q5t0 f;
    public final /* synthetic */ int g;
    public final /* synthetic */ q5t0 h;
    public final /* synthetic */ int i;
    public final /* synthetic */ int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rik0(es41 es41Var, int i, int i2, int i3, boolean z, q5t0 q5t0Var, int i4, q5t0 q5t0Var2, int i5, int i6, q5t0 q5t0Var3, q5t0 q5t0Var4, int i7, tob1 tob1Var) {
        super(1);
        this.a = es41Var;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = z;
        this.f = q5t0Var;
        this.g = i4;
        this.h = q5t0Var2;
        this.i = i5;
        this.t = i6;
        this.X = q5t0Var3;
        this.Y = q5t0Var4;
        this.Z = i7;
        this.N0 = tob1Var;
    }

    public final Object invoke(Object obj) {
        p5t0 p5t0Var = (p5t0) obj;
        int iS = this.a.a.s();
        int i = this.b;
        float fO = i > 0 ? yoi1.o(iS / i, 0.0f, 1.0f) : 0.0f;
        float f = this.c;
        tob1 tob1Var = this.N0;
        int iFloatValue = (int) (((Number) tob1Var.getValue()).floatValue() * f);
        int iFloatValue2 = (int) ((1.0f - ((Number) tob1Var.getValue()).floatValue()) * this.d * fO);
        float f2 = this.e ? 0.0f : 1.0f - fO;
        int i2 = this.g;
        p5t0.n(p5t0Var, this.f, 0, i2 + iFloatValue2, new vbk0((byte) 5, f2), 4);
        int i3 = this.i;
        int i4 = i2 + i3;
        int i5 = this.t;
        p5t0.n(p5t0Var, this.h, 0, i4 + i5 + iFloatValue2, new vbk0((byte) 6, f2), 4);
        p5t0Var.k(this.X, 0, i4 + iFloatValue + iFloatValue2, 0.0f);
        p5t0Var.k(this.Y, 0, (int) ((((i3 * 2) + (i2 * 2)) + i5) - (this.Z * fO)), 0.0f);
        return rih1.a;
    }
}
