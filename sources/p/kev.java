package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class kev {
    public final vt7 a;
    public final Float b;
    public final int c;
    public final be d;

    public kev(vt7 vt7Var, Float f, int i, be beVar) {
        this.a = vt7Var;
        this.b = f;
        this.c = i;
        this.d = beVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof kev) {
            kev kevVar = (kev) obj;
            return this.a == kevVar.a && u890.j(this.b, kevVar.b) && this.c == kevVar.c && this.d == kevVar.d;
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Float f = this.b;
        return (this.d.hashCode() + kaa0.f(this.c, (iHashCode + (f == null ? 0 : f.hashCode())) * 31, 31)) * 31;
    }
}
