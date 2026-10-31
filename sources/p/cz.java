package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class cz implements l10 {
    public final eln0 a;
    public final List b;
    public final bz c;

    public cz(eln0 eln0Var, List list, bz bzVar) {
        this.a = eln0Var;
        this.b = list;
        this.c = bzVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cz)) {
            return false;
        }
        cz czVar = (cz) obj;
        return this.a.equals(czVar.a) && this.b.equals(czVar.b) && this.c.equals(czVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + f4i1.b(this.a.hashCode() * 31, 31, this.b);
    }
}
