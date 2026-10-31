package p;

import android.app.Activity;
import android.app.PendingIntent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ViewFlipper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.a;
import com.spotify.aiplaylist.promptcreation.presentation.tracklist.TrackListView;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.coroutines.DispatcherWorker;
import com.spotify.mobius.functions.Producer;
import com.spotify.music.podcastinteractivity.polls.proto.PollVoteRequest;
import com.spotify.musicappplatform.state.processor.AppLifecycleServicePendingIntent;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.ContextTrack$Metadata;
import com.spotify.player.model.PlayerState;
import com.spotify.player.model.Restrictions;
import com.spotify.player.model.command.SkipToNextTrackCommand;
import com.spotify.player.model.command.options.LoggingParams;
import com.spotify.profile.profile.proto.ArtistlistResponse;
import com.spotify.quizrecommendationservice.v1.GetRecommendedQuizzesRequest;
import com.spotify.quizrecommendationservice.v1.GetRecommendedQuizzesResponse;
import com.spotify.quizrecommendationservice.v1.RecommendedQuiz;
import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class rut0 implements Function, qiw, lqw, ya, Producer, j7k1 {
    public final /* synthetic */ byte a;
    public final Object b;

    public rut0() {
        this.a = (byte) 16;
        this.b = new h0n1((byte) 4);
    }

    public int a(View view) {
        return a.M(view) - ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).leftMargin;
    }

    public boolean accept(Object obj) {
        return ((uh4) this.b).h();
    }

    /* JADX WARN: Code duplicated, block: B:80:0x032c  */
    /* JADX WARN: Code duplicated, block: B:83:0x033d  */
    /* JADX WARN: Code duplicated, block: B:86:0x0344  */
    /* JADX WARN: Code duplicated, block: B:87:0x0349  */
    /* JADX WARN: Code duplicated, block: B:90:0x0357  */
    public Object apply(Object obj) {
        rqd0 pqd0Var;
        Integer numC0;
        int iIntValue;
        qqd0 qqd0Var;
        byte b = this.a;
        byte b2 = 3;
        byte b3 = 2;
        BackpressureStrategy backpressureStrategy = BackpressureStrategy.d;
        boolean z = false;
        byte b4 = 1;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                ztc ztcVar = (ztc) obj;
                sut0 sut0Var = (sut0) obj2;
                ztc ztcVarA = ztc.a(ztcVar, (mia1) null, (List) null, 0, 63);
                tut0 tut0Var = sut0Var.a;
                return yoi1.i(((lut0) tut0Var.b.get()).b, o6x.a).observeOn(tut0Var.c).onErrorReturnItem(Boolean.FALSE).switchMap(new myq0(tut0Var, ztcVarA, (byte) 21)).filter(ws10.Z0).map(new vgq0(sut0Var, ztcVar, (byte) 8));
            case 1:
                w9u0 w9u0Var = ((t1u0) obj2).t;
                w9u0Var.getClass();
                return w9u0Var.a(new m9u0(SkipToNextTrackCommand.builder().loggingParams(LoggingParams.builder().interactionId((String) obj).build()).build()));
            case 2:
                PlayerState playerState = (PlayerState) obj;
                lbu0 lbu0Var = (lbu0) obj2;
                uny unyVar = lbu0Var.d;
                if (lbu0Var.c.h(playerState)) {
                    String str = (String) playerState.contextMetadata().get(ContextTrack$Metadata.KEY_LOADING_STATUS);
                    if (str == null) {
                        str = "";
                    }
                    if (str.length() <= 0 || str.equals("loading")) {
                        pqd0Var = oqd0.a;
                    } else {
                        Map map = mbu0.a;
                        String str2 = (String) playerState.contextMetadata().get(ContextTrack$Metadata.KEY_LOADING_STATUS);
                        numC0 = nhc1.c0(str2 != null ? str2 : "");
                        if (numC0 != null) {
                            iIntValue = numC0.intValue();
                        } else {
                            iIntValue = 500;
                        }
                        qqd0Var = (qqd0) map.get(Integer.valueOf(iIntValue));
                        if (qqd0Var == null) {
                            qqd0Var = qqd0.d;
                        }
                        pqd0Var = new pqd0(qqd0Var);
                    }
                } else {
                    Map map2 = mbu0.a;
                    String str3 = (String) playerState.contextMetadata().get(ContextTrack$Metadata.KEY_LOADING_STATUS);
                    numC0 = nhc1.c0(str3 != null ? str3 : "");
                    if (numC0 != null) {
                        iIntValue = numC0.intValue();
                    } else {
                        iIntValue = 500;
                    }
                    qqd0Var = (qqd0) map2.get(Integer.valueOf(iIntValue));
                    if (qqd0Var == null) {
                        qqd0Var = qqd0.d;
                    }
                    pqd0Var = new pqd0(qqd0Var);
                }
                return unyVar.x(pqd0Var);
            case 3:
                String str4 = (String) obj;
                int length = str4.length();
                ktl ktlVar = ktl.a;
                if (length > 0) {
                    return ((uu00) ((tzr0) obj2).e).b(new oi("queue", false, new atp0(str4, (byte) 26))).takeUntil(zi20.W0).filter(aj20.Z0).map(new vdn1(str4, (byte) 12)).toFlowable(backpressureStrategy).N(ktlVar);
                }
                return Flowable.I(ktlVar);
            case 4:
                kl1 kl1Var = (kl1) obj2;
                return ((cfi1) kl1Var.d).a((String) kl1Var.b).toObservable().filter(d710.b1).map(e710.b1).compose(new fex0((tzr0) kl1Var.e, b2));
            case 5:
                f7h f7hVar = (f7h) ((Map) obj).get(((u2v0) obj2).a);
                return Boolean.valueOf(f7hVar != null ? f7hVar.c : false);
            case 6:
                lbv0 lbv0Var = (lbv0) obj;
                yeu0 yeu0Var = (yeu0) obj2;
                int i = lbv0Var.a;
                ArrayList arrayList = new ArrayList(lbv0Var.b);
                bcv0 bcv0VarO = PollVoteRequest.o();
                bcv0VarO.n(arrayList);
                bcv0VarO.q(i);
                PollVoteRequest pollVoteRequest = (PollVoteRequest) bcv0VarO.build();
                ncv0 ncv0Var = (ncv0) yeu0Var.b;
                pollVoteRequest.getClass();
                return ncv0Var.b(pollVoteRequest).doOnSuccess(new ocv0(yeu0Var, b4)).map(f610.b1).onErrorReturn(o610.b1).toObservable();
            case 7:
            case 8:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 20:
            case 21:
            case 23:
            default:
                yvg1 yvg1Var = (yvg1) obj;
                ContextTrack contextTrack = (ContextTrack) yvg1Var.a;
                String str5 = (String) yvg1Var.b;
                im0 im0Var = (im0) obj2;
                ip91 ip91Var = (ip91) im0Var.g;
                String strUid = contextTrack.uid();
                str5.getClass();
                return Flowable.e(ip91Var.c(strUid, str5).toFlowable(backpressureStrategy), ((jl3) ((k2q) im0Var.i).b).getState(), ((Flowable) im0Var.d).t(Functions.a), new vs10(contextTrack, b3));
            case 9:
                return sqg0.O((LinkedHashMap) obj2, (Map) obj);
            case 10:
                eww0 eww0Var = (eww0) ((nmr0) obj).b;
                String str6 = (String) ((vqb0) obj2).c;
                return eww0Var == null ? new x0x0(str6, str6, (String) null, true) : new x0x0(str6, eww0Var.b, eww0Var.f, false);
            case 11:
                return new uax0(j8x0.a((j8x0) obj, 0, (List) null, (String) null, false, false, ((w8x0) obj2).c.f, 0, 95));
            case 12:
                tzr0 tzr0Var = (tzr0) obj2;
                List<ArtistlistResponse.Artist> artistsList = ((ArtistlistResponse.ArtistList) obj).getArtistsList();
                ArrayList arrayList2 = new ArrayList(q7h.U(artistsList, 10));
                for (ArtistlistResponse.Artist artist : artistsList) {
                    artist.getClass();
                    arrayList2.add(new obx0(lbx0.a, artist.getUri(), artist.getName(), ((Activity) tzr0Var.b).getResources().getQuantityString(2131820864, artist.n(), Integer.valueOf(artist.n())), artist.getImageUrl(), (q730) null, (String) null, 4064));
                }
                return new j8x0(3, arrayList2, (String) null, false, 124);
            case 13:
                cqx0 cqx0Var = (cqx0) obj2;
                if (((Integer) obj).intValue() <= 2 && cqx0Var.d.e() > 0) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 19:
                qpz0 qpz0Var = (qpz0) obj2;
                return qpz0Var.c.e().flatMap(new vgq0(qpz0Var, (byte) 28));
            case 22:
                w111 w111Var = (w111) obj;
                cr6 cr6Var = (cr6) obj2;
                int iC = l1d.C(w111Var.b);
                if (iC == 0) {
                    return rqt0.F(igu.b, new m211(cr6Var, w111Var, (lnm) null, (byte) 0)).flatMapCompletable(new n0v0(cr6Var, (byte) 19)).w();
                }
                if (iC == 1) {
                    return rqt0.F(igu.b, new m211(cr6Var, w111Var, (lnm) null, (byte) 1)).flatMapCompletable(new bb01(cr6Var, (byte) 3)).w();
                }
                eg.o();
                return null;
            case 24:
                ytp0 ytp0Var = (ytp0) obj2;
                return ((Observable) ytp0Var.b).filter(xpv0.d).throttleFirst(1L, TimeUnit.SECONDS, (Scheduler) ytp0Var.e).switchMapCompletable(new bb01(ytp0Var, (byte) 5));
            case 25:
                PlayerState playerState2 = (PlayerState) obj;
                mi11 mi11Var = (mi11) obj2;
                Set set = mi11.i;
                Restrictions restrictions = playerState2.restrictions();
                if (x8p1.m(playerState2) == 1 && !restrictions.disallowTogglingRepeatTrackReasons().isEmpty()) {
                    return u890.j(restrictions.disallowTogglingRepeatTrackReasons(), mi11.i) ? new CompletableFromAction(new tt60(mi11Var, playerState2, (byte) 19)) : CompletableEmpty.a;
                }
                int iM = x8p1.m(playerState2);
                int iP = x8p1.p(iM, playerState2.restrictions());
                if (iM != iP) {
                    Completable completableIgnoreElement = mi11Var.b.setRepeatMode(iP).ignoreElement();
                    completableIgnoreElement.getClass();
                    return completableIgnoreElement;
                }
                CompletableEmpty completableEmpty = CompletableEmpty.a;
                completableEmpty.getClass();
                return completableEmpty;
            case 26:
                return ((mzr0) ((yx11) obj2).b).q(((hxd0) obj).a).b().map(h2x0.g).onErrorReturnItem(ayd0.a);
        }
    }

    public int b() {
        return ((a) this.b).getPaddingLeft();
    }

    public sks0 c() {
        return new sks0(this);
    }

    public void d(Object obj) {
        h141 h141Var = (h141) this.b;
        h141Var.e(xsv0.a((xsv0) obj, ((xsv0) h141Var.getState()).c));
    }

    public int e() {
        a aVar = (a) this.b;
        return aVar.O0 - aVar.getPaddingRight();
    }

    public View f(int i) {
        return ((a) this.b).H(i);
    }

    public int g(View view) {
        return a.P(view) + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).rightMargin;
    }

    public Object get() {
        return new DispatcherWorker(((haz0) this.b).d);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public ArrayList h(int i, String str, cvy0 cvy0Var, List list) throws NoWhenBranchMatchedException {
        String str2;
        int i2;
        String str3;
        PendingIntent pendingIntentQ;
        wmy wmyVar = (wmy) this.b;
        String str4 = cvy0Var.b;
        String str5 = cvy0Var.c;
        String str6 = cvy0Var.a;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            yez0 yez0Var = (yez0) it.next();
            try {
                int iA = x0d.A(yez0Var.a);
                String str7 = yez0Var.c;
                if (str7 == null) {
                    str7 = str;
                }
                switch (l1d.C(iA)) {
                    case 0:
                        int i3 = i;
                        AppLifecycleServicePendingIntent appLifecycleServicePendingIntent = AppLifecycleServicePendingIntent.OPEN_URL;
                        try {
                            String str8 = str7;
                            str3 = str6;
                            String str9 = str4;
                            str2 = str5;
                            try {
                                vjq0 vjq0Var = new vjq0(str3, i3, str2, str8, true, str9);
                                i2 = i3;
                                str4 = str9;
                                pendingIntentQ = wmyVar.q("OPEN_URL_INTENT_ACTION", appLifecycleServicePendingIntent, vjq0Var);
                                try {
                                    arrayList.add(new w0d(2131233418, pendingIntentQ, yez0Var.b).b());
                                } catch (ClassCastException | IllegalArgumentException unused) {
                                }
                            } catch (ClassCastException | IllegalArgumentException unused2) {
                                i2 = i3;
                                str4 = str9;
                            }
                        } catch (ClassCastException | IllegalArgumentException unused3) {
                            str2 = str5;
                            i2 = i3;
                            str3 = str6;
                        }
                        i = i2;
                        str6 = str3;
                        str5 = str2;
                        break;
                    case 1:
                        i2 = i;
                        pendingIntentQ = wmyVar.u(i2, str7, cvy0Var.a, cvy0Var.c, cvy0Var.b);
                        str2 = str5;
                        str3 = str6;
                        arrayList.add(new w0d(2131233418, pendingIntentQ, yez0Var.b).b());
                        i = i2;
                        str6 = str3;
                        str5 = str2;
                        break;
                    case 2:
                        i2 = i;
                        pendingIntentQ = wmyVar.q("SETTINGS_INTENT_ACTION", AppLifecycleServicePendingIntent.OPEN_PUSH_SETTINGS, new rjq0(str6, str5, i2, str4));
                        str2 = str5;
                        str3 = str6;
                        arrayList.add(new w0d(2131233418, pendingIntentQ, yez0Var.b).b());
                        i = i2;
                        str6 = str3;
                        str5 = str2;
                        break;
                    case 3:
                        i2 = i;
                        pendingIntentQ = wmyVar.K(i2, str7, cvy0Var.a, cvy0Var.c, cvy0Var.b);
                        str2 = str5;
                        str3 = str6;
                        arrayList.add(new w0d(2131233418, pendingIntentQ, yez0Var.b).b());
                        i = i2;
                        str6 = str3;
                        str5 = str2;
                        break;
                    case 4:
                        i2 = i;
                        pendingIntentQ = wmyVar.f(i2, str7, cvy0Var.a, cvy0Var.c, cvy0Var.b);
                        str2 = str5;
                        str3 = str6;
                        arrayList.add(new w0d(2131233418, pendingIntentQ, yez0Var.b).b());
                        i = i2;
                        str6 = str3;
                        str5 = str2;
                        break;
                    case 5:
                        int i4 = i;
                        AppLifecycleServicePendingIntent appLifecycleServicePendingIntent2 = AppLifecycleServicePendingIntent.ADD_TO_PLAYLIST;
                        try {
                            String str10 = str5;
                            String str11 = str6;
                            try {
                                sn1 sn1Var = new sn1(i4, str11, str10, str7, str4);
                                i2 = i4;
                                str6 = str11;
                                str5 = str10;
                                pendingIntentQ = wmyVar.q("ADD_TO_PLAYLIST_INTENT_ACTION", appLifecycleServicePendingIntent2, sn1Var);
                                str2 = str5;
                                str3 = str6;
                                arrayList.add(new w0d(2131233418, pendingIntentQ, yez0Var.b).b());
                            } catch (ClassCastException | IllegalArgumentException unused4) {
                                i2 = i4;
                                str6 = str11;
                                str5 = str10;
                                str2 = str5;
                                str3 = str6;
                            }
                        } catch (ClassCastException | IllegalArgumentException unused5) {
                            i2 = i4;
                        }
                        i = i2;
                        str6 = str3;
                        str5 = str2;
                        break;
                    case 6:
                        i2 = i;
                        pendingIntentQ = wmyVar.n(i2, str7, cvy0Var.a, cvy0Var.c, cvy0Var.b);
                        str2 = str5;
                        str3 = str6;
                        arrayList.add(new w0d(2131233418, pendingIntentQ, yez0Var.b).b());
                        i = i2;
                        str6 = str3;
                        str5 = str2;
                        break;
                    case 7:
                        i2 = i;
                        try {
                            pendingIntentQ = wmyVar.g(i2, str7, cvy0Var.a, cvy0Var.c, cvy0Var.b);
                            str2 = str5;
                            str3 = str6;
                            arrayList.add(new w0d(2131233418, pendingIntentQ, yez0Var.b).b());
                        } catch (ClassCastException | IllegalArgumentException unused6) {
                            str2 = str5;
                            str3 = str6;
                        }
                        i = i2;
                        str6 = str3;
                        str5 = str2;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            } catch (ClassCastException | IllegalArgumentException unused7) {
                str2 = str5;
                i2 = i;
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public Serializable i(String str, onm onmVar) {
        hx01 hx01Var;
        if (onmVar instanceof hx01) {
            hx01Var = (hx01) onmVar;
            int i = hx01Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                hx01Var.c = i - Integer.MIN_VALUE;
            } else {
                hx01Var = new hx01(this, onmVar);
            }
        } else {
            hx01Var = new hx01(this, onmVar);
        }
        Object objA = hx01Var.a;
        int i2 = hx01Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objA);
                mp40 mp40VarN = GetRecommendedQuizzesRequest.n();
                if (str != null) {
                    mp40VarN.n(str);
                }
                GetRecommendedQuizzesRequest getRecommendedQuizzesRequestBuild = mp40VarN.build();
                wy01 wy01Var = (wy01) this.b;
                getRecommendedQuizzesRequestBuild.getClass();
                hx01Var.c = 1;
                objA = wy01Var.a(getRecommendedQuizzesRequestBuild, hx01Var);
                d9n d9nVar = d9n.a;
                if (objA == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objA);
            }
            sy21 sy21Var = (sy21) objA;
            if (!sy21Var.a.Q0) {
                return new m231(new Exception("Failed to get recommended quizzes: HTTP " + sy21Var.a.d));
            }
            Object obj = sy21Var.b;
            if (obj == null) {
                throw new IllegalArgumentException("Response body is null");
            }
            h290<RecommendedQuiz> h290VarN = ((GetRecommendedQuizzesResponse) obj).n();
            ArrayList arrayList = new ArrayList(q7h.U(h290VarN, 10));
            for (RecommendedQuiz recommendedQuiz : h290VarN) {
                recommendedQuiz.getClass();
                arrayList.add(new t211(recommendedQuiz.n(), recommendedQuiz.r() ? recommendedQuiz.p() : null, recommendedQuiz.q() ? recommendedQuiz.o() : null));
            }
            return arrayList;
        } catch (Exception e) {
            return new m231(e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object j(String str, onm onmVar) {
        bc21 bc21Var;
        String str2;
        if (onmVar instanceof bc21) {
            bc21Var = (bc21) onmVar;
            int i = bc21Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                bc21Var.c = i - Integer.MIN_VALUE;
            } else {
                bc21Var = new bc21(this, onmVar);
            }
        } else {
            bc21Var = new bc21(this, onmVar);
        }
        Object objA = bc21Var.a;
        int i2 = bc21Var.c;
        if (i2 == 0) {
            hm5.M(objA);
            n2b0 n2b0Var = (n2b0) this.b;
            bc21Var.c = 1;
            objA = n2b0Var.a(str, ibg0.c, bc21Var);
            d9n d9nVar = d9n.a;
            if (objA == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objA);
        }
        int i3 = ((jbg0) objA).k;
        if (i3 == 1) {
            return objA;
        }
        if (i3 != 1) {
            str2 = i3 != 2 ? "null" : "DISABLED_ON_FAMILY_PLAN";
        } else {
            str2 = "ENABLED";
        }
        bhn0.f("Managed account is not eligible to stop management: ".concat(str2));
        return null;
    }

    public void k(Object obj, tqw tqwVar) {
        h141 h141Var = (h141) this.b;
        h141Var.e(xsv0.a((xsv0) h141Var.getState(), !((xsv0) h141Var.getState()).c));
    }

    public void l(kj81 kj81Var) {
        ((v280) ((i2i1) ((h0n1) this.b).a).b).c(kj81Var);
    }

    public void v(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 7:
                Set set = (Set) obj;
                set.getClass();
                MobiusLoop mobiusLoop = ((flv0) obj2).b;
                if (mobiusLoop != null) {
                    mobiusLoop.a(new tkv0(set));
                    return;
                } else {
                    u890.C("loop");
                    throw null;
                }
            case 14:
                cwx0 cwx0Var = (cwx0) obj;
                p1f0 p1f0Var = (p1f0) ((ytp0) obj2).d;
                ViewFlipper viewFlipper = (ViewFlipper) p1f0Var.h;
                if (cwx0Var instanceof awx0) {
                    ((TrackListView) p1f0Var.e).setContent(((awx0) cwx0Var).a);
                    p8p1.o(viewFlipper, (ConstraintLayout) p1f0Var.f);
                    return;
                } else if (cwx0Var instanceof bwx0) {
                    p8p1.o(viewFlipper, (ConstraintLayout) ((y441) p1f0Var.g).a);
                    return;
                } else {
                    eg.o();
                    return;
                }
            default:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                EditText editText = (EditText) ((sj21) obj2).a.d;
                editText.setVisibility(zBooleanValue ? 0 : 8);
                editText.setText("");
                return;
        }
    }

    public /* synthetic */ rut0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public void dispose() {
    }
}
