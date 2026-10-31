package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class mkc extends t3k1 {
    public final gmc b;
    public final List c;
    public final klc d;

    public mkc(gmc gmcVar, List list, klc klcVar) {
        this.b = gmcVar;
        this.c = list;
        this.d = klcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mkc)) {
            return false;
        }
        mkc mkcVar = (mkc) obj;
        return this.b.equals(mkcVar.b) && this.c.equals(mkcVar.c) && u890.j(this.d, mkcVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + f4i1.b(this.b.hashCode() * 31, 31, this.c);
    }
}
