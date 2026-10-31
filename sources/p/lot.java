package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class lot implements mot {
    public final fqq0 a;
    public final List b;

    public lot(fqq0 fqq0Var, List list) {
        this.a = fqq0Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lot)) {
            return false;
        }
        lot lotVar = (lot) obj;
        return this.a.equals(lotVar.a) && u890.j(this.b, lotVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
