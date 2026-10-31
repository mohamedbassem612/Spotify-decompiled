package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class j5o0 extends l5o0 {
    public final String a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final String e;

    public j5o0(boolean z, boolean z2, String str, String str2, String str3) {
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
        if (!(obj instanceof j5o0)) {
            return false;
        }
        j5o0 j5o0Var = (j5o0) obj;
        return this.a.equals(j5o0Var.a) && this.b.equals(j5o0Var.b) && this.c == j5o0Var.c && this.d == j5o0Var.d && this.e.equals(j5o0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + xcg1.g(xcg1.g(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }
}
