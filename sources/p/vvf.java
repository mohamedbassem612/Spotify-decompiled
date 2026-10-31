package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
@o661
public final class vvf {
    public static final uvf Companion = new uvf();
    public final String a;

    public /* synthetic */ vvf(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            o6p1.t(i, 1, tvf.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vvf) && u890.j(this.a, ((vvf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
