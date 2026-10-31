package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class hym1 implements xpw {
    public final lzn0 a;
    public final rey0 b = new rey0(new eom1(this, (byte) 4));
    public final ia00 c = n3o1.q(this).a(yxl1.O0, new zbb1(this, (byte) 17));
    public final psw d;

    public hym1(lzn0 lzn0Var) {
        this.a = lzn0Var;
        j2i j2iVar = new j2i(-1895478700, new fbm1(this, (byte) 2), true);
        ien0 ien0Var = qsw.a;
        this.d = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.c;
    }

    public final jsw c() {
        return this.d;
    }

    public final void e(int i, long j, long j2, String str, b0k b0kVar, qim0 qim0Var) {
        b0k b0kVar2;
        long j3;
        qim0 qim0Var2;
        int i2;
        qim0 qim0Var3;
        long j4;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1363209316);
        int i3 = i | (b0kVar3.g(str) ? 4 : 2) | 176 | (b0kVar3.f(j2) ? 2048 : 1024);
        if (b0kVar3.Y(i3 & 1, (i3 & 1171) != 1170)) {
            b0kVar3.d0();
            if ((i & 1) == 0 || b0kVar3.E()) {
                long j5 = u7h.b;
                i2 = i3 & (-897);
                qim0Var3 = nim0.a;
                j4 = j5;
            } else {
                b0kVar3.b0();
                i2 = i3 & (-897);
                j4 = j;
                qim0Var3 = qim0Var;
            }
            b0kVar3.s();
            uwr uwrVar = cbx.a;
            b0kVar2 = b0kVar3;
            uwo1.e(str, uyn1.y(dug.f(qim0Var3, j2, er31.b(5.0f)), 10.0f, 4.0f), cbx.d(b0kVar3).j, j4, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, b0kVar2, i2 & 14, 0, 1712);
            qim0Var2 = qim0Var3;
            j3 = j4;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            j3 = j;
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new fp30(this, str, qim0Var2, j3, j2, i);
        }
    }

    public final mqw getBehavior() {
        return this.b;
    }
}
