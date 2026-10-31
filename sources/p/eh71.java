package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class eh71 extends u1p1 {
    public final zg71 c;

    public eh71(zg71 zg71Var) {
        this.c = zg71Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eh71) && this.c.equals(((eh71) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
