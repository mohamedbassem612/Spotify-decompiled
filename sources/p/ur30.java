package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ur30 {
    public final boolean a;

    public ur30(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ur30) && this.a == ((ur30) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
