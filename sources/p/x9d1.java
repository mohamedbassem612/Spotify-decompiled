package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class x9d1 implements tj0 {
    public final int a;

    public x9d1(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x9d1) && this.a == ((x9d1) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
