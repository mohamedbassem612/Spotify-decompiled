package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class qt51 {
    public final int a;

    public qt51(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qt51) && this.a == ((qt51) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
