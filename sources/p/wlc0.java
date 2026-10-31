package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@o661
public final class wlc0 {
    public static final vlc0 Companion = new vlc0();
    public final String a;

    public /* synthetic */ wlc0(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            o6p1.t(i, 1, ulc0.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wlc0) && u890.j(this.a, ((wlc0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
