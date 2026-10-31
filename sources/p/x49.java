package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class x49 extends c59 {
    public final bc20 a;

    public x49(bc20 bc20Var) {
        this.a = bc20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x49) && this.a.equals(((x49) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
