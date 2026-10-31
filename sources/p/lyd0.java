package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class lyd0 implements azd0 {
    public final boolean a;

    public lyd0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lyd0) && this.a == ((lyd0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
