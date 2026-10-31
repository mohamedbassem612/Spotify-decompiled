package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class tec1 implements o590, d0u0 {
    public final jn7 a;
    public final lvw0 b;
    public final yqg c;
    public final bas d;
    public final String e;
    public final boolean f;
    public final q8n g;
    public final q8n h;
    public rec1 i;

    public tec1(String str, jn7 jn7Var, yqg yqgVar, q8n q8nVar, q8n q8nVar2, bas basVar, lvw0 lvw0Var, boolean z) {
        this.a = jn7Var;
        this.b = lvw0Var;
        this.c = yqgVar;
        this.d = basVar;
        this.e = str;
        this.f = z;
        this.g = q8nVar;
        this.h = q8nVar2;
    }

    public final spq0 I(m0u0 m0u0Var, oot0 oot0Var, np00 np00Var, String str, lls0 lls0Var) {
        rec1 rec1Var = this.i;
        this.i = null;
        if (rec1Var != null) {
            rec1Var.X = m0u0Var;
            rec1Var.Y = np00Var;
            boolean z = oot0Var.c;
            rec1Var.Z = z;
            rec1Var.d1 = z;
            rec1Var.N0 = true;
        }
        rec1 rec1Var2 = rec1Var != null ? rec1Var : null;
        if (rec1Var2 != null) {
            rec1Var2.g1 = lls0Var;
        }
        return spq0.a(rec1Var);
    }
}
