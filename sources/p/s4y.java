package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class s4y implements x4y {
    public final boolean a;

    public s4y(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s4y) && this.a == ((s4y) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
