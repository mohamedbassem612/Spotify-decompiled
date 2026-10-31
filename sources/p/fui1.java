package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public interface fui1 {
    boolean b();

    long e(oe5 oe5Var, oe5 oe5Var2, oe5 oe5Var3);

    oe5 g(long j, oe5 oe5Var, oe5 oe5Var2, oe5 oe5Var3);

    default oe5 m(oe5 oe5Var, oe5 oe5Var2, oe5 oe5Var3) {
        return g(e(oe5Var, oe5Var2, oe5Var3), oe5Var, oe5Var2, oe5Var3);
    }

    oe5 n(long j, oe5 oe5Var, oe5 oe5Var2, oe5 oe5Var3);
}
