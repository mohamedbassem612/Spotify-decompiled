package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class xd60 {
    public final ajc0 a;
    public final float b;
    public final zzq0 c;
    public final zzq0 d;
    public final zzq0 e;
    public final ajc0 f;
    public final fb60 g;

    public xd60(ajc0 ajc0Var, float f, zzq0 zzq0Var, zzq0 zzq0Var2, zzq0 zzq0Var3, ajc0 ajc0Var2, fb60 fb60Var) {
        this.a = ajc0Var;
        this.b = f;
        this.c = zzq0Var;
        this.d = zzq0Var2;
        this.e = zzq0Var3;
        this.f = ajc0Var2;
        this.g = fb60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xd60)) {
            return false;
        }
        xd60 xd60Var = (xd60) obj;
        return this.a.equals(xd60Var.a) && p3v.c(this.b, xd60Var.b) && this.c.equals(xd60Var.c) && this.d.equals(xd60Var.d) && this.e.equals(xd60Var.e) && this.f.equals(xd60Var.f) && this.g.equals(xd60Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + ktd.g(this.f.a, (this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + x0d.f(this.a.a.hashCode() * 31, 31, this.b)) * 31)) * 31)) * 31, 31);
    }
}
