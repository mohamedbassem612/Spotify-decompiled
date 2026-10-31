package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class mmi1 implements xmi1 {
    public final m4o0 a;

    public mmi1(m4o0 m4o0Var) {
        this.a = m4o0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mmi1) && u890.j(this.a, ((mmi1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
