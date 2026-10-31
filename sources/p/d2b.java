package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
@o661
public final class d2b {
    public static final b2b Companion = new b2b();
    public final String a;

    public /* synthetic */ d2b(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            o6p1.t(i, 1, z1b.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d2b) && u890.j(this.a, ((d2b) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public d2b(String str) {
        this.a = str;
    }
}
