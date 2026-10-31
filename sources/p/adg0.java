package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class adg0 extends fdg0 {
    public final boolean a;

    public adg0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof adg0) && this.a == ((adg0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
