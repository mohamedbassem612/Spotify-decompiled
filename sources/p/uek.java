package p;

import j$.time.OffsetDateTime;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class uek {
    public static final uek k = new uek("", "", "", "", null, "", "", false, 1, false);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final OffsetDateTime e;
    public final String f;
    public final String g;
    public final boolean h;
    public final int i;
    public final boolean j;

    public uek(String str, String str2, String str3, String str4, OffsetDateTime offsetDateTime, String str5, String str6, boolean z, int i, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = offsetDateTime;
        this.f = str5;
        this.g = str6;
        this.h = z;
        this.i = i;
        this.j = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uek)) {
            return false;
        }
        uek uekVar = (uek) obj;
        return u890.j(this.a, uekVar.a) && this.b.equals(uekVar.b) && u890.j(this.c, uekVar.c) && this.d.equals(uekVar.d) && u890.j(this.e, uekVar.e) && this.f.equals(uekVar.f) && u890.j(this.g, uekVar.g) && this.h == uekVar.h && this.i == uekVar.i && this.j == uekVar.j;
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 961, this.c), 31, this.d);
        OffsetDateTime offsetDateTime = this.e;
        return Boolean.hashCode(this.j) + ab80.k(this.i, xcg1.g(cy30.d(cy30.d((iD + (offsetDateTime == null ? 0 : offsetDateTime.hashCode())) * 31, 31, this.f), 31, this.g), 31, this.h), 31);
    }
}
