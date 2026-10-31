package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@o661
public final class oji1 {
    public static final nji1 Companion = new nji1();
    public final String a;

    public /* synthetic */ oji1(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            o6p1.t(i, 1, mji1.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oji1) && u890.j(this.a, ((oji1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public oji1(String str) {
        this.a = str;
    }
}
