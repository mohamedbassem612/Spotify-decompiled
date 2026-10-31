package p;

import j$.time.OffsetDateTime;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ogk {
    public final String a;
    public final String b;
    public final OffsetDateTime c;
    public final boolean d;
    public final String e;

    public ogk(String str, String str2, OffsetDateTime offsetDateTime, boolean z, String str3) {
        this.a = str;
        this.b = str2;
        this.c = offsetDateTime;
        this.d = z;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ogk)) {
            return false;
        }
        ogk ogkVar = (ogk) obj;
        return this.a.equals(ogkVar.a) && this.b.equals(ogkVar.b) && u890.j(this.c, ogkVar.c) && this.d == ogkVar.d && u890.j(this.e, ogkVar.e);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        OffsetDateTime offsetDateTime = this.c;
        return this.e.hashCode() + xcg1.g((iD + (offsetDateTime == null ? 0 : offsetDateTime.hashCode())) * 31, 31, this.d);
    }
}
