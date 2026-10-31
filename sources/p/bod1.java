package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class bod1 extends dod1 {
    public final hod1 a;

    public bod1(hod1 hod1Var) {
        this.a = hod1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bod1) && u890.j(this.a, ((bod1) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }
}
