package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class rfw implements oiw {
    public final boolean a;

    public rfw(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rfw) && this.a == ((rfw) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
