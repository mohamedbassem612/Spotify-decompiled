package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class hec0 extends tto1 {
    public final String b;
    public final String c;
    public final int d;

    public hec0(int i, String str, String str2) {
        this.b = str;
        this.c = str2;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hec0)) {
            return false;
        }
        hec0 hec0Var = (hec0) obj;
        return u890.j(this.b, hec0Var.b) && u890.j(this.c, hec0Var.c) && this.d == hec0Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + cy30.d(this.b.hashCode() * 31, 961, this.c);
    }
}
