package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class swi1 extends vwi1 {
    public final int a;

    public swi1(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof swi1) && this.a == ((swi1) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
