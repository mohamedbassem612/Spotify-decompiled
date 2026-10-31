package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class hnd1 extends knd1 {
    public final int a;

    public hnd1(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hnd1) && this.a == ((hnd1) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
