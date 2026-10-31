package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class qq7 {
    public final String a;
    public final pq7 b;

    public qq7(String str, pq7 pq7Var) {
        this.a = str;
        this.b = pq7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qq7)) {
            return false;
        }
        qq7 qq7Var = (qq7) obj;
        return this.a.equals(qq7Var.a) && u890.j(this.b, qq7Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
