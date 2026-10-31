package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class o0i {
    public final c9n a;
    public final mr20 b;
    public final n0i c;
    public final dlg1 d;
    public final hp80 e;

    public o0i(c9n c9nVar, mr20 mr20Var, n0i n0iVar, dlg1 dlg1Var, hp80 hp80Var) {
        this.a = c9nVar;
        this.b = mr20Var;
        this.c = n0iVar;
        this.d = dlg1Var;
        this.e = hp80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o0i) {
            o0i o0iVar = (o0i) obj;
            if (this.a.equals(o0iVar.a) && this.b.equals(o0iVar.b) && this.c.equals(o0iVar.c) && this.d == o0iVar.d && this.e.equals(o0iVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31);
    }
}
