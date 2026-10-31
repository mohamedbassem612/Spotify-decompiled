package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class lqu {
    public final int a;

    public lqu(int i, int i2) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lqu) && this.a == ((lqu) obj).a;
    }

    public final int hashCode() {
        return l1d.C(1) + (l1d.C(this.a) * 31);
    }
}
