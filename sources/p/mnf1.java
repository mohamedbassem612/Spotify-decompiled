package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class mnf1 {
    public final hrr0 a = v8r.q(inf1.a);
    public Float b;

    public static boolean b(knf1 knf1Var) {
        Float f = knf1Var.f;
        return f != null && f.floatValue() <= 0.2f;
    }

    public static knf1 c(lnf1 lnf1Var, aof1 aof1Var) {
        aof1 aof1Var2 = aof1.a;
        if (aof1Var == aof1Var2) {
            aof1Var2 = aof1.b;
        }
        knf1 knf1VarG = rqg0.G(lnf1Var, aof1Var2);
        if (knf1VarG.b) {
            return knf1VarG;
        }
        return null;
    }

    public final aof1 a() {
        jnf1 jnf1Var = (jnf1) this.a.getValue();
        hnf1 hnf1Var = jnf1Var instanceof hnf1 ? (hnf1) jnf1Var : null;
        if (hnf1Var != null) {
            return hnf1Var.a;
        }
        return null;
    }

    public final void d(lnf1 lnf1Var, aof1 aof1Var) {
        knf1 knf1VarC;
        this.a.setValue(aof1Var != null ? new hnf1(aof1Var) : inf1.a);
        Float f = null;
        if (aof1Var != null && (knf1VarC = c(lnf1Var, aof1Var)) != null) {
            f = knf1VarC.e;
        }
        this.b = f;
    }
}
