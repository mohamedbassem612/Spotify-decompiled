package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class i0k1 extends w5p1 {
    public final String c;
    public final boolean d;

    public i0k1(String str, boolean z) {
        this.c = str;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0k1)) {
            return false;
        }
        i0k1 i0k1Var = (i0k1) obj;
        return this.c.equals(i0k1Var.c) && this.d == i0k1Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + (this.c.hashCode() * 31);
    }
}
