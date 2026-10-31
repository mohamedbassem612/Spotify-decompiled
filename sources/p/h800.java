package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class h800 implements k800 {
    public final String a;
    public final tv80 b;

    public h800(String str, tv80 tv80Var) {
        this.a = str;
        this.b = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h800)) {
            return false;
        }
        h800 h800Var = (h800) obj;
        return u890.j(this.a, h800Var.a) && u890.j(this.b, h800Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
