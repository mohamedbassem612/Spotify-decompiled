package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class dmu implements rtb0 {
    public final int a;
    public final rtb0 b;
    public boolean c = true;

    public dmu(int i, rtb0 rtb0Var) {
        this.a = i;
        this.b = rtb0Var;
    }

    public final void a(Object obj, Object obj2, zu30 zu30Var) {
        this.b.a(obj, obj2, zu30Var);
    }

    public final void d(Object obj, Object obj2, xu30 xu30Var) {
        this.b.d(obj, obj2, new j2i(1727002620, new amu(this.c ? 1 : this.a, xu30Var), true));
        this.c = false;
    }

    public final void e(int i, iu30 iu30Var, iu30 iu30Var2, j2i j2iVar) {
        boolean z = this.c;
        rtb0 rtb0Var = this.b;
        if (z) {
            rtb0Var.e(i, iu30Var, iu30Var2, new j2i(945595079, new cmu(this, j2iVar, (byte) 0), true));
        } else {
            rtb0Var.e(i, iu30Var, iu30Var2, new j2i(-1799166178, new cmu(this, j2iVar, (byte) 1), true));
        }
        this.c = false;
    }
}
