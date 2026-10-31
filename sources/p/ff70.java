package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@o661
public final class ff70 {
    public static final ef70 Companion = new ef70();
    public final String a;

    public /* synthetic */ ff70(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            o6p1.t(i, 1, df70.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ff70) && u890.j(this.a, ((ff70) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
