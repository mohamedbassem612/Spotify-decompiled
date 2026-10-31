package p;

import java.util.AbstractSet;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class deu implements chu {
    public final fq0 a;
    public final Set b;

    public deu(fq0 fq0Var, AbstractSet abstractSet) {
        this.a = fq0Var;
        this.b = abstractSet;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof deu)) {
            return false;
        }
        deu deuVar = (deu) obj;
        return this.a.equals(deuVar.a) && this.b.equals(deuVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
