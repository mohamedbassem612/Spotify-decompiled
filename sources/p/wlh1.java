package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
@o661
public final class wlh1 {
    public static final vlh1 Companion = new vlh1();
    public final String a;

    public /* synthetic */ wlh1(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            o6p1.t(i, 1, ulh1.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wlh1) && u890.j(this.a, ((wlh1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public wlh1(String str) {
        this.a = str;
    }
}
