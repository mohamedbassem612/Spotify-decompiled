package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class pxg1 implements zfv {
    public final int a;
    public final int b;
    public final dlv c;

    public pxg1(int i, dlv dlvVar, int i2) {
        this(i, 0, (i2 & 4) != 0 ? mlv.a : dlvVar);
    }

    @Override // p.fe5
    public final fui1 a(tzg1 tzg1Var) {
        return new pyp0(this.a, this.b, this.c);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof pxg1) {
            pxg1 pxg1Var = (pxg1) obj;
            if (pxg1Var.a == this.a && pxg1Var.b == this.b && u890.j(pxg1Var.c, this.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.c.hashCode() + (this.a * 31)) * 31) + this.b;
    }

    public pxg1(int i, int i2, dlv dlvVar) {
        this.a = i;
        this.b = i2;
        this.c = dlvVar;
    }

    @Override // p.zfv, p.fe5
    public final hui1 a(tzg1 tzg1Var) {
        return new pyp0(this.a, this.b, this.c);
    }
}
