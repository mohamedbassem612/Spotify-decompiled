package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class fpt {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final List e;
    public final String f;

    public fpt(String str, String str2, String str3, String str4, String str5, List list) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = list;
        this.f = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fpt)) {
            return false;
        }
        fpt fptVar = (fpt) obj;
        return u890.j(this.a, fptVar.a) && u890.j(this.b, fptVar.b) && u890.j(this.c, fptVar.c) && u890.j(this.d, fptVar.d) && u890.j(this.e, fptVar.e) && u890.j(this.f, fptVar.f);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        List list = this.e;
        int iHashCode = (iD + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.f;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
