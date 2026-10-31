package p;

import android.icu.text.UnicodeSet;
import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;
import com.spotify.concertcampaignview.v1.CtaType;
import com.spotify.upsells.v1.proto.ContentMetadata;
import com.spotify.upsells.v1.proto.GatedFeatureContext;
import com.spotify.upsells.v1.proto.GetUpsellRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class ouo1 {
    public static b180 a;

    public static final void B(int i, String str, b0k b0kVar, qim0 qim0Var) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(3127308);
        int i2 = (x340Var.g(str) ? 4 : 2) | i | (x340Var.i(qim0Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            uwr uwrVar = cbx.a;
            zov0 zov0Var = cbx.b(x340Var).g;
            w0h1.a(wsx.c, isl.a, u291.r(qim0Var, 12.0f), d9p1.o(str, x340Var, i2 & 14), 0L, false, x340Var, wsx.d | 48, 48);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new rj(str, qim0Var, i, (byte) 27);
        }
    }

    public static final void F(int i, String str, b0k b0kVar, qim0 qim0Var) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2038782795);
        int i2 = (x340Var.g(str) ? 4 : 2) | i | (x340Var.i(qim0Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            eso1.e(Uri.parse(str), isl.a, qim0Var, (p3v) null, (zvx) null, (ecx) null, mif1.Q0, (tl3) null, (ColorFilter) null, (qux) null, true, false, x340Var, ((i2 << 3) & 896) | 199728, 6, 2960);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new rj(str, qim0Var, i, (byte) 28);
        }
    }

    public static final qim0 H(String str, List list) {
        boolean zIsEmpty = list.isEmpty();
        nim0 nim0Var = nim0.a;
        return zIsEmpty ? nim0Var : zr7.i(nim0Var, new uf(list, str));
    }

    public static qqb K(b0k b0kVar) {
        nx61 nx61Var = vu40.h;
        vu40 vu40Var = (vu40) ((x340) b0kVar).k(wu40.a);
        qqb qqbVar = vu40Var.g;
        if (qqbVar != null) {
            return qqbVar;
        }
        n8b1 n8b1Var = x3d1.a;
        qqb qqbVarD = k1u.d(2.0f, vu40Var.a.g);
        vu40Var.g = qqbVarD;
        return qqbVarD;
    }

    public static final GetUpsellRequest O(GatedFeatureContext gatedFeatureContext, e2i1 e2i1Var, wpv0 wpv0Var, fyl fylVar) {
        List listSingletonList;
        dr40 dr40VarP = GetUpsellRequest.p();
        dr40VarP.r(gatedFeatureContext);
        if (fylVar != null) {
            String str = fylVar.a;
            if (ihc1.y0(str)) {
                str = null;
            }
            if (str != null) {
                cyl cylVarN = ContentMetadata.n();
                cylVarN.n(str);
                dr40VarP.q((ContentMetadata) cylVarN.build());
            }
        }
        ArrayList arrayList = new ArrayList();
        int iOrdinal = e2i1Var.ordinal();
        if (iOrdinal == 0) {
            listSingletonList = Collections.singletonList(xpt.DEVICE_CAPABILITY_INLINE_UPSELL);
        } else {
            if (iOrdinal != 1) {
                eg.o();
                return null;
            }
            listSingletonList = p7h.M(new xpt[]{xpt.DEVICE_CAPABILITY_BOTTOMSHEET_UPSELL, xpt.DEVICE_CAPABILITY_BOTTOM_SHEET_MEDIA});
        }
        arrayList.addAll(listSingletonList);
        arrayList.add(xpt.DEVICE_CAPABILITY_SIGNIFIER);
        if (wpv0Var.b.a()) {
            arrayList.add(xpt.DEVICE_CAPABILITY_GENERIC_CONSIDERATION_PAGE);
        }
        dr40VarP.n(arrayList);
        return dr40VarP.build();
    }

    public static final o3r P(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        jd11 jd11Var = rc11.a;
        return w3p1.f(new l4r(new xv00(jd11Var.b(jo70.class)), 1, mm01.i, new j4r(mm01.X), mm01.t), new l4r(new xv00(jd11Var.b(xkk1.class)), 2, th01.c1, new j4r(mm01.Y), th01.e1), new l4r(new xv00(jd11Var.b(hll.class)), 2, mm01.b, new j4r(mm01.Z), mm01.c), new l4r(new xv00(jd11Var.b(a7q0.class)), 2, mm01.d, new j4r(new nm01(z, z2, z3, z4)), mm01.e), new l4r(new xv00(jd11Var.b(zoy0.class)), 2, mm01.f, new j4r(mm01.N0), mm01.g), new l4r(new xv00(jd11Var.b(hzy.class)), 2, mm01.h, new j4r(mm01.O0), th01.S0), new l4r(new xv00(jd11Var.b(fuj0.class)), 2, th01.T0, new j4r(mm01.P0), th01.U0), new l4r(new xv00(jd11Var.b(dxc0.class)), 2, th01.V0, new j4r(mm01.Q0), th01.W0), new l4r(new xv00(jd11Var.b(ldj1.class)), 2, th01.X0, new j4r(mm01.R0), th01.Y0), new l4r(new xv00(jd11Var.b(mtl.class)), 2, th01.Z0, new j4r(new klf(z5, z6, (byte) 2)), th01.a1), new l4r(jd0.h, 2, th01.b1, new j4r(new mj10((byte) 22, z7)), th01.d1), pci0.c);
    }

    public static final boolean Q(String str, String str2) {
        return u890.j(str, str2);
    }

    public static final boolean W(String str) {
        UnicodeSet unicodeSet = new UnicodeSet();
        unicodeSet.addAll(9, 10);
        unicodeSet.add(13);
        unicodeSet.addAll(32, 126);
        unicodeSet.addAll(32, 126);
        unicodeSet.addAll(160, 172);
        unicodeSet.addAll(174, 311);
        unicodeSet.addAll(313, 328);
        unicodeSet.addAll(330, 382);
        unicodeSet.add(399);
        unicodeSet.addAll(416, 417);
        unicodeSet.addAll(431, 432);
        unicodeSet.addAll(461, 468);
        unicodeSet.addAll(486, 487);
        unicodeSet.addAll(CtaType.CTA_NOT_INTERESTED_FIELD_NUMBER, 501);
        unicodeSet.addAll(506, 511);
        unicodeSet.addAll(536, 539);
        unicodeSet.addAll(550, 551);
        unicodeSet.addAll(562, 563);
        unicodeSet.add(567);
        unicodeSet.add(601);
        unicodeSet.add(CtaType.SEE_ALL_SHOWS_FIELD_NUMBER);
        unicodeSet.addAll(710, 711);
        unicodeSet.addAll(728, 733);
        unicodeSet.addAll(768, 772);
        unicodeSet.addAll(774, 780);
        unicodeSet.add(786);
        unicodeSet.add(795);
        unicodeSet.add(803);
        unicodeSet.addAll(806, 808);
        unicodeSet.addAll(821, 824);
        unicodeSet.add(3647);
        unicodeSet.addAll(7692, 7693);
        unicodeSet.addAll(7712, 7713);
        unicodeSet.addAll(7716, 7717);
        unicodeSet.addAll(7734, 7735);
        unicodeSet.addAll(7748, 7749);
        unicodeSet.addAll(7766, 7767);
        unicodeSet.addAll(7778, 7779);
        unicodeSet.addAll(7788, 7789);
        unicodeSet.addAll(7808, 7813);
        unicodeSet.addAll(7818, 7821);
        unicodeSet.addAll(7826, 7827);
        unicodeSet.add(7838);
        unicodeSet.addAll(7840, 7929);
        unicodeSet.addAll(8194, 8195);
        unicodeSet.addAll(8201, 8202);
        unicodeSet.addAll(8208, 8209);
        unicodeSet.addAll(8211, 8213);
        unicodeSet.addAll(8216, 8218);
        unicodeSet.addAll(8220, 8222);
        unicodeSet.addAll(8224, 8226);
        jup0.j(unicodeSet, 8230, 8232, 8233, 8239);
        unicodeSet.add(8240);
        unicodeSet.addAll(8242, 8243);
        unicodeSet.addAll(8249, 8250);
        unicodeSet.add(8260);
        unicodeSet.add(8304);
        unicodeSet.addAll(8308, 8313);
        unicodeSet.addAll(8320, 8329);
        jup0.j(unicodeSet, 8358, 8361, 8362, 8364);
        jup0.j(unicodeSet, 8372, 8376, 8378, 8381);
        unicodeSet.add(8383);
        unicodeSet.add(8467);
        unicodeSet.addAll(8470, 8471);
        unicodeSet.add(8482);
        unicodeSet.add(8486);
        unicodeSet.addAll(8544, 8553);
        unicodeSet.addAll(8556, 8559);
        unicodeSet.addAll(8592, 8595);
        unicodeSet.addAll(8598, 8601);
        unicodeSet.add(8706);
        unicodeSet.add(8710);
        jup0.j(unicodeSet, 8719, 8721, 8722, 8725);
        unicodeSet.add(8730);
        unicodeSet.add(8734);
        unicodeSet.add(8747);
        unicodeSet.add(8776);
        jup0.j(unicodeSet, 8800, 8804, 8805, 42889);
        unicodeSet.addAll(64257, 64258);
        return unicodeSet.containsAll(str);
    }

    public static final void a(ija ijaVar, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1699683658);
        j06 j06Var = x340Var.a;
        int i2 = (x340Var.g(ijaVar) ? 4 : 2) | i | (x340Var.i(qim0Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            fra fraVar = een.N0;
            d36 d36Var = new d36(24.0f, true, new um5(false));
            qim0 qim0VarB = uyn1.B(qim0Var, 24.0f, 0.0f, 24.0f, 24.0f, 2);
            jw31 jw31VarA = ew31.a(d36Var, fraVar, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarB);
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
            w0h1.a(xxq0.d(ijaVar.a), isl.a, (qim0) null, xxq0.c(ijaVar.b), 0L, false, x340Var, 56, 52);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, nim0.a);
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
            String str = ijaVar.c;
            uwr uwrVar = cbx.a;
            uwo1.e(str, null, cbx.d(x340Var).d, cbx.a(x340Var).b.a, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2034);
            uwo1.e(ijaVar.d, null, cbx.d(x340Var).g, cbx.a(x340Var).b.b, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2034);
            x340Var = x340Var;
            x340Var.r(true);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new pp5(ijaVar, qim0Var, i, (byte) 21);
        }
    }

    public static int a0(String str) {
        return str.hashCode();
    }

    public static final void b(int i, int i2, b0k b0kVar, boolean z) {
        int i3;
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(383156692);
        if ((i2 & 6) == 0) {
            i3 = (b0kVar3.e(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= b0kVar3.h(z) ? 32 : 16;
        }
        byte b = 0;
        byte b2 = 1;
        if (b0kVar3.Y(i3 & 1, (i3 & 19) != 18)) {
            boolean z2 = i % 2 == 0;
            b0kVar2 = b0kVar3;
            jto1.b(u291.f(nim0.a, 1.0f), new uvx((pgx) null, 0, (tvx) null, (p3v) null, 30), null, false, null, null, null, null, apo.r(-402536354, new aw1((byte) 9, z), b0kVar3), null, apo.r(-266449475, new aw1((byte) 10, z), b0kVar3), apo.r(-97305700, new qpf(z2, z, b), b0kVar3), apo.r(71838075, new aw1((byte) 11, z), b0kVar3), null, null, apo.r(579269400, new qpf(z2, z, b2), b0kVar3), b0kVar2, 100663366, 197046, 25340);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new rpf(i, z, i2);
        }
    }

    public static final int c0(int i, int i2) {
        return (i >> i2) & 31;
    }

    public static final dzs0 d0(dzs0 dzs0Var, pys0 pys0Var) {
        String strValueOf;
        ArrayList arrayList = new ArrayList(4);
        for (int i = 0; i < 4; i++) {
            Character chR0 = ihc1.r0(i, pys0Var.a);
            if (chR0 == null || (strValueOf = String.valueOf(chR0.charValue())) == null) {
                strValueOf = "";
            }
            arrayList.add(strValueOf);
        }
        return dzs0.a(dzs0Var, false, arrayList, pys0Var.b, pys0Var.c, 1);
    }

    public static final void g(qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-947595062);
        int i2 = i | 6;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            String strO0 = cwl1.o0(x340Var, 2131962388);
            boolean zB = ef.a(x340Var).b(2);
            qim0Var2 = nim0.a;
            qim0 qim0VarN = anm1.N("chat_shares_loading_skeleton", u291.d(qim0Var2, 1.0f));
            boolean zG = x340Var.g(strO0);
            Object objT = x340Var.T();
            if (zG || objT == m4cVar) {
                objT = new w8c(strO0, (byte) 26);
                x340Var.s0(objT);
            }
            qim0 qim0VarA = s161.a(qim0VarN, (iu30) objT);
            boolean zH = x340Var.h(zB);
            Object objT2 = x340Var.T();
            if (zH || objT2 == m4cVar) {
                objT2 = new gy((byte) 10, zB);
                x340Var.s0(objT2);
            }
            ujo1.d(qim0VarA, null, null, false, null, null, null, false, null, (iu30) objT2, x340Var, 12582912, 382);
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new b5(qim0Var2, i, (byte) 20);
        }
    }

    public static final void h(int i, String str, Function0 function0, b0k b0kVar, boolean z) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1104205187);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(function0) ? 256 : 128;
        }
        if (!x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            x340Var.b0();
        } else {
            if (ihc1.y0("advance payment flow")) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            foo1.c(new gbx(new y50("advance payment flow"), function0), new idx(4), null, z ? jax.a : new hax("payment cannot be advanced"), yla.p(x340Var), null, null, null, null, null, apo.r(-644920162, new pji(str, (byte) 25), x340Var), x340Var, 0, 48, 1996);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new odo(str, z, function0, i);
        }
    }

    public static final void j(String str, String str2, String str3, String str4, String str5, qim0 qim0Var, boolean z, b0k b0kVar, int i) {
        float f;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(984647230);
        int i2 = i | (b0kVar2.g(str) ? 4 : 2) | (b0kVar2.g(str2) ? 32 : 16) | (b0kVar2.g(str3) ? 256 : 128) | (b0kVar2.g(str4) ? 2048 : 1024) | (b0kVar2.g(str5) ? 16384 : 8192) | (b0kVar2.i(qim0Var) ? 131072 : 65536) | (b0kVar2.h(z) ? 1048576 : 524288);
        if (!b0kVar2.Y(i2 & 1, (599187 & i2) != 599186)) {
            b0kVar2.b0();
        } else if (str.length() > 0) {
            b0kVar2.i0(-1000764761);
            if (z) {
                b0kVar2.i0(1353192079);
                uwr uwrVar = cbx.a;
                zov0 zov0Var = cbx.b(b0kVar2).g;
                b0kVar2.r(false);
                f = 16.0f;
            } else {
                b0kVar2.i0(1353194028);
                uwr uwrVar2 = cbx.a;
                zov0 zov0Var2 = cbx.b(b0kVar2).g;
                b0kVar2.r(false);
                f = 24.0f;
            }
            jw31 jw31VarA = ew31.a(h36.a, een.N0, b0kVar2, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0VarE = zr7.E(b0kVar2, qim0Var);
            hzj.A.getClass();
            if (((x340) b0kVar2).a == null) {
                tgp1.p();
                throw null;
            }
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(hmb0.t1);
            } else {
                b0kVar2.v0();
            }
            nko1.H(jw31VarA, b0kVar2, y580.O0);
            nko1.H(xos0VarM, b0kVar2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar2, y580.R0);
            nko1.F(b0kVar2);
            nko1.H(qim0VarE, b0kVar2, y580.Y);
            cua cuaVar = cbx.b(b0kVar2).f;
            cr31 cr31VarB = er31.b(2.0f);
            nim0 nim0Var = nim0.a;
            qim0 qim0VarQ = i1p1.q(nim0Var, cr31VarB);
            eso1.e(Uri.parse(str), isl.a, qim0VarQ, new p3v(f), (zvx) null, (ecx) null, mif1.P0, (tl3) null, (ColorFilter) null, (qux) null, true, false, b0kVar2, 196656, 6, 2960);
            b0kVar2 = b0kVar2;
            cvx cvxVar = cbx.b(b0kVar2).b;
            k(str2, str3, str4, str5, c13.k(nim0Var, 4.0f, b0kVar2, 1.0f, true), b0kVar2, (i2 >> 3) & 8190);
            b0kVar2.r(true);
            b0kVar2.r(false);
        } else {
            b0kVar2.i0(-999926025);
            k(str2, str3, str4, str5, qim0Var, b0kVar2, (i2 >> 3) & 65534);
            b0kVar2.r(false);
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new uu(str, str2, str3, str4, str5, qim0Var, z, i);
        }
    }

    public static final void k(String str, String str2, String str3, String str4, qim0 qim0Var, b0k b0kVar, int i) {
        String str5;
        int i2;
        x340 x340Var;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-1952920380);
        if ((i & 6) == 0) {
            str5 = str;
            i2 = (x340Var2.g(str5) ? 4 : 2) | i;
        } else {
            str5 = str;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var2.g(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var2.g(str3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var2.g(str4) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var2.i(qim0Var) ? 16384 : 8192;
        }
        if (x340Var2.Y(i2 & 1, (i2 & 9363) != 9362)) {
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0Var);
            hzj.A.getClass();
            if (x340Var2.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(hmb0.t1);
            } else {
                x340Var2.v0();
            }
            nko1.H(mbhVarA, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            long jO = d9p1.o(str3, x340Var2, (i2 >> 6) & 14);
            cjc0 cjc0Var = new cjc0(1);
            uwr uwrVar = cbx.a;
            uwo1.e(str5, null, cbx.d(x340Var2).o, jO, new a0e1(5), null, 2, false, cjc0Var, 0, null, x340Var2, i2 & 14, 0, 1698);
            x340Var = x340Var2;
            if (str2.length() > 0) {
                x340Var.i0(412722882);
                uwo1.e(str2, null, cbx.d(x340Var).o, d9p1.o(str4, x340Var, (i2 >> 9) & 14), new a0e1(5), null, 2, false, new cjc0(1), 0, null, x340Var, (i2 >> 3) & 14, 0, 1698);
                x340Var = x340Var;
                x340Var.r(false);
            } else {
                x340Var.i0(412980616);
                x340Var.r(false);
            }
            x340Var.r(true);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new yx(str, str2, str3, str4, qim0Var, i, (byte) 1);
        }
    }

    public static final void l(yzg yzgVar, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-819931680);
        if ((i & 6) == 0) {
            i2 = i | (x340Var.g(yzgVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(function0) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            int i4 = i3 << 6;
            qim0 qim0Var3 = nim0.a;
            d9p1.e(yzgVar.n, yzgVar.o, yzgVar.p, function0, qim0Var3, 0.0f, apo.r(-1601512924, new o8x(yzgVar, (byte) 24), x340Var), x340Var, (i4 & 7168) | 1572864 | (i4 & 57344), 32);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ze10(yzgVar, function0, qim0Var2, i, (byte) 1);
        }
    }

    public static final void n(String str, gbx gbxVar, yf yfVar, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-291221887);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.i(gbxVar) ? 32 : 16) | (x340Var.i(yfVar) ? 256 : 128) | (x340Var.i(qim0Var) ? 2048 : 1024);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            foo1.c(gbxVar, yfVar, qim0Var, null, yla.s(x340Var), null, null, null, null, null, apo.r(-1396853726, new y5d0(str, (byte) 28), x340Var), x340Var, (i2 >> 3) & 1022, 48, 2008);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new w0f0(i, str, gbxVar, yfVar, qim0Var, (byte) 18);
        }
    }

    public static final void r(int i, Function0 function0, Function0 function1, Function0 function2, b0k b0kVar, pgx pgxVar, rwi0 rwi0Var, qim0 qim0Var, boolean z, boolean z2) {
        int i2;
        Function0 function3;
        Function0 function4;
        Function0 function5;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-64970191);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(rwi0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            function3 = function0;
            i2 |= x340Var.i(function3) ? 32 : 16;
        } else {
            function3 = function0;
        }
        if ((i & 384) == 0) {
            function4 = function1;
            i2 |= x340Var.i(function4) ? 256 : 128;
        } else {
            function4 = function1;
        }
        if ((i & 3072) == 0) {
            function5 = function2;
            i2 |= x340Var.i(function5) ? 2048 : 1024;
        } else {
            function5 = function2;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.i(pgxVar) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= x340Var.h(z) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= x340Var.h(z2) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= x340Var.i(qim0Var) ? 8388608 : 4194304;
        }
        if (x340Var.Y(i2 & 1, (4793491 & i2) != 4793490)) {
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = v8r.q(Boolean.TRUE);
                x340Var.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = v8r.q(Boolean.FALSE);
                x340Var.s0(objT2);
            }
            fq7.g(((Boolean) ven0Var.getValue()).booleanValue(), (qim0) null, (bby) null, xay.l(13, (ni20) null).a(xay.f(3, (ni20) null)), (String) null, apo.r(-1882970023, new vtf0(qim0Var, pgxVar, z, z2, (ven0) objT2, rwi0Var, function5, ven0Var, function3, function4), x340Var), x340Var, 196608, 22);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new rf6(i, function0, function1, function2, pgxVar, rwi0Var, qim0Var, z, z2);
        }
    }

    public static final void s(int i, Function0 function0, Function0 function1, Function0 function2, b0k b0kVar, pgx pgxVar, rwi0 rwi0Var, qim0 qim0Var, boolean z, boolean z2) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1172487);
        int i2 = (x340Var.g(rwi0Var) ? 4 : 2) | i | (x340Var.i(function0) ? 32 : 16) | (x340Var.i(function1) ? 256 : 128) | (x340Var.i(function2) ? 2048 : 1024) | (x340Var.i(qim0Var) ? 16384 : 8192) | (x340Var.i(pgxVar) ? 131072 : 65536) | (x340Var.h(z2) ? 8388608 : 4194304);
        if (x340Var.Y(i2 & 1, (4793491 & i2) != 4793490)) {
            x340Var.d0();
            if ((i & 1) != 0 && !x340Var.E()) {
                x340Var.b0();
            }
            x340Var.s();
            x340Var.i0(570211149);
            int i3 = i2 >> 3;
            r(((i2 << 9) & 29360128) | (i2 & 8190) | (57344 & i3) | 196608 | (i3 & 3670016), function0, function1, function2, x340Var, pgxVar, rwi0Var, qim0Var, z, z2);
            x340Var.r(false);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new m8m(i, function0, function1, function2, pgxVar, rwi0Var, qim0Var, z, z2);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void t(int i, int i2, b0k b0kVar, qim0 qim0Var) throws NoWhenBranchMatchedException {
        x340 x340Var = (x340) b0kVar;
        int i3 = (kk0.t(1879616631, i, x340Var) ? 4 : 2) | i2 | 48;
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            int iC = l1d.C(i);
            isl islVar = isl.a;
            qim0Var = nim0.a;
            if (iC == 0) {
                x340Var.i0(-1869645455);
                eox eoxVar = eox.c;
                qim0 qim0VarN = anm1.N("message-box-ui-information-alt-icon", qim0Var);
                uwr uwrVar = cbx.a;
                w0h1.a(eoxVar, islVar, qim0VarN, cbx.a(x340Var).b.b, 0L, false, x340Var, eox.d | 48, 48);
                x340Var.r(false);
            } else if (iC == 1) {
                x340Var.i0(-1869636540);
                rtx rtxVar = rtx.c;
                qim0 qim0VarN2 = anm1.N("message-box-ui-unlocked-icon", qim0Var);
                uwr uwrVar2 = cbx.a;
                w0h1.a(rtxVar, islVar, qim0VarN2, cbx.a(x340Var).b.b, 0L, false, x340Var, rtx.d | 48, 48);
                x340Var.r(false);
            } else if (iC == 2) {
                x340Var.i0(-1869627893);
                wsx wsxVar = wsx.c;
                qim0 qim0VarN3 = anm1.N("message-box-ui-spotify-logo-icon", qim0Var);
                uwr uwrVar3 = cbx.a;
                w0h1.a(wsxVar, islVar, qim0VarN3, cbx.a(x340Var).b.b, 0L, false, x340Var, wsx.d | 48, 48);
                x340Var.r(false);
            } else {
                if (iC != 3) {
                    throw p3d1.k(x340Var, -1869645990, false);
                }
                x340Var.i0(-1869619241);
                cnx cnxVar = cnx.c;
                qim0 qim0VarN4 = anm1.N("message-box-ui-exclamation-circle-icon", qim0Var);
                uwr uwrVar4 = cbx.a;
                w0h1.a(cnxVar, islVar, qim0VarN4, cbx.a(x340Var).b.b, 0L, false, x340Var, cnx.d | 48, 48);
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new mq2((byte) 21, i, i2, qim0Var);
        }
    }

    public static final void x(float f, float f2, int i, b0k b0kVar, boolean z) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(213673900);
        if ((i & 6) == 0) {
            i2 = (x340Var.d(f) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.d(f2) ? 32 : 16;
        }
        int i3 = i2 | (x340Var.h(z) ? 256 : 128);
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            uwr uwrVar = cbx.a;
            long jA = cbx.a(x340Var).a.b.a();
            cua cuaVar = cbx.b(x340Var).f;
            cr31 cr31VarB = er31.b(4.0f);
            qim0 qim0VarL0 = nim0.a;
            qim0 qim0VarF = dug.f(u291.s(qim0VarL0, f, f2), jA, cr31VarB);
            if (z) {
                qim0VarL0 = cwl1.l0(qim0VarL0, jA, cr31VarB, 12);
            }
            t1c.a(qim0VarF.then(qim0VarL0), x340Var, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new tpf(f, f2, z, i);
        }
    }
}
