package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@o661
public final class a120 {
    public static final z020 Companion = new z020();
    public final boolean a;

    public /* synthetic */ a120(int i, boolean z) {
        if (1 == (i & 1)) {
            this.a = z;
        } else {
            o6p1.t(i, 1, y020.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a120) && this.a == ((a120) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
