package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class c2i1 extends d2i1 {
    public final boolean a;

    public c2i1(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c2i1) && this.a == ((c2i1) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
