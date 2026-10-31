package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@o661
public final class gbt {
    public static final fbt Companion = new fbt();
    public final tc4 a;

    public /* synthetic */ gbt(int i, tc4 tc4Var) {
        if (1 == (i & 1)) {
            this.a = tc4Var;
        } else {
            o6p1.t(i, 1, ebt.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gbt) && u890.j(this.a, ((gbt) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
