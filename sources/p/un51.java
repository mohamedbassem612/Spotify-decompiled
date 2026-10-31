package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class un51 {
    public final int a;

    public un51(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof un51) && this.a == ((un51) obj).a;
    }

    public final int hashCode() {
        return l1d.C(this.a);
    }
}
