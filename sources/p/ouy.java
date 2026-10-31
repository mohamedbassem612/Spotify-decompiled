package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ouy implements h0r0 {
    public final lik1 a;
    public final ruy b;
    public final hvj c;
    public final buy d;
    public final lzn0 e;
    public final ynb0 f;
    public final cbr0 g;

    /* JADX WARN: Multi-variable type inference failed */
    public ouy(hvj hvjVar, buy buyVar, ruy ruyVar, e5b0 e5b0Var, ynb0 ynb0Var, lzn0 lzn0Var, lik1 lik1Var) {
        this.a = lik1Var;
        this.b = ruyVar;
        this.c = hvjVar;
        this.d = buyVar;
        this.e = lzn0Var;
        this.f = ynb0Var;
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.g = new cbr0(new dbr0[]{new bn70(yon1.u1(), lik1Var, (nar0) null), new s9h1(14, true, false, false), e5b0Var}, false);
    }

    public final cbr0 a() {
        return this.g;
    }

    public final p2r0 b() {
        return this.c.a(f4p1.g(this.d), apo.j(1723118953, new luy(this, (byte) 1), true), mth1.w());
    }

    public final void c(int i, String str, String str2, b0k b0kVar, c380 c380Var, boolean z) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1488791149);
        int i2 = (x340Var.g(str) ? 4 : 2) | i | (x340Var.g(c380Var) ? 32 : 16) | (x340Var.g(str2) ? 256 : 128) | (x340Var.h(z) ? 2048 : 1024) | (x340Var.i(this) ? 131072 : 65536);
        if (x340Var.Y(i2 & 1, (74899 & i2) != 74898)) {
            nyx.a(2, null, apo.r(-1923764570, new muy(this, str2, str, c380Var, z), x340Var), x340Var, 3078, 6);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new muy(this, str, c380Var, str2, z, i);
        }
    }

    public final void d(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(591012306);
        int i2 = i & 1;
        if (x340Var.Y(i2, i2 != 0)) {
            qim0 qim0VarA = uyn1.A(u291.z(u291.f(nim0.a, 1.0f), null, 3), 16.0f, 16.0f, 16.0f, 8.0f);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(tgp1.l(x340Var));
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarA);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            String strO0 = cwl1.o0(x340Var, 2131955568);
            uwr uwrVar = cbx.a;
            uwo1.e(strO0, (qim0) null, cbx.d(x340Var).j, cbx.a(x340Var).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2034);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nuy(this, i);
        }
    }

    public final void e(String str, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(130529122);
        int i2 = (x340Var.g(str) ? 4 : 2) | i | (x340Var.i(this) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            j2i j2iVarR = apo.r(487168903, new qeu(str, (byte) 24), x340Var);
            j2i j2iVarR2 = apo.r(-1282302711, new nuy(this), x340Var);
            uwr uwrVar = cbx.a;
            ti5.a(j2iVarR, (qim0) null, j2iVarR2, (xu30) null, 0.0f, (erl1) null, kkn.l(cbx.a(x340Var).a.a.a(), cbx.a(x340Var).b.a, cbx.a(x340Var).b.a, x340Var, 18), x340Var, 390, 186);
            x340Var = x340Var;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ozw(this, str, i, (byte) 24);
        }
    }
}
