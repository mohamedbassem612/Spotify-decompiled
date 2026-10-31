package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class dm01 implements pd51 {
    public final d8r0 a;

    public dm01(d8r0 d8r0Var) {
        this.a = d8r0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dm01) && this.a.equals(((dm01) obj).a);
    }

    @Override // p.pd51
    public final String getId() {
        return "heading";
    }

    public final int hashCode() {
        return this.a.hashCode() - 1115143618;
    }
}
