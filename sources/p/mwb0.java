package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class mwb0 implements pwb0 {
    public final lwb0 a;

    public mwb0(lwb0 lwb0Var) {
        this.a = lwb0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mwb0) && this.a.equals(((mwb0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
