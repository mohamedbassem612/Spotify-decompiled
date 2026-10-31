package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class e49 extends c0p1 {
    public final le20 c;

    public e49(le20 le20Var) {
        this.c = le20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e49) && this.c.equals(((e49) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
