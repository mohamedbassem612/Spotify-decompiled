package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class w731 {
    public final int a;
    public final String b;

    public w731(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w731)) {
            return false;
        }
        w731 w731Var = (w731) obj;
        return this.a == w731Var.a && u890.j(this.b, w731Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
