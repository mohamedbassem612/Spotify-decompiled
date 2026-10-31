package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class j4r extends c4p1 {
    public final iu30 c;

    public j4r(iu30 iu30Var) {
        this.c = iu30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j4r) && u890.j(this.c, ((j4r) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
