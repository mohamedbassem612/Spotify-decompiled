package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class vu11 {
    public final int a;
    public final ads b;
    public final xu30 c;

    public vu11(int i, ads adsVar, xu30 xu30Var) {
        this.a = i;
        this.b = adsVar;
        this.c = xu30Var;
    }

    public final int a() {
        return this.a;
    }

    public final xu30 b() {
        return this.c;
    }

    public final ads c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vu11)) {
            return false;
        }
        vu11 vu11Var = (vu11) obj;
        return this.a == vu11Var.a && u890.j(this.b, vu11Var.b) && this.c.equals(vu11Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31);
    }
}
