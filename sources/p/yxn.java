package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class yxn implements ayn {
    public final tn30 a;

    public yxn(tn30 tn30Var) {
        this.a = tn30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yxn) && u890.j(this.a, ((yxn) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
