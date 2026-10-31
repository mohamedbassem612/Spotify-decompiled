package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class s630 {
    public final boolean a;

    public s630(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s630) && this.a == ((s630) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
