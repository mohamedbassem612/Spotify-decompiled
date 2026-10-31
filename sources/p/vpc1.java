package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class vpc1 {
    public final int a;

    public vpc1(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vpc1) && this.a == ((vpc1) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
