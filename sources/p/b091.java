package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class b091 extends j2h1 {
    public final yky0 d;
    public final hrr0 e = v8r.q((Object) null);

    public b091(yky0 yky0Var) {
        this.d = yky0Var;
    }

    public final void Q(yky0 yky0Var, Object obj) {
        if (yky0Var != this.d) {
            qf80.c("Check failed.");
        }
        this.e.setValue(obj);
    }

    public final boolean m(yky0 yky0Var) {
        return yky0Var == this.d;
    }

    public final Object r(yky0 yky0Var) {
        if (yky0Var != this.d) {
            qf80.c("Check failed.");
        }
        Object value = this.e.getValue();
        if (value == null) {
            return null;
        }
        return value;
    }
}
