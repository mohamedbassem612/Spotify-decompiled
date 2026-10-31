package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class aod1 extends dod1 {
    public final hod1 a;

    public aod1(hod1 hod1Var) {
        this.a = hod1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aod1) && u890.j(this.a, ((aod1) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }
}
