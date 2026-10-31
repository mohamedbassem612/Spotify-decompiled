package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ioi0 {
    public final vni0 a;

    public ioi0(vni0 vni0Var) {
        this.a = vni0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ioi0) && u890.j(this.a, ((ioi0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
