package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class vvn implements xvn {
    public final String a;
    public final String b;
    public final long c;
    public final long d;

    public vvn(long j, long j2, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vvn)) {
            return false;
        }
        vvn vvnVar = (vvn) obj;
        return this.a.equals(vvnVar.a) && this.b.equals(vvnVar.b) && this.c == vvnVar.c && this.d == vvnVar.d;
    }

    public final String getContextUri() {
        return this.a;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + cy30.f(cy30.d(this.a.hashCode() * 31, 31, this.b), this.c, 31);
    }
}
