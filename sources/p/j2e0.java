package p;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.net.nsd.NsdManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.datatransport.cct.CctBackendFactory;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import com.spotify.cosmos.util.proto.EpisodeMetadata;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.mediasession.imageloaderimageprovider.events.proto.MediaSessionImageLoadingError;
import com.spotify.party.mobile.v2.GetListeningPartyMarketingCardsRequest;
import com.spotify.party.mobile.v2.GetListeningPartyMarketingCardsResponse;
import com.spotify.party.mobile.v2.ListeningPartyMarketingCard;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.completable.CompletablePeek;
import io.reactivex.rxjava3.internal.operators.single.SingleDelayWithCompletable;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import java.lang.reflect.InvocationTargetException;
import java.net.ServerSocket;
import java.text.Collator;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import spotify.collection.esperanto.proto.CollectionDecorateResponse;
import spotify.collection.esperanto.proto.CollectionEpisode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public class j2e0 implements Function, BiFunction {
    public final /* synthetic */ byte a;
    public Object b;
    public Object c;

    public j2e0(tf10 tf10Var) {
        this.a = (byte) 6;
        this.c = new CountDownLatch(1);
        wf10.c().execute(new FutureTask(new p2r(this, tf10Var, (byte) 4)));
    }

    public static Object q(g431 g431Var, bst bstVar, String str, String str2, String str3, onm onmVar) {
        ohd ohdVar = new ohd(1, aym.t(onmVar));
        ohdVar.t();
        b431 b431VarA = g431Var.a(uj1.v, new wj1(ohdVar, (byte) 24));
        if (ohdVar.s() instanceof ago0) {
            b431VarA.a(new ast(bstVar, str != null ? new n27((Integer) null, str, (Integer) null) : null, str2, str3), (String) null);
        }
        return ohdVar.r();
    }

    public void a(kvv kvvVar, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1886459296);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(kvvVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(this) ? 256 : 128;
        }
        if (!x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            x340Var.b0();
        } else if (kvvVar.R0) {
            x340Var.i0(-138008786);
            vcp vcpVar = (vcp) this.c;
            i4g0 i4g0Var = new i4g0(kvvVar.a);
            boolean z = (i2 & 112) == 32;
            Object objT = x340Var.T();
            if (z || objT == m4cVar) {
                objT = new yjf0(iu30Var, (byte) 8);
                x340Var.s0(objT);
            }
            ng20 ng20VarA = vcpVar.a(i4g0Var, (iu30) objT);
            boolean zI = x340Var.i(this);
            Object objT2 = x340Var.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new k4g0(this, (byte) 1);
                x340Var.s0(objT2);
            }
            dgo1.c("make-playlist-private-dialog", (iu30) objT2, apo.r(2068830583, new mbf0(ng20VarA, (byte) 14), x340Var), x340Var, 390);
            x340Var.r(false);
        } else {
            x340Var.i0(-137343774);
            x340Var.r(false);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vqd0(this, kvvVar, iu30Var, i, (byte) 13);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Object apply(Object obj) {
        cdz cdzVar;
        rir0 rir0VarD;
        Observable observableCreate;
        int i;
        byte b = this.a;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        int i2 = 1;
        SingleDelayWithCompletable singleDelayWithCompletableE = null;
        switch (b) {
            case 2:
                ddz ddzVar = ((uv00) obj).a(ddz.class, (String) this.b).b;
                singleDelayWithCompletableE = ddzVar != null ? ddzVar.b : null;
                return Boolean.valueOf((singleDelayWithCompletableE != null && (singleDelayWithCompletableE.isEmpty() ^ true)) == true && (((b6e0) this.c).f || (singleDelayWithCompletableE != null && (cdzVar = (cdz) o7h.s0(singleDelayWithCompletableE)) != null && cdzVar.e) == false) == true);
            case 11:
                khf0 khf0Var = (khf0) obj;
                a9h a9hVar = khf0Var.d;
                Single singleJust = a9hVar != null ? Single.just(new ung1(a9hVar)) : ((lnf0) this.b).d(khf0Var.a, khf0Var.b, dhf0.b, khf0Var.c).map(xi20.N0).onErrorReturn(yi20.Y);
                singleJust.getClass();
                return Single.zip(singleJust, Single.timer(1000L, timeUnit, (Scheduler) this.c), rh20.Z).map(new d4e0(khf0Var, (byte) 5)).toObservable();
            case 12:
                itf0 itf0Var = (itf0) this.b;
                return itf0Var.a.b((String) this.c, ((jo4) itf0Var.b.get()).a(), itf0Var.c.i(), ((Boolean) obj).booleanValue()).map(eh10.N0);
            case 13:
                xnh1 xnh1Var = (f6r0) obj;
                BehaviorSubject behaviorSubject = (BehaviorSubject) this.c;
                if (!(xnh1Var instanceof xnh1)) {
                    Single singleJust2 = Single.just(xnh1Var);
                    singleJust2.getClass();
                    return singleJust2;
                }
                p811 p811Var = new p811();
                p811Var.a = xnh1Var;
                if (xnh1Var.getPageUri() == null) {
                    p811Var.a = ((xnh1) p811Var.a).b(new qir0((String) this.b));
                }
                Object obj2 = p811Var.a;
                if (!(obj2 instanceof rir0) || !((rir0) obj2).i) {
                    Single map = behaviorSubject.firstOrError().timeout(250L, timeUnit).onErrorReturn(dj10.N0).map(new eea0(p811Var, (byte) 15));
                    map.getClass();
                    return map;
                }
                Optional optional = (Optional) behaviorSubject.h();
                qir0 qir0Var = optional != null ? (qir0) optional.orElse(null) : null;
                Object obj3 = p811Var.a;
                if (qir0Var != null) {
                    rir0 rir0Var = (rir0) obj3;
                    rir0Var.getClass();
                    rir0VarD = rir0.d(rir0Var, (qir0) null, qir0Var, 1007);
                } else {
                    rir0VarD = (rir0) obj3;
                }
                return Single.just(rir0VarD);
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                qfr qfrVar = (qfr) ((dxy) this.b).b;
                jeh0 jeh0Var = (jeh0) this.c;
                jeh0Var.getClass();
                int localPort = ((ServerSocket) obj).getLocalPort();
                NsdManager nsdManager = (NsdManager) qfrVar.a.getValue();
                return (nsdManager == null || (observableCreate = Observable.create(new mgc(jeh0Var, nsdManager, localPort, (byte) 14))) == null) ? Observable.empty() : observableCreate;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                nmr0 nmr0Var = (nmr0) obj;
                s24 s24Var = (s24) this.b;
                Completable completableG = ((ki91) ((x610) s24Var.b).c().h.get()).g(((PlayerState) nmr0Var.a).contextUri(), (tv80) null);
                g510 g510Var = (g510) s24Var.c;
                m210 m210Var = (m210) this.c;
                sp91 sp91Var = (sp91) nmr0Var.b;
                int iOrdinal = sp91Var.a.ordinal();
                if (iOrdinal == 0) {
                    i = 1;
                } else if (iOrdinal == 1) {
                    i = 2;
                } else {
                    if (iOrdinal != 2) {
                        eg.o();
                        return null;
                    }
                    i = 3;
                }
                int iOrdinal2 = sp91Var.c.ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 == 1) {
                        i2 = 2;
                    } else {
                        if (iOrdinal2 != 2) {
                            eg.o();
                            return null;
                        }
                        i2 = 3;
                    }
                }
                return completableG.q(g510Var.m(m210Var, i, i2).ignoreElement());
            case 22:
                return (CompletableSource) ((vu30) this.b).invoke((lxh0) obj, (String) this.c);
            default:
                mdj0 mdj0Var = (mdj0) obj;
                Set set = (Set) this.b;
                kcs kcsVar = (kcs) this.c;
                String str = mdj0Var.d;
                String str2 = mdj0Var.e;
                hzi0 hzi0VarA = sdj0.a(str, set);
                CompletablePeek completablePeekH = hzi0VarA != null ? hzi0VarA.a(str2).g(new tt60(kcsVar, str2, (byte) 4)).h(new w090(kcsVar, str2, (byte) 16)) : null;
                if (completablePeekH != null) {
                    Single singleB = sdj0.b(set, kcsVar, mdj0Var.c);
                    if (singleB == null) {
                        singleB = Single.error(new Exception("There is no handler for this message"));
                    }
                    singleDelayWithCompletableE = completablePeekH.e(singleB);
                }
                return singleDelayWithCompletableE != null ? singleDelayWithCompletableE.toObservable().concatMap(ak20.Y) : Observable.empty();
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:42:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:48:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:51:0x0102 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d3, code lost:
    
        if (r0 == r15) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object b(p.g431 r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, p.onm r21) {
        /*
            Method dump skipped, instruction units count: 259
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.j2e0.b(p.g431, java.lang.String, java.lang.String, java.lang.String, p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public Enum c(onm onmVar) {
        wie0 wie0Var;
        phe0 phe0Var = phe0.b;
        gtt gttVar = (gtt) this.c;
        if (onmVar instanceof wie0) {
            wie0Var = (wie0) onmVar;
            int i = wie0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                wie0Var.c = i - Integer.MIN_VALUE;
            } else {
                wie0Var = new wie0(this, onmVar);
            }
        } else {
            wie0Var = new wie0(this, onmVar);
        }
        Object objB = wie0Var.a;
        d9n d9nVar = d9n.a;
        int i2 = wie0Var.c;
        irt irtVar = null;
        if (i2 == 0) {
            hm5.M(objB);
            wie0Var.c = 1;
            objB = gttVar.b(30000L, "bluejay_onboarding", wie0Var);
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
        ctt cttVar = (ctt) objB;
        if (u890.j(cttVar, btt.a) || (cttVar instanceof att)) {
            irt irtVar2 = gttVar.d.a;
            if (irtVar2 != null && gttVar.c.b() - irtVar2.b() < g5d0.a(1)) {
                irtVar = irtVar2;
            }
            if (irtVar != null) {
                return phe0.a;
            }
        } else if (!u890.j(cttVar, zst.a) && !(cttVar instanceof wst)) {
            if (u890.j(cttVar, yst.a) || u890.j(cttVar, vst.a) || u890.j(cttVar, ust.a) || u890.j(cttVar, xst.a)) {
                return phe0.c;
            }
            eg.o();
            return null;
        }
        return phe0Var;
    }

    public void d() {
        rlh0 rlh0Var = (rlh0) this.c;
        kh70 kh70Var = rlh0Var.C;
        if (kh70Var == null || !kh70Var.asBinder().isBinderAlive()) {
            return;
        }
        try {
            rlh0Var.C.r(rlh0Var.c);
        } catch (RemoteException e) {
            oon1.I("Error in sending flushCommandQueue", e);
        }
    }

    public CctBackendFactory e(String str) {
        Bundle bundle;
        ServiceInfo serviceInfo;
        Map map = (Map) this.c;
        if (map == null) {
            Context context = (Context) this.b;
            try {
                PackageManager packageManager = context.getPackageManager();
                bundle = (packageManager == null || (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) TransportBackendDiscovery.class), 128)) == null) ? null : serviceInfo.metaData;
            } catch (PackageManager.NameNotFoundException unused) {
            }
            if (bundle == null) {
                map = Collections.EMPTY_MAP;
            } else {
                HashMap map2 = new HashMap();
                for (String str2 : bundle.keySet()) {
                    Object obj = bundle.get(str2);
                    if ((obj instanceof String) && str2.startsWith("backend:")) {
                        for (String str3 : ((String) obj).split(",", -1)) {
                            String strTrim = str3.trim();
                            if (!strTrim.isEmpty()) {
                                map2.put(strTrim, str2.substring(8));
                            }
                        }
                    }
                }
                map = map2;
            }
            this.c = map;
        }
        String str4 = (String) map.get(str);
        if (str4 == null) {
            return null;
        }
        try {
            return (CctBackendFactory) Class.forName(str4).asSubclass(CctBackendFactory.class).getDeclaredConstructor(null).newInstance(null);
        } catch (ClassNotFoundException unused2) {
            StringBuilder sb = new StringBuilder("Class ");
            sb.append(str4);
            sb.append(" is not found.");
            return null;
        } catch (IllegalAccessException unused3) {
            StringBuilder sb2 = new StringBuilder("Could not instantiate ");
            sb2.append(str4);
            sb2.append(".");
            return null;
        } catch (InstantiationException unused4) {
            StringBuilder sb3 = new StringBuilder("Could not instantiate ");
            sb3.append(str4);
            sb3.append(".");
            return null;
        } catch (NoSuchMethodException unused5) {
            "Could not instantiate ".concat(str4);
            return null;
        } catch (InvocationTargetException unused6) {
            "Could not instantiate ".concat(str4);
            return null;
        }
    }

    public mlw0 f() {
        return (mlw0) this.c;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object g(List list, onm onmVar) {
        gug0 gug0Var;
        ljd0 m231Var;
        if (onmVar instanceof gug0) {
            gug0Var = (gug0) onmVar;
            int i = gug0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                gug0Var.d = i - Integer.MIN_VALUE;
            } else {
                gug0Var = new gug0(this, onmVar);
            }
        } else {
            gug0Var = new gug0(this, onmVar);
        }
        Object objA = gug0Var.b;
        int i2 = gug0Var.d;
        try {
            if (i2 == 0) {
                hm5.M(objA);
                zc80 zc80Var = (zc80) this.b;
                gug0Var.a = this;
                gug0Var.d = 1;
                dug0 dug0Var = (dug0) zc80Var.b;
                eo40 eo40VarO = GetListeningPartyMarketingCardsRequest.o();
                eo40VarO.n(list);
                objA = dug0Var.a((GetListeningPartyMarketingCardsRequest) eo40VarO.build(), gug0Var);
                d9n d9nVar = d9n.a;
                if (objA == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                this = gug0Var.a;
                hm5.M(objA);
            }
            ListeningPartyMarketingCard listeningPartyMarketingCard = (ListeningPartyMarketingCard) o7h.s0(((GetListeningPartyMarketingCardsResponse) objA).n());
            m231Var = listeningPartyMarketingCard != null ? ((fug0) this.c).a(listeningPartyMarketingCard) : null;
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        if (e331.a(m231Var) == null) {
            return m231Var;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object h(onm onmVar) {
        p9f0 p9f0Var;
        if (onmVar instanceof p9f0) {
            p9f0Var = (p9f0) onmVar;
            int i = p9f0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                p9f0Var.c = i - Integer.MIN_VALUE;
            } else {
                p9f0Var = new p9f0(this, onmVar);
            }
        } else {
            p9f0Var = new p9f0(this, onmVar);
        }
        Object objI = p9f0Var.a;
        int i2 = p9f0Var.c;
        if (i2 == 0) {
            hm5.M(objI);
            mr20 mr20Var = (mr20) ((gfr) this.b).invoke();
            p9f0Var.c = 1;
            objI = b5p1.i(mr20Var, p9f0Var);
            d9n d9nVar = d9n.a;
            if (objI == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objI);
        }
        String strE = ((dma1) objI).e(t9f0.a, (String) null);
        if (strE == null) {
            return new o9f0();
        }
        o9f0 o9f0Var = (o9f0) ((nfa0) this.c).a(strE, m5n1.z(o9f0.Companion.serializer()));
        return o9f0Var == null ? new o9f0() : o9f0Var;
    }

    public Object i(fdf0 fdf0Var) {
        return (hw81) this.c;
    }

    public Object j(float f, float f2, Object obj, Object obj2, float f3, float f4, float f5) {
        fdf0 fdf0Var = (fdf0) this.b;
        fdf0Var.a = f;
        fdf0Var.b = f2;
        fdf0Var.c = obj;
        fdf0Var.d = obj2;
        fdf0Var.e = f3;
        fdf0Var.f = f4;
        fdf0Var.g = f5;
        return i(fdf0Var);
    }

    public ps41 k() {
        return (ps41) this.b;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006a, code lost:
    
        if (r(r9, r0) == r5) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object l(java.lang.String r8, p.onm r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof p.q9f0
            if (r0 == 0) goto L13
            r0 = r9
            p.q9f0 r0 = (p.q9f0) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            p.q9f0 r0 = new p.q9f0
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.b
            int r1 = r0.d
            r2 = 0
            r3 = 2
            r4 = 1
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L37
            if (r1 == r4) goto L31
            if (r1 != r3) goto L2b
            p.hm5.M(r9)
            goto L6d
        L2b:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r7)
            return r2
        L31:
            java.lang.String r8 = r0.a
            p.hm5.M(r9)
            goto L45
        L37:
            p.hm5.M(r9)
            r0.a = r8
            r0.d = r4
            java.lang.Object r9 = r7.h(r0)
            if (r9 != r5) goto L45
            goto L6c
        L45:
            p.o9f0 r9 = (p.o9f0) r9
            java.util.Map r1 = r9.a
            java.lang.Object r1 = r1.get(r8)
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 == 0) goto L56
            int r1 = r1.intValue()
            goto L57
        L56:
            r1 = 0
        L57:
            java.util.Map r6 = r9.a
            int r1 = r1 + r4
            java.lang.Integer r4 = new java.lang.Integer
            r4.<init>(r1)
            r6.put(r8, r4)
            r0.a = r2
            r0.d = r3
            java.lang.Object r7 = r7.r(r9, r0)
            if (r7 != r5) goto L6d
        L6c:
            return r5
        L6d:
            p.rih1 r7 = p.rih1.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p.j2e0.l(java.lang.String, p.onm):java.lang.Object");
    }

    public tv80 m(String str) {
        i8h1 i8h1Var = (i8h1) this.b;
        gfl0 gfl0Var = (gfl0) this.c;
        gfl0Var.getClass();
        x6h1 x6h1VarC = gfl0Var.b.c();
        x6h1VarC.i.add(new a7h1("mark_more_snackbar", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        x6h1 x6h1VarC2 = x6h1VarC.a().c();
        x6h1VarC2.i.add(new a7h1("mark_more_snackbar_action", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC2.j = false;
        return i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str)), x6h1VarC2.a(), gfl0Var.a, System.currentTimeMillis()), (xj61) null);
    }

    public void n() {
        i8h1 i8h1Var = (i8h1) this.b;
        x6h1 x6h1VarC = ((tdl0) this.c).b.c();
        x6h1VarC.i.add(new a7h1("new_conversation_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        y6h1 y6h1VarA = x6h1VarC.a();
        b7x b7xVar = b7x.a;
        i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object o(String str, onm onmVar) {
        r9f0 r9f0Var;
        if (onmVar instanceof r9f0) {
            r9f0Var = (r9f0) onmVar;
            int i = r9f0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                r9f0Var.d = i - Integer.MIN_VALUE;
            } else {
                r9f0Var = new r9f0(this, onmVar);
            }
        } else {
            r9f0Var = new r9f0(this, onmVar);
        }
        Object objH = r9f0Var.b;
        int i2 = r9f0Var.d;
        if (i2 == 0) {
            hm5.M(objH);
            r9f0Var.a = str;
            r9f0Var.d = 1;
            objH = h(r9f0Var);
            Object obj = d9n.a;
            if (objH == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = r9f0Var.a;
            hm5.M(objH);
        }
        Integer num = (Integer) ((o9f0) objH).a.get(str);
        return new Integer(num != null ? num.intValue() : 0);
    }

    public void p(String str, String str2, String str3) {
        if (((xr4) ((kly0) this.c).get()).b()) {
            wyh0 wyh0VarN = MediaSessionImageLoadingError.n();
            wyh0VarN.r(str);
            if (str2 == null) {
                str2 = "unknown";
            }
            wyh0VarN.n(str2);
            wyh0VarN.q(str3);
            MediaSessionImageLoadingError mediaSessionImageLoadingErrorBuild = wyh0VarN.build();
            t2j0 t2j0Var = (t2j0) this.b;
            mediaSessionImageLoadingErrorBuild.getClass();
            t2j0Var.a(mediaSessionImageLoadingErrorBuild);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object r(o9f0 o9f0Var, onm onmVar) {
        s9f0 s9f0Var;
        if (onmVar instanceof s9f0) {
            s9f0Var = (s9f0) onmVar;
            int i = s9f0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                s9f0Var.d = i - Integer.MIN_VALUE;
            } else {
                s9f0Var = new s9f0(this, onmVar);
            }
        } else {
            s9f0Var = new s9f0(this, onmVar);
        }
        Object objI = s9f0Var.b;
        int i2 = s9f0Var.d;
        if (i2 == 0) {
            hm5.M(objI);
            mr20 mr20Var = (mr20) ((gfr) this.b).invoke();
            s9f0Var.a = o9f0Var;
            s9f0Var.d = 1;
            objI = b5p1.i(mr20Var, s9f0Var);
            d9n d9nVar = d9n.a;
            if (objI == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o9f0Var = s9f0Var.a;
            hm5.M(objI);
        }
        String strB = ((nfa0) this.c).b(o9f0.Companion.serializer(), o9f0Var);
        hma1 hma1VarEdit = ((dma1) objI).edit();
        hma1VarEdit.d(t9f0.a, strB);
        hma1VarEdit.g();
        return rih1.a;
    }

    public j2e0(i8h1 i8h1Var) {
        this.a = (byte) 18;
        this.b = i8h1Var;
        this.c = new tdl0((byte) 6);
    }

    public j2e0(d0r d0rVar) {
        this.a = (byte) 0;
        this.b = d0rVar;
        this.c = Collator.getInstance();
    }

    public /* synthetic */ j2e0(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public j2e0() {
        this.a = (byte) 10;
        this.b = new fdf0();
        this.c = null;
    }

    public j2e0(hw81 hw81Var) {
        this.a = (byte) 10;
        this.b = new fdf0();
        this.c = hw81Var;
    }

    public j2e0(Context context) {
        this.a = (byte) 27;
        this.c = null;
        this.b = context;
    }

    public j2e0(rlh0 rlh0Var, Looper looper) {
        this.a = (byte) 21;
        this.c = rlh0Var;
        this.b = new Handler(looper, new owu(this, (byte) 3));
    }

    public Object apply(Object obj, Object obj2) {
        CollectionDecorateResponse collectionDecorateResponse = (CollectionDecorateResponse) obj;
        Boolean bool = (Boolean) obj2;
        if (collectionDecorateResponse.p().isEmpty()) {
            return new wae0(new IllegalStateException(l1d.m("No episode metadata found for uri: ", (String) this.b)));
        }
        EpisodeMetadata episodeMetadataQ = ((CollectionEpisode) o7h.q0(collectionDecorateResponse.p())).q();
        return new ebe0(new qmy(episodeMetadataQ.getLength(), episodeMetadataQ.getName(), ((zkj0) this.c).a.getString(2131954311), bool.booleanValue(), episodeMetadataQ.getShow().getName()));
    }
}
