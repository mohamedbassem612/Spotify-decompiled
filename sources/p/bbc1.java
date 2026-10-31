package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class bbc1 extends ebc1 {
    public final int a;

    public bbc1(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bbc1) && this.a == ((bbc1) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
