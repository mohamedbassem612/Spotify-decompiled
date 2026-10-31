package p;

import io.reactivex.rxjava3.core.Observable;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class zg81 implements xpw {
    public final psw X;
    public final dj81 a;
    public final res b;
    public final Observable c;
    public final pt d;
    public final ym81 e;
    public final uzl0 f;
    public final wf81 g;
    public final ynb0 h;
    public final ljm0 i = h7w.D(new d781(this, 11), (bs50) null, (iu30) null, new j2i(-692664712, new wcy0(this, 9), true), 6);
    public final ia00 t = n3o1.q(this).a(new cq61(this, 12), c781.N0);

    public zg81(dj81 dj81Var, res resVar, Observable observable, pt ptVar, ym81 ym81Var, uzl0 uzl0Var, wf81 wf81Var, ynb0 ynb0Var) {
        this.a = dj81Var;
        this.b = resVar;
        this.c = observable;
        this.d = ptVar;
        this.e = ym81Var;
        this.f = uzl0Var;
        this.g = wf81Var;
        this.h = ynb0Var;
        j2i j2iVar = new j2i(-744156832, new c771(this, (byte) 23), true);
        ien0 ien0Var = qsw.a;
        this.X = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.t;
    }

    public final jsw c() {
        return this.X;
    }

    public final void e(int i, Function0 function0, b0k b0kVar, qim0 qim0Var, boolean z) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-597592702);
        int i2 = (x340Var.h(z) ? 4 : 2) | i | (x340Var.i(function0) ? 32 : 16) | (x340Var.i(qim0Var) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            fq7.g(z, qim0Var, xay.e(3, (ni20) null), xay.f(3, (ni20) null), null, apo.r(23718490, new oa5(function0, (byte) 23), x340Var), x340Var, (i2 & 14) | 196608 | ((i2 >> 3) & 112), 16);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new zp51(this, z, function0, qim0Var, i, (byte) 3);
        }
    }

    public final void f(int i, xpw xpwVar, Object obj, b0k b0kVar, int i2) {
        int i3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1690871333);
        if ((i2 & 6) == 0) {
            i3 = (x340Var.e(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= x340Var.i(xpwVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= (i2 & 512) == 0 ? x340Var.g(obj) : x340Var.i(obj) ? 256 : 128;
        }
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            int i4 = (i3 >> 6) & 8;
            ipb1 ipb1VarD = wpb1.D(rc11.a.b(xpwVar.getClass()).o() + "." + i, xpwVar, obj, x340Var, (i3 & 112) | (i4 << 6) | (i3 & 896));
            int i5 = i3 >> 3;
            otw.c(xpwVar, obj, (qim0) null, ipb1VarD, x340Var, (i5 & 14) | (i4 << 3) | (i5 & 112), 4);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nk0(this, i, xpwVar, obj, i2, (byte) 20);
        }
    }

    public final void g(int i, ng81 ng81Var, b0k b0kVar, int i2) {
        int i3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(771550890);
        if ((i2 & 6) == 0) {
            i3 = (x340Var.e(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= x340Var.i(ng81Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= x340Var.i(this) ? 256 : 128;
        }
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            f(i, ng81Var.a, ng81Var.b, x340Var, (i3 & 14) | ((i3 << 3) & 7168));
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new hk2(this, i, ng81Var, i2, (byte) 19);
        }
    }

    public final mqw getBehavior() {
        return this.i;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void h(ug81 ug81Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-256161229);
        int i2 = (x340Var.i(ug81Var) ? 4 : 2) | i | (x340Var.i(this) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            ih81 ih81Var = ug81Var.b.a;
            if (ih81Var instanceof hh81) {
                x340Var.i0(-1357800271);
                f(ug81Var.a, (xpw) this.h.get(), new bi81((hh81) ih81Var, ug81Var.c), x340Var, (i2 << 6) & 7168);
                x340Var.r(false);
            } else {
                if (!(ih81Var instanceof gh81)) {
                    throw p3d1.k(x340Var, -1357803335, false);
                }
                x340Var.i0(-1357789577);
                g(ug81Var.a, ((gh81) ih81Var).a, x340Var, (i2 << 3) & 896);
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new og81(this, ug81Var, i);
        }
    }

    public final void i(wg81 wg81Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        boolean z = wg81Var.c;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-555529141);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(wg81Var) : x340Var.i(wg81Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(this) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            int i3 = i2 & 112;
            boolean z2 = i3 == 32;
            Object objT = x340Var.T();
            if (z2 || objT == m4cVar) {
                objT = new hi81(new pc81(iu30Var, (byte) 7));
                x340Var.s0(objT);
            }
            hi81 hi81Var = (hi81) objT;
            boolean z3 = i3 == 32;
            Object objT2 = x340Var.T();
            if (z3 || objT2 == m4cVar) {
                objT2 = new ii81(new pc81(iu30Var, (byte) 8));
                x340Var.s0(objT2);
            }
            ii81 ii81Var = (ii81) objT2;
            dj81 dj81Var = this.a;
            int iC = l1d.C(dj81Var.a());
            if (iC == 0) {
                x340Var.i0(-1259211902);
                ho41 ho41Var = wg81Var.e;
                boolean zH = x340Var.h(z) | x340Var.g(hi81Var) | x340Var.g(ii81Var);
                Object objT3 = x340Var.T();
                if (zH || objT3 == m4cVar) {
                    ji81 ji81Var = hi81Var;
                    if (z) {
                        ji81Var = ii81Var;
                    }
                    objT3 = new ki81(ji81Var);
                    x340Var.s0(objT3);
                }
                ki81 ki81Var = (ki81) objT3;
                boolean zG = x340Var.g(ki81Var) | x340Var.g(ho41Var);
                Object objT4 = x340Var.T();
                if (zG || objT4 == m4cVar) {
                    objT4 = new zi81(ki81Var, ho41Var);
                    x340Var.s0(objT4);
                }
                f(-1, this.b, objT4, x340Var, ((i2 << 3) & 7168) | 6);
                x340Var.r(false);
            } else {
                if (iC != 1 && iC != 2) {
                    throw p3d1.k(x340Var, -1287546927, false);
                }
                x340Var.i0(-1287516367);
                boolean zH2 = x340Var.h(z) | x340Var.g(hi81Var) | x340Var.g(ii81Var);
                Object objT5 = x340Var.T();
                if (zH2 || objT5 == m4cVar) {
                    objT5 = new si81(z, dj81Var.a() == 3, hi81Var, ii81Var);
                    x340Var.s0(objT5);
                }
                f(-1, this.d, objT5, x340Var, 6 | ((i2 << 3) & 7168));
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kk31(this, wg81Var, iu30Var, i, (byte) 28);
        }
    }

    public final void j(qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(245446569);
        int i2 = i | 6;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            uwr uwrVar = cbx.a;
            long jC = cbx.a(x340Var).a.b.c();
            qim0 qim0Var2 = nim0.a;
            hr80.d(qim0Var2, 1.0f, jC, x340Var, 6, 0);
            qim0Var = qim0Var2;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new q081(this, qim0Var, i, (byte) 4);
        }
    }

    public final boolean k(wg81 wg81Var) {
        return wg81Var.c && this.a.a() == 1;
    }
}
