package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class vhl implements mlb0 {
    public final ihl a;
    public final iu30 b;
    public final Object c;

    public vhl(ihl ihlVar, iu30 iu30Var) {
        this.a = ihlVar;
        this.b = iu30Var;
        this.c = ihlVar.c;
    }

    public final Object A0() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof vhl)) {
            return false;
        }
        vhl vhlVar = (vhl) obj;
        return u890.j(this.a.c, vhlVar.a.c) && u890.j(this.b, vhlVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.c.hashCode() * 31);
    }
}
