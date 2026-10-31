package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class b1z extends sgl {
    public final heg b;
    public final ajn0 c;

    public b1z(heg hegVar, ajn0 ajn0Var) {
        super(new mmr0(hegVar, ajn0Var));
        this.b = hegVar;
        this.c = ajn0Var;
    }

    @Override // p.sgl
    public final a8b0 a(zim0 zim0Var) {
        qx81 qx81VarM;
        heg hegVar = this.b;
        beg begVarH = x1p1.h(zim0Var, hegVar);
        if (begVarH != null) {
            if (!iht.l(begVarH, 3)) {
                begVarH = null;
            }
            if (begVarH != null && (qx81VarM = begVarH.m()) != null) {
                return qx81VarM;
            }
        }
        return bkz.b(zjz.a1, hegVar.toString(), this.c.a);
    }

    @Override // p.sgl
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.b.f());
        sb.append('.');
        sb.append(this.c);
        return sb.toString();
    }
}
