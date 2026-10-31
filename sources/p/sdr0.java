package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class sdr0 extends prn1 {
    public final int b;

    public sdr0(int i) {
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sdr0) && this.b == ((sdr0) obj).b;
    }

    public final int hashCode() {
        return l1d.C(this.b);
    }
}
