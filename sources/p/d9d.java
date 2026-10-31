package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class d9d implements e9d {
    public final String a;
    public final String b;
    public final o9d c;
    public final String d;
    public final String e;

    public d9d(String str, String str2, o9d o9dVar, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = o9dVar;
        this.d = str3;
        this.e = str4;
    }

    public final o9d a() {
        return this.c;
    }

    public final String b() {
        return this.a;
    }

    public final String c() {
        return this.d;
    }

    public final String d() {
        return this.b;
    }

    public final String e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d9d)) {
            return false;
        }
        d9d d9dVar = (d9d) obj;
        return u890.j(this.a, d9dVar.a) && u890.j(this.b, d9dVar.b) && u890.j(this.c, d9dVar.c) && u890.j(this.d, d9dVar.d) && u890.j(this.e, d9dVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        o9d o9dVar = this.c;
        int iHashCode3 = (iHashCode2 + (o9dVar == null ? 0 : o9dVar.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }
}
