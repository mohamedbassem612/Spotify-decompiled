package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class cpp0 implements epp0 {
    public final l820 a;

    public cpp0(l820 l820Var) {
        this.a = l820Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cpp0) && this.a.equals(((cpp0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
