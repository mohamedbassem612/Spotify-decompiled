package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class nng {
    public final boolean a;
    public final String b;
    public final boolean c;
    public final String d;
    public final String e;

    public /* synthetic */ nng(int i, boolean z) {
        this((i & 1) != 0 ? true : z, false, "", null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nng)) {
            return false;
        }
        nng nngVar = (nng) obj;
        return this.a == nngVar.a && u890.j(this.b, nngVar.b) && this.c == nngVar.c && u890.j(this.d, nngVar.d) && u890.j(this.e, nngVar.e);
    }

    public final int hashCode() {
        int iG = xcg1.g(cy30.d(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int iHashCode = (iG + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public nng(boolean z, boolean z2, String str, String str2, String str3) {
        this.a = z;
        this.b = str;
        this.c = z2;
        this.d = str2;
        this.e = str3;
    }
}
