package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class b991 {
    public final boolean a;

    public b991(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b991) && this.a == ((b991) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
