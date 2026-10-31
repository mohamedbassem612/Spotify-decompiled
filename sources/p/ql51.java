package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
@o661
public final class ql51 {
    public static final pl51 Companion = new pl51();
    public final String a;

    public /* synthetic */ ql51(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            o6p1.t(i, 1, ol51.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ql51) && u890.j(this.a, ((ql51) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
