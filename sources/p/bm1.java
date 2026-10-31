package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class bm1 {
    public final String a;
    public final boolean b;

    public bm1(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bm1)) {
            return false;
        }
        bm1 bm1Var = (bm1) obj;
        return u890.j(this.a, bm1Var.a) && this.b == bm1Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
