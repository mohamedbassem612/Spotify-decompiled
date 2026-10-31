package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class wmg0 extends ymg0 {
    public final int a;

    public wmg0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wmg0) && this.a == ((wmg0) obj).a;
    }

    public final int hashCode() {
        return l1d.C(this.a);
    }
}
