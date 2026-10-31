package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class r15 {
    public final boolean a;

    public r15(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r15) && this.a == ((r15) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
