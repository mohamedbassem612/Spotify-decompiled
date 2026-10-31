package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class n8h implements zxb0 {
    public final int a;

    public n8h(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n8h) && this.a == ((n8h) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
