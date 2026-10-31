package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class a0m1 implements g0m1 {
    public final int a;

    public a0m1(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a0m1) && this.a == ((a0m1) obj).a;
    }

    public final int hashCode() {
        return l1d.C(this.a);
    }
}
