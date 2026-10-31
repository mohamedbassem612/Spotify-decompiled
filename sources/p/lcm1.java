package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class lcm1 extends qcm1 {
    public final ucm0 a;

    public lcm1(ucm0 ucm0Var) {
        this.a = ucm0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lcm1) && u890.j(this.a, ((lcm1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
