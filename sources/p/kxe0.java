package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class kxe0 implements w11 {
    public final rm8 a;

    public kxe0(rm8 rm8Var) {
        this.a = rm8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kxe0) && this.a.equals(((kxe0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
