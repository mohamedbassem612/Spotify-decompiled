package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class xcm1 {
    public final cdm1 a;

    public xcm1(cdm1 cdm1Var) {
        this.a = cdm1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xcm1) && u890.j(this.a, ((xcm1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
