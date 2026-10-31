package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class woh0 {
    public final String a;
    public final String b;
    public final cph0 c;
    public final int d;
    public final long e;

    public woh0(String str, String str2, cph0 cph0Var, int i, long j) {
        this.a = str;
        this.b = str2;
        this.c = cph0Var;
        this.d = i;
        this.e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof woh0)) {
            return false;
        }
        woh0 woh0Var = (woh0) obj;
        return u890.j(this.a, woh0Var.a) && u890.j(this.b, woh0Var.b) && this.c.equals(woh0Var.c) && this.d == woh0Var.d && this.e == woh0Var.e;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + ab80.k(this.d, (this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b)) * 31, 31);
    }
}
