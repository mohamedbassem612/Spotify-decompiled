package p;

import j$.time.OffsetDateTime;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class d900 {
    public final String a;
    public final String b;
    public final OffsetDateTime c;
    public final k07 d;
    public final boolean e;
    public final String f;

    public d900(String str, String str2, OffsetDateTime offsetDateTime, k07 k07Var, boolean z, String str3) {
        this.a = str;
        this.b = str2;
        this.c = offsetDateTime;
        this.d = k07Var;
        this.e = z;
        this.f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d900)) {
            return false;
        }
        d900 d900Var = (d900) obj;
        return this.a.equals(d900Var.a) && this.b.equals(d900Var.b) && u890.j(this.c, d900Var.c) && this.d.equals(d900Var.d) && this.e == d900Var.e && u890.j(this.f, d900Var.f);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        OffsetDateTime offsetDateTime = this.c;
        int iG = xcg1.g((this.d.hashCode() + ((iD + (offsetDateTime == null ? 0 : offsetDateTime.hashCode())) * 31)) * 31, 31, this.e);
        String str = this.f;
        return iG + (str != null ? str.hashCode() : 0);
    }
}
