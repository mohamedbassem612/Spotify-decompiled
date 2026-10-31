package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class tix {
    public final List a;
    public final six b;
    public final boolean c;
    public final boolean d;

    public tix(List list, six sixVar, boolean z, int i) {
        z = (i & 16) != 0 ? false : z;
        this.a = list;
        this.b = sixVar;
        this.c = false;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tix)) {
            return false;
        }
        tix tixVar = (tix) obj;
        return u890.j(this.a, tixVar.a) && this.b.equals(tixVar.b) && this.c == tixVar.c && this.d == tixVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + xcg1.g(xcg1.g((this.b.hashCode() + (this.a.hashCode() * 31)) * 961, 31, this.c), 31, this.d);
    }
}
