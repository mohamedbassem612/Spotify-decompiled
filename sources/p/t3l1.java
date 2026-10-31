package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
@o661
public final class t3l1 extends l4l1 {
    public static final s3l1 Companion = new s3l1();
    public final String b;

    public /* synthetic */ t3l1(int i, String str) {
        if (1 == (i & 1)) {
            this.b = str;
        } else {
            o6p1.t(i, 1, r3l1.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t3l1) && u890.j(this.b, ((t3l1) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
