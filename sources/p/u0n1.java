package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class u0n1 extends ern1 {
    public final ms21 c;

    public u0n1(ms21 ms21Var) {
        this.c = ms21Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u0n1) && this.c.equals(((u0n1) obj).c);
    }

    public final int hashCode() {
        return this.c.a.hashCode();
    }
}
