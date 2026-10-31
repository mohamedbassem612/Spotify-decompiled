package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public interface tl7 {
    static /* synthetic */ void f(tl7 tl7Var, int i, Float f, float f2, int i2) {
        if ((i2 & 2) != 0) {
            f = null;
        }
        if ((i2 & 8) != 0) {
            f2 = 1.0f;
        }
        tl7Var.g(i, f, null, f2);
    }

    void a(sl7 sl7Var);

    void b(rl7 rl7Var);

    void c(sl7 sl7Var);

    void e(rl7 rl7Var);

    void g(int i, Float f, Float f2, float f3);

    void j(rl7 rl7Var, jen0 jen0Var);

    default void h(jen0 jen0Var) {
    }

    default void i(Float f, Float f2, float f3) {
    }
}
