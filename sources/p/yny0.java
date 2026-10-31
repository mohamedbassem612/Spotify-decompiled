package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class yny0 {
    public final String a;
    public final String b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final String f;

    public yny0(int i, String str, String str2, String str3, boolean z, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = z;
        this.e = z2;
        this.f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yny0)) {
            return false;
        }
        yny0 yny0Var = (yny0) obj;
        return this.a.equals(yny0Var.a) && this.b.equals(yny0Var.b) && this.c == yny0Var.c && this.d == yny0Var.d && this.e == yny0Var.e && this.f.equals(yny0Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + xcg1.g(xcg1.g(kaa0.f(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31), 31, this.d), 31, this.e);
    }
}
