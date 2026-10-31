package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class q9o extends hab0 implements iu30 {
    public final /* synthetic */ ihl a;
    public final /* synthetic */ long b;
    public final /* synthetic */ ihl c;
    public final /* synthetic */ ihl d;
    public final /* synthetic */ int e;
    public final /* synthetic */ flb0 f;
    public final /* synthetic */ ven0 g;
    public final /* synthetic */ ven0 h;
    public final /* synthetic */ ven0 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q9o(ihl ihlVar, long j, ihl ihlVar2, ihl ihlVar3, int i, flb0 flb0Var, ven0 ven0Var, ven0 ven0Var2, ven0 ven0Var3) {
        super(1);
        this.a = ihlVar;
        this.b = j;
        this.c = ihlVar2;
        this.d = ihlVar3;
        this.e = i;
        this.f = flb0Var;
        this.g = ven0Var;
        this.h = ven0Var2;
        this.i = ven0Var3;
    }

    public final Object invoke(Object obj) {
        dhl dhlVar = (dhl) obj;
        yf.p(dhlVar.g, this.a.e, 0.0f, 6);
        float fB = (s3v.b(this.b) / 2.0f) - (((p3v) this.g.getValue()).a / 2.0f);
        xid.r(dhlVar.d, this.c.d, ((p3v) this.h.getValue()).a + fB, 4);
        xid.r(dhlVar.f, this.d.f, ((p3v) this.i.getValue()).a + fB, 4);
        float f = this.e / 12.0f;
        int iOrdinal = this.f.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                eg.o();
                return null;
            }
            f = 1.0f - f;
        }
        if (!Float.isNaN(f)) {
            dhlVar.b.J("hBias", f);
        }
        return rih1.a;
    }
}
