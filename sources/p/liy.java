package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class liy implements niy {
    public final boolean a;

    public liy(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof liy) && this.a == ((liy) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
