package p;

import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.base.java.logging.Logger;
import com.spotify.interapp.interappprotocol.NotAuthorizedException;
import com.spotify.karaoke.esperanto.proto.KaraokePostVocalVolumeRequest;
import com.spotify.karaoke.esperanto.proto.KaraokeSubEventsResponse;
import com.spotify.share.linkgeneration.api.UnshorteningUrlException;
import com.spotify.share.linkgeneration.api.proto.UnshortenUrlRequest;
import com.spotify.share.linkgeneration.api.proto.UnshortenUrlResponse;
import com.spotify.stream_reporting_esperanto.proto.StreamEndRequestOuterClass$StreamEndRequest;
import com.spotify.stream_reporting_esperanto.proto.StreamHandleOuterClass$StreamHandle;
import com.spotify.stream_reporting_esperanto.proto.StreamProgressRequestOuterClass$StreamProgressRequest;
import com.spotify.stream_reporting_esperanto.proto.StreamSeekRequestOuterClass$StreamSeekRequest;
import com.spotify.stream_reporting_esperanto.proto.StreamStartRequestOuterClass$StreamStartRequest;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableSingleMaybe;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeIgnoreElementCompletable;
import java.io.File;
import java.io.FileInputStream;
import java.nio.channels.FileChannel;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import retrofit2.HttpException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class h5a1 implements fyv0, ya, mkf1, Function, sh, qiw, cgz0, bxh1, y4l1, m7b1, hj71 {
    public final /* synthetic */ byte a;
    public final Object b;

    public h5a1(jik1 jik1Var) {
        this.a = (byte) 3;
        this.b = new hp91(jik1Var);
    }

    public cbr0 a() {
        return (cbr0) ((jly0) ((goq) this.b).d).get();
    }

    public boolean accept(Object obj) {
        return ((cq4) this.b).a();
    }

    public Object apply(Object obj) {
        String str;
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 6:
                t8r0 t8r0Var = (t8r0) obj2;
                return new MaybeIgnoreElementCompletable(new FlowableSingleMaybe(((t8u0) t8r0Var.b).a((x8c0) t8r0Var.a).a().a(new p9u0()).filter(y1x0.Q0).f(a2x0.R0).m().R(3L, Functions.h))).w();
            case 8:
                eec1 eec1Var = (eec1) obj;
                wec1 wec1Var = (wec1) obj2;
                Scheduler scheduler = wec1Var.g;
                hec1 hec1Var = wec1Var.c;
                if (eec1Var instanceof ffc1) {
                    StreamStartRequestOuterClass$StreamStartRequest streamStartRequestOuterClass$StreamStartRequest = ((ffc1) eec1Var).a;
                    wec1Var.W(w8r.DEBUG_TRACE_POINT_BETAMAX_STREAM_REPORTING_START);
                    return wec1Var.P0 != null ? CompletableEmpty.a : hec1Var.callSingle("spotify.stream_reporting_esperanto.proto.StreamReportingService", "StreamStart", streamStartRequestOuterClass$StreamStartRequest).map(ybx0.R0).observeOn(scheduler).flatMapCompletable(new q881(wec1Var, (byte) 15)).h(new vec1(wec1Var, (byte) 6));
                }
                if (eec1Var instanceof ydc1) {
                    zdc1 zdc1Var = ((ydc1) eec1Var).a;
                    StreamHandleOuterClass$StreamHandle streamHandleOuterClass$StreamHandle = wec1Var.P0;
                    if (streamHandleOuterClass$StreamHandle == null) {
                        return CompletableEmpty.a;
                    }
                    zdc1Var.y(streamHandleOuterClass$StreamHandle);
                    return hec1Var.callSingle("spotify.stream_reporting_esperanto.proto.StreamReportingService", "StreamProgress", (StreamProgressRequestOuterClass$StreamProgressRequest) zdc1Var.build()).map(vbx0.R0).observeOn(scheduler).flatMapCompletable(new vr51(wec1Var, (byte) 23)).h(new vec1(wec1Var, (byte) 4)).o(Functions.h);
                }
                if (eec1Var instanceof zec1) {
                    afc1 afc1Var = ((zec1) eec1Var).a;
                    StreamHandleOuterClass$StreamHandle streamHandleOuterClass$StreamHandle2 = wec1Var.P0;
                    if (streamHandleOuterClass$StreamHandle2 == null) {
                        return CompletableEmpty.a;
                    }
                    afc1Var.s(streamHandleOuterClass$StreamHandle2);
                    return hec1Var.callSingle("spotify.stream_reporting_esperanto.proto.StreamReportingService", "StreamSeek", (StreamSeekRequestOuterClass$StreamSeekRequest) afc1Var.build()).map(wbx0.R0).observeOn(scheduler).flatMapCompletable(new dn81((Object) wec1Var, (byte) 14)).h(new vec1(wec1Var, (byte) 5)).o(Functions.h);
                }
                if (!(eec1Var instanceof ldc1)) {
                    eg.o();
                    return null;
                }
                ldc1 ldc1Var = (ldc1) eec1Var;
                mdc1 mdc1Var = ldc1Var.a;
                rm5 rm5Var = ldc1Var.b;
                wec1Var.W(w8r.DEBUG_TRACE_POINT_BETAMAX_STREAM_REPORTING_END);
                StreamHandleOuterClass$StreamHandle streamHandleOuterClass$StreamHandle3 = wec1Var.P0;
                if (streamHandleOuterClass$StreamHandle3 == null) {
                    rm5Var.H();
                    return CompletableEmpty.a;
                }
                mdc1Var.r(streamHandleOuterClass$StreamHandle3);
                return hec1Var.callSingle("spotify.stream_reporting_esperanto.proto.StreamReportingService", "StreamEnd", (StreamEndRequestOuterClass$StreamEndRequest) mdc1Var.build()).map(u9x0.Q0).observeOn(scheduler).flatMapCompletable(new o2b1(wec1Var, (byte) 6)).h(new vec1(wec1Var, (byte) 3)).o(Functions.h).g(new dkb1(rm5Var, wec1Var, (byte) 2));
            case 10:
                Logger.e((Throwable) obj, "Assisted Curation: Failed to fetch next page of episode recommendations", new Object[0]);
                return (v491) obj2;
            case 11:
                return ((of60) ((ore1) obj2).b.b).a().firstOrError().map(cj20.d).toObservable();
            case 16:
                if (((hf7) obj).d == null) {
                    return Observable.empty();
                }
                return Observable.timer(200L, TimeUnit.MILLISECONDS, (Scheduler) ((g2x0) obj2).b);
            case 17:
                return ((jc9) ((kz50) obj2).a).o((sy21) obj);
            case 20:
                List list = (List) obj;
                return !list.isEmpty() ? new i5w0(zgo1.v((fhb) o7h.q0(list), ((Boolean) ((x5u) ((hce1) obj2).d).invoke()).booleanValue())) : j5.a;
            case 21:
                return ((yjj1) obj2).i.map(u9x0.V0).startWithItem(Boolean.FALSE);
            case 23:
                KaraokeSubEventsResponse karaokeSubEventsResponse = (KaraokeSubEventsResponse) obj;
                if (karaokeSubEventsResponse.o() != coa0.MASK_READY) {
                    return Completable.j(new Throwable(karaokeSubEventsResponse.n()));
                }
                wlk1 wlk1Var = (wlk1) obj2;
                wlk1Var.getClass();
                aoa0 aoa0VarN = KaraokePostVocalVolumeRequest.n();
                aoa0VarN.n(xlk1.c.a());
                KaraokePostVocalVolumeRequest karaokePostVocalVolumeRequestBuild = aoa0VarN.build();
                be beVar = wlk1Var.d;
                karaokePostVocalVolumeRequestBuild.getClass();
                return Completable.k(beVar.c(karaokePostVocalVolumeRequestBuild));
            default:
                Boolean bool = (Boolean) obj;
                ppl1 ppl1Var = (ppl1) obj2;
                if (bool.booleanValue()) {
                    x8w x8wVar = ppl1Var.c.a.g(pu71.d, 0L) != 0 ? x8w.REMINDER : x8w.FIRST_TIME;
                    yzu yzuVar = ppl1Var.e;
                    w8w w8wVarA = ((h21) ((tzo) yzuVar.b).b).a();
                    th30 th30Var = (th30) yzuVar.a;
                    ft0 ft0Var = new ft0(yzuVar, w8wVarA, (byte) 8);
                    w8wVarA.g1(th30Var, "w8w");
                    w8wVarA.b2 = ft0Var;
                    otu otuVar = (otu) yzuVar.d;
                    i8h1 i8h1Var = (i8h1) otuVar.b;
                    brl0 brl0Var = (brl0) otuVar.c;
                    int i = x8wVar.a;
                    x6h1 x6h1VarC = brl0Var.b.c();
                    if (i == 1) {
                        str = "first_time";
                    } else {
                        if (i != 2) {
                            throw null;
                        }
                        str = "reminder";
                    }
                    x6h1VarC.i.add(new a7h1("content", (String) null, (Integer) null, (String) null, str));
                    x6h1VarC.j = true;
                    y6h1 y6h1VarA = x6h1VarC.a();
                    k7h1 k7h1Var = new k7h1();
                    ((xjn) k7h1Var).a = y6h1VarA;
                    ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                    k7h1Var.e = brl0Var.c;
                    i8h1Var.f(k7h1Var.a(), (Set) null);
                }
                return bool;
        }
    }

    public void b(Intent intent) {
        ((ijl1) this.b).startActivityForResult(intent, 1780);
    }

    public FileChannel c() {
        return new FileInputStream((File) this.b).getChannel();
    }

    public e711 d(ViewGroup viewGroup, Object obj, v1r0 v1r0Var, y3o0 y3o0Var) {
        vi11 vi11Var = (vi11) ((lud0) this.b).b;
        return new n9b1(viewGroup, (gw70) vi11Var.b, (d0r) vi11Var.c, (uym0) vi11Var.d, (et90) vi11Var.e, y3o0Var, (sn4) vi11Var.f);
    }

    public String e(int i) {
        return ((c8b1) ((hce1) this.b).d).e(i);
    }

    public void f(m8b0 m8b0Var) {
        s24 s24Var = (s24) this.b;
        if (((p1f0) s24Var.e) != null) {
            int iB = m8b0Var.b(1);
            try {
                ((p1f0) s24Var.e).w(iB, m8b0Var.b(2));
            } catch (NotAuthorizedException unused) {
                s24Var.Z(34, iB, cv5.a, "wamp.error.not_authorized");
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object g(y2y y2yVar, onm onmVar) throws NoWhenBranchMatchedException {
        hmc1 hmc1Var;
        st81 st81Var;
        if (onmVar instanceof hmc1) {
            hmc1Var = (hmc1) onmVar;
            int i = hmc1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                hmc1Var.c = i - Integer.MIN_VALUE;
            } else {
                hmc1Var = new hmc1(this, onmVar);
            }
        } else {
            hmc1Var = new hmc1(this, onmVar);
        }
        Object objD = hmc1Var.a;
        int i2 = hmc1Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objD);
                au81 au81Var = (au81) this.b;
                int i3 = y2yVar.a;
                String str = y2yVar.b;
                int iC = l1d.C(i3);
                if (iC == 0) {
                    throw new IllegalStateException("Cannot submit feedback when no option selected");
                }
                if (iC == 1) {
                    st81Var = tt81.a;
                } else if (iC == 2) {
                    st81Var = rt81.a;
                } else if (iC == 3) {
                    st81Var = pt81.a;
                } else if (iC == 4) {
                    st81Var = qt81.a;
                } else {
                    if (iC != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    st81Var = new st81(str);
                }
                hmc1Var.c = 1;
                objD = au81Var.d(st81Var, hmc1Var);
                d9n d9nVar = d9n.a;
                if (objD == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objD);
            }
            return new d3y((String) objD);
        } catch (Exception unused) {
            op71.x(hmc1Var.getContext());
            return f3y.a;
        }
    }

    public h0r0 h() {
        goq goqVar = (goq) this.b;
        dua1 dua1Var = (dua1) goqVar.g;
        los losVar = (los) ((jly0) goqVar.b).get();
        zta1 zta1Var = (zta1) goqVar.e;
        qyj qyjVar = (qyj) zta1Var.a.get();
        c8o.l(qyjVar);
        esa1 esa1Var = new esa1(xqu.a((ipq) goqVar.h));
        pwa1 pwa1Var = (pwa1) zta1Var.c.get();
        c8o.l(pwa1Var);
        cwu0 cwu0Var = (cwu0) zta1Var.d.get();
        c8o.l(cwu0Var);
        rss rssVar = (rss) ((jly0) goqVar.c).get();
        lzn0 lzn0Var = (lzn0) zta1Var.f.get();
        c8o.l(lzn0Var);
        return new yta1(dua1Var, losVar, qyjVar, esa1Var, pwa1Var, cwu0Var, rssVar, lzn0Var, cto1.q(krw0.i), (cbr0) ((jly0) goqVar.d).get());
    }

    public View i(int i) {
        if (i == 0) {
            return new View(((a2f1) this.b).c.a.getContext());
        }
        return null;
    }

    public void j(int i) {
        if (i == 0) {
            a2f1 a2f1Var = (a2f1) this.b;
            if (a2f1Var.f) {
                return;
            }
            a2f1Var.c.l = true;
            a2f1Var.f = true;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.spotify.share.linkgeneration.api.UnshorteningUrlException */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object k(String str, onm onmVar) throws Exception {
        klh1 klh1Var;
        if (onmVar instanceof klh1) {
            klh1Var = (klh1) onmVar;
            int i = klh1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                klh1Var.c = i - Integer.MIN_VALUE;
            } else {
                klh1Var = new klh1(this, onmVar);
            }
        } else {
            klh1Var = new klh1(this, onmVar);
        }
        Object objB = klh1Var.a;
        int i2 = klh1Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objB);
                m3i1 m3i1Var = (m3i1) this.b;
                mlh1 mlh1VarO = UnshortenUrlRequest.o();
                mlh1VarO.n(str);
                UnshortenUrlRequest unshortenUrlRequestBuild = mlh1VarO.build();
                klh1Var.c = 1;
                objB = m3i1Var.b(unshortenUrlRequestBuild, klh1Var);
                d9n d9nVar = d9n.a;
                if (objB == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objB);
            }
            return dio1.D((UnshortenUrlResponse) objB);
        } catch (HttpException e) {
            int i3 = e.a;
            String strValueOf = String.valueOf(i3);
            ejc0 ejc0Var = new ejc0(e.b);
            String str2 = (String) (!ejc0Var.hasNext() ? null : ejc0Var.next());
            String string = str2 != null ? ihc1.e1(str2).toString() : null;
            if (string == null) {
                string = "";
            }
            if (string.length() != 0) {
                strValueOf = xcg1.i(strValueOf, ": ", string);
            }
            throw new UnshorteningUrlException(strValueOf, e, new Integer(i3));
        } catch (Exception e2) {
            throw e2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object n(k371 k371Var, lnm lnmVar) {
        cgm1 cgm1Var;
        cmt cmtVar;
        cmt cmtVar2;
        phm1 phm1Var;
        if (lnmVar instanceof cgm1) {
            cgm1Var = (cgm1) lnmVar;
            int i = cgm1Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                cgm1Var.e = i - Integer.MIN_VALUE;
            } else {
                cgm1Var = new cgm1(this, (onm) lnmVar);
            }
        } else {
            cgm1Var = new cgm1(this, (onm) lnmVar);
        }
        Object obj = cgm1Var.c;
        int i2 = cgm1Var.e;
        if (i2 == 0) {
            hm5.M(obj);
            phm1 phm1Var2 = (phm1) jhc1.t(k371Var.b, "wrapped.share.loader_params", phm1.class);
            if (phm1Var2 == null || (cmtVar = (cmt) jhc1.t(k371Var.b, "wrapped.share.destination_list_configuration", cmt.class)) == null) {
                return null;
            }
            cik1 cik1Var = (cik1) this.b;
            cgm1Var.a = phm1Var2;
            cgm1Var.b = cmtVar;
            cgm1Var.e = 1;
            Object objY = fn31.Y((q8n) cik1Var.e, new agm1(phm1Var2, cik1Var, (lnm) null), cgm1Var);
            d9n d9nVar = d9n.a;
            if (objY == d9nVar) {
                return d9nVar;
            }
            obj = objY;
            cmtVar2 = cmtVar;
            phm1Var = phm1Var2;
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            cmtVar2 = cgm1Var.b;
            phm1Var = cgm1Var.a;
            hm5.M(obj);
        }
        return new qj71((List) obj, phm1Var.c, new quk(new va71(cmtVar2)));
    }

    public boolean r(View view) {
        ((qvs) this.b).invoke(fzf1.d);
        return true;
    }

    public void v(Object obj) {
        ((j5g1) this.b).t.setText((String) obj);
    }

    public /* synthetic */ h5a1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
