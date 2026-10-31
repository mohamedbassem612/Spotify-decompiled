package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class qqo implements tqo {
    public final iu30 b;
    public final vu30 c;

    public qqo(iu30 iu30Var, vu30 vu30Var) {
        this.b = iu30Var;
        this.c = vu30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qqo)) {
            return false;
        }
        qqo qqoVar = (qqo) obj;
        return this.b.equals(qqoVar.b) && this.c.equals(qqoVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }
}
