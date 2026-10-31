package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class u24 extends nb51 {
    public final int b;

    public u24(int i) {
        this.b = i;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof u24) && ((u24) obj).b == this.b;
    }

    public final int hashCode() {
        return this.b * 31;
    }
}
