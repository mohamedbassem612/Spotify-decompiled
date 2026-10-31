package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class tag0 extends vag0 {
    public final boolean a;

    public tag0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tag0) && this.a == ((tag0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
