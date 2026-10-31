package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class dgo0 {
    public final heg a;
    public final List b;

    public dgo0(heg hegVar, List list) {
        this.a = hegVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dgo0)) {
            return false;
        }
        dgo0 dgo0Var = (dgo0) obj;
        return u890.j(this.a, dgo0Var.a) && this.b.equals(dgo0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ClassRequest(classId=" + this.a + ", typeParametersCount=" + this.b + ')';
    }
}
