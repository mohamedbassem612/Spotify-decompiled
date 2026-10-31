package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class cmn implements emn {
    public final zm81 a;
    public final List b;

    public cmn(zm81 zm81Var, List list) {
        this.a = zm81Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cmn)) {
            return false;
        }
        cmn cmnVar = (cmn) obj;
        if (!u890.j(this.a, cmnVar.a) || !u890.j(this.b, cmnVar.b)) {
            return false;
        }
        rnn rnnVar = rnn.a;
        return rnnVar.equals(rnnVar);
    }

    public final int hashCode() {
        return ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31) + 996643979;
    }
}
