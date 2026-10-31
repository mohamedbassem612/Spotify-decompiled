package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
@o661
public final class m3l1 extends l4l1 {
    public static final l3l1 Companion = new l3l1();
    public final jdm0 b;

    public /* synthetic */ m3l1(int i, jdm0 jdm0Var) {
        if (1 == (i & 1)) {
            this.b = jdm0Var;
        } else {
            o6p1.t(i, 1, k3l1.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m3l1) && u890.j(this.b, ((m3l1) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
