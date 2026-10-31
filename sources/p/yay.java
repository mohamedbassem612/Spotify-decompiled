package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class yay extends hab0 implements iu30 {
    public final /* synthetic */ aby a;
    public final /* synthetic */ tob1 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ q5t0 e;
    public final /* synthetic */ long f;
    public final /* synthetic */ o4u g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yay(aby abyVar, ygg1 ygg1Var, long j, long j2, long j3, q5t0 q5t0Var, long j4, o4u o4uVar) {
        super(1);
        this.a = abyVar;
        this.b = ygg1Var;
        this.c = j2;
        this.d = j3;
        this.e = q5t0Var;
        this.f = j4;
        this.g = o4uVar;
    }

    public final Object invoke(Object obj) {
        p5t0 p5t0Var = (p5t0) obj;
        aby abyVar = this.a;
        ft71 ft71Var = abyVar.U0;
        long jA = 0;
        tob1 tob1Var = this.b;
        long jC = ft71Var.c(tob1Var != null ? ((qr80) tob1Var.getValue()).a : 0L);
        tl3 tl3Var = abyVar.Y0;
        if (tl3Var != null) {
            jA = tl3Var.a(this.c, this.d, flb0.a);
        }
        long jD = qr80.d(jA, jC);
        long j = this.f;
        p5t0Var.r(this.e, ((int) (jD >> 32)) + ((int) (j >> 32)), ((int) (jD & 4294967295L)) + ((int) (j & 4294967295L)), 0.0f, this.g);
        return rih1.a;
    }
}
