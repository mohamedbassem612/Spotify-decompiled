package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class sj90 extends ak90 {
    public final int a;
    public final zuc0 b;

    public sj90(int i, zuc0 zuc0Var) {
        this.a = i;
        this.b = zuc0Var;
    }

    @Override // p.ak90
    public final zuc0 a() {
        return this.b;
    }

    @Override // p.ak90
    public final int b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sj90)) {
            return false;
        }
        sj90 sj90Var = (sj90) obj;
        return this.a == sj90Var.a && this.b.equals(sj90Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
