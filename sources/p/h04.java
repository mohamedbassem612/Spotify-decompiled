package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class h04 implements i04 {
    public final String a;
    public final String b;
    public final boolean c;
    public final String d;
    public final String e;

    public h04(String str, String str2, String str3, String str4, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = str3;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h04)) {
            return false;
        }
        h04 h04Var = (h04) obj;
        return this.a.equals(h04Var.a) && this.b.equals(h04Var.b) && this.c == h04Var.c && this.d.equals(h04Var.d) && this.e.equals(h04Var.e);
    }

    public final String getUri() {
        return this.a;
    }

    public final int hashCode() {
        return this.e.hashCode() + cy30.d(xcg1.g(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }
}
