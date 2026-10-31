package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class s9z implements l0i {
    public final boolean a;

    public s9z(int i, boolean z) {
        this.a = (i & 2) != 0 ? true : z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s9z) && this.a == ((s9z) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a) + (Boolean.hashCode(true) * 31);
    }
}
