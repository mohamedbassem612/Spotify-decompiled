package p;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.os.StrictMode;
import androidx.glance.appwidget.action.InvisibleActionTrampolineActivity;
import com.spotify.widgets.npvwidget.WidgetInteraction;
import io.reactivex.rxjava3.core.Observable;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class j0p1 {
    public static b180 a;
    public static b180 b;

    public static final void a(qat qatVar, qim0 qim0Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1653024806);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i2 = (x340Var.g(qatVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            i3 |= x340Var.i(iu30Var) ? 256 : 128;
        }
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            d36 d36Var = new d36(8.0f, true, new um5(false));
            fra fraVar = een.N0;
            uwr uwrVar = cbx.a;
            long jA = cbx.a(x340Var).a.a.a();
            cr31 cr31VarB = er31.b(8.0f);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(uyn1.x(dug.f(qim0Var3, jA, cr31VarB), 16.0f), 1.0f);
            boolean z = ((i3 & 14) == 4) | ((i3 & 896) == 256);
            Object objT = x340Var.T();
            if (z || objT == m4cVar) {
                objT = new ame(iu30Var, qatVar, (byte) 15);
                x340Var.s0(objT);
            }
            qim0 qim0VarX = bin.x(qim0VarF, false, null, null, null, (Function0) objT, 15);
            jw31 jw31VarA = ew31.a(d36Var, fraVar, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarX);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z2 = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z2) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(jw31VarA, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0Var3);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            uwo1.e(qatVar.a, null, cbx.d(x340Var).h, cbx.a(x340Var).b.a, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2034);
            uwo1.e(qatVar.b, null, cbx.d(x340Var).j, cbx.a(x340Var).b.b, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2034);
            x340Var = x340Var;
            x340Var.r(true);
            op71.g(x340Var, new wnb0(1.0f, true));
            w0h1.a(plx.c, isl.a, (qim0) null, cbx.a(x340Var).b.a, 0L, false, x340Var, plx.d | 48, 52);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new p1b(qatVar, qim0Var2, iu30Var, i, (byte) 23);
        }
    }

    public static final void b(int i, String str, String str2, String str3, b0k b0kVar, iu30 iu30Var, qim0 qim0Var, boolean z) {
        b0k b0kVar2;
        j2i j2iVarR;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-2077753747);
        int i2 = i | (b0kVar3.h(z) ? 4 : 2) | (b0kVar3.g(str) ? 32 : 16) | (b0kVar3.g(str2) ? 256 : 128) | (b0kVar3.g(str3) ? 2048 : 1024) | (b0kVar3.i(qim0Var) ? 16384 : 8192) | (b0kVar3.i(iu30Var) ? 131072 : 65536);
        if (b0kVar3.Y(i2 & 1, (74899 & i2) != 74898)) {
            nex nexVar = new nex(4);
            lex lexVarZ = yoo1.z(b0kVar3);
            if (str3 == null) {
                b0kVar3.i0(707182312);
                b0kVar3.r(false);
                j2iVarR = null;
            } else {
                b0kVar3.i0(707182313);
                j2iVarR = apo.r(-1430363892, new ps00(str3, (byte) 9), b0kVar3);
                b0kVar3.r(false);
            }
            j2i j2iVar = j2iVarR;
            boolean z2 = ((458752 & i2) == 131072) | ((i2 & 112) == 32);
            Object objT = b0kVar3.T();
            if (z2 || objT == fkj0.X) {
                objT = new mr3(iu30Var, str, (byte) 3);
                b0kVar3.s0(objT);
            }
            b0kVar2 = b0kVar3;
            poo1.g(z, (iu30) objT, nexVar, lexVarZ, qim0Var, 0, null, null, null, j2iVar, null, null, null, false, null, apo.r(-555291024, new ps00(str2, (byte) 10), b0kVar3), b0kVar2, i2 & 57358, 196608, 32224);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new d920(z, str, str2, str3, qim0Var, iu30Var, i);
        }
    }

    public static final void c(b920 b920Var, qim0 qim0Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(520240237);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(b920Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(qim0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(iu30Var) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            xtb0 xtb0VarA = aub0.a(0, x340Var, 3);
            qim0 qim0VarN = anm1.N("filter-chips-row", qim0Var);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            d36 d36Var = new d36(8.0f, true, new um5(false));
            boolean z = ((i2 & 14) == 4) | ((i2 & 896) == 256);
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new zf10(b920Var, iu30Var, (byte) 7);
                x340Var.s0(objT);
            }
            ujo1.e(qim0VarN, xtb0VarA, null, d36Var, null, null, false, null, (iu30) objT, x340Var, 0, 492);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ze10(b920Var, iu30Var, qim0Var, i, (byte) 3);
        }
    }

    public static final void d(boolean z, boolean z2, xhd0 xhd0Var, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1273576180);
        int i2 = i | (x340Var.h(z) ? 4 : 2) | (x340Var.h(z2) ? 32 : 16) | (x340Var.i(xhd0Var) ? 256 : 128) | 3072;
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            ven0 ven0VarP = zod.P(mqo1.s(qhd0.b.a, qhd0.c.a), z, "reveal-hero-scale-in", (Function0) null, (Function0) null, x340Var, ((i2 << 3) & 112) | 392, 24);
            vnr0 vnr0Var = (vnr0) xhd0Var.invoke(x340Var, Integer.valueOf((i2 >> 6) & 14));
            x340Var.i0(-158950206);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            if (z2) {
                boolean zG = x340Var.g(ven0VarP);
                Object objT = x340Var.T();
                if (zG || objT == fkj0.X) {
                    x340Var = x340Var;
                    x340Var = x340Var;
                    objT = new pak(ven0VarP, (byte) 23);
                    x340Var.s0(objT);
                }
                x340Var = x340Var;
                qim0VarF = qim0VarF.then(i541.C(qim0Var3, (iu30) objT));
            }
            x340Var = x340Var;
            x340Var.r(false);
            qgo1.f(vnr0Var, qim0VarF, new a0e1(3), 0, false, null, x340Var, 8, 56);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new pa0(z, z2, (Object) xhd0Var, (Object) qim0Var2, i, (byte) 7);
        }
    }

    public static final void e(boolean z, boolean z2, xhd0 xhd0Var, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-567050945);
        int i2 = i | (x340Var.h(z) ? 4 : 2) | (x340Var.h(z2) ? 32 : 16) | (x340Var.i(xhd0Var) ? 256 : 128) | 3072;
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            ven0 ven0VarR = zod.R(phd0.c.a, z, (Function0) null, x340Var, 8 | ((i2 << 3) & 112), 4);
            vnr0 vnr0Var = (vnr0) xhd0Var.invoke(x340Var, Integer.valueOf((i2 >> 6) & 14));
            uwr uwrVar = cbx.a;
            vnr0 vnr0VarQ = omo1.q(vnr0Var, cbx.d(x340Var).j, cbx.d(x340Var).g, x340Var);
            x340Var.i0(524912694);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarZ = uyn1.z(hon1.v(x340Var).a.i, 0.0f, 2, u291.f(qim0Var3, 1.0f));
            if (z2) {
                boolean zG = x340Var.g(ven0VarR);
                Object objT = x340Var.T();
                if (zG || objT == fkj0.X) {
                    objT = new pak(ven0VarR, (byte) 24);
                    x340Var.s0(objT);
                }
                qim0VarZ = qim0VarZ.then(i541.C(qim0Var3, (iu30) objT));
            }
            x340Var.r(false);
            qgo1.f(vnr0VarQ, qim0VarZ, new a0e1(3), 0, false, null, x340Var, 8, 56);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new pa0(z, z2, (Object) xhd0Var, (Object) qim0Var2, i, (byte) 8);
        }
    }

    public static final void f(boolean z, boolean z2, xhd0 xhd0Var, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(70180885);
        int i2 = i | (x340Var.h(z) ? 4 : 2) | (x340Var.h(z2) ? 32 : 16) | (x340Var.i(xhd0Var) ? 256 : 128) | 3072;
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            ven0 ven0VarR = zod.R(phd0.b.a, z, (Function0) null, x340Var, 8 | ((i2 << 3) & 112), 4);
            vnr0 vnr0Var = (vnr0) xhd0Var.invoke(x340Var, Integer.valueOf((i2 >> 6) & 14));
            x340Var.i0(-1275627514);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarZ = uyn1.z(hon1.v(x340Var).a.i, 0.0f, 2, u291.f(qim0Var3, 1.0f));
            if (z2) {
                boolean zG = x340Var.g(ven0VarR);
                Object objT = x340Var.T();
                if (zG || objT == fkj0.X) {
                    objT = new pak(ven0VarR, (byte) 25);
                    x340Var.s0(objT);
                }
                qim0VarZ = qim0VarZ.then(i541.C(qim0Var3, (iu30) objT));
            }
            x340Var.r(false);
            qgo1.f(vnr0Var, qim0VarZ, new a0e1(3), 0, false, null, x340Var, 8, 56);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new pa0(z, z2, (Object) xhd0Var, (Object) qim0Var2, i, (byte) 9);
        }
    }

    public static final void g(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-958045422);
        if (x340Var.Y(i & 1, i != 0)) {
            long j = ((s3v) x340Var.k(p4k.a)).a;
            float fA = s3v.a(j);
            float fB = s3v.b(j);
            float f = ((p3v) x340Var.k(r4k.a)).a;
            String str = (String) x340Var.k(wol1.b);
            String str2 = (String) x340Var.k(wol1.c);
            String str3 = (String) x340Var.k(wol1.a);
            boolean zG = x340Var.g(str) | x340Var.g(str2);
            Object objT = x340Var.T();
            if (zG || objT == fkj0.X) {
                objT = new wqd1(str, str2);
                x340Var.s0(objT);
            }
            j2h1.b(d9y0.l(eqr0.H(eqr0.F(ila0.k(dm5.I(et40.a), new tw21(2131100246)), 16.0f, 0.0f), 0.0f, 16.0f, 0.0f, 16.0f + f, 5), new cz31(w0h1.A(new y60[]{new y60(apl1.b, (WidgetInteraction) ((Function0) objT).invoke()), new y60(apl1.a, str3)}))), (ql3) null, apo.r(402590320, new cru(fA, fB, (byte) 8, false), x340Var), x340Var, 384, 2);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new t491(i, (byte) 26);
        }
    }

    public static final void h(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1646553251);
        if (x340Var.Y(i & 1, i != 0)) {
            String strO0 = cwl1.o0(x340Var, 2131954796);
            fra fraVar = een.N0;
            boolean zG = x340Var.g(strO0);
            Object objT = x340Var.T();
            if (zG || objT == fkj0.X) {
                objT = new ysf1(strO0, (byte) 22);
                x340Var.s0(objT);
            }
            nim0 nim0Var = nim0.a;
            qim0 qim0VarB = s161.b(nim0Var, true, (iu30) objT);
            jw31 jw31VarA = ew31.a(h36.a, fraVar, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarB);
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
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            uwr uwrVar = cbx.a;
            zov0 zov0Var = cbx.b(x340Var).g;
            w0h1.a(wtx.c, new jsl(strO0), u291.r(nim0Var, 16.0f), ((wex) ((gmt) zex.a.c).c).b, 0L, true, x340Var, wtx.d | 196608, 16);
            cvx cvxVar = cbx.b(x340Var).b;
            op71.g(x340Var, u291.v(nim0Var, 4.0f));
            uwo1.e(cwl1.o0(x340Var, 2131954796), null, cbx.d(x340Var).k, 0L, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2042);
            x340Var = x340Var;
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new c1j1(i, (byte) 2);
        }
    }

    public static Intent i(Intent intent, cng1 cng1Var, int i) {
        Intent intent2 = new Intent(cng1Var.a, (Class<?>) InvisibleActionTrampolineActivity.class);
        intent2.setData(k(cng1Var, i, 2, ""));
        intent2.putExtra("ACTION_TYPE", "BROADCAST");
        intent2.putExtra("ACTION_INTENT", intent);
        return intent2;
    }

    public static g1i j(ciz cizVar, eiz eizVar, q7r0 q7r0Var, rih1 rih1Var) {
        cizVar.getClass();
        rih1Var.getClass();
        return new g1i(cizVar, eizVar);
    }

    public static final Uri k(cng1 cng1Var, int i, int i2, String str) {
        String str2;
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("glance-action");
        if (i2 == 1) {
            str2 = "ACTIVITY";
        } else if (i2 == 2) {
            str2 = "BROADCAST";
        } else if (i2 == 3) {
            str2 = "SERVICE";
        } else if (i2 == 4) {
            str2 = "FOREGROUND_SERVICE";
        } else {
            if (i2 != 5) {
                throw null;
            }
            str2 = "CALLBACK";
        }
        builder.path(str2);
        builder.appendQueryParameter("appWidgetId", String.valueOf(cng1Var.b));
        builder.appendQueryParameter("viewId", String.valueOf(i));
        builder.appendQueryParameter("viewSize", s3v.c(cng1Var.j));
        builder.appendQueryParameter("extraData", str);
        if (cng1Var.f) {
            builder.appendQueryParameter("lazyCollection", String.valueOf(cng1Var.k));
            builder.appendQueryParameter("lazeViewItem", String.valueOf(-1));
        }
        return builder.build();
    }

    public static final en70 l(war0 war0Var) {
        return new en70(war0Var);
    }

    public static final Long m(uqj0 uqj0Var) {
        if (uqj0Var instanceof sqj0) {
            return Long.valueOf(((sqj0) uqj0Var).a);
        }
        if (uqj0Var instanceof tqj0) {
            return null;
        }
        eg.o();
        return null;
    }

    public static final boolean n(yoj0 yoj0Var) {
        if (yoj0Var instanceof xoj0) {
            return ((xoj0) yoj0Var).b instanceof bqj0;
        }
        eg.o();
        return false;
    }

    public static final String o(yoj0 yoj0Var) {
        if (!(yoj0Var instanceof xoj0)) {
            eg.o();
            return null;
        }
        fqj0 fqj0Var = ((xoj0) yoj0Var).b;
        if (u890.j(fqj0Var, eqj0.a)) {
            return "sum";
        }
        if (u890.j(fqj0Var, dqj0.a)) {
            return "last_value";
        }
        if (u890.j(fqj0Var, bqj0.a)) {
            return "delta";
        }
        if (fqj0Var instanceof cqj0) {
            return "histogram";
        }
        eg.o();
        return null;
    }

    public static void p() {
        m511 m511Var = m511.e;
    }

    public static final go80 q(klm klmVar, wbp0 wbp0Var, wbp0 wbp0Var2, wbp0 wbp0Var3) {
        return klmVar.a("MusicBranchRestrictDataProcessingDaemon", new iyo0(wbp0Var, wbp0Var2, wbp0Var3, (byte) 24));
    }

    public static final boolean r(yoj0 yoj0Var) {
        if (yoj0Var instanceof xoj0) {
            return ((xoj0) yoj0Var).c != null;
        }
        eg.o();
        return false;
    }

    public static final void s(Activity activity, Intent intent) {
        StrictMode.VmPolicy vmPolicyBuild;
        Parcelable parcelableExtra = intent.getParcelableExtra("ACTION_INTENT");
        if (parcelableExtra == null) {
            hhg1.n("List adapter activity trampoline invoked without specifying target intent.");
            return;
        }
        Intent intent2 = (Intent) parcelableExtra;
        if (intent.hasExtra("android.widget.extra.CHECKED")) {
            intent2.putExtra("android.widget.extra.CHECKED", intent.getBooleanExtra("android.widget.extra.CHECKED", false));
        }
        String stringExtra = intent.getStringExtra("ACTION_TYPE");
        if (stringExtra == null) {
            hhg1.n("List adapter activity trampoline invoked without trampoline type");
            return;
        }
        f80 f80Var = new f80(stringExtra, activity, intent2, intent.getBundleExtra("ACTIVITY_OPTIONS"), (byte) 0);
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        if (Build.VERSION.SDK_INT >= 31) {
            vmPolicyBuild = mgc1.a.a(new StrictMode.VmPolicy.Builder(vmPolicy)).build();
        } else {
            vmPolicyBuild = new StrictMode.VmPolicy.Builder().build();
        }
        StrictMode.setVmPolicy(vmPolicyBuild);
        f80Var.invoke();
        StrictMode.setVmPolicy(vmPolicy);
        activity.finish();
    }

    public static final Observable t(bbr0 bbr0Var) {
        return Observable.defer(new yj1(bbr0Var, (byte) 11));
    }

    public static final boolean u(String str, boolean z) {
        if (z) {
            return false;
        }
        String strS = null;
        if (str != null) {
            if (str.length() <= 0) {
                str = null;
            }
            if (str != null) {
                Set set = s4b1.f;
                strS = uic.x(str).s();
            }
        }
        return !u890.j(strS, "spotify");
    }

    public static final psw v(maa maaVar, gw70 gw70Var, idm idmVar, hft0 hft0Var, iu30 iu30Var) {
        j2i j2iVar = new j2i(845920133, new tmt0(gw70Var, hft0Var, idmVar, iu30Var), true);
        ien0 ien0Var = qsw.a;
        return new psw(j2iVar, (byte) 0);
    }

    public static final void w(cbr0 cbr0Var, iu30 iu30Var) {
        bn70 bn70VarA = cbr0Var.b0(bn70.class).a();
        if (bn70VarA != null) {
            cbr0Var.a(new bn70(bn70VarA.a, bn70VarA.b, (nar0) iu30Var.invoke(bn70VarA), bn70VarA.d));
        }
    }
}
