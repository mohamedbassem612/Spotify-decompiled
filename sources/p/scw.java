package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class scw extends xzn1 {
    public final tv80 c;

    public scw(tv80 tv80Var) {
        this.c = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof scw) && u890.j(this.c, ((scw) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
