package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class p7h0 implements o5s {
    public volatile boolean N0;
    public volatile boolean X;
    public volatile boolean Y;
    public volatile boolean Z;
    public final yun0 a;
    public final hds b;
    public final lzn0 c;
    public final String d = nik1.w6.a;
    public final fmo e = new fmo(this, (byte) 3);
    public final ltr f = new ltr(this, (byte) 1);
    public String g;
    public String h;
    public int i;
    public Integer t;

    public p7h0(yun0 yun0Var, hds hdsVar, lzn0 lzn0Var, iac0 iac0Var) {
        this.a = yun0Var;
        this.b = hdsVar;
        this.c = lzn0Var;
        iac0Var.getLifecycle().a(this);
    }

    public final void onCreate(iac0 iac0Var) {
        this.a.g(this.e);
        this.b.b.add(this.f);
    }

    public final void onDestroy(iac0 iac0Var) {
        this.N0 = true;
        this.a.d(this.e);
        hds hdsVar = this.b;
        hdsVar.b.remove(this.f);
    }
}
