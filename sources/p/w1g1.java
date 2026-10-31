package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class w1g1 {
    public final String a;
    public final h290 b;

    public w1g1(String str, h290 h290Var) {
        this.a = str;
        this.b = h290Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w1g1)) {
            return false;
        }
        w1g1 w1g1Var = (w1g1) obj;
        return this.a.equals(w1g1Var.a) && this.b.equals(w1g1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
