package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class kbf1 implements ez00 {
    public final dg51 a;

    public kbf1(dg51 dg51Var) {
        this.a = dg51Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kbf1) && this.a.equals(((kbf1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
