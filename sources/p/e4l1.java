package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
@o661
public final class e4l1 extends l4l1 {
    public static final d4l1 Companion = new d4l1();
    public final String b;

    public /* synthetic */ e4l1(int i, String str) {
        if (1 == (i & 1)) {
            this.b = str;
        } else {
            o6p1.t(i, 1, c4l1.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e4l1) && u890.j(this.b, ((e4l1) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
