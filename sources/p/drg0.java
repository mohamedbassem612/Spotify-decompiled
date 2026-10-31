package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class drg0 extends ozn1 {
    public final vzn1 c;

    public drg0(vzn1 vzn1Var) {
        this.c = vzn1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof drg0) && this.c.equals(((drg0) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
