package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class m8d1 {
    public final /* synthetic */ n8d1 a;

    public m8d1(n8d1 n8d1Var) {
        this.a = n8d1Var;
    }

    public static void a(m8d1 m8d1Var, Object obj) {
        p9m p9mVar = smg1.a;
        n8d1 n8d1Var = m8d1Var.a;
        if (obj.equals(n8d1Var.b.getValue())) {
            return;
        }
        n8d1Var.c = p9mVar;
        n8d1Var.a.setValue(obj);
    }
}
