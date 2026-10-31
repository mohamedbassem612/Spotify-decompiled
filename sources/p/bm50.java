package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class bm50 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final byte e;

    /* JADX WARN: Multi-variable type inference failed */
    public bm50(int i, String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bm50)) {
            return false;
        }
        bm50 bm50Var = (bm50) obj;
        return u890.j(this.a, bm50Var.a) && u890.j(this.b, bm50Var.b) && u890.j(this.c, bm50Var.c) && u890.j(this.d, bm50Var.d) && this.e == bm50Var.e;
    }

    public final int hashCode() {
        String str = this.a;
        return Integer.hashCode(this.e) + cy30.d(cy30.d(cy30.d((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31, this.c), 31, this.d);
    }
}
