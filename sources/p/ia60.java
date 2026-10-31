package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ia60 implements la60 {
    public final String a;
    public final za60 b;
    public final da60 c;

    public ia60(String str, za60 za60Var, da60 da60Var) {
        this.a = str;
        this.b = za60Var;
        this.c = da60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ia60)) {
            return false;
        }
        ia60 ia60Var = (ia60) obj;
        return this.a.equals(ia60Var.a) && this.b.equals(ia60Var.b) && this.c.equals(ia60Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
