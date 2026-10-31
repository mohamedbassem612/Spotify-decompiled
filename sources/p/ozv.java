package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ozv extends l0w {
    public final boolean a;

    public ozv(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ozv) && this.a == ((ozv) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
