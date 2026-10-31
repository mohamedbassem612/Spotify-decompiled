package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@o661
public final class zkg {
    public static final ykg Companion = new ykg();
    public final boolean a;

    public /* synthetic */ zkg(int i, boolean z) {
        if (1 == (i & 1)) {
            this.a = z;
        } else {
            o6p1.t(i, 1, xkg.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zkg) && this.a == ((zkg) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public zkg(boolean z) {
        this.a = z;
    }
}
