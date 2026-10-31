package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class oaq0 implements paq0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final Boolean i;

    public oaq0(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Boolean bool) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = bool;
    }

    @Override // p.paq0
    public final String b() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oaq0)) {
            return false;
        }
        oaq0 oaq0Var = (oaq0) obj;
        return this.a.equals(oaq0Var.a) && this.b.equals(oaq0Var.b) && this.c.equals(oaq0Var.c) && this.d.equals(oaq0Var.d) && this.e.equals(oaq0Var.e) && this.f.equals(oaq0Var.f) && this.g.equals(oaq0Var.g) && this.h.equals(oaq0Var.h) && u890.j(this.i, oaq0Var.i);
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
        int iD = cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
        Boolean bool = this.i;
        return iD + (bool == null ? 0 : bool.hashCode());
    }
}
