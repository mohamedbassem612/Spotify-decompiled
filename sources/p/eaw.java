package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class eaw {
    public final tv80 a;

    public eaw(tv80 tv80Var) {
        this.a = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eaw) && u890.j(this.a, ((eaw) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
