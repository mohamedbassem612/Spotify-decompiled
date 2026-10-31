package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class u511 implements myl {
    public final /* synthetic */ byte a = 1;
    public final String b;
    public final q95 c;
    public final boolean d;
    public final y95 e;
    public final Object f;

    public u511(String str, q95 q95Var, q95 q95Var2, w95 w95Var, boolean z) {
        this.b = str;
        this.c = q95Var;
        this.e = q95Var2;
        this.f = w95Var;
        this.d = z;
    }

    public final wpl a(cdf0 cdf0Var, fcf0 fcf0Var, hba hbaVar) {
        switch (this.a) {
            case 0:
                return new t511(cdf0Var, hbaVar, this);
            default:
                return new gf21(cdf0Var, hbaVar, this);
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return "RectangleShape{position=" + this.e + ", size=" + ((y95) this.f) + '}';
            default:
                return super.toString();
        }
    }

    public u511(String str, y95 y95Var, p95 p95Var, q95 q95Var, boolean z) {
        this.b = str;
        this.e = y95Var;
        this.f = p95Var;
        this.c = q95Var;
        this.d = z;
    }
}
