package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class zao extends cbo {
    public final e381 a;

    public zao(e381 e381Var) {
        this.a = e381Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zao) && this.a.equals(((zao) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
