package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class vkc extends jlc {
    public final gmc a;
    public final Set b;

    public vkc(gmc gmcVar, Set set) {
        this.a = gmcVar;
        this.b = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vkc)) {
            return false;
        }
        vkc vkcVar = (vkc) obj;
        return this.a.equals(vkcVar.a) && this.b.equals(vkcVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
