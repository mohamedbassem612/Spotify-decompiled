package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class jeo {
    public final iyl1 a;
    public final ArrayList b;

    public jeo(iyl1 iyl1Var, ArrayList arrayList) {
        this.a = iyl1Var;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jeo)) {
            return false;
        }
        jeo jeoVar = (jeo) obj;
        return this.a.equals(jeoVar.a) && this.b.equals(jeoVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
