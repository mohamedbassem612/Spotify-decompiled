package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ksa1 implements dta1 {
    public final int a;

    public ksa1(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ksa1) && this.a == ((ksa1) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
