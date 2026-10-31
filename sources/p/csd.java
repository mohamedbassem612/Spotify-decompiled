package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class csd extends hsd {
    public final String a;
    public final String b;
    public final List c;

    public csd(String str, List list, String str2) {
        this.a = str;
        this.b = str2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof csd)) {
            return false;
        }
        csd csdVar = (csd) obj;
        return u890.j(this.a, csdVar.a) && u890.j(this.b, csdVar.b) && this.c.equals(csdVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
