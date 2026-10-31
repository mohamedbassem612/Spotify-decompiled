package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ygh0 extends igh0 {
    public final boolean d;

    public ygh0(boolean z) {
        super(z ? 2131233634 : 2131233632, 2131963293, "TURN_REPEAT_OFF");
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ygh0) && this.d == ((ygh0) obj).d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d);
    }
}
