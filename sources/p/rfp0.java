package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class rfp0 {
    public final Float a;
    public final long b;

    public rfp0(Float f, long j) {
        this.a = f;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rfp0)) {
            return false;
        }
        rfp0 rfp0Var = (rfp0) obj;
        return u890.j(this.a, rfp0Var.a) && this.b == rfp0Var.b;
    }

    public final int hashCode() {
        Float f = this.a;
        return Long.hashCode(this.b) + ((f == null ? 0 : f.hashCode()) * 31);
    }
}
