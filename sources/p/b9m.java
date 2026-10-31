package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class b9m {
    public final boolean a;

    public b9m(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b9m) && this.a == ((b9m) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
