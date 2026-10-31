package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class naq0 implements paq0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final Boolean h;

    public naq0(String str, String str2, String str3, String str4, String str5, String str6, String str7, Boolean bool) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = bool;
    }

    @Override // p.paq0
    public final String b() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof naq0)) {
            return false;
        }
        naq0 naq0Var = (naq0) obj;
        return this.a.equals(naq0Var.a) && this.b.equals(naq0Var.b) && this.c.equals(naq0Var.c) && this.d.equals(naq0Var.d) && this.e.equals(naq0Var.e) && this.f.equals(naq0Var.f) && u890.j(this.g, naq0Var.g) && u890.j(this.h, naq0Var.h);
    }

    @Override // p.paq0
    public final String getArtist() {
        return this.c;
    }

    @Override // p.paq0
    public final String getArtwork() {
        return this.b;
    }

    @Override // p.paq0
    public final String getTitle() {
        return this.a;
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
        String str = this.g;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.h;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }
}
