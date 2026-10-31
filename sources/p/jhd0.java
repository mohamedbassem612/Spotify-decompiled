package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class jhd0 {
    public final boolean a;

    public jhd0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jhd0) && this.a == ((jhd0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
