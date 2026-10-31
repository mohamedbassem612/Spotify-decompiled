package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
@o661
public final class bj61 {
    public static final aj61 Companion = new aj61();
    public final String a;

    public /* synthetic */ bj61(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            o6p1.t(i, 1, zi61.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bj61) && u890.j(this.a, ((bj61) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
