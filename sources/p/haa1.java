package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class haa1 {
    public final String a;
    public final int b;

    public haa1(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof haa1)) {
            return false;
        }
        haa1 haa1Var = (haa1) obj;
        return u890.j(this.a, haa1Var.a) && this.b == haa1Var.b;
    }

    public final int hashCode() {
        String str = this.a;
        return Integer.hashCode(this.b) + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
