package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract /* synthetic */ class hu20 {
    public static final int a = fyo1.p(16, Integer.MAX_VALUE, "kotlinx.coroutines.flow.defaultConcurrency");

    public static final lt0 a(mr20 mr20Var, vu30 vu30Var) {
        return new lt0(new ht20(mr20Var, vu30Var, (byte) 4), (byte) 4);
    }

    public static final mr20 b(int i, mr20 mr20Var, vu30 vu30Var) {
        fu20 fu20Var = new fu20(mr20Var, vu30Var, (byte) 0);
        if (i > 0) {
            return i == 1 ? new lt0(fu20Var, (byte) 4) : new fge(fu20Var, i, o6x.a, -2, 1);
        }
        hhg1.f(f4i1.c(i, "Expected positive concurrency level, but had "));
        return null;
    }

    public static final jge c(mr20 mr20Var, vu30 vu30Var) {
        return e(mr20Var, new y3s(vu30Var, (lnm) null));
    }

    public static final kge d(mr20... mr20VarArr) {
        return new kge(f46.G(mr20VarArr));
    }

    public static final jge e(mr20 mr20Var, xu30 xu30Var) {
        return new jge(xu30Var, mr20Var, o6x.a, -2, 1);
    }
}
