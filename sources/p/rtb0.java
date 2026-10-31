package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public interface rtb0 {
    static /* synthetic */ void b(rtb0 rtb0Var, int i, iu30 iu30Var, j2i j2iVar, int i2) {
        if ((i2 & 2) != 0) {
            iu30Var = null;
        }
        rtb0Var.e(i, iu30Var, zqb0.d, j2iVar);
    }

    static /* synthetic */ void c(rtb0 rtb0Var, Object obj, xu30 xu30Var, int i) {
        if ((i & 1) != 0) {
            obj = null;
        }
        rtb0Var.d(obj, null, xu30Var);
    }

    static /* synthetic */ void f(rtb0 rtb0Var, Object obj, j2i j2iVar, int i) {
        if ((i & 1) != 0) {
            obj = null;
        }
        rtb0Var.a(obj, null, j2iVar);
    }

    default void a(Object obj, Object obj2, zu30 zu30Var) {
        d(obj, obj2, apo.j(1691919627, new pea((j2i) zu30Var, (byte) 2), true));
    }

    void d(Object obj, Object obj2, xu30 xu30Var);

    void e(int i, iu30 iu30Var, iu30 iu30Var2, j2i j2iVar);
}
