package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
@o661
public final class c2b {
    public static final a2b Companion = new a2b();
    public final String a;

    public /* synthetic */ c2b(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            o6p1.t(i, 1, y1b.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c2b) && u890.j(this.a, ((c2b) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public c2b(String str) {
        this.a = str;
    }
}
