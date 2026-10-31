package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class tj90 extends ak90 {
    public final int a;
    public final zuc0 b;

    public tj90(int i, zuc0 zuc0Var) {
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
        if (!(obj instanceof tj90)) {
            return false;
        }
        tj90 tj90Var = (tj90) obj;
        return this.a == tj90Var.a && u890.j(this.b, tj90Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
