package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ra51 extends jch0 {
    public final int d;

    public ra51(int i) {
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ra51) && this.d == ((ra51) obj).d;
    }

    public final int hashCode() {
        return l1d.C(this.d);
    }

    public final int l0() {
        return this.d;
    }
}
