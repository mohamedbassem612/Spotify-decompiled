package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class bb80 implements fe5 {
    public final zfv a;
    public final int b;
    public final long c;

    public bb80(zfv zfvVar, int i, long j) {
        this.a = zfvVar;
        this.b = i;
        this.c = j;
        if (zfvVar instanceof pxg1) {
            pxg1 pxg1Var = (pxg1) zfvVar;
            if (pxg1Var.a != 0 || pxg1Var.b != 0) {
                return;
            }
        } else if (zfvVar instanceof zu91) {
            if (((zu91) zfvVar).f() != 0) {
                return;
            }
        } else {
            if (!(zfvVar instanceof yua0)) {
                return;
            }
            yua0 yua0Var = (yua0) zfvVar;
            if (yua0Var.f().c() != 0 || yua0Var.f().b() != 0) {
                return;
            }
        }
        hhg1.n("Animation to be infinitely repeated cannot have a 0-duration");
        throw null;
    }

    @Override // p.fe5
    public final fui1 a(tzg1 tzg1Var) {
        return new kui1(this.a.a(tzg1Var), this.b, this.c);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bb80)) {
            return false;
        }
        bb80 bb80Var = (bb80) obj;
        return bb80Var.a.equals(this.a) && bb80Var.b == this.b && f0o1.h(bb80Var.c, this.c);
    }

    public final int hashCode() {
        return f0o1.l(this.c) + ab80.k(this.b, this.a.hashCode() * 31, 31);
    }
}
