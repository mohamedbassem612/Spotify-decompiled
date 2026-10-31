package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class hm01 {
    public final int a;
    public final String b;
    public final long c;

    public hm01(long j, int i, String str) {
        this.a = i;
        this.b = str;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hm01)) {
            return false;
        }
        hm01 hm01Var = (hm01) obj;
        return this.a == hm01Var.a && u890.j(this.b, hm01Var.b) && this.c == hm01Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + cy30.d(Integer.hashCode(this.a) * 31, 31, this.b);
    }
}
