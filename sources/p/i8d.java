package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class i8d implements p8d {
    public final List a;
    public final o8d b;
    public final String c;
    public final String d;
    public final String e;

    public i8d(List list, o8d o8dVar, String str, String str2, String str3) {
        this.a = list;
        this.b = o8dVar;
        this.c = str;
        this.d = str2;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i8d)) {
            return false;
        }
        i8d i8dVar = (i8d) obj;
        return u890.j(this.a, i8dVar.a) && u890.j(this.b, i8dVar.b) && u890.j(this.c, i8dVar.c) && u890.j(this.d, i8dVar.d) && u890.j(this.e, i8dVar.e);
    }

    @Override // p.p8d
    public final o8d getType() {
        return this.b;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }
}
