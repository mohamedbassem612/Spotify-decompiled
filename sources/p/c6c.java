package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
@o661
public final class c6c {
    public static final b6c Companion = new b6c();
    public final tpt a;

    public /* synthetic */ c6c(int i, tpt tptVar) {
        if (1 == (i & 1)) {
            this.a = tptVar;
        } else {
            o6p1.t(i, 1, a6c.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c6c) && u890.j(this.a, ((c6c) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
