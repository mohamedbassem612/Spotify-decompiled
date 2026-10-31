package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@o661
public final class nbi1 implements obi1 {
    public static final mbi1 Companion = new mbi1();
    public final String a;

    public /* synthetic */ nbi1(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            o6p1.t(i, 1, lbi1.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nbi1) && u890.j(this.a, ((nbi1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
