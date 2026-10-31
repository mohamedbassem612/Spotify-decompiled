package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ot10 implements st10 {
    public final uv10 a;

    public ot10(uv10 uv10Var) {
        this.a = uv10Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ot10) && this.a.equals(((ot10) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
