package p;

import android.content.res.Configuration;
import android.graphics.Color;
import android.icu.text.DateTimePatternGenerator;
import android.net.Uri;
import android.view.View;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.protobuf.Timestamp;
import com.spotify.concertcampaignview.v1.CampaignCard;
import com.spotify.concertcampaignview.v1.CampaignCardDecoratedText;
import com.spotify.concertcampaignview.v1.CampaignCardPlaceholderValue;
import com.spotify.concertcampaignview.v1.CampaignCardTagText;
import com.spotify.concertcampaignview.v1.CtaType;
import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.ZonedDateTime;
import j$.time.format.DateTimeFormatter;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class grn1 {
    public static b180 a = null;
    public static final int b = 9;
    public static final int c = 10;
    public static final int d = 12;

    /* JADX WARN: Code duplicated, block: B:15:0x0088  */
    public static final i5d A(CampaignCard campaignCard, boolean z) {
        String u7hVar;
        Long lValueOf;
        f7d f7dVar;
        String string;
        af5 af5Var = (af5) p(campaignCard.p()).a;
        mmr0 mmr0VarP = p(campaignCard.q());
        af5 af5Var2 = (af5) mmr0VarP.a;
        Long l = (Long) mmr0VarP.b;
        af5 af5Var3 = (af5) p(campaignCard.o()).a;
        u7h u7hVarS = s(campaignCard.p());
        u7h u7hVarS2 = s(campaignCard.q());
        u7h u7hVarS3 = s(campaignCard.o());
        h290 h290VarN = campaignCard.n();
        ArrayList arrayList = new ArrayList();
        Iterator it = h290VarN.iterator();
        while (true) {
            u7hVar = null;
            if (!it.hasNext()) {
                break;
            }
            CtaType ctaType = (CtaType) it.next();
            ctaType.getClass();
            boolean z2 = ctaType.s() == udo.CTA_STYLE_PRIMARY;
            if (ctaType.A()) {
                string = ihc1.e1(ctaType.r()).toString();
                if (ihc1.y0(string)) {
                    string = null;
                }
            } else {
                string = null;
            }
            if (ctaType.x()) {
                String strP = ctaType.p().p();
                if (!ctaType.p().t()) {
                    strP = null;
                }
                String strR = r(strP);
                String str = strR == null ? string : strR;
                String strN = ctaType.p().n();
                if (!ctaType.p().s()) {
                    strN = null;
                }
                String strR2 = r(strN);
                String strQ = ctaType.p().q();
                if (!ctaType.p().u()) {
                    strQ = null;
                }
                u7hVar = new q5d(str, strR2, r(strQ), r(ctaType.p().v() ? ctaType.p().r() : null), z2);
            } else if (ctaType.v()) {
                u7hVar = new o5d(z2, string);
            } else if (ctaType.z()) {
                u7hVar = new t5d(z2, string);
            } else if (ctaType.u()) {
                u7hVar = new n5d(ctaType.o().o().getTitle(), ctaType.o().o().getDescription(), string, z2);
            } else if (ctaType.w()) {
                u7hVar = new p5d(z2, string);
            } else if (ctaType.t()) {
                u7hVar = new m5d(z2, ctaType.n().o(), string);
            } else if (ctaType.B()) {
                u7hVar = new r5d(z2, string);
            } else if (ctaType.y() && z) {
                String string2 = ihc1.e1(ctaType.q().getEntityUri()).toString();
                if (string2.length() <= 0) {
                    string2 = null;
                }
                if (string2 != null) {
                    u7hVar = new s5d(z2, string2, string);
                }
            }
            if (u7hVar != null) {
                arrayList.add(u7hVar);
            }
        }
        if (campaignCard.v()) {
            Timestamp timestampR = campaignCard.r();
            lValueOf = Long.valueOf((timestampR.q() * 1000) + ((long) (timestampR.p() / 1000000)));
        } else {
            lValueOf = null;
        }
        if (campaignCard.hasTag()) {
            CampaignCardTagText campaignCardTagTextU = campaignCard.u();
            af5 af5Var4 = (af5) p(campaignCardTagTextU.o()).a;
            String strN2 = campaignCardTagTextU.n();
            strN2.getClass();
            if (strN2.length() <= 0) {
                strN2 = null;
            }
            if (strN2 != null) {
                try {
                    u7hVar = new u7h(z4p1.e(Color.parseColor(strN2)));
                } catch (IllegalArgumentException unused) {
                }
            }
            f7dVar = new f7d(af5Var4, u7hVar, s(campaignCardTagTextU.o()));
        } else {
            f7dVar = null;
        }
        return new i5d(af5Var, u7hVarS, af5Var2, u7hVarS2, af5Var3, u7hVarS3, arrayList, lValueOf, l, f7dVar, campaignCard.s(), campaignCard.t());
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void a(int i, int i2, String str, b0k b0kVar, qim0 qim0Var) throws NoWhenBranchMatchedException {
        b0k b0kVar2;
        cr31 cr31VarB;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(594722672);
        int i3 = i2 | (b0kVar3.g(str) ? 4 : 2) | (b0kVar3.e(l1d.C(i)) ? 32 : 16) | (b0kVar3.g(qim0Var) ? 256 : 128);
        if (b0kVar3.Y(i3 & 1, (i3 & 147) != 146)) {
            int iC = l1d.C(i);
            if (iC == 0) {
                b0kVar3.i0(297847323);
                b0kVar3.r(false);
                cr31VarB = er31.a;
            } else {
                if (iC != 1) {
                    throw p3d1.k(b0kVar3, 297841780, false);
                }
                b0kVar3.i0(297843912);
                uwr uwrVar = cbx.a;
                cua cuaVar = cbx.b(b0kVar3).f;
                cr31VarB = er31.b(4.0f);
                b0kVar3.r(false);
            }
            cr31 cr31Var = cr31VarB;
            Uri uri = Uri.parse(str == null ? "" : str);
            qim0 qim0VarR = d7e.r(1.0f, u291.f(qim0Var, 1.0f), false);
            uwr uwrVar2 = cbx.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            long j = u7h.b;
            b0kVar2 = b0kVar3;
            eso1.e(uri, isl.a, i1p1.q(sto1.o(qim0VarR, 12.0f, cr31Var, false, u7h.b(j, 0.3f, 0.0f, 0.0f, 0.0f, 14), u7h.b(j, 0.3f, 0.0f, 0.0f, 0.0f, 14), 4), cr31Var), (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, (qux) null, false, false, b0kVar2, 27696, 0, 4064);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new gy0((byte) 18, i, i2, str, qim0Var);
        }
    }

    public static final void b(int i, j2i j2iVar, b0k b0kVar, vu30 vu30Var, vu30 vu30Var2, qim0 qim0Var) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-773651898);
        int i2 = (x340Var.i(vu30Var) ? 32 : 16) | i | (x340Var.i(vu30Var2) ? 256 : 128) | (x340Var.i(qim0Var) ? 2048 : 1024);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            boolean z = ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new mzj(vu30Var, vu30Var2, j2iVar, (byte) 19);
                x340Var.s0(objT);
            }
            ejo1.l((i2 >> 9) & 14, 0, x340Var, (vu30) objT, qim0Var);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new n7m(i, j2iVar, vu30Var, vu30Var2, qim0Var, (byte) 1);
        }
    }

    public static final void c(int i, int i2, Function0 function0, b0k b0kVar, qim0 qim0Var, boolean z) {
        b0k b0kVar2;
        qim0 qim0Var2;
        oex oexVar;
        qim0 qim0VarY;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(2019660758);
        int i3 = i2 | (b0kVar3.h(z) ? 4 : 2) | (b0kVar3.e(l1d.C(i)) ? 32 : 16) | (b0kVar3.i(function0) ? 256 : 128) | 3072;
        if (b0kVar3.Y(i3 & 1, (i3 & 1171) != 1170)) {
            String strO0 = cwl1.o0(b0kVar3, 2131952839);
            uwr uwrVar = cbx.a;
            long j = cbx.a(b0kVar3).b.e;
            if (z) {
                b0kVar3.i0(-482893465);
                boolean zF = b0kVar3.f(j);
                Object objT = b0kVar3.T();
                if (zF || objT == m4cVar) {
                    objT = new sre((byte) 15, j);
                    b0kVar3.s0(objT);
                }
                vu30 vu30Var = (vu30) objT;
                vu30 vu30Var2 = ((pgx) ogx.e).b;
                boolean zF2 = b0kVar3.f(j);
                Object objT2 = b0kVar3.T();
                if (zF2 || objT2 == m4cVar) {
                    objT2 = new sre((byte) 16, j);
                    b0kVar3.s0(objT2);
                }
                oexVar = new oex(0, vu30Var, vu30Var2, (vu30) objT2, 1);
                b0kVar3.r(false);
            } else {
                b0kVar3.i0(-482697080);
                b0kVar3.r(false);
                oexVar = pex.b;
            }
            oex oexVar2 = oexVar;
            if (ihc1.y0(strO0)) {
                hhg1.n("Please consider providing a non-empty action label to provide a more accessible experience for everyone. You can use SelfDescribed if the content description is sufficient.");
                return;
            }
            gbx gbxVar = new gbx(new y50(strO0), function0);
            lex lexVarZ = yoo1.z(b0kVar3);
            qim0 qim0Var3 = nim0.a;
            if (i == 1) {
                b0kVar3.i0(-482172839);
                cvx cvxVar = cbx.b(b0kVar3).b;
                cvx cvxVar2 = cbx.b(b0kVar3).b;
                qim0VarY = uyn1.y(qim0Var3, 16.0f, 8.0f);
                b0kVar3.r(false);
            } else {
                b0kVar3.i0(-481993814);
                b0kVar3.r(false);
                qim0VarY = qim0Var3;
            }
            b0kVar2 = b0kVar3;
            poo1.e(gbxVar, oexVar2, lexVarZ, anm1.N("edit_prompt_chip", qim0VarY), 0, null, null, apo.r(828255390, new dr0((byte) 20, z), b0kVar3), null, null, null, false, null, apo.r(578889777, new qeu(strO0, (byte) 8), b0kVar3), b0kVar2, 12582912, 3072, 8048);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new oj8(z, i, function0, qim0Var2, i2);
        }
    }

    public static final void d(Function0 function0, Function0 function1, qim0 qim0Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        qim0 qim0Var2;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(974581685);
        int i2 = i | (b0kVar3.i(function0) ? 4 : 2) | (b0kVar3.i(function1) ? 32 : 16) | 384;
        if (b0kVar3.Y(i2 & 1, (i2 & 147) != 146)) {
            String strO0 = cwl1.o0(b0kVar3, 2131964179);
            String strO1 = cwl1.o0(b0kVar3, 2131964180);
            String strO2 = cwl1.o0(b0kVar3, 2131964181);
            ye5 ye5VarO = kk0.o(270142733, b0kVar3);
            String str = String.format(strO0, Arrays.copyOf(new Object[]{strO1, strO2}, 2));
            int iW0 = ihc1.w0(str, strO1, 0, false, 6);
            int length = strO1.length() + iW0;
            int iW1 = ihc1.w0(str, strO2, 0, false, 6);
            int length2 = strO2.length() + iW1;
            ye5VarO.g(str.substring(0, iW0));
            boolean z = (i2 & 14) == 4;
            Object objT = b0kVar3.T();
            if (z || objT == m4cVar) {
                objT = new izg1(function0, (byte) 16);
                b0kVar3.s0(objT);
            }
            vhg.a(ye5VarO, strO1, "your_updates_empty_state_music_link", vhg.a, (iu30) objT);
            ye5VarO.g(str.substring(length, iW1));
            boolean z2 = (i2 & 112) == 32;
            Object objT2 = b0kVar3.T();
            if (z2 || objT2 == m4cVar) {
                objT2 = new izg1(function1, (byte) 17);
                b0kVar3.s0(objT2);
            }
            vhg.a(ye5VarO, strO2, "your_updates_empty_state_podcasts_link", vhg.a, (iu30) objT2);
            ye5VarO.g(str.substring(length2));
            af5 af5VarP = ye5VarO.p();
            b0kVar3.r(false);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            qim0 qim0Var3 = nim0.a;
            b0kVar2 = b0kVar3;
            uwo1.d(af5VarP, cbx.a(b0kVar3).b.b, uyn1.B(qim0Var3, 0.0f, 16.0f, 0.0f, 0.0f, 13), cbx.d(b0kVar3).j, new a0e1(3), null, 0, false, null, 0, null, null, b0kVar2, 0, 0, 4064);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new yv60(function0, function1, qim0Var2, i, (byte) 4);
        }
    }

    public static final void e(int i, Function0 function0, b0k b0kVar, qim0 qim0Var, jtl1 jtl1Var, boolean z) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1798310074);
        int i2 = i | (x340Var.i(jtl1Var) ? 4 : 2) | (x340Var.i(function0) ? 32 : 16) | 384 | (x340Var.h(z) ? 2048 : 1024);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            ven0 ven0VarJ = f4p1.j(new xr0(jtl1Var.b, (byte) 14), Boolean.FALSE, (iac0) null, x340Var, 48, 14);
            String strO0 = cwl1.o0(x340Var, z ? 2131960764 : 2131963231);
            uwr uwrVar = cbx.a;
            long j = cbx.a(x340Var).b.a;
            boolean z2 = (i2 & 112) == 32;
            Object objT = x340Var.T();
            if (z2 || objT == fkj0.X) {
                objT = new zg20(function0, (byte) 26);
                x340Var.s0(objT);
            }
            Function0 function1 = (Function0) objT;
            if (ihc1.y0(strO0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            gbx gbxVar = new gbx(new y50(strO0), function1);
            boolean zBooleanValue = ((Boolean) ven0VarJ.getValue()).booleanValue();
            j2i j2iVar = hri.a;
            qim0 qim0Var3 = nim0.a;
            upo1.l(strO0, j, gbxVar, true, zBooleanValue, qim0Var3, false, null, j2iVar, x340Var, 805506048, 448);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new pn50(jtl1Var, function0, qim0Var2, z, i);
        }
    }

    public static final void f(String str, String str2, long j, String str3, Locale locale, long j2, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(618532470);
        int i2 = i | (x340Var2.g(str) ? 4 : 2) | (x340Var2.g(str2) ? 32 : 16) | (x340Var2.f(j) ? 256 : 128) | (x340Var2.g(str3) ? 2048 : 1024) | (x340Var2.g(locale) ? 16384 : 8192) | (x340Var2.f(j2) ? 131072 : 65536) | (x340Var2.g(qim0Var) ? 1048576 : 524288);
        if (x340Var2.Y(i2 & 1, (599187 & i2) != 599186)) {
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0Var);
            hzj.A.getClass();
            String str4 = null;
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
            uwr uwrVar = cbx.a;
            int i3 = (i2 >> 6) & 7168;
            uwo1.e(str, null, cbx.d(x340Var2).h, j2, null, null, 2, false, new cjc0(1), 0, null, x340Var2, (i2 & 14) | 1572864 | i3, 0, 1714);
            x340Var = x340Var2;
            if (str2 != null && str2.length() > 0) {
                str4 = str2;
            }
            if (str4 == null) {
                x340Var.i0(1769041745);
                x340Var.r(false);
            } else {
                x340Var.i0(1769041746);
                uwo1.e(str4, null, cbx.d(x340Var).m, j2, null, null, 2, false, new cjc0(1), 0, null, x340Var, i3 | 1572864, 0, 1714);
                x340Var.r(false);
            }
            if (str3 == null) {
                x340Var = x340Var;
                x340Var.i0(1769284134);
                x340Var.r(false);
            } else {
                x340Var = x340Var;
                x340Var.i0(1769284135);
                x340Var.i0(1442548355);
                ye5 ye5Var = new ye5();
                tr80 tr80Var = (tr80) z561.W(z561.f0(new hqa1(str3, (byte) 3), new rlu(f46.I(new String[]{NumberFormat.getIntegerInstance(locale).format(j), String.valueOf(j)}), new cix0((byte) 17), (byte) 0)));
                if (tr80Var != null) {
                    int i4 = ((rr80) tr80Var).b;
                    int i5 = ((rr80) tr80Var).a;
                    x340Var.i0(-443625441);
                    ye5Var.g(str3.substring(0, i5));
                    ye5Var.o(cbx.d(x340Var).n.a);
                    int i6 = i4 + 1;
                    ye5Var.g(str3.substring(i5, i6));
                    ye5Var.j();
                    ye5Var.g(str3.substring(i6));
                    x340Var.r(false);
                } else {
                    x340Var.i0(1232624094);
                    x340Var.r(false);
                    ye5Var.g(str3);
                }
                af5 af5VarP = ye5Var.p();
                x340Var.r(false);
                x340 x340Var3 = x340Var;
                uwo1.d(af5VarP, j2, null, cbx.d(x340Var).m, null, null, 2, false, new cjc0(1), 0, null, null, x340Var3, ((i2 >> 12) & 112) | 1572864, 0, 3764);
                x340Var = x340Var3;
                x340Var.r(false);
            }
            x340Var.r(true);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new tfi0(str, str2, j, str3, locale, j2, qim0Var, i);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void g(int i, zzq0 zzq0Var, c380 c380Var, hcs hcsVar, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i2) throws NoWhenBranchMatchedException {
        qim0 qim0Var2;
        boolean z;
        llj lljVar = y580.Y;
        llj lljVar2 = y580.R0;
        llj lljVar3 = y580.N0;
        llj lljVar4 = y580.O0;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2077989135);
        j06 j06Var = x340Var.a;
        int i3 = i2 | (x340Var.e(l1d.C(i)) ? 4 : 2) | (x340Var.g(zzq0Var) ? 32 : 16) | (x340Var.g(c380Var) ? 256 : 128) | (x340Var.g(hcsVar) ? 2048 : 1024) | (x340Var.i(iu30Var) ? 16384 : 8192) | 196608;
        if (x340Var.Y(i3 & 1, (74899 & i3) != 74898)) {
            stn0 stn0Var = new stn0(c380Var, zzq0Var, hcsVar, iu30Var);
            int iC = l1d.C(i);
            n4k n4kVar = hmb0.t1;
            qim0 qim0Var3 = nim0.a;
            if (iC == 0) {
                x340Var.i0(1865141008);
                View viewM = m((View) x340Var.k(AndroidCompositionLocals_androidKt.f));
                if (viewM == null || viewM.getLayoutParams().width == -1) {
                    z = false;
                    x340Var.i0(1865769812);
                    ern1.h(stn0Var, sgc1.D(1, u291.f(qim0Var3, 1.0f)), x340Var, 0);
                    x340Var.r(false);
                } else {
                    x340Var.i0(1865878808);
                    qim0 qim0VarD = sgc1.D(1, u291.f(qim0Var3, 1.0f));
                    jw31 jw31VarA = ew31.a(h36.a, een.Z, x340Var, 0);
                    int iHashCode = Long.hashCode(x340Var.T);
                    xos0 xos0VarM = x340Var.m();
                    qim0 qim0VarE = zr7.E(x340Var, qim0VarD);
                    hzj.A.getClass();
                    if (j06Var == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var.m0();
                    if (x340Var.S) {
                        x340Var.l(n4kVar);
                    } else {
                        x340Var.v0();
                    }
                    nko1.H(jw31VarA, x340Var, lljVar4);
                    nko1.H(xos0VarM, x340Var, lljVar3);
                    x0d.q(iHashCode, x340Var, lljVar2, x340Var);
                    stn0Var.a(6, apo.r(-510494686, new hmk0(kk0.q(x340Var, qim0VarE, lljVar, 1.0f, true), (byte) 22), x340Var), x340Var);
                    x340Var.r(true);
                    z = false;
                    x340Var.r(false);
                }
                x340Var.r(z);
            } else {
                if (iC != 1) {
                    throw p3d1.k(x340Var, -909671122, false);
                }
                x340Var.i0(-909670880);
                qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
                mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
                int iHashCode2 = Long.hashCode(x340Var.T);
                xos0 xos0VarM2 = x340Var.m();
                qim0 qim0VarE2 = zr7.E(x340Var, qim0VarF);
                hzj.A.getClass();
                if (j06Var == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(mbhVarA, x340Var, lljVar4);
                nko1.H(xos0VarM2, x340Var, lljVar3);
                x0d.q(iHashCode2, x340Var, lljVar2, x340Var);
                nko1.H(qim0VarE2, x340Var, lljVar);
                stn0Var.a(6, j3j.a, x340Var);
                x340Var.r(true);
                x340Var.r(false);
            }
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new lqf0(i, zzq0Var, c380Var, hcsVar, iu30Var, qim0Var2, i2);
        }
    }

    public static final void h(List list, Function0 function0, hz5 hz5Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        Function0 function1;
        x340 x340Var;
        qim0 qim0Var2;
        List list2;
        qim0 qim0Var3;
        err0 err0Var;
        iu30 iu30Var2;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(961795016);
        j06 j06Var = x340Var2.a;
        if ((i & 6) == 0) {
            i2 = (x340Var2.g(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var2.i(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? x340Var2.g(hz5Var) : x340Var2.i(hz5Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var2.i(iu30Var) ? 2048 : 1024;
        }
        int i3 = i2 | 24576;
        if (x340Var2.Y(i3 & 1, (i3 & 9363) != 9362)) {
            Object objT = x340Var2.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = bb00.h(0, x340Var2);
            }
            err0 err0Var2 = (hdn0) objT;
            float fA = ((int) (((crl1) x340Var2.k(t4k.u)).a() & 4294967295L)) * 0.15f;
            boolean z = list.size() > 1;
            qim0 qim0Var4 = nim0.a;
            qim0 qim0VarH = u291.h(qim0Var4, fA);
            WeakHashMap weakHashMap = osl1.x;
            qim0 qim0VarP = x0d.p(lhc.g(x340Var2).g, 32, qim0VarH);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var2).b;
            qim0 qim0VarX = uyn1.x(qim0VarP, 16.0f);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarX);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            boolean z2 = x340Var2.S;
            n4k n4kVar = hmb0.t1;
            if (z2) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(mbhVarA, x340Var2, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var2, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var2, lljVar3);
            nko1.F(x340Var2);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var2, lljVar4);
            qim0 qim0VarF = u291.f(qim0Var4, 1.0f);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode2 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM2 = x340Var2.m();
            qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarF);
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            nko1.H(gfh0VarC, x340Var2, lljVar);
            nko1.H(xos0VarM2, x340Var2, lljVar2);
            x0d.q(iHashCode2, x340Var2, lljVar3, x340Var2);
            nko1.H(qim0VarE2, x340Var2, lljVar4);
            gra graVar = een.g;
            h2c h2cVar = h2c.a;
            qim0 qim0VarA = h2cVar.a(qim0Var4, graVar);
            fra fraVar = een.N0;
            cvx cvxVar2 = cbx.b(x340Var2).b;
            jw31 jw31VarA = ew31.a(new d36(8.0f, true, new um5(false)), fraVar, x340Var2, 0);
            int iHashCode3 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM3 = x340Var2.m();
            qim0 qim0VarE3 = zr7.E(x340Var2, qim0VarA);
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            nko1.H(jw31VarA, x340Var2, lljVar);
            nko1.H(xos0VarM3, x340Var2, lljVar2);
            x0d.q(iHashCode3, x340Var2, lljVar3, x340Var2);
            nko1.H(qim0VarE3, x340Var2, lljVar4);
            zov0 zov0Var = cbx.b(x340Var2).g;
            w0h1.a(cnx.c, isl.a, u291.r(qim0Var4, 16.0f), cbx.a(x340Var2).b.d, 0L, false, x340Var2, cnx.d | 48, 48);
            x340Var = x340Var2;
            if (z) {
                x340Var.i0(1089732307);
                uwo1.e(cwl1.n0(2131958034, new Object[]{Integer.valueOf(err0Var2.s() + 1), Integer.valueOf(list.size())}, x340Var), null, cbx.d(x340Var).j, cbx.a(x340Var).b.b, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2034);
                x340Var = x340Var;
                x340Var.r(false);
            } else {
                x340Var.i0(1089985050);
                x340Var.r(false);
            }
            x340Var.r(true);
            if (z) {
                x340Var.i0(-1622365954);
                qim0 qim0VarA2 = h2cVar.a(qim0Var4, een.i);
                jw31 jw31VarA2 = ew31.a(h36.a, een.Z, x340Var, 0);
                int iHashCode4 = Long.hashCode(x340Var.T);
                xos0 xos0VarM4 = x340Var.m();
                qim0 qim0VarE4 = zr7.E(x340Var, qim0VarA2);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(jw31VarA2, x340Var, lljVar);
                nko1.H(xos0VarM4, x340Var, lljVar2);
                x0d.q(iHashCode4, x340Var, lljVar3, x340Var);
                nko1.H(qim0VarE4, x340Var, lljVar4);
                cvx cvxVar3 = cbx.b(x340Var).b;
                qim0 qim0VarB = uyn1.B(qim0Var4, 0.0f, 0.0f, 16.0f, 0.0f, 11);
                qim0Var3 = qim0Var4;
                zov0 zov0Var2 = cbx.b(x340Var).g;
                qim0 qim0VarR = u291.r(qim0VarB, 16.0f);
                int i4 = i3 & 7168;
                err0Var = err0Var2;
                int i5 = i3 & 14;
                boolean zI = x340Var.i(err0Var) | (i4 == 2048) | (i5 == 4);
                Object objT2 = x340Var.T();
                if (zI || objT2 == m4cVar) {
                    list2 = list;
                    iu30Var2 = iu30Var;
                    objT2 = new pwx0(iu30Var2, list2, err0Var, (byte) 0);
                    x340Var.s0(objT2);
                } else {
                    list2 = list;
                    iu30Var2 = iu30Var;
                }
                x340 x340Var3 = x340Var;
                w0h1.a(qlx.c, new jsl(cwl1.o0(x340Var, 2131958035)), bin.x(qim0VarR, false, null, null, null, (Function0) objT2, 15), 0L, 0L, false, x340Var3, qlx.d, 56);
                zov0 zov0Var3 = cbx.b(x340Var3).g;
                qim0 qim0VarR2 = u291.r(qim0Var3, 16.0f);
                boolean zI2 = x340Var3.i(err0Var) | (i4 == 2048) | (i5 == 4);
                Object objT3 = x340Var3.T();
                if (zI2 || objT3 == m4cVar) {
                    objT3 = new pwx0(iu30Var2, list2, err0Var, (byte) 1);
                    x340Var3.s0(objT3);
                }
                w0h1.a(mlx.c, new jsl(cwl1.o0(x340Var3, 2131958032)), bin.x(qim0VarR2, false, null, null, null, (Function0) objT3, 15), 0L, 0L, false, x340Var3, mlx.d, 56);
                x340Var = x340Var3;
                x340Var.r(true);
                x340Var.r(false);
            } else {
                list2 = list;
                qim0Var3 = qim0Var4;
                err0Var = err0Var2;
                x340Var.i0(-1621235818);
                x340Var.r(false);
            }
            x340Var.r(true);
            cvx cvxVar4 = cbx.b(x340Var).b;
            op71.g(x340Var, u291.h(qim0Var3, 12.0f));
            if (list2.isEmpty()) {
                function1 = function0;
                x340Var.i0(-1542606928);
                x340Var.r(false);
            } else {
                x340Var.i0(-1542867359);
                err0 err0Var3 = err0Var;
                function1 = function0;
                otw.c(hz5Var, new rwx0(err0Var3.s(), (String) list2.get(err0Var3.s()), function1), (qim0) null, (ipb1) null, x340Var, (i3 >> 6) & 14, 12);
                x340Var.r(false);
            }
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            function1 = function0;
            x340Var = x340Var2;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new lqf0(list, function1, hz5Var, iu30Var, qim0Var2, i);
        }
    }

    public static final jns i(iu30 iu30Var) {
        return new jns(iu30Var);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x015c  */
    /* JADX WARN: Code duplicated, block: B:102:0x0179  */
    /* JADX WARN: Code duplicated, block: B:106:0x019f  */
    /* JADX WARN: Code duplicated, block: B:110:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:113:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:116:0x01ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:0x0199 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x00da  */
    /* JADX WARN: Code duplicated, block: B:77:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:81:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:86:0x010d  */
    /* JADX WARN: Code duplicated, block: B:89:0x0120  */
    /* JADX WARN: Code duplicated, block: B:91:0x0124  */
    /* JADX WARN: Code duplicated, block: B:92:0x0128  */
    /* JADX WARN: Code duplicated, block: B:94:0x012c  */
    /* JADX WARN: Code duplicated, block: B:97:0x014c  */
    /* JADX WARN: Code duplicated, block: B:99:0x0159  */
    public static final void j(zk80 zk80Var, Function0 function0, Function0 function1, String str, String str2, String str3, u7h u7hVar, u7h u7hVar2, qim0 qim0Var, b0k b0kVar, int i, int i2) {
        u7h u7hVar3;
        qim0 qim0Var2;
        int i3;
        boolean z;
        b0k b0kVar2;
        qim0 qim0Var3;
        h311 h311VarV;
        qim0 qim0Var4;
        long jA;
        int iC;
        int i4;
        Locale locale;
        String strU;
        ArrayList arrayList;
        long j;
        long j2 = zk80Var.f;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1041869612);
        int i5 = (i & 6) == 0 ? (b0kVar3.i(zk80Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i5 |= b0kVar3.i(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i5 |= b0kVar3.i(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i5 |= b0kVar3.g(str) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i5 |= b0kVar3.g(str2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i5 |= b0kVar3.g(str3) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i5 |= b0kVar3.g(u7hVar) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            u7hVar3 = u7hVar2;
            i5 |= b0kVar3.g(u7hVar3) ? 8388608 : 4194304;
        } else {
            u7hVar3 = u7hVar2;
        }
        int i6 = i2 & 256;
        if (i6 == 0) {
            if ((100663296 & i) == 0) {
                qim0Var2 = qim0Var;
                i5 |= b0kVar3.g(qim0Var2) ? 67108864 : 33554432;
            }
            i3 = i5;
            if ((i5 & 38347923) != 38347922) {
                z = true;
            } else {
                z = false;
            }
            if (b0kVar3.Y(i3 & 1, z)) {
                if (i6 != 0) {
                    qim0Var4 = nim0.a;
                } else {
                    qim0Var4 = qim0Var2;
                }
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(b0kVar3).b;
                if (u7hVar == null) {
                    b0kVar3.i0(509329712);
                    jA = cbx.a(b0kVar3).a.a.a();
                    b0kVar3.r(false);
                } else {
                    b0kVar3.i0(509328007);
                    b0kVar3.r(false);
                    jA = u7hVar.a;
                }
                iC = l1d.C(zk80Var.e);
                if (iC != 0) {
                    i4 = 2131956702;
                } else {
                    if (iC == 1) {
                        eg.o();
                        return;
                    }
                    i4 = 2131956703;
                }
                String strO0 = cwl1.o0(b0kVar3, i4);
                qim0 qim0Var5 = qim0Var4;
                locale = ((Configuration) b0kVar3.k(AndroidCompositionLocals_androidKt.a)).getLocales().get(0);
                if (j2 > 0) {
                    b0kVar3.i0(-1390490196);
                    if (j2 > 2147483647L) {
                        j = 2147483647L;
                    } else {
                        j = j2;
                    }
                    locale.getClass();
                    strU = cwl1.U(2131820702, (int) j, new Object[]{NumberFormat.getIntegerInstance(locale).format(j2)}, b0kVar3);
                    b0kVar3.r(false);
                } else {
                    b0kVar3.i0(-1390289999);
                    b0kVar3.r(false);
                    strU = null;
                }
                List listI0 = f46.i0(new String[]{zk80Var.c.b, strO0, str2, str3, strU});
                arrayList = new ArrayList();
                for (Object obj : listI0) {
                    if (((String) obj).length() > 0) {
                        arrayList.add(obj);
                    }
                }
                b0kVar2 = b0kVar3;
                gfx.b(18, apo.r(-838868959, new x7b1(jA, u7hVar3, qim0Var5, function0, o7h.y0(arrayList, ", ", (String) null, (String) null, (iu30) null, 62), function1, zk80Var, strO0, str, str2, str3, strU, locale), b0kVar2), b0kVar2, 54);
                qim0Var3 = qim0Var5;
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
                qim0Var3 = qim0Var2;
            }
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new mux(zk80Var, function0, function1, str, str2, str3, u7hVar, u7hVar2, qim0Var3, i, i2);
            }
        }
        i5 |= 100663296;
        qim0Var2 = qim0Var;
        i3 = i5;
        if ((i5 & 38347923) != 38347922) {
            z = true;
        } else {
            z = false;
        }
        if (b0kVar3.Y(i3 & 1, z)) {
            if (i6 != 0) {
                qim0Var4 = nim0.a;
            } else {
                qim0Var4 = qim0Var2;
            }
            uwr uwrVar2 = cbx.a;
            cvx cvxVar2 = cbx.b(b0kVar3).b;
            if (u7hVar == null) {
                b0kVar3.i0(509329712);
                jA = cbx.a(b0kVar3).a.a.a();
                b0kVar3.r(false);
            } else {
                b0kVar3.i0(509328007);
                b0kVar3.r(false);
                jA = u7hVar.a;
            }
            iC = l1d.C(zk80Var.e);
            if (iC != 0) {
                i4 = 2131956702;
            } else {
                if (iC == 1) {
                    eg.o();
                    return;
                }
                i4 = 2131956703;
            }
            String strO1 = cwl1.o0(b0kVar3, i4);
            qim0 qim0Var6 = qim0Var4;
            locale = ((Configuration) b0kVar3.k(AndroidCompositionLocals_androidKt.a)).getLocales().get(0);
            if (j2 > 0) {
                b0kVar3.i0(-1390490196);
                if (j2 > 2147483647L) {
                    j = 2147483647L;
                } else {
                    j = j2;
                }
                locale.getClass();
                strU = cwl1.U(2131820702, (int) j, new Object[]{NumberFormat.getIntegerInstance(locale).format(j2)}, b0kVar3);
                b0kVar3.r(false);
            } else {
                b0kVar3.i0(-1390289999);
                b0kVar3.r(false);
                strU = null;
            }
            List listI1 = f46.i0(new String[]{zk80Var.c.b, strO1, str2, str3, strU});
            arrayList = new ArrayList();
            while (r2.hasNext()) {
                if (((String) obj).length() > 0) {
                    arrayList.add(obj);
                }
            }
            b0kVar2 = b0kVar3;
            gfx.b(18, apo.r(-838868959, new x7b1(jA, u7hVar3, qim0Var6, function0, o7h.y0(arrayList, ", ", (String) null, (String) null, (iu30) null, 62), function1, zk80Var, strO1, str, str2, str3, strU, locale), b0kVar2), b0kVar2, 54);
            qim0Var3 = qim0Var6;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var3 = qim0Var2;
        }
        h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new mux(zk80Var, function0, function1, str, str2, str3, u7hVar, u7hVar2, qim0Var3, i, i2);
        }
    }

    public static final void k(float f, Function0 function0, Function0 function1, boolean z, iu30 iu30Var, iu30 iu30Var2, j2i j2iVar, j2i j2iVar2, j2i j2iVar3, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(956596054);
        int i2 = (x340Var.d(16.0f) ? 256 : 128) | i | (x340Var.d(16.0f) ? 4 : 2) | (x340Var.d(f) ? 32 : 16) | (x340Var.i(function0) ? 16384 : 8192) | (x340Var.i(function1) ? 131072 : 65536) | (x340Var.h(z) ? 1048576 : 524288) | (x340Var.i(iu30Var) ? 8388608 : 4194304) | (x340Var.i(iu30Var2) ? 67108864 : 33554432);
        if (x340Var.Y(i2 & 1, ((i2 & 306783379) == 306783378 && (('6' | (x340Var.g(qim0Var) ? (char) 256 : (char) 128)) & 147) == 146) ? false : true)) {
            qim0 qim0VarR = i1p1.r(qim0Var);
            boolean z2 = ((i2 & 14) == 4) | ((i2 & 112) == 32) | ((i2 & 896) == 256) | ((29360128 & i2) == 8388608) | ((234881024 & i2) == 67108864) | ((3670016 & i2) == 1048576) | ((57344 & i2) == 16384) | ((i2 & 458752) == 131072);
            Object objT = x340Var.T();
            if (z2 || objT == fkj0.X) {
                ezg1 ezg1Var = new ezg1(f, j2iVar, j2iVar3, iu30Var, iu30Var2, z, j2iVar2, function0, function1);
                x340Var.s0(ezg1Var);
                objT = ezg1Var;
            }
            ejo1.l(0, 0, x340Var, (vu30) objT, qim0VarR);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new fzg1(f, function0, function1, z, iu30Var, iu30Var2, j2iVar, j2iVar2, j2iVar3, qim0Var, i);
        }
    }

    public static final void l(bl80 bl80Var, long j, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1254455741);
        int i2 = i | (x340Var.g(bl80Var) ? 4 : 2) | (x340Var.f(j) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            jw31 jw31VarA = ew31.a(new d36(4.0f, true, new um5(false)), een.N0, x340Var, 48);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, nim0.a);
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
            String str = bl80Var.c;
            if (str == null) {
                str = "";
            }
            bmq0.a(Uri.parse(str), (qim0) null, hcx.a, bl80Var.a, bl80Var.b, bl80Var.d, 0L, false, x340Var, 384, 194);
            uwo1.e(bl80Var.b, null, cbx.d(x340Var).m, j, null, null, 2, false, new cjc0(1), 0, null, x340Var, ((i2 << 6) & 7168) | 1572864, 0, 1714);
            x340Var = x340Var;
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nk7(bl80Var, j, i, (byte) 10);
        }
    }

    public static final View m(View view) {
        View view2 = view.getParent() instanceof ConstraintLayout ? view : null;
        if (view2 != null) {
            return view2;
        }
        Object parent = view.getParent();
        View view3 = parent instanceof View ? (View) parent : null;
        if (view3 != null) {
            return m(view3);
        }
        return null;
    }

    public static final boolean n(int i, int i2) {
        return i == i2;
    }

    public static final qim0 o(qim0 qim0Var, float f) {
        return i541.D(qim0Var, 0.0f, 0.0f, f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, 0L, 0L, 0, null, 1048571);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x010c  */
    /* JADX WARN: Code duplicated, block: B:31:0x0130  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v2 */
    public static final mmr0 p(CampaignCardDecoratedText campaignCardDecoratedText) {
        mmr0 mmr0Var;
        String str;
        Boolean bool;
        String strP = campaignCardDecoratedText.p();
        List listQ = campaignCardDecoratedText.q();
        ArrayList<mmr0> arrayList = new ArrayList();
        listQ.getClass();
        ?? r4 = 0;
        int i = 0;
        Long lValueOf = null;
        String strSubstring = strP;
        for (Object obj : listQ) {
            int i2 = i + 1;
            if (i < 0) {
                p7h.T();
                throw null;
            }
            CampaignCardPlaceholderValue campaignCardPlaceholderValue = (CampaignCardPlaceholderValue) obj;
            String strC = f4i1.c(i2, "$");
            int iW0 = ihc1.w0(strSubstring, strC, (int) r4, (boolean) r4, 6);
            if (iW0 >= 0) {
                if (iW0 > 0) {
                    arrayList.add(new mmr0(strSubstring.substring(r4, iW0), Boolean.FALSE));
                }
                campaignCardPlaceholderValue.getClass();
                if (campaignCardPlaceholderValue.w()) {
                    mmr0Var = new mmr0(campaignCardPlaceholderValue.r(), Boolean.FALSE);
                } else {
                    if (campaignCardPlaceholderValue.v()) {
                        mmr0Var = new mmr0(campaignCardPlaceholderValue.q(), Boolean.TRUE);
                    } else if (campaignCardPlaceholderValue.u()) {
                        Timestamp timestampP = campaignCardPlaceholderValue.p();
                        Locale localeForLanguageTag = Locale.forLanguageTag(upn1.p());
                        ZonedDateTime zonedDateTimeAtZone = Instant.ofEpochSecond(timestampP.q(), timestampP.p()).atZone(ZoneId.systemDefault());
                        mmr0Var = new mmr0(xcg1.i(zonedDateTimeAtZone.format(DateTimeFormatter.ofPattern(DateTimePatternGenerator.getInstance(localeForLanguageTag).getBestPattern("MMMdjm"), localeForLanguageTag)), " ", zonedDateTimeAtZone.format(DateTimeFormatter.ofPattern("z"))), Boolean.FALSE);
                    } else if (campaignCardPlaceholderValue.t()) {
                        mmr0Var = new mmr0("{{COUNTDOWN}}", Boolean.FALSE);
                    } else if (campaignCardPlaceholderValue.s()) {
                        LocalDateTime localDateTimeH = z4p1.H(campaignCardPlaceholderValue.n());
                        localDateTimeH.getClass();
                        mmr0Var = new mmr0(z4p1.x(localDateTimeH, "MMMdjm"), Boolean.FALSE);
                    } else {
                        mmr0Var = new mmr0("", Boolean.FALSE);
                    }
                    str = (String) mmr0Var.a;
                    bool = (Boolean) mmr0Var.b;
                    bool.getClass();
                    if (campaignCardPlaceholderValue.t()) {
                        Timestamp timestampO = campaignCardPlaceholderValue.o();
                        lValueOf = Long.valueOf((timestampO.q() * 1000) + ((long) (timestampO.p() / 1000000)));
                        arrayList.add(new mmr0("{{COUNTDOWN}}", Boolean.FALSE));
                    } else {
                        arrayList.add(new mmr0(str, bool));
                    }
                    strSubstring = strSubstring.substring(strC.length() + iW0);
                }
                str = (String) mmr0Var.a;
                bool = (Boolean) mmr0Var.b;
                bool.getClass();
                if (campaignCardPlaceholderValue.t()) {
                    Timestamp timestampO2 = campaignCardPlaceholderValue.o();
                    lValueOf = Long.valueOf((timestampO2.q() * 1000) + ((long) (timestampO2.p() / 1000000)));
                    arrayList.add(new mmr0("{{COUNTDOWN}}", Boolean.FALSE));
                } else {
                    arrayList.add(new mmr0(str, bool));
                }
                strSubstring = strSubstring.substring(strC.length() + iW0);
            }
            i = i2;
            r4 = 0;
            strSubstring = strSubstring;
        }
        if (strSubstring.length() > 0) {
            arrayList.add(new mmr0(strSubstring, Boolean.FALSE));
        }
        ye5 ye5Var = new ye5();
        for (mmr0 mmr0Var2 : arrayList) {
            String str2 = (String) mmr0Var2.a;
            if (((Boolean) mmr0Var2.b).booleanValue()) {
                int iO = ye5Var.o(new zma1(0L, 0L, FontWeight.Z, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65531));
                try {
                    ye5Var.g(str2);
                    ye5Var.k(iO);
                } catch (Throwable th) {
                    ye5Var.k(iO);
                    throw th;
                }
            } else {
                ye5Var.g(str2);
            }
        }
        return new mmr0(ye5Var.p(), lValueOf);
    }

    public static final String r(String str) {
        String string;
        if (str == null || (string = ihc1.e1(str).toString()) == null || ihc1.y0(string)) {
            return null;
        }
        return string;
    }

    public static final u7h s(CampaignCardDecoratedText campaignCardDecoratedText) {
        if (!campaignCardDecoratedText.r()) {
            return null;
        }
        try {
            return new u7h(z4p1.e(Color.parseColor(campaignCardDecoratedText.o())));
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static final bhe1 t(pim0 pim0Var, long j, long j2, iu30 iu30Var) {
        hmb0 hmb0VarB = oap1.B(pim0Var);
        int i = hmb0VarB.b;
        q511 rectManager = kmb0.a(hmb0VarB).getRectManager();
        che1 che1Var = rectManager.d;
        che1Var.getClass();
        long j3 = j2 == 0 ? j : j2;
        fdn0 fdn0Var = che1Var.a;
        bhe1 bhe1Var = new bhe1(che1Var, i, j, j3, pim0Var, iu30Var);
        Object objB = fdn0Var.b(i);
        if (objB == null) {
            fdn0Var.i(i, bhe1Var);
            objB = bhe1Var;
        }
        bhe1 bhe1Var2 = (bhe1) objB;
        if (bhe1Var2 != bhe1Var) {
            while (true) {
                bhe1 bhe1Var3 = bhe1Var2.f;
                if (bhe1Var3 == null) {
                    break;
                }
                bhe1Var2 = bhe1Var3;
            }
            bhe1Var2.f = bhe1Var;
        }
        hmb0 hmb0VarB2 = oap1.B(pim0Var.a);
        if (hmb0VarB2.g != -4) {
            que0 que0Var = rectManager.c;
            int iD = rectManager.d(hmb0VarB2);
            long[] jArr = (long[]) que0Var.c;
            int i2 = iD + 2;
            jArr[i2] = (jArr[i2] & 8070450532247928831L) | (-8070450532247928832L);
        }
        rectManager.f = true;
        rectManager.j();
        return bhe1Var;
    }

    public static final float u(int i, ni20 ni20Var, boolean z, b0k b0kVar, int i2) {
        x340 x340Var = (x340) b0kVar;
        x340Var.i0(-734827170);
        if (!z) {
            x340Var.r(false);
            return 1.0f;
        }
        Object[] objArr = new Object[0];
        Object objT = x340Var.T();
        m4c m4cVar = fkj0.X;
        if (objT == m4cVar) {
            objT = ou1.c1;
            x340Var.s0(objT);
        }
        drr0 drr0Var = (drr0) k5p1.s(objArr, (Function0) objT, x340Var, 48);
        Object objT2 = x340Var.T();
        if (objT2 == m4cVar) {
            objT2 = c97.b(drr0Var.s());
            x340Var.s0(objT2);
        }
        o95 o95Var = (o95) objT2;
        boolean zI = ((((i2 & 14) ^ 6) > 4 && x340Var.e(i)) || (i2 & 6) == 4) | x340Var.i(o95Var) | x340Var.i(ni20Var);
        Object objT3 = x340Var.T();
        if (zI || objT3 == m4cVar) {
            objT3 = new ud5(o95Var, i, ni20Var, null);
            x340Var.s0(objT3);
        }
        qxd0.t(rih1.a, x340Var, (vu30) objT3);
        drr0Var.t(((Number) o95Var.e()).floatValue());
        float fFloatValue = ((Number) o95Var.e()).floatValue();
        x340Var.r(false);
        return fFloatValue;
    }

    public static final Function0 v(fcf0 fcf0Var, boolean z, b0k b0kVar, int i) {
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.i0(2104030827);
        if (!z) {
            x340Var.i0(429794570);
            Object objT = x340Var.T();
            if (objT == m4cVar) {
                objT = ou1.d1;
                x340Var.s0(objT);
            }
            Function0 function0 = (Function0) objT;
            x340Var.r(false);
            x340Var.r(false);
            return function0;
        }
        x340Var.i0(429807063);
        x340Var.r(false);
        Object[] objArr = new Object[0];
        Object objT2 = x340Var.T();
        if (objT2 == m4cVar) {
            objT2 = ou1.e1;
            x340Var.s0(objT2);
        }
        ven0 ven0Var = (ven0) k5p1.s(objArr, (Function0) objT2, x340Var, 48);
        kbf0 kbf0VarN = zpn1.n(fcf0Var, !((Boolean) ven0Var.getValue()).booleanValue(), false, null, 0.0f, 0, x340Var, 1020);
        Object value = kbf0VarN.getValue();
        boolean zI = x340Var.i(kbf0VarN) | x340Var.i(ven0Var);
        Object objT3 = x340Var.T();
        if (zI || objT3 == m4cVar) {
            objT3 = new vd5(kbf0VarN, ven0Var, null, (byte) 0);
            x340Var.s0(objT3);
        }
        qxd0.t(value, x340Var, (vu30) objT3);
        boolean zI2 = x340Var.i(ven0Var) | x340Var.i(kbf0VarN);
        Object objT4 = x340Var.T();
        if (zI2 || objT4 == m4cVar) {
            objT4 = new wd5(kbf0VarN, ven0Var, (byte) 0);
            x340Var.s0(objT4);
        }
        Function0 function1 = (Function0) objT4;
        x340Var.r(false);
        return function1;
    }

    public static final der0 w(lzh lzhVar, b6r0 b6r0Var, Object obj, b0k b0kVar, int i) {
        m4c m4cVar = fkj0.X;
        Object[] objArr = {lzhVar, b6r0Var, obj};
        boolean zG = ((x340) b0kVar).g(lzhVar) | ((x340) b0kVar).g(b6r0Var);
        int i2 = (i & 896) ^ 384;
        boolean z = (i2 > 256 && ((x340) b0kVar).i(obj)) || (i & 384) == 256;
        x340 x340Var = (x340) b0kVar;
        boolean zI = zG | z | x340Var.i((Object) null) | x340Var.i((Object) null);
        Object objT = x340Var.T();
        if (zI || objT == m4cVar) {
            objT = new obr0(lzhVar, b6r0Var, obj, (byte) 0);
            x340Var.s0(objT);
        }
        iu30 iu30Var = (iu30) objT;
        boolean zG2 = x340Var.g(lzhVar) | x340Var.g(b6r0Var) | ((i2 > 256 && x340Var.i(obj)) || (i & 384) == 256) | x340Var.i((Object) null) | x340Var.i((Object) null);
        Object objT2 = x340Var.T();
        if (zG2 || objT2 == m4cVar) {
            objT2 = new obr0(lzhVar, b6r0Var, obj, (byte) 1);
            x340Var.s0(objT2);
        }
        return xfo1.n(objArr, iu30Var, (iu30) objT2, x340Var, 384, 0);
    }

    public static final ct41 x(iu30 iu30Var, b0k b0kVar, int i) {
        ven0 ven0VarS = v8r.s(iu30Var, b0kVar);
        x340 x340Var = (x340) b0kVar;
        Object objT = x340Var.T();
        if (objT == fkj0.X) {
            jns jnsVar = new jns(new g45(ven0VarS, (byte) 7));
            x340Var.s0(jnsVar);
            objT = jnsVar;
        }
        return (ct41) objT;
    }

    public static final qim0 y(qim0 qim0Var, float f, float f2) {
        float fE = l1d.e(1.0f, f2, f, f2);
        return i541.D(qim0Var, fE, fE, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, 0L, 0L, 0, null, 1048572);
    }

    public static qim0 z(float f) {
        return zr7.i(nim0.a, new xd5(f, 1));
    }

    public abstract int q();
}
