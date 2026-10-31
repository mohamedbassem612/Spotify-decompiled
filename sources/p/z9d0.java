package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class z9d0 implements aad0 {
    public final int a;

    public z9d0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z9d0) && this.a == ((z9d0) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
