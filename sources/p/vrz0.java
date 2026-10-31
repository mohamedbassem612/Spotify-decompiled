package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class vrz0 {
    public final int a;

    public vrz0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vrz0) && this.a == ((vrz0) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
