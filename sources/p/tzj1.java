package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class tzj1 {
    public final boolean a;

    public tzj1(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tzj1) && this.a == ((tzj1) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
