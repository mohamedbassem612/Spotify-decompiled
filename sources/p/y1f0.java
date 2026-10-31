package p;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxMobius;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class y1f0 implements xpw {
    public final e7m0 a;
    public final ia00 b;
    public final psw c;

    public y1f0(xnb1 xnb1Var, bza0 bza0Var) {
        xxb0 xxb0Var = xxb0.g;
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC = RxMobius.c();
        subtypeEffectHandlerBuilderC.g(mew.class, new ro(bza0Var, (byte) 1));
        this.a = sbl.z(xnb1Var, xxb0Var, RxConnectables.a(subtypeEffectHandlerBuilderC.h()), x5d0.W0, gje0.e1);
        this.b = n3o1.q(this).a(new kds(this, (byte) 20), wud0.R0);
        j2i j2iVar = new j2i(-1821743095, new qcd0(this, (byte) 9), true);
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.b;
    }

    public final jsw c() {
        return this.c;
    }

    public final void e(c380 c380Var, uzg1 uzg1Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-476170103);
        int i2 = i | (x340Var.g(c380Var) ? 4 : 2) | (x340Var.g(uzg1Var) ? 32 : 16) | (x340Var.i(this) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            f(c380Var, x340Var, (i2 & 14) | ((i2 >> 3) & 112));
            String str = uzg1Var.c;
            boolean z = (i2 & 112) == 32;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new v1f0(uzg1Var, (byte) 0);
                x340Var.s0(objT);
            }
            Function0 function0 = (Function0) objT;
            if (ihc1.y0(str)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            gbx gbxVar = new gbx(new y50(str), function0);
            jdx jdxVar = jdx.c;
            gdx gdxVarS = yla.s(x340Var);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            foo1.c(gbxVar, jdxVar, uyn1.B(nim0.a, 0.0f, 16.0f, 0.0f, 0.0f, 13), (max) null, gdxVarS, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(-871438614, new w1f0(uzg1Var, (byte) 0), x340Var), x340Var, 0, 48, 2008);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new qae0(this, c380Var, uzg1Var, i, (byte) 12);
        }
    }

    public final void f(c380 c380Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1059869674);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(c380Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            int size = c380Var.size();
            nim0 nim0Var = nim0.a;
            if (size == 1) {
                x340Var.i0(2022221193);
                String str = ((y980) o7h.q0(c380Var)).b;
                uwr uwrVar = cbx.a;
                lee1 lee1Var = cbx.d(x340Var).g;
                cvx cvxVar = cbx.b(x340Var).b;
                uwo1.e(str, uyn1.B(nim0Var, 0.0f, 16.0f, 0.0f, 0.0f, 13), lee1Var, 0L, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2024);
                x340Var.r(false);
            } else {
                x340Var.i0(2022464915);
                c380 c380VarA = mqo1.A(c380Var);
                uwr uwrVar2 = cbx.a;
                lee1 lee1Var2 = cbx.d(x340Var).g;
                cvx cvxVar2 = cbx.b(x340Var).b;
                x4p1.d(c380VarA, uyn1.B(nim0Var, 0.0f, 16.0f, 0.0f, 0.0f, 13), lee1Var2, 0L, x340Var, 0);
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new lg60(this, c380Var, i, (byte) 25);
        }
    }

    public final void g(String str, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(635452080);
        if ((i & 6) == 0) {
            i2 = i | (x340Var.g(str) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            uwr uwrVar = cbx.a;
            uwo1.e(str, (qim0) null, cbx.d(x340Var).d, 0L, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, i2 & 14, 0, 2026);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new lg60(this, str, i, (byte) 26);
        }
    }

    public final mqw getBehavior() {
        return this.a;
    }

    public final void h(String str, vzg1 vzg1Var, c380 c380Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var;
        boolean z;
        int i3;
        String strK;
        long j;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(896622325);
        if ((i & 6) == 0) {
            i2 = (x340Var2.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var2.g(vzg1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var2.g(c380Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var2.i(iu30Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var2.i(this) ? 16384 : 8192;
        }
        if (x340Var2.Y(i2 & 1, (i2 & 9363) != 9362)) {
            int i4 = (i2 >> 9) & 112;
            g(str, x340Var2, (i2 & 14) | i4);
            String str2 = vzg1Var.c;
            pe11 pe11Var = vzg1Var.d;
            uwr uwrVar = cbx.a;
            long j2 = ((vex) zex.a.b).b;
            long j3 = u7h.j;
            String strO0 = cwl1.o0(x340Var2, 2131957708);
            cvx cvxVar = cbx.b(x340Var2).b;
            nim0 nim0Var = nim0.a;
            int i5 = i2;
            zgo1.i(str2, anm1.N(str2, u291.r(uyn1.B(nim0Var, 0.0f, 16.0f, 0.0f, 0.0f, 13), dsa0.m(x340Var2, 2131166221))), j2, j3, izy0.None, strO0, dzy0.b, (fzy0) null, (jzy0) null, x340Var2, 1597440, 384);
            x340Var = x340Var2;
            int i6 = i5 >> 6;
            f(c380Var, x340Var, (i6 & 14) | i4);
            i(vzg1Var, iu30Var, x340Var, (i6 & 896) | ((i5 >> 3) & 14) | (i6 & 112));
            if (p7h.M(new pe11[]{pe11.e, pe11.c}).contains(pe11Var)) {
                x340Var.i0(874952699);
                vzg1Var.e.invoke(str2, pe11Var);
                int iOrdinal = pe11Var.ordinal();
                if (iOrdinal != 2) {
                    i3 = 4;
                    if (iOrdinal != 4) {
                        x340Var.i0(875282537);
                        z = false;
                        x340Var.r(false);
                        strK = "";
                    } else {
                        z = false;
                        strK = x0d.k(x340Var, -1634338893, 2131957711, x340Var, false);
                    }
                } else {
                    z = false;
                    i3 = 4;
                    strK = x0d.k(x340Var, -1634335723, 2131957712, x340Var, false);
                }
                lee1 lee1Var = cbx.d(x340Var).m;
                cvx cvxVar2 = cbx.b(x340Var).b;
                qim0 qim0VarB = uyn1.B(nim0Var, 0.0f, 16.0f, 0.0f, 0.0f, 13);
                Object objT = x340Var.T();
                if (objT == fkj0.X) {
                    objT = gje0.d1;
                    x340Var.s0(objT);
                }
                qim0 qim0VarN = anm1.N("login_options_card_refresh_message", s161.b(qim0VarB, z, (iu30) objT));
                int iOrdinal2 = pe11Var.ordinal();
                if (iOrdinal2 == 2) {
                    x340Var.i0(-1634318051);
                    j = cbx.a(x340Var).b.f;
                    x340Var.r(z);
                } else if (iOrdinal2 != i3) {
                    x340Var.i0(-1634316452);
                    j = cbx.a(x340Var).b.b;
                    x340Var.r(z);
                } else {
                    x340Var.i0(-1634320163);
                    j = cbx.a(x340Var).b.d;
                    x340Var.r(z);
                }
                uwo1.e(strK, qim0VarN, lee1Var, j, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2016);
                x340Var = x340Var;
                x340Var.r(z);
            } else {
                x340Var.i0(875831053);
                x340Var.r(false);
            }
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kyq((byte) 28, i, (Object) this, (Object) str, (Object) vzg1Var, (Object) c380Var, (Object) iu30Var);
        }
    }

    public final void i(vzg1 vzg1Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        pe11 pe11Var = vzg1Var.d;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1700158182);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(vzg1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(this) ? 256 : 128;
        }
        if (!x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            x340Var.b0();
        } else if (pe11Var != pe11.a) {
            x340Var.i0(1137090067);
            String strO0 = cwl1.o0(x340Var, 2131957709);
            boolean z = (i2 & 112) == 32;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new ijd0(iu30Var, (byte) 24);
                x340Var.s0(objT);
            }
            Function0 function0 = (Function0) objT;
            if (ihc1.y0(strO0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            gbx gbxVar = new gbx(new y50(strO0), function0);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            foo1.g(gbxVar, anm1.N("login_options_card_refresh_button", uyn1.B(nim0.a, 0.0f, 16.0f, 0.0f, 0.0f, 13)), p7h.M(new pe11[]{pe11.b, pe11.e, pe11.c}).contains(pe11Var) ? jax.a : new hax(((Context) x340Var.k(AndroidCompositionLocals_androidKt.b)).getString(2131957710)), yla.s(x340Var), (idn0) null, apo.r(-303019567, new x1f0(vzg1Var, (byte) 0), x340Var), (vu30) null, apo.r(-311018541, new x1f0(vzg1Var, (byte) 1), x340Var), x340Var, 12779520, 80);
            x340Var.r(false);
        } else {
            x340Var.i0(1138309576);
            x340Var.r(false);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vqd0(this, vzg1Var, iu30Var, i, (byte) 4);
        }
    }

    public final void j(String str, c380 c380Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-471611349);
        int i2 = (x340Var.g(str) ? 4 : 2) | i | (x340Var.g(c380Var) ? 32 : 16) | (x340Var.i(this) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            int i3 = i2 & 14;
            int i4 = i2 >> 3;
            g(str, x340Var, i3 | (i4 & 112));
            f(c380Var, x340Var, i4 & 126);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new qae0(this, str, c380Var, i, (byte) 13);
        }
    }
}
