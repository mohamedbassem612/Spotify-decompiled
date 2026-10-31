package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class l30 extends n30 {
    public final String a;
    public final c380 b;
    public final x360 c;

    public l30(String str, x360 x360Var, c380 c380Var) {
        this.a = str;
        this.b = c380Var;
        this.c = x360Var;
    }

    public final c380 a() {
        return this.b;
    }

    public final x360 b() {
        return this.c;
    }

    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l30)) {
            return false;
        }
        l30 l30Var = (l30) obj;
        return u890.j(this.a, l30Var.a) && u890.j(this.b, l30Var.b) && u890.j(this.c, l30Var.c);
    }

    public final int hashCode() {
        int iF = kk0.f(this.b, this.a.hashCode() * 31, 31);
        x360 x360Var = this.c;
        return iF + (x360Var == null ? 0 : x360Var.hashCode());
    }
}
