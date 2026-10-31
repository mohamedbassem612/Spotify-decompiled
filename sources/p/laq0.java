package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class laq0 implements paq0, kaq0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public laq0(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
    }

    public final String a() {
        return this.f;
    }

    public final String b() {
        return this.d;
    }

    public final String c() {
        return this.g;
    }

    public final String d() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof laq0)) {
            return false;
        }
        laq0 laq0Var = (laq0) obj;
        return this.a.equals(laq0Var.a) && this.b.equals(laq0Var.b) && this.c.equals(laq0Var.c) && this.d.equals(laq0Var.d) && this.e.equals(laq0Var.e) && this.f.equals(laq0Var.f) && this.g.equals(laq0Var.g);
    }

    public final String getArtist() {
        return this.c;
    }

    public final String getArtwork() {
        return this.b;
    }

    public final String getTitle() {
        return this.a;
    }

    public final int hashCode() {
        return this.g.hashCode() + cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }
}
