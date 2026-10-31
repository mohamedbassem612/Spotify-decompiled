package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public abstract class jsk implements rqw {
    public final rqw a;

    public jsk(rqw rqwVar) {
        this.a = rqwVar;
    }

    public final op80 a(Object obj, Object obj2, op80 op80Var) {
        return this.a.a(obj, obj2, op80Var);
    }

    public Object b(Object obj, Object obj2, Object obj3, op80 op80Var) {
        return this.a.b(obj, obj2, obj3, op80Var);
    }

    public final boolean c(Object obj, Object obj2, op80 op80Var) {
        return f(obj, obj2) && this.a.c(obj, obj2, op80Var);
    }

    public final Object d(Object obj, Object obj2, op80 op80Var) {
        return this.a.d(obj, obj2, op80Var);
    }

    public boolean e(Object obj) {
        return true;
    }

    public boolean f(Object obj, Object obj2) {
        return e(obj);
    }
}
