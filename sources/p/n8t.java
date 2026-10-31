package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@o661
public final class n8t {
    public static final m8t Companion = new m8t();
    public final String a;

    public /* synthetic */ n8t(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            o6p1.t(i, 1, l8t.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n8t) && u890.j(this.a, ((n8t) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
