package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class utr {
    public final dia1 a;
    public final List b;

    public utr(dia1 dia1Var, List list) {
        this.a = dia1Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof utr)) {
            return false;
        }
        utr utrVar = (utr) obj;
        return this.a == utrVar.a && u890.j(this.b, utrVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
