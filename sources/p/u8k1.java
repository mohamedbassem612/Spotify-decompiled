package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class u8k1 extends d7p1 {
    public final tv80 c;

    public u8k1(tv80 tv80Var) {
        this.c = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u8k1) && this.c.equals(((u8k1) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
