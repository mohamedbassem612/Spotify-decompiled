package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class j8f1 implements l8f1 {
    public final int a;
    public final String b;

    public j8f1(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j8f1)) {
            return false;
        }
        j8f1 j8f1Var = (j8f1) obj;
        return this.a == j8f1Var.a && u890.j(this.b, j8f1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
