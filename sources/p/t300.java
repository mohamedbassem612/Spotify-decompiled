package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class t300 implements t600 {
    public final boolean a;

    public t300(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t300) && this.a == ((t300) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
