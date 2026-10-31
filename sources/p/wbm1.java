package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class wbm1 {
    public final int a;
    public final String b;
    public final boolean c;

    public wbm1(String str, int i, boolean z) {
        this.a = i;
        this.b = str;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wbm1)) {
            return false;
        }
        wbm1 wbm1Var = (wbm1) obj;
        return this.a == wbm1Var.a && this.b.equals(wbm1Var.b) && this.c == wbm1Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + cy30.d(Integer.hashCode(this.a) * 31, 31, this.b);
    }
}
