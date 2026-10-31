package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
@o661
public final class q47 {
    public static final p47 Companion = new p47();
    public final wb0 a;

    public /* synthetic */ q47(int i, wb0 wb0Var) {
        if (1 == (i & 1)) {
            this.a = wb0Var;
        } else {
            o6p1.t(i, 1, o47.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q47) && u890.j(this.a, ((q47) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
