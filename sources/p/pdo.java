package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class pdo extends puo1 {
    public final Long b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public pdo(Long l, String str, String str2, String str3, String str4) {
        this.b = l;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pdo)) {
            return false;
        }
        pdo pdoVar = (pdo) obj;
        return this.b.equals(pdoVar.b) && u890.j(this.c, pdoVar.c) && u890.j(this.d, pdoVar.d) && this.e.equals(pdoVar.e) && this.f.equals(pdoVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + cy30.d(cy30.d(cy30.d(this.b.hashCode() * 31, 31, this.c), 31, this.d), 31, this.e);
    }

    public final String l() {
        return this.f;
    }

    public final String n() {
        return this.d;
    }

    public final String p() {
        return this.e;
    }
}
