package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class xza0 implements zza0 {
    public final ai8 a;

    public xza0(ai8 ai8Var) {
        this.a = ai8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xza0) && u890.j(this.a, ((xza0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
