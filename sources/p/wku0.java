package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class wku0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d = "";
    public final uku0 e = uku0.a;

    public wku0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wku0)) {
            return false;
        }
        wku0 wku0Var = (wku0) obj;
        return this.a.equals(wku0Var.a) && this.b.equals(wku0Var.b) && this.c.equals(wku0Var.c) && this.d.equals(wku0Var.d) && this.e.equals(wku0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }
}
