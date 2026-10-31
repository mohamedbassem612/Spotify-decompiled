package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ysa extends cbp1 {
    public final j331 c;

    public ysa(j331 j331Var) {
        this.c = j331Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ysa) && this.c.equals(((ysa) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
