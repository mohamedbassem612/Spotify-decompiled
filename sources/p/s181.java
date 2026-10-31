package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class s181 implements xu30 {
    public final u5f1 a;
    public final c811 b;

    public s181(u5f1 u5f1Var, c811 c811Var) {
        this.a = u5f1Var;
        this.b = c811Var;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0039  */
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        u5f1 u5f1Var = this.a;
        if (!u5f1Var.b.b(u5f1Var.a, (String) obj3).n(v5f1.a) && zBooleanValue) {
            c811 c811Var = this.b;
            z = !c811Var.b.n() ? true : c811Var.a.h(12) ^ true;
        }
        return Boolean.valueOf(z);
    }
}
