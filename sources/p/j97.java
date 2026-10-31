package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class j97 {
    public final String a;
    public final tv80 b;

    public j97(String str, tv80 tv80Var) {
        this.a = str;
        this.b = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j97)) {
            return false;
        }
        j97 j97Var = (j97) obj;
        return u890.j(this.a, j97Var.a) && this.b.equals(j97Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
