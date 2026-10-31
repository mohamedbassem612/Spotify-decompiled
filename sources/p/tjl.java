package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class tjl {
    public final String a;
    public final Long b;
    public final Long c;
    public final String d;
    public final List e;

    public tjl(String str, Long l, Long l2, String str2, List list) {
        this.a = str;
        this.b = l;
        this.c = l2;
        this.d = str2;
        this.e = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tjl)) {
            return false;
        }
        tjl tjlVar = (tjl) obj;
        return this.a.equals(tjlVar.a) && u890.j(this.b, tjlVar.b) && u890.j(this.c, tjlVar.c) && u890.j(this.d, tjlVar.d) && u890.j(this.e, tjlVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Long l = this.b;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.c;
        int iHashCode3 = (iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str = this.d;
        return this.e.hashCode() + ((iHashCode3 + (str != null ? str.hashCode() : 0)) * 31);
    }
}
