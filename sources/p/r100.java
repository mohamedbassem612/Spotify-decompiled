package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class r100 extends o600 {
    public final boolean a;

    public r100(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r100) && this.a == ((r100) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
