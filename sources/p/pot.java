package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class pot implements sot {
    public final un90 a;
    public final mml b;
    public final d6c0 c;
    public final List d;

    public pot(un90 un90Var, mml mmlVar, d6c0 d6c0Var, List list) {
        this.a = un90Var;
        this.b = mmlVar;
        this.c = d6c0Var;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pot)) {
            return false;
        }
        pot potVar = (pot) obj;
        return u890.j(this.a, potVar.a) && u890.j(this.b, potVar.b) && this.c.equals(potVar.c) && this.d.equals(potVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }
}
