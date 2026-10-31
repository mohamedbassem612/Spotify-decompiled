package p;

import android.content.Intent;
import android.icu.text.NumberFormat;
import android.net.Uri;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import app.p000rive.semantics.SemanticState;
import com.google.protobuf.h;
import com.spotify.ads.esperanto.proto.Ad;
import com.spotify.ads.esperanto.proto.AdMedia;
import com.spotify.ads.esperanto.proto.CanvasImage;
import com.spotify.ads.esperanto.proto.CanvasVideo;
import com.spotify.ads.esperanto.proto.Carousel;
import com.spotify.ads.esperanto.proto.CarouselItem;
import com.spotify.ads.esperanto.proto.Companion;
import com.spotify.ads.esperanto.proto.ItemSalePrice;
import com.spotify.ads.esperanto.proto.Survey;
import com.spotify.ads.esperanto.proto.SurveyQuestion;
import com.spotify.ads.esperanto.proto.SurveyQuestionOption;
import com.spotify.ads.esperanto.proto.SurveyTransparencyContent;
import com.spotify.adsinternal.adscore.model.Format;
import com.spotify.connect.artisanal_cast.TlsSocketProvider;
import com.spotify.messages.RejectedClientEventNonAuth;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class t2p1 {
    public static b180 a;
    public static b180 b;

    public static final gq70 A(AdMedia adMedia) {
        p57 o57Var;
        int iV = adMedia.v();
        int iQ = adMedia.q();
        if (adMedia.hasUrl()) {
            o57Var = new p57(adMedia.getUrl());
        } else {
            if (!adMedia.w()) {
                return null;
            }
            o57Var = new o57(adMedia.r());
        }
        return new gq70(iV, iQ, o57Var);
    }

    public static final String B(String str) {
        Set set = s4b1.f;
        s4b1 s4b1VarX = uic.x(str);
        v5b1 v5b1Var = s4b1VarX.d;
        if (!u890.j(v5b1Var != null ? v5b1Var.getType() : null, nyu0.e)) {
            if (!u890.j(v5b1Var != null ? v5b1Var.getType() : null, wyu0.f)) {
                ncn0.d(s4b1VarX, " URI is not supported, only Playlist URIs are supported.");
                return null;
            }
        }
        return "spotify:internal:playlist-overlap-sheet:".concat(s4b1VarX.h());
    }

    public static final a7j1 C(AdMedia adMedia) {
        p57 o57Var;
        String strS = adMedia.s();
        int iV = adMedia.v();
        int iQ = adMedia.q();
        int iN = adMedia.n();
        if (adMedia.hasUrl()) {
            o57Var = new p57(adMedia.getUrl());
        } else {
            if (!adMedia.x()) {
                return null;
            }
            o57Var = new o57(adMedia.u());
        }
        return new a7j1(strS, iV, iQ, iN, o57Var, Long.valueOf(adMedia.p()));
    }

    public static final void a(String str, String str2, int i, xho xhoVar, String str3, qim0 qim0Var, b0k b0kVar, int i2) {
        qim0 qim0Var2;
        Function0 function0;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1813258568);
        j06 j06Var = x340Var.a;
        int i3 = i2 | (x340Var.g(str) ? 4 : 2) | (x340Var.g(str2) ? 32 : 16) | (x340Var.e(i == 0 ? -1 : l1d.C(i)) ? SemanticState.Hidden : SemanticState.Focused) | (x340Var.i(xhoVar) ? SemanticState.Modal : SemanticState.ReadOnly) | (x340Var.g(str3) ? TlsSocketProvider.READ_BUFFER_SIZE : SemanticState.Multiline) | 196608;
        if (x340Var.Y(i3 & 1, (74899 & i3) != 74898)) {
            fra fraVar = een.N0;
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            jw31 jw31VarA = ew31.a(new d36(12.0f, true, new um5(false)), fraVar, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var, qim0Var3);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z = x340Var.S;
            Function0 function1 = hmb0.t1;
            if (z) {
                x340Var.l(function1);
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
            if (1.0f <= 0.0d) {
                of80.a("invalid weight; must be greater than zero");
            }
            wnb0 wnb0Var = new wnb0(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, wnb0Var);
            x340Var.m0();
            if (x340Var.S) {
                function0 = function1;
                x340Var.l(function0);
            } else {
                function0 = function1;
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            cvx cvxVar2 = cbx.b(x340Var).b;
            jw31 jw31VarA2 = ew31.a(new d36(12.0f, true, new um5(false)), fraVar, x340Var, 0);
            Function0 function2 = function0;
            int iHashCode3 = Long.hashCode(x340Var.T);
            xos0 xos0VarM3 = x340Var.m();
            qim0 qim0VarE3 = zr7.E(x340Var, qim0Var3);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(function2);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA2, x340Var, lljVar);
            nko1.H(xos0VarM3, x340Var, lljVar2);
            x0d.q(iHashCode3, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE3, x340Var, lljVar4);
            lee1 lee1Var = cbx.d(x340Var).e;
            long j = cbx.a(x340Var).b.a;
            cjc0 cjc0Var = new cjc0(1);
            if (1.0f <= 0.0d) {
                of80.a("invalid weight; must be greater than zero");
            }
            uwo1.e(str, e9k.n(62, new wnb0(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, false)), lee1Var, j, (a0e1) null, (iu30) null, 0, false, cjc0Var, 0, (qx8) null, x340Var, i3 & 14, 0, 1776);
            if (i != 0) {
                x340Var.i0(1400376550);
                kqn1.d(i, (i3 >> 6) & 14, 2, x340Var, (qim0) null);
                x340Var.r(false);
            } else {
                x340Var.i0(1400459196);
                x340Var.r(false);
            }
            x340Var.r(true);
            uwo1.e(str2, e9k.n(62, qim0Var3), cbx.d(x340Var).g, cbx.a(x340Var).b.b, (a0e1) null, (iu30) null, 0, false, new cjc0(1), 0, (qx8) null, x340Var, (i3 >> 3) & 14, 0, 1776);
            x340Var = x340Var;
            x340Var.r(true);
            if (str3.length() > 0) {
                x340Var.i0(-96220753);
                otw.c(xhoVar, new uho(str3, (String) null, (tho) null, (nho) null, str, (Function0) null, 238), (qim0) null, (ipb1) null, x340Var, ((i3 >> 9) & 14) | 8, 12);
                x340Var.r(false);
            } else {
                x340Var.i0(-96060266);
                x340Var.r(false);
            }
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new hy0(str, str2, i, xhoVar, str3, qim0Var2, i2);
        }
    }

    public static final void b(String str, Integer num, Integer num2, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        qim0 qim0Var2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1259964423);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.g(num) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.g(num2) ? SemanticState.Hidden : SemanticState.Focused;
        }
        int i3 = i2 | 3072;
        if (b0kVar3.Y(i3 & 1, (i3 & 1171) != 1170)) {
            ye5 ye5VarO = kk0.o(354972746, b0kVar3);
            uwr uwrVar = cbx.a;
            long j = cbx.a(b0kVar3).b.a;
            long j2 = cbx.a(b0kVar3).b.b;
            int iO = ye5VarO.o(new zma1(j, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65534));
            try {
                ye5VarO.g(str);
                ye5VarO.k(iO);
                if (num == null || num2 == null || (num.intValue() <= 0 && num2.intValue() <= 0)) {
                    b0kVar3.i0(260208350);
                    b0kVar3.r(false);
                } else {
                    b0kVar3.i0(259403993);
                    NumberFormat numberInstance = NumberFormat.getNumberInstance(new Locale(upn1.m()));
                    int iO2 = ye5VarO.o(new zma1(j2, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65534));
                    try {
                        ye5VarO.g(" • ");
                        ye5VarO.k(iO2);
                        int iO3 = ye5VarO.o(new zma1(j2, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65534));
                        try {
                            String strU = cwl1.U(2131820913, num2.intValue(), new Object[]{numberInstance.format(num2)}, b0kVar3);
                            if (num.intValue() > 0) {
                                b0kVar3.i0(-1164385279);
                                ye5VarO.g(cwl1.U(2131820914, num.intValue(), new Object[]{numberInstance.format(num)}, b0kVar3) + " • " + strU);
                                b0kVar3.r(false);
                            } else {
                                b0kVar3.i0(-1164108077);
                                b0kVar3.r(false);
                                ye5VarO.g(strU);
                            }
                            ye5VarO.k(iO3);
                            b0kVar3.r(false);
                        } catch (Throwable th) {
                            ye5VarO.k(iO3);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        ye5VarO.k(iO2);
                        throw th2;
                    }
                }
                af5 af5VarP = ye5VarO.p();
                b0kVar3.r(false);
                qim0 qim0Var3 = nim0.a;
                b0kVar2 = b0kVar3;
                uwo1.f(af5VarP, u291.f(qim0Var3, 1.0f), cbx.d(b0kVar3).m, (x9h) null, new a0e1(3), (iu30) null, 2, false, new cjc0(2), 0, (qx8) null, (cqs0) null, b0kVar2, 0, 0, 3752);
                qim0Var2 = qim0Var3;
            } catch (Throwable th3) {
                ye5VarO.k(iO);
                throw th3;
            }
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new vqa(i, str, num, num2, qim0Var2, (byte) 24);
        }
    }

    public static final void c(String str, String str2, c380 c380Var, t0r0 t0r0Var, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-939104536);
        j06 j06Var = x340Var.a;
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.g(str2) ? 32 : 16) | (x340Var.g(c380Var) ? SemanticState.Hidden : SemanticState.Focused) | (x340Var.i(t0r0Var) ? SemanticState.Modal : SemanticState.ReadOnly) | 24576;
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            es41 es41VarC = l6o1.C(0, 0, 1, x340Var);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarD = u291.d(l6o1.H(qim0Var3, es41VarC, false, 14), 1.0f);
            WeakHashMap weakHashMap = osl1.x;
            qim0 qim0VarP = x0d.p(lhc.g(x340Var).g, 32, qim0VarD);
            era eraVar = een.Q0;
            f36 f36Var = h36.c;
            mbh mbhVarA = jbh.a(f36Var, eraVar, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarP);
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
            nko1.H(mbhVarA, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            op71.g(x340Var, u291.h(qim0Var3, 8.0f));
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = hxt0.Z;
                x340Var.s0(objT);
            }
            qim0 qim0VarB = s161.b(qim0Var3, true, (iu30) objT);
            mbh mbhVarA2 = jbh.a(f36Var, eraVar, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarB);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA2, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            lee1 lee1Var = cbx.d(x340Var).e;
            long j = cbx.a(x340Var).b.a;
            cvx cvxVar2 = cbx.b(x340Var).b;
            uwo1.e(str, uyn1.z(16.0f, 0.0f, 2, qim0Var3), lee1Var, j, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, i2 & 14, 0, 2016);
            cvx cvxVar3 = cbx.b(x340Var).b;
            lee1 lee1Var2 = kk0.p(qim0Var3, 8.0f, x340Var, x340Var).j;
            long j2 = cbx.a(x340Var).b.b;
            cvx cvxVar4 = cbx.b(x340Var).b;
            uwo1.e(str2, uyn1.z(16.0f, 0.0f, 2, qim0Var3), lee1Var2, j2, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, (i2 >> 3) & 14, 0, 2016);
            x340Var.r(true);
            cvx cvxVar5 = cbx.b(x340Var).b;
            op71.g(x340Var, u291.h(qim0Var3, 8.0f));
            x340Var.i0(-642547884);
            Iterator it = c380Var.iterator();
            while (it.hasNext()) {
                otw.c((maa) t0r0Var.invoke(), (o6u0) it.next(), (qim0) null, (ipb1) null, x340Var, 0, 12);
            }
            x340Var.r(false);
            uwr uwrVar2 = cbx.a;
            x0d.s(qim0Var3, cbx.b(x340Var).b.c, x340Var, true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new e9g0((byte) 22, i, str, str2, c380Var, t0r0Var, qim0Var2);
        }
    }

    public static final Object d(ArrayList arrayList) {
        return l1d.i(1, arrayList);
    }

    public static final Object e(ArrayList arrayList) {
        return arrayList.remove(arrayList.size() - 1);
    }

    public static final void f(ArrayList arrayList, z080 z080Var) {
        arrayList.add(z080Var);
    }

    public static final void g(Intent intent, boolean z, Map map, boolean z2, String str) {
        if (z) {
            if (z2 || u890.j(map.get("feature"), "wrapped") || u890.j(map.get("feature"), "partnerTestAccess")) {
                intent.putExtra(str, true);
            }
        }
    }

    public static final byte[] i(int i, String str) {
        int iC = l1d.C(i);
        if (iC != 3) {
            return iC != 4 ? new byte[0] : j(str).toByteArray();
        }
        dk11 dk11VarN = RejectedClientEventNonAuth.n();
        dk11VarN.n(str);
        dk11VarN.q("UNKNOWN_OWNER");
        return dk11VarN.build().toByteArray();
    }

    public static final h j(String str) {
        dk11 dk11VarN = RejectedClientEventNonAuth.n();
        dk11VarN.n(str);
        dk11VarN.q("PAYLOAD_SIZE_LIMIT_EXCEEDED");
        return dk11VarN.build();
    }

    public static final ArrayList k(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (nhc1.Y((String) entry.getKey(), "live.hosts", false)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Collection collectionValues = new TreeMap(linkedHashMap).values();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionValues) {
            String str = (String) obj;
            str.getClass();
            if (!ihc1.y0(str)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final Long l(PlayerState playerState) {
        j380 j380VarMetadata;
        String str = (String) playerState.contextMetadata().get("start_timestamp");
        if (str == null) {
            ContextTrack contextTrack = (ContextTrack) playerState.track().h();
            str = (contextTrack == null || (j380VarMetadata = contextTrack.metadata()) == null) ? null : (String) j380VarMetadata.get("start_timestamp");
        }
        if (str != null) {
            return Long.valueOf(Long.parseLong(str));
        }
        return null;
    }

    public static final boolean m(PlayerState playerState) {
        j380 j380VarMetadata;
        ContextTrack contextTrack = (ContextTrack) playerState.track().h();
        return ((contextTrack == null || (j380VarMetadata = contextTrack.metadata()) == null) ? null : (String) j380VarMetadata.get("live.deeplink_url")) != null;
    }

    public static final go80 n(klm klmVar, zbp0 zbp0Var, zbp0 zbp0Var2, sap0 sap0Var, zbp0 zbp0Var3, zbp0 zbp0Var4, zbp0 zbp0Var5) {
        return klmVar.a("PushNotificationManagerDaemon", new dy7(zbp0Var, zbp0Var2, sap0Var, zbp0Var3, zbp0Var4, zbp0Var5, (byte) 27));
    }

    public static final boolean o(int i) {
        return i == 4 || i == 5;
    }

    public static final boolean p(cmj1 cmj1Var) {
        return cmj1Var == cmj1.b || cmj1Var == cmj1.c;
    }

    public static hjj0 q(fc10 fc10Var, boolean z, boolean z2) {
        tw20 tw20Var;
        if (z) {
            tw20Var = z2 ? zl70.e : null;
        } else {
            tw20Var = zl70.d;
        }
        hjj0 hjj0VarA = new bm70((byte) 0).a(fc10Var, tw20Var, 0);
        if (hjj0VarA == null || hjj0VarA.a.length == 0) {
            return null;
        }
        return hjj0VarA;
    }

    public static t7y r(izr0 izr0Var) {
        izr0Var.S(1);
        int iH = izr0Var.H();
        long j = ((long) izr0Var.b) + ((long) iH);
        int i = iH / 18;
        long[] jArrCopyOf = new long[i];
        long[] jArrCopyOf2 = new long[i];
        for (int i2 = 0; i2 < i; i2++) {
            long jY = izr0Var.y();
            if (jY == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i2);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i2);
                break;
            }
            jArrCopyOf[i2] = jY;
            jArrCopyOf2[i2] = izr0Var.y();
            izr0Var.S(2);
        }
        izr0Var.S((int) (j - ((long) izr0Var.b)));
        return new t7y(jArrCopyOf, jArrCopyOf2, (byte) 26);
    }

    public static final Object s(k1r k1rVar) {
        if (k1rVar instanceof i1r) {
            return ((i1r) k1rVar).a;
        }
        bhn0.g(k1rVar, "BatchItemResultRequest must always produce Loaded, but got ");
        return null;
    }

    public static final void t(String str, Function0 function0) {
        if (str == null || ihc1.y0(str)) {
            hhg1.f(function0.invoke());
        }
    }

    public static final ay8 u(d0r d0rVar, o3r o3rVar, List list) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(o3rVar.a(it.next()));
        }
        hga hgaVar = new hga(arrayList);
        return yzo1.j((List) s(d0rVar.b(hgaVar)), new swn(d0rVar, hgaVar, (lnm) null, (byte) 1));
    }

    public static final void v(Intent intent, String str, String str2) {
        if (str == null || ihc1.y0(str)) {
            return;
        }
        Set set = s4b1.f;
        if (uic.g(str, blc0.ti)) {
            intent.putExtra(str2, str);
        }
    }

    public static final void w(Intent intent, Uri uri, t0c t0cVar) {
        (t0cVar instanceof cnt ? intent.setDataAndType(uri, "video/*") : intent.setDataAndType(uri, "image/*")).getClass();
    }

    public static final void x(Intent intent, boolean z, String str, String str2, z771 z771Var) {
        if (!z || u890.j(z771Var, tyo1.p(blc0.ug, new String[0])) || u890.j(z771Var, tyo1.p(blc0.sg, new String[0]))) {
            return;
        }
        Set set = s4b1.f;
        if (uic.g(str2, blc0.ti)) {
            intent.putExtra(str, str2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:122:0x0391  */
    /* JADX WARN: Code duplicated, block: B:151:0x0394 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x0211  */
    /* JADX WARN: Code duplicated, block: B:77:0x0223  */
    /* JADX WARN: Code duplicated, block: B:79:0x0229  */
    /* JADX WARN: Code duplicated, block: B:80:0x023d  */
    public static final ji0 y(Ad ad) {
        fgh0 fgh0Var;
        String str;
        String str2;
        Iterator it;
        String str3;
        String str4;
        awd s4d1Var;
        Survey survey;
        int i;
        gq70 gq70Var;
        gq70 gq70VarC;
        ymw0 ymw0Var;
        ymw0 zmw0Var;
        String strN = ad.n();
        String strM = l1d.m("spotify:ad:", ad.n());
        String str5 = (String) ad.getMetadataMap().get("advertiser");
        if (str5 == null) {
            str5 = "";
        }
        String str6 = (String) ad.getMetadataMap().get("title");
        if (str6 == null) {
            str6 = "";
        }
        String strO = ad.o();
        int i2 = u890.j((String) ad.getMetadataMap().get("audioAdType"), "reminder") ? 2 : 1;
        Map metadataMap = ad.getMetadataMap();
        h290 h290VarQ = ad.q();
        if (h290VarQ.isEmpty()) {
            h290 h290VarS = ad.s();
            h290 arrayList = new ArrayList();
            for (Object obj : h290VarS) {
                if (!u890.j(((AdMedia) obj).s(), "text/html")) {
                    arrayList.add(obj);
                }
            }
            h290VarQ = arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = ((Iterable) h290VarQ).iterator();
        while (it2.hasNext()) {
            gq70 gq70VarA = A((AdMedia) it2.next());
            if (gq70VarA != null) {
                arrayList2.add(gq70VarA);
            }
        }
        List videoList = ad.getVideoList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = videoList.iterator();
        while (it3.hasNext()) {
            a7j1 a7j1VarC = C((AdMedia) it3.next());
            if (a7j1VarC != null) {
                arrayList3.add(a7j1VarC);
            }
        }
        h290 h290VarS2 = ad.s();
        ArrayList<AdMedia> arrayList4 = new ArrayList();
        for (Object obj2 : h290VarS2) {
            if (u890.j(((AdMedia) obj2).s(), "text/html")) {
                arrayList4.add(obj2);
            }
        }
        ArrayList arrayList5 = new ArrayList(q7h.U(arrayList4, 10));
        for (AdMedia adMedia : arrayList4) {
            int iV = adMedia.v();
            int iQ = adMedia.q();
            String strT = adMedia.t();
            String str7 = strT.length() == 0 ? null : strT;
            String strS = adMedia.s();
            if (strS.length() == 0) {
                strS = null;
            }
            arrayList5.add(new zy60(iV, str7, iQ, strS));
            str5 = str5;
        }
        String str8 = str5;
        fgh0 fgh0Var2 = new fgh0(arrayList2, arrayList3, arrayList5);
        String str9 = (String) ad.getMetadataMap().get("lineitem_id");
        if (str9 == null) {
            str9 = "";
        }
        String str10 = (String) ad.getMetadataMap().get("creative_id");
        String str11 = str10 == null ? "" : str10;
        String strW = ad.w();
        boolean z = Boolean.parseBoolean((String) ad.getMetadataMap().get("skippable"));
        boolean zV = ad.v();
        Format formatZ = z(ad.t());
        boolean zU = ad.u();
        h290 h290VarP = ad.p();
        ArrayList arrayList6 = new ArrayList();
        Iterator it4 = h290VarP.iterator();
        while (it4.hasNext()) {
            Companion companion = (Companion) it4.next();
            if (companion.t()) {
                Carousel carouselP = companion.p();
                fgh0Var = fgh0Var2;
                String strN2 = carouselP.n();
                str = strN;
                List itemsList = carouselP.getItemsList();
                str2 = strM;
                it = it4;
                str3 = str6;
                ArrayList arrayList7 = new ArrayList(q7h.U(itemsList, 10));
                Iterator it5 = itemsList.iterator();
                while (it5.hasNext()) {
                    CarouselItem carouselItem = (CarouselItem) it5.next();
                    String strP = carouselItem.p();
                    String strS2 = carouselItem.s();
                    String strN3 = carouselItem.n();
                    if (carouselItem.u()) {
                        gq70VarC = A(carouselItem.o());
                    } else {
                        if (carouselItem.x()) {
                            gq70VarC = C(carouselItem.t());
                        } else {
                            gq70Var = null;
                        }
                        if (carouselItem.v()) {
                            zmw0Var = new ymw0(carouselItem.q().o());
                        } else {
                            if (carouselItem.w()) {
                                ItemSalePrice itemSalePriceR = carouselItem.r();
                                zmw0Var = new zmw0(itemSalePriceR.o(), itemSalePriceR.p());
                            } else {
                                it5 = it5;
                                ymw0Var = null;
                            }
                            arrayList7.add(new hzd(strP, strS2, strN3, gq70Var, ymw0Var));
                            it5 = it5;
                        }
                        ymw0Var = zmw0Var;
                        arrayList7.add(new hzd(strP, strS2, strN3, gq70Var, ymw0Var));
                        it5 = it5;
                    }
                    gq70Var = gq70VarC;
                    if (carouselItem.v()) {
                        zmw0Var = new ymw0(carouselItem.q().o());
                    } else {
                        if (carouselItem.w()) {
                            ItemSalePrice itemSalePriceR2 = carouselItem.r();
                            zmw0Var = new zmw0(itemSalePriceR2.o(), itemSalePriceR2.p());
                        } else {
                            it5 = it5;
                            ymw0Var = null;
                        }
                        arrayList7.add(new hzd(strP, strS2, strN3, gq70Var, ymw0Var));
                        it5 = it5;
                    }
                    ymw0Var = zmw0Var;
                    arrayList7.add(new hzd(strP, strS2, strN3, gq70Var, ymw0Var));
                    it5 = it5;
                }
                s4d1Var = new awd(strN2, arrayList7);
            } else {
                fgh0Var = fgh0Var2;
                str = strN;
                str2 = strM;
                it = it4;
                str3 = str6;
                if (companion.r()) {
                    CanvasImage canvasImageN = companion.n();
                    s4d1Var = new mjd(canvasImageN.q(), canvasImageN.p(), canvasImageN.o(), canvasImageN.getUrl());
                } else if (companion.s()) {
                    CanvasVideo canvasVideoO = companion.o();
                    str4 = strO;
                    s4d1Var = new mkd(canvasVideoO.r(), canvasVideoO.o(), canvasVideoO.p(), canvasVideoO.hasUrl() ? canvasVideoO.getUrl() : null, canvasVideoO.s() ? canvasVideoO.q() : null);
                } else if (companion.u()) {
                    Survey surveyQ = companion.q();
                    h290 h290VarO = surveyQ.o();
                    ArrayList arrayList8 = new ArrayList(q7h.U(h290VarO, 10));
                    Iterator it6 = h290VarO.iterator();
                    while (it6.hasNext()) {
                        SurveyQuestion surveyQuestion = (SurveyQuestion) it6.next();
                        surveyQuestion.getClass();
                        String id = surveyQuestion.getId();
                        int iOrdinal = surveyQuestion.q().ordinal();
                        if (iOrdinal != 0) {
                            survey = surveyQ;
                            i = iOrdinal != 1 ? iOrdinal != 2 ? 4 : 3 : 2;
                        } else {
                            survey = surveyQ;
                            i = 1;
                        }
                        String strN4 = surveyQuestion.n();
                        String strO2 = surveyQuestion.o();
                        h290 h290VarP2 = surveyQuestion.p();
                        Iterator it7 = it6;
                        ArrayList arrayList9 = new ArrayList(q7h.U(h290VarP2, 10));
                        Iterator it8 = h290VarP2.iterator();
                        while (it8.hasNext()) {
                            SurveyQuestionOption surveyQuestionOption = (SurveyQuestionOption) it8.next();
                            surveyQuestionOption.getClass();
                            arrayList9.add(new o7d1(surveyQuestionOption.getId(), surveyQuestionOption.o(), surveyQuestionOption.n()));
                            it8 = it8;
                            strO = strO;
                        }
                        arrayList8.add(new m7d1(i, id, strN4, strO2, arrayList9));
                        it6 = it7;
                        surveyQ = survey;
                    }
                    str4 = strO;
                    SurveyTransparencyContent surveyTransparencyContentP = surveyQ.p();
                    s4d1Var = new s4d1(arrayList8, new s7d1(surveyTransparencyContentP.o(), surveyTransparencyContentP.p()));
                } else {
                    str4 = strO;
                    s4d1Var = null;
                }
                if (s4d1Var != null) {
                    arrayList6.add(s4d1Var);
                }
                fgh0Var2 = fgh0Var;
                strN = str;
                strM = str2;
                it4 = it;
                str6 = str3;
                strO = str4;
            }
            str4 = strO;
            if (s4d1Var != null) {
                arrayList6.add(s4d1Var);
            }
            fgh0Var2 = fgh0Var;
            strN = str;
            strM = str2;
            it4 = it;
            str6 = str3;
            strO = str4;
        }
        return new ji0(strN, strM, str8, str6, strO, i2, metadataMap, fgh0Var2, str9, str11, strW, z, zV, formatZ, zU, arrayList6, ad.x(), (LinkedHashMap) null, 131072);
    }

    public static final Format z(cq0 cq0Var) {
        int iOrdinal = cq0Var.ordinal();
        if (iOrdinal == 0) {
            return Format.UNKNOWN;
        }
        if (iOrdinal == 1) {
            return Format.AUDIO;
        }
        if (iOrdinal == 2) {
            return Format.VIDEO;
        }
        if (iOrdinal == 3) {
            return Format.BANNER;
        }
        if (iOrdinal == 4) {
            return Format.DUMMY;
        }
        if (iOrdinal == 5) {
            return Format.UNRECOGNIZED;
        }
        eg.o();
        return null;
    }
}
