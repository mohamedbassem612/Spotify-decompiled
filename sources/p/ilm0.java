package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ilm0 extends klm0 {
    public final tv80 a;

    public ilm0(tv80 tv80Var) {
        this.a = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ilm0) && u890.j(this.a, ((ilm0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
