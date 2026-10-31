package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class uxi0 extends vxi0 {
    public final c561 a;

    public uxi0(c561 c561Var) {
        this.a = c561Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uxi0) && this.a.equals(((uxi0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
