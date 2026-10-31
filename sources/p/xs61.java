package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class xs61 {
    public final boolean a;

    public xs61(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xs61) && this.a == ((xs61) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
