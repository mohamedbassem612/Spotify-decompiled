package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class aoe {
    public final int a;
    public final tne b;

    public aoe(int i, tne tneVar) {
        this.a = i;
        this.b = tneVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aoe)) {
            return false;
        }
        aoe aoeVar = (aoe) obj;
        return this.a == aoeVar.a && this.b == aoeVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
