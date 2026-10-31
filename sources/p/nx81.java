package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class nx81 {
    public final String a;
    public final int b = 2131101680;
    public final iu30 c;

    public nx81(String str, iu30 iu30Var, int i) {
        this.a = str;
        this.c = iu30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nx81)) {
            return false;
        }
        nx81 nx81Var = (nx81) obj;
        return u890.j(this.a, nx81Var.a) && this.b == nx81Var.b && u890.j(this.c, nx81Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + kaa0.f(this.b, this.a.hashCode() * 31, 31);
    }
}
