package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class psx0 extends ktx0 {
    public final String a;
    public final String b;
    public final long c;
    public final boolean d;

    public psx0(long j, String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof psx0)) {
            return false;
        }
        psx0 psx0Var = (psx0) obj;
        return this.a.equals(psx0Var.a) && this.b.equals(psx0Var.b) && this.c == psx0Var.c && this.d == psx0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + cy30.f(cy30.d(this.a.hashCode() * 31, 31, this.b), this.c, 31);
    }
}
