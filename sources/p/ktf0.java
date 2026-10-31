package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ktf0 implements mtf0 {
    public final int a;

    public ktf0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ktf0) && this.a == ((ktf0) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
