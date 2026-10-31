package p;

import java.util.Date;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class h6r {
    public final String a;
    public final Date b;
    public final boolean c;

    public h6r(String str, Date date, boolean z) {
        this.a = str;
        this.b = date;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h6r)) {
            return false;
        }
        h6r h6rVar = (h6r) obj;
        return this.a.equals(h6rVar.a) && u890.j(this.b, h6rVar.b) && this.c == h6rVar.c;
    }

    public final int hashCode() {
        int iD = cy30.d(l1d.C(2) * 31, 31, this.a);
        Date date = this.b;
        return Boolean.hashCode(this.c) + ((iD + (date == null ? 0 : date.hashCode())) * 31);
    }
}
