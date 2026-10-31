package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class qdo extends puo1 {
    public final String b;
    public final String c;
    public final Long d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;

    public qdo(String str, String str2, Long l, String str3, String str4, String str5, String str6, String str7) {
        this.b = str;
        this.c = str2;
        this.d = l;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qdo)) {
            return false;
        }
        qdo qdoVar = (qdo) obj;
        return u890.j(this.b, qdoVar.b) && this.c.equals(qdoVar.c) && u890.j(this.d, qdoVar.d) && this.e.equals(qdoVar.e) && u890.j(this.f, qdoVar.f) && this.g.equals(qdoVar.g) && u890.j(this.h, qdoVar.h) && u890.j(this.i, qdoVar.i);
    }

    public final int hashCode() {
        int iD = cy30.d(this.b.hashCode() * 31, 31, this.c);
        Long l = this.d;
        int iD2 = cy30.d(cy30.d(cy30.d(cy30.d((iD + (l == null ? 0 : l.hashCode())) * 31, 31, this.e), 31, this.f), 31, this.g), 31, this.h);
        String str = this.i;
        return iD2 + (str != null ? str.hashCode() : 0);
    }

    public final String l() {
        return this.g;
    }

    public final String m() {
        return "trackingUrlFailure";
    }

    public final String n() {
        return this.f;
    }

    public final String o() {
        return this.i;
    }

    public final String p() {
        return this.h;
    }
}
