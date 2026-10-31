package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
@o661
public final class vea0 {
    public static final uea0 Companion = new uea0();
    public final String a;

    public /* synthetic */ vea0(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            o6p1.t(i, 1, tea0.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vea0) && u890.j(this.a, ((vea0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
