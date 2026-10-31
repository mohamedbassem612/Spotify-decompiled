package p;

import android.view.ViewGroup;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.core.http.HttpConnection;
import com.spotify.mobius.EventSource;
import com.spotify.mobius.MergedEventSource;
import com.spotify.mobius.coroutines.FlowEventSources;
import com.spotify.mobius.coroutines.b;
import com.spotify.nowplaying.scroll.ScrollCardType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Set;
import org.chromium.net.RequestFinishedInfo;
import org.chromium.net.UrlResponseInfo;
import spotify.connectivity.http.proto.ConnectionMetrics;
import spotify.connectivity.http.proto.TransactionMetrics;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class fnn extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fnn(Object obj, byte b) {
        super(1);
        this.a = b;
        this.b = obj;
    }

    public final Object invoke(Object obj) {
        lnm lnmVar;
        jge m441Var;
        fia fiaVar;
        Date requestEnd;
        Date responseStart;
        Date sendingEnd;
        Date sendingStart;
        Date connectEnd;
        Date connectStart;
        Long receivedByteCount;
        Long sentByteCount;
        lao laoVar;
        byte b = 25;
        byte b2 = 7;
        long jLongValue = 0;
        lnm lnmVar2 = null;
        switch (this.a) {
            case 0:
                elb0 elb0Var = (elb0) obj;
                long jP = elb0Var.p(0L);
                ((gnn) this.b).b.m((Object) null, new xln((((int) (elb0Var.b() >> 32)) / 2) + ((int) Float.intBitsToFloat((int) (jP >> 32))), (int) Float.intBitsToFloat((int) (jP & 4294967295L))));
                return rih1.a;
            case 1:
                cas casVar = (a7m0) obj;
                casVar.a(eln.i, eln.t);
                kun kunVar = (kun) this.b;
                casVar.a = new sqk(kunVar, (byte) 10);
                casVar.d = new j3m(kunVar, b);
                casVar.e = lmm.R0;
                c0c c0cVar = new c0c(kunVar, (byte) 2);
                d0r d0rVar = kunVar.t;
                o3r o3rVar = kunVar.Q0;
                String str = kunVar.X;
                fns fnsVar = igu.a;
                bs50 bs50Var = pyf0.a.f;
                mr20 m441Var2 = new m441(new r0r(d0rVar, o3rVar, str, null, (byte) 1));
                FlowEventSources.a.getClass();
                casVar.b = MergedEventSource.b(c0cVar, new EventSource[]{new b(bs50Var, new mr20[]{m441Var2})});
                return rih1.a;
            case 2:
                iu30 iu30Var = ((avn) this.b).S0;
                if (iu30Var != null) {
                    iu30Var.invoke(wsn.a);
                    return rih1.a;
                }
                u890.C("event");
                throw null;
            case 3:
                return new bun((cp11) this.b);
            case 4:
                ((Number) obj).intValue();
                return ((w3l0) this.b).b();
            case 5:
                h1o h1oVar = (h1o) this.b;
                bt6 bt6Var = h1oVar.e;
                bt6Var.f();
                lo8 lo8Var = new lo8((Object) h1oVar.c, (Object) ((cir0) obj).i(), (byte) 15);
                bt6Var.b();
                gs71 gs71VarA = h1oVar.d.a(new lmw(h1oVar.f, (byte) 10));
                return gs71VarA != null ? new gvj(gs71VarA, lo8Var, new tr71(fr71.a), (byte) 1) : lo8Var;
            case 6:
                return new lo8((cir0) obj, (h0r0) this.b, b2);
            case 7:
                b261.n((e261) obj, ((s4o) this.b).b);
                return rih1.a;
            case 8:
                b4o b4oVar = (b4o) obj;
                m4o m4oVar = (m4o) this.b;
                ay8 ay8VarH = d3p1.H(m4oVar.t, m4oVar.X, b4oVar);
                dkm dkmVar = m4oVar.Y;
                mr20 mr20Var = m4oVar.d;
                lnm lnmVar3 = null;
                evz evzVarQ = h5p1.q(dkmVar, new dkm(mr20Var, (byte) 6), ay8VarH, (php0) m4oVar.f.b, m4oVar.e.b(), new f4o(m4oVar, (lnm) null));
                String str2 = b4oVar.a;
                if (!m4oVar.g.g || str2.length() == 0) {
                    lnmVar = null;
                    m441Var = new m441(new sd0(2, (lnm) null, (byte) 25));
                } else {
                    lnmVar = null;
                    m441Var = hu20.e(rqt0.u(new dkm(mr20Var, (byte) 7)), new m53((Object) ay8VarH, (Object) m4oVar, str2, lnmVar3, (byte) 1));
                }
                return new x010(evzVarQ, m441Var, new vm0(3, lnmVar, (byte) 11), (byte) 1);
            case 9:
                return ((r4o) this.b).e;
            case 10:
                ((Number) obj).intValue();
                return ((h4l0) this.b).b();
            case 11:
                el9 el9Var = (el9) this.b;
                return d3p1.H(el9Var.b, el9Var.c, (String) obj);
            case 12:
                jd6 jd6Var = (jd6) this.b;
                return new te1(d3p1.F((d0r) jd6Var.b, jd6Var.c, (u6o) obj), (byte) 27);
            case 13:
                qv00 qv00Var = (qv00) obj;
                String str3 = ((x6o) this.b).t;
                qv00Var.a(str3, j7o.class, false);
                qv00Var.a(str3, jo70.class, false);
                return rih1.a;
            case 14:
                RequestFinishedInfo requestFinishedInfo = (RequestFinishedInfo) obj;
                v7o v7oVar = (v7o) this.b;
                HttpConnection httpConnection = v7oVar.o;
                if (httpConnection == null) {
                    u890.C("savedHttpConnection");
                    throw null;
                }
                jfv jfvVar = v7oVar.l;
                if (jfvVar == null) {
                    voe1 voe1Var = v7oVar.k;
                    jfvVar = voe1Var != null ? new jfv(voe1.a(voe1Var.a)) : null;
                }
                long jH = jfvVar != null ? jfv.h(jfvVar.a) : 0L;
                v9l v9lVarP = ConnectionMetrics.p();
                v9lVarP.u(jH / 1000.0d);
                v9lVarP.t(v7oVar.j);
                v9lVarP.s(v7oVar.j + jH);
                RequestFinishedInfo.Metrics metrics = requestFinishedInfo.getMetrics();
                UrlResponseInfo responseInfo = requestFinishedInfo.getResponseInfo();
                r7g1 r7g1VarN = TransactionMetrics.n();
                r7g1VarN.r((metrics == null || (sentByteCount = metrics.getSentByteCount()) == null) ? 0L : sentByteCount.longValue());
                if (metrics != null && (receivedByteCount = metrics.getReceivedByteCount()) != null) {
                    jLongValue = receivedByteCount.longValue();
                }
                r7g1VarN.q(jLongValue);
                String str4 = v7oVar.r;
                if (str4 == null) {
                    u890.C("savedUrl");
                    throw null;
                }
                r7g1VarN.A(str4);
                r7g1VarN.w(metrics != null ? metrics.getSocketReused() : false);
                r7g1VarN.u((responseInfo == null || !responseInfo.wasCached()) ? w020.c : w020.d);
                if (responseInfo != null) {
                    r7g1VarN.D(responseInfo.getHttpStatusCode());
                    r7g1VarN.x(responseInfo.getNegotiatedProtocol());
                    String proxyServer = responseInfo.getProxyServer();
                    proxyServer.getClass();
                    if (proxyServer.length() > 0 && !proxyServer.equals("direct://")) {
                        r7g1VarN.v(true);
                    }
                } else {
                    String str5 = v7oVar.n;
                    if (str5 != null) {
                        r7g1VarN.x(str5);
                    }
                }
                if (metrics != null && (connectStart = metrics.getConnectStart()) != null) {
                    r7g1VarN.t(connectStart.getTime());
                }
                if (metrics != null && (connectEnd = metrics.getConnectEnd()) != null) {
                    r7g1VarN.s(connectEnd.getTime());
                }
                if (metrics != null && (sendingStart = metrics.getSendingStart()) != null) {
                    r7g1VarN.z(sendingStart.getTime());
                }
                if (metrics != null && (sendingEnd = metrics.getSendingEnd()) != null) {
                    r7g1VarN.y(sendingEnd.getTime());
                }
                if (metrics != null && (responseStart = metrics.getResponseStart()) != null) {
                    r7g1VarN.C(responseStart.getTime());
                }
                if (metrics != null && (requestEnd = metrics.getRequestEnd()) != null) {
                    r7g1VarN.B(requestEnd.getTime());
                }
                int iOrdinal = ((gia) v7oVar.b.e.invoke()).ordinal();
                if (iOrdinal == 0) {
                    fiaVar = fia.c;
                } else if (iOrdinal == 1) {
                    fiaVar = fia.d;
                } else {
                    if (iOrdinal != 2) {
                        eg.o();
                        return null;
                    }
                    fiaVar = fia.b;
                }
                r7g1VarN.n(fiaVar);
                v9lVarP.q(r7g1VarN.build());
                if (v7oVar.m > 0) {
                    v9lVarP.v(v7oVar.m);
                }
                if (v7oVar.d.length() > 0) {
                    v9lVarP.r(v7oVar.d);
                }
                httpConnection.onMetrics(v9lVarP.build());
                return rih1.a;
            case 15:
                return Boolean.valueOf(!u890.j(obj, ((mhg1) ((bjg1) this.b)).d.getValue()));
            case 16:
                z2s z2sVar = (z2s) obj;
                bs0 bs0Var = (bs0) this.b;
                dnp dnpVar = (dnp) bs0Var.d;
                iu30 iu30Var2 = (iu30) bs0Var.e;
                switch (dnpVar.a) {
                    case 0:
                        kop kopVar = (kop) ((blp) dnpVar.b).c;
                        gw70 gw70VarB = kopVar.a.b();
                        c8o.l(gw70VarB);
                        laoVar = new lao(gw70VarB, (yqg) kopVar.d.get(), new urk0((byte) 4), iu30Var2);
                        break;
                    default:
                        apq apqVar = (apq) ((ykq) dnpVar.b).c;
                        gw70 gw70VarB2 = apqVar.a.b();
                        c8o.l(gw70VarB2);
                        laoVar = new lao(gw70VarB2, (yqg) apqVar.d.get(), new urk0((byte) 4), iu30Var2);
                        break;
                }
                z2sVar.R(iao.class, laoVar, h4o.Z0, h4o.a1, h4o.b1, false, wmn.T0);
                return rih1.a;
            case 17:
                z2s z2sVar2 = (z2s) obj;
                ug3 ug3Var = (ug3) this.b;
                em0 em0Var = (em0) ug3Var.c;
                ysr0 ysr0Var = (ysr0) ug3Var.d;
                iu30 iu30Var3 = (iu30) ug3Var.e;
                z2sVar2.R(sao.class, ((mmp) em0Var.b).a(ysr0Var, iu30Var3), fbo.i, fbo.X, fbo.X0, false, wmn.a1);
                z2sVar2.R(tao.class, ((xlp) em0Var.c).a(ysr0Var, iu30Var3), fbo.Y, fbo.Z, fbo.Y0, false, wmn.b1);
                z2sVar2.R(yao.class, ((jmp) em0Var.d).a(ysr0Var, iu30Var3), fbo.N0, fbo.O0, fbo.Z0, false, wmn.c1);
                z2sVar2.R(abo.class, ((tlp) em0Var.e).a(ysr0Var, iu30Var3), fbo.P0, fbo.Q0, fbo.a1, false, wmn.d1);
                z2sVar2.R(wao.class, ((omp) em0Var.f).a(ysr0Var, iu30Var3), fbo.R0, h4o.c1, fbo.b1, false, wmn.U0);
                z2sVar2.R(uao.class, ((qmp) em0Var.h).a(ysr0Var, iu30Var3), h4o.d1, h4o.e1, fbo.S0, false, wmn.V0);
                z2sVar2.R(zao.class, ((smp) em0Var.g).a(ysr0Var, iu30Var3), fbo.b, fbo.c, fbo.T0, false, wmn.W0);
                z2sVar2.R(vao.class, f6o1.A(((knp) em0Var.i).a(ysr0Var, iu30Var3), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), fbo.d, fbo.e, fbo.U0, false, wmn.X0);
                z2sVar2.R(bbo.class, f6o1.A(((lnp) em0Var.t).a(ysr0Var, iu30Var3), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), fbo.f, fbo.g, fbo.V0, false, wmn.Y0);
                z2sVar2.R(xao.class, ((hmp) em0Var.X).a(ysr0Var, iu30Var3), fbo.h, fbo.t, fbo.W0, false, wmn.Z0);
                return rih1.a;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return new m441(new tfo((Set) obj, (nfo) this.b, (lnm) null, (byte) 0));
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return ((ufo) this.b).d;
            case 20:
                res resVar = (res) this.b;
                resVar.h = i3a.k((q8n) resVar.e);
                return new rm(resVar, (byte) 29);
            case 21:
                ((qtr) obj).b(new js((hko) this.b, (lnm) null, (byte) 8));
                return rih1.a;
            case 22:
                return rqt0.u((dkm) this.b);
            case 23:
                ((qtr) obj).b(new ep0((quo) this.b, (lnm) null, (byte) 23));
                return rih1.a;
            case 24:
                b261.y((e261) obj, ((ouo) this.b).d);
                return rih1.a;
            case 25:
                jd6 jd6Var2 = (jd6) this.b;
                return d3p1.F((d0r) jd6Var2.b, jd6Var2.c, (uho) obj);
            case 26:
                return Boolean.valueOf(u890.j(((gmc) ((mmr0) obj).a).a, ((rkc) this.b).b.a));
            case 27:
                l0r l0rVar = (l0r) this.b;
                return hu20.e(rqt0.t((mr20) obj, new i4o(l0rVar, (byte) 5)), new b7c(lnmVar2, (Object) l0rVar, (byte) 20));
            case 28:
                ((Number) obj).intValue();
                return (mr20) ((u1r) this.b).c.get();
            default:
                List<e1r> items = ((r3r) this.b).a.getData().a(obj).getItems();
                ArrayList arrayList = new ArrayList();
                for (e1r e1rVar : items) {
                    zjd1 zjd1Var = e1rVar.d;
                    jh5 jh5Var = e1rVar.a;
                    if (zjd1Var == null) {
                        zjd1Var = jh5Var.a;
                    }
                    if (!(zjd1Var instanceof xv00) && !(jh5Var.b instanceof String)) {
                        eg.m("You can only convert data statements to required meta data if all the tables are ExtendedMetadataTable");
                        return null;
                    }
                    Object obj2 = jh5Var.b;
                    String str6 = obj2 instanceof String ? (String) obj2 : null;
                    if (str6 != null) {
                        arrayList.add(str6);
                    }
                }
                return Collections.singletonMap(rih1.a, o7h.p1(arrayList));
        }
    }
}
