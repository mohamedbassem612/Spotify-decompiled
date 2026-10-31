package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class xjj0 implements tyq {
    public final psw Y;
    public final d0r a;
    public final String b;
    public final boolean c;
    public final dq4 d;
    public final pop e;
    public final lmq f;
    public final idd1 g = new idd1(new wjj0(this, (byte) 0));
    public final idd1 h = new idd1(new wjj0(this, (byte) 1));
    public final km1 i = new km1(this, (byte) 27);
    public final rey0 t = k1o1.p();
    public final eih1 X = new eih1();

    public xjj0(d0r d0rVar, String str, boolean z, dq4 dq4Var, pop popVar, lmq lmqVar) {
        this.a = d0rVar;
        this.b = str;
        this.c = z;
        this.d = dq4Var;
        this.e = popVar;
        this.f = lmqVar;
        j2i j2iVar = new j2i(1026648165, new y3i0(this, (byte) 15), true);
        ien0 ien0Var = qsw.a;
        this.Y = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.X;
    }

    public final jsw c() {
        return this.Y;
    }

    public final d0r e() {
        return this.a;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x005b  */
    /* JADX WARN: Code duplicated, block: B:34:0x005d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0066 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x0068  */
    /* JADX WARN: Code duplicated, block: B:39:0x006a  */
    /* JADX WARN: Code duplicated, block: B:41:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:46:? A[RETURN, SYNTHETIC] */
    public final void f(hux huxVar, String str, boolean z, b0k b0kVar, int i, int i2) {
        int i3;
        boolean z2;
        boolean z3;
        boolean z4;
        h311 h311VarV;
        boolean z5;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1221391345);
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
                w0h1.a(huxVar, isl.a, anm1.N(str, u291.r(uyn1.B(nim0.a, 0.0f, 0.0f, 8.0f, 0.0f, 11), 14.0f)), j, 0L, z5, x340Var, (i3 & 14) | 56 | ((i3 << 9) & 458752), 16);
                z4 = z5;
            } else {
                x340Var.b0();
                z4 = z2;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new ilf(this, huxVar, str, z4, i, i2, (byte) 5);
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
            cvx cvxVar2 = cbx.b(x340Var).b;
            w0h1.a(huxVar, isl.a, anm1.N(str, u291.r(uyn1.B(nim0.a, 0.0f, 0.0f, 8.0f, 0.0f, 11), 14.0f)), j2, 0L, z5, x340Var, (i3 & 14) | 56 | ((i3 << 9) & 458752), 16);
            z4 = z5;
        } else {
            x340Var.b0();
            z4 = z2;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ilf(this, huxVar, str, z4, i, i2, (byte) 5);
        }
    }

    public final mqw getBehavior() {
        return this.t;
    }

    public final f4r getData() {
        return this.i;
    }
}
