package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class shc1 {
    public final hr20 a;
    public final hr20 b;
    public final j2i c;

    public shc1(hr20 hr20Var, hr20 hr20Var2, j2i j2iVar) {
        this.a = hr20Var;
        this.b = hr20Var2;
        this.c = j2iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof shc1)) {
            return false;
        }
        shc1 shc1Var = (shc1) obj;
        return this.a == shc1Var.a && this.b == shc1Var.b && this.c == shc1Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
