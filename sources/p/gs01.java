package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class gs01 extends vxo1 {
    public final zu01 c;

    public gs01(zu01 zu01Var) {
        this.c = zu01Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gs01) && this.c.equals(((gs01) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
