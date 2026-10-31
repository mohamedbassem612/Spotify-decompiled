package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class rpo0 {
    public final boolean a;
    public final String b;
    public final jpo0 c;

    public rpo0(boolean z, String str, jpo0 jpo0Var) {
        this.a = z;
        this.b = str;
        this.c = jpo0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rpo0)) {
            return false;
        }
        rpo0 rpo0Var = (rpo0) obj;
        return this.a == rpo0Var.a && u890.j(this.b, rpo0Var.b) && this.c == rpo0Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(Boolean.hashCode(this.a) * 31, 31, this.b);
    }
}
