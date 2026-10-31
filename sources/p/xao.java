package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class xao extends cbo {
    public final ri40 a;

    public xao(ri40 ri40Var) {
        this.a = ri40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xao) && this.a.equals(((xao) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
