package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class itq0 extends z1a1 {
    public final n511 c;

    public itq0(n511 n511Var) {
        this.c = n511Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof itq0) {
            return this.c.equals(((itq0) obj).c);
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final n511 j() {
        return this.c;
    }
}
