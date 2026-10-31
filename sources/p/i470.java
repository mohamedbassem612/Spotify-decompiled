package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@o661
public final class i470 {
    public static final h470 Companion = new h470();
    public final re70 a;

    public /* synthetic */ i470(int i, re70 re70Var) {
        if (1 == (i & 1)) {
            this.a = re70Var;
        } else {
            o6p1.t(i, 1, g470.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i470) && u890.j(this.a, ((i470) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
