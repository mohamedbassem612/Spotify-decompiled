package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public interface j06 {
    Object a();

    void b(int i, int i2, int i3);

    void c(int i, int i2);

    void clear();

    default void d(Object obj, vu30 vu30Var) {
        vu30Var.invoke(a(), obj);
    }

    void e(int i, Object obj);

    void g(int i, Object obj);

    void h(Object obj);

    default void i() {
        Object objA = a();
        wvj wvjVar = objA instanceof wvj ? (wvj) objA : null;
        if (wvjVar != null) {
            wvjVar.c();
        }
    }

    void l();

    default void f() {
    }
}
