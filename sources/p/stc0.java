package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class stc0 {
    public static f290 a(long j, Object obj) {
        qiy0 qiy0Var = (f290) blh1.i(j, obj);
        if (((g9) qiy0Var).a) {
            return qiy0Var;
        }
        int size = qiy0Var.size();
        qiy0 qiy0VarD = qiy0Var.d(size == 0 ? 10 : size * 2);
        blh1.p(obj, j, qiy0VarD);
        return qiy0VarD;
    }
}
