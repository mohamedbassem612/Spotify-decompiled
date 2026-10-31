package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class kl8 extends nl8 {
    public final di8 a;

    public kl8(di8 di8Var) {
        this.a = di8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kl8) && u890.j(this.a, ((kl8) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
