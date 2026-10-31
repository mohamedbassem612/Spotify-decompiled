package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class khh {
    public final lvm a;
    public final String b;
    public final String c;
    public final String d;
    public final Long e;
    public final String f;
    public final yyz0 g = yyz0.a;
    public final int h = 1;

    public khh(lvm lvmVar, String str, String str2, String str3, Long l, String str4) {
        this.a = lvmVar;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = l;
        this.f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof khh)) {
            return false;
        }
        khh khhVar = (khh) obj;
        return this.a.equals(khhVar.a) && this.b.equals(khhVar.b) && u890.j(this.c, khhVar.c) && u890.j(this.d, khhVar.d) && u890.j(this.e, khhVar.e) && this.f.equals(khhVar.f) && this.g.equals(khhVar.g) && this.h == khhVar.h;
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(cy30.d(this.a.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        Long l = this.e;
        return l1d.C(this.h) + ((((this.f.hashCode() + ((iD + (l == null ? 0 : l.hashCode())) * 31)) * 31) + 934467397) * 31);
    }
}
