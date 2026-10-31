package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class h0o {
    public final String a;
    public final String b;
    public final int c;
    public final g0o d;
    public final boolean e;
    public final boolean f;

    public h0o(String str, String str2, int i, g0o g0oVar, boolean z, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = g0oVar;
        this.e = z;
        this.f = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0o)) {
            return false;
        }
        h0o h0oVar = (h0o) obj;
        return u890.j(this.a, h0oVar.a) && u890.j(this.b, h0oVar.b) && this.c == h0oVar.c && u890.j(this.d, h0oVar.d) && this.e == h0oVar.e && this.f == h0oVar.f;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return Boolean.hashCode(this.f) + xcg1.g((this.d.hashCode() + ab80.k(this.c, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31)) * 31, 31, this.e);
    }
}
