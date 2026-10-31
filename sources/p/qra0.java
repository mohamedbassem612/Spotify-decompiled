package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class qra0 implements sra0 {
    public final boolean a;

    public qra0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qra0) && this.a == ((qra0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
