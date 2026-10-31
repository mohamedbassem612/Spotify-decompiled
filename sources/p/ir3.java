package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ir3 implements kr3 {
    public final boolean a;

    public ir3(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ir3) && this.a == ((ir3) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
