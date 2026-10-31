package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class bkc extends t3k1 {
    public final gmc b;
    public final Set c;
    public final klc d;

    public bkc(gmc gmcVar, Set set, klc klcVar) {
        this.b = gmcVar;
        this.c = set;
        this.d = klcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bkc)) {
            return false;
        }
        bkc bkcVar = (bkc) obj;
        return this.b.equals(bkcVar.b) && this.c.equals(bkcVar.c) && u890.j(this.d, bkcVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + gvg.c(this.b.hashCode() * 31, 31, this.c);
    }
}
