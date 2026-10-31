package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class hee0 implements jee0 {
    public final tqw a;

    public hee0(tqw tqwVar) {
        this.a = tqwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hee0) && u890.j(this.a, ((hee0) obj).a);
    }

    public final int hashCode() {
        tqw tqwVar = this.a;
        if (tqwVar == null) {
            return 0;
        }
        return tqwVar.hashCode();
    }
}
