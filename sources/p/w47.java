package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
@o661
public final class w47 {
    public static final v47 Companion = new v47();
    public final wb0 a;

    public /* synthetic */ w47(int i, wb0 wb0Var) {
        if (1 == (i & 1)) {
            this.a = wb0Var;
        } else {
            o6p1.t(i, 1, u47.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w47) && u890.j(this.a, ((w47) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
