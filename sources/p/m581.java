package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class m581 {
    public final x581 a;

    public m581(x581 x581Var) {
        this.a = x581Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m581) && this.a.equals(((m581) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
