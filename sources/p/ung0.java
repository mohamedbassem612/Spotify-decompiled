package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ung0 {
    public static ong0 a(Object obj, Object obj2) {
        ong0 ong0VarD = (ong0) obj;
        ong0 ong0Var = (ong0) obj2;
        if (!ong0Var.isEmpty()) {
            if (!ong0VarD.a) {
                ong0VarD = ong0VarD.d();
            }
            ong0VarD.b();
            if (!ong0Var.isEmpty()) {
                ong0VarD.putAll(ong0Var);
            }
        }
        return ong0VarD;
    }
}
