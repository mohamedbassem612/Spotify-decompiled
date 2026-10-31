package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ame0 extends gme0 {
    public final nhe0 a;

    public ame0(nhe0 nhe0Var) {
        this.a = nhe0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ame0) && u890.j(this.a, ((ame0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
