package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class w4n0 {
    public final String a;
    public final h290 b;

    public w4n0(String str, h290 h290Var) {
        this.a = str;
        this.b = h290Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w4n0)) {
            return false;
        }
        w4n0 w4n0Var = (w4n0) obj;
        return this.a.equals(w4n0Var.a) && this.b.equals(w4n0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
