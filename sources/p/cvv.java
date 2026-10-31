package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class cvv implements evv {
    public final boolean a;

    public cvv(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cvv) && this.a == ((cvv) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
