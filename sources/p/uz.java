package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class uz implements l10 {
    public final eln0 a;
    public final List b;

    public uz(eln0 eln0Var, List list) {
        this.a = eln0Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uz)) {
            return false;
        }
        uz uzVar = (uz) obj;
        return this.a.equals(uzVar.a) && this.b.equals(uzVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
