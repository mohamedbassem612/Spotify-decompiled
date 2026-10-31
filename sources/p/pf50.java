package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class pf50 {
    public final int a;

    public pf50(int i) {
        this.a = i;
        if (i > 0) {
            return;
        }
        tf80.a("Provided count should be larger than zero");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof pf50) {
            return this.a == ((pf50) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return -this.a;
    }
}
