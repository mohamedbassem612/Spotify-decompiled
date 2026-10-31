package p;

import android.net.Uri;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ka71 implements xpw {
    public final gw70 a;
    public final woa b;
    public final kma c;
    public final yqg d;
    public final ypq e;
    public final xwa f;
    public final ga71 g;
    public final eih1 h = new eih1();
    public final psw i;

    public ka71(gw70 gw70Var, woa woaVar, kma kmaVar, yqg yqgVar, ypq ypqVar, ruz ruzVar, xwa xwaVar) {
        this.a = gw70Var;
        this.b = woaVar;
        this.c = kmaVar;
        this.d = yqgVar;
        this.e = ypqVar;
        this.f = xwaVar;
        this.g = new ga71(ruzVar);
        j2i j2iVar = new j2i(227451717, new c771(this, (byte) 2), true);
        ien0 ien0Var = qsw.a;
        this.i = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.h;
    }

    public final jsw c() {
        return this.i;
    }

    public final void e(u9 u9Var, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) {
        h3i0 h3i0Var;
        jdj1 jdj1Var;
        Object obj = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2098861978);
        int i2 = i | (x340Var.i(u9Var) ? 4 : 2) | (x340Var.h(false) ? 32 : 16) | (x340Var.g((Object) null) ? 256 : 128) | (x340Var.g((Object) null) ? 2048 : 1024) | (x340Var.i(function0) ? 16384 : 8192) | (x340Var.i(qim0Var) ? 131072 : 65536) | (x340Var.i((Object) null) ? 1048576 : 524288) | (x340Var.i((Object) null) ? 8388608 : 4194304) | (x340Var.i(this) ? 67108864 : 33554432);
        if (!x340Var.Y(i2 & 1, (38347923 & i2) != 38347922)) {
            x340Var.b0();
        } else if (u9Var instanceof la71) {
            x340Var.i0(1628281408);
            und.a(this.f, null, 0.0f, apo.r(-1108517629, new jt41(u9Var, qim0Var, (byte) 21), x340Var), x340Var, 3072, 6);
            x340Var.r(false);
        } else {
            boolean z = u9Var instanceof ma71;
            xwa xwaVar = this.f;
            if (z) {
                x340Var.i0(-1062707109);
                ma71 ma71Var = (ma71) u9Var;
                ven0 ven0VarS = v8r.s(ma71Var.a, x340Var);
                if (xwaVar != null) {
                    x340Var.i0(-1062574646);
                    Object objT = x340Var.T();
                    if (objT == obj) {
                        ywa ywaVar = new ywa(new g8y0(ven0VarS, (byte) 19));
                        x340Var.s0(ywaVar);
                        objT = ywaVar;
                    }
                    uwa uwaVar = (uwa) objT;
                    boolean zI = x340Var.i(xwaVar) | x340Var.i(uwaVar);
                    Object objT2 = x340Var.T();
                    if (zI || objT2 == obj) {
                        objT2 = new ja71(xwaVar, uwaVar, (byte) 0);
                        x340Var.s0(objT2);
                    }
                    qxd0.h(xwaVar, uwaVar, (iu30) objT2, x340Var);
                    x340Var.r(false);
                } else {
                    x340Var.i0(-1062311332);
                    x340Var.r(false);
                }
                d0p1.k(ma71Var, qim0Var, function0, x340Var, (i2 & 14) | ((i2 >> 12) & 112) | ((i2 >> 6) & 896));
                x340Var.r(false);
            } else {
                if (!(u9Var instanceof na71)) {
                    throw p3d1.k(x340Var, 1628281186, false);
                }
                x340Var.i0(-1062161571);
                gfh0 gfh0VarC = t1c.c(een.h, false);
                int iHashCode = Long.hashCode(x340Var.T);
                xos0 xos0VarM = x340Var.m();
                qim0 qim0VarE = zr7.E(x340Var, qim0Var);
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
                Object objT3 = x340Var.T();
                if (objT3 == obj) {
                    mzr0 mzr0Var = (mzr0) ((a1q) this.e.a.b).b;
                    objT3 = new sa71((q8n) mzr0Var.a, (q8n) mzr0Var.b, xwaVar);
                    x340Var.s0(objT3);
                }
                sa71 sa71Var = (sa71) objT3;
                na71 na71Var = (na71) u9Var;
                Uri uri = na71Var.a;
                int iC = l1d.C(na71Var.e);
                if (iC == 0) {
                    h3i0Var = h3i0.a;
                } else if (iC == 1) {
                    h3i0Var = h3i0.b;
                } else {
                    if (iC != 2) {
                        eg.o();
                        return;
                    }
                    h3i0Var = h3i0.c;
                }
                h3i0 h3i0Var2 = h3i0Var;
                boolean z2 = na71Var.g;
                boolean z3 = na71Var.h;
                long j = na71Var.b;
                long j2 = na71Var.c;
                int iOrdinal = na71Var.f.ordinal();
                if (iOrdinal == 0) {
                    jdj1Var = idj1.a;
                } else {
                    if (iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3) {
                        eg.o();
                        return;
                    }
                    jdj1Var = hdj1.a;
                }
                otw.c(sa71Var, new qa71(uri, h3i0Var2, jdj1Var, z2, z3, j, j2), (qim0) null, (ipb1) null, x340Var, 8, 12);
                x340Var.r(true);
                x340Var.r(false);
            }
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new gh61(i, this, u9Var, function0, qim0Var, (byte) 4);
        }
    }

    public final mqw getBehavior() {
        return this.g;
    }
}
