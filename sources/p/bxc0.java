package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class bxc0 {
    public final String a;
    public final wls0 b;
    public final ywu0 c;

    public bxc0(String str, wls0 wls0Var, ywu0 ywu0Var) {
        this.a = str;
        this.b = wls0Var;
        this.c = ywu0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bxc0)) {
            return false;
        }
        bxc0 bxc0Var = (bxc0) obj;
        return u890.j(this.a, bxc0Var.a) && this.b == bxc0Var.b && this.c.equals(bxc0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
