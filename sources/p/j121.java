package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class j121 implements q121 {
    public final int a;
    public final m0u b;
    public final px31 c;

    public j121(int i, m0u m0uVar, px31 px31Var) {
        this.a = i;
        this.b = m0uVar;
        this.c = px31Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j121)) {
            return false;
        }
        j121 j121Var = (j121) obj;
        return this.a == j121Var.a && u890.j(this.b, j121Var.b) && u890.j(this.c, j121Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31);
    }
}
