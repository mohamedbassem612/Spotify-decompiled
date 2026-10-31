package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class kpx0 {
    public final String a;
    public final String b;
    public final String c;

    public kpx0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kpx0)) {
            return false;
        }
        kpx0 kpx0Var = (kpx0) obj;
        return this.a.equals(kpx0Var.a) && this.b.equals(kpx0Var.b) && this.c.equals(kpx0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
