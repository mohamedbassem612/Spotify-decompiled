package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class mb61 {
    public final String a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final String e;

    public mb61(boolean z, boolean z2, String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mb61)) {
            return false;
        }
        mb61 mb61Var = (mb61) obj;
        return u890.j(this.a, mb61Var.a) && this.b.equals(mb61Var.b) && this.c == mb61Var.c && this.d == mb61Var.d && this.e.equals(mb61Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + xcg1.g(xcg1.g(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }
}
