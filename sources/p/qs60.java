package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
@o661
public final class qs60 {
    public static final hs60 Companion = new hs60();
    public final boolean a;

    public /* synthetic */ qs60(int i, boolean z) {
        if (1 == (i & 1)) {
            this.a = z;
        } else {
            o6p1.t(i, 1, gs60.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qs60) && this.a == ((qs60) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
