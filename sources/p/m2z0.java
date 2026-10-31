package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class m2z0 implements o2z0 {
    public final int a;

    public m2z0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m2z0) && this.a == ((m2z0) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
