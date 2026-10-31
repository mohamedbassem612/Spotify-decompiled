package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class gdj1 implements i01 {
    public final ao0 a;
    public String b;
    public boolean c;
    public int d = -1;

    public gdj1(ao0 ao0Var) {
        this.a = ao0Var;
    }

    @Override // p.i01
    public final void a(String str, jxb0 jxb0Var) {
        this.b = str;
        this.d = -1;
        this.c = true;
    }

    @Override // p.i01
    public final void b(int i) {
        if (this.c) {
            if (this.d < 50 && i >= 50) {
                co0 co0Var = co0.j1;
                String str = this.b;
                gq0 gq0Var = str != null ? new gq0(str) : null;
                if (gq0Var == null) {
                    hhg1.n("Required value was null.");
                    return;
                }
                ao0.a(this.a, co0Var, gq0Var.a, (Long) null, (String) null, (String) null, 124);
            }
            if (this.d >= 50 && i < 50) {
                co0 co0Var2 = co0.k1;
                String str2 = this.b;
                gq0 gq0Var2 = str2 != null ? new gq0(str2) : null;
                if (gq0Var2 == null) {
                    hhg1.n("Required value was null.");
                    return;
                }
                ao0.a(this.a, co0Var2, gq0Var2.a, (Long) null, (String) null, (String) null, 124);
            }
            if (this.d > 0 && i <= 0) {
                co0 co0Var3 = co0.h1;
                String str3 = this.b;
                gq0 gq0Var3 = str3 != null ? new gq0(str3) : null;
                if (gq0Var3 == null) {
                    hhg1.n("Required value was null.");
                    return;
                }
                ao0.a(this.a, co0Var3, gq0Var3.a, (Long) null, (String) null, (String) null, 124);
            }
            if (this.d < 100 && i >= 100) {
                co0 co0Var4 = co0.l1;
                String str4 = this.b;
                gq0 gq0Var4 = str4 != null ? new gq0(str4) : null;
                if (gq0Var4 == null) {
                    hhg1.n("Required value was null.");
                    return;
                }
                ao0.a(this.a, co0Var4, gq0Var4.a, (Long) null, (String) null, (String) null, 124);
            }
        }
        this.d = i;
    }

    @Override // p.i01
    public final void c(String str) {
        throw new IllegalStateException("Video ads do not have a separate asset loading step. Use bindAd() instead.");
    }
}
