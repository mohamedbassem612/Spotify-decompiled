package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class q8h1 {
    public final bbl0 a;
    public final i8h1 b;

    public q8h1(bbl0 bbl0Var, i8h1 i8h1Var) {
        this.a = bbl0Var;
        this.b = i8h1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    public final tv80 a(ejo1 ejo1Var) {
        w7h1 w7h1VarA;
        boolean z = ejo1Var instanceof xmo0;
        bbl0 bbl0Var = this.a;
        if (z) {
            xmo0 xmo0Var = (xmo0) ejo1Var;
            tal0 tal0Var = new tal0(bbl0Var, xmo0Var.x(), (byte) 1);
            int iC = l1d.C(xmo0Var.y());
            if (iC == 3) {
                w7h1VarA = tal0Var.k().e();
            } else if (iC != 4) {
                w7h1VarA = null;
            } else {
                w7h1VarA = tal0Var.l().e();
            }
        } else if (ejo1Var instanceof zmo0) {
            zmo0 zmo0Var = (zmo0) ejo1Var;
            tal0 tal0Var2 = new tal0(bbl0Var, zmo0Var.x(), (byte) 3);
            int iC2 = l1d.C(zmo0Var.y());
            if (iC2 == 3) {
                w7h1VarA = tal0Var2.i().e();
            } else if (iC2 != 4) {
                w7h1VarA = null;
            } else {
                w7h1VarA = tal0Var2.n().e();
            }
        } else if (ejo1Var instanceof ymo0) {
            ymo0 ymo0Var = (ymo0) ejo1Var;
            tal0 tal0Var3 = new tal0(bbl0Var, ymo0Var.x(), (byte) 2);
            int iC3 = l1d.C(ymo0Var.y());
            if (iC3 == 3) {
                w7h1VarA = tal0Var3.h().e();
            } else if (iC3 != 4) {
                w7h1VarA = null;
            } else {
                w7h1VarA = tal0Var3.m().e();
            }
        } else if (ejo1Var instanceof bno0) {
            bno0 bno0Var = (bno0) ejo1Var;
            tal0 tal0Var4 = new tal0(bbl0Var, bno0Var.x(), (byte) 4);
            int iC4 = l1d.C(bno0Var.y());
            if (iC4 == 3) {
                w7h1VarA = tal0Var4.j().e();
            } else if (iC4 != 4) {
                w7h1VarA = null;
            } else {
                w7h1VarA = tal0Var4.o().e();
            }
        } else {
            if (!(ejo1Var instanceof ano0)) {
                eg.o();
                return null;
            }
            w7h1VarA = new tal0(bbl0Var).a(nik1.w1.a);
        }
        if (w7h1VarA != null) {
            return this.b.m(w7h1VarA, null);
        }
        return null;
    }
}
