package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class q60 implements ft40 {
    public final q10 a;
    public final int b;

    public q60(q10 q10Var, int i) {
        this.a = q10Var;
        this.b = i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActionModifier(action=");
        sb.append(this.a);
        sb.append(", rippleOverride=");
        return l1d.o(sb, this.b, ')');
    }
}
