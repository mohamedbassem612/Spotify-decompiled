package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class z15 {
    public final boolean a;

    public z15(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z15) && this.a == ((z15) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
