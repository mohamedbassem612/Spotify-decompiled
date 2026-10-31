package p;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import androidx.compose.ui.graphics.ColorFilter;
import com.spotify.clientrestrictions.v1.ExternalAccessoryDescription;
import com.spotify.nowplaying.scroll.ScrollCardType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class f6o1 {
    public static final df41 a = new df41(new cix0((byte) 4), new f6f0((byte) 6));
    public static final df41 b = new df41(new cix0((byte) 5), new f6f0((byte) 7));
    public static final df41 c = new df41(new cix0((byte) 6), new f6f0((byte) 8));
    public static final df41 d = new df41(new cix0((byte) 7), new f6f0((byte) 9));
    public static final df41 e = new df41(new cix0((byte) 8), new f6f0((byte) 10));
    public static b180 f;

    public static qtw A(maa maaVar, ViewGroup.LayoutParams layoutParams, ScrollCardType scrollCardType, int i) {
        if ((i & 1) != 0) {
            layoutParams = null;
        }
        if ((i & 2) != 0) {
            scrollCardType = null;
        }
        return new qtw(maaVar, layoutParams, scrollCardType);
    }

    public static final osw B(jsw jswVar, ViewGroup.LayoutParams layoutParams, Object obj) {
        return new osw(new utw(jswVar.b(), jswVar, layoutParams, obj, (byte) 0));
    }

    public static void D(rm5 rm5Var) {
        CardView cardView = (CardView) rm5Var.b;
        if (!cardView.getUseCompatPadding()) {
            rm5Var.N(0, 0, 0, 0);
            return;
        }
        wq31 wq31Var = (wq31) rm5Var.a;
        float f2 = wq31Var.e;
        float f3 = wq31Var.a;
        int iCeil = (int) Math.ceil(xq31.a(f2, f3, cardView.getPreventCornerOverlap()));
        int iCeil2 = (int) Math.ceil(xq31.b(f2, f3, cardView.getPreventCornerOverlap()));
        rm5Var.N(iCeil, iCeil2, iCeil, iCeil2);
    }

    public static int E(int i) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i) * (-862048943)), 15)) * 461845907);
    }

    public static final void a(ci00 ci00Var, iu30 iu30Var, b0k b0kVar, int i) {
        x340 x340Var;
        lee1 lee1Var;
        iu30 iu30Var2 = iu30Var;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(672096280);
        j06 j06Var = x340Var2.a;
        int i2 = i | (x340Var2.g(ci00Var) ? 4 : 2) | (x340Var2.i(iu30Var2) ? 32 : 16);
        if (x340Var2.Y(i2 & 1, (i2 & 19) != 18)) {
            Object objT = x340Var2.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = ktd.n(x340Var2);
            }
            idn0 idn0Var = (idn0) objT;
            ven0 ven0VarM = k1u.m(idn0Var, x340Var2, 0);
            tob1 tob1VarB = z95.b(((Boolean) ven0VarM.getValue()).booleanValue() ? 0.97f : 1.0f, (fe5) null, "promotion-row-scale", (iu30) null, x340Var2, 3072, 22);
            tob1 tob1VarB2 = z95.b(((Boolean) ven0VarM.getValue()).booleanValue() ? 0.8f : 1.0f, (fe5) null, "promotion-row-alpha", (iu30) null, x340Var2, 3072, 22);
            boolean z = ci00Var.e == 2;
            zzq0 zzq0Var = z ? new zzq0(16.0f, 24.0f, 16.0f, 24.0f) : new zzq0(0.0f, 0.0f, 0.0f, 0.0f);
            float f2 = z ? 124.0f : 108.0f;
            if (z) {
                x340Var2.i0(-716424833);
                uwr uwrVar = cbx.a;
                lee1Var = cbx.d(x340Var2).d;
                x340Var2.r(false);
            } else {
                x340Var2.i0(-716376256);
                uwr uwrVar2 = cbx.a;
                lee1Var = cbx.d(x340Var2).e;
                x340Var2.r(false);
            }
            nim0 nim0Var = nim0.a;
            qim0 qim0VarH = u291.h(uyn1.w(u291.f(nim0Var, 1.0f), zzq0Var), f2);
            float fFloatValue = ((Number) tob1VarB.getValue()).floatValue();
            qim0 qim0VarF = dug.f(i1p1.q(d9y0.k(fj30.F(qim0VarH, fFloatValue, fFloatValue), ((Number) tob1VarB2.getValue()).floatValue()), er31.b(8.0f)), z4p1.e(Color.parseColor(ci00Var.a)), d4o1.a);
            pm31 pm31Var = new pm31(0);
            int i3 = i2 & 112;
            boolean z2 = i3 == 32;
            Object objT2 = x340Var2.T();
            if (z2 || objT2 == m4cVar) {
                objT2 = new y9y(iu30Var2, (byte) 25);
                x340Var2.s0(objT2);
            }
            qim0 qim0VarV = bin.v(qim0VarF, idn0Var, null, false, null, pm31Var, (Function0) objT2, 12);
            gra graVar = een.d;
            gfh0 gfh0VarC = t1c.c(graVar, false);
            lee1 lee1Var2 = lee1Var;
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarV);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            boolean z3 = x340Var2.S;
            n4k n4kVar = hmb0.t1;
            if (z3) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(gfh0VarC, x340Var2, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var2, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var2, lljVar3);
            nko1.F(x340Var2);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var2, lljVar4);
            t1c.a(dug.e(u291.d(nim0Var, 1.0f), v9c.s(p7h.M(new u7h[]{new u7h(u7h.b(u7h.b, 0.3f, 0.0f, 0.0f, 0.0f, 14)), new u7h(u7h.j)}), 0.0f, 0.0f, 14), null, 0.0f, 6), x340Var2, 0);
            qim0 qim0VarD = u291.d(nim0Var, 1.0f);
            gfh0 gfh0VarC2 = t1c.c(graVar, false);
            int iHashCode2 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM2 = x340Var2.m();
            qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarD);
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            nko1.H(gfh0VarC2, x340Var2, lljVar);
            nko1.H(xos0VarM2, x340Var2, lljVar2);
            x0d.q(iHashCode2, x340Var2, lljVar3, x340Var2);
            nko1.H(qim0VarE2, x340Var2, lljVar4);
            qim0 qim0VarA = uyn1.A(u291.c(nim0Var, 1.0f), 16.0f, 12.0f, 112.0f, 4.0f);
            mbh mbhVarA = jbh.a(h36.g, een.P0, x340Var2, 0);
            int iHashCode3 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM3 = x340Var2.m();
            qim0 qim0VarE3 = zr7.E(x340Var2, qim0VarA);
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            nko1.H(mbhVarA, x340Var2, lljVar);
            nko1.H(xos0VarM3, x340Var2, lljVar2);
            x0d.q(iHashCode3, x340Var2, lljVar3, x340Var2);
            nko1.H(qim0VarE3, x340Var2, lljVar4);
            uwo1.e(ci00Var.c, new wnb0(1.0f, true), lee1Var2, cbx.a(x340Var2).b.a, null, null, 0, false, new cjc0(2), 0, null, x340Var2, 0, 0, 1776);
            String str = ci00Var.d;
            boolean z4 = i3 == 32;
            Object objT3 = x340Var2.T();
            if (z4 || objT3 == m4cVar) {
                objT3 = new y9y(iu30Var, (byte) 26);
                x340Var2.s0(objT3);
            }
            Function0 function0 = (Function0) objT3;
            if (ihc1.y0(str)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            iu30Var2 = iu30Var;
            foo1.c(new gbx(new y50(str), function0), new idx(5), null, null, yla.s(x340Var2), null, null, null, null, null, apo.r(1907452704, new hzw(ci00Var, (byte) 20), x340Var2), x340Var2, 0, 48, 2012);
            x340Var = x340Var2;
            x340Var.r(true);
            String str2 = ci00Var.b;
            if (str2 == null) {
                x340Var.i0(1333687124);
                x340Var.r(false);
            } else {
                x340Var.i0(1333687125);
                boolean z5 = x340Var.k(t4k.n) == flb0.b;
                Uri uri = Uri.parse(str2);
                qim0 qim0VarR = u291.r(h2c.a.a(nim0Var, een.i), 108.0f);
                boolean zH = x340Var.h(z5);
                Object objT4 = x340Var.T();
                if (zH || objT4 == m4cVar) {
                    objT4 = new gy((byte) 29, z5);
                    x340Var.s0(objT4);
                }
                eso1.e(uri, isl.a, i541.C(qim0VarR, (iu30) objT4), (p3v) null, (zvx) null, (ecx) null, mif1.P0, (tl3) null, (ColorFilter) null, oux.a, false, false, x340Var, 224304, 0, 3456);
                x340Var = x340Var;
                x340Var.r(false);
            }
            x340Var.r(true);
            x340Var.r(true);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new di00(ci00Var, iu30Var2, i);
        }
    }

    public static final void b(String str, String str2, hti1 hti1Var, qim0 qim0Var, String str3, Function0 function0, j2i j2iVar, b0k b0kVar, int i, int i2) {
        String str4;
        int i3;
        int i4;
        j2i j2iVar2;
        Function0 function1;
        qim0 qim0VarX;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(161674642);
        j06 j06Var = x340Var.a;
        int i5 = i | (x340Var.g(str) ? 4 : 2);
        if ((i & 48) == 0) {
            i5 |= x340Var.g(str2) ? 32 : 16;
        }
        int i6 = i5 | (x340Var.i(qim0Var) ? 2048 : 1024);
        int i7 = i2 & 16;
        if (i7 != 0) {
            i3 = i6 | 24576;
            str4 = str3;
        } else {
            str4 = str3;
            i3 = i6 | (x340Var.g(str4) ? 16384 : 8192);
        }
        int i8 = i2 & 32;
        if (i8 != 0) {
            i4 = i3 | 196608;
        } else {
            i4 = i3 | (x340Var.i(function0) ? 131072 : 65536);
        }
        if (x340Var.Y(i4 & 1, (599187 & i4) != 599186)) {
            String str5 = i7 != 0 ? null : str4;
            Function0 function2 = i8 != 0 ? null : function0;
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            jw31 jw31VarA = ew31.a(h36.g, een.N0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0Var);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z) {
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
            qim0 qim0Var2 = nim0.a;
            if (function2 == null) {
                x340Var.i0(-1894998054);
                x340Var.r(false);
                qim0VarX = qim0Var2;
            } else {
                x340Var.i0(-1894965132);
                boolean z2 = (458752 & i4) == 131072;
                Object objT = x340Var.T();
                if (z2 || objT == fkj0.X) {
                    objT = new j160(function2, (byte) 0);
                    x340Var.s0(objT);
                }
                qim0VarX = bin.x(qim0Var2, false, null, null, null, (Function0) objT, 15);
                x340Var.r(false);
            }
            qim0 qim0VarThen = qim0VarX.then(hti1Var == hti1.d ? uyn1.B(qim0Var2, 0.0f, 0.0f, 16.0f, 0.0f, 11) : uyn1.B(qim0Var2, 12.0f, 0.0f, 16.0f, 0.0f, 10));
            vq60 vq60Var = jw80.a;
            qim0 qim0VarH = kx40.h(1.0f, qim0VarThen.then(tsj0.a), false);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int i9 = i4;
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarH);
            x340Var.m0();
            Function0 function3 = function2;
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            l3p1.a(str, str2, hti1Var, null, str5, x340Var, i9 & 58366);
            x340Var.r(true);
            j2iVar2 = j2iVar;
            j2iVar2.invoke(x340Var, 6);
            x340Var.r(true);
            function1 = function3;
            str4 = str5;
        } else {
            j2iVar2 = j2iVar;
            x340Var.b0();
            function1 = function0;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ra5(str, str2, hti1Var, qim0Var, str4, function1, j2iVar2, i, i2);
        }
    }

    public static final void c(List list, vu30 vu30Var, Function0 function0, qim0 qim0Var, String str, b0k b0kVar, int i) {
        b0k b0kVar2;
        qim0 qim0Var2;
        String strK;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-2107589441);
        int i2 = i | (b0kVar3.g(list) ? 4 : 2) | (b0kVar3.i(vu30Var) ? 32 : 16) | (b0kVar3.i(function0) ? 256 : 128) | 27648 | (b0kVar3.g(str) ? 131072 : 65536);
        boolean z = true;
        if (b0kVar3.Y(i2 & 1, (74899 & i2) != 74898)) {
            if (str == null) {
                strK = x0d.k(b0kVar3, 1831119445, 2131957904, b0kVar3, false);
            } else {
                b0kVar3.i0(1831119166);
                b0kVar3.r(false);
                strK = str;
            }
            String strO0 = cwl1.o0(b0kVar3, 2131957861);
            List list2 = list;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    if (((nbb0) it.next()).c) {
                        z = false;
                        break;
                    }
                }
            }
            b0kVar2 = b0kVar3;
            x74.f(function0, (scx) null, (mfx) null, false, false, 0.0f, false, (Boolean) null, false, false, (vu30) null, apo.r(-837581856, new cy00(o7h.N0(list2, Collections.singletonList(new nbb0("__off__", z, strO0, false))), vu30Var, strK), b0kVar3), b0kVar2, ((i2 >> 6) & 14) | 24576, 48, 2030);
            qim0Var2 = nim0.a;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new uk20(list, vu30Var, function0, qim0Var2, str, i);
        }
    }

    public static final void d(nbb0 nbb0Var, Function0 function0, b0k b0kVar, int i) {
        b0k b0kVar2;
        String strK;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1252588804);
        int i2 = (b0kVar3.g(nbb0Var) ? 4 : 2) | i | (b0kVar3.i(function0) ? 32 : 16);
        if (b0kVar3.Y(i2 & 1, (i2 & 19) != 18)) {
            if (nbb0Var.d) {
                strK = x0d.k(b0kVar3, -1197089890, 2131957862, b0kVar3, false);
            } else {
                b0kVar3.i0(-1197013816);
                b0kVar3.r(false);
                strK = nbb0Var.b;
            }
            boolean z = (i2 & 14) == 4;
            Object objT = b0kVar3.T();
            if (z || objT == fkj0.X) {
                objT = new hu90(nbb0Var, (byte) 29);
                b0kVar3.s0(objT);
            }
            b0kVar2 = b0kVar3;
            jto1.b(s161.b(nim0.a, false, (iu30) objT), new uvx((pgx) null, 2, (tvx) null, (p3v) null, 27), null, false, null, null, new gbx(z50.c, function0), null, null, null, null, null, apo.r(1762062069, new yy80(nbb0Var, (byte) 19), b0kVar3), null, null, apo.r(-919742664, new z3y(strK, (byte) 19), b0kVar3), b0kVar2, 64, 197040, 26556);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new vx90(nbb0Var, function0, i, (byte) 10);
        }
    }

    public static final void e(xfx xfxVar, cwm0 cwm0Var, qim0 qim0Var, boolean z, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(202789502);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(xfxVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(cwm0Var) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if ((i & 3072) == 0) {
            i3 |= x340Var.h(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= x340Var.i(iu30Var) ? 16384 : 8192;
        }
        if (x340Var.Y(i3 & 1, (i3 & 9363) != 9362)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarN = anm1.N("pam-multi-user-trial-manager", qim0Var3);
            boolean zI = ((i3 & 7168) == 2048) | x340Var.i(xfxVar) | ((i3 & 57344) == 16384);
            Object objT = x340Var.T();
            if (zI || objT == m4cVar) {
                objT = new bnr0(xfxVar, z, iu30Var, (byte) 3);
                x340Var.s0(objT);
            }
            iu30 iu30Var2 = (iu30) objT;
            boolean zI2 = x340Var.i(cwm0Var);
            Object objT2 = x340Var.T();
            if (zI2 || objT2 == m4cVar) {
                objT2 = new wvq0(cwm0Var, (byte) 17);
                x340Var.s0(objT2);
            }
            dm5.a(iu30Var2, qim0VarN, (iu30) objT2, x340Var, 0, 0);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new cnr0(xfxVar, cwm0Var, qim0Var2, z, iu30Var, i, (byte) 1);
        }
    }

    public static final void f(iu30 iu30Var, jtl1 jtl1Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1766742969);
        if ((i & 6) == 0) {
            i2 = i | (x340Var.i(iu30Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(jtl1Var) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            s260 s260Var = new s260();
            String strO0 = cwl1.o0(x340Var, 2131960704);
            String strO1 = cwl1.o0(x340Var, 2131960703);
            wd50 wd50Var = new wd50(new td50("spotify:image:ab671fcc000092561294ca6679d4da3f32a44bef"), vd50.f);
            cm10 cm10Var = new cm10(cwl1.o0(x340Var, 2131960701), vnx.c);
            String strO2 = cwl1.o0(x340Var, 2131960702);
            int i4 = i3 & 14;
            boolean z = i4 == 4;
            Object objT = x340Var.T();
            if (z || objT == m4cVar) {
                objT = new ccy0(iu30Var, (byte) 11);
                x340Var.s0(objT);
            }
            Function0 function0 = (Function0) objT;
            boolean z2 = i4 == 4;
            Object objT2 = x340Var.T();
            if (z2 || objT2 == m4cVar) {
                objT2 = new ccy0(iu30Var, (byte) 12);
                x340Var.s0(objT2);
            }
            Function0 function1 = (Function0) objT2;
            boolean z3 = i4 == 4;
            Object objT3 = x340Var.T();
            if (z3 || objT3 == m4cVar) {
                objT3 = new ccy0(iu30Var, (byte) 13);
                x340Var.s0(objT3);
            }
            l6o1.n(wd50Var, strO0, strO2, cm10Var, function0, function1, (Function0) objT3, jtl1Var, s260Var, false, strO1, null, x340Var, ((i3 << 18) & 29360128) | 4096 | ((i3 << 21) & 1879048192), 0, 5120);
            qim0Var2 = nim0.a;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new cry0(iu30Var, jtl1Var, qim0Var2, i, (byte) 1);
        }
    }

    public static final void g(xwb1 xwb1Var, tyq tyqVar, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-579573821);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(xwb1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(tyqVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(iu30Var) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            fq7.g(!xwb1Var.a.isEmpty(), (qim0) null, xay.d((ni20) null, een.Z, 13).a(xay.e(3, (ni20) null)), xay.l(14, irn1.j0()).a(xay.f(2, irn1.j0())), (String) null, apo.r(1593392619, new nu31(xwb1Var, tyqVar, iu30Var), x340Var), x340Var, 196608, 18);
            qim0Var2 = nim0.a;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nk31(i, xwb1Var, tyqVar, iu30Var, qim0Var2, (byte) 26);
        }
    }

    public static final boolean h(sdn0 sdn0Var, Map map) {
        if (sdn0Var != null && sdn0Var.e == map.size()) {
            Object[] objArr = sdn0Var.b;
            int[] iArr = sdn0Var.c;
            long[] jArr = sdn0Var.a;
            int length = jArr.length - 2;
            if (length < 0) {
                return true;
            }
            int i = 0;
            loop0: while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            Object obj = objArr[i4];
                            int i5 = iArr[i4];
                            Integer num = (Integer) map.get((ul3) obj);
                            if (num == null || num.intValue() != i5) {
                                break loop0;
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        return true;
                    }
                }
                if (i == length) {
                    return true;
                }
                i++;
            }
        }
        return false;
    }

    public static final pim0 i(x4t x4tVar, int i) {
        pim0 pim0Var = ((pim0) x4tVar).a.f;
        if (pim0Var == null || (pim0Var.d & i) == 0) {
            return null;
        }
        while (pim0Var != null) {
            int i2 = pim0Var.c;
            if ((i2 & 2) != 0) {
                return null;
            }
            if ((i2 & i) != 0) {
                return pim0Var;
            }
            pim0Var = pim0Var.f;
        }
        return null;
    }

    public static osw j(ViewGroup.LayoutParams layoutParams, j2i j2iVar, int i) {
        if ((i & 1) != 0) {
            layoutParams = null;
        }
        return B(new psw(j2iVar, (byte) 1), layoutParams, (i & 2) == 0 ? "paidPodcastBanner" : null);
    }

    public static final String k(Resources resources, List list) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(ihc1.e1((String) it.next()).toString());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (!ihc1.y0((String) obj)) {
                arrayList2.add(obj);
            }
        }
        String strY0 = o7h.y0(arrayList2, (CharSequence) null, (String) null, (String) null, (iu30) null, 63);
        boolean zY0 = ihc1.y0(strY0);
        boolean zY1 = ihc1.y0("");
        if (zY0 || zY1) {
            return !zY0 ? strY0 : "";
        }
        return resources.getString(2131952445, null, strY0);
    }

    public static m8n l(q8n q8nVar, n8n n8nVar) {
        if (n8nVar instanceof p8n) {
            n8n n8nVar2 = (p8n) n8nVar;
            n8n n8nVar3 = ((r6) q8nVar).a;
            if (n8nVar3 != n8nVar2 && ((p8n) n8nVar2).b != n8nVar3) {
                return null;
            }
            m8n m8nVar = (m8n) ((p8n) n8nVar2).a.invoke(q8nVar);
            if (m8nVar instanceof m8n) {
                return m8nVar;
            }
        } else if (wdu0.Y == n8nVar) {
            return q8nVar;
        }
        return null;
    }

    public static ColorStateList m(rm5 rm5Var) {
        return ((wq31) rm5Var.a).h;
    }

    public static float n(rm5 rm5Var) {
        return ((CardView) rm5Var.b).getElevation();
    }

    public static float o(rm5 rm5Var) {
        return ((wq31) rm5Var.a).e;
    }

    public static float p(rm5 rm5Var) {
        return ((wq31) rm5Var.a).a;
    }

    public static void q(rm5 rm5Var, ColorStateList colorStateList, float f2, float f3, float f4) {
        Drawable wq31Var = new wq31(colorStateList, f2);
        rm5Var.a = wq31Var;
        CardView cardView = (CardView) rm5Var.b;
        cardView.setBackgroundDrawable(wq31Var);
        cardView.setClipToOutline(true);
        cardView.setElevation(f3);
        y(rm5Var, f4);
    }

    public static final boolean r(ExternalAccessoryDescription externalAccessoryDescription, m210 m210Var) {
        if (!externalAccessoryDescription.x() && !externalAccessoryDescription.hasClientId() && !externalAccessoryDescription.hasName() && !externalAccessoryDescription.B() && !externalAccessoryDescription.v() && !externalAccessoryDescription.w() && !externalAccessoryDescription.y() && !externalAccessoryDescription.hasVersion() && !externalAccessoryDescription.z() && !externalAccessoryDescription.A()) {
            return false;
        }
        if (externalAccessoryDescription.x() && !u890.j(externalAccessoryDescription.q(), m210Var.a)) {
            return false;
        }
        if (externalAccessoryDescription.hasClientId() && !u890.j(externalAccessoryDescription.getClientId(), m210Var.b)) {
            return false;
        }
        if (externalAccessoryDescription.hasName() && !u890.j(externalAccessoryDescription.getName(), m210Var.c)) {
            return false;
        }
        if (externalAccessoryDescription.B() && !u890.j(externalAccessoryDescription.u(), m210Var.d)) {
            return false;
        }
        if (externalAccessoryDescription.v() && !u890.j(externalAccessoryDescription.n(), m210Var.f)) {
            return false;
        }
        if (externalAccessoryDescription.w() && !u890.j(externalAccessoryDescription.o(), m210Var.g)) {
            return false;
        }
        if (externalAccessoryDescription.y() && !u890.j(externalAccessoryDescription.r(), m210Var.h)) {
            return false;
        }
        if (externalAccessoryDescription.hasVersion() && !u890.j(externalAccessoryDescription.getVersion(), m210Var.i)) {
            return false;
        }
        if (!externalAccessoryDescription.z() || u890.j(externalAccessoryDescription.s(), m210Var.j)) {
            return !externalAccessoryDescription.A() || u890.j(externalAccessoryDescription.t(), m210Var.k);
        }
        return false;
    }

    public static o8n s(q8n q8nVar, n8n n8nVar) {
        if (n8nVar instanceof p8n) {
            n8n n8nVar2 = (p8n) n8nVar;
            n8n n8nVar3 = ((r6) q8nVar).a;
            if ((n8nVar3 != n8nVar2 && ((p8n) n8nVar2).b != n8nVar3) || ((m8n) ((p8n) n8nVar2).a.invoke(q8nVar)) == null) {
                return q8nVar;
            }
        } else if (wdu0.Y != n8nVar) {
            return q8nVar;
        }
        return o6x.a;
    }

    public static void t(rm5 rm5Var) {
        y(rm5Var, ((wq31) rm5Var.a).e);
    }

    public static void u(rm5 rm5Var) {
        y(rm5Var, ((wq31) rm5Var.a).e);
    }

    public static final op80 v(op80 op80Var, int i, y6h1 y6h1Var) {
        k3h1 k3h1Var = new k3h1(i);
        h3h1 h3h1Var = new h3h1(new q3o(op80Var, y6h1Var, (byte) 1));
        q6x q6xVar = q6x.b;
        if (k3h1Var.equals(q6xVar) && h3h1Var.equals(q6xVar)) {
            return q6xVar;
        }
        if (k3h1Var.equals(q6xVar)) {
            return h3h1Var;
        }
        return h3h1Var.equals(q6xVar) ? k3h1Var : new wch(k3h1Var, h3h1Var);
    }

    public static void w(rm5 rm5Var, ColorStateList colorStateList) {
        wq31 wq31Var = (wq31) rm5Var.a;
        if (colorStateList == null) {
            wq31Var.getClass();
            colorStateList = ColorStateList.valueOf(0);
        }
        wq31Var.h = colorStateList;
        wq31Var.b.setColor(colorStateList.getColorForState(wq31Var.getState(), wq31Var.h.getDefaultColor()));
        wq31Var.invalidateSelf();
    }

    public static void x(rm5 rm5Var, float f2) {
        ((CardView) rm5Var.b).setElevation(f2);
    }

    public static void y(rm5 rm5Var, float f2) {
        wq31 wq31Var = (wq31) rm5Var.a;
        CardView cardView = (CardView) rm5Var.b;
        boolean useCompatPadding = cardView.getUseCompatPadding();
        boolean preventCornerOverlap = cardView.getPreventCornerOverlap();
        if (f2 != wq31Var.e || wq31Var.f != useCompatPadding || wq31Var.g != preventCornerOverlap) {
            wq31Var.e = f2;
            wq31Var.f = useCompatPadding;
            wq31Var.g = preventCornerOverlap;
            wq31Var.b((Rect) null);
            wq31Var.invalidateSelf();
        }
        D(rm5Var);
    }

    public static void z(rm5 rm5Var, float f2) {
        wq31 wq31Var = (wq31) rm5Var.a;
        if (f2 == wq31Var.a) {
            return;
        }
        wq31Var.a = f2;
        wq31Var.b((Rect) null);
        wq31Var.invalidateSelf();
    }
}
