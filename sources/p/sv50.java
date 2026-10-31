package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class sv50 {
    public final String a;
    public final String b;
    public final String c;
    public final int d;

    public sv50(String str, String str2, int i, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sv50)) {
            return false;
        }
        sv50 sv50Var = (sv50) obj;
        return this.a.equals(sv50Var.a) && this.b.equals(sv50Var.b) && this.c.equals(sv50Var.c) && this.d == sv50Var.d;
    }

    public final int hashCode() {
        return l1d.C(this.d) + cy30.d(cy30.d(this.a.hashCode() * 31, 961, this.b), 31, this.c);
    }
}
