package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class sp61 implements bq61 {
    public final int a;

    public sp61(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sp61) && this.a == ((sp61) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
