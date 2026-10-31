package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class bhe {
    public final String a;
    public final String b;
    public final long c;
    public final long d;
    public final boolean e;

    public bhe(long j, long j2, String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = j2;
        this.e = z;
    }

    public static bhe a(bhe bheVar, long j, long j2, boolean z, int i) {
        String str = bheVar.a;
        String str2 = bheVar.b;
        if ((i & 4) != 0) {
            j = bheVar.c;
        }
        long j3 = j;
        if ((i & 8) != 0) {
            j2 = bheVar.d;
        }
        long j4 = j2;
        if ((i & 16) != 0) {
            z = bheVar.e;
        }
        bheVar.getClass();
        return new bhe(j3, j4, str, str2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bhe)) {
            return false;
        }
        bhe bheVar = (bhe) obj;
        return u890.j(this.a, bheVar.a) && u890.j(this.b, bheVar.b) && this.c == bheVar.c && this.d == bheVar.d && this.e == bheVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + cy30.f(cy30.f(cy30.d(this.a.hashCode() * 31, 31, this.b), this.c, 31), this.d, 31);
    }
}
