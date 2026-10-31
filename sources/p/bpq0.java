package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class bpq0 extends i541 {
    public final boolean d;

    public bpq0(boolean z) {
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bpq0) && this.d == ((bpq0) obj).d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d);
    }
}
