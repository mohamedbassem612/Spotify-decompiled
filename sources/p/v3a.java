package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class v3a {
    public final String a;
    public final String b;
    public final boolean c;
    public final String d;

    public v3a(String str, String str2, boolean z, String str3) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v3a)) {
            return false;
        }
        v3a v3aVar = (v3a) obj;
        return this.a.equals(v3aVar.a) && u890.j(this.b, v3aVar.b) && this.c == v3aVar.c && u890.j(this.d, v3aVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iG = xcg1.g(xcg1.g((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, true), 31, this.c);
        String str2 = this.d;
        return iG + (str2 != null ? str2.hashCode() : 0);
    }
}
