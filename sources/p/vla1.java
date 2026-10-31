package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class vla1 implements yla1 {
    public final iu30 a;

    public vla1(iu30 iu30Var) {
        this.a = iu30Var;
    }

    public final iu30 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vla1) && this.a.equals(((vla1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
