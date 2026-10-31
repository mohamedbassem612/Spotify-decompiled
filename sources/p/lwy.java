package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class lwy extends swy {
    public final boolean a;

    public lwy(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lwy) && this.a == ((lwy) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
