package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class blb implements dlb {
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final o8h e;
    public final String f;

    public blb(String str, String str2, String str3, int i, o8h o8hVar, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = o8hVar;
        this.f = str4;
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof blb)) {
            return false;
        }
        blb blbVar = (blb) obj;
        return this.a.equals(blbVar.a) && this.b.equals(blbVar.b) && u890.j(this.c, blbVar.c) && this.d == blbVar.d && u890.j(this.e, blbVar.e) && u890.j(this.f, blbVar.f);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iK = ab80.k(this.d, (iD + (str == null ? 0 : str.hashCode())) * 31, 31);
        o8h o8hVar = this.e;
        int iHashCode = (iK + (o8hVar == null ? 0 : o8hVar.hashCode())) * 31;
        String str2 = this.f;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
