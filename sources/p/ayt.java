package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ayt implements gyt {
    public final bxt a;
    public final iwc1 b;

    public ayt(bxt bxtVar, iwc1 iwc1Var) {
        this.a = bxtVar;
        this.b = iwc1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ayt)) {
            return false;
        }
        ayt aytVar = (ayt) obj;
        return u890.j(this.a, aytVar.a) && this.b == aytVar.b;
    }

    public final int hashCode() {
        bxt bxtVar = this.a;
        return this.b.hashCode() + ((bxtVar == null ? 0 : bxtVar.hashCode()) * 31);
    }
}
