package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class dld0 {
    public final String a;
    public final jqb0 b;

    public dld0(String str, jqb0 jqb0Var) {
        this.a = str;
        this.b = jqb0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof dld0) {
            dld0 dld0Var = (dld0) obj;
            return u890.j(this.a, dld0Var.a) && this.b == dld0Var.b;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
