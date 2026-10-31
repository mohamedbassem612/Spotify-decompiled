package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
@o661
public final class yg80 {
    public static final xg80 Companion = new xg80();
    public final String a;

    public /* synthetic */ yg80(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            o6p1.t(i, 1, wg80.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yg80) && u890.j(this.a, ((yg80) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
