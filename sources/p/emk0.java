package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class emk0 {
    public final int a;

    public emk0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof emk0) && this.a == ((emk0) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
