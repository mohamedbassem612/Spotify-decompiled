package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gfu0 {
    public final String a;
    public final String b;
    public final long c;
    public final boolean d;

    public gfu0(long j, String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = z;
    }

    public final long a() {
        return this.c;
    }

    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gfu0)) {
            return false;
        }
        gfu0 gfu0Var = (gfu0) obj;
        return u890.j(this.a, gfu0Var.a) && u890.j(this.b, gfu0Var.b) && this.c == gfu0Var.c && this.d == gfu0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + cy30.f(cy30.d(this.a.hashCode() * 31, 31, this.b), this.c, 31);
    }
}
