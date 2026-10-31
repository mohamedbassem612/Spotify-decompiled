package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class oot implements sot {
    public final un90 a;
    public final mml b;
    public final d6c0 c;
    public final List d;

    public oot(un90 un90Var, mml mmlVar, d6c0 d6c0Var, List list) {
        this.a = un90Var;
        this.b = mmlVar;
        this.c = d6c0Var;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oot)) {
            return false;
        }
        oot ootVar = (oot) obj;
        return u890.j(this.a, ootVar.a) && u890.j(this.b, ootVar.b) && this.c.equals(ootVar.c) && this.d.equals(ootVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }
}
