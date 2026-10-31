package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class lkb {
    public final boolean a;

    public lkb(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lkb) && this.a == ((lkb) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
