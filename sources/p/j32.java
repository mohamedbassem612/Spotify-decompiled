package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class j32 implements k32 {
    public final int a;

    public j32(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j32) && this.a == ((j32) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
