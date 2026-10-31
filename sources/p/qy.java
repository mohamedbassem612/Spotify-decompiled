package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class qy implements l10 {
    public final eln0 a;
    public final List b;

    public qy(eln0 eln0Var, List list) {
        this.a = eln0Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qy)) {
            return false;
        }
        qy qyVar = (qy) obj;
        return this.a.equals(qyVar.a) && u890.j(this.b, qyVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
