package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
@o661
public final class kid0 {
    public static final jid0 Companion = new jid0();
    public static final znb0[] b = {dm5.S(2, fnc0.T0)};
    public final mid0 a;

    public /* synthetic */ kid0(int i, mid0 mid0Var) {
        if (1 == (i & 1)) {
            this.a = mid0Var;
        } else {
            o6p1.t(i, 1, iid0.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kid0) && this.a == ((kid0) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
