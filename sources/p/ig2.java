package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ig2 implements sg2 {
    public final boolean a;

    public ig2(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ig2) && this.a == ((ig2) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
