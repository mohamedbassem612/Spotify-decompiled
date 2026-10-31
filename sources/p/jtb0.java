package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class jtb0 extends mmo1 implements rtb0 {
    public final mgc c = new mgc((byte) 22);
    public edn0 d;

    public jtb0(iu30 iu30Var) {
        iu30Var.invoke(this);
    }

    public final mgc B() {
        return this.c;
    }

    @Override // p.rtb0
    public final void a(Object obj, Object obj2, zu30 zu30Var) {
        edn0 edn0Var = this.d;
        if (edn0Var == null) {
            edn0Var = new edn0();
            this.d = edn0Var;
        }
        mgc mgcVar = this.c;
        edn0Var.a(mgcVar.B());
        d(obj, obj2, apo.j(-1588696110, new cpb0((j2i) zu30Var, mgcVar.B(), (byte) 1), true));
    }

    @Override // p.rtb0
    public final void d(Object obj, Object obj2, xu30 xu30Var) {
        this.c.e(1, new htb0(obj != null ? new gv20(obj, (byte) 15) : null, new gv20(obj2, (byte) 15), apo.j(-857469575, new itb0(xu30Var, (byte) 0), true)));
    }

    @Override // p.rtb0
    public final void e(int i, iu30 iu30Var, iu30 iu30Var2, j2i j2iVar) {
        this.c.e(i, new htb0(iu30Var, iu30Var2, j2iVar));
    }
}
