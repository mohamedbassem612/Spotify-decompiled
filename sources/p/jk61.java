package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@o661
public final class jk61 {
    public static final ik61 Companion = new ik61();
    public final tpt a;

    public /* synthetic */ jk61(int i, tpt tptVar) {
        if (1 == (i & 1)) {
            this.a = tptVar;
        } else {
            o6p1.t(i, 1, hk61.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jk61) && u890.j(this.a, ((jk61) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public jk61(tpt tptVar) {
        this.a = tptVar;
    }
}
