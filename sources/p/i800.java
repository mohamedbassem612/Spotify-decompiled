package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class i800 implements k800 {
    public final String a;
    public final int b;
    public final tv80 c;

    public i800(int i, String str, tv80 tv80Var) {
        this.a = str;
        this.b = i;
        this.c = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i800)) {
            return false;
        }
        i800 i800Var = (i800) obj;
        return u890.j(this.a, i800Var.a) && this.b == i800Var.b && u890.j(this.c, i800Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + kaa0.f(this.b, this.a.hashCode() * 31, 31);
    }
}
