package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
@o661
public final class h4l1 extends l4l1 {
    public static final g4l1 Companion = new g4l1();
    public final boolean b;

    public /* synthetic */ h4l1(int i, boolean z) {
        if (1 == (i & 1)) {
            this.b = z;
        } else {
            o6p1.t(i, 1, f4l1.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h4l1) && this.b == ((h4l1) obj).b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b);
    }
}
