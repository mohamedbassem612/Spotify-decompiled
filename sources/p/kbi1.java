package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@o661
public final class kbi1 implements obi1 {
    public static final jbi1 Companion = new jbi1();
    public final String a;

    public /* synthetic */ kbi1(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            o6p1.t(i, 1, ibi1.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kbi1) && u890.j(this.a, ((kbi1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
