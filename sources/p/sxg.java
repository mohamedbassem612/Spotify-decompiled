package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class sxg {
    public final jo70 a;
    public final z6a1 b;
    public final List c;

    public sxg(jo70 jo70Var, z6a1 z6a1Var, List list) {
        this.a = jo70Var;
        this.b = z6a1Var;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sxg)) {
            return false;
        }
        sxg sxgVar = (sxg) obj;
        return this.a.equals(sxgVar.a) && this.b.equals(sxgVar.b) && this.c.equals(sxgVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
