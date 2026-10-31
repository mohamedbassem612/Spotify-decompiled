package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class eu31 {
    public final int a;
    public final c380 b;

    public eu31(int i, c380 c380Var) {
        this.a = i;
        this.b = c380Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eu31)) {
            return false;
        }
        eu31 eu31Var = (eu31) obj;
        return this.a == eu31Var.a && u890.j(this.b, eu31Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
