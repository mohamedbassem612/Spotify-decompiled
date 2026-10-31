package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class gwq {
    public final List a;
    public final String b;
    public final boolean c;

    public gwq(String str, List list, boolean z) {
        this.a = list;
        this.b = str;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gwq)) {
            return false;
        }
        gwq gwqVar = (gwq) obj;
        return this.a.equals(gwqVar.a) && u890.j(this.b, gwqVar.b) && this.c == gwqVar.c;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return Boolean.hashCode(this.c) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
