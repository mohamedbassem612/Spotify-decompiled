package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class v690 implements yzq {
    public final jpr0 a;
    public final jpr0 b;
    public final jpr0 c;
    public final jpr0 d;
    public final jpr0 e;
    public final jpr0 f;

    public v690(jpr0 jpr0Var, jpr0 jpr0Var2, jpr0 jpr0Var3, jpr0 jpr0Var4, jpr0 jpr0Var5, jpr0 jpr0Var6) {
        this.a = jpr0Var;
        this.b = jpr0Var2;
        this.c = jpr0Var3;
        this.d = jpr0Var4;
        this.e = jpr0Var5;
        this.f = jpr0Var6;
    }

    @Override // p.yzq
    public final boolean match(Object obj) {
        w690 w690Var = (w690) obj;
        if (!this.a.a(w690Var.a) || !this.b.a(w690Var.b) || !this.c.a(w690Var.c)) {
            return false;
        }
        if (this.d.a(Boolean.valueOf(w690Var.d))) {
            return this.e.a(Boolean.valueOf(w690Var.e)) && this.f.a(w690Var.f);
        }
        return false;
    }
}
