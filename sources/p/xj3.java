package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class xj3 implements zj3 {
    public final int a;

    public xj3(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xj3) && this.a == ((xj3) obj).a;
    }

    public final int hashCode() {
        return l1d.C(this.a);
    }
}
