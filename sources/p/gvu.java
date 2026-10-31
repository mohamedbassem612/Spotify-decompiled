package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class gvu {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;

    public gvu(int i, String str, String str2, boolean z, String str3) {
        str2 = (i & 2) != 0 ? null : str2;
        str3 = (i & 4) != 0 ? null : str3;
        z = (i & 8) != 0 ? false : z;
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
    }

    public final String a() {
        return this.b;
    }

    public final boolean b() {
        return this.d;
    }

    public final String c() {
        return this.c;
    }

    public final String d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gvu)) {
            return false;
        }
        gvu gvuVar = (gvu) obj;
        return u890.j(this.a, gvuVar.a) && u890.j(this.b, gvuVar.b) && u890.j(this.c, gvuVar.c) && this.d == gvuVar.d;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return Boolean.hashCode(this.d) + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}
