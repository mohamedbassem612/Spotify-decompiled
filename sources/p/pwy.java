package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class pwy extends swy {
    public final ela1 a;
    public final u771 b;
    public final int c;

    public pwy(ela1 ela1Var, u771 u771Var, int i) {
        this.a = ela1Var;
        this.b = u771Var;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pwy)) {
            return false;
        }
        pwy pwyVar = (pwy) obj;
        return u890.j(this.a, pwyVar.a) && u890.j(this.b, pwyVar.b) && this.c == pwyVar.c;
    }

    public final int hashCode() {
        return l1d.C(this.c) + cfm0.g(this.b, this.a.hashCode() * 31, 31);
    }
}
