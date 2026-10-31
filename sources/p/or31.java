package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class or31 {
    public final iu30 a;
    public final iu30 b;
    public final zu30 c;
    public final zu30 d;

    public or31(iu30 iu30Var, iu30 iu30Var2, zu30 zu30Var, zu30 zu30Var2) {
        this.a = iu30Var;
        this.b = iu30Var2;
        this.c = zu30Var;
        this.d = zu30Var2;
    }

    public final void a(jh5 jh5Var, iu30 iu30Var) {
        zhq0 zhq0VarC = xs31.c();
        ses0 ses0VarA = zhq0VarC.a(((Number) this.b.invoke(jh5Var)).intValue());
        try {
            this.c.J(jh5Var, ses0VarA, 0, Integer.valueOf(ses0VarA.c()));
            int iC = ses0VarA.c();
            for (int i = 0; i < iC; i++) {
                jh5 jh5VarH = ses0VarA.h(i);
                if (jh5VarH != null) {
                    iu30Var.invoke(jh5VarH);
                }
            }
            zhq0VarC.q(ses0VarA);
        } catch (Throwable th) {
            zhq0VarC.q(ses0VarA);
            throw th;
        }
    }
}
