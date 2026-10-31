package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class cau extends gau {
    public final boolean a;

    public cau(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cau) && this.a == ((cau) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
