package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class pc71 extends rc71 {
    public final int a;

    public pc71(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pc71) && this.a == ((pc71) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
