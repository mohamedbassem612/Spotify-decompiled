package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class slr0 {
    public final boolean a;

    public slr0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof slr0) && this.a == ((slr0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + xcg1.g(Boolean.hashCode(true) * 31, 31, this.a);
    }
}
