package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@o661
public final class p0z {
    public static final o0z Companion = new o0z();
    public final m0z a;

    public /* synthetic */ p0z(int i, m0z m0zVar) {
        if (1 == (i & 1)) {
            this.a = m0zVar;
        } else {
            o6p1.t(i, 1, n0z.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p0z) && u890.j(this.a, ((p0z) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
