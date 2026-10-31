package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ryg0 implements syg0 {
    public final lpk1 a;

    public ryg0(lpk1 lpk1Var) {
        this.a = lpk1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ryg0) && this.a.equals(((ryg0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
