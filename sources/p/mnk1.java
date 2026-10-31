package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class mnk1 {
    public final boolean a;

    public mnk1(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mnk1) && this.a == ((mnk1) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
