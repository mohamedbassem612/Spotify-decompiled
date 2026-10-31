package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class a5c1 implements l5c1 {
    public final int a;

    public a5c1(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a5c1) && this.a == ((a5c1) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
