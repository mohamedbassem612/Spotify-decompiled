package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class zl01 implements pd51 {
    public final d8r0 a;

    public zl01(d8r0 d8r0Var) {
        this.a = d8r0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zl01) && this.a.equals(((zl01) obj).a);
    }

    @Override // p.pd51
    public final String getId() {
        return "clear";
    }

    public final int hashCode() {
        return this.a.hashCode() - 1357835437;
    }
}
