package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class sb80 {
    public final String a;
    public final int b;

    public sb80(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sb80)) {
            return false;
        }
        sb80 sb80Var = (sb80) obj;
        return this.a.equals(sb80Var.a) && this.b == sb80Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
