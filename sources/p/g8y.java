package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
@o661
public final class g8y {
    public static final f8y Companion = new f8y();
    public final String a;

    public /* synthetic */ g8y(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            o6p1.t(i, 1, e8y.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g8y) && u890.j(this.a, ((g8y) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
