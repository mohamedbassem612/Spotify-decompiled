package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class n761 {
    public final uv11 a;

    public n761(uv11 uv11Var) {
        this.a = uv11Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n761) && this.a.equals(((n761) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
