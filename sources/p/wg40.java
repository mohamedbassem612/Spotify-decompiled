package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
@o661
public final class wg40 {
    public static final vg40 Companion = new vg40();
    public final String a;

    public /* synthetic */ wg40(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            o6p1.t(i, 1, ug40.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wg40) && u890.j(this.a, ((wg40) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public wg40(String str) {
        this.a = str;
    }
}
