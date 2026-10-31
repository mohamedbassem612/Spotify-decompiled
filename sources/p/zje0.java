package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class zje0 extends d9p1 {
    public final nhe0 c;

    public zje0(nhe0 nhe0Var) {
        this.c = nhe0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zje0) && u890.j(this.c, ((zje0) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
