package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class gz5 {
    public final String a;
    public final fz5 b;

    public gz5(String str, fz5 fz5Var) {
        this.a = str;
        this.b = fz5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gz5)) {
            return false;
        }
        gz5 gz5Var = (gz5) obj;
        return this.a.equals(gz5Var.a) && this.b == gz5Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
