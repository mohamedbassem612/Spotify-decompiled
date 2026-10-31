package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public interface gtf1 {
    void a(ie30 ie30Var);

    void b(long j, int i, int i2, int i3, ftf1 ftf1Var);

    void c(izr0 izr0Var, int i, int i2);

    int d(z0r z0rVar, int i, boolean z);

    default int e(z0r z0rVar, int i, boolean z) {
        return d(z0rVar, i, z);
    }

    default void f(int i, izr0 izr0Var) {
        c(izr0Var, i, 0);
    }

    default void g(long j) {
    }
}
