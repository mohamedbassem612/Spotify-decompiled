package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class rnu0 {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final String e;

    public rnu0(String str, String str2, String str3, String str4, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rnu0)) {
            return false;
        }
        rnu0 rnu0Var = (rnu0) obj;
        return this.a.equals(rnu0Var.a) && this.b.equals(rnu0Var.b) && this.c.equals(rnu0Var.c) && this.d == rnu0Var.d && this.e.equals(rnu0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + xcg1.g(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }
}
