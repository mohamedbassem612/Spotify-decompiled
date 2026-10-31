package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
@o661
public final class b0l1 extends c0l1 {
    public static final a0l1 Companion = new a0l1();
    public final boolean b;

    public /* synthetic */ b0l1(int i, boolean z) {
        if (1 == (i & 1)) {
            this.b = z;
        } else {
            o6p1.t(i, 1, zzk1.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b0l1) && this.b == ((b0l1) obj).b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b);
    }

    public b0l1(boolean z) {
        this.b = z;
    }
}
