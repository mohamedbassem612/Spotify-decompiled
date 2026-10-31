package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class lod0 extends mod0 {
    public final boolean a;

    public lod0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lod0) && this.a == ((lod0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
