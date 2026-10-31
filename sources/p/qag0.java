package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class qag0 extends vag0 {
    public final boolean a;

    public qag0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qag0) && this.a == ((qag0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
