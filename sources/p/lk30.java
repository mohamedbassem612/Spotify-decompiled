package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
@o661
public final class lk30 {
    public static final kk30 Companion = new kk30();
    public final rgv a;

    public /* synthetic */ lk30(int i, rgv rgvVar) {
        if (1 == (i & 1)) {
            this.a = rgvVar;
        } else {
            o6p1.t(i, 1, jk30.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lk30) && u890.j(this.a, ((lk30) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
