package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class o73 {
    public final boolean a;
    public final c221 b;
    public final qrg1 c;

    public o73(boolean z, c221 c221Var, qrg1 qrg1Var) {
        this.a = z;
        this.b = c221Var;
        this.c = qrg1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o73)) {
            return false;
        }
        o73 o73Var = (o73) obj;
        return this.a == o73Var.a && u890.j(this.b, o73Var.b) && u890.j(this.c, o73Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31);
    }
}
