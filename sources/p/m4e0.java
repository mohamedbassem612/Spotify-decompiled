package p;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.spotify.aiplaylist.promptcreation.presentation.MessageInputView;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;
import com.spotify.nowplaying.carousel.CarouselView;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.ContextTrack$Metadata;
import com.spotify.player.model.PlayerState;
import com.spotify.userinteractivityservice.usercomments.v1.proto.ListRepliesResponse;
import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.completable.CompletableCreate;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableJust;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeDelayWithCompletable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class m4e0 implements Function, si90, qiw, d5q0, Producer, ya {
    public final /* synthetic */ byte a;
    public final Object b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public m4e0(byte b) {
        this(1);
        this.a = b;
        switch (b) {
            case 5:
                break;
            case 6:
                this.b = new Bundle();
                break;
            default:
                this.b = new Handler(Looper.getMainLooper());
                break;
        }
    }

    public void a(jh5 jh5Var, Object obj) {
        Map map = (Map) this.b;
        if (obj != null) {
            map.put(jh5Var, obj);
        } else {
            map.remove(jh5Var);
        }
    }

    public boolean accept(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 11:
                return !((np4) obj2).c();
            default:
                um4 um4Var = (um4) obj2;
                return um4Var.b() && !(um4Var.c() && ((ksk) obj).c == le30.e);
        }
    }

    public Object apply(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                ListRepliesResponse listRepliesResponse = (ListRepliesResponse) obj;
                fnh fnhVar = (fnh) obj2;
                String str = fnhVar.a;
                c380 c380VarA = mqo1.A(listRepliesResponse.o());
                String str2 = fnhVar.b;
                String nextPageToken = listRepliesResponse.getNextPageToken();
                return new qoh(str, new cg21(c380VarA, listRepliesResponse.n(), str2, nextPageToken.length() == 0 ? null : nextPageToken, fnhVar.c, 1));
            case 3:
                return (ObservableSource) ((e4f0) obj2).invoke(obj);
            case 7:
                return (ObservableSource) ((z6h0) obj2).invoke(obj);
            case 14:
                if (((Long) obj).longValue() >= 0) {
                    return CompletableEmpty.a;
                }
                q1o0 q1o0Var = (q1o0) ((drj0) obj2).b;
                return q1o0Var.b().flatMapCompletable(new yfc0(q1o0Var, (byte) 22));
            case 15:
                return Observable.just((Boolean) obj2);
            case 16:
                PlayerState playerState = (PlayerState) obj;
                sbk sbkVar = (sbk) obj2;
                ContextTrack contextTrack = (ContextTrack) playerState.track().b();
                contextTrack.getClass();
                String strA0 = l4o1.a0(contextTrack, ContextTrack$Metadata.KEY_CONTEXT_URI);
                String strContextUri = (strA0 == null || strA0.length() == 0) ? null : strA0;
                if (strContextUri == null) {
                    strContextUri = playerState.contextUri();
                }
                FlowableJust flowableJustI = Flowable.I(contextTrack.uri());
                strContextUri.getClass();
                Observable observableI = ((ip91) sbkVar.e).i(contextTrack.uid(), contextTrack.uri(), strContextUri, Boolean.valueOf(l4o1.J(contextTrack)));
                BackpressureStrategy backpressureStrategy = BackpressureStrategy.d;
                Flowable flowable = observableI.toFlowable(backpressureStrategy);
                String strUri = contextTrack.uri();
                Flowable flowableE = Flowable.e(flowableJustI, flowable, g7h.d((g7h) sbkVar.t, strContextUri, new String[]{strUri}).map(new ljp1(strUri, (byte) 13)).toFlowable(backpressureStrategy), dj20.P0);
                flowableE.getClass();
                return flowableE.t(Functions.a);
            case 17:
                uth1 uth1Var = (uth1) obj;
                String str3 = uth1Var.b;
                boolean z = uth1Var.c;
                z8o0 z8o0Var = (z8o0) obj2;
                a9o0 a9o0Var = z8o0Var.a;
                return (z ? a9o0Var.c(str3).g(new y8o0(z8o0Var, str3, (byte) 0)) : a9o0Var.b(str3).g(new y8o0(z8o0Var, str3, (byte) 1))).o(Functions.h).d(Observable.just(new pmq0(str3, z)));
            case 21:
                tg60 tg60Var = (tg60) obj2;
                return Boolean.valueOf(tg60Var.b && tg60Var.c && !((Boolean) obj).booleanValue());
            case 24:
                mmr0 mmr0Var = (mmr0) obj;
                ywp ywpVar = ((bxp0) obj2).c;
                nvp0 nvp0Var = (nvp0) mmr0Var.a;
                if (((Boolean) mmr0Var.b).booleanValue()) {
                    ArrayList arrayList = nvp0Var.a;
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj3 : arrayList) {
                        int i = ((mvp0) obj3).b;
                        if (i == 2 || i == 5 || i == 6) {
                            arrayList2.add(obj3);
                        }
                    }
                    ArrayList arrayList3 = new ArrayList(q7h.U(arrayList2, 10));
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(((mvp0) it.next()).a);
                    }
                    Set setP1 = o7h.p1(arrayList3);
                    if (!setP1.isEmpty()) {
                        dma1 dma1Var = (dma1) ywpVar.get();
                        bma1 bma1Var = bxp0.g;
                        if (!u890.j(dma1Var.a(bma1Var), setP1)) {
                            hma1 hma1VarEdit = ((dma1) ywpVar.get()).edit();
                            hma1VarEdit.e(bma1Var, setP1);
                            hma1VarEdit.g();
                            setP1.size();
                            setP1.toString();
                        }
                    }
                } else {
                    Logger.k("Ignoring offline resources update, the product type is not premium.", new Object[0]);
                }
                return rih1.a;
            case 25:
                poj0 poj0Var = (poj0) obj2;
                c341 c341Var = (c341) poj0Var.d;
                Context context = (Context) poj0Var.b;
                Uri uri = gz40.a;
                String string = context.getString(2131956261);
                Locale locale = Locale.US;
                c341Var.getClass();
                return new MaybeDelayWithCompletable(Maybe.e((f6a1) obj), new CompletableCreate(new b341(c341Var.a.getApplicationContext(), string, c341Var.b)).o(Functions.h)).j((Scheduler) poj0Var.c);
            case 26:
                lyq0 lyq0Var = ((tyq0) obj2).d;
                List list = ((z310) obj).a;
                lyq0Var.a = list;
                return list;
            case 28:
                return new h500(((bgw) obj2).b(), (Throwable) obj);
            default:
                mx41 mx41Var = (mx41) obj;
                yon yonVar = (yon) obj2;
                ((t5h1) yonVar.d).getClass();
                String strA = t5h1.a();
                String str4 = mx41Var.b;
                boolean z2 = mx41Var.e;
                l651 l651Var = (l651) yonVar.e;
                h39 h39Var = new h39(strA, str4, z2, l651Var);
                ix7 ix7Var = (ix7) yonVar.c;
                vi11 vi11Var = (vi11) ix7Var.b;
                p39 p39Var = (p39) ix7Var.c;
                mmr0 mmr0Var2 = new mmr0("query", str4);
                mmr0 mmr0Var3 = new mmr0("locale", p39Var.a);
                m39 m39Var = p39Var.d;
                di4 di4Var = p39Var.b;
                List<mmr0> listM = p7h.M(new mmr0[]{mmr0Var2, mmr0Var3, new mmr0("entity_types", o7h.y0(o7h.O0(mo21.O0, m39Var.c(z2, di4Var.n0(), di4Var.M())), ",", (String) null, (String) null, (iu30) null, 62)), new mmr0("limit", "20"), new mmr0("album_states", "live,prerelease"), new mmr0("on_demand_sets_enabled", p39Var.c ? "true" : null), new mmr0("audiobook_states", "live,prerelease"), new mmr0("podcast_chapter_types", di4Var.Q() ? "talk,music" : null), new mmr0("features", p39Var.e.o()), new mmr0("experience", bzn1.x(l651Var)), new mmr0("_t", p39Var.f.a())});
                ArrayList arrayList4 = new ArrayList();
                for (mmr0 mmr0Var4 : listM) {
                    String str5 = (String) mmr0Var4.a;
                    String str6 = (String) mmr0Var4.b;
                    mmr0 mmr0Var5 = str6 != null ? new mmr0(str5, str6) : null;
                    if (mmr0Var5 != null) {
                        arrayList4.add(mmr0Var5);
                    }
                }
                return zho1.H((hc51) vi11Var.e, new uw41(vi11Var, sqg0.T(arrayList4), sqg0.J(new mmr0[]{new mmr0("x-search-request-id", strA), new mmr0("x-search-timestamp", String.valueOf(((yqg) ((mre0) ix7Var.d).b).b()))}), strA, (byte) 1)).map(vgp1.t).map(new sjq0(yonVar, h39Var, mx41Var, (byte) 13)).doOnError(new vrk1((byte) 25)).onErrorReturn(new zhq0(yonVar, h39Var, mx41Var)).toObservable().compose((lk1) yonVar.b);
        }
    }

    public Object b(jh5 jh5Var) {
        return ((Map) this.b).get(jh5Var);
    }

    public jhm c(int i, String str, String str2) {
        return new jhm("premium_destination_offline_download", tmx.c, (fhm) null, 2131954393, (String) null, false, new tm81(1, 6, "premium_destination_offline_download", (iu30) null, false), new ihm(new bhm(2), new ghm(mmp0.V0, new fki0(str, (byte) 29)), new fu(i, this, str, str2, (byte) 12)), 116);
    }

    public qir0 d() {
        lik1 lik1Var;
        bbr0 bbr0Var = (bbr0) this.b;
        bn70 bn70VarA = bbr0Var.b0(bn70.class).a();
        if (bn70VarA != null && (lik1Var = bn70VarA.b) != null) {
            return lik1Var.a();
        }
        zh10 zh10VarA = bbr0Var.b0(zh10.class).a();
        if (zh10VarA != null) {
            return zh10VarA.b.a();
        }
        return null;
    }

    public Object get() {
        return (SchedulerWorkRunner) ((sam0) this.b).b.b;
    }

    public void i(Exception exc) {
        ((ssw0) this.b).l(new anq0(exc));
    }

    public void v(Object obj) {
        hzo0 hzo0Var;
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 8:
                MessageInputView.z((MessageInputView) obj2, (nua0) obj);
                return;
            case 18:
                s3g1 s3g1Var = (s3g1) obj;
                u3 u3Var = (u3) obj2;
                azo0 azo0Var = ((qzo0) u3Var.f).c;
                List list = s3g1Var.a;
                j4u j4uVarP = w0h1.p(new r0i((byte) 1, azo0Var.d, list, azo0Var.f));
                azo0Var.f = list;
                j4uVarP.b(azo0Var);
                CarouselView carouselView = (CarouselView) u3Var.c;
                carouselView.u0(s3g1Var.b);
                o131 o131Var = s3g1Var.c;
                carouselView.setDisallowScrollLeft(o131Var.c);
                carouselView.setDisallowScrollRight(o131Var.a);
                return;
            default:
                doj0 doj0Var = (doj0) obj;
                j2p0 j2p0Var = (j2p0) obj2;
                tp7 tp7Var = j2p0Var.d1;
                doj0 doj0Var2 = doj0.a;
                boolean z = doj0Var == doj0Var2;
                if (tp7Var.a != z) {
                    tp7Var.a = z;
                    tp7Var.i();
                }
                dtw dtwVar = j2p0Var.a1;
                if (dtwVar == null) {
                    u890.C("connectLabelVH");
                    throw null;
                }
                dtwVar.w.setVisibility(doj0Var != doj0Var2 ? 8 : 0);
                dtw dtwVar2 = j2p0Var.W0;
                izo0 izo0Var = (izo0) dtwVar2.f;
                if (izo0Var != null) {
                    int iOrdinal = doj0Var.ordinal();
                    if (iOrdinal == 0) {
                        hzo0Var = hzo0.a;
                    } else {
                        if (iOrdinal != 1) {
                            eg.o();
                            return;
                        }
                        hzo0Var = hzo0.b;
                    }
                    dtwVar2.f(new izo0(izo0Var.a, hzo0Var, izo0Var.c));
                    return;
                }
                return;
        }
    }

    public m4e0(int i) {
        this.a = (byte) 5;
        this.b = new ConcurrentHashMap();
    }

    public /* synthetic */ m4e0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
