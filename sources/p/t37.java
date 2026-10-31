package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class t37 {
    public final boolean a;

    public t37(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t37) && this.a == ((t37) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
