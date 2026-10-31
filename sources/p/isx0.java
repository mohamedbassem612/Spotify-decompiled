package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class isx0 extends ktx0 {
    public final String a;
    public final String b;
    public final long c;
    public final boolean d;

    public isx0(long j, String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof isx0)) {
            return false;
        }
        isx0 isx0Var = (isx0) obj;
        return this.a.equals(isx0Var.a) && this.b.equals(isx0Var.b) && this.c == isx0Var.c && this.d == isx0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + cy30.f(cy30.d(this.a.hashCode() * 31, 31, this.b), this.c, 31);
    }
}
