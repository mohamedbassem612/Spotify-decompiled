package p;

import android.content.res.Resources;
import android.os.Handler;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import com.spotify.connect.artisanal_cast.TlsSocketProvider;
import com.spotify.wear.wearabledatalayer.SpotifyWearableListenerService;
import io.reactivex.rxjava3.core.ObservableEmitter;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class sl21 implements Runnable {
    public final /* synthetic */ byte a;
    public Object b;
    public Object c;
    public Object d;

    public /* synthetic */ sl21(pgn1 pgn1Var, cdo1 cdo1Var, pgo1 pgo1Var) {
        this.a = (byte) 11;
        this.b = pgn1Var;
        this.d = cdo1Var;
        this.c = pgo1Var;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0069  */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        String str;
        ir51 ir51Var;
        int i;
        hfp1 hfp1VarH;
        String str2;
        o2e o2eVar;
        String str3;
        zbp1 zbp1Var;
        o2e o2eVar2;
        Object objCall = null;
        int i2 = 0;
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                tl21 tl21Var = (tl21) this.d;
                tl21Var.b((vy8) this.b, (bsd1) this.c);
                ((AtomicInteger) tl21Var.i.c).set(0);
                double dMin = Math.min(3600000.0d, Math.pow(tl21Var.b, tl21Var.a()) * (60000.0d / tl21Var.a));
                String.format(Locale.US, "%.2f", Double.valueOf(dMin / 1000.0d));
                Log.isLoggable("FirebaseCrashlytics", 3);
                try {
                    Thread.sleep((long) dMin);
                    return;
                } catch (InterruptedException unused) {
                    return;
                }
            case 1:
                try {
                    objCall = ((s930) this.b).call();
                    break;
                } catch (Exception unused2) {
                }
                ((Handler) this.d).post(new aih0((ae0) this.c, objCall, false, (byte) 20));
                return;
            case 2:
                zgz0 zgz0Var = ((s531) this.b).e;
                d631 d631Var = (d631) this.c;
                zgz0Var.i(d631Var.v, d631Var.p, d631Var.q, z4p1.G(d631Var.f.a()), d631Var.a, d631Var.x, d631Var.y, 2, (tv80) this.d);
                return;
            case 3:
                ohd ohdVar = (ohd) this.b;
                try {
                    jo31.t(ohdVar.e.C(wdu0.Y), new elu0((en31) this.c, ohdVar, (fuo) this.d, (lnm) null, (byte) 25));
                    return;
                } catch (Throwable th) {
                    ohdVar.q(th);
                    return;
                }
            case 4:
                vn41 vn41Var = (vn41) this.b;
                Object obj = vn41Var.b;
                un41 un41Var = (un41) this.c;
                Object obj2 = this.d;
                synchronized (obj) {
                    z = !un41Var.b && vn41Var.c == obj2;
                }
                if (z) {
                    ((un41) this.c).a.invoke();
                    return;
                }
                return;
            case 5:
                l811 l811Var = new l811();
                f301 f301Var = (f301) this.b;
                String str4 = f301Var.b;
                x981 x981Var = (x981) this.c;
                jjz jjzVar = (jjz) x981Var.b;
                xiz xizVar = new xiz(fjz.b, x981Var.c ? new yiz(str4) : yiz.c, ajz.d);
                ObservableEmitter observableEmitter = (ObservableEmitter) this.d;
                jjzVar.a(xizVar, new t981(l811Var, observableEmitter, f301Var, (byte) 0), new t981(l811Var, observableEmitter, f301Var, (byte) 1));
                return;
            case 6:
                m401 m401Var = (m401) this.c;
                l811 l811Var2 = new l811();
                x981 x981Var2 = (x981) this.b;
                jjz jjzVar2 = (jjz) x981Var2.b;
                xiz xizVar2 = new xiz(fjz.b, x981Var2.c ? new yiz(m401Var.b) : yiz.c, ajz.d);
                ObservableEmitter observableEmitter2 = (ObservableEmitter) this.d;
                jjzVar2.a(xizVar2, new u981(l811Var2, observableEmitter2, m401Var, (byte) 0), new u981(l811Var2, observableEmitter2, m401Var, (byte) 1));
                return;
            case 7:
                l101 l101Var = (l101) this.c;
                l811 l811Var3 = new l811();
                x981 x981Var3 = (x981) this.b;
                jjz jjzVar3 = (jjz) x981Var3.b;
                xiz xizVar3 = new xiz(fjz.b, x981Var3.c ? new yiz(l101Var.b) : yiz.c, ajz.d);
                ObservableEmitter observableEmitter3 = (ObservableEmitter) this.d;
                jjzVar3.a(xizVar3, new v981(l811Var3, observableEmitter3, l101Var, (byte) 0), new v981(l811Var3, observableEmitter3, l101Var, (byte) 1));
                return;
            case 8:
                pnh pnhVar = (pnh) this.c;
                l811 l811Var4 = new l811();
                x981 x981Var4 = (x981) this.b;
                jjz jjzVar4 = (jjz) x981Var4.b;
                xiz xizVar4 = new xiz(fjz.b, (!x981Var4.c || (str = pnhVar.b) == null) ? yiz.c : new yiz(str), ajz.d);
                ObservableEmitter observableEmitter4 = (ObservableEmitter) this.d;
                jjzVar4.a(xizVar4, new w981(l811Var4, observableEmitter4, pnhVar, (byte) 0), new w981(l811Var4, observableEmitter4, pnhVar, (byte) 1));
                return;
            case 9:
                g7b1 g7b1Var = (g7b1) this.b;
                k2r k2rVar = (k2r) ((ycc1) this.c).c;
                m0u0 m0u0Var = (hoh0) this.d;
                if ((k2rVar instanceof hr51) && (m0u0Var instanceof m0u0) && (ir51Var = g7b1Var.h) != null) {
                    m0u0 m0u0Var2 = m0u0Var;
                    gq51 gq51Var = (gq51) ir51Var.b.remove(m0u0Var2.d);
                    if (gq51Var != null) {
                        String str5 = m0u0Var2.a.a;
                        gq51Var.a();
                        return;
                    }
                    return;
                }
                return;
            case 10:
                TlsSocketProvider tlsSocketProvider = (TlsSocketProvider) this.d;
                SSLSocket sSLSocket = (SSLSocket) this.b;
                try {
                    sSLSocket.getOutputStream().write((byte[]) this.c);
                    sSLSocket.getOutputStream().flush();
                    return;
                } catch (IOException e) {
                    TlsSocketProvider.access$setWriteError$p(tlsSocketProvider, e);
                    TlsSocketProvider.access$closeSocket(tlsSocketProvider, sSLSocket);
                    return;
                }
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                pgn1 pgn1Var = (pgn1) this.b;
                cdo1 cdo1Var = (cdo1) this.d;
                pgo1 pgo1Var = (pgo1) this.c;
                SpotifyWearableListenerService spotifyWearableListenerServiceB1 = pgn1Var.b1("onRequestReceived");
                try {
                    if (spotifyWearableListenerServiceB1 == null) {
                        cdo1Var.g1(null, false);
                    } else {
                        String str6 = pgo1Var.d;
                        String str7 = pgo1Var.b;
                        String str8 = new String(pgo1Var.c, nne.a);
                        int[] iArrH = l1d.H(8);
                        int length = iArrH.length;
                        int i3 = 0;
                        while (true) {
                            if (i3 < length) {
                                i = iArrH[i3];
                                switch (i) {
                                    case 1:
                                        str2 = "/user_info_request";
                                        break;
                                    case 2:
                                        str2 = "/auto_login_request";
                                        break;
                                    case 3:
                                        str2 = "/play_uri_request";
                                        break;
                                    case 4:
                                        str2 = "/pull_playback_request";
                                        break;
                                    case 5:
                                        str2 = "/seek_to_request";
                                        break;
                                    case 6:
                                        str2 = "/add_to_queue_request";
                                        break;
                                    case 7:
                                        str2 = "/send_signal_request";
                                        break;
                                    case 8:
                                        str2 = "/curate_audiobook_request";
                                        break;
                                    default:
                                        throw null;
                                }
                                if (!str2.equals(str7)) {
                                    i3++;
                                }
                            } else {
                                i = 0;
                            }
                        }
                        switch (i == 0 ? -1 : i7b1.a[l1d.C(i)]) {
                            case SplitInstallErrorCode.ACTIVE_SESSIONS_LIMIT_EXCEEDED /* -1 */:
                                hfp1VarH = null;
                                break;
                            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                            default:
                                eg.o();
                                return;
                            case 1:
                                hfp1VarH = spotifyWearableListenerServiceB1.h(new d061(1, hv8.Companion, gv8.class, "createErrorResponse", "createErrorResponse(Ljava/lang/String;)Lcom/spotify/wear/datalayermessages/AutoLoginMessageResponse;", 0, (byte) 29), (l5b1) null, new j7b1(spotifyWearableListenerServiceB1, str8, (lnm) null, (byte) 1));
                                break;
                            case 2:
                                hfp1VarH = spotifyWearableListenerServiceB1.h(new k7b1(1, jdi1.Companion, idi1.class, "createErrorResponse", "createErrorResponse(Ljava/lang/String;)Lcom/spotify/wear/datalayermessages/UserInfoResponse;", 0, (byte) 1), (l5b1) null, new l7b1(spotifyWearableListenerServiceB1, (lnm) null, (byte) 0));
                                break;
                            case 3:
                                sst0 sst0Var = (sst0) spotifyWearableListenerServiceB1.f().a(str8, m5n1.z(sst0.Companion.serializer()));
                                hfp1VarH = spotifyWearableListenerServiceB1.i(new tgg(sst0Var, sst0Var != null ? sst0Var.i : null, spotifyWearableListenerServiceB1, (lnm) null, (byte) 4));
                                break;
                            case 4:
                                hfp1VarH = spotifyWearableListenerServiceB1.i(new l7b1(spotifyWearableListenerServiceB1, (lnm) null, (byte) 1));
                                break;
                            case 5:
                                hfp1VarH = spotifyWearableListenerServiceB1.h(new k7b1(1, kzq.Companion, jzq.class, "createErrorResponse", "createErrorResponse(Ljava/lang/String;)Lcom/spotify/wear/datalayermessages/DataLayerResponse;", 0, (byte) 3), (l5b1) null, new j7b1(spotifyWearableListenerServiceB1, str8, (lnm) null, (byte) 3));
                                break;
                            case 6:
                                hfp1VarH = spotifyWearableListenerServiceB1.h(new d061(1, kzq.Companion, jzq.class, "createErrorResponse", "createErrorResponse(Ljava/lang/String;)Lcom/spotify/wear/datalayermessages/DataLayerResponse;", 0, (byte) 28), (l5b1) null, new j7b1(spotifyWearableListenerServiceB1, str8, (lnm) null, (byte) 0));
                                break;
                            case 7:
                                hfp1VarH = spotifyWearableListenerServiceB1.h(new k7b1(1, kzq.Companion, jzq.class, "createErrorResponse", "createErrorResponse(Ljava/lang/String;)Lcom/spotify/wear/datalayermessages/DataLayerResponse;", 0, (byte) 4), (l5b1) null, new j7b1(spotifyWearableListenerServiceB1, str8, (lnm) null, (byte) 4));
                                break;
                            case 8:
                                hfp1VarH = spotifyWearableListenerServiceB1.h(new k7b1(1, kzq.Companion, jzq.class, "createErrorResponse", "createErrorResponse(Ljava/lang/String;)Lcom/spotify/wear/datalayermessages/DataLayerResponse;", 0, (byte) 0), (l5b1) null, new j7b1(spotifyWearableListenerServiceB1, str8, (lnm) null, (byte) 2));
                                break;
                        }
                        if (hfp1VarH != null) {
                            hfp1VarH.b(new lxh1(cdo1Var, (byte) 13));
                            return;
                        }
                        cdo1Var.g1(null, false);
                    }
                    return;
                } catch (RemoteException unused3) {
                    return;
                }
            case grn1.d /* 12 */:
                uqn1 uqn1Var = (uqn1) this.b;
                HashMap map = uqn1Var.l.D;
                String str9 = (String) this.c;
                synchronized (map) {
                    o2eVar = (o2e) map.get(str9);
                    break;
                }
                if (o2eVar != null) {
                    o2eVar.a(uqn1Var.l.B, (String) this.d);
                    return;
                } else {
                    arn1.H.a("Discarded message for unknown namespace '%s'", new Object[]{str9});
                    return;
                }
            case 13:
                axn1.f0((axn1) this.b, (vqv0) this.c, (do0) this.d);
                return;
            case 14:
                bwo1 bwo1Var = (bwo1) this.b;
                zxl1 zxl1Var = (zxl1) this.c;
                llo1 llo1Var = llo1.INPUT_IMAGE_CONSTRUCTION;
                String str10 = (String) this.d;
                fqn1 fqn1Var = (fqn1) zxl1Var.b;
                fqn1Var.c = llo1Var;
                xso1 xso1Var = (xso1) fqn1Var.b;
                if (xso1Var != null) {
                    str3 = xso1Var.d;
                    int i4 = y1o1.a;
                    if (str3 == null || str3.isEmpty()) {
                        str3 = "NA";
                    }
                } else {
                    str3 = "NA";
                }
                bz11 bz11Var = new bz11();
                bz11Var.a = bwo1Var.a;
                bz11Var.b = bwo1Var.b;
                synchronized (bwo1.class) {
                    try {
                        zbp1Var = bwo1.j;
                        if (zbp1Var == null) {
                            fhe0 fhe0VarA = yoi1.A(Resources.getSystem().getConfiguration());
                            Object[] objArrCopyOf = new Object[4];
                            int i5 = 0;
                            while (i2 < fhe0VarA.c()) {
                                Locale localeB = fhe0VarA.b(i2);
                                xot xotVar = dth.a;
                                String languageTag = localeB.toLanguageTag();
                                languageTag.getClass();
                                int i6 = i5 + 1;
                                int length2 = objArrCopyOf.length;
                                if (length2 < i6) {
                                    int i7 = length2 + (length2 >> 1) + 1;
                                    if (i7 < i6) {
                                        int iHighestOneBit = Integer.highestOneBit(i5);
                                        i7 = iHighestOneBit + iHighestOneBit;
                                    }
                                    if (i7 < 0) {
                                        i7 = Integer.MAX_VALUE;
                                    }
                                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, i7);
                                }
                                objArrCopyOf[i5] = languageTag;
                                i2++;
                                i5 = i6;
                            }
                            ixo1 ixo1Var = d1p1.b;
                            zbp1Var = i5 == 0 ? zbp1.e : new zbp1(i5, objArrCopyOf);
                            bwo1.j = zbp1Var;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                bz11Var.e = zbp1Var;
                bz11Var.h = Boolean.TRUE;
                bz11Var.d = str3;
                bz11Var.c = str10;
                bz11Var.f = bwo1Var.f.j() ? (String) bwo1Var.f.g() : bwo1Var.d.a();
                bz11Var.j = 10;
                bz11Var.k = Integer.valueOf(bwo1Var.h);
                zxl1Var.c = bz11Var;
                bwo1Var.c.a(zxl1Var);
                return;
            default:
                sgp1 sgp1Var = (sgp1) this.b;
                synchronized (sgp1Var.E) {
                    o2eVar2 = (o2e) sgp1Var.E.get((String) this.c);
                    break;
                }
                if (o2eVar2 != null) {
                    o2eVar2.a(((sgp1) this.b).C, (String) this.d);
                    return;
                } else {
                    sgp1.T.a("Discarded message for unknown namespace '%s'", new Object[]{(String) this.c});
                    return;
                }
        }
    }

    public /* synthetic */ sl21(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public /* synthetic */ sl21() {
        this.a = (byte) 1;
    }

    public /* synthetic */ sl21(bwo1 bwo1Var, zxl1 zxl1Var, String str) {
        this.a = (byte) 14;
        this.b = bwo1Var;
        this.c = zxl1Var;
        this.d = str;
    }

    public sl21(efp1 efp1Var, sgp1 sgp1Var, String str, String str2) {
        this.a = (byte) 15;
        this.b = sgp1Var;
        this.c = str;
        this.d = str2;
    }

    public sl21(tl21 tl21Var, vy8 vy8Var, bsd1 bsd1Var) {
        this.a = (byte) 0;
        this.d = tl21Var;
        this.b = vy8Var;
        this.c = bsd1Var;
    }
}
