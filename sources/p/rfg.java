package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class rfg {
    public final int a;

    public rfg(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rfg) && this.a == ((rfg) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
