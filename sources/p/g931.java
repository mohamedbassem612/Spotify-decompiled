package p;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Size;
import android.view.Surface;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.base.java.logging.Logger;
import com.spotify.legacyglue.widgetstate.StateListAnimatorButton;
import com.spotify.messages.StickerTapped;
import com.spotify.nowplaying.uiusecases.seekbar.SuppressLayoutTextView;
import com.spotify.playlistmixing.endpoints.MixingReorderingError;
import com.spotify.searchview.proto.AudioEpisode;
import com.spotify.voiceassistants.playermodels.CommandPlayResponse;
import com.spotify.voiceassistants.playermodels.VoiceAssistantLoggingContext;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class g931 implements o2r0, hj71, md41, Function, t751, r1v0 {
    public final /* synthetic */ byte a;
    public Object b;
    public final Object c;
    public Object d;

    public g931(ynb0 ynb0Var, o241 o241Var) {
        this.a = (byte) 6;
        this.b = ynb0Var;
        this.c = o241Var;
        z3n0 z3n0Var = (z3n0) ynb0Var.get();
        lig0 lig0Var = new lig0("https://spclient.wg.spotify.com/sneaktables/v2/hls/1/{audio_id}/master.m3u8", "https://spclient.wg.spotify.com/manifests/v9/{type}/sources/{source_id}/options/gzip+no_h264_high+supports_drm");
        e8c0 e8c0Var = new e8c0("https://spclient.wg.spotify.com/widevine-license/v1/audio/license", "https://spclient.wg.spotify.com/widevine-license/v1/video/license");
        jpb jpbVar = jpb.a;
        ym51 ym51Var = ym51.a;
        k89 k89Var = k89.a;
        kr50 kr50Var = kr50.a;
        qpt0 qpt0Var = qpt0.a;
        ttp0 ttp0Var = ttp0.a;
        qma qmaVar = new qma(lig0Var, e8c0Var, 0, true, true, false, false, true, 5000, 8000, false, 1000, 4000, false, false, jpbVar, jpbVar, false, false, ym51Var, false, 20000, 0, true, 1, 1500, 1500, 60000, 2500, false, 30000, false, false, false, false, k89Var, false, kr50Var, false, false, false, -1, 1, -1, -1, true, false, false, false, false, true, qpt0Var, false, ttp0Var, true, false, false, false, false, 2, 4, false, false, false, 5000, false, true, false, AudioEpisode.SHOW_URI_FIELD_NUMBER, true, false, false, false, false);
        boolean zI0 = z3n0Var.i0();
        boolean zM = z3n0Var.M();
        boolean zF0 = z3n0Var.f0();
        boolean zA = z3n0Var.a();
        boolean zB = z3n0Var.B();
        int iC = z3n0Var.C();
        int iD = z3n0Var.D();
        boolean zD0 = z3n0Var.d0();
        int iE0 = z3n0Var.e0();
        int iC0 = z3n0Var.c0();
        boolean zC = z3n0Var.c();
        boolean zN = z3n0Var.N();
        int iOrdinal = z3n0Var.j().ordinal();
        jpb jpbVar2 = jpb.b;
        jpb jpbVar3 = jpb.c;
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                jpbVar = jpbVar2;
            } else {
                if (iOrdinal != 2) {
                    eg.o();
                    throw null;
                }
                jpbVar = jpbVar3;
            }
        }
        int iOrdinal2 = z3n0Var.k().ordinal();
        if (iOrdinal2 == 0) {
            jpbVar3 = jpbVar;
        } else if (iOrdinal2 == 1) {
            jpbVar3 = jpbVar2;
        } else if (iOrdinal2 != 2) {
            eg.o();
            throw null;
        }
        boolean zX = z3n0Var.X();
        boolean Z = z3n0Var.Z();
        int iOrdinal3 = z3n0Var.Y().ordinal();
        if (iOrdinal3 != 0) {
            if (iOrdinal3 == 1) {
                ym51Var = ym51.b;
            } else {
                if (iOrdinal3 != 2) {
                    eg.o();
                    throw null;
                }
                ym51Var = ym51.c;
            }
        }
        boolean zR = z3n0Var.r();
        int iH0 = z3n0Var.h0();
        int iG = z3n0Var.g();
        boolean zL0 = z3n0Var.l0();
        int iM0 = z3n0Var.m0();
        int iG0 = z3n0Var.g0();
        int iT = z3n0Var.t();
        int iU = z3n0Var.u();
        int iE = z3n0Var.E();
        boolean zB0 = z3n0Var.b0();
        int iA0 = z3n0Var.a0();
        boolean zA2 = z3n0Var.A();
        boolean zT = z3n0Var.T();
        boolean zN0 = z3n0Var.n0();
        boolean zO0 = z3n0Var.o0();
        int iOrdinal4 = z3n0Var.d().ordinal();
        if (iOrdinal4 != 0) {
            if (iOrdinal4 == 1) {
                k89Var = k89.b;
            } else {
                if (iOrdinal4 != 2) {
                    eg.o();
                    throw null;
                }
                k89Var = k89.c;
            }
        }
        boolean zF = z3n0Var.f();
        int iOrdinal5 = z3n0Var.I().ordinal();
        if (iOrdinal5 != 0) {
            if (iOrdinal5 == 1) {
                kr50Var = kr50.b;
            } else {
                if (iOrdinal5 != 2) {
                    eg.o();
                    throw null;
                }
                kr50Var = kr50.c;
            }
        }
        this.d = qma.a(qmaVar, (lig0) null, (e8c0) null, 0, zI0, zM, zF0, zA, zB, iC, iD, zD0, iE0, iC0, zC, zN, jpbVar, jpbVar3, zX, Z, ym51Var, zR, iH0, iG, zL0, iM0, iG0, iE, iT, iU, zB0, iA0, zA2, zT, zN0, zO0, k89Var, zF, kr50Var, z3n0Var.K(), z3n0Var.s0(), z3n0Var.o(), z3n0Var.e(), z3n0Var.H(), z3n0Var.t0(), z3n0Var.J(), z3n0Var.m(), z3n0Var.x(), z3n0Var.F(), z3n0Var.V(), z3n0Var.n(), z3n0Var.w(), x(z3n0Var.P()), z3n0Var.O(), z3n0Var.R() ? ttp0.b : ttp0Var, z3n0Var.S(), z3n0Var.Q(), z3n0Var.U(), z3n0Var.p0(), z3n0Var.s(), z3n0Var.i(), z3n0Var.h(), z3n0Var.q0(), z3n0Var.G(), z3n0Var.q(), z3n0Var.W() * 1000, z3n0Var.k0(), z3n0Var.v(), z3n0Var.b(), z3n0Var.l(), z3n0Var.L(), z3n0Var.j0(), z3n0Var.z(), z3n0Var.y(), z3n0Var.r0(), 7, 0, 0);
    }

    public static mao j(yf51 yf51Var, int i, d8r0 d8r0Var, String str, String str2) {
        String str3 = yf51Var.a;
        ArrayList arrayList = yf51Var.c;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (obj instanceof ci40) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(q7h.U(arrayList2, 10));
        int i2 = 0;
        for (Object obj2 : arrayList2) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                p7h.T();
                throw null;
            }
            lby lbyVar = ((ci40) obj2).a;
            arrayList3.add(new iao(gxo1.i(lbyVar.e), i2, i, lbyVar.a, lbyVar.b, lbyVar.c, str, yf51Var.a, d8r0Var, h4o1.p(lbyVar)));
            i2 = i3;
        }
        return new mao(str3, i, d8r0Var, str, str2, yf51Var.d, arrayList3);
    }

    public static MediaCodec l(muq0 muq0Var) throws IOException {
        String str = muq0Var.b;
        MediaCodec mediaCodecCreateEncoderByType = MediaCodec.createEncoderByType(str);
        Size size = muq0Var.a;
        MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat(str, size.getWidth(), size.getHeight());
        mediaFormatCreateVideoFormat.setInteger("color-format", 2130708361);
        mediaFormatCreateVideoFormat.setInteger("bitrate", 8000000);
        mediaFormatCreateVideoFormat.setInteger("frame-rate", 30);
        mediaFormatCreateVideoFormat.setInteger("i-frame-interval", 10);
        mediaFormatCreateVideoFormat.setInteger("color-standard", 1);
        mediaFormatCreateVideoFormat.setInteger("color-range", 2);
        mediaFormatCreateVideoFormat.setInteger("color-transfer", 3);
        mediaCodecCreateEncoderByType.configure(mediaFormatCreateVideoFormat, (Surface) null, (MediaCrypto) null, 1);
        return mediaCodecCreateEncoderByType;
    }

    public static qpt0 x(v3n0 v3n0Var) {
        int iOrdinal = v3n0Var.ordinal();
        if (iOrdinal == 0) {
            return qpt0.a;
        }
        if (iOrdinal == 1) {
            return qpt0.b;
        }
        if (iOrdinal == 2) {
            return qpt0.c;
        }
        if (iOrdinal == 3) {
            return qpt0.d;
        }
        eg.o();
        return null;
    }

    public static mo21 y(k620 k620Var) {
        switch (k620Var.ordinal()) {
            case 0:
                return null;
            case 1:
                return mo21.c;
            case 2:
                return mo21.g;
            case 3:
                return mo21.b;
            case 4:
                return mo21.e;
            case 5:
                return mo21.h;
            case 6:
                return mo21.i;
            case 7:
                return mo21.t;
            default:
                eg.o();
                return null;
        }
    }

    @Override // p.t751
    public void a() {
        ((z72) this.c).k(false);
    }

    public Object apply(Object obj) {
        boolean zContains;
        byte b = this.a;
        Object obj2 = this.c;
        switch (b) {
            case 16:
                Throwable th = (Throwable) obj;
                Logger.e(th, "Couldn't play prepared response", new Object[0]);
                ((lv41) obj2).c.a((VoiceAssistantLoggingContext) this.d, th, ((CommandPlayResponse) this.b).getRequestId());
                return CompletableEmpty.a;
            default:
                e821 e821Var = (e821) this.b;
                sjj0 sjj0Var = (sjj0) e821Var.a;
                List listK0 = o7h.K0((List) obj, o7h.p1(((il51) obj2).a));
                List list = (List) this.d;
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : listK0) {
                    Set set = s4b1.f;
                    s4b1 s4b1VarX = uic.x((String) obj3);
                    v5b1 v5b1Var = s4b1VarX.d;
                    if (u890.j(v5b1Var != null ? v5b1Var.getType() : null, nyu0.e)) {
                        zContains = list.contains(gzy.g);
                    } else {
                        int iOrdinal = s4b1VarX.c.ordinal();
                        if (iOrdinal == 30) {
                            zContains = list.contains(gzy.c);
                        } else if (iOrdinal == 44) {
                            zContains = list.contains(gzy.d);
                        } else if (iOrdinal == 844) {
                            zContains = list.contains(gzy.e);
                        } else if (iOrdinal != 860) {
                            zContains = iOrdinal != 926 ? false : list.contains(gzy.b);
                        } else {
                            zContains = true;
                        }
                    }
                    if (zContains) {
                        arrayList.add(obj3);
                    }
                }
                return sjj0Var.a(arrayList).map(new yim0(e821Var, list)).map(u3x0.t);
        }
    }

    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v5 */
    public void b(String str, String str2, String str3, int i, String str4, iu30 iu30Var, qim0 qim0Var, Long l, b0k b0kVar, int i2) {
        int i3;
        b0k b0kVar2;
        qim0 qim0Var2;
        qim0 qim0Var3;
        vu30 vu30Var;
        ?? r9;
        Function0 function0;
        Function0 function1;
        mmr0 mmr0Var;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1920007605);
        j06 j06Var = ((x340) b0kVar3).a;
        if ((i2 & 6) == 0) {
            i3 = (b0kVar3.g(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= b0kVar3.g(str2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= b0kVar3.g(str3) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= b0kVar3.e(l1d.C(i)) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= b0kVar3.g(str4) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= b0kVar3.i(iu30Var) ? 131072 : 65536;
        }
        int i4 = i3 | 1572864;
        if ((12582912 & i2) == 0) {
            i4 |= b0kVar3.g(l) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i4 |= b0kVar3.i(this) ? 67108864 : 33554432;
        }
        if (b0kVar3.Y(i4 & 1, (38347923 & i4) != 38347922)) {
            qim0 qim0Var4 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var4, 1.0f);
            boolean z = (i4 & 458752) == 131072;
            Object objT = b0kVar3.T();
            if (z || objT == fkj0.X) {
                objT = new dv11(iu30Var, (byte) 28);
                b0kVar3.s0(objT);
            }
            qim0 qim0VarN = anm1.N("rich_content_item", bin.x(qim0VarF, false, (String) null, (pm31) null, (idn0) null, (Function0) objT, 15));
            jw31 jw31VarA = ew31.a(h36.a, een.N0, b0kVar3, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM = b0kVar3.m();
            qim0 qim0VarE = zr7.E(b0kVar3, qim0VarN);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            b0kVar3.m0();
            boolean z2 = ((x340) b0kVar3).S;
            Function0 function2 = hmb0.t1;
            if (z2) {
                b0kVar3.l(function2);
            } else {
                b0kVar3.v0();
            }
            vu30 vu30Var2 = y580.O0;
            nko1.H(jw31VarA, b0kVar3, vu30Var2);
            llj lljVar = y580.N0;
            nko1.H(xos0VarM, b0kVar3, lljVar);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar2 = y580.R0;
            nko1.H(numValueOf, b0kVar3, lljVar2);
            nko1.F(b0kVar3);
            llj lljVar3 = y580.Y;
            nko1.H(qim0VarE, b0kVar3, lljVar3);
            if (str3 == null || ihc1.y0(str3)) {
                qim0Var3 = qim0Var4;
                vu30Var = vu30Var2;
                r9 = 0;
                function0 = function2;
                b0kVar3.i0(1763859761);
                b0kVar3.r(false);
            } else {
                b0kVar3.i0(1763156309);
                int iC = l1d.C(i);
                if (iC == 0) {
                    mmr0Var = new mmr0(er31.a, u291.r(qim0Var4, 48.0f));
                } else if (iC == 1) {
                    mmr0Var = new mmr0(er31.b(4.0f), u291.r(qim0Var4, 48.0f));
                } else {
                    if (iC != 2) {
                        eg.o();
                        return;
                    }
                    mmr0Var = new mmr0(er31.b(4.0f), u291.h(u291.v(qim0Var4, 48.0f), 26.8f));
                }
                vu30Var = vu30Var2;
                qim0Var3 = qim0Var4;
                function0 = function2;
                r9 = 0;
                eso1.h(oi7.a(Uri.parse(str3), (gw70) null, (xb10) null, (yqi1) null, (jmr0) null, (jmr0) null, false, false, (j6m) null, (iu30) null, (iu30) null, (iu30) null, 0L, b0kVar3, 0, 0, 131070), isl.a, anm1.N("rich_content_image", i1p1.q((qim0) mmr0Var.b, (cr31) mmr0Var.a)), (p3v) null, (zvx) null, (ecx) null, mif1.V0, (tl3) null, (ColorFilter) null, b0kVar3, 48, 440);
                b0kVar3 = b0kVar3;
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(b0kVar3).b;
                ab80.p(qim0Var3, 12.0f, b0kVar3, false);
            }
            wnb0 wnb0Var = new wnb0(1.0f, true);
            mbh mbhVarA = jbh.a(h36.e, een.P0, b0kVar3, (int) r9);
            int iHashCode2 = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM2 = b0kVar3.m();
            qim0 qim0VarE2 = zr7.E(b0kVar3, wnb0Var);
            b0kVar3.m0();
            if (((x340) b0kVar3).S) {
                function1 = function0;
                b0kVar3.l(function1);
            } else {
                function1 = function0;
                b0kVar3.v0();
            }
            nko1.H(mbhVarA, b0kVar3, vu30Var);
            nko1.H(xos0VarM2, b0kVar3, lljVar);
            x0d.q(iHashCode2, b0kVar3, lljVar2, b0kVar3);
            nko1.H(qim0VarE2, b0kVar3, lljVar3);
            uwr uwrVar2 = cbx.a;
            b0k b0kVar4 = b0kVar3;
            Function0 function3 = function1;
            uwo1.e(str, anm1.N("rich_content_title", qim0Var3), cbx.d(b0kVar3).g, cbx.a(b0kVar3).b.a, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, b0kVar4, i4 & 14, 0, 1712);
            uwo1.e(str2, anm1.N("rich_content_subtitle", qim0Var3), cbx.d(b0kVar4).j, cbx.a(b0kVar4).b.b, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, b0kVar4, (i4 >> 3) & 14, 0, 1712);
            b0kVar2 = b0kVar4;
            Set set = s4b1.f;
            if (uic.x(str4).c != blc0.de || l == null) {
                b0kVar2.i0(387096135);
                b0kVar2.r((boolean) r9);
            } else {
                b0kVar2.i0(386828667);
                uwo1.e(cwl1.n0(2131958327, new Object[]{((htr) this.b).a(l.longValue())}, b0kVar2), (qim0) null, cbx.d(b0kVar2).j, cbx.a(b0kVar2).b.b, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, b0kVar2, 0, 0, 1714);
                b0kVar2.r((boolean) r9);
            }
            b0kVar2.r(true);
            cvx cvxVar2 = cbx.b(b0kVar2).b;
            op71.g(b0kVar2, u291.v(qim0Var3, 12.0f));
            qim0 qim0VarN2 = anm1.N("rich_content_curation_button", qim0Var3);
            gfh0 gfh0VarC = t1c.c(een.d, (boolean) r9);
            int iHashCode3 = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM3 = b0kVar2.m();
            qim0 qim0VarE3 = zr7.E(b0kVar2, qim0VarN2);
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(function3);
            } else {
                b0kVar2.v0();
            }
            nko1.H(gfh0VarC, b0kVar2, vu30Var);
            nko1.H(xos0VarM3, b0kVar2, lljVar);
            x0d.q(iHashCode3, b0kVar2, lljVar2, b0kVar2);
            nko1.H(qim0VarE3, b0kVar2, lljVar3);
            i1o1.e((vh1) this.c, new uho(str4, null, null, null, null, null, 254), (rzq) this.d, (qim0) null, (ipb1) null, bej.a, (xu30) null, 0, (xu30) null, b0kVar2, 196616, 236);
            b0kVar2.r(true);
            b0kVar2.r(true);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new vep0(this, str, str2, str3, i, str4, iu30Var, qim0Var2, l, i2);
        }
    }

    @Override // p.t751
    public void c(String str) {
        ((z72) this.c).l(str);
    }

    public void d(ff31 ff31Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        g931 g931Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1016020071);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(ff31Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            g931Var = this;
            i2 |= x340Var.i(g931Var) ? 256 : 128;
        } else {
            g931Var = this;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            String str = ff31Var.a;
            c380 c380Var = ff31Var.c;
            String strN0 = ff31Var.b;
            if (c380Var.isEmpty()) {
                x340Var.i0(55456260);
            } else {
                x340Var.i0(55497366);
                strN0 = cwl1.n0(2131958259, new Object[]{strN0, o7h.y0(ff31Var.c, ", ", (String) null, (String) null, (iu30) null, 62)}, x340Var);
            }
            x340Var.r(false);
            g931Var.b(str, strN0, ff31Var.d, ff31Var.e, ff31Var.h, iu30Var, null, Long.valueOf(ff31Var.f), x340Var, ((i2 << 12) & 458752) | ((i2 << 18) & 234881024));
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new j5w0(this, ff31Var, iu30Var, i, (byte) 29);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object e(buv buvVar, onm onmVar) {
        z841 z841Var;
        if (onmVar instanceof z841) {
            z841Var = (z841) onmVar;
            int i = z841Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                z841Var.c = i - Integer.MIN_VALUE;
            } else {
                z841Var = new z841(this, onmVar);
            }
        } else {
            z841Var = new z841(this, onmVar);
        }
        Object objU = z841Var.a;
        int i2 = z841Var.c;
        if (i2 == 0) {
            hm5.M(objU);
            List list = buvVar.a;
            z841Var.c = 1;
            objU = u(list, z841Var);
            Object obj = d9n.a;
            if (objU == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objU);
        }
        return new bvv(((Boolean) objU).booleanValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p.r1v0
    public yrg0 f(vi11 vi11Var) {
        Context context = (Context) vi11Var.f;
        StateListAnimatorButton stateListAnimatorButton = new StateListAnimatorButton(context, (AttributeSet) null, 2132018092);
        gal galVar = new gal(((lto) this.d).a, new npl0((String) this.c, (r6h1) vi11Var.e), (byte) 20);
        stateListAnimatorButton.setId(2131427825);
        stateListAnimatorButton.setText(context.getResources().getString(2131952985));
        Resources resources = context.getResources();
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        int dimensionPixelSize = resources.getDimensionPixelSize(2131166962);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(2131166963);
        marginLayoutParams.setMargins(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2);
        stateListAnimatorButton.setLayoutParams(marginLayoutParams);
        stateListAnimatorButton.setFilterTouchesWhenObscured(true);
        stateListAnimatorButton.setGravity(8388627);
        stateListAnimatorButton.setTextAlignment(5);
        int dimensionPixelSize3 = context.getResources().getDimensionPixelSize(2131166842);
        stateListAnimatorButton.setPadding(0, dimensionPixelSize3, 0, dimensionPixelSize3);
        stateListAnimatorButton.setTextAppearance(2132018003);
        stateListAnimatorButton.setTextColor(-1);
        Context context2 = stateListAnimatorButton.getContext();
        Drawable g4b1Var = new g4b1(context2, j4b1.O1, context2.getResources().getDimensionPixelSize(2131165627));
        g4b1Var.b(stateListAnimatorButton.getContext().getColor(2131101504));
        stateListAnimatorButton.setCompoundDrawablesRelativeWithIntrinsicBounds(null, null, g4b1Var, null);
        v9w0 v9w0VarQ = b2u.q(stateListAnimatorButton);
        Collections.addAll(v9w0VarQ.c, stateListAnimatorButton);
        v9w0VarQ.a();
        stateListAnimatorButton.setOnClickListener(new kw6(vi11Var, galVar, this, (byte) 19));
        return new yrg0(stateListAnimatorButton, (byte) 7);
    }

    public j4m g(nhr0 nhr0Var, Bundle bundle) {
        return new d931(nhr0Var, bundle, new v721((xu30) this.d, (q7r0) this.c, this, (byte) 12));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    public Object h(frv frvVar, onm onmVar) {
        la41 la41Var;
        bhk0 bhk0Var;
        Object objD;
        String str = (String) this.b;
        if (onmVar instanceof la41) {
            la41Var = (la41) onmVar;
            int i = la41Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                la41Var.e = i - Integer.MIN_VALUE;
            } else {
                la41Var = new la41(this, onmVar);
            }
        } else {
            la41Var = new la41(this, onmVar);
        }
        la41 la41Var2 = la41Var;
        Object obj = la41Var2.c;
        int i2 = la41Var2.e;
        if (i2 == 0) {
            hm5.M(obj);
            bhk0Var = frvVar.d;
            List list = frvVar.a;
            zhk0 zhk0Var = (vhk0) this.c;
            String str2 = bhk0Var.a;
            List list2 = bhk0Var.c;
            List list3 = bhk0Var.b;
            List list4 = bhk0Var.d;
            ArrayList arrayListS = x2p1.s(frvVar.b, list);
            ArrayList arrayListS2 = x2p1.s(frvVar.c, list);
            la41Var2.a = frvVar;
            la41Var2.b = bhk0Var;
            la41Var2.e = 1;
            objD = zhk0Var.d(str2, str, list3, list4, list2, arrayListS, arrayListS2, la41Var2);
            d9n d9nVar = d9n.a;
            if (objD == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            bhk0 bhk0Var2 = la41Var2.b;
            frv frvVar2 = la41Var2.a;
            hm5.M(obj);
            Object obj2 = ((e331) obj).a;
            bhk0Var = bhk0Var2;
            frvVar = frvVar2;
            objD = obj2;
        }
        MixingReorderingError mixingReorderingErrorA = e331.a(objD);
        if (mixingReorderingErrorA != null) {
            return ((mixingReorderingErrorA instanceof MixingReorderingError.RevisionConflict) || (mixingReorderingErrorA instanceof MixingReorderingError.TrackLimitExceeded)) ? new gsv(mixingReorderingErrorA, 2) : new bsv(Collections.singletonList(bhk0Var));
        }
        ((thk0) this.d).b(str);
        return new osv(frvVar.e);
    }

    public String i(int i) {
        int iMax = (int) (((long) Math.max(0, i)) / 1000);
        Integer num = (Integer) ((nmr0) this.d).a;
        if (num == null || num.intValue() != iMax) {
            long j = iMax;
            int i2 = (int) (j / 3600);
            int i3 = ((int) (j / 60)) % 60;
            int i4 = iMax % 60;
            this.d = i2 == 0 ? new nmr0(Integer.valueOf(iMax), String.format(Locale.US, "%d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i3), Integer.valueOf(i4)}, 2))) : new nmr0(Integer.valueOf(iMax), String.format(Locale.US, "%d:%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, 3)));
        }
        return (String) ((nmr0) this.d).b;
    }

    public n2r k() {
        return (uxy0) this.b;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:28:0x010a  */
    /* JADX WARN: Code duplicated, block: B:30:0x010d  */
    /* JADX WARN: Code duplicated, block: B:59:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:62:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:64:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x01b4 -> B:60:0x01b6). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public java.lang.Object m(android.media.MediaCodec r24, android.media.MediaMuxer r25, p.muq0 r26, p.gpc r27, p.onm r28) {
        /*
            Method dump skipped, instruction units count: 449
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.g931.m(android.media.MediaCodec, android.media.MediaMuxer, p.muq0, p.gpc, p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:61:0x0128  */
    /* JADX WARN: Code duplicated, block: B:64:0x013d A[LOOP:0: B:62:0x0137->B:64:0x013d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object n(k371 k371Var, lnm lnmVar) {
        o041 o041Var;
        wa71 wa71Var;
        Object obj;
        List list;
        boolean zC;
        List list2;
        wa71 wa71Var2;
        ArrayList arrayList;
        if (lnmVar instanceof o041) {
            o041Var = (o041) lnmVar;
            int i = o041Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                o041Var.e = i - Integer.MIN_VALUE;
            } else {
                o041Var = new o041(this, (onm) lnmVar);
            }
        } else {
            o041Var = new o041(this, (onm) lnmVar);
        }
        Object obj2 = o041Var.c;
        int i2 = o041Var.e;
        d9n d9nVar = d9n.a;
        if (i2 != 0) {
            if (i2 == 1) {
                list = o041Var.b;
                wa71 wa71Var3 = o041Var.a;
                hm5.M(obj2);
                obj = obj2;
                wa71Var = wa71Var3;
            } else {
                if (i2 != 2) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                list2 = o041Var.b;
                wa71Var2 = o041Var.a;
                hm5.M(obj2);
            }
            if (((Number) obj2).intValue() >= 5) {
                List<jz31> list3 = list2;
                arrayList = new ArrayList(q7h.U(list3, 10));
                for (jz31 jz31Var : list3) {
                    arrayList.add(new u771(new t771(wa71Var2, tyo1.p(blc0.Ag, new String[]{jz31Var.a})), new pz61(new y171(rc11.a.b(sz31.class)), new m041(jz31Var), dz61.d, false)));
                }
                return new qj71(syo1.D(wa71Var2.a, arrayList), 0, puk.d);
            }
            return null;
        }
        hm5.M(obj2);
        wa71Var = k371Var.a;
        if (wa71Var != null) {
            ArrayList arrayList2 = new ArrayList();
            d7 d7Var = new d7(jz31.c, (byte) 0);
            while (d7Var.hasNext()) {
                Object next = d7Var.next();
                fj4 fj4Var = ((fn20) this.b).a;
                int iOrdinal = ((jz31) next).ordinal();
                if (iOrdinal == 0) {
                    zC = fj4Var.c();
                } else {
                    if (iOrdinal != 1) {
                        eg.o();
                        return null;
                    }
                    zC = fj4Var.d();
                }
                if (zC) {
                    arrayList2.add(next);
                }
            }
            if (!arrayList2.isEmpty()) {
                Bundle bundle = k371Var.b;
                Set<String> setKeySet = bundle.keySet();
                int iS = zno1.s(q7h.U(setKeySet, 10));
                if (iS < 16) {
                    iS = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
                for (Object obj3 : setKeySet) {
                    String string = bundle.getString((String) obj3);
                    if (string == null) {
                        string = "";
                    }
                    linkedHashMap.put(obj3, string);
                }
                g931 g931Var = (g931) this.c;
                String str = wa71Var.a;
                o041Var.a = wa71Var;
                o041Var.b = arrayList2;
                o041Var.e = 1;
                Object objY = ((xyl1) g931Var.b).a(linkedHashMap) ? fn31.Y((q8n) g931Var.d, new d821(g931Var, str, (lnm) null, (byte) 22), o041Var) : Boolean.FALSE;
                if (objY != d9nVar) {
                    obj = objY;
                    list = arrayList2;
                }
                return d9nVar;
            }
        }
        return null;
        if (((Boolean) obj).booleanValue()) {
            s041 s041Var = (s041) this.d;
            String str2 = wa71Var.a;
            o041Var.a = wa71Var;
            o041Var.b = list;
            o041Var.e = 2;
            Object objA = s041Var.a(str2, o041Var);
            if (objA != d9nVar) {
                wa71 wa71Var4 = wa71Var;
                obj2 = objA;
                list2 = list;
                wa71Var2 = wa71Var4;
                if (((Number) obj2).intValue() >= 5) {
                    List<jz31> list4 = list2;
                    arrayList = new ArrayList(q7h.U(list4, 10));
                    while (r13.hasNext()) {
                        arrayList.add(new u771(new t771(wa71Var2, tyo1.p(blc0.Ag, new String[]{jz31Var.a})), new pz61(new y171(rc11.a.b(sz31.class)), new m041(jz31Var), dz61.d, false)));
                    }
                    return new qj71(syo1.D(wa71Var2.a, arrayList), 0, puk.d);
                }
            }
            return d9nVar;
        }
        return null;
    }

    public void o(int i) {
        if (((AtomicBoolean) this.b).compareAndSet(false, true)) {
            ((hc51) this.c).e(new ug50((Long) this.d, i, (byte) 27));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object p(onm onmVar) {
        bw51 bw51Var;
        Set set;
        if (onmVar instanceof bw51) {
            bw51Var = (bw51) onmVar;
            int i = bw51Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                bw51Var.d = i - Integer.MIN_VALUE;
            } else {
                bw51Var = new bw51(this, onmVar);
            }
        } else {
            bw51Var = new bw51(this, onmVar);
        }
        Object obj = bw51Var.b;
        int i2 = bw51Var.d;
        if (i2 == 0) {
            hm5.M(obj);
            Set setT = t();
            any anyVarC = ((koc0) this.c).c();
            bw51Var.a = setT;
            bw51Var.d = 1;
            Object objI = b5p1.i(anyVarC, bw51Var);
            d9n d9nVar = d9n.a;
            if (objI == d9nVar) {
                return d9nVar;
            }
            obj = objI;
            set = setT;
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            set = bw51Var.a;
            hm5.M(obj);
        }
        List list = ((m7e0) obj).b;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (set.contains(((l7e0) obj2).a())) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((l7e0) it.next()).a());
        }
        return new aw51(o7h.N0(dm61.v0(set, o7h.p1(arrayList2)), arrayList2), arrayList);
    }

    public Single q() {
        return rqt0.F((q8n) this.d, new ic01(this, (lnm) null, (byte) 18));
    }

    public void r(String str, String str2, String str3) {
        k1r k1rVarB = ((d0r) this.b).b(((o3r) this.d).a(rih1.a));
        k1rVarB.getClass();
        if (!(k1rVarB instanceof i1r)) {
            k1rVarB = null;
        }
        String str4 = k1rVarB != null ? (String) u890.k(k1rVarB, (d0r) null, (n4r) null) : null;
        if (str4 == null) {
            str4 = "";
        }
        dxb1 dxb1VarN = StickerTapped.n();
        dxb1VarN.r(str);
        dxb1VarN.s(str2);
        dxb1VarN.n(str3);
        dxb1VarN.q(str4);
        ((t2j0) this.c).a(dxb1VarN.build());
    }

    public List s(yf51 yf51Var, String str, int i, d8r0 d8r0Var, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4) {
        Object vulVar;
        Object tulVar;
        mev mevVar = (mev) this.c;
        pbq pbqVar = (pbq) this.b;
        int i2 = yf51Var.e;
        ArrayList arrayList = yf51Var.c;
        int i3 = 0;
        switch (l1d.C(yf51Var.b)) {
            case 0:
                ArrayList<qfj1> arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    if (obj instanceof qfj1) {
                        arrayList2.add(obj);
                    }
                }
                if (!arrayList2.isEmpty()) {
                    String str4 = yf51Var.a;
                    ArrayList arrayList3 = new ArrayList(q7h.U(arrayList2, 10));
                    for (qfj1 qfj1Var : arrayList2) {
                        String str5 = qfj1Var.a;
                        String str6 = qfj1Var.b;
                        boolean z5 = qfj1Var.h;
                        arrayList3.add(new ltj1(str5, str6, z5, qfj1Var.d, qfj1Var.e, qfj1Var.c, qfj1Var.f, qfj1Var.g, qfj1Var.t, qfj1Var.i ? 1 : z5 ? 2 : 3));
                    }
                    return Collections.singletonList(new awl(new pfj1(str4, str, new atj1("", arrayList3), str2, d8r0Var, i, o7h.l1(p7h.K(arrayList3)))));
                }
                break;
            case 1:
                String str7 = yf51Var.a;
                ArrayList arrayList4 = new ArrayList();
                for (Object obj2 : arrayList) {
                    if (obj2 instanceof ci40) {
                        arrayList4.add(obj2);
                    }
                }
                ArrayList arrayList5 = new ArrayList(q7h.U(arrayList4, 10));
                int i4 = 0;
                for (Object obj3 : arrayList4) {
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        p7h.T();
                        throw null;
                    }
                    lby lbyVar = ((ci40) obj3).a;
                    arrayList5.add(new qw01(gxo1.i(lbyVar.e), i4, i, lbyVar.a, lbyVar.b, lbyVar.c, str2, yf51Var.a, d8r0Var, h4o1.p(lbyVar)));
                    i4 = i5;
                }
                return Collections.singletonList(new pul(new tw01(i, str7, str2, str, arrayList5, d8r0Var)));
            case 2:
            case 11:
                break;
            case 3:
                int iC = l1d.C(i2);
                if (iC == 0) {
                    vulVar = new vul(new dbo(yf51Var.a, i, d8r0Var, str2, str, yf51Var.d, pbqVar.V(yf51Var, i, d8r0Var, str2, z, z2, z3, z4)));
                } else if (iC != 1) {
                    if (iC != 2) {
                        eg.o();
                        return null;
                    }
                    vulVar = new vul(new dbo(yf51Var.a, i, d8r0Var, str2, str, yf51Var.d, pbqVar.V(yf51Var, i, d8r0Var, str2, z, z2, z3, z4)));
                } else {
                    vulVar = new uul(j(yf51Var, i, d8r0Var, str2, str));
                }
                return Collections.singletonList(vulVar);
            case 4:
                ci51 ci51Var = (ci51) o7h.s0(arrayList);
                if (ci51Var != null) {
                    if (ci51Var instanceof ci40) {
                        return Collections.singletonList(mevVar.i(yf51Var, ((ci40) ci51Var).a, i, d8r0Var, str2, str3, (String) null, (String) null));
                    }
                    if (ci51Var instanceof qo80) {
                        qo80 qo80Var = (qo80) ci51Var;
                        return Collections.singletonList(mevVar.i(yf51Var, qo80Var.a, i, d8r0Var, str2, str3, qo80Var.b, qo80Var.c));
                    }
                    if (!(ci51Var instanceof e2n) && !(ci51Var instanceof qm11) && !(ci51Var instanceof qfj1)) {
                        eg.o();
                        return null;
                    }
                }
                break;
            case 5:
                return Collections.singletonList(new tvl(new w331(str)));
            case 6:
                ArrayList arrayList6 = new ArrayList();
                for (Object obj4 : arrayList) {
                    if (obj4 instanceof qm11) {
                        arrayList6.add(obj4);
                    }
                }
                if (!arrayList6.isEmpty()) {
                    ArrayList arrayList7 = new ArrayList(q7h.U(arrayList6, 10));
                    Iterator it = arrayList6.iterator();
                    while (true) {
                        int i6 = i3;
                        if (!it.hasNext()) {
                            return Collections.singletonList(new svl(new tm11(str, arrayList7)));
                        }
                        Object next = it.next();
                        i3 = i6 + 1;
                        if (i6 < 0) {
                            p7h.T();
                            throw null;
                        }
                        qm11 qm11Var = (qm11) next;
                        arrayList7.add(new sm11(qm11Var.b, i6, qm11Var.a, d8r0Var, str2, i, yf51Var.a));
                    }
                }
                break;
            case 7:
                ArrayList arrayList8 = new ArrayList();
                for (Object obj5 : arrayList) {
                    if (obj5 instanceof e2n) {
                        arrayList8.add(obj5);
                    }
                }
                if (!arrayList8.isEmpty()) {
                    String str8 = yf51Var.a;
                    ArrayList arrayList9 = new ArrayList(q7h.U(arrayList8, 10));
                    Iterator it2 = arrayList8.iterator();
                    while (true) {
                        int i7 = i3;
                        if (!it2.hasNext()) {
                            return Collections.singletonList(new sul(new i2n(i, str, str2, str8, arrayList9, d8r0Var)));
                        }
                        Object next2 = it2.next();
                        i3 = i7 + 1;
                        if (i7 < 0) {
                            p7h.T();
                            throw null;
                        }
                        e2n e2nVar = (e2n) next2;
                        arrayList9.add(new g2n(i7, e2nVar.a, d8r0Var, str2, e2nVar.c, e2nVar.b));
                    }
                }
                break;
            case 8:
                String str9 = yf51Var.d;
                String str10 = yf51Var.a;
                c380 c380VarA = mqo1.A(pbqVar.V(yf51Var, i, d8r0Var, str2, z, z2, z3, z4));
                String str11 = yf51Var.f;
                List list = yf51Var.g;
                return Collections.singletonList(new wul(new sbo(str10, i, d8r0Var, str2, str, str9, c380VarA, str11, list.isEmpty() ? null : list, yf51Var.h, new qbo(str3, null, z, z2, z3, z4), 128)));
            case 9:
                int iC2 = l1d.C(i2);
                if (iC2 == 0) {
                    tulVar = new tul(new dbo(yf51Var.a, i, d8r0Var, str2, str, yf51Var.d, pbqVar.V(yf51Var, i, d8r0Var, str2, z, z2, z3, z4)));
                } else if (iC2 != 1) {
                    if (iC2 != 2) {
                        eg.o();
                        return null;
                    }
                    tulVar = new tul(new dbo(yf51Var.a, i, d8r0Var, str2, str, yf51Var.d, pbqVar.V(yf51Var, i, d8r0Var, str2, z, z2, z3, z4)));
                } else {
                    tulVar = new uul(j(yf51Var, i, d8r0Var, str2, str));
                }
                return Collections.singletonList(tulVar);
            case 10:
                f2g1 f2g1Var = (f2g1) this.d;
                ArrayList arrayList10 = new ArrayList();
                for (Object obj6 : arrayList) {
                    if (obj6 instanceof ci40) {
                        arrayList10.add(obj6);
                    }
                }
                ArrayList arrayList11 = new ArrayList();
                for (Object obj7 : arrayList10) {
                    if (((ci40) obj7).a.e instanceof jjf1) {
                        arrayList11.add(obj7);
                    }
                }
                ArrayList arrayList12 = new ArrayList(q7h.U(arrayList11, 10));
                int i8 = 0;
                for (Object obj8 : arrayList11) {
                    int i9 = i8 + 1;
                    if (i8 < 0) {
                        p7h.T();
                        throw null;
                    }
                    lby lbyVar2 = ((ci40) obj8).a;
                    arrayList12.add(((ezb1) f2g1Var.b).h(lbyVar2, (jjf1) lbyVar2.e, z, z2, d8r0Var, str2, i8, Integer.valueOf(i), yf51Var.a, z3, z4));
                    i8 = i9;
                }
                if (!arrayList12.isEmpty()) {
                    return Collections.singletonList(new yvl(new d2g1(str, yf51Var.a, i, d8r0Var, str2, mqo1.A(arrayList12))));
                }
                break;
            default:
                eg.o();
                return null;
        }
        return z6x.a;
    }

    public Set t() {
        i1r i1rVarN = x2p1.n((d0r) this.b, (o3r) this.d, rih1.a);
        i1r i1rVar = i1rVarN instanceof i1r ? i1rVarN : null;
        Set set = i1rVar != null ? (Set) i1rVar.a : null;
        return set == null ? w7x.a : set;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x009d  */
    /* JADX WARN: Code duplicated, block: B:26:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:29:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:32:0x00da  */
    /* JADX WARN: Code duplicated, block: B:33:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:35:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x0164 -> B:60:0x0165). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public java.lang.Object u(java.util.List r17, p.onm r18) {
        /*
            Method dump skipped, instruction units count: 432
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.g931.u(java.util.List, p.onm):java.lang.Object");
    }

    public void unregister() {
        nen0 nen0Var = (nen0) this.b;
        String str = (String) this.c;
        List list = (List) nen0Var.k(str);
        if (list != null) {
            list.remove((Function0) this.d);
        }
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        nen0Var.m(str, list);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0149, code lost:
    
        if (r1 == r7) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object v(java.lang.String r21, p.k620 r22, p.onm r23) {
        /*
            Method dump skipped, instruction units count: 432
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.g931.v(java.lang.String, p.k620, p.onm):java.lang.Object");
    }

    public Single w(int i, String str, String str2) {
        return ((qm3) this.b).a("allboarding".concat(str), str2, ((edr0) this.d).b(of61.b).toString(), String.valueOf(((yqg) this.c).b()), Integer.valueOf(i)).map(b4x0.i).onErrorReturn(c4x0.t);
    }

    public /* synthetic */ g931(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj4;
    }

    public g931(SuppressLayoutTextView suppressLayoutTextView, SuppressLayoutTextView suppressLayoutTextView2) {
        this.a = (byte) 27;
        this.b = suppressLayoutTextView;
        this.c = suppressLayoutTextView2;
        this.d = new nmr0(0, "0:00");
    }

    public g931(otf otfVar, llm llmVar) {
        this.a = (byte) 15;
        this.b = otfVar;
        this.c = llmVar;
    }

    public g931(lmp lmpVar, y451 y451Var, sco0 sco0Var) {
        this.a = (byte) 19;
        this.b = lmpVar;
        this.c = y451Var;
    }

    public g931(aop aopVar, bop bopVar, di4 di4Var, wao0 wao0Var, nt21 nt21Var, String str, boolean z) {
        wmy wmyVar;
        this.a = (byte) 24;
        this.b = (ConstraintLayout) nt21Var.c;
        boolean zC = di4Var.C();
        this.c = bopVar.a(str, z, wao0Var);
        if (zC) {
            wmyVar = null;
        } else {
            kop kopVar = (kop) aopVar.a.c;
            Activity activityS = kopVar.a.s();
            c8o.l(activityS);
            hop hopVar = (hop) kopVar.W0.get();
            vnp vnpVar = (vnp) kopVar.X0.get();
            wnp wnpVar = (wnp) kopVar.Y0.get();
            xnp xnpVar = (xnp) kopVar.Z0.get();
            ynp ynpVar = (ynp) kopVar.b1.get();
            hc51 hc51VarA0 = kopVar.a.a0();
            c8o.l(hc51VarA0);
            wmyVar = new wmy(activityS, hopVar, vnpVar, wnpVar, xnpVar, ynpVar, hc51VarA0, wao0Var);
        }
        this.d = wmyVar;
        if (wmyVar != null) {
            ((RelativeLayout) nt21Var.b).addView((w751) wmyVar.a, new RelativeLayout.LayoutParams(-1, -1));
        }
    }

    public g931(d0r d0rVar, t2j0 t2j0Var) {
        this.a = (byte) 29;
        this.b = d0rVar;
        this.c = t2j0Var;
        this.d = w3p1.o(new l4r(hvm.d, 1, hz51.R0, new j4r(hz51.P0), hz51.S0), hz51.Q0);
    }

    public g931(q7r0 q7r0Var, Bundle bundle, vu30 vu30Var, xu30 xu30Var) {
        this.a = (byte) 0;
        this.c = q7r0Var;
        this.d = xu30Var;
        this.b = new uxy0(q7r0Var.d.d, new nt01(vu30Var, q7r0Var, (byte) 28), bundle);
    }

    public g931(d0r d0rVar, koc0 koc0Var) {
        this.a = (byte) 28;
        this.b = d0rVar;
        this.c = koc0Var;
        this.d = w3p1.o(new l4r(pwc0.D, 2, wu51.X0, new j4r(wu51.Z0), wu51.Y0), wu51.a1);
    }

    public /* synthetic */ g931(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public g931(xyl1 xyl1Var, Context context, gn20 gn20Var, Flowable flowable, q8n q8nVar) {
        this.a = (byte) 4;
        vbm[] vbmVarArr = q601.a;
        dai1 dai1Var = new dai1(context, gn20Var, new kge(flowable));
        this.b = xyl1Var;
        this.c = dai1Var;
        this.d = q8nVar;
    }

    public g931() {
        this.a = (byte) 14;
        this.b = w7x.a;
        this.c = new LinkedHashSet();
    }
}
