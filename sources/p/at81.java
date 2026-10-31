package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class at81 implements kt81 {
    public final boolean a;

    public at81(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof at81) && this.a == ((at81) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
