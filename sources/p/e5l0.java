package p;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.widget.EditText;
import com.spotify.betamax.offlinecoordinator.proto.OfflinePlugin;
import com.spotify.mobius.coroutines.DispatcherWorker;
import com.spotify.mobius.functions.Producer;
import com.spotify.musicquizservice.v1.CarouselScreen;
import com.spotify.musicquizservice.v1.GetLocalizedStringsRequest;
import com.spotify.musicquizservice.v1.GetLocalizedStringsResponse;
import com.spotify.musicquizservice.v1.GetOnboardingCarouselRequest;
import com.spotify.musicquizservice.v1.GetOnboardingCarouselResponse;
import com.spotify.musicquizservice.v1.GetQuizColorsRequest;
import com.spotify.musicquizservice.v1.GetQuizColorsResponse;
import com.spotify.musicquizservice.v1.GetSoundEffectsRequest;
import com.spotify.musicquizservice.v1.GetSoundEffectsResponse;
import com.spotify.musicquizservice.v1.LocalizedString;
import com.spotify.musicquizservice.v1.PageStrings;
import com.spotify.musicquizservice.v1.QuizColors;
import com.spotify.musicquizservice.v1.SoundEffect;
import com.spotify.musicquizservice.v1.SoundEffectInteraction;
import com.spotify.offline_esperanto.proto.EsOffline$DownloadRequest;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.ContextTrack$Metadata;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.completable.CompletableSubscribeOn;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableDistinctUntilChanged;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import spotify.your_library.esperanto.proto.YourLibraryRequest;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class e5l0 implements Producer, Function, qiw, lzy, hp80, Predicate, BiFunction {
    public final /* synthetic */ byte a;
    public final Object b;

    public e5l0(boolean z, boolean z2, jd2 jd2Var) {
        this.a = (byte) 24;
        smc0 smc0VarN = k4p1.n();
        if (z || z2) {
            smc0VarN.add(jd2Var);
        }
        this.b = k4p1.k(smc0VarN);
    }

    public static TextPaint c(Context context) {
        TextPaint textPaint = new TextPaint();
        textPaint.setStyle(Paint.Style.FILL);
        textPaint.setColor(context.getColor(2131102509));
        Typeface typefaceK = x74.K(context, 2131296274, 1);
        if (typefaceK == null) {
            typefaceK = Typeface.create(qx21.b(context, 2131296274), 0);
        }
        textPaint.setTypeface(typefaceK);
        textPaint.setFlags(textPaint.getFlags() | 1);
        return textPaint;
    }

    public static String j(LinkedHashMap linkedHashMap, rdh1 rdh1Var) {
        String str = (String) linkedHashMap.get(rdh1Var);
        if (str != null) {
            return str;
        }
        bhn0.A(rdh1Var, "Missing required string: ");
        return null;
    }

    public static ArrayList l(GetOnboardingCarouselResponse getOnboardingCarouselResponse) {
        h290<CarouselScreen> h290VarN = getOnboardingCarouselResponse.n();
        ArrayList arrayList = new ArrayList(q7h.U(h290VarN, 10));
        for (CarouselScreen carouselScreen : h290VarN) {
            carouselScreen.getClass();
            arrayList.add(new b0e(carouselScreen.getTitle(), carouselScreen.getSubtitle(), carouselScreen.o(), carouselScreen.n()));
        }
        return arrayList;
    }

    public static ArrayList m(GetSoundEffectsResponse getSoundEffectsResponse) {
        fw80 fw80Var;
        h290<SoundEffectInteraction> h290VarN = getSoundEffectsResponse.n();
        ArrayList arrayList = new ArrayList();
        for (SoundEffectInteraction soundEffectInteraction : h290VarN) {
            soundEffectInteraction.getClass();
            tja1 tja1Var = null;
            switch (soundEffectInteraction.n()) {
                case INTERACTION_TYPE_UNSPECIFIED:
                case UNRECOGNIZED:
                    fw80Var = null;
                    break;
                case ANSWER_BUTTON_ENTRY:
                    fw80Var = fw80.a;
                    break;
                case TIMER_ENTRY:
                    fw80Var = fw80.b;
                    break;
                case BUTTON_TAP:
                    fw80Var = fw80.c;
                    break;
                case CORRECT_ANSWER:
                    fw80Var = fw80.d;
                    break;
                case INCORRECT_ANSWER:
                    fw80Var = fw80.e;
                    break;
                case NEXT_BUTTON:
                    fw80Var = fw80.f;
                    break;
                case QUIZ_COMPLETE:
                    fw80Var = fw80.g;
                    break;
                default:
                    eg.o();
                    return null;
            }
            if (fw80Var != null) {
                SoundEffect soundEffectO = soundEffectInteraction.o();
                tja1Var = new tja1(fw80Var, new oja1(soundEffectO.q(), soundEffectO.r(), soundEffectO.p(), ((double) soundEffectO.o()) / 1000.0d));
            }
            if (tja1Var != null) {
                arrayList.add(tja1Var);
            }
        }
        return arrayList;
    }

    public static ilz0 n(GetLocalizedStringsResponse getLocalizedStringsResponse) {
        h290<LocalizedString> h290VarO;
        h290<LocalizedString> h290VarO2;
        h290<LocalizedString> h290VarO3;
        h290<LocalizedString> h290VarO4;
        h290<LocalizedString> h290VarO5;
        h290<LocalizedString> h290VarO6;
        List pagesList = getLocalizedStringsResponse.getPagesList();
        int iS = zno1.s(q7h.U(pagesList, 10));
        if (iS < 16) {
            iS = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
        for (Object obj : pagesList) {
            linkedHashMap.put(((PageStrings) obj).n(), obj);
        }
        PageStrings pageStrings = (PageStrings) linkedHashMap.get(g0r0.QUIZ_PAGE);
        if (pageStrings == null || (h290VarO = pageStrings.o()) == null) {
            eg.m("Missing QUIZ_PAGE strings");
            return null;
        }
        int iS2 = zno1.s(q7h.U(h290VarO, 10));
        if (iS2 < 16) {
            iS2 = 16;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iS2);
        for (LocalizedString localizedString : h290VarO) {
            linkedHashMap2.put(localizedString.n(), localizedString.getValue());
        }
        PageStrings pageStrings2 = (PageStrings) linkedHashMap.get(g0r0.CHALLENGE_PAGE);
        if (pageStrings2 == null || (h290VarO2 = pageStrings2.o()) == null) {
            eg.m("Missing CHALLENGE_PAGE strings");
            return null;
        }
        int iS3 = zno1.s(q7h.U(h290VarO2, 10));
        if (iS3 < 16) {
            iS3 = 16;
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(iS3);
        for (LocalizedString localizedString2 : h290VarO2) {
            linkedHashMap3.put(localizedString2.n(), localizedString2.getValue());
        }
        rdh1 rdh1Var = rdh1.PRIMARY_BUTTON;
        String strJ = j(linkedHashMap2, rdh1Var);
        String strJ2 = j(linkedHashMap3, rdh1Var);
        String strJ3 = j(linkedHashMap3, rdh1.PREHEADLINE);
        rdh1 rdh1Var2 = rdh1.EXPLANATION_TEXT;
        ra90 ra90Var = new ra90(strJ, strJ2, strJ3, j(linkedHashMap3, rdh1Var2));
        PageStrings pageStrings3 = (PageStrings) linkedHashMap.get(g0r0.Q_AND_A);
        if (pageStrings3 == null || (h290VarO3 = pageStrings3.o()) == null) {
            eg.m("Missing Q_AND_A page strings");
            return null;
        }
        int iS4 = zno1.s(q7h.U(h290VarO3, 10));
        if (iS4 < 16) {
            iS4 = 16;
        }
        LinkedHashMap linkedHashMap4 = new LinkedHashMap(iS4);
        for (LocalizedString localizedString3 : h290VarO3) {
            linkedHashMap4.put(localizedString3.n(), localizedString3.getValue());
        }
        uyy0 uyy0Var = new uyy0(j(linkedHashMap4, rdh1.OTHER), j(linkedHashMap4, rdh1Var), j(linkedHashMap4, rdh1.MARKER), j(linkedHashMap4, rdh1.SUB_MARKER), j(linkedHashMap4, rdh1.POSITIVE_MESSAGE), j(linkedHashMap4, rdh1.NEGATIVE_MESSAGE), j(linkedHashMap4, rdh1.COMPLETION_BUTTON));
        PageStrings pageStrings4 = (PageStrings) linkedHashMap.get(g0r0.ROUND_ERROR);
        if (pageStrings4 == null || (h290VarO4 = pageStrings4.o()) == null) {
            eg.m("Missing ROUND_ERROR page strings");
            return null;
        }
        int iS5 = zno1.s(q7h.U(h290VarO4, 10));
        if (iS5 < 16) {
            iS5 = 16;
        }
        LinkedHashMap linkedHashMap5 = new LinkedHashMap(iS5);
        for (LocalizedString localizedString4 : h290VarO4) {
            linkedHashMap5.put(localizedString4.n(), localizedString4.getValue());
        }
        wp31 wp31Var = new wp31(j(linkedHashMap5, rdh1Var), j(linkedHashMap5, rdh1Var2));
        PageStrings pageStrings5 = (PageStrings) linkedHashMap.get(g0r0.RESULTS_PAGE_SOLO);
        if (pageStrings5 == null || (h290VarO5 = pageStrings5.o()) == null) {
            eg.m("Missing RESULTS_PAGE_SOLO strings");
            return null;
        }
        int iS6 = zno1.s(q7h.U(h290VarO5, 10));
        if (iS6 < 16) {
            iS6 = 16;
        }
        LinkedHashMap linkedHashMap6 = new LinkedHashMap(iS6);
        for (LocalizedString localizedString5 : h290VarO5) {
            linkedHashMap6.put(localizedString5.n(), localizedString5.getValue());
        }
        PageStrings pageStrings6 = (PageStrings) linkedHashMap.get(g0r0.CHALLENGE_RESULT);
        if (pageStrings6 == null || (h290VarO6 = pageStrings6.o()) == null) {
            eg.m("Missing CHALLENGE_RESULT strings");
            return null;
        }
        int iS7 = zno1.s(q7h.U(h290VarO6, 10));
        LinkedHashMap linkedHashMap7 = new LinkedHashMap(iS7 >= 16 ? iS7 : 16);
        for (LocalizedString localizedString6 : h290VarO6) {
            linkedHashMap7.put(localizedString6.n(), localizedString6.getValue());
        }
        String strJ4 = j(linkedHashMap6, rdh1Var);
        rdh1 rdh1Var3 = rdh1.SECONDARY_BUTTON;
        return new ilz0(ra90Var, uyy0Var, wp31Var, new f631(strJ4, j(linkedHashMap6, rdh1Var3), j(linkedHashMap7, rdh1Var), j(linkedHashMap7, rdh1Var3), j(linkedHashMap6, rdh1.SHARE_TEXT), j(linkedHashMap6, rdh1.COMPLETION_TIME_LABEL)));
    }

    public mr20 a() {
        FlowableDistinctUntilChanged flowableDistinctUntilChanged = (FlowableDistinctUntilChanged) this.b;
        vbm[] vbmVarArr = q601.a;
        return new kge(flowableDistinctUntilChanged);
    }

    public Object apply(Object obj) {
        k560 k560Var;
        z6x z6xVarSingletonList;
        ArrayList arrayListB;
        Single singleOnErrorReturnItem;
        Boolean m231Var;
        z6x arrayList;
        byte b = this.a;
        z6x z6xVarJ0 = z6x.a;
        Object obj2 = this.b;
        switch (b) {
            case 5:
                v1o0 v1o0Var = (v1o0) obj2;
                return v1o0Var.d.b(v1o0Var.f, (String) obj);
            case 9:
                List<ContextTrack> list = (List) obj;
                ArrayList arrayList2 = new ArrayList();
                for (ContextTrack contextTrack : list) {
                    r7h.W(p7h.M(new String[]{l4o1.b0(contextTrack), contextTrack.uri()}), arrayList2);
                }
                List listJ0 = o7h.j0(arrayList2);
                ArrayList arrayList3 = new ArrayList(q7h.U(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList3.add(l4o1.b0((ContextTrack) it.next()));
                }
                List listJ1 = o7h.j0(arrayList3);
                if (((qzo0) obj2).Z.a) {
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj3 : list) {
                        if (l4o1.a0((ContextTrack) obj3, ContextTrack$Metadata.KEY_POINTER_URI) == null) {
                            arrayList4.add(obj3);
                        }
                    }
                    ArrayList arrayList5 = new ArrayList(q7h.U(arrayList4, 10));
                    Iterator it2 = arrayList4.iterator();
                    while (it2.hasNext()) {
                        arrayList5.add(l4o1.b0((ContextTrack) it2.next()));
                    }
                    z6xVarJ0 = o7h.j0(arrayList5);
                }
                ArrayList arrayList6 = new ArrayList();
                for (Object obj4 : list) {
                    if (l4o1.U((ContextTrack) obj4)) {
                        arrayList6.add(obj4);
                    }
                }
                ArrayList arrayList7 = new ArrayList();
                Iterator it3 = arrayList6.iterator();
                while (it3.hasNext()) {
                    String strA0 = l4o1.a0((ContextTrack) it3.next(), ContextTrack$Metadata.KEY_POINTER_URI);
                    if (strA0 != null) {
                        arrayList7.add(strA0);
                    }
                }
                return new kzo0(listJ0, listJ1, z6xVarJ0, o7h.j0(arrayList7));
            case 12:
                n23 n23Var = (n23) obj;
                return ((c23) ((zd1) obj2).b).g(0L, n23Var.a, n23Var.b).distinctUntilChanged();
            case 13:
                ob0 ob0Var = (tb0) obj;
                gjp0 gjp0Var = (gjp0) obj2;
                if (!(ob0Var instanceof rb0)) {
                    if (ob0Var.equals(pb0.a)) {
                        Observable observableJust = Observable.just(lsy0.a);
                        observableJust.getClass();
                        return observableJust;
                    }
                    if (!ob0Var.equals(qb0.a)) {
                        eg.o();
                        return null;
                    }
                    Observable observableJust2 = Observable.just(osy0.a);
                    observableJust2.getClass();
                    return observableJust2;
                }
                vip0 vip0Var = gjp0Var.c;
                ob0 ob0Var2 = (rb0) ob0Var;
                if (ob0Var2 instanceof ob0) {
                    k560Var = ob0Var2.a;
                } else {
                    if (!(ob0Var2 instanceof sb0)) {
                        eg.o();
                        return null;
                    }
                    k560Var = ((sb0) ob0Var2).a;
                }
                Observable observableSwitchMap = ((Observable) vip0Var.invoke(k560Var)).switchMap(new rok0(gjp0Var, ob0Var, (byte) 20));
                observableSwitchMap.getClass();
                return observableSwitchMap;
            case 14:
                OfflinePlugin.PluginCommand pluginCommand = (OfflinePlugin.PluginCommand) obj;
                kl1 kl1Var = (kl1) obj2;
                int iO = pluginCommand.o();
                int i = iO == 0 ? -1 : qqp0.a[l1d.C(iO)];
                if (i == -1) {
                    z6xVarSingletonList = z6xVarJ0;
                } else {
                    if (i == 1) {
                        h290 h290VarO = pluginCommand.q().o();
                        arrayList = new ArrayList(q7h.U(h290VarO, 10));
                        Iterator it4 = h290VarO.iterator();
                        while (it4.hasNext()) {
                            arrayList.add(((OfflinePlugin.IdentifyCommand.Query) it4.next()).getLink());
                        }
                    } else if (i == 2) {
                        z6xVarSingletonList = Collections.singletonList(pluginCommand.p().getLink());
                    } else if (i == 3) {
                        h290 h290VarO2 = pluginCommand.r().o();
                        arrayList = new ArrayList(q7h.U(h290VarO2, 10));
                        Iterator it5 = h290VarO2.iterator();
                        while (it5.hasNext()) {
                            arrayList.add(((OfflinePlugin.RemoveCommand.Query) it5.next()).getLink());
                        }
                    } else if (i != 4) {
                        if (i != 5) {
                            eg.o();
                            return null;
                        }
                        z6xVarSingletonList = z6xVarJ0;
                    } else {
                        z6xVarSingletonList = Collections.singletonList(pluginCommand.s().getLink());
                    }
                    z6xVarSingletonList = arrayList;
                }
                if (z6xVarSingletonList.isEmpty()) {
                    return Single.just(new lvp0(pluginCommand, z6xVarJ0));
                }
                ArrayList arrayList8 = new ArrayList();
                ArrayList arrayList9 = new ArrayList();
                for (Object obj5 : (Iterable) z6xVarSingletonList) {
                    try {
                        m231Var = Boolean.valueOf(new y6b1((String) obj5, false).c == v6b1.I1);
                    } catch (Throwable th) {
                        m231Var = new m231(th);
                    }
                    Boolean bool = Boolean.FALSE;
                    if (m231Var instanceof m231) {
                        m231Var = bool;
                    }
                    if (m231Var.booleanValue()) {
                        arrayList8.add(obj5);
                    } else {
                        arrayList9.add(obj5);
                    }
                    break;
                }
                boolean z = kl1Var.a;
                if (!arrayList8.isEmpty() || z) {
                    Single map = ((uu00) kl1Var.c).b(new oi("betamax-offline", false, new c30(arrayList8, z, arrayList9, (byte) 27))).filter(f610.T0).firstOrError().map(new hr8(arrayList8, z, arrayList9, pluginCommand, (byte) 5));
                    ArrayList arrayListB2 = rqp0.b(arrayList8);
                    if (z) {
                        arrayListB = new ArrayList(q7h.U(arrayList9, 10));
                        Iterator it6 = arrayList9.iterator();
                        while (it6.hasNext()) {
                            arrayListB.add(new aqp0((String) it6.next(), (String) null));
                        }
                    } else {
                        arrayListB = rqp0.b(arrayList9);
                    }
                    singleOnErrorReturnItem = map.onErrorReturnItem(new lvp0(pluginCommand, o7h.N0(arrayListB, arrayListB2)));
                } else {
                    singleOnErrorReturnItem = Single.just(new lvp0(pluginCommand, rqp0.b(arrayList9)));
                }
                return singleOnErrorReturnItem;
            case 15:
                YourLibraryRequest yourLibraryRequest = (YourLibraryRequest) obj;
                mwm1 mwm1Var = ((jtp0) obj2).a;
                yourLibraryRequest.getClass();
                return mwm1Var.b(yourLibraryRequest);
            case 16:
                Map map2 = (Map) obj;
                bxp0 bxp0Var = (bxp0) obj2;
                ywp ywpVar = bxp0Var.c;
                if (!yto.j((String) map2.get("employee"))) {
                    return Observable.empty();
                }
                if (!bxp0.a(map2) || !((dma1) ywpVar.get()).h(bxp0.f, false)) {
                    if (bxp0.a(map2)) {
                        return bxp0Var.b();
                    }
                    return (!yto.j((String) map2.get("employee")) || u890.j(map2.get("employee-free-opt-in"), "0")) ? Observable.empty() : Observable.fromCallable(new sra(bxp0Var, (byte) 11));
                }
                Set setA = ((dma1) ywpVar.get()).a(bxp0.g);
                if (setA.isEmpty()) {
                    bxp0Var.c(false);
                    return bxp0Var.b();
                }
                Set<String> set = setA;
                ArrayList arrayList10 = new ArrayList(q7h.U(set, 10));
                for (String str : set) {
                    vpp0 vpp0Var = ((byp0) bxp0Var.b.get()).a;
                    toz tozVarO = EsOffline$DownloadRequest.o();
                    tozVarO.r(str);
                    arrayList10.add(vpp0Var.a((EsOffline$DownloadRequest) tozVarO.build()).flatMapCompletable(ta20.U0));
                }
                CompletableSubscribeOn completableSubscribeOnS = Completable.l(arrayList10).s((Scheduler) bxp0Var.d.get());
                lrj0 lrj0Var = new lrj0(setA, (byte) 29);
                Consumer consumer = Functions.d;
                Action action = Functions.c;
                return completableSubscribeOnS.i(lrj0Var, consumer, action, action, action, action).g(new tt60(bxp0Var, setA, (byte) 10)).d(bxp0Var.b());
            case 20:
                return new xxz(4, ((lbw) obj2).a, (String) null, (Throwable) obj);
            case 26:
                PlayerState playerState = (PlayerState) obj;
                String str2 = (String) ((ContextTrack) playerState.track().b()).metadata().get(ContextTrack$Metadata.KEY_SAVE_TRACK_URI);
                return str2 != null ? g7h.d((g7h) obj2, playerState.contextUri(), new String[]{str2}).map(new rs4(playerState, (byte) 1)).distinctUntilChanged().toFlowable(BackpressureStrategy.d) : Flowable.I(new mmr0(playerState, (Object) null));
            default:
                Long l = (Long) ((spq0) obj).h();
                if (l != null) {
                    return new jmh((int) (l.longValue() / 1000), (int) (((Number) ((PlayerState) obj2).duration().e(-1000L)).longValue() / 1000));
                }
                return imh.a;
        }
    }

    public fp80 b() {
        return (fp80) this.b;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public Object d(String str, onm onmVar) {
        l7n0 l7n0Var;
        if (onmVar instanceof l7n0) {
            l7n0Var = (l7n0) onmVar;
            int i = l7n0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                l7n0Var.c = i - Integer.MIN_VALUE;
            } else {
                l7n0Var = new l7n0(this, onmVar);
            }
        } else {
            l7n0Var = new l7n0(this, onmVar);
        }
        Object objB = l7n0Var.a;
        int i2 = l7n0Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objB);
                fo40 fo40VarN = GetLocalizedStringsRequest.n();
                fo40VarN.n(str);
                GetLocalizedStringsRequest getLocalizedStringsRequest = (GetLocalizedStringsRequest) fo40VarN.build();
                p7n0 p7n0Var = (p7n0) this.b;
                getLocalizedStringsRequest.getClass();
                l7n0Var.c = 1;
                objB = p7n0Var.b(getLocalizedStringsRequest, l7n0Var);
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
            sy21 sy21Var = (sy21) objB;
            if (sy21Var.a.Q0) {
                Object obj = sy21Var.b;
                if (obj != null) {
                    return n((GetLocalizedStringsResponse) obj);
                }
                throw new IllegalArgumentException("Response body is null");
            }
            return new m231(new Exception("Failed to get localized strings: HTTP " + sy21Var.a.d));
        } catch (Exception e) {
            return new m231(e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public Serializable e(String str, onm onmVar) {
        m7n0 m7n0Var;
        if (onmVar instanceof m7n0) {
            m7n0Var = (m7n0) onmVar;
            int i = m7n0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                m7n0Var.c = i - Integer.MIN_VALUE;
            } else {
                m7n0Var = new m7n0(this, onmVar);
            }
        } else {
            m7n0Var = new m7n0(this, onmVar);
        }
        Object objA = m7n0Var.a;
        int i2 = m7n0Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objA);
                mo40 mo40VarN = GetOnboardingCarouselRequest.n();
                if (str != null) {
                    mo40VarN.n(str);
                }
                GetOnboardingCarouselRequest getOnboardingCarouselRequest = (GetOnboardingCarouselRequest) mo40VarN.build();
                p7n0 p7n0Var = (p7n0) this.b;
                getOnboardingCarouselRequest.getClass();
                m7n0Var.c = 1;
                objA = p7n0Var.a(getOnboardingCarouselRequest, m7n0Var);
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
            if (sy21Var.a.Q0) {
                Object obj = sy21Var.b;
                if (obj != null) {
                    return l((GetOnboardingCarouselResponse) obj);
                }
                throw new IllegalArgumentException("Response body is null");
            }
            return new m231(new Exception("Failed to get onboarding carousel: HTTP " + sy21Var.a.d));
        } catch (Exception e) {
            return new m231(e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public Object f(String str, onm onmVar) {
        n7n0 n7n0Var;
        if (onmVar instanceof n7n0) {
            n7n0Var = (n7n0) onmVar;
            int i = n7n0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                n7n0Var.c = i - Integer.MIN_VALUE;
            } else {
                n7n0Var = new n7n0(this, onmVar);
            }
        } else {
            n7n0Var = new n7n0(this, onmVar);
        }
        Object objC = n7n0Var.a;
        int i2 = n7n0Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objC);
                dp40 dp40VarN = GetQuizColorsRequest.n();
                if (str != null) {
                    dp40VarN.n(str);
                }
                GetQuizColorsRequest getQuizColorsRequest = (GetQuizColorsRequest) dp40VarN.build();
                p7n0 p7n0Var = (p7n0) this.b;
                getQuizColorsRequest.getClass();
                n7n0Var.c = 1;
                objC = p7n0Var.c(getQuizColorsRequest, n7n0Var);
                d9n d9nVar = d9n.a;
                if (objC == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objC);
            }
            sy21 sy21Var = (sy21) objC;
            if (!sy21Var.a.Q0) {
                return new m231(new Exception("Failed to get quiz colors: HTTP " + sy21Var.a.d));
            }
            Object obj = sy21Var.b;
            if (obj == null) {
                throw new IllegalArgumentException("Response body is null");
            }
            QuizColors quizColorsN = ((GetQuizColorsResponse) obj).n();
            return new ehz0(quizColorsN.q(), quizColorsN.r(), quizColorsN.u(), quizColorsN.t(), quizColorsN.v(), quizColorsN.n(), quizColorsN.o(), quizColorsN.p());
        } catch (Exception e) {
            return new m231(e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public Serializable g(String str, onm onmVar) {
        o7n0 o7n0Var;
        if (onmVar instanceof o7n0) {
            o7n0Var = (o7n0) onmVar;
            int i = o7n0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                o7n0Var.c = i - Integer.MIN_VALUE;
            } else {
                o7n0Var = new o7n0(this, onmVar);
            }
        } else {
            o7n0Var = new o7n0(this, onmVar);
        }
        Object objD = o7n0Var.a;
        int i2 = o7n0Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objD);
                fq40 fq40VarN = GetSoundEffectsRequest.n();
                fq40VarN.n(str);
                GetSoundEffectsRequest getSoundEffectsRequest = (GetSoundEffectsRequest) fq40VarN.build();
                p7n0 p7n0Var = (p7n0) this.b;
                getSoundEffectsRequest.getClass();
                o7n0Var.c = 1;
                objD = p7n0Var.d(getSoundEffectsRequest, o7n0Var);
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
            sy21 sy21Var = (sy21) objD;
            if (sy21Var.a.Q0) {
                Object obj = sy21Var.b;
                if (obj != null) {
                    return m((GetSoundEffectsResponse) obj);
                }
                throw new IllegalArgumentException("Response body is null");
            }
            return new m231(new Exception("Failed to get sound effects: HTTP " + sy21Var.a.d));
        } catch (Exception e) {
            return new m231(e);
        }
    }

    public Object get() {
        return new DispatcherWorker(((m8m0) this.b).b);
    }

    public f5l0 h() {
        return new f5l0((r6h1) this.b);
    }

    public void i() {
        ((far0) this.b).b(-1);
    }

    public void k(int i) {
        wjs0 wjs0Var = (wjs0) this.b;
        if (vjs0.a[l1d.C(1)] != 1) {
            eg.o();
            return;
        }
        int iC = l1d.C(i);
        if (iC == 0) {
            t45 t45VarA = wjs0Var.a.a("eip_connection");
            t45VarA.h = "media-browser-service";
            wjs0Var.b = t45VarA;
            t45VarA.l("eip_connection", "media-browser-service", true);
            t45 t45Var = wjs0Var.b;
            if (t45Var != null) {
                t45Var.l("connecting_to_eip", "media-browser-service", true);
                return;
            }
            return;
        }
        if (iC == 1) {
            wjs0Var.a(2);
            return;
        }
        if (iC == 2) {
            wjs0Var.a(3);
            return;
        }
        if (iC == 3) {
            wjs0Var.a(4);
        } else if (iC == 4) {
            wjs0Var.a(5);
        } else {
            eg.o();
        }
    }

    public boolean test(Object obj) {
        PlayerState playerState = (PlayerState) obj;
        return ((lbu0) this.b).c.j(playerState.contextUri(), t2p1.m(playerState));
    }

    public void v(Object obj) {
        c1p0 c1p0Var;
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 10:
                Boolean bool = (Boolean) obj;
                j2p0 j2p0Var = (j2p0) obj2;
                b2p0 b2p0Var = j2p0Var.P0;
                if (b2p0Var == null || (c1p0Var = j2p0Var.O0) == null) {
                    return;
                }
                bool.getClass();
                c1p0Var.setGestureConfig(new v0p0(bool.booleanValue(), b2p0Var.b(), b2p0Var.c.getResources().getDimensionPixelSize(2131166766)));
                return;
            default:
                List list = (List) obj;
                b14 b14Var = (b14) obj2;
                ((iu30) b14Var.b).invoke(list);
                int i = 0;
                for (Object obj3 : (List) b14Var.e) {
                    int i2 = i + 1;
                    if (i < 0) {
                        p7h.T();
                        throw null;
                    }
                    EditText editText = (EditText) obj3;
                    if (list.size() > i && !u890.j(list.get(i), editText.getText().toString())) {
                        editText.setText((CharSequence) list.get(i));
                    }
                    i = i2;
                }
                return;
        }
    }

    public /* synthetic */ e5l0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public Object apply(Object obj, Object obj2) {
        return new dvf1(((Long) obj).longValue(), ((Long) this.b).longValue(), (String) obj2);
    }
}
