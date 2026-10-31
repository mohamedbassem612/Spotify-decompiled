package p;

import android.system.Os;
import android.util.SparseArray;
import android.view.ViewGroup;
import com.google.android.gms.tasks.Task;
import com.spotify.base.java.logging.Logger;
import com.spotify.externalintegration.ubi.UbiSpecificationId;
import com.spotify.initialization.app.EarlyInitializationProvider;
import com.spotify.kidsgraduation.v1.PostponeGraduationRequest;
import com.spotify.mobius.coroutines.DispatcherWorker;
import com.spotify.mobius.functions.Producer;
import com.spotify.nowplaying.scroll.ScrollCardType;
import com.spotify.player.esperanto.proto.EsCommandOptions;
import com.spotify.player.esperanto.proto.EsContext;
import com.spotify.player.esperanto.proto.EsLoggingParams;
import com.spotify.player.esperanto.proto.EsOptional;
import com.spotify.player.esperanto.proto.EsPlay;
import com.spotify.player.esperanto.proto.EsPlayOptions;
import com.spotify.player.esperanto.proto.EsPlayOrigin;
import com.spotify.player.esperanto.proto.EsPreparePlay;
import com.spotify.player.esperanto.proto.EsPreparePlayOptions;
import com.spotify.player.esperanto.proto.EsResponseWithReasons;
import com.spotify.player.esperanto.proto.EsSeekTo;
import com.spotify.player.esperanto.proto.EsSessionResponse;
import com.spotify.player.esperanto.proto.EsSkipToTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.profile.profilelist.datasource.PartialProfileListDataException;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.operators.completable.CompletableCreate;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeToSingle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import spotify.your_library.esperanto.proto.YourLibraryRequest;
import spotify.your_library.esperanto.proto.YourLibraryRequestHeader;
import spotify.your_library.proto.YourLibraryConfig;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class j3v implements Function, Producer, mkf1, BiFunction, lzy, i2q0, Predicate, lvh0, ird1 {
    public final /* synthetic */ byte a;
    public final Object b;

    /* JADX WARN: Multi-variable type inference failed */
    public j3v(tlu tluVar) {
        this.a = (byte) 18;
        j3r j3rVar = rzq.y;
        this.b = l2p1.f(new w1k(new l2r[]{tluVar}));
    }

    public mr20 a() {
        FlowableMap flowableMap = (FlowableMap) this.b;
        vbm[] vbmVarArr = q601.a;
        return new kge(flowableMap);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: p.u8h1 */
    public Object apply(Object obj) throws u8h1 {
        u8h1 linkedHashMap;
        Observable observableA;
        CompletableCreate completableCreateE;
        byte b = this.a;
        byte b2 = 16;
        int i = 0;
        u8h1 u8h1Var = null;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                gvm1 gvm1VarO = YourLibraryRequest.o();
                hvm1 hvm1VarQ = YourLibraryRequestHeader.q();
                hvm1VarQ.I((YourLibraryConfig.YourLibrarySortOrder) obj2);
                jsm1 jsm1VarR = YourLibraryConfig.YourLibraryFilters.r();
                jsm1VarR.q(ksm1.i);
                hvm1VarQ.u(jsm1VarR.build());
                hvm1VarQ.C(350);
                gvm1VarO.n(hvm1VarQ);
                gvm1VarO.s((YourLibraryConfig.YourLibraryPredefinedPlaylistConfigs) obj);
                return gvm1VarO.build();
            case 1:
                f7h f7hVar = (f7h) obj2;
                return ((Boolean) obj).booleanValue() ? Boolean.valueOf(f7hVar.c) : Boolean.valueOf(f7hVar.a);
            case 3:
                l841 l841Var = ((ynw) obj2).b;
                l841Var.getClass();
                return Observable.create(new h341(l841Var, (dk70) obj, (byte) 4));
            case 10:
                return rmy.a((rmy) obj, (kk3) obj2);
            case 11:
                muz muzVar = (muz) obj2;
                return new wuz(muzVar.a, muzVar.b, ((EsSessionResponse.SessionResponse) obj).getSessionId());
            case 13:
                chm0 chm0Var = (chm0) obj;
                tj00 tj00Var = (tj00) obj2;
                chm0Var.getClass();
                w25 w25Var = tj00Var.O0;
                ArrayList arrayListB = chm0Var.b();
                String str = chm0Var.f;
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : arrayListB) {
                    int i2 = i + 1;
                    if (i < 0) {
                        u8h1 u8h1Var2 = u8h1Var;
                        p7h.T();
                        throw u8h1Var2;
                    }
                    ee91 ee91Var = (jn60) obj3;
                    String strI = w25Var.i() ? xcg1.i(str, "|", ee91Var.f().b) : ee91Var.f().b;
                    String strPath = tj00Var.i.a.path();
                    String str2 = ee91Var.f().a;
                    y6h1 y6h1Var = y6h1.i;
                    x6h1 x6h1VarI = i3o1.i();
                    x6h1VarI.h = "music";
                    x6h1VarI.a = "mobile-home-evo";
                    x6h1VarI.f = "3.0.0";
                    x6h1VarI.g = "22.0.0";
                    x6h1VarI.b = strPath;
                    x6h1VarI.e = strI;
                    x6h1VarI.d = str2;
                    y6h1 y6h1VarA = x6h1VarI.a();
                    Collections.singletonList("home-funkis");
                    r6h1 r6h1Var = r6h1.c;
                    op80 h3h1Var = new h3h1(new cb1(new r6h1(kk0.l(y6h1VarA), u8h1Var), b2));
                    op80 k3h1Var = new k3h1(i);
                    op80 wchVar = q6x.b;
                    if (h3h1Var.equals(wchVar) && k3h1Var.equals(wchVar)) {
                        h3h1Var = wchVar;
                    } else if (h3h1Var.equals(wchVar)) {
                        h3h1Var = k3h1Var;
                    } else if (!k3h1Var.equals(wchVar)) {
                        wchVar = new wch(h3h1Var, k3h1Var);
                        h3h1Var = wchVar;
                    }
                    List<qq60> listA = ee91Var instanceof ee91 ? ee91Var.a(str, h3h1Var) : ee91Var.d(h3h1Var);
                    ArrayList arrayList2 = new ArrayList(q7h.U(listA, 10));
                    for (qq60 qq60Var : listA) {
                        arrayList2.add(new h8k1(qq60Var, w25Var.j0() ? qq60Var.getId() : qq60Var.getId() + "-" + ee91Var.f().b + "-" + i));
                        u8h1Var = u8h1Var;
                    }
                    r7h.W(arrayList2, arrayList);
                    i = i2;
                    b2 = 16;
                }
                u8h1 u8h1Var3 = u8h1Var;
                ioj0 ioj0Var = chm0Var.d;
                List list = chm0Var.e;
                u8h1 u8h1Var4 = ioj0Var != null ? ioj0Var.a : u8h1Var3;
                if (u8h1Var4 == null) {
                    u8h1Var4 = b7x.a;
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    Map map = ((osp0) it.next()).b;
                    ArrayList arrayList3 = new ArrayList(map.size());
                    for (Map.Entry entry : map.entrySet()) {
                        String str3 = (String) entry.getKey();
                        List<ez00> list2 = (List) entry.getValue();
                        int iS = zno1.s(q7h.U(list2, 10));
                        if (iS < 16) {
                            iS = 16;
                        }
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iS);
                        for (ez00 ez00Var : list2) {
                            linkedHashMap2.put(ez00Var.getClass(), new goj0(ez00Var));
                        }
                        arrayList3.add(new mmr0(str3, linkedHashMap2));
                    }
                    if (u8h1Var4.isEmpty()) {
                        linkedHashMap = sqg0.T(arrayList3);
                    } else {
                        linkedHashMap = new LinkedHashMap((Map) u8h1Var4);
                        sqg0.Q(linkedHashMap, arrayList3);
                    }
                    u8h1Var4 = linkedHashMap;
                }
                return new hj50(arrayList, new ioj0(u8h1Var4));
            case 14:
                uv00 uv00Var = (uv00) obj;
                Set setKeySet = ((wu00) obj2).a.keySet();
                int iS2 = zno1.s(q7h.U(setKeySet, 10));
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(iS2 >= 16 ? iS2 : 16);
                for (Object obj4 : setKeySet) {
                    List<tv00> listB = uv00Var.b((Class) obj4);
                    ArrayList arrayList4 = new ArrayList();
                    for (tv00 tv00Var : listB) {
                        ez00 ez00Var2 = tv00Var.b;
                        vu00 vu00Var = ez00Var2 != null ? new vu00(tv00Var.a, ez00Var2) : null;
                        if (vu00Var != null) {
                            arrayList4.add(vu00Var);
                        }
                    }
                    linkedHashMap3.put(obj4, arrayList4);
                }
                return new xu00(linkedHashMap3);
            case 16:
                r9c r9cVar = (r9c) obj;
                boolean z = r9cVar.h;
                c610 c610Var = (c610) obj2;
                UbiSpecificationId ubiSpecificationIdH = r9cVar.h();
                byte b3 = 12;
                if (ubiSpecificationIdH != UbiSpecificationId.UNKNOWN) {
                    c610Var.g.c(new r710(ubiSpecificationIdH, r9cVar.e(), (Integer) null, 12));
                }
                w310 w310VarF = c610Var.f(r9cVar);
                if (w310VarF == null) {
                    Logger.d("could not find a loader for browser params, " + r9cVar, new Object[0]);
                    observableA = Observable.just(new z310(z6x.a, (f410) null, (m510) null, (String) null));
                } else {
                    w310VarF.toString();
                    if (z) {
                        observableA = w310VarF.a(r9cVar).map(new mev(r9cVar, b3)).doOnNext(new a610(c610Var, r9cVar, (byte) 0)).doOnError(new a610(c610Var, r9cVar, (byte) 1));
                        observableA.getClass();
                    } else {
                        observableA = w310VarF.a(r9cVar);
                    }
                }
                if (!z) {
                    return observableA;
                }
                nkv nkvVar = c610Var.j;
                nkvVar.getClass();
                Observable observableCompose = observableA.compose(new bk1(nkvVar, (byte) 15));
                observableCompose.getClass();
                return observableCompose;
            case 19:
                eyo0 eyo0Var = (eyo0) obj;
                Maybe maybe = (Maybe) obj2;
                return maybe != null ? new MaybeToSingle(maybe.f(new mjv(eyo0Var, (byte) 14)), Collections.singletonList(eyo0Var)) : Single.just(Collections.singletonList(eyo0Var));
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                return Observable.error(new PartialProfileListDataException((j8x0) obj2, (Throwable) obj));
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                f0b0 f0b0Var = (f0b0) obj2;
                int iOrdinal = ((eew) obj).a.ordinal();
                if (iOrdinal == 0) {
                    ghv0 ghv0VarN = PostponeGraduationRequest.n();
                    ghv0VarN.n();
                    PostponeGraduationRequest postponeGraduationRequestBuild = ghv0VarN.build();
                    g0b0 g0b0Var = f0b0Var.a;
                    postponeGraduationRequestBuild.getClass();
                    completableCreateE = g0b0Var.e(postponeGraduationRequestBuild);
                } else {
                    if (iOrdinal != 1) {
                        eg.o();
                        return null;
                    }
                    completableCreateE = j2h1.D(igu.b, new m850(f0b0Var, (lnm) null, (byte) 0));
                }
                return completableCreateE.d(Observable.just(m000.e)).onErrorReturn(c710.e);
            case 26:
                pc90 pc90Var = (pc90) obj;
                dh30 dh30Var = (dh30) obj2;
                dhr0 dhr0Var = pc90Var.a;
                String str4 = (String) dh30Var.b;
                r2b r2bVar = pc90Var.c;
                return new yh50(dhr0Var, str4, r2bVar != null ? r2bVar.d : null, r2bVar != null ? r2bVar.c : null, r2bVar != null ? r2bVar.b : null, pc90Var.b, pc90Var.d, pc90Var.e, pc90Var.f, pc90Var.g, pc90Var.h, pc90Var.i, ((hf4) dh30Var.c).a(), false);
            default:
                f7h f7hVar2 = (f7h) ((Map) obj).get(((qd60) obj2).a);
                return Boolean.valueOf(f7hVar2 != null && f7hVar2.c);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object b(String str, Map map, boolean z, akb1 akb1Var, onm onmVar) {
        cvz cvzVar;
        if (onmVar instanceof cvz) {
            cvzVar = (cvz) onmVar;
            int i = cvzVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                cvzVar.c = i - Integer.MIN_VALUE;
            } else {
                cvzVar = new cvz(this, onmVar);
            }
        } else {
            cvzVar = new cvz(this, onmVar);
        }
        Object objU = cvzVar.a;
        int i2 = cvzVar.c;
        if (i2 == 0) {
            hm5.M(objU);
            jn7 jn7Var = (jn7) this.b;
            upz upzVarN = EsPlay.PlayRequest.n();
            jqz jqzVarN = EsPreparePlay.PreparePlayRequest.n();
            cmz cmzVarP = EsContext.Context.p();
            cmzVarP.t(str);
            cmzVarP.u("context://".concat(str));
            cmzVarP.q(map);
            jqzVarN.n(cmzVarP.build());
            zpz zpzVarY = EsPlayOrigin.PlayOrigin.y();
            zpzVarY.s("chromeless-webview");
            zpzVarY.w(str);
            zpzVarY.u("chromeless-webview");
            jqzVarN.r(zpzVarY.build());
            lqz lqzVarS = EsPreparePlayOptions.PreparePlayOptions.s();
            lqzVarS.s(true);
            if (z) {
                wrz wrzVarP = EsSkipToTrack.SkipToTrack.p();
                wrzVarP.t(str);
                lqzVarS.C(wrzVarP.build());
            }
            if (akb1Var != null) {
                long j = akb1Var.a;
                if (akb1Var.b) {
                    lqzVarS.A(String.valueOf(j));
                } else {
                    qpz qpzVarP = EsOptional.OptionalInt64.p();
                    qpzVarP.n(j);
                    lqzVarS.z(qpzVarP.build());
                }
            }
            jqzVarN.q(lqzVarS.build());
            upzVarN.r(jqzVarN.build());
            wpz wpzVarO = EsPlayOptions.PlayOptions.o();
            wpzVarO.q();
            wpzVarO.s();
            upzVarN.q(wpzVarO.build());
            upzVarN.n(EsLoggingParams.LoggingParams.p());
            EsPlay.PlayRequest playRequestBuild = upzVarN.build();
            cvzVar.c = 1;
            objU = jn7Var.U(playRequestBuild, cvzVar);
            d9n d9nVar = d9n.a;
            if (objU == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objU);
        }
        EsResponseWithReasons.ResponseWithReasons responseWithReasons = (EsResponseWithReasons.ResponseWithReasons) objU;
        if (responseWithReasons.n() == xqz.b) {
            return null;
        }
        return responseWithReasons.n() + " " + responseWithReasons.o();
    }

    public void c(mvh0 mvh0Var, gvh0 gvh0Var, Collection collection) {
        kv40 kv40Var = (kv40) this.b;
        if (mvh0Var != kv40Var.y || gvh0Var == null) {
            if (mvh0Var == kv40Var.e) {
                if (gvh0Var != null) {
                    kv40Var.p(kv40Var.d, gvh0Var);
                }
                lwh0 lwh0Var = kv40Var.d;
                lwh0Var.getClass();
                iwh0 iwh0Var = lwh0Var instanceof iwh0 ? (iwh0) lwh0Var : null;
                if (iwh0Var != null) {
                    iwh0Var.q(collection);
                    return;
                }
                return;
            }
            return;
        }
        kwh0 kwh0Var = kv40Var.x.a;
        String strG = gvh0Var.g();
        lwh0 iwh0Var2 = new iwh0(kwh0Var, strG, kv40Var.b(kwh0Var, strG));
        iwh0Var2.h(gvh0Var);
        if (kv40Var.d == iwh0Var2) {
            return;
        }
        mvh0 mvh0Var2 = kv40Var.y;
        int i = kv40Var.z;
        lwh0 lwh0Var2 = kv40Var.x;
        jwh0 jwh0Var = kv40Var.f;
        if (jwh0Var != null) {
            jwh0Var.a();
            kv40Var.f = null;
        }
        jwh0 jwh0Var2 = new jwh0(kv40Var, iwh0Var2, mvh0Var2, 3, i, true, lwh0Var2, collection);
        kv40Var.f = jwh0Var2;
        jwh0Var2.b();
        kv40Var.x = null;
        kv40Var.y = null;
        kv40Var.z = 0;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x009f  */
    /* JADX WARN: Code duplicated, block: B:26:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:34:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:36:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:37:0x013b  */
    /* JADX WARN: Code duplicated, block: B:40:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:42:0x01e3  */
    /* JADX WARN: Instruction removed from duplicated block: B:23:0x009f, please report this as an issue */
    public e711 d(ViewGroup viewGroup, Object obj, v1r0 v1r0Var, y3o0 y3o0Var) {
        ffe1 ffe1Var;
        Object next;
        b1x b1xVar;
        boolean z;
        Object objO;
        e441 e441Var;
        otu otuVar;
        dwp dwpVar;
        gzw gzwVar;
        otu otuVar2;
        tjq tjqVar;
        pzw pzwVar;
        gwp gwpVar;
        dtw dtwVarD;
        x390 x390Var;
        x2x x2xVar;
        q2x q2xVar = (q2x) this.b;
        rup rupVar = q2xVar.c;
        switch (rupVar.a) {
            case 0:
                ffe1Var = new ffe1((Flowable) ((jly0) ((c21) rupVar.b.d).e).get(), y3o0Var, (byte) 5);
                break;
            default:
                ffe1Var = new ffe1((Flowable) ((jly0) ((em0) rupVar.b.d).f).get(), y3o0Var, (byte) 5);
                break;
        }
        ffe1 ffe1Var2 = ffe1Var;
        tjq tjqVar2 = q2xVar.a;
        lud0 lud0Var = q2xVar.b;
        vrw vrwVar = vrw.X0;
        vi11 vi11Var = (vi11) lud0Var.b;
        n9b1 n9b1Var = new n9b1(viewGroup, (gw70) vi11Var.b, (d0r) vi11Var.c, (uym0) vi11Var.d, (et90) vi11Var.e, vrwVar, (sn4) vi11Var.f);
        q1x q1xVar = ((z1x) tjqVar2.b).p;
        fq0 fq0Var = q1xVar != null ? q1xVar.a.a : null;
        Iterator it = ((List) tjqVar2.c).iterator();
        do {
            if (it.hasNext()) {
                next = it.next();
            } else {
                next = null;
            }
            b1xVar = (b1x) next;
            if (b1xVar != null) {
                z = b1xVar.d();
            }
            objO = poz0.o(viewGroup, z);
            if (objO instanceof m231) {
                objO = null;
            }
            e441Var = (e441) objO;
            if (e441Var == null) {
                d1x.b((d1x) tjqVar2.e, 10, fq0Var, (Map) null, (String) null, 12);
                return n9b1Var;
            }
            otuVar = new otu((byte) 16);
            dwpVar = (dwp) tjqVar2.a;
            iac0 iac0VarH = x9p1.h(viewGroup);
            iac0VarH.getClass();
            gzwVar = new gzw(iac0VarH);
            switch (dwpVar.a) {
                case 0:
                    otuVar2 = otuVar;
                    tjqVar = tjqVar2;
                    nwp nwpVar = (nwp) dwpVar.b.c;
                    gw70 gw70VarA0 = nwpVar.a.a0();
                    c8o.l(gw70VarA0);
                    q8n q8nVar = (q8n) nwpVar.A.get();
                    f0x f0xVar = new f0x(nwpVar.d());
                    ewp ewpVar = (ewp) nwpVar.Q1.get();
                    List listK = nwpVar.k();
                    d1x d1xVarK = ((daq) nwpVar.a.b).a.k();
                    z1x z1xVar = (z1x) nwpVar.A1.get();
                    ti0 ti0Var = (ti0) ((daq) nwpVar.a.b).a.L1.get();
                    c8o.l(ti0Var);
                    pzwVar = new pzw(e441Var, gzwVar, ffe1Var2, otuVar2, gw70VarA0, q8nVar, f0xVar, ewpVar, listK, d1xVarK, z1xVar, ti0Var);
                    break;
                default:
                    thq thqVar = dwpVar.b;
                    daq daqVar = thqVar.b;
                    gw70 gw70Var = (gw70) daqVar.d8.get();
                    q8n q8nVar2 = (q8n) daqVar.r2.get();
                    v5q v5qVar = thqVar.c;
                    otuVar2 = otuVar;
                    tjqVar = tjqVar2;
                    pzwVar = new pzw(e441Var, gzwVar, ffe1Var2, otuVar2, gw70Var, q8nVar2, new f0x(v5qVar.f()), (ewp) v5qVar.Ia.get(), v5qVar.s(), daqVar.a.k(), (z1x) v5qVar.H4.get(), (ti0) daqVar.a.L1.get());
                    break;
            }
            gwpVar = (gwp) tjqVar.d;
            tka0 tka0Var = dtw.C;
            dtwVarD = mhc.d(viewGroup.getContext(), viewGroup, f6o1.A(pzwVar, (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), (drw) null, 24);
            x390Var = new x390(viewGroup);
            switch (gwpVar.a) {
                case 0:
                    nwp nwpVar2 = (nwp) gwpVar.b.c;
                    x2xVar = new x2x((z1x) nwpVar2.A1.get(), nwpVar2.d(), dtwVarD, otuVar2, x390Var, viewGroup, z);
                    break;
                default:
                    v5q v5qVar2 = gwpVar.b.c;
                    x2xVar = new x2x((z1x) v5qVar2.H4.get(), v5qVar2.f(), dtwVarD, otuVar2, x390Var, viewGroup, z);
                    break;
            }
            return x2xVar;
        } while (!(fq0Var != null ? ((b1x) next).b(fq0Var) : false));
        b1xVar = (b1x) next;
        if (b1xVar != null) {
            if (b1xVar.d()) {
            }
        }
        objO = poz0.o(viewGroup, z);
        if (objO instanceof m231) {
            objO = null;
        }
        e441Var = (e441) objO;
        if (e441Var == null) {
            d1x.b((d1x) tjqVar2.e, 10, fq0Var, (Map) null, (String) null, 12);
            return n9b1Var;
        }
        otuVar = new otu((byte) 16);
        dwpVar = (dwp) tjqVar2.a;
        iac0 iac0VarH2 = x9p1.h(viewGroup);
        iac0VarH2.getClass();
        gzwVar = new gzw(iac0VarH2);
        switch (dwpVar.a) {
            case 0:
                otuVar2 = otuVar;
                tjqVar = tjqVar2;
                nwp nwpVar3 = (nwp) dwpVar.b.c;
                gw70 gw70VarA1 = nwpVar3.a.a0();
                c8o.l(gw70VarA1);
                q8n q8nVar3 = (q8n) nwpVar3.A.get();
                f0x f0xVar2 = new f0x(nwpVar3.d());
                ewp ewpVar2 = (ewp) nwpVar3.Q1.get();
                List listK2 = nwpVar3.k();
                d1x d1xVarK2 = ((daq) nwpVar3.a.b).a.k();
                z1x z1xVar2 = (z1x) nwpVar3.A1.get();
                ti0 ti0Var2 = (ti0) ((daq) nwpVar3.a.b).a.L1.get();
                c8o.l(ti0Var2);
                pzwVar = new pzw(e441Var, gzwVar, ffe1Var2, otuVar2, gw70VarA1, q8nVar3, f0xVar2, ewpVar2, listK2, d1xVarK2, z1xVar2, ti0Var2);
                break;
            default:
                thq thqVar2 = dwpVar.b;
                daq daqVar2 = thqVar2.b;
                gw70 gw70Var2 = (gw70) daqVar2.d8.get();
                q8n q8nVar4 = (q8n) daqVar2.r2.get();
                v5q v5qVar3 = thqVar2.c;
                otuVar2 = otuVar;
                tjqVar = tjqVar2;
                pzwVar = new pzw(e441Var, gzwVar, ffe1Var2, otuVar2, gw70Var2, q8nVar4, new f0x(v5qVar3.f()), (ewp) v5qVar3.Ia.get(), v5qVar3.s(), daqVar2.a.k(), (z1x) v5qVar3.H4.get(), (ti0) daqVar2.a.L1.get());
                break;
        }
        gwpVar = (gwp) tjqVar.d;
        tka0 tka0Var2 = dtw.C;
        dtwVarD = mhc.d(viewGroup.getContext(), viewGroup, f6o1.A(pzwVar, (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), (drw) null, 24);
        x390Var = new x390(viewGroup);
        switch (gwpVar.a) {
            case 0:
                nwp nwpVar4 = (nwp) gwpVar.b.c;
                x2xVar = new x2x((z1x) nwpVar4.A1.get(), nwpVar4.d(), dtwVarD, otuVar2, x390Var, viewGroup, z);
                break;
            default:
                v5q v5qVar4 = gwpVar.b.c;
                x2xVar = new x2x((z1x) v5qVar4.H4.get(), v5qVar4.f(), dtwVarD, otuVar2, x390Var, viewGroup, z);
                break;
        }
        return x2xVar;
    }

    public Object e(akb1 akb1Var, pag pagVar) {
        jn7 jn7Var = (jn7) this.b;
        erz erzVarN = EsSeekTo.SeekToRequest.n();
        tlz tlzVarN = EsCommandOptions.CommandOptions.n();
        tlzVarN.s(false);
        erzVarN.r(tlzVarN.build());
        boolean z = akb1Var.b;
        long j = akb1Var.a;
        if (z) {
            qpz qpzVarP = EsOptional.OptionalInt64.p();
            qpzVarP.n(j);
            erzVarN.n(qpzVarP.build());
        } else {
            erzVarN.s(j);
        }
        Object objK0 = jn7Var.k0(erzVarN.build(), pagVar);
        return objK0 == d9n.a ? objK0 : rih1.a;
    }

    public void f(Runnable runnable, String str) {
        boolean zIsTerminated;
        boolean zIsTerminated2;
        Object obj = l6x.a;
        TimeUnit timeUnit = TimeUnit.DAYS;
        mjs0 mjs0Var = uif1.a;
        u1c u1cVar = mjs0Var.b;
        if (Boolean.FALSE.booleanValue()) {
            esw0 esw0Var = mjs0Var.c;
            Thread threadCurrentThread = Thread.currentThread();
            long id = threadCurrentThread.getId();
            za91 za91VarC = esw0Var.e;
            za91 za91Var = esw0Var.f;
            if (za91VarC == null || ((rge1) za91VarC).d != id) {
                if (za91Var == null || ((rge1) za91Var).d != id) {
                    za91VarC = esw0Var.c(id, Os.gettid(), threadCurrentThread.getName());
                    esw0Var.f = esw0Var.e;
                    esw0Var.e = za91VarC;
                } else {
                    za91VarC = za91Var;
                }
            }
            za91VarC.c.getClass();
            za91VarC.c.getClass();
            zf30 zf30Var = (zf30) this.b;
            zf30Var.f0();
            int i = zf30Var.Y0;
            if (i != 0) {
                Integer.toHexString(i);
            }
        }
        boolean z = false;
        try {
            runnable.run();
            if (obj instanceof AutoCloseable) {
                return;
            }
            if (!(obj instanceof ExecutorService)) {
                bhn0.q();
                return;
            }
            ExecutorService executorService = (ExecutorService) obj;
            if (executorService == ForkJoinPool.commonPool() || (zIsTerminated2 = executorService.isTerminated())) {
                return;
            }
            executorService.shutdown();
            while (!zIsTerminated2) {
                try {
                    zIsTerminated2 = executorService.awaitTermination(1L, timeUnit);
                } catch (InterruptedException unused) {
                    if (!z) {
                        executorService.shutdownNow();
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        } catch (Throwable th) {
            try {
                str.concat(".exception");
                i9p1.B(mjs0Var, th);
                throw null;
            } catch (Throwable th2) {
                if (obj instanceof AutoCloseable) {
                    throw th2;
                }
                if (!(obj instanceof ExecutorService)) {
                    bhn0.q();
                    return;
                }
                ExecutorService executorService2 = (ExecutorService) obj;
                if (executorService2 == ForkJoinPool.commonPool() || (zIsTerminated = executorService2.isTerminated())) {
                    throw th2;
                }
                executorService2.shutdown();
                while (!zIsTerminated) {
                    try {
                        zIsTerminated = executorService2.awaitTermination(1L, timeUnit);
                    } catch (InterruptedException unused2) {
                        if (!z) {
                            executorService2.shutdownNow();
                            z = true;
                        }
                    }
                }
                if (!z) {
                    throw th2;
                }
                Thread.currentThread().interrupt();
                throw th2;
            }
        }
    }

    public void g(SparseArray sparseArray) {
        sparseArray.getClass();
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            int iKeyAt = sparseArray.keyAt(i);
            n570 n570Var = (n570) sparseArray.valueAt(i);
            if (n570Var == null) {
                hhg1.n(f4i1.c(iKeyAt, "Null binder for id "));
                return;
            }
            if (iKeyAt <= 0) {
                throw new IllegalArgumentException("Illegal id registered: " + iKeyAt + "=" + String.valueOf(n570Var) + " (only positive IDs are allowed");
            }
            ((SparseArray) this.b).put(iKeyAt, n570Var);
        }
    }

    public Object get() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 2:
                q8n q8nVar = ((EarlyInitializationProvider) obj).d;
                if (q8nVar != null) {
                    return new DispatcherWorker(q8nVar);
                }
                u890.C("defaultDispatcher");
                throw null;
            default:
                return new DispatcherWorker(((md10) obj).c);
        }
    }

    public void o(Exception exc) {
        Object obj = ((p811) this.b).a;
        if (obj != null) {
            ((h7k1) obj).b();
        } else {
            u890.C("boundRequest");
            throw null;
        }
    }

    public void onComplete(Task task) {
        Exception excV;
        l441 l441Var = (l441) this.b;
        boolean zJ = task.j();
        rih1 rih1Var = rih1.a;
        if (zJ) {
            l441Var.resumeWith(rih1Var);
            return;
        }
        Exception excF = task.f();
        if (excF == null || (excV = lmt0.v(excF)) == null) {
            l441Var.resumeWith(rih1Var);
        } else {
            l441Var.resumeWith(new m231(excV));
        }
    }

    public void onSuccess() {
        Object obj = ((p811) this.b).a;
        if (obj != null) {
            ((h7k1) obj).b();
        } else {
            u890.C("boundRequest");
            throw null;
        }
    }

    public boolean test(Object obj) {
        return pry.a((PlayerState) obj, ((pry) this.b).a);
    }

    public j3v(mbx mbxVar, y570 y570Var) {
        this.a = (byte) 5;
        this.b = y570Var;
    }

    public j3v(wu00 wu00Var, yg7 yg7Var) {
        this.a = (byte) 14;
        this.b = wu00Var;
    }

    public /* synthetic */ j3v(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public j3v(g310 g310Var) {
        this.a = (byte) 15;
        this.b = g310Var.a;
    }

    public j3v() {
        this.a = (byte) 28;
        this.b = new SparseArray();
    }

    public Object apply(Object obj, Object obj2) {
        return mbx.d((y570) this.b, ((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue());
    }
}
