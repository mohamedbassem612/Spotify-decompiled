package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class dmb {
    public final amb a;
    public final xto b;

    public dmb(amb ambVar, xto xtoVar) {
        this.a = ambVar;
        this.b = xtoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dmb)) {
            return false;
        }
        dmb dmbVar = (dmb) obj;
        return this.a.equals(dmbVar.a) && this.b.equals(dmbVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
