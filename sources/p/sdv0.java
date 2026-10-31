package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class sdv0 implements xpw {
    public final /* synthetic */ byte a;
    public final boolean b;
    public final rey0 c;
    public final Object d;
    public final psw e;

    public sdv0(byte b, boolean z) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = z;
                this.c = k1o1.p();
                this.d = new eih1();
                j2i j2iVar = new j2i(-173314157, new vsb1(this, (byte) 9), true);
                ien0 ien0Var = qsw.a;
                this.e = new psw(j2iVar, (byte) 0);
                break;
            default:
                this.b = z;
                this.d = new eih1();
                this.c = new rey0(mgn0.S0);
                j2i j2iVar2 = new j2i(1706485008, new qsu0(this, (byte) 3), true);
                ien0 ien0Var2 = qsw.a;
                this.e = new psw(j2iVar2, (byte) 0);
                break;
        }
    }

    public final rqw a() {
        byte b = this.a;
        Object obj = this.d;
        switch (b) {
            case 0:
                return (eih1) obj;
            case 1:
                return (eih1) obj;
            default:
                return new eih1();
        }
    }

    public final jsw c() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.e;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x005b  */
    /* JADX WARN: Code duplicated, block: B:34:0x005d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0066 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x0068  */
    /* JADX WARN: Code duplicated, block: B:39:0x006a  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:46:? A[RETURN, SYNTHETIC] */
    public void e(hux huxVar, String str, boolean z, b0k b0kVar, int i, int i2) {
        int i3;
        boolean z2;
        boolean z3;
        boolean z4;
        h311 h311VarV;
        boolean z5;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1227692063);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? x340Var.g(huxVar) : x340Var.i(huxVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= x340Var.g(str) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                z2 = z;
                i3 |= x340Var.h(z2) ? 256 : 128;
            }
            if ((i3 & 147) != 146) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (x340Var.Y(i3 & 1, z3)) {
                if (i4 != 0) {
                    z5 = false;
                } else {
                    z5 = z2;
                }
                uwr uwrVar = cbx.a;
                long j = cbx.a(x340Var).b.b;
                cvx cvxVar = cbx.b(x340Var).b;
                qim0 qim0VarB = uyn1.B(nim0.a, 0.0f, 0.0f, 8.0f, 0.0f, 11);
                cvx cvxVar2 = cbx.b(x340Var).b;
                w0h1.a(huxVar, isl.a, anm1.N(str, u291.r(qim0VarB, 12.0f)), j, 0L, z5, x340Var, (i3 & 14) | 56 | ((i3 << 9) & 458752), 16);
                z4 = z5;
            } else {
                x340Var.b0();
                z4 = z2;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new ilf(this, huxVar, str, z4, i, i2, (byte) 6);
            }
        }
        i3 |= 384;
        z2 = z;
        if ((i3 & 147) != 146) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (x340Var.Y(i3 & 1, z3)) {
            if (i4 != 0) {
                z5 = false;
            } else {
                z5 = z2;
            }
            uwr uwrVar2 = cbx.a;
            long j2 = cbx.a(x340Var).b.b;
            cvx cvxVar3 = cbx.b(x340Var).b;
            qim0 qim0VarB2 = uyn1.B(nim0.a, 0.0f, 0.0f, 8.0f, 0.0f, 11);
            cvx cvxVar4 = cbx.b(x340Var).b;
            w0h1.a(huxVar, isl.a, anm1.N(str, u291.r(qim0VarB2, 12.0f)), j2, 0L, z5, x340Var, (i3 & 14) | 56 | ((i3 << 9) & 458752), 16);
            z4 = z5;
        } else {
            x340Var.b0();
            z4 = z2;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ilf(this, huxVar, str, z4, i, i2, (byte) 6);
        }
    }

    public final mqw getBehavior() {
        byte b = this.a;
        return this.c;
    }

    public sdv0(boolean z, nsq nsqVar) {
        this.a = (byte) 2;
        this.b = z;
        this.d = nsqVar;
        this.c = k1o1.p();
        j2i j2iVar = new j2i(-1917659674, new vsb1(this, (byte) 0), true);
        ien0 ien0Var = qsw.a;
        this.e = new psw(j2iVar, (byte) 0);
    }
}
