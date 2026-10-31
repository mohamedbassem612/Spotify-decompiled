package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class fuk {
    public final Object a;
    public final long b;

    public fuk(long j, Object obj) {
        this.a = obj;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fuk)) {
            return false;
        }
        fuk fukVar = (fuk) obj;
        return u890.j(this.a, fukVar.a) && this.b == fukVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (e331.b(this.a) * 31);
    }
}
