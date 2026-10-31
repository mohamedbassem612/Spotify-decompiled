package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class esi1 extends dn90 {
    public final Set e;
    public final Set f;

    public esi1(Set set, Set set2) {
        super(3, (byte) 6);
        this.e = set;
        this.f = set2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof esi1)) {
            return false;
        }
        esi1 esi1Var = (esi1) obj;
        return this.e.equals(esi1Var.e) && this.f.equals(esi1Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + (this.e.hashCode() * 31);
    }
}
