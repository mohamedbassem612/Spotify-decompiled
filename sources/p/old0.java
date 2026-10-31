package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class old0 implements pld0 {
    public final boolean a;

    public old0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof old0) && this.a == ((old0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
