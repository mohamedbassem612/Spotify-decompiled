package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class hrh0 implements lrh0 {
    public final boolean a;

    public hrh0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hrh0) && this.a == ((hrh0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
