package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class dbc1 extends ebc1 {
    public final egi1 a;

    public dbc1(egi1 egi1Var) {
        this.a = egi1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dbc1) && this.a.equals(((dbc1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
