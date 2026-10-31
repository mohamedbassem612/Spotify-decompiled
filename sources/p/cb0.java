package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class cb0 implements xpw {
    public final /* synthetic */ byte a;
    public final ynb0 b;
    public final rey0 c;
    public final ia00 d;
    public final psw e;

    public cb0(ynb0 ynb0Var, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = ynb0Var;
                this.c = new rey0(j830.X);
                this.d = n3o1.q(this).a(new kp50(this, (byte) 0), new kp50(this, (byte) 1));
                j2i j2iVar = lri.a;
                ien0 ien0Var = qsw.a;
                this.e = new psw(j2iVar, (byte) 0);
                break;
            case 2:
                this.b = ynb0Var;
                this.c = k1o1.p();
                this.d = n3o1.q(this).a(new bt70(this, (byte) 4), rb80.b);
                j2i j2iVar2 = new j2i(-1145237688, new wv60(this, (byte) 10), true);
                ien0 ien0Var2 = qsw.a;
                this.e = new psw(j2iVar2, (byte) 0);
                break;
            case 3:
                this.b = ynb0Var;
                this.c = k1o1.p();
                this.d = n3o1.q(this).a(new nsb1(this, (byte) 2), vva1.b1);
                j2i j2iVar3 = elj.a;
                ien0 ien0Var3 = qsw.a;
                this.e = new psw(j2iVar3, (byte) 0);
                break;
            case 4:
                this.b = ynb0Var;
                this.c = new rey0(new gkn(this, (byte) 2));
                this.d = n3o1.q(this).a(m1c1.Q0, m1c1.R0);
                j2i j2iVar4 = ylj.b;
                ien0 ien0Var4 = qsw.a;
                this.e = new psw(j2iVar4, (byte) 0);
                break;
            case 5:
                this.b = ynb0Var;
                this.c = new rey0(new bxb1(this, (byte) 23));
                this.d = n3o1.q(this).a(i6d1.b1, i6d1.c1);
                j2i j2iVar5 = anj.b;
                ien0 ien0Var5 = qsw.a;
                this.e = new psw(j2iVar5, (byte) 0);
                break;
            default:
                this.b = ynb0Var;
                this.c = new rey0(o40.c);
                this.d = n3o1.q(this).a(new bb0(this, (byte) 0), new bb0(this, (byte) 1));
                j2i j2iVar6 = e3i.a;
                ien0 ien0Var6 = qsw.a;
                this.e = new psw(j2iVar6, (byte) 0);
                break;
        }
    }

    public final rqw a() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
        }
        return this.d;
    }

    public final jsw c() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
        }
        return this.e;
    }

    public void e(int i, b0k b0kVar, int i2) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1956603842);
        int i3 = (x340Var.e(i) ? 4 : 2) | i2;
        if (x340Var.Y(i3 & 1, (i3 & 3) != 2)) {
            uwr uwrVar = cbx.a;
            float f = cbx.b(x340Var).b.a;
            float f2 = cbx.b(x340Var).b.a;
            cvx cvxVar = cbx.b(x340Var).b;
            uwo1.e(cwl1.o0(x340Var, i), anm1.N("no-devices-error", uyn1.B(nim0.a, f, 0.0f, f2, 8.0f, 2)), cbx.d(x340Var).j, cbx.a(x340Var).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2032);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ug50(this, i, i2, (byte) 1);
        }
    }

    public final mqw getBehavior() {
        byte b = this.a;
        return this.c;
    }
}
