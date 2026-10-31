package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class jge1 {
    public static final ThreadLocal a = p8p1.m();

    public static ab00 a() {
        ThreadLocal threadLocal = a;
        ab00 ab00Var = (ab00) threadLocal.get();
        if (ab00Var != null) {
            return ab00Var;
        }
        p8b p8bVarJ = u2o1.j();
        threadLocal.set(p8bVarJ);
        return p8bVarJ;
    }
}
