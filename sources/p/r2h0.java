package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class r2h0 implements e4h0 {
    public final boolean a;

    public r2h0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r2h0) && this.a == ((r2h0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
