package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class tc30 implements dbr0 {
    public final int a;

    public tc30(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tc30) && this.a == ((tc30) obj).a;
    }

    public final int hashCode() {
        return l1d.C(this.a);
    }
}
