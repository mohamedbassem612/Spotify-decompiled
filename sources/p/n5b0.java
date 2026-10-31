package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class n5b0 implements dbr0 {
    public final ukj0 a;

    public n5b0(ukj0 ukj0Var) {
        this.a = ukj0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n5b0) && this.a == ((n5b0) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
