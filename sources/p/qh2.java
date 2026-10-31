package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class qh2 extends sh2 {
    public final jm5 a;

    public qh2(jm5 jm5Var) {
        this.a = jm5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qh2) && this.a.equals(((qh2) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
