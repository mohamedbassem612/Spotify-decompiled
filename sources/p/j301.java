package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class j301 extends hab0 implements iu30 {
    public final /* synthetic */ long a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ hdn0 d;
    public final /* synthetic */ tob1 e;
    public final /* synthetic */ hdn0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j301(long j, int i, int i2, hdn0 hdn0Var, tob1 tob1Var, hdn0 hdn0Var2) {
        super(1);
        this.a = j;
        this.b = i;
        this.c = i2;
        this.d = hdn0Var;
        this.e = tob1Var;
        this.f = hdn0Var2;
    }

    public final Object invoke(Object obj) {
        long j = this.a;
        int iIntBitsToFloat = ((((int) Float.intBitsToFloat((int) (j & 4294967295L))) - this.b) - this.d.s()) + ((int) (((wat) obj).X0(27.0f) * (1.0f - ((Number) this.e.getValue()).floatValue())));
        if (iIntBitsToFloat < 0) {
            iIntBitsToFloat = 0;
        }
        return new qr80((((long) yoi1.p((int) Float.intBitsToFloat((int) (j >> 32)), 0, this.c - this.f.s())) << 32) | (((long) iIntBitsToFloat) & 4294967295L));
    }
}
