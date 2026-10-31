package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ac50 implements fc50 {
    public final boolean a;

    public ac50(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ac50) && this.a == ((ac50) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
