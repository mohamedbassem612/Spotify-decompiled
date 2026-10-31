package p;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.Intent;
import android.icu.text.CompactDecimalFormat;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.view.View;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.google.protobuf.Timestamp;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import com.spotify.highlightsstats.Artist;
import com.spotify.highlightsstats.Person;
import com.spotify.highlightsstats.Track;
import com.spotify.highlightsstats.data.proto.v2.FriendsLeaderboard;
import com.spotify.highlightsstats.data.proto.v2.LeaderboardItem;
import com.spotify.highlightsstats.data.proto.v2.PositionChangeLabel;
import com.spotify.highlightsstats.data.proto.v2.SocialArtistsDetailsPage;
import com.spotify.highlightsstats.data.proto.v2.SocialTopArtists;
import com.spotify.highlightsstats.data.proto.v2.SocialTopTrack;
import com.spotify.highlightsstats.data.proto.v2.SocialTrackDetailsPage;
import com.spotify.highlightsstats.data.proto.v2.SoundTownDetailsPage;
import com.spotify.highlightsstats.data.proto.v2.StatsDetailsResponse;
import com.spotify.highlightsstats.data.proto.v2.TopArtist;
import com.spotify.highlightsstats.data.proto.v2.TopArtistsDetailsPage;
import com.spotify.highlightsstats.data.proto.v2.TopTrack;
import com.spotify.highlightsstats.data.proto.v2.TopTrackDetailsPage;
import com.spotify.libraryimportservice.tmm.BannerBody;
import com.spotify.libraryimportservice.tmm.CTA;
import com.spotify.libraryimportservice.tmm.GetTransferResultsBannerResponse;
import com.spotify.paragraph.v1.proto.Paragraph;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class pro1 {
    public static b180 a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r1v52 */
    /* JADX WARN: Type inference failed for: r1v53 */
    /* JADX WARN: Type inference failed for: r1v56 */
    public static final void a(String str, String str2, String str3, String str4, int i, int i2, int i3, tn30 tn30Var, Integer num, String str5, Long l, String str6, boolean z, x0 x0Var, x0 x0Var2, vu30 vu30Var, Function0 function0, Function0 function1, cyn cynVar, cyn cynVar2, vu30 vu30Var2, boolean z2, b0k b0kVar, int i4) {
        x340 x340Var;
        Function0 function2;
        Function0 function3;
        String str7;
        vu30 vu30Var3;
        String str8;
        String str9;
        boolean z3;
        String str10;
        boolean z4;
        String strN0;
        float f;
        String str11;
        qim0 qim0Var;
        ?? r15;
        qim0 qim0Var2;
        String strN1;
        m4c m4cVar = fkj0.X;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-504990798);
        int i5 = i4 | (x340Var2.g(str) ? 4 : 2) | (x340Var2.g(str2) ? 32 : 16) | (x340Var2.g(str3) ? 256 : 128) | (x340Var2.g(str4) ? 2048 : 1024) | (x340Var2.e(l1d.C(i)) ? 16384 : 8192) | (x340Var2.e(l1d.C(i2)) ? 131072 : 65536) | (x340Var2.e(i3 == 0 ? -1 : l1d.C(i3)) ? 1048576 : 524288) | (x340Var2.i(tn30Var) ? 8388608 : 4194304) | (x340Var2.g(num) ? 67108864 : 33554432) | (x340Var2.g(str5) ? 536870912 : 268435456);
        int i6 = 0 | (x340Var2.g(l) ? (char) 4 : (char) 2) | (x340Var2.g(str6) ? 32 : 16) | (x340Var2.h(z) ? (char) 256 : (char) 128) | (x340Var2.e(x0Var.ordinal()) ? (char) 2048 : (char) 1024) | (x340Var2.e(x0Var2.ordinal()) ? (char) 16384 : (char) 8192) | (x340Var2.i(vu30Var) ? (char) 0 : (char) 0) | (x340Var2.i(function0) ? (char) 0 : (char) 0) | (x340Var2.i(function1) ? (char) 0 : (char) 0) | (x340Var2.i(cynVar) ? (char) 0 : (char) 0) | (x340Var2.i(cynVar2) ? (char) 0 : (char) 0);
        if (x340Var2.Y(i5 & 1, ((i5 & 306783379) == 306783378 && (i6 & 306783379) == 306783378 && (((x340Var2.i(vu30Var2) ? (char) 4 : (char) 2) | (x340Var2.h(z2) ? ' ' : (char) 16)) & 19) == 18) ? false : true)) {
            x340Var2.i0(1479102711);
            if (l == null) {
                x340Var2.i0(1879487570);
                x340Var2.r(false);
                if (str6 != null) {
                    x340Var2.r(false);
                    str9 = "";
                    z3 = false;
                    str10 = str6;
                } else {
                    x340Var2.r(false);
                    str10 = "";
                    str9 = str10;
                    z3 = false;
                }
            } else {
                x340Var2.i0(1879487571);
                long jLongValue = l.longValue();
                str9 = "";
                CompactDecimalFormat compactDecimalFormat = CompactDecimalFormat.getInstance(new Locale(upn1.m()), CompactDecimalFormat.CompactStyle.SHORT);
                compactDecimalFormat.setMaximumFractionDigits(1);
                String str12 = compactDecimalFormat.format(jLongValue);
                if (jLongValue > 2147483647L) {
                    jLongValue = 2147483647L;
                }
                String strU = cwl1.U(2131820544, (int) jLongValue, new Object[]{str12}, x340Var2);
                z3 = false;
                x340Var2.r(false);
                x340Var2.r(false);
                str10 = strU;
            }
            xu30 xu30VarR = null;
            if (num == null) {
                x340Var2.i0(125579298);
                x340Var2.r(z3);
                strN0 = null;
            } else {
                x340Var2.i0(125579299);
                int iIntValue = num.intValue();
                if (str5 == null || str5.length() == 0) {
                    z4 = false;
                    x340Var2.i0(734126935);
                    strN0 = cwl1.n0(2131951651, new Object[]{Integer.valueOf(iIntValue)}, x340Var2);
                    x340Var2.r(false);
                } else {
                    x340Var2.i0(734200870);
                    strN0 = cwl1.n0(2131951652, new Object[]{Integer.valueOf(iIntValue), str5}, x340Var2);
                    z4 = false;
                    x340Var2.r(false);
                }
                x340Var2.r(z4);
            }
            if (strN0 == null) {
                strN0 = str9;
            }
            boolean z5 = i == 2 && str4 != null;
            String str13 = strN0;
            if (z5) {
                x340Var2.i0(35182458);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var2).b;
                x340Var2.r(false);
                f = 8.0f;
            } else {
                x340Var2.i0(35183766);
                uwr uwrVar2 = cbx.a;
                cvx cvxVar2 = cbx.b(x340Var2).b;
                x340Var2.r(false);
                f = 16.0f;
            }
            boolean z6 = z5;
            float f2 = f;
            String strN2 = cwl1.n0(2131951655, new Object[]{str2}, x340Var2);
            String strN3 = cwl1.n0(2131951656, new Object[]{str2}, x340Var2);
            int i7 = i3 == 0 ? -1 : i2.a[l1d.C(i3)];
            if (i7 != -1) {
                if (i7 == 1) {
                    x340Var2.i0(35192086);
                    strN1 = cwl1.n0(2131951654, new Object[]{str2}, x340Var2);
                    x340Var2.r(false);
                } else {
                    if (i7 != 2 && i7 != 3) {
                        throw p3d1.k(x340Var2, 35190836, false);
                    }
                    x340Var2.i0(35196824);
                    strN1 = cwl1.n0(2131951653, new Object[]{str2}, x340Var2);
                    x340Var2.r(false);
                }
                str11 = strN1;
            } else {
                x340Var2.i0(35199510);
                x340Var2.r(false);
                str11 = str2;
            }
            x340Var2.i0(35229255);
            x340Var2.i0(35202206);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            if (z) {
                cvx cvxVar3 = cbx.b(x340Var2).b;
                cvx cvxVar4 = cbx.b(x340Var2).b;
                qim0Var = qim0Var3;
                qim0VarF = qim0VarF.then(uyn1.B(qim0Var, 16.0f, 0.0f, 16.0f, 0.0f, 10));
            } else {
                qim0Var = qim0Var3;
            }
            x340Var2.r(false);
            int i8 = 3670016 & i6;
            boolean zG = ((i5 & 896) == 256) | ((i6 & 7168) == 2048) | ((57344 & i6) == 16384) | x340Var2.g(strN2) | (i8 == 1048576) | x340Var2.g(strN3) | ((29360128 & i6) == 8388608);
            Object objT = x340Var2.T();
            if (zG || objT == m4cVar) {
                x340Var = x340Var2;
                r15 = 0;
                qim0Var2 = qim0VarF;
                z1 z1Var = new z1(x0Var, x0Var2, strN2, str3, strN3, function0, function1, (byte) 0);
                str8 = str3;
                function2 = function0;
                x340Var.s0(z1Var);
                objT = z1Var;
            } else {
                x340Var = x340Var2;
                r15 = 0;
                str8 = str3;
                qim0Var2 = qim0VarF;
                function2 = function0;
            }
            qim0 qim0VarB = s161.b(qim0Var2, (boolean) r15, (iu30) objT);
            if (z2) {
                ?? r1 = i8 == 1048576 ? 1 : r15;
                Object objT2 = x340Var.T();
                if (r1 != 0 || objT2 == m4cVar) {
                    objT2 = new y1(function2, (byte) 2);
                    x340Var.s0(objT2);
                }
                qim0VarB = qim0VarB.then(bin.x(qim0Var, false, null, null, null, (Function0) objT2, 15));
            }
            qim0 qim0Var4 = qim0VarB;
            x340Var.r((boolean) r15);
            mgx mgxVar = mgx.e;
            cua cuaVar = cbx.b(x340Var).f;
            cr31 cr31VarB = er31.b(16.0f);
            cvx cvxVar5 = cbx.b(x340Var).b;
            cvx cvxVar6 = cbx.b(x340Var).b;
            cvx cvxVar7 = cbx.b(x340Var).b;
            cvx cvxVar8 = cbx.b(x340Var).b;
            vzq0 zzq0Var = new zzq0(12.0f, 12.0f, 12.0f, 12.0f);
            cvx cvxVar9 = cbx.b(x340Var).b;
            cvx cvxVar10 = cbx.b(x340Var).b;
            ydx ydxVar = new ydx(4.0f, (16 & 2) != 0 ? 12.0f : 0.0f, 8.0f, (16 & 8) != 0 ? zzq0Var : new zzq0(0.0f, 0.0f, 0.0f, 0.0f), (16 & 16) != 0 ? vdx.a : wdx.a);
            if (vu30Var2 == 0) {
                x340Var.i0(1096900250);
                x340Var.r((boolean) r15);
            } else {
                x340Var.i0(1096900251);
                xu30VarR = apo.r(-998921412, new a2(vu30Var2, (byte) r15), x340Var);
                x340Var.r((boolean) r15);
            }
            str7 = str4;
            function3 = function1;
            vu30Var3 = vu30Var;
            ioo1.c(qim0Var4, mgxVar, ydxVar, cr31VarB, null, null, null, null, null, apo.r(-1886882835, new b2(str7, str, i, i2, tn30Var, cynVar2), x340Var), apo.r(-837981331, new c2(z6, str7, (byte) r15), x340Var), apo.r(-266751988, new d2(str13, f2, r15), x340Var), apo.r(304477355, new d2(str10, f2, (byte) 1), x340Var), apo.r(875706698, new a2(vu30Var3, (byte) 1), x340Var), apo.r(1446936041, new t1(str8, function3, r15), x340Var), xu30VarR, apo.r(-1705572569, new w1(i, f2, str11, cynVar, i3, str2), x340Var), x340Var, 805306880, 1600950, 496);
        } else {
            vu30Var2 = vu30Var2;
            x340Var = x340Var2;
            function2 = function0;
            function3 = function1;
            str7 = str4;
            vu30Var3 = vu30Var;
            str8 = str3;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new x1(str, str2, str8, str7, i, i2, i3, tn30Var, num, str5, l, str6, z, x0Var, x0Var2, vu30Var3, function2, function3, cynVar, cynVar2, vu30Var2, z2, i4);
        }
    }

    public static final void b(int i, b0k b0kVar, iu30 iu30Var, qim0 qim0Var) {
        int i2;
        byte b;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(571721834);
        if ((i & 6) == 0) {
            i2 = i | (x340Var.i(iu30Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var, qim0Var3);
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
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            rqo1.g(0, 0, x340Var, uyn1.y(qim0Var3, 16.0f, 8.0f));
            qim0Var2 = qim0Var3;
            jto1.b(u291.f(qim0Var3, 1.0f), null, null, false, null, null, null, null, null, null, null, n7i.a, null, null, null, n7i.b, x340Var, 0, 196656, 30718);
            qim0 qim0VarN = anm1.N("audience-add-friends", qim0Var2);
            boolean z = (i3 & 14) == 4;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new ge3(iu30Var, (byte) 24);
                x340Var.s0(objT);
            }
            jto1.b(qim0VarN, null, null, false, null, null, new gbx(z50.c, (Function0) objT), null, null, n7i.c, null, null, null, null, null, n7i.d, x340Var, 805306368, 196608, 32190);
            x340Var = x340Var;
            b = 1;
            x340Var.r(true);
        } else {
            b = 1;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new n52(iu30Var, qim0Var2, i, b);
        }
    }

    public static final void c(zks0 zks0Var, c380 c380Var, c380 c380Var2, c380 c380Var3, abf abfVar, xpi0 xpi0Var, veq veqVar, xeq xeqVar, pte pteVar, Function0 function0, b0k b0kVar, int i) {
        xeq xeqVar2;
        b0k b0kVar2;
        h311 h311VarV;
        dbf dbfVar;
        Object obj;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1374960694);
        int i2 = i | (b0kVar3.g(zks0Var) ? 4 : 2) | (b0kVar3.g(c380Var) ? 32 : 16) | (b0kVar3.g(c380Var2) ? 256 : 128) | (b0kVar3.g(c380Var3) ? 2048 : 1024) | (b0kVar3.g(abfVar) ? 16384 : 8192) | (b0kVar3.i(xpi0Var) ? 131072 : 65536) | (b0kVar3.i(veqVar) ? 1048576 : 524288) | (b0kVar3.i(xeqVar) ? 8388608 : 4194304) | (b0kVar3.i(pteVar) ? 67108864 : 33554432) | (b0kVar3.i(function0) ? 536870912 : 268435456);
        if (b0kVar3.Y(i2 & 1, (306783379 & i2) != 306783378)) {
            g431 g431VarH = ((cir0) b0kVar3.k(k2r0.a)).h();
            Object objT = b0kVar3.T();
            if (objT == m4cVar) {
                objT = v8r.q(c380Var);
                b0kVar3.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            Object objT2 = b0kVar3.T();
            if (objT2 == m4cVar) {
                objT2 = v8r.q(c380Var2);
                b0kVar3.s0(objT2);
            }
            ven0 ven0Var2 = (ven0) objT2;
            Object objT3 = b0kVar3.T();
            if (objT3 == m4cVar) {
                objT3 = v8r.q(c380Var3);
                b0kVar3.s0(objT3);
            }
            ven0 ven0Var3 = (ven0) objT3;
            boolean zG = b0kVar3.g((c380) ven0Var.getValue()) | b0kVar3.g((c380) ven0Var2.getValue());
            Object objT4 = b0kVar3.T();
            if (zG || objT4 == m4cVar) {
                Iterator it = o7h.N0((c380) ven0Var2.getValue(), (c380) ven0Var.getValue()).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    Object next = it.next();
                    Iterator it2 = it;
                    if (u890.j(((jwm) next).a.a, abfVar.c)) {
                        obj = next;
                        break;
                    }
                    it = it2;
                }
                objT4 = (jwm) obj;
                b0kVar3.s0(objT4);
            }
            jwm jwmVar = (jwm) objT4;
            if (jwmVar == null) {
                b0kVar3.i0(-350021755);
                boolean z = (1879048192 & i2) == 536870912;
                Object objT5 = b0kVar3.T();
                if (z || objT5 == m4cVar) {
                    objT5 = new to1(function0, (lnm) null, (byte) 5);
                    b0kVar3.s0(objT5);
                }
                qxd0.t(rih1.a, b0kVar3, (vu30) objT5);
                b0kVar3.r(false);
                h311VarV = b0kVar3.v();
                if (h311VarV == null) {
                    return;
                } else {
                    dbfVar = new dbf(zks0Var, c380Var, c380Var2, c380Var3, abfVar, xpi0Var, veqVar, xeqVar, pteVar, function0, i, (byte) 1);
                }
            } else {
                xeqVar2 = xeqVar;
                b0kVar3.i0(1512725351);
                b0kVar3.r(false);
                Object objT6 = b0kVar3.T();
                if (objT6 == m4cVar) {
                    cy7 cy7Var = new cy7(ven0Var2, (byte) 23);
                    w9f w9fVar = new w9f(jwmVar, ven0Var3, (byte) 4);
                    thq thqVar = veqVar.a;
                    daq daqVar = thqVar.b;
                    objT6 = new wm1((Context) daqVar.x1.a, (kt91) daqVar.f8.get(), g431VarH, new p40((byte) 3), (weq) thqVar.c.a.kh.get(), (q8n) daqVar.V2.get(), cy7Var, w9fVar);
                    b0kVar3.s0(objT6);
                }
                wm1 wm1Var = (wm1) objT6;
                boolean z2 = (i2 & 7168) == 2048;
                Object objT7 = b0kVar3.T();
                if (z2 || objT7 == m4cVar) {
                    cy7 cy7Var2 = new cy7(ven0Var3, (byte) 24);
                    daq daqVar2 = xeqVar2.a.b;
                    b921 b921Var = new b921((kt91) daqVar2.f8.get(), (Context) daqVar2.x1.a, (i8h1) daqVar2.A5.get(), (q8n) daqVar2.V2.get(), pteVar, cy7Var2);
                    b0kVar3.s0(b921Var);
                    objT7 = b921Var;
                }
                b0kVar2 = b0kVar3;
                irn1.u(null, xbi.b, null, null, apo.r(-87041103, new e1c(ven0Var, zks0Var, wm1Var, abfVar, xpi0Var, jwmVar, ven0Var3, ven0Var2, (b921) objT7), b0kVar3), b0kVar2, 24624, 13);
            }
            h311VarV.d = dbfVar;
        }
        xeqVar2 = xeqVar;
        b0kVar2 = b0kVar3;
        b0kVar2.b0();
        h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            dbfVar = new dbf(zks0Var, c380Var, c380Var2, c380Var3, abfVar, xpi0Var, veqVar, xeqVar2, pteVar, function0, i, (byte) 0);
            h311VarV.d = dbfVar;
        }
    }

    public static final void d(String str, String str2, iu30 iu30Var, iu30 iu30Var2, ezc ezcVar, qim0 qim0Var, a3o a3oVar, b0k b0kVar, int i) {
        x340 x340Var;
        a3o a3oVar2;
        qim0 qim0Var2;
        boolean z;
        boolean z2;
        long j;
        boolean z3;
        x340 x340Var2;
        qim0 qim0VarB;
        m4c m4cVar = fkj0.X;
        x340 x340Var3 = (x340) b0kVar;
        x340Var3.k0(1441221238);
        j06 j06Var = x340Var3.a;
        int i2 = i | (x340Var3.g(str) ? 4 : 2) | (x340Var3.g(str2) ? 32 : 16) | (x340Var3.i(iu30Var) ? 256 : 128) | (x340Var3.i(iu30Var2) ? 2048 : 1024) | (x340Var3.i(ezcVar) ? 16384 : 8192) | 196608 | (x340Var3.g(a3oVar) ? 1048576 : 524288);
        if (x340Var3.Y(i2 & 1, (599187 & i2) != 599186)) {
            era eraVar = een.P0;
            d36 d36Var = new d36(8.0f, true, new g21(eraVar, (byte) 29));
            fra fraVar = een.N0;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarD = u291.D(qim0Var3, (era) null, 3);
            jw31 jw31VarA = ew31.a(d36Var, fraVar, x340Var3, 54);
            int iHashCode = Long.hashCode(x340Var3.T);
            xos0 xos0VarM = x340Var3.m();
            qim0 qim0VarE = zr7.E(x340Var3, qim0VarD);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var3.m0();
            boolean z4 = x340Var3.S;
            n4k n4kVar = hmb0.t1;
            if (z4) {
                x340Var3.l(n4kVar);
            } else {
                x340Var3.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(jw31VarA, x340Var3, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var3, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var3, lljVar3);
            nko1.F(x340Var3);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var3, lljVar4);
            qim0 qim0Var4 = qim0Var3;
            qim0 qim0VarH = kx40.h(1.0f, u291.B(qim0Var3, (gra) null, 3), false);
            mbh mbhVarA = jbh.a(h36.e, eraVar, x340Var3, 54);
            int iHashCode2 = Long.hashCode(x340Var3.T);
            xos0 xos0VarM2 = x340Var3.m();
            qim0 qim0VarE2 = zr7.E(x340Var3, qim0VarH);
            x340Var3.m0();
            if (x340Var3.S) {
                x340Var3.l(n4kVar);
            } else {
                x340Var3.v0();
            }
            nko1.H(mbhVarA, x340Var3, lljVar);
            nko1.H(xos0VarM2, x340Var3, lljVar2);
            x0d.q(iHashCode2, x340Var3, lljVar3, x340Var3);
            nko1.H(qim0VarE2, x340Var3, lljVar4);
            uwr uwrVar = cbx.a;
            uwo1.e(str, null, cbx.d(x340Var3).h, cbx.a(x340Var3).b.a, null, null, 2, false, new cjc0(1), 0, null, x340Var3, (i2 & 14) | 1572864, 0, 1714);
            x340Var = x340Var3;
            if (ihc1.y0(str2)) {
                z = false;
                x340Var.i0(49838706);
                x340Var.r(false);
            } else {
                x340Var.i0(49578027);
                uwo1.e(str2, null, cbx.d(x340Var).m, cbx.a(x340Var).b.a, new a0e1(3), null, 2, false, new cjc0(1), 0, null, x340Var, ((i2 >> 3) & 14) | 1572864, 0, 1698);
                x340Var = x340Var;
                z = false;
                x340Var.r(false);
            }
            x340Var.r(true);
            if (a3oVar != null) {
                x340Var.i0(656587947);
                x340 x340Var4 = x340Var;
                boolean z5 = z;
                ven0 ven0VarG = rwq.g(ezcVar, Boolean.FALSE, null, x340Var4, ((i2 >> 12) & 14) | 48, 2);
                gra graVar = een.h;
                qim0 qim0VarX = u291.x(0.0f, 96.0f, 1, qim0Var4);
                if (((Boolean) ven0VarG.getValue()).booleanValue()) {
                    x340Var4.i0(656827236);
                    j = cbx.a(x340Var4).c.a;
                    x340Var4.r(z5);
                } else {
                    x340Var4.i0(656900582);
                    j = cbx.a(x340Var4).b.b;
                    x340Var4.r(z5);
                }
                qim0 qim0VarY = uyn1.y(d1u.E(1.0f, j, qim0VarX, er31.b(16.0f)), 8.0f, 4.0f);
                gfh0 gfh0VarC = t1c.c(graVar, z5);
                int iHashCode3 = Long.hashCode(x340Var4.T);
                xos0 xos0VarM3 = x340Var4.m();
                qim0 qim0VarE3 = zr7.E(x340Var4, qim0VarY);
                x340Var4.m0();
                if (x340Var4.S) {
                    x340Var4.l(n4kVar);
                } else {
                    x340Var4.v0();
                }
                nko1.H(gfh0VarC, x340Var4, lljVar);
                nko1.H(xos0VarM3, x340Var4, lljVar2);
                x0d.q(iHashCode3, x340Var4, lljVar3, x340Var4);
                nko1.H(qim0VarE3, x340Var4, lljVar4);
                String str3 = ((Boolean) ven0VarG.getValue()).booleanValue() ? a3oVar.c : a3oVar.b;
                long j2 = cbx.a(x340Var4).b.a;
                lee1 lee1Var = cbx.d(x340Var4).k;
                cjc0 cjc0Var = new cjc0(1);
                if (ihc1.y0(a3oVar.a)) {
                    a3oVar2 = a3oVar;
                    qim0Var4 = qim0Var4;
                    z3 = z5;
                    x340Var2 = x340Var4;
                    x340Var2.i0(-848484127);
                    x340Var2.r(z3);
                    qim0VarB = qim0Var4;
                } else {
                    x340Var4.i0(-849045754);
                    int i3 = 3670016 & i2;
                    boolean zG = x340Var4.g(ven0VarG) | ((i2 & 7168) == 2048 ? true : z5) | (i3 == 1048576 ? true : z5) | ((i2 & 896) == 256 ? true : z5);
                    Object objT = x340Var4.T();
                    if (zG || objT == m4cVar) {
                        a3oVar2 = a3oVar;
                        x340Var2 = x340Var4;
                        jzm jzmVar = new jzm(iu30Var2, a3oVar2, iu30Var, ven0VarG, (byte) 1);
                        x340Var2.s0(jzmVar);
                        objT = jzmVar;
                    } else {
                        a3oVar2 = a3oVar;
                        x340Var2 = x340Var4;
                    }
                    qim0 qim0VarX2 = bin.x(qim0Var4, false, null, null, null, (Function0) objT, 15);
                    qim0Var4 = qim0Var4;
                    boolean zG2 = x340Var2.g(ven0VarG) | (i3 == 1048576);
                    Object objT2 = x340Var2.T();
                    if (zG2 || objT2 == m4cVar) {
                        z3 = false;
                        objT2 = new y0o(a3oVar2, ven0VarG, (byte) 0);
                        x340Var2.s0(objT2);
                    } else {
                        z3 = false;
                    }
                    qim0VarB = s161.b(qim0VarX2, z3, (iu30) objT2);
                    x340Var2.r(z3);
                }
                x340 x340Var5 = x340Var2;
                z2 = true;
                uwo1.e(str3, qim0VarB, lee1Var, j2, null, null, 0, false, cjc0Var, 0, null, x340Var5, 0, 0, 1776);
                x340Var = x340Var5;
                x340Var.r(true);
                x340Var.r(z3);
            } else {
                z2 = true;
                a3oVar2 = a3oVar;
                x340Var.i0(658061160);
                x340Var.r(z);
            }
            x340Var.r(z2);
            qim0Var2 = qim0Var4;
        } else {
            x340Var = x340Var3;
            a3oVar2 = a3oVar;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ta5(str, str2, iu30Var, iu30Var2, ezcVar, qim0Var2, a3oVar2, i, (byte) 11);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:101:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:105:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:107:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:109:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:112:0x0208  */
    /* JADX WARN: Code duplicated, block: B:114:0x0103 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:115:0x0104 A[EDGE_INSN: B:115:0x0104->B:75:0x0104 BREAK  A[LOOP:0: B:68:0x00e5->B:73:0x00fe], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0068  */
    /* JADX WARN: Code duplicated, block: B:38:0x006b  */
    /* JADX WARN: Code duplicated, block: B:40:0x006f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0075  */
    /* JADX WARN: Code duplicated, block: B:43:0x0078  */
    /* JADX WARN: Code duplicated, block: B:47:0x0080  */
    /* JADX WARN: Code duplicated, block: B:49:0x0086  */
    /* JADX WARN: Code duplicated, block: B:50:0x0089  */
    /* JADX WARN: Code duplicated, block: B:54:0x0095  */
    /* JADX WARN: Code duplicated, block: B:55:0x0097  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:67:0x00da  */
    /* JADX WARN: Code duplicated, block: B:70:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:73:0x00fe A[LOOP:0: B:68:0x00e5->B:73:0x00fe, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:76:0x0106  */
    /* JADX WARN: Code duplicated, block: B:77:0x0119  */
    /* JADX WARN: Code duplicated, block: B:79:0x0127  */
    /* JADX WARN: Code duplicated, block: B:83:0x013d  */
    /* JADX WARN: Code duplicated, block: B:86:0x0171  */
    /* JADX WARN: Code duplicated, block: B:88:0x0178  */
    /* JADX WARN: Code duplicated, block: B:89:0x017e  */
    /* JADX WARN: Code duplicated, block: B:92:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:93:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:96:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:97:0x01c6  */
    public static final void e(tix tixVar, iu30 iu30Var, qim0 qim0Var, vzq0 vzq0Var, j2i j2iVar, b0k b0kVar, int i, int i2) {
        int i3;
        vzq0 vzq0Var2;
        int i4;
        boolean z;
        vzq0 vzq0Var3;
        h311 h311VarV;
        vzq0 vzq0VarH;
        String strO0;
        xtb0 xtb0VarA;
        p811 p811Var;
        Object objT;
        boolean z2;
        rih1 rih1Var;
        boolean zG;
        Object objT2;
        jw31 jw31VarA;
        int iHashCode;
        xos0 xos0VarM;
        qim0 qim0VarE;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        Object objT3;
        Iterator it;
        int i5;
        boolean z7;
        Iterator it2;
        int i6;
        m4c m4cVar = fkj0.X;
        List list = tixVar.a;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1808918977);
        if ((i & 6) == 0) {
            i3 = (x340Var.g(tixVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= x340Var.g(qim0Var) ? 256 : 128;
        }
        int i7 = i2 & 8;
        if (i7 == 0) {
            if ((i & 3072) == 0) {
                vzq0Var2 = vzq0Var;
                i3 |= x340Var.g(vzq0Var2) ? 2048 : 1024;
            }
            if ((i2 & 16) != 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                if (x340Var.h(false)) {
                    i4 = 16384;
                } else {
                    i4 = 8192;
                }
                i3 |= i4;
            }
            if ((196608 & i) == 0) {
                if (x340Var.i(j2iVar)) {
                    i6 = 131072;
                } else {
                    i6 = 65536;
                }
                i3 |= i6;
            }
            if ((74899 & i3) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i3 & 1, z)) {
                if (i7 != 0) {
                    vzq0VarH = uyn1.h(3, 0.0f, 0.0f);
                } else {
                    vzq0VarH = vzq0Var2;
                }
                strO0 = cwl1.o0(x340Var, 2131956005);
                xtb0VarA = aub0.a(0, x340Var, 3);
                x340Var.i0(-548690141);
                x340Var.r(false);
                p811Var = new p811();
                objT = x340Var.T();
                if (objT == m4cVar) {
                    x340Var.s0((Object) null);
                    objT = null;
                }
                p811Var.a = objT;
                z2 = tixVar.c;
                rih1Var = rih1.a;
                if (z2) {
                    x340Var.i0(-548599280);
                    it = list.iterator();
                    i5 = 0;
                    while (true) {
                        if (it.hasNext()) {
                            i5 = -1;
                            break;
                        }
                        it2 = it;
                        if (u890.j(((nix) it.next()).a, (Object) null)) {
                            break;
                        }
                        i5++;
                        it = it2;
                    }
                    if (i5 >= 0) {
                        x340Var.i0(-548442761);
                        qxd0.t(rih1Var, x340Var, new m7s(p811Var, xtb0VarA, i5, (lnm) null));
                        z7 = false;
                        x340Var.r(false);
                    } else {
                        z7 = false;
                        x340Var.i0(-548338973);
                        x340Var.r(false);
                    }
                    x340Var.r(z7);
                } else {
                    x340Var.i0(-548335005);
                    x340Var.r(false);
                }
                zG = x340Var.g(strO0);
                objT2 = x340Var.T();
                if (zG || objT2 == m4cVar) {
                    objT2 = new kov(strO0, (byte) 8);
                    x340Var.s0(objT2);
                }
                qim0 qim0VarB = s161.b(nim0.a, false, (iu30) objT2);
                jw31VarA = ew31.a(h36.a, een.Z, x340Var, 0);
                iHashCode = Long.hashCode(x340Var.T);
                xos0VarM = x340Var.m();
                qim0VarE = zr7.E(x340Var, qim0VarB);
                hzj.A.getClass();
                if (x340Var.a != null) {
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
                qim0 qim0VarN = anm1.N(hrt.x(1), u291.f(f8d1.b(qim0Var, rih1Var, new vix(p811Var, (byte) 0)), 1.0f));
                if ((i3 & 14) == 4) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if ((i3 & 112) == 32) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                boolean z8 = z3 | z4;
                if ((458752 & i3) == 131072) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                z6 = z8 | z5;
                objT3 = x340Var.T();
                if (z6 || objT3 == m4cVar) {
                    objT3 = new m3n(tixVar, iu30Var, j2iVar, (byte) 29);
                    x340Var.s0(objT3);
                }
                too1.b(qim0VarN, xtb0VarA, vzq0VarH, (iu30) objT3, x340Var, (i3 >> 3) & 896, 0);
                x340Var.r(true);
                vzq0Var3 = vzq0VarH;
            } else {
                x340Var.b0();
                vzq0Var3 = vzq0Var2;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new j90(tixVar, iu30Var, qim0Var, vzq0Var3, j2iVar, i, i2);
            }
        }
        i3 |= 3072;
        vzq0Var2 = vzq0Var;
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            if (x340Var.h(false)) {
                i4 = 16384;
            } else {
                i4 = 8192;
            }
            i3 |= i4;
        }
        if ((196608 & i) == 0) {
            if (x340Var.i(j2iVar)) {
                i6 = 131072;
            } else {
                i6 = 65536;
            }
            i3 |= i6;
        }
        if ((74899 & i3) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (x340Var.Y(i3 & 1, z)) {
            if (i7 != 0) {
                vzq0VarH = uyn1.h(3, 0.0f, 0.0f);
            } else {
                vzq0VarH = vzq0Var2;
            }
            strO0 = cwl1.o0(x340Var, 2131956005);
            xtb0VarA = aub0.a(0, x340Var, 3);
            x340Var.i0(-548690141);
            x340Var.r(false);
            p811Var = new p811();
            objT = x340Var.T();
            if (objT == m4cVar) {
                x340Var.s0((Object) null);
                objT = null;
            }
            p811Var.a = objT;
            z2 = tixVar.c;
            rih1Var = rih1.a;
            if (z2) {
                x340Var.i0(-548599280);
                it = list.iterator();
                i5 = 0;
                while (true) {
                    if (it.hasNext()) {
                        i5 = -1;
                        break;
                    }
                    it2 = it;
                    if (u890.j(((nix) it.next()).a, (Object) null)) {
                        break;
                        break;
                    } else {
                        i5++;
                        it = it2;
                    }
                }
                if (i5 >= 0) {
                    x340Var.i0(-548442761);
                    qxd0.t(rih1Var, x340Var, new m7s(p811Var, xtb0VarA, i5, (lnm) null));
                    z7 = false;
                    x340Var.r(false);
                } else {
                    z7 = false;
                    x340Var.i0(-548338973);
                    x340Var.r(false);
                }
                x340Var.r(z7);
            } else {
                x340Var.i0(-548335005);
                x340Var.r(false);
            }
            zG = x340Var.g(strO0);
            objT2 = x340Var.T();
            if (zG) {
                objT2 = new kov(strO0, (byte) 8);
                x340Var.s0(objT2);
            } else {
                objT2 = new kov(strO0, (byte) 8);
                x340Var.s0(objT2);
            }
            qim0 qim0VarB2 = s161.b(nim0.a, false, (iu30) objT2);
            jw31VarA = ew31.a(h36.a, een.Z, x340Var, 0);
            iHashCode = Long.hashCode(x340Var.T);
            xos0VarM = x340Var.m();
            qim0VarE = zr7.E(x340Var, qim0VarB2);
            hzj.A.getClass();
            if (x340Var.a != null) {
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
            qim0 qim0VarN2 = anm1.N(hrt.x(1), u291.f(f8d1.b(qim0Var, rih1Var, new vix(p811Var, (byte) 0)), 1.0f));
            if ((i3 & 14) == 4) {
                z3 = true;
            } else {
                z3 = false;
            }
            if ((i3 & 112) == 32) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean z9 = z3 | z4;
            if ((458752 & i3) == 131072) {
                z5 = true;
            } else {
                z5 = false;
            }
            z6 = z9 | z5;
            objT3 = x340Var.T();
            if (z6) {
                objT3 = new m3n(tixVar, iu30Var, j2iVar, (byte) 29);
                x340Var.s0(objT3);
            } else {
                objT3 = new m3n(tixVar, iu30Var, j2iVar, (byte) 29);
                x340Var.s0(objT3);
            }
            too1.b(qim0VarN2, xtb0VarA, vzq0VarH, (iu30) objT3, x340Var, (i3 >> 3) & 896, 0);
            x340Var.r(true);
            vzq0Var3 = vzq0VarH;
        } else {
            x340Var.b0();
            vzq0Var3 = vzq0Var2;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new j90(tixVar, iu30Var, qim0Var, vzq0Var3, j2iVar, i, i2);
        }
    }

    public static final void f(tix tixVar, iu30 iu30Var, qim0 qim0Var, vzq0 vzq0Var, b0k b0kVar, int i, int i2) {
        int i3;
        iu30 iu30Var2;
        tix tixVar2;
        vzq0 vzq0Var2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1446054081);
        int i4 = (x340Var.g(tixVar) ? 4 : 2) | i | (x340Var.i(iu30Var) ? 32 : 16);
        int i5 = i4 | 384;
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 = i4 | 3456;
        } else {
            i3 = (x340Var.g(vzq0Var) ? 2048 : 1024) | i5;
        }
        int i7 = i3 | 24576;
        if (x340Var.Y(i7 & 1, (i7 & 9363) != 9362)) {
            if (i6 != 0) {
                vzq0Var = uyn1.h(3, 0.0f, 0.0f);
            }
            vzq0 vzq0Var3 = vzq0Var;
            qim0 qim0Var3 = nim0.a;
            iu30Var2 = iu30Var;
            e(tixVar, iu30Var2, qim0Var3, vzq0Var3, apo.r(54114558, new ip0(iu30Var, (byte) 29), x340Var), x340Var, (i7 & 14) | 196608 | (i7 & 112) | 384 | (i7 & 7168) | 24576, 0);
            tixVar2 = tixVar;
            qim0Var2 = qim0Var3;
            vzq0Var2 = vzq0Var3;
        } else {
            iu30Var2 = iu30Var;
            tixVar2 = tixVar;
            x340Var.b0();
            vzq0Var2 = vzq0Var;
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new lxl(tixVar2, iu30Var2, qim0Var2, vzq0Var2, i, i2);
        }
    }

    public static final void g(String str, String str2, int i, int i2, tn30 tn30Var, cyn cynVar, b0k b0kVar, int i3) {
        h311 h311VarV;
        e2 e2Var;
        vu30 vu30Var;
        qim0 qim0Var;
        tl3 tl3Var;
        vu30 vu30Var2;
        vu30 vu30Var3;
        llj lljVar;
        Function0 function0;
        h2c h2cVar;
        boolean z;
        h2c h2cVar2;
        boolean z2;
        boolean z3;
        ecx ecxVar;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(936015966);
        j06 j06Var = x340Var.a;
        int i4 = i3 | (x340Var.g(str) ? 4 : 2) | (x340Var.g(str2) ? 32 : 16) | (x340Var.e(l1d.C(i)) ? 256 : 128) | (x340Var.e(l1d.C(i2)) ? 2048 : 1024) | (x340Var.i(tn30Var) ? 16384 : 8192) | (x340Var.i(cynVar) ? 131072 : 65536);
        if (x340Var.Y(i4 & 1, (i4 & 74899) != 74898)) {
            boolean z4 = i == 1 && str != null;
            boolean z5 = i2 == 2 && str2 != null;
            if (z4 || z5) {
                qim0 qim0Var2 = nim0.a;
                qim0 qim0VarF = u291.f(qim0Var2, 1.0f);
                tl3 tl3Var2 = een.d;
                gfh0 gfh0VarC = t1c.c(tl3Var2, false);
                int iHashCode = Long.hashCode(x340Var.T);
                xos0 xos0VarM = x340Var.m();
                qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
                hzj.A.getClass();
                if (j06Var == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var.m0();
                boolean z6 = x340Var.S;
                Function0 function1 = hmb0.t1;
                if (z6) {
                    x340Var.l(function1);
                } else {
                    x340Var.v0();
                }
                vu30 vu30Var4 = y580.O0;
                nko1.H(gfh0VarC, x340Var, vu30Var4);
                vu30 vu30Var5 = y580.N0;
                nko1.H(xos0VarM, x340Var, vu30Var5);
                Integer numValueOf = Integer.valueOf(iHashCode);
                llj lljVar2 = y580.R0;
                nko1.H(numValueOf, x340Var, lljVar2);
                nko1.F(x340Var);
                vu30 vu30Var6 = y580.Y;
                nko1.H(qim0VarE, x340Var, vu30Var6);
                h2c h2cVar3 = h2c.a;
                if (z4) {
                    x340Var.i0(1065340525);
                    int iC = l1d.C(i2);
                    if (iC == 0) {
                        ecxVar = new ecx(1.0f, 0.75f);
                    } else {
                        if (iC != 1) {
                            eg.o();
                            return;
                        }
                        ecxVar = new ecx(1.0f, 0.67f);
                    }
                    vu30Var2 = vu30Var5;
                    vu30Var = vu30Var4;
                    tl3Var = tl3Var2;
                    vu30Var3 = vu30Var6;
                    lljVar = lljVar2;
                    function0 = function1;
                    eso1.e(Uri.parse(str), isl.a, u291.f(qim0Var2, 1.0f), (p3v) null, (zvx) null, ecxVar, (j6m) null, (tl3) null, (ColorFilter) null, (qux) null, false, false, x340Var, 48, 0, 4056);
                    qim0Var = qim0Var2;
                    h2cVar = h2cVar3;
                    qim0 qim0VarB = h2cVar.b(qim0Var);
                    long j = u7h.b;
                    qim0 qim0VarE2 = dug.e(qim0VarB, v9c.s(p7h.M(new u7h[]{new u7h(u7h.b(j, 0.3f, 0.0f, 0.0f, 0.0f, 14)), new u7h(u7h.b(j, 0.0f, 0.0f, 0.0f, 0.0f, 14))}), 0.0f, 0.0f, 14), null, 0.0f, 6);
                    z = false;
                    t1c.a(qim0VarE2, x340Var, 0);
                    x340Var.r(false);
                } else {
                    vu30Var = vu30Var4;
                    qim0Var = qim0Var2;
                    tl3Var = tl3Var2;
                    vu30Var2 = vu30Var5;
                    vu30Var3 = vu30Var6;
                    lljVar = lljVar2;
                    function0 = function1;
                    h2cVar = h2cVar3;
                    z = false;
                    x340Var.i0(1066002654);
                    x340Var.r(false);
                }
                if (z5) {
                    x340Var.i0(1066045527);
                    uwr uwrVar = cbx.a;
                    lee1 lee1Var = cbx.d(x340Var).h;
                    qim0 qim0VarA = h2cVar.a(qim0Var, tl3Var);
                    cvx cvxVar = cbx.b(x340Var).b;
                    cvx cvxVar2 = cbx.b(x340Var).b;
                    h2cVar2 = h2cVar;
                    uwo1.e(str2, uyn1.B(qim0VarA, 16.0f, 16.0f, 0.0f, 0.0f, 12), lee1Var, 0L, null, null, 0, false, null, 0, null, x340Var, (i4 >> 3) & 14, 0, 2040);
                    z2 = false;
                    x340Var.r(false);
                } else {
                    h2cVar2 = h2cVar;
                    z2 = z;
                    x340Var.i0(1066304222);
                    x340Var.r(z2);
                }
                if (!z4 || tn30Var == null || cynVar == null) {
                    z3 = true;
                    x340Var.i0(1066641502);
                    x340Var.r(z2);
                } else {
                    x340Var.i0(1066393564);
                    Object objT = x340Var.T();
                    if (objT == fkj0.X) {
                        objT = new dyn();
                        x340Var.s0(objT);
                    }
                    dyn dynVar = (dyn) objT;
                    qim0 qim0VarA2 = h2cVar2.a(qim0Var, een.Y);
                    uwr uwrVar2 = cbx.a;
                    cvx cvxVar3 = cbx.b(x340Var).b;
                    qim0 qim0VarX = uyn1.x(qim0VarA2, 16.0f);
                    gfh0 gfh0VarC2 = t1c.c(tl3Var, z2);
                    int iHashCode2 = Long.hashCode(x340Var.T);
                    xos0 xos0VarM2 = x340Var.m();
                    qim0 qim0VarE3 = zr7.E(x340Var, qim0VarX);
                    x340Var.m0();
                    if (x340Var.S) {
                        x340Var.l(function0);
                    } else {
                        x340Var.v0();
                    }
                    nko1.H(gfh0VarC2, x340Var, vu30Var);
                    nko1.H(xos0VarM2, x340Var, vu30Var2);
                    x0d.q(iHashCode2, x340Var, lljVar, x340Var);
                    nko1.H(qim0VarE3, x340Var, vu30Var3);
                    otw.c(dynVar, cynVar, (qim0) null, (ipb1) null, x340Var, 72 | ((i4 >> 12) & 112), 12);
                    z3 = true;
                    x340Var.r(true);
                    x340Var.r(z2);
                }
                x340Var.r(z3);
            } else {
                h311VarV = x340Var.v();
                if (h311VarV == null) {
                    return;
                } else {
                    e2Var = new e2(str, str2, i, i2, tn30Var, cynVar, i3, (byte) 0);
                }
            }
            h311VarV.d = e2Var;
        }
        x340Var.b0();
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            e2Var = new e2(str, str2, i, i2, tn30Var, cynVar, i3, (byte) 1);
            h311VarV.d = e2Var;
        }
    }

    public static final void h(String str, lee1 lee1Var, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(483080108);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.i(lee1Var) ? 32 : 16) | (x340Var.i(qim0Var) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            Object objT = x340Var.T();
            Object obj = fkj0.X;
            if (objT == obj) {
                objT = bb00.h(0, x340Var);
            }
            err0 err0Var = (hdn0) objT;
            Object objT2 = x340Var.T();
            if (objT2 == obj) {
                objT2 = bb00.h(0, x340Var);
            }
            err0 err0Var2 = (hdn0) objT2;
            wat watVar = (wat) x340Var.k(t4k.h);
            boolean z = x340Var.k(t4k.n) == flb0.b;
            boolean zH = ((i2 & 14) == 4) | x340Var.h(z);
            Object objT3 = x340Var.T();
            if (zH || objT3 == obj) {
                ye5 ye5Var = new ye5();
                if (z) {
                    ye5Var.g("\u2067");
                }
                ye5Var.g(str);
                if (z) {
                    ye5Var.g("\u2069");
                }
                ye5Var.g(" ");
                z6p1.r(ye5Var, "aiPersonaBadge", "�");
                objT3 = ye5Var.p();
                x340Var.s0(objT3);
            }
            af5 af5Var = (af5) objT3;
            err0 err0Var3 = err0Var;
            err0 err0Var4 = err0Var2;
            boolean zE = x340Var.e(err0Var3.s()) | x340Var.e(err0Var4.s()) | x340Var.g(watVar);
            Object objT4 = x340Var.T();
            if (zE || objT4 == obj) {
                objT4 = (err0Var3.s() <= 0 || err0Var4.s() <= 0) ? dqs0.e : mqo1.t(new mmr0("aiPersonaBadge", new gh80(new d6t0(4, watVar.s(watVar.M0(err0Var3.s())), watVar.s(watVar.M0(err0Var4.s()))), n2i.a)));
                x340Var.s0(objT4);
            }
            cqs0 cqs0Var = (cqs0) objT4;
            Object objT5 = x340Var.T();
            if (objT5 == obj) {
                objT5 = new g2(err0Var, err0Var2, (byte) 0);
                x340Var.s0(objT5);
            }
            gfh0 gfh0Var = (gfh0) objT5;
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
            nko1.H(gfh0Var, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            k1u.a((qim0) null, 2, 0, (Function0) null, x340Var, 48, 13);
            uwo1.f(af5Var, qim0Var, lee1Var, null, null, null, 2, false, new cjc0(2), 0, null, cqs0Var, x340Var, ((i2 >> 3) & 112) | ((i2 << 3) & 896), 0, 1720);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new h2(str, lee1Var, qim0Var, i, (byte) 0);
        }
    }

    public static final void i(int i, Function0 function0, b0k b0kVar, iu30 iu30Var) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1402559489);
        int i2 = (x340Var.g(z6x.a) ? 4 : 2) | i | (x340Var.i(iu30Var) ? 32 : 16) | (x340Var.i(function0) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            x74.f(function0, (scx) null, (mfx) null, false, false, 0.0f, false, Boolean.TRUE, false, false, (vu30) null, apo.r(-899466398, new ict0(iu30Var, (byte) 5), x340Var), x340Var, ((i2 >> 6) & 14) | 12607488, 48, 1902);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ah20(iu30Var, function0, i, (byte) 2);
        }
    }

    public static final View j(RecyclerView recyclerView, String str, List list, boolean z) {
        z6x z6xVarSingletonList;
        Object obj = null;
        if (str == null) {
            return null;
        }
        Iterator it = list.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (str.equals((String) it.next())) {
                break;
            }
            i++;
        }
        if (recyclerView.getChildCount() > 0) {
            View childAt = recyclerView.getChildAt(0);
            if (childAt == null) {
                tw20.p();
                return null;
            }
            if (1 < recyclerView.getChildCount()) {
                z6xVarSingletonList = new ArrayList();
                z6xVarSingletonList.add(childAt);
                int i2 = 1;
                while (i2 < recyclerView.getChildCount()) {
                    int i3 = i2 + 1;
                    View childAt2 = recyclerView.getChildAt(i2);
                    if (childAt2 == null) {
                        tw20.p();
                        return null;
                    }
                    z6xVarSingletonList.add(childAt2);
                    i2 = i3;
                }
            } else {
                z6xVarSingletonList = Collections.singletonList(childAt);
            }
        } else {
            z6xVarSingletonList = z6x.a;
        }
        for (Object obj2 : (Iterable) z6xVarSingletonList) {
            View view = (View) obj2;
            if ((z ? RecyclerView.R(view) - 1 : RecyclerView.R(view)) == i) {
                obj = obj2;
                break;
            }
        }
        return (View) obj;
    }

    public static int k(Context context, String str) {
        int iNoteProxyOpNoThrow;
        int iMyPid = Process.myPid();
        int iMyUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, iMyPid, iMyUid) != -1) {
            String strPermissionToOp = AppOpsManager.permissionToOp(str);
            if (strPermissionToOp != null) {
                if (packageName == null) {
                    String[] packagesForUid = context.getPackageManager().getPackagesForUid(iMyUid);
                    if (packagesForUid != null && packagesForUid.length > 0) {
                        packageName = packagesForUid[0];
                    }
                }
                int iMyUid2 = Process.myUid();
                String packageName2 = context.getPackageName();
                if (iMyUid2 == iMyUid && Objects.equals(packageName2, packageName) && Build.VERSION.SDK_INT >= 29) {
                    AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService(AppOpsManager.class);
                    iNoteProxyOpNoThrow = appOpsManager == null ? 1 : appOpsManager.checkOpNoThrow(strPermissionToOp, Binder.getCallingUid(), packageName);
                    if (iNoteProxyOpNoThrow == 0) {
                        iNoteProxyOpNoThrow = appOpsManager != null ? appOpsManager.checkOpNoThrow(strPermissionToOp, iMyUid, x74.P(context)) : 1;
                    }
                } else {
                    iNoteProxyOpNoThrow = ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(strPermissionToOp, packageName);
                }
                if (iNoteProxyOpNoThrow != 0) {
                    return -2;
                }
            }
            return 0;
        }
        return -1;
    }

    public static final String l(Intent intent) {
        String strJ;
        Set set = s4b1.f;
        s4b1 s4b1VarX = uic.x(intent.getDataString());
        if (s4b1VarX.c != blc0.Wf) {
            s4b1VarX = null;
        }
        if (s4b1VarX != null && (strJ = s4b1VarX.j()) != null) {
            return strJ;
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            return extras.getString("settings_deeplink_item_id");
        }
        return null;
    }

    public static final go80 m(klm klmVar, vcp0 vcp0Var) {
        return klmVar.a("AppStartupTriggerDaemon", new nap0(vcp0Var, (byte) 1));
    }

    public static d761 n(Paragraph paragraph) {
        if (paragraph.equals(Paragraph.n())) {
            paragraph = null;
        }
        if (paragraph != null) {
            return b761.a(paragraph);
        }
        return null;
    }

    public static List o(StatsDetailsResponse statsDetailsResponse) {
        boolean z;
        int iO = statsDetailsResponse.o();
        int i = iO == 0 ? -1 : shi1.a[l1d.C(iO)];
        az91 az91Var = az91.c;
        int i2 = 0;
        dwb0 dwb0Var = null;
        switch (i) {
            case 1:
                if (statsDetailsResponse.C()) {
                    TopTrackDetailsPage topTrackDetailsPageW = statsDetailsResponse.w();
                    Timestamp date = statsDetailsResponse.getDate();
                    h290 h290VarP = topTrackDetailsPageW.p();
                    ArrayList arrayList = new ArrayList(q7h.U(h290VarP, 10));
                    int i3 = 0;
                    for (Object obj : h290VarP) {
                        int i4 = i3 + 1;
                        if (i3 < 0) {
                            p7h.T();
                            throw null;
                        }
                        TopTrack topTrack = (TopTrack) obj;
                        Track trackS = topTrack.s();
                        trackS.getClass();
                        arrayList.add(q(trackS, i3, topTrack, null, 0));
                        i3 = i4;
                    }
                    return Collections.singletonList(new agf1(arrayList, (Integer) null, date, 10));
                }
                break;
            case 2:
                if (statsDetailsResponse.B()) {
                    TopArtistsDetailsPage topArtistsDetailsPageV = statsDetailsResponse.v();
                    Timestamp date2 = statsDetailsResponse.getDate();
                    h290 h290VarP2 = topArtistsDetailsPageV.p();
                    ArrayList arrayList2 = new ArrayList(q7h.U(h290VarP2, 10));
                    int i5 = 0;
                    for (Object obj2 : h290VarP2) {
                        int i6 = i5 + 1;
                        if (i5 < 0) {
                            p7h.T();
                            throw null;
                        }
                        TopArtist topArtist = (TopArtist) obj2;
                        Artist artistO = topArtist.o();
                        artistO.getClass();
                        arrayList2.add(p(artistO, i5, topArtist, null, 0));
                        i5 = i6;
                    }
                    return Collections.singletonList(new s8f1(arrayList2, (Integer) null, date2, 10));
                }
                break;
            case 3:
                boolean z2 = statsDetailsResponse.r().o().o() == az91Var;
                smc0 smc0VarN = k4p1.n();
                smc0VarN.add(new fls0());
                if (!z2) {
                    smc0VarN.add(new jg20());
                }
                FriendsLeaderboard friendsLeaderboardO = statsDetailsResponse.r().o();
                int iY = y(friendsLeaderboardO.o());
                List itemsList = friendsLeaderboardO.getItemsList();
                ArrayList arrayList3 = new ArrayList(q7h.U(itemsList, 10));
                Iterator it = itemsList.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    xxh xxhVarF = vxh.a;
                    if (!zHasNext) {
                        ArrayList arrayList4 = arrayList3;
                        if (friendsLeaderboardO.q()) {
                            LeaderboardItem leaderboardItemN = friendsLeaderboardO.n();
                            dwb0Var = new dwb0(leaderboardItemN.r().getName(), leaderboardItemN.r().p(), null, xxhVarF, leaderboardItemN.r().r(), leaderboardItemN.n(), leaderboardItemN.r().q(), true, leaderboardItemN.q(), 1);
                        }
                        smc0VarN.add(new ewb0(arrayList4, dwb0Var, "Leaderboard"));
                        if (z2) {
                            smc0VarN.add(new jg20());
                        }
                        return k4p1.k(smc0VarN);
                    }
                    Object next = it.next();
                    int i7 = i2 + 1;
                    if (i2 < 0) {
                        p7h.T();
                        throw null;
                    }
                    LeaderboardItem leaderboardItem = (LeaderboardItem) next;
                    ArrayList arrayList5 = arrayList3;
                    String name = leaderboardItem.r().getName();
                    String strP = leaderboardItem.r().p();
                    String strValueOf = String.valueOf(i7);
                    if (leaderboardItem.s()) {
                        xxhVarF = pap1.F(leaderboardItem.o(), 1);
                    }
                    arrayList5.add(new dwb0(name, strP, strValueOf, xxhVarF, leaderboardItem.r().r(), leaderboardItem.n(), leaderboardItem.r().q(), leaderboardItem.r().o(), leaderboardItem.q(), iY));
                    arrayList3 = arrayList5;
                    i2 = i7;
                }
                break;
            case 4:
                if (statsDetailsResponse.x()) {
                    z = statsDetailsResponse.q().n() == az91Var;
                    smc0 smc0VarN2 = k4p1.n();
                    smc0VarN2.add(new fls0());
                    if (!z) {
                        smc0VarN2.add(new jg20());
                    }
                    SocialArtistsDetailsPage socialArtistsDetailsPageQ = statsDetailsResponse.q();
                    int iY2 = y(socialArtistsDetailsPageQ.n());
                    h290 h290VarP3 = socialArtistsDetailsPageQ.p();
                    ArrayList arrayList6 = new ArrayList(q7h.U(h290VarP3, 10));
                    for (Object obj3 : h290VarP3) {
                        int i8 = i2 + 1;
                        if (i2 < 0) {
                            p7h.T();
                            throw null;
                        }
                        SocialTopArtists socialTopArtists = (SocialTopArtists) obj3;
                        TopArtist topArtistO = socialTopArtists.o();
                        Artist artistO2 = topArtistO.o();
                        artistO2.getClass();
                        arrayList6.add(p(artistO2, i2, topArtistO, socialTopArtists, iY2));
                        i2 = i8;
                    }
                    smc0VarN2.add(new o8f1((Integer) null, "TopArtists", arrayList6));
                    if (z) {
                        smc0VarN2.add(new jg20());
                    }
                    return k4p1.k(smc0VarN2);
                }
                break;
            case 5:
                if (statsDetailsResponse.y()) {
                    z = statsDetailsResponse.s().n() == az91Var;
                    smc0 smc0VarN3 = k4p1.n();
                    smc0VarN3.add(new fls0());
                    if (!z) {
                        smc0VarN3.add(new jg20());
                    }
                    SocialTrackDetailsPage socialTrackDetailsPageS = statsDetailsResponse.s();
                    int iY3 = y(socialTrackDetailsPageS.n());
                    h290 h290VarP4 = socialTrackDetailsPageS.p();
                    ArrayList arrayList7 = new ArrayList(q7h.U(h290VarP4, 10));
                    for (Object obj4 : h290VarP4) {
                        int i9 = i2 + 1;
                        if (i2 < 0) {
                            p7h.T();
                            throw null;
                        }
                        SocialTopTrack socialTopTrack = (SocialTopTrack) obj4;
                        TopTrack topTrackO = socialTopTrack.o();
                        Track trackS2 = topTrackO.s();
                        trackS2.getClass();
                        arrayList7.add(q(trackS2, i2, topTrackO, socialTopTrack, iY3));
                        i2 = i9;
                    }
                    smc0VarN3.add(new xff1((Integer) null, "TopTracks", arrayList7));
                    if (z) {
                        smc0VarN3.add(new jg20());
                    }
                    return k4p1.k(smc0VarN3);
                }
                break;
            case 6:
                if (statsDetailsResponse.z()) {
                    SoundTownDetailsPage soundTownDetailsPageT = statsDetailsResponse.t();
                    d761 d761VarA = b761.a(soundTownDetailsPageT.o());
                    d761 d761VarN = n(soundTownDetailsPageT.n());
                    List tracksList = soundTownDetailsPageT.getTracksList();
                    ArrayList arrayList8 = new ArrayList(q7h.U(tracksList, 10));
                    for (Object obj5 : tracksList) {
                        int i10 = i2 + 1;
                        if (i2 < 0) {
                            p7h.T();
                            throw null;
                        }
                        TopTrack topTrack2 = (TopTrack) obj5;
                        topTrack2.getClass();
                        String strValueOf2 = String.valueOf(i10);
                        String name2 = topTrack2.s().getName();
                        String strN = topTrack2.s().n();
                        String strO = topTrack2.s().o();
                        String uri = topTrack2.s().getUri();
                        PositionChangeLabel positionChangeLabelQ = topTrack2.q();
                        xxh xxhVarF2 = pap1.F(positionChangeLabelQ.n(), positionChangeLabelQ.p());
                        Paragraph paragraphP = topTrack2.p();
                        if (!topTrack2.t()) {
                            paragraphP = null;
                        }
                        arrayList8.add(new crf1(strValueOf2, name2, strN, strO, uri, xxhVarF2, paragraphP != null ? b761.a(paragraphP) : null, topTrack2.n()));
                        i2 = i10;
                    }
                    return Collections.singletonList(new cka1(d761VarA, d761VarN, new drf1(arrayList8), "SoundTownChart"));
                }
                break;
            default:
                n57.s("Unknown page type in V2 response");
                hhg1.n("Invalid page type");
                return null;
        }
        return z6x.a;
    }

    public static q8f1 p(Artist artist, int i, TopArtist topArtist, SocialTopArtists socialTopArtists, int i2) {
        ArrayList arrayList;
        h290<Person> h290VarN;
        String name = artist.getName();
        String uri = artist.getUri();
        String strValueOf = String.valueOf(i + 1);
        PositionChangeLabel positionChangeLabelQ = topArtist.q();
        xxh xxhVarF = pap1.F(positionChangeLabelQ.n(), positionChangeLabelQ.p());
        d761 d761VarN = n(topArtist.r());
        String strN = artist.n();
        String strN2 = topArtist.n();
        if (socialTopArtists == null || (h290VarN = socialTopArtists.n()) == null) {
            arrayList = z6x.a;
        } else {
            arrayList = new ArrayList(q7h.U(h290VarN, 10));
            for (Person person : h290VarN) {
                arrayList.add(new m8f1(person.q(), person.getName(), person.p(), person.r(), person.o()));
            }
        }
        return new q8f1(name, strValueOf, xxhVarF, uri, 2131963599, strN2, strN, d761VarN, i2, arrayList);
    }

    public static zff1 q(Track track, int i, TopTrack topTrack, SocialTopTrack socialTopTrack, int i2) {
        ArrayList arrayList;
        h290<Person> h290VarN;
        String name = track.getName();
        String uri = track.getUri();
        String strValueOf = String.valueOf(i + 1);
        PositionChangeLabel positionChangeLabelQ = topTrack.q();
        xxh xxhVarF = pap1.F(positionChangeLabelQ.n(), positionChangeLabelQ.p());
        Paragraph paragraphP = topTrack.p();
        if (!topTrack.t()) {
            paragraphP = null;
        }
        d761 d761VarA = paragraphP != null ? b761.a(paragraphP) : null;
        d761 d761VarN = n(topTrack.r());
        String strO = track.o();
        String strN = track.n();
        String strN2 = topTrack.n();
        if (socialTopTrack == null || (h290VarN = socialTopTrack.n()) == null) {
            arrayList = z6x.a;
        } else {
            arrayList = new ArrayList(q7h.U(h290VarN, 10));
            for (Person person : h290VarN) {
                arrayList.add(new vff1(person.q(), person.getName(), person.p(), person.r(), person.o()));
            }
        }
        return new zff1(name, strValueOf, d761VarA, xxhVarF, uri, 2131963624, strN2, strO, d761VarN, strN, i2, arrayList);
    }

    public static final js20 r(xpw xpwVar, iu30 iu30Var, Function0 function0, iu30 iu30Var2, iu30 iu30Var3) {
        return x3p1.n(new mhg0(iu30Var, (byte) 23), new hii0(function0, (byte) 0), new rvg0(new AtomicBoolean(false), iu30Var2, iu30Var3, (byte) 17), null, k8b0.Z, 8);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0083 A[PHI: r12 r13
      0x0083: PHI (r12v4 int) = (r12v3 int), (r12v10 int) binds: [B:28:0x0080, B:17:0x0038] A[DONT_GENERATE, DONT_INLINE]
      0x0083: PHI (r13v4 p.xtb0) = (r13v3 p.xtb0), (r13v7 p.xtb0) binds: [B:28:0x0080, B:17:0x0038] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008f, code lost:
    
        if (r13.f(0, 0, r0) == r8) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object s(p.xtb0 r12, int r13, p.onm r14) {
        /*
            boolean r0 = r14 instanceof p.wix
            if (r0 == 0) goto L13
            r0 = r14
            p.wix r0 = (p.wix) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            p.wix r0 = new p.wix
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.c
            int r1 = r0.d
            r2 = 0
            r3 = 0
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            p.d9n r8 = p.d9n.a
            if (r1 == 0) goto L50
            if (r1 == r7) goto L48
            if (r1 == r6) goto L40
            if (r1 == r5) goto L38
            if (r1 != r4) goto L32
            p.hm5.M(r14)
            goto L92
        L32:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r12)
            return r2
        L38:
            int r12 = r0.b
            p.xtb0 r13 = r0.a
            p.hm5.M(r14)
            goto L83
        L40:
            int r12 = r0.b
            p.xtb0 r13 = r0.a
            p.hm5.M(r14)
            goto L74
        L48:
            int r13 = r0.b
            p.xtb0 r12 = r0.a
            p.hm5.M(r14)
            goto L62
        L50:
            p.hm5.M(r14)
            r0.a = r12
            r0.b = r13
            r0.d = r7
            r9 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r14 = p.hap1.i(r9, r0)
            if (r14 != r8) goto L62
            goto L91
        L62:
            r0.a = r12
            r0.b = r13
            r0.d = r6
            p.df41 r14 = p.xtb0.y
            java.lang.Object r14 = r12.f(r13, r3, r0)
            if (r14 != r8) goto L71
            goto L91
        L71:
            r11 = r13
            r13 = r12
            r12 = r11
        L74:
            r0.a = r13
            r0.b = r12
            r0.d = r5
            r5 = 1500(0x5dc, double:7.41E-321)
            java.lang.Object r14 = p.hap1.i(r5, r0)
            if (r14 != r8) goto L83
            goto L91
        L83:
            r0.a = r2
            r0.b = r12
            r0.d = r4
            p.df41 r12 = p.xtb0.y
            java.lang.Object r12 = r13.f(r3, r3, r0)
            if (r12 != r8) goto L92
        L91:
            return r8
        L92:
            p.rih1 r12 = p.rih1.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p.pro1.s(p.xtb0, int, p.onm):java.lang.Object");
    }

    public static final String t(String str) {
        w6b1 w6b1VarA = f7b1.a(blc0.Wf);
        w6b1VarA.getClass();
        return o7h.y0(o7h.O0(str, o7h.l0(1, ihc1.Q0((CharSequence) o7h.q0(w6b1VarA.c), new String[]{":"}, 0, 6))), ":", (String) null, (String) null, (iu30) null, 62);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0035 A[PHI: r1
      0x0035: PHI (r1v5 int) = (r1v4 int), (r1v6 int) binds: [B:14:0x002f, B:16:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    public static final sco u(CTA cta) {
        String strN = cta.n();
        String url = cta.getUrl();
        String str = null;
        if (!cta.hasUrl()) {
            url = null;
        }
        if (url != null && url.length() != 0) {
            str = url;
        }
        int i = 0;
        if (cta.q()) {
            int i2 = s6c0.a[cta.p().ordinal()];
            int i3 = 1;
            if (i2 != 1) {
                i3 = 2;
                if (i2 == 2) {
                    i = i3;
                }
            } else {
                i = i3;
            }
        }
        return new sco(i, strN, str);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0035  */
    /* JADX WARN: Code duplicated, block: B:22:0x0038  */
    /* JADX WARN: Code duplicated, block: B:25:0x0055  */
    /* JADX WARN: Code duplicated, block: B:27:0x006b  */
    /* JADX WARN: Code duplicated, block: B:29:0x006e  */
    /* JADX WARN: Code duplicated, block: B:31:0x0071  */
    /* JADX WARN: Code duplicated, block: B:32:0x0073  */
    /* JADX WARN: Code duplicated, block: B:37:0x007b A[PHI: r9
      0x007b: PHI (r9v2 int) = (r9v1 int), (r9v3 int) binds: [B:28:0x006c, B:30:0x006f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:42:0x0092  */
    /* JADX WARN: Code duplicated, block: B:44:0x0095  */
    /* JADX WARN: Code duplicated, block: B:45:0x009b  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:51:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:57:0x007c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x007c A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    public static final o6c0 v(GetTransferResultsBannerResponse getTransferResultsBannerResponse) {
        e8a e8aVar;
        e8a e8aVar2;
        ArrayList arrayList;
        CTA ctaQ;
        sco scoVarU;
        CTA ctaR;
        int iOrdinal;
        int i;
        int i2;
        switch (getTransferResultsBannerResponse.n().ordinal()) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
            case grn1.d /* 12 */:
                e8aVar = null;
                if (e8aVar == null) {
                    return m6c0.a;
                }
                String title = getTransferResultsBannerResponse.getTitle();
                h290<BannerBody> h290VarO = getTransferResultsBannerResponse.o();
                arrayList = new ArrayList(q7h.U(h290VarO, 10));
                for (BannerBody bannerBody : h290VarO) {
                    bannerBody.getClass();
                    iOrdinal = bannerBody.n().ordinal();
                    i = 3;
                    if (iOrdinal != 0) {
                        i2 = 1;
                        if (iOrdinal != 1) {
                            i2 = 2;
                            if (iOrdinal != 2) {
                                i = i2;
                            } else if (iOrdinal != 3 && iOrdinal != 4) {
                                eg.o();
                                return null;
                            }
                        } else {
                            i = i2;
                        }
                    }
                    arrayList.add(new z4a(i, bannerBody.o()));
                }
                ctaQ = getTransferResultsBannerResponse.q();
                if (!getTransferResultsBannerResponse.t()) {
                    ctaQ = null;
                }
                if (ctaQ != null) {
                    scoVarU = u(ctaQ);
                } else {
                    scoVarU = null;
                }
                ctaR = getTransferResultsBannerResponse.r();
                if (!getTransferResultsBannerResponse.u()) {
                    ctaR = null;
                }
                return new n6c0(e8aVar, title, arrayList, scoVarU, ctaR != null ? u(ctaR) : null, getTransferResultsBannerResponse.s(), getTransferResultsBannerResponse.p());
            case 1:
                e8aVar2 = e8a.a;
                e8aVar = e8aVar2;
                if (e8aVar == null) {
                    return m6c0.a;
                }
                String title2 = getTransferResultsBannerResponse.getTitle();
                h290<BannerBody> h290VarO2 = getTransferResultsBannerResponse.o();
                arrayList = new ArrayList(q7h.U(h290VarO2, 10));
                while (r0.hasNext()) {
                    bannerBody.getClass();
                    iOrdinal = bannerBody.n().ordinal();
                    i = 3;
                    if (iOrdinal != 0) {
                        i2 = 1;
                        if (iOrdinal != 1) {
                            i2 = 2;
                            if (iOrdinal != 2) {
                                i = i2;
                            } else if (iOrdinal != 3) {
                                continue;
                            }
                        } else {
                            i = i2;
                        }
                    }
                    arrayList.add(new z4a(i, bannerBody.o()));
                }
                ctaQ = getTransferResultsBannerResponse.q();
                if (!getTransferResultsBannerResponse.t()) {
                    ctaQ = null;
                }
                if (ctaQ != null) {
                    scoVarU = u(ctaQ);
                } else {
                    scoVarU = null;
                }
                ctaR = getTransferResultsBannerResponse.r();
                if (!getTransferResultsBannerResponse.u()) {
                    ctaR = null;
                }
                return new n6c0(e8aVar, title2, arrayList, scoVarU, ctaR != null ? u(ctaR) : null, getTransferResultsBannerResponse.s(), getTransferResultsBannerResponse.p());
            case 2:
                e8aVar2 = e8a.b;
                e8aVar = e8aVar2;
                if (e8aVar == null) {
                    return m6c0.a;
                }
                String title3 = getTransferResultsBannerResponse.getTitle();
                h290<BannerBody> h290VarO3 = getTransferResultsBannerResponse.o();
                arrayList = new ArrayList(q7h.U(h290VarO3, 10));
                while (r0.hasNext()) {
                    bannerBody.getClass();
                    iOrdinal = bannerBody.n().ordinal();
                    i = 3;
                    if (iOrdinal != 0) {
                        i2 = 1;
                        if (iOrdinal != 1) {
                            i2 = 2;
                            if (iOrdinal != 2) {
                                i = i2;
                            } else if (iOrdinal != 3) {
                                continue;
                            }
                        } else {
                            i = i2;
                        }
                    }
                    arrayList.add(new z4a(i, bannerBody.o()));
                }
                ctaQ = getTransferResultsBannerResponse.q();
                if (!getTransferResultsBannerResponse.t()) {
                    ctaQ = null;
                }
                if (ctaQ != null) {
                    scoVarU = u(ctaQ);
                } else {
                    scoVarU = null;
                }
                ctaR = getTransferResultsBannerResponse.r();
                if (!getTransferResultsBannerResponse.u()) {
                    ctaR = null;
                }
                return new n6c0(e8aVar, title3, arrayList, scoVarU, ctaR != null ? u(ctaR) : null, getTransferResultsBannerResponse.s(), getTransferResultsBannerResponse.p());
            case 3:
                e8aVar2 = e8a.c;
                e8aVar = e8aVar2;
                if (e8aVar == null) {
                    return m6c0.a;
                }
                String title4 = getTransferResultsBannerResponse.getTitle();
                h290<BannerBody> h290VarO4 = getTransferResultsBannerResponse.o();
                arrayList = new ArrayList(q7h.U(h290VarO4, 10));
                while (r0.hasNext()) {
                    bannerBody.getClass();
                    iOrdinal = bannerBody.n().ordinal();
                    i = 3;
                    if (iOrdinal != 0) {
                        i2 = 1;
                        if (iOrdinal != 1) {
                            i2 = 2;
                            if (iOrdinal != 2) {
                                i = i2;
                            } else if (iOrdinal != 3) {
                                continue;
                            }
                        } else {
                            i = i2;
                        }
                    }
                    arrayList.add(new z4a(i, bannerBody.o()));
                }
                ctaQ = getTransferResultsBannerResponse.q();
                if (!getTransferResultsBannerResponse.t()) {
                    ctaQ = null;
                }
                if (ctaQ != null) {
                    scoVarU = u(ctaQ);
                } else {
                    scoVarU = null;
                }
                ctaR = getTransferResultsBannerResponse.r();
                if (!getTransferResultsBannerResponse.u()) {
                    ctaR = null;
                }
                return new n6c0(e8aVar, title4, arrayList, scoVarU, ctaR != null ? u(ctaR) : null, getTransferResultsBannerResponse.s(), getTransferResultsBannerResponse.p());
            case 4:
                e8aVar2 = e8a.d;
                e8aVar = e8aVar2;
                if (e8aVar == null) {
                    return m6c0.a;
                }
                String title5 = getTransferResultsBannerResponse.getTitle();
                h290<BannerBody> h290VarO5 = getTransferResultsBannerResponse.o();
                arrayList = new ArrayList(q7h.U(h290VarO5, 10));
                while (r0.hasNext()) {
                    bannerBody.getClass();
                    iOrdinal = bannerBody.n().ordinal();
                    i = 3;
                    if (iOrdinal != 0) {
                        i2 = 1;
                        if (iOrdinal != 1) {
                            i2 = 2;
                            if (iOrdinal != 2) {
                                i = i2;
                            } else if (iOrdinal != 3) {
                                continue;
                            }
                        } else {
                            i = i2;
                        }
                    }
                    arrayList.add(new z4a(i, bannerBody.o()));
                }
                ctaQ = getTransferResultsBannerResponse.q();
                if (!getTransferResultsBannerResponse.t()) {
                    ctaQ = null;
                }
                if (ctaQ != null) {
                    scoVarU = u(ctaQ);
                } else {
                    scoVarU = null;
                }
                ctaR = getTransferResultsBannerResponse.r();
                if (!getTransferResultsBannerResponse.u()) {
                    ctaR = null;
                }
                return new n6c0(e8aVar, title5, arrayList, scoVarU, ctaR != null ? u(ctaR) : null, getTransferResultsBannerResponse.s(), getTransferResultsBannerResponse.p());
            case 5:
                e8aVar2 = e8a.e;
                e8aVar = e8aVar2;
                if (e8aVar == null) {
                    return m6c0.a;
                }
                String title6 = getTransferResultsBannerResponse.getTitle();
                h290<BannerBody> h290VarO6 = getTransferResultsBannerResponse.o();
                arrayList = new ArrayList(q7h.U(h290VarO6, 10));
                while (r0.hasNext()) {
                    bannerBody.getClass();
                    iOrdinal = bannerBody.n().ordinal();
                    i = 3;
                    if (iOrdinal != 0) {
                        i2 = 1;
                        if (iOrdinal != 1) {
                            i2 = 2;
                            if (iOrdinal != 2) {
                                i = i2;
                            } else if (iOrdinal != 3) {
                                continue;
                            }
                        } else {
                            i = i2;
                        }
                    }
                    arrayList.add(new z4a(i, bannerBody.o()));
                }
                ctaQ = getTransferResultsBannerResponse.q();
                if (!getTransferResultsBannerResponse.t()) {
                    ctaQ = null;
                }
                if (ctaQ != null) {
                    scoVarU = u(ctaQ);
                } else {
                    scoVarU = null;
                }
                ctaR = getTransferResultsBannerResponse.r();
                if (!getTransferResultsBannerResponse.u()) {
                    ctaR = null;
                }
                return new n6c0(e8aVar, title6, arrayList, scoVarU, ctaR != null ? u(ctaR) : null, getTransferResultsBannerResponse.s(), getTransferResultsBannerResponse.p());
            case 6:
                e8aVar2 = e8a.f;
                e8aVar = e8aVar2;
                if (e8aVar == null) {
                    return m6c0.a;
                }
                String title7 = getTransferResultsBannerResponse.getTitle();
                h290<BannerBody> h290VarO7 = getTransferResultsBannerResponse.o();
                arrayList = new ArrayList(q7h.U(h290VarO7, 10));
                while (r0.hasNext()) {
                    bannerBody.getClass();
                    iOrdinal = bannerBody.n().ordinal();
                    i = 3;
                    if (iOrdinal != 0) {
                        i2 = 1;
                        if (iOrdinal != 1) {
                            i2 = 2;
                            if (iOrdinal != 2) {
                                i = i2;
                            } else if (iOrdinal != 3) {
                                continue;
                            }
                        } else {
                            i = i2;
                        }
                    }
                    arrayList.add(new z4a(i, bannerBody.o()));
                }
                ctaQ = getTransferResultsBannerResponse.q();
                if (!getTransferResultsBannerResponse.t()) {
                    ctaQ = null;
                }
                if (ctaQ != null) {
                    scoVarU = u(ctaQ);
                } else {
                    scoVarU = null;
                }
                ctaR = getTransferResultsBannerResponse.r();
                if (!getTransferResultsBannerResponse.u()) {
                    ctaR = null;
                }
                return new n6c0(e8aVar, title7, arrayList, scoVarU, ctaR != null ? u(ctaR) : null, getTransferResultsBannerResponse.s(), getTransferResultsBannerResponse.p());
            case 7:
                e8aVar2 = e8a.g;
                e8aVar = e8aVar2;
                if (e8aVar == null) {
                    return m6c0.a;
                }
                String title8 = getTransferResultsBannerResponse.getTitle();
                h290<BannerBody> h290VarO8 = getTransferResultsBannerResponse.o();
                arrayList = new ArrayList(q7h.U(h290VarO8, 10));
                while (r0.hasNext()) {
                    bannerBody.getClass();
                    iOrdinal = bannerBody.n().ordinal();
                    i = 3;
                    if (iOrdinal != 0) {
                        i2 = 1;
                        if (iOrdinal != 1) {
                            i2 = 2;
                            if (iOrdinal != 2) {
                                i = i2;
                            } else if (iOrdinal != 3) {
                                continue;
                            }
                        } else {
                            i = i2;
                        }
                    }
                    arrayList.add(new z4a(i, bannerBody.o()));
                }
                ctaQ = getTransferResultsBannerResponse.q();
                if (!getTransferResultsBannerResponse.t()) {
                    ctaQ = null;
                }
                if (ctaQ != null) {
                    scoVarU = u(ctaQ);
                } else {
                    scoVarU = null;
                }
                ctaR = getTransferResultsBannerResponse.r();
                if (!getTransferResultsBannerResponse.u()) {
                    ctaR = null;
                }
                return new n6c0(e8aVar, title8, arrayList, scoVarU, ctaR != null ? u(ctaR) : null, getTransferResultsBannerResponse.s(), getTransferResultsBannerResponse.p());
            case 8:
                e8aVar2 = e8a.h;
                e8aVar = e8aVar2;
                if (e8aVar == null) {
                    return m6c0.a;
                }
                String title9 = getTransferResultsBannerResponse.getTitle();
                h290<BannerBody> h290VarO9 = getTransferResultsBannerResponse.o();
                arrayList = new ArrayList(q7h.U(h290VarO9, 10));
                while (r0.hasNext()) {
                    bannerBody.getClass();
                    iOrdinal = bannerBody.n().ordinal();
                    i = 3;
                    if (iOrdinal != 0) {
                        i2 = 1;
                        if (iOrdinal != 1) {
                            i2 = 2;
                            if (iOrdinal != 2) {
                                i = i2;
                            } else if (iOrdinal != 3) {
                                continue;
                            }
                        } else {
                            i = i2;
                        }
                    }
                    arrayList.add(new z4a(i, bannerBody.o()));
                }
                ctaQ = getTransferResultsBannerResponse.q();
                if (!getTransferResultsBannerResponse.t()) {
                    ctaQ = null;
                }
                if (ctaQ != null) {
                    scoVarU = u(ctaQ);
                } else {
                    scoVarU = null;
                }
                ctaR = getTransferResultsBannerResponse.r();
                if (!getTransferResultsBannerResponse.u()) {
                    ctaR = null;
                }
                return new n6c0(e8aVar, title9, arrayList, scoVarU, ctaR != null ? u(ctaR) : null, getTransferResultsBannerResponse.s(), getTransferResultsBannerResponse.p());
            case 9:
                e8aVar2 = e8a.i;
                e8aVar = e8aVar2;
                if (e8aVar == null) {
                    return m6c0.a;
                }
                String title10 = getTransferResultsBannerResponse.getTitle();
                h290<BannerBody> h290VarO10 = getTransferResultsBannerResponse.o();
                arrayList = new ArrayList(q7h.U(h290VarO10, 10));
                while (r0.hasNext()) {
                    bannerBody.getClass();
                    iOrdinal = bannerBody.n().ordinal();
                    i = 3;
                    if (iOrdinal != 0) {
                        i2 = 1;
                        if (iOrdinal != 1) {
                            i2 = 2;
                            if (iOrdinal != 2) {
                                i = i2;
                            } else if (iOrdinal != 3) {
                                continue;
                            }
                        } else {
                            i = i2;
                        }
                    }
                    arrayList.add(new z4a(i, bannerBody.o()));
                }
                ctaQ = getTransferResultsBannerResponse.q();
                if (!getTransferResultsBannerResponse.t()) {
                    ctaQ = null;
                }
                if (ctaQ != null) {
                    scoVarU = u(ctaQ);
                } else {
                    scoVarU = null;
                }
                ctaR = getTransferResultsBannerResponse.r();
                if (!getTransferResultsBannerResponse.u()) {
                    ctaR = null;
                }
                return new n6c0(e8aVar, title10, arrayList, scoVarU, ctaR != null ? u(ctaR) : null, getTransferResultsBannerResponse.s(), getTransferResultsBannerResponse.p());
            case 10:
                e8aVar2 = e8a.t;
                e8aVar = e8aVar2;
                if (e8aVar == null) {
                    return m6c0.a;
                }
                String title11 = getTransferResultsBannerResponse.getTitle();
                h290<BannerBody> h290VarO11 = getTransferResultsBannerResponse.o();
                arrayList = new ArrayList(q7h.U(h290VarO11, 10));
                while (r0.hasNext()) {
                    bannerBody.getClass();
                    iOrdinal = bannerBody.n().ordinal();
                    i = 3;
                    if (iOrdinal != 0) {
                        i2 = 1;
                        if (iOrdinal != 1) {
                            i2 = 2;
                            if (iOrdinal != 2) {
                                i = i2;
                            } else if (iOrdinal != 3) {
                                continue;
                            }
                        } else {
                            i = i2;
                        }
                    }
                    arrayList.add(new z4a(i, bannerBody.o()));
                }
                ctaQ = getTransferResultsBannerResponse.q();
                if (!getTransferResultsBannerResponse.t()) {
                    ctaQ = null;
                }
                if (ctaQ != null) {
                    scoVarU = u(ctaQ);
                } else {
                    scoVarU = null;
                }
                ctaR = getTransferResultsBannerResponse.r();
                if (!getTransferResultsBannerResponse.u()) {
                    ctaR = null;
                }
                return new n6c0(e8aVar, title11, arrayList, scoVarU, ctaR != null ? u(ctaR) : null, getTransferResultsBannerResponse.s(), getTransferResultsBannerResponse.p());
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                e8aVar2 = e8a.X;
                e8aVar = e8aVar2;
                if (e8aVar == null) {
                    return m6c0.a;
                }
                String title12 = getTransferResultsBannerResponse.getTitle();
                h290<BannerBody> h290VarO12 = getTransferResultsBannerResponse.o();
                arrayList = new ArrayList(q7h.U(h290VarO12, 10));
                while (r0.hasNext()) {
                    bannerBody.getClass();
                    iOrdinal = bannerBody.n().ordinal();
                    i = 3;
                    if (iOrdinal != 0) {
                        i2 = 1;
                        if (iOrdinal != 1) {
                            i2 = 2;
                            if (iOrdinal != 2) {
                                i = i2;
                            } else if (iOrdinal != 3) {
                                continue;
                            }
                        } else {
                            i = i2;
                        }
                    }
                    arrayList.add(new z4a(i, bannerBody.o()));
                }
                ctaQ = getTransferResultsBannerResponse.q();
                if (!getTransferResultsBannerResponse.t()) {
                    ctaQ = null;
                }
                if (ctaQ != null) {
                    scoVarU = u(ctaQ);
                } else {
                    scoVarU = null;
                }
                ctaR = getTransferResultsBannerResponse.r();
                if (!getTransferResultsBannerResponse.u()) {
                    ctaR = null;
                }
                return new n6c0(e8aVar, title12, arrayList, scoVarU, ctaR != null ? u(ctaR) : null, getTransferResultsBannerResponse.s(), getTransferResultsBannerResponse.p());
            default:
                eg.o();
                return null;
        }
    }

    public static final f7q0 w(lpl lplVar) {
        l7q0 j7q0Var;
        String str = lplVar.c;
        String str2 = lplVar.a;
        hmp0 hmp0Var = lplVar.e;
        s7q0 m7q0Var = null;
        String str3 = hmp0Var != null ? hmp0Var.b : null;
        bpl bplVar = lplVar.d;
        if (bplVar != null) {
            if (bplVar instanceof bpl) {
                bpl bplVar2 = bplVar;
                m7q0Var = new i7q0(bplVar2.a, bplVar2.b);
            } else if (bplVar instanceof hpl) {
                hpl hplVar = (hpl) bplVar;
                m7q0Var = new o7q0(hplVar.a, hplVar.b, hplVar.c, hplVar.d);
            } else if (bplVar instanceof jpl) {
                jpl jplVar = (jpl) bplVar;
                m7q0Var = new r7q0(jplVar.a, jplVar.b, jplVar.c);
            } else if (bplVar instanceof ipl) {
                m7q0Var = new q7q0(((ipl) bplVar).a);
            } else if (bplVar instanceof gpl) {
                m7q0Var = new n7q0(((gpl) bplVar).a);
            } else {
                if (!(bplVar instanceof fpl)) {
                    eg.o();
                    return null;
                }
                fpl fplVar = (fpl) bplVar;
                String str4 = fplVar.a;
                long j = fplVar.b;
                long j2 = fplVar.c;
                epl eplVar = fplVar.d;
                if (eplVar instanceof dpl) {
                    j7q0Var = new k7q0(((dpl) eplVar).a);
                } else {
                    if (!(eplVar instanceof cpl)) {
                        eg.o();
                        return null;
                    }
                    j7q0Var = new j7q0(((cpl) eplVar).a);
                }
                m7q0Var = new m7q0(str4, j, j2, j7q0Var);
            }
        }
        return new f7q0(str2, str3, str, lplVar.g, m7q0Var, 96);
    }

    public static final String x(int i) {
        int iC = l1d.C(i);
        if (iC == 0) {
            return "LOW";
        }
        if (iC == 1) {
            return "MEDIUM";
        }
        if (iC == 2) {
            return "HIGH";
        }
        if (iC == 3) {
            return "UNKNOWN";
        }
        eg.o();
        return null;
    }

    public static int y(az91 az91Var) {
        int iOrdinal = az91Var.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return 1;
            }
            if (iOrdinal != 2 && iOrdinal != 3) {
                eg.o();
                return 0;
            }
        }
        return 2;
    }
}
