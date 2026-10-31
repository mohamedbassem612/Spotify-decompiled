package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class lra0 implements sra0 {
    public final boolean a;

    public lra0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lra0) && this.a == ((lra0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
