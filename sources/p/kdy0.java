package p;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.ResultReceiver;
import android.view.View;
import com.spotify.aipartner.aipartnerapi.proto.ResolveIntentRequest;
import com.spotify.aipartner.aipartnerapiwrapper.events.proto.PartnerAIResolveIntentRequest;
import com.spotify.cosmos.rxrouter.RxRouter;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.PlayerState;
import com.spotify.player.model.command.options.LoggingParams;
import com.spotify.recents.recentsdatasourceimpl.Filter;
import com.spotify.recents.recentsdatasourceimpl.Filters;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.completable.CompletableOnErrorComplete;
import io.reactivex.rxjava3.internal.operators.completable.CompletableToSingle;
import j$.time.LocalDateTime;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class kdy0 implements zdg, Function {
    public final /* synthetic */ byte a;
    public Object b;
    public final Object c;
    public final Object d;
    public Object e;

    public kdy0(egy0 egy0Var, akn0 akn0Var, xbc xbcVar, ryq ryqVar) {
        this.a = (byte) 1;
        this.c = akn0Var;
        this.d = xbcVar;
        this.e = ryqVar;
        List list = egy0Var.g;
        int iS = zno1.s(q7h.U(list, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iS < 16 ? 16 : iS);
        for (Object obj : list) {
            linkedHashMap.put(dem1.x((akn0) this.c, ((hfy0) obj).e), obj);
        }
        this.b = linkedHashMap;
    }

    public static void c(Intent intent) {
        if (!"android.intent.action.VIEW".equals(intent.getAction())) {
            hhg1.n("Only android.intent.action.VIEW action is currently supported for starting a remote activity");
            return;
        }
        if (intent.getData() == null) {
            hhg1.n("Data URI is required when starting a remote activity");
            return;
        }
        Set<String> categories = intent.getCategories();
        if (categories == null || !categories.contains("android.intent.category.BROWSABLE")) {
            hhg1.n("The category android.intent.category.BROWSABLE must be present on the intent");
        }
    }

    public static pux0 d(kdy0 kdy0Var, gho1 gho1Var, gho1 gho1Var2, boolean z, int i) {
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        qxm0 qxm0Var;
        boolean z2 = (i & 8) == 0;
        boolean z3 = (i & 16) == 0 ? z : false;
        f5y0 f5y0Var = (f5y0) kdy0Var.e;
        h5y0 h5y0Var = (h5y0) kdy0Var.b;
        mzy0 mzy0Var = mzy0.d;
        qxm0 qxm0Var2 = new qxm0(0, 2131961955, z2 ? 2131961956 : null, (b2i) null, (mr20) null, (wxm0) null, 1012);
        if (z2) {
            num = z3 ? 2131961967 : 2131961963;
        } else {
            num = null;
        }
        qxm0 qxm0Var3 = new qxm0(1, 2131961962, num, (b2i) null, h5y0Var, (wxm0) null, 948);
        if (z2) {
            num2 = z3 ? 2131961968 : 2131961965;
        } else {
            num2 = null;
        }
        qxm0 qxm0Var4 = new qxm0(2, 2131961964, num2, (b2i) null, h5y0Var, (wxm0) null, 948);
        if (z2) {
            num3 = z3 ? 2131961966 : 2131961958;
        } else {
            num3 = null;
        }
        qxm0 qxm0Var5 = new qxm0(3, 2131961957, num3, (b2i) null, (mr20) null, (wxm0) null, 1012);
        boolean z4 = gho1Var instanceof nzy0;
        wxm0 wxm0Var = z4 ? ((nzy0) gho1Var).d : null;
        if (z2) {
            num4 = z3 ? 2131961969 : 2131961971;
        } else {
            num4 = null;
        }
        qxm0 qxm0Var6 = new qxm0(4, 2131961970, num4, (b2i) null, (mr20) null, wxm0Var, 500);
        boolean z5 = gho1Var2 instanceof nzy0;
        qxm0 qxm0Var7 = new qxm0(5, 2131961959, (Integer) null, z2 ? pdx0.c : null, f5y0Var, z5 ? ((nzy0) gho1Var2).d : null, 412);
        qxm0 qxm0Var8 = new qxm0(6, (Integer) null, (Integer) null, z2 ? new uip0(kdy0Var, (byte) 27) : null, f5y0Var, (wxm0) null, 922);
        mzy0 mzy0Var2 = mzy0.e;
        List listI0 = f46.i0(new qxm0[]{qxm0Var2, qxm0Var3, qxm0Var4, qxm0Var5, qxm0Var6, gho1Var2.equals(mzy0Var2) ? null : qxm0Var7, null});
        xkg0 xkg0Var = new xkg0();
        if (gho1Var.equals(mzy0Var2) || z4) {
            xkg0Var.put(qxm0Var6, qxm0Var2);
        } else if (!gho1Var.equals(mzy0Var)) {
            eg.o();
            return null;
        }
        if (gho1Var2.equals(mzy0Var2)) {
            if (gho1Var.equals(mzy0Var)) {
                qxm0Var = qxm0Var6;
            } else {
                if (!gho1Var.equals(mzy0Var2) && !z4) {
                    eg.o();
                    return null;
                }
                qxm0Var = qxm0Var5;
            }
            xkg0Var.put(qxm0Var7, qxm0Var);
        } else if (z5) {
            xkg0Var.put(qxm0Var7, qxm0Var2);
        } else if (!gho1Var2.equals(mzy0Var)) {
            eg.o();
            return null;
        }
        if (!gho1Var2.equals(mzy0Var)) {
            if (!gho1Var2.equals(mzy0Var2) && !z5) {
                eg.o();
                return null;
            }
            if (gho1Var.equals(mzy0Var)) {
                qxm0Var7 = qxm0Var6;
            } else {
                if (!gho1Var.equals(mzy0Var2) && !z4) {
                    eg.o();
                    return null;
                }
                qxm0Var7 = qxm0Var5;
            }
        }
        xkg0Var.put(qxm0Var8, qxm0Var7);
        return new pux0(listI0, xkg0Var.b());
    }

    public static Intent f(Intent intent, ResultReceiver resultReceiver, String str, String str2) {
        Intent intent2 = new Intent("com.google.android.wearable.intent.action.REMOTE_INTENT");
        intent2.putExtra("com.google.android.wearable.intent.extra.INTENT", intent);
        Parcel parcelObtain = Parcel.obtain();
        resultReceiver.writeToParcel(parcelObtain, 0);
        parcelObtain.setDataPosition(0);
        ResultReceiver resultReceiver2 = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcelObtain);
        parcelObtain.recycle();
        resultReceiver2.getClass();
        intent2.putExtra("com.google.android.wearable.intent.extra.RESULT_RECEIVER", resultReceiver2);
        if (str != null) {
            intent2.putExtra("com.google.android.wearable.intent.extra.NODE_ID", str);
        }
        intent2.setPackage(str2);
        return intent2;
    }

    public static ArrayList r(Filters filters) {
        ws01 ws01Var;
        Object next;
        br01 br01Var;
        Map mapJ = sqg0.J(new mmr0[]{new mmr0(eam.c, m9m.b), new mmr0(eam.d, m9m.c), new mmr0(eam.e, m9m.d)});
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : mapJ.entrySet()) {
            eam eamVar = (eam) entry.getKey();
            m9m m9mVar = (m9m) entry.getValue();
            Iterator it = filters.o().iterator();
            do {
                ws01Var = null;
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((Filter) next).o() != eamVar);
            Filter filter = (Filter) next;
            if (filter != null) {
                List listP = filter.p();
                ArrayList arrayList2 = new ArrayList();
                for (zn01 zn01Var : (AbstractList) listP) {
                    zn01Var.getClass();
                    int iOrdinal = zn01Var.ordinal();
                    if (iOrdinal == 1) {
                        br01Var = br01.b;
                    } else if (iOrdinal == 2) {
                        br01Var = br01.d;
                    } else if (iOrdinal != 3) {
                        br01Var = iOrdinal != 4 ? null : br01.e;
                    } else {
                        br01Var = br01.c;
                    }
                    if (br01Var != null) {
                        arrayList2.add(br01Var);
                    }
                }
                ws01Var = new ws01(o7h.a1(arrayList2, new ktg0((byte) 27)), m9mVar);
            }
            if (ws01Var != null) {
                arrayList.add(ws01Var);
            }
        }
        return arrayList;
    }

    public ydg a(heg hegVar) {
        hfy0 hfy0Var = (hfy0) ((LinkedHashMap) this.b).get(hegVar);
        if (hfy0Var == null) {
            return null;
        }
        return new ydg((akn0) this.c, hfy0Var, (xbc) this.d, (mka1) ((ryq) this.e).invoke(hegVar));
    }

    public Object apply(Object obj) {
        String str;
        byte b = this.a;
        byte b2 = 3;
        byte b3 = 2;
        Object obj2 = this.c;
        Object obj3 = this.d;
        byte b4 = 1;
        switch (b) {
            case 7:
                PlayerState playerState = (PlayerState) obj;
                PlayOrigin playOrigin = (PlayOrigin) this.b;
                LoggingParams loggingParams = (LoggingParams) this.e;
                tx01 tx01Var = (tx01) obj3;
                String str2 = tx01Var.b;
                lgz0 lgz0Var = (lgz0) obj2;
                ContextTrack contextTrack = (ContextTrack) playerState.track().h();
                String strUri = contextTrack != null ? contextTrack.uri() : null;
                if (playerState.isPlaying() && !playerState.isPaused() && u890.j(playerState.contextUri(), str2) && strUri != null && strUri.equals(tx01Var.d)) {
                    ngz0 ngz0Var = ngz0.a;
                    lgz0Var.b(loggingParams, playOrigin, ngz0Var, 1);
                    return Single.just(ngz0Var);
                }
                lgz0Var.l.getClass();
                if (str2.equals("spotify:playlist:37i9dQZF1EYkqdzj48dyYq") && u890.j(tx01Var.a, "JUMP")) {
                    return new CompletableToSingle(zq51.a(lgz0Var.d.a), new inf0(lgz0Var, loggingParams, playOrigin, b4), (Object) null).onErrorReturn(new kgz0(lgz0Var, loggingParams, playOrigin, b3));
                }
                return lgz0Var.c((PlayOrigin) this.b, loggingParams, tx01Var.b, tx01Var.c, tx01Var.d, tx01Var.e, tx01Var.f, tx01Var.g, tx01Var.h, tx01Var.i).map(new kgz0(lgz0Var, loggingParams, playOrigin, b2));
            default:
                LoggingParams loggingParams2 = (LoggingParams) this.e;
                PlayOrigin playOrigin2 = (PlayOrigin) obj3;
                lgz0 lgz0Var2 = (lgz0) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    return lgz0Var2.k.z().map(new m980((byte) 28, true)).flatMap(new kgz0(lgz0Var2, loggingParams2, playOrigin2, (byte) 6));
                }
                Boolean bool = (Boolean) this.b;
                l0x0 l0x0Var = lgz0Var2.a;
                String strFeatureIdentifier = playOrigin2.featureIdentifier();
                if (u890.j(strFeatureIdentifier, "spoton") || u890.j(strFeatureIdentifier, "spotify-go")) {
                    str = "HEADPHONES";
                } else {
                    if (u890.j(strFeatureIdentifier, "driving-jumpstart")) {
                        strFeatureIdentifier = "CAR";
                    }
                    str = strFeatureIdentifier;
                }
                return ((g0l) l0x0Var.c).m().filter(hcx0.d).flatMap(new s6z0(l0x0Var, b3)).filter(new m980(l0x0Var, true, (byte) 29)).map(new wgz0(l0x0Var, true, (byte) 0)).firstOrError().flatMap(new pux0(l0x0Var, new vgz0(str, playOrigin2.featureIdentifier(), (String) loggingParams2.interactionId().h(), LocalDateTime.now(), (String) null, bool), (byte) 11)).map(icx0.d).onErrorReturn(jcx0.d).flatMap(new uxy0(lgz0Var2, loggingParams2, b2)).flatMap(new kgz0(lgz0Var2, playOrigin2, loggingParams2, (byte) 4)).onErrorResumeNext(new kgz0(lgz0Var2, playOrigin2, loggingParams2, (byte) 9));
        }
    }

    public void b(String str, String str2) {
        this.b = ((String) this.b) + (((String) this.b).length() == 0 ? "?" : "&") + str + '=' + str2;
    }

    public jpg0 e(epb1 epb1Var, iac0 iac0Var, p1f0 p1f0Var) {
        if (((f54) this.e).d()) {
            return new jpg0(((ajq0) this.d).l(epb1Var, ou11.d, (nu11) null), ou11.e);
        }
        aoq aoqVar = (aoq) this.c;
        aoqVar.getClass();
        h72 h72Var = (h72) aoqVar.a.c;
        dx11 dx11Var = (dx11) h72Var.c;
        lzn0 lzn0Var = (lzn0) ((dx11) h72Var.c).i.get();
        c8o.l(lzn0Var);
        xfx xfxVar = (xfx) dx11Var.h.get();
        c8o.l(xfxVar);
        yfx yfxVar = new yfx(xfxVar.c, (byte) 3);
        Context context = (Context) dx11Var.k.get();
        c8o.l(context);
        o241 o241Var = (o241) dx11Var.l.get();
        c8o.l(o241Var);
        return new jpg0(new jt11(lzn0Var, yfxVar, context, o241Var, h72Var.m(), epb1Var), ou11.f);
    }

    public jgb1 g(pux0 pux0Var, boolean z) {
        dg90 dg90Var = (dg90) this.d;
        Integer numValueOf = Integer.valueOf(z ? 2131961980 : 2131961975);
        x010 x010Var = new x010((mr20) ((ofd) this.e).invoke(), dg90Var.d(), new cq2(z, (lnm) null), (byte) 1);
        c0g.x.getClass();
        return new jgb1("remoteAudioStreamQuality", 2131961982, (String) null, numValueOf, (sp00) null, 2131961981, (a2i) null, x010Var, pbo1.N0, new h5y0(dg90Var.d(), (byte) 21), new xxm0((List) pux0Var.b, (Map) pux0Var.c, new oxm0(7), new rxm0(rc11.a.b(uy11.class), ok11.T0), (mxm0) null, 16), Collections.singletonMap("losslessRemoteWarning", new zw11(this, (byte) 3)), 3514);
    }

    public Set h() {
        if (!((f54) this.e).d()) {
            return jt11.t;
        }
        xj61 xj61Var = new xj61();
        xj61Var.add(new yp21(jo70.class));
        xj61Var.add(new yp21(xkk1.class));
        xj61Var.add(new yp21(zoy0.class));
        xj61Var.add(new yp21(gh3.class));
        if (((abm) this.b).a()) {
            xj61Var.add(new yp21(bql.class));
        }
        return cwl1.j(xj61Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object i(ResolveIntentRequest resolveIntentRequest, String str, q1m q1mVar, onm onmVar) {
        rt21 rt21Var;
        t45 t45VarA;
        String str2;
        String str3;
        s45 s45Var = (zle1) this.d;
        if (onmVar instanceof rt21) {
            rt21Var = (rt21) onmVar;
            int i = rt21Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                rt21Var.g = i - Integer.MIN_VALUE;
            } else {
                rt21Var = new rt21(this, onmVar);
            }
        } else {
            rt21Var = new rt21(this, onmVar);
        }
        Object obj = rt21Var.e;
        int i2 = rt21Var.g;
        if (i2 != 0) {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str3 = rt21Var.d;
            t45VarA = rt21Var.c;
            q1mVar = rt21Var.b;
            ResolveIntentRequest resolveIntentRequest2 = rt21Var.a;
            try {
                hm5.M(obj);
                q1mVar.b.g("backend_call");
                t45VarA.g(str3);
                s45Var.b(t45VarA.e());
                return obj;
            } catch (Throwable th) {
                str2 = str3;
                resolveIntentRequest = resolveIntentRequest2;
                th = th;
                try {
                    ((by40) this.e).b(resolveIntentRequest, th);
                    return new m231(th);
                } finally {
                    q1mVar.b.g("backend_call");
                    t45VarA.g(str2);
                    s45Var.b(t45VarA.e());
                }
            }
        }
        hm5.M(obj);
        hlr hlrVar = (hlr) this.b;
        com.spotify.aipartner.aipartnerapi.proto.Context contextO = resolveIntentRequest.o();
        l0s0 l0s0VarN = PartnerAIResolveIntentRequest.n();
        l0s0VarN.n(str);
        l0s0VarN.s(resolveIntentRequest.q());
        l0s0VarN.r(contextO.q().name());
        l0s0VarN.q(contextO.p().name());
        l0s0VarN.t(contextO.o().o().name());
        l0s0VarN.u(contextO.o().p().name());
        hlrVar.a.a(l0s0VarN.build());
        t45VarA = s45Var.a("NaturalLanguageEndpoint");
        t45VarA.a("Integration", resolveIntentRequest.o().q().name());
        str2 = "resolve_intent";
        t45.m(t45VarA, "resolve_intent", 4);
        t45 t45Var = q1mVar.b;
        t45.m(t45Var, "backend_call", 4);
        t45Var.a("search_backend", fd21.f(2));
        try {
            xmn0 xmn0Var = (xmn0) this.c;
            rt21Var.a = resolveIntentRequest;
            rt21Var.b = q1mVar;
            rt21Var.c = t45VarA;
            rt21Var.d = "resolve_intent";
            rt21Var.g = 1;
            Object objA = xmn0Var.a(resolveIntentRequest, rt21Var);
            d9n d9nVar = d9n.a;
            if (objA == d9nVar) {
                return d9nVar;
            }
            str3 = "resolve_intent";
            obj = objA;
            q1mVar.b.g("backend_call");
            t45VarA.g(str3);
            s45Var.b(t45VarA.e());
            return obj;
        } catch (Throwable th2) {
            th = th2;
            ((by40) this.e).b(resolveIntentRequest, th);
            return new m231(th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0062 A[PHI: r9
      0x0062: PHI (r9v1 java.lang.String) = (r9v0 java.lang.String), (r9v3 java.lang.String), (r9v3 java.lang.String) binds: [B:17:0x0046, B:22:0x0055, B:24:0x005f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:30:0x0072  */
    /* JADX WARN: Code duplicated, block: B:33:0x007b  */
    /* JADX WARN: Code duplicated, block: B:35:0x007e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0084  */
    /* JADX WARN: Code duplicated, block: B:39:0x0088  */
    /* JADX WARN: Code duplicated, block: B:40:0x008d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0090  */
    /* JADX WARN: Code duplicated, block: B:45:0x009b  */
    /* JADX WARN: Code duplicated, block: B:47:0x009e  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
    
        if (r10 == r5) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object j(java.lang.String r9, p.onm r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof p.suz0
            if (r0 == 0) goto L13
            r0 = r10
            p.suz0 r0 = (p.suz0) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            p.suz0 r0 = new p.suz0
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.b
            int r1 = r0.d
            r2 = 1
            r3 = 2
            r4 = 0
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L39
            if (r1 == r2) goto L33
            if (r1 != r3) goto L2d
            java.lang.String r8 = r0.a
            p.hm5.M(r10)
            goto L73
        L2d:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r8)
            return r4
        L33:
            java.lang.String r9 = r0.a
            p.hm5.M(r10)
            goto L53
        L39:
            p.hm5.M(r10)
            java.lang.Object r10 = r8.b
            java.util.Optional r10 = (java.util.Optional) r10
            java.lang.Object r10 = r10.orElse(r4)
            p.yuz0 r10 = (p.yuz0) r10
            if (r10 == 0) goto L62
            r0.a = r9
            r0.d = r2
            java.lang.Object r10 = r10.b(r9, r0)
            if (r10 != r5) goto L53
            goto L71
        L53:
            java.lang.Long r10 = (java.lang.Long) r10
            if (r10 == 0) goto L62
            long r1 = r10.longValue()
            r6 = 0
            int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r1 <= 0) goto L62
            goto L63
        L62:
            r10 = r4
        L63:
            java.lang.Object r8 = r8.c
            p.itz0 r8 = (p.itz0) r8
            r0.a = r9
            r0.d = r3
            java.lang.Object r10 = r8.c(r9, r10, r0)
            if (r10 != r5) goto L72
        L71:
            return r5
        L72:
            r8 = r9
        L73:
            p.sy21 r10 = (p.sy21) r10
            p.ry21 r9 = r10.a
            boolean r0 = r9.Q0
            if (r0 == 0) goto L7e
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            return r8
        L7e:
            int r9 = r9.d
            r0 = 404(0x194, float:5.66E-43)
            if (r9 != r0) goto La8
            p.uz21 r9 = r10.c
            if (r9 == 0) goto L8d
            java.lang.String r9 = r9.f()
            goto L8e
        L8d:
            r9 = r4
        L8e:
            if (r9 != 0) goto L92
            java.lang.String r9 = ""
        L92:
            java.lang.String r10 = "eligibility_check_unavailable"
            r0 = 0
            boolean r9 = p.ihc1.h0(r9, r10, r0)
            if (r9 != 0) goto L9e
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            return r8
        L9e:
            java.lang.String r9 = "Eligibility check unavailable for "
            java.lang.String r8 = p.l1d.m(r9, r8)
            p.eg.m(r8)
            return r4
        La8:
            java.lang.String r8 = "Eligibility check failed with unexpected status "
            java.lang.String r8 = p.f4i1.c(r9, r8)
            p.eg.m(r8)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p.kdy0.j(java.lang.String, p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:31:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:34:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:38:0x00de  */
    /* JADX WARN: Code duplicated, block: B:45:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:49:0x0109  */
    /* JADX WARN: Code duplicated, block: B:52:0x0114  */
    /* JADX WARN: Code duplicated, block: B:59:0x012b  */
    /* JADX WARN: Code duplicated, block: B:60:0x012d  */
    /* JADX WARN: Code duplicated, block: B:66:0x013d  */
    /* JADX WARN: Code duplicated, block: B:76:0x00ed A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x00d8 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:82:0x00fd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x0126 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x0118 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x0126 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x0103 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x0103 A[SYNTHETIC] */
    public Object k(String str, onm onmVar) {
        tuz0 tuz0Var;
        t5g1 t5g1Var;
        String str2;
        ArrayList arrayList;
        Iterator it;
        i1z i1zVar;
        boolean z;
        Integer num;
        int iIntValue;
        int i;
        int i2;
        boolean z2;
        i1z i1zVar2;
        i1z i1zVar3;
        i1z i1zVar4;
        if (onmVar instanceof tuz0) {
            tuz0Var = (tuz0) onmVar;
            int i3 = tuz0Var.c;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                tuz0Var.c = i3 - Integer.MIN_VALUE;
            } else {
                tuz0Var = new tuz0(this, onmVar);
            }
        } else {
            tuz0Var = new tuz0(this, onmVar);
        }
        Object objJ = tuz0Var.a;
        int i4 = tuz0Var.c;
        if (i4 == 0) {
            hm5.M(objJ);
            Set set = s4b1.f;
            String strH = uic.x(str).h();
            Boolean bool = Boolean.TRUE;
            Single singleA = ((h481) this.e).a(strH, new e481(new t881(new y381((e3z) null, new x381(Collections.singletonList(new Integer(37)), sqg0.J(new mmr0[]{new mmr0("covers", bool), new mmr0("isBook", bool), new mmr0("latestPlayedEpisodeLink", bool)})), 5)), (nia1) null, new nqz0(2000), 196605));
            tuz0Var.c = 1;
            objJ = fc11.j(singleA, tuz0Var);
            d9n d9nVar = d9n.a;
            if (objJ == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i4 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objJ);
        }
        c481 c481Var = (c481) objJ;
        g281 g281Var = c481Var.a;
        List list = c481Var.b;
        vnm vnmVar = c481Var.g;
        if (vnmVar == null || (i1zVar4 = vnmVar.a) == null) {
            t5g1Var = c481Var.i;
            if (t5g1Var != null || (i1zVar3 = t5g1Var.a) == null) {
                str2 = null;
            } else {
                str2 = i1zVar3.a;
            }
            arrayList = new ArrayList();
            for (Object obj : list) {
                i1zVar2 = (i1z) obj;
                if (i1zVar2.a.equals(str2) && i1zVar2.C != g1z.b) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.isEmpty()) {
                z = false;
            } else {
                it = arrayList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        i1zVar = (i1z) it.next();
                        if (!i1zVar.s) {
                            num = i1zVar.r;
                            if (num != null) {
                                iIntValue = num.intValue();
                                i = i1zVar.q;
                                if (i - iIntValue >= Math.min(30, i)) {
                                }
                            }
                        }
                        z = true;
                    } else {
                        z = false;
                    }
                }
            }
            i2 = c481Var.e;
            if (i2 > 0 || list.size() == i2) {
                z2 = z;
            } else if (g281Var.q.length() > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            if (!i1zVar4.s) {
                Integer num2 = i1zVar4.r;
                if (num2 != null) {
                    int iIntValue2 = num2.intValue();
                    int i5 = i1zVar4.q;
                    if (i5 - iIntValue2 < Math.min(30, i5)) {
                        t5g1Var = c481Var.i;
                        if (t5g1Var != null) {
                            str2 = null;
                        } else {
                            str2 = null;
                        }
                        arrayList = new ArrayList();
                        while (r5.hasNext()) {
                            i1zVar2 = (i1z) obj;
                            if (i1zVar2.a.equals(str2)) {
                            }
                        }
                        if (arrayList.isEmpty()) {
                            z = false;
                        } else {
                            it = arrayList.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    i1zVar = (i1z) it.next();
                                    if (!i1zVar.s) {
                                        num = i1zVar.r;
                                        if (num != null) {
                                            iIntValue = num.intValue();
                                            i = i1zVar.q;
                                            if (i - iIntValue >= Math.min(30, i)) {
                                            }
                                        }
                                    }
                                    z = true;
                                } else {
                                    z = false;
                                }
                            }
                        }
                        i2 = c481Var.e;
                        if (i2 > 0) {
                            z2 = z;
                        } else if (g281Var.q.length() > 0) {
                            z2 = false;
                        }
                    }
                } else {
                    t5g1Var = c481Var.i;
                    if (t5g1Var != null) {
                        str2 = null;
                    } else {
                        str2 = null;
                    }
                    arrayList = new ArrayList();
                    while (r5.hasNext()) {
                        i1zVar2 = (i1z) obj;
                        if (i1zVar2.a.equals(str2)) {
                        }
                    }
                    if (arrayList.isEmpty()) {
                        z = false;
                    } else {
                        it = arrayList.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                i1zVar = (i1z) it.next();
                                if (!i1zVar.s) {
                                    num = i1zVar.r;
                                    if (num != null) {
                                        iIntValue = num.intValue();
                                        i = i1zVar.q;
                                        if (i - iIntValue >= Math.min(30, i)) {
                                        }
                                    }
                                }
                                z = true;
                            } else {
                                z = false;
                            }
                        }
                    }
                    i2 = c481Var.e;
                    if (i2 > 0) {
                        z2 = z;
                    } else if (g281Var.q.length() > 0) {
                        z2 = false;
                    }
                }
            }
            z2 = true;
        }
        cen cenVar = g281Var.j;
        tu00 tu00Var = g281Var.y;
        String strA = cenVar.a(1);
        v6v0 v6v0VarA = tu00Var.a(v6v0.class);
        int i6 = v6v0VarA != null ? v6v0VarA.a.a : 0;
        v6v0 v6v0VarA2 = tu00Var.a(v6v0.class);
        return new zuz0(strA, z2, i6, v6v0VarA2 != null ? Boolean.valueOf(v6v0VarA2.c.c) : null, Boolean.valueOf(g281Var.x));
    }

    public Single l(String str, int i, gk21 gk21Var) {
        sb40 sb40Var = (sb40) this.b;
        if (i == 0) {
            return Single.just(ek21.a);
        }
        if (gk21Var != null) {
            Single singleJust = Single.just(gk21Var);
            singleJust.getClass();
            return singleJust;
        }
        Single singleFirstOrError = sb40Var.c().map(wdx0.g).firstOrError();
        Boolean bool = Boolean.FALSE;
        Single map = Single.zip(singleFirstOrError.onErrorReturnItem(bool), sb40Var.c().map(pdx0.g).firstOrError().onErrorReturnItem(bool).concatMap(new uxy0((Object) this, (Object) str, (byte) 25)), ((Flowable) this.e).J(kcx0.g).C(new tz01(this, (byte) 7), false, Integer.MAX_VALUE).z(), gex0.g).map(hgx0.g);
        map.getClass();
        return map;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public Object m(String str, String str2, List list, onm onmVar, boolean z) {
        dp11 dp11Var;
        if (onmVar instanceof dp11) {
            dp11Var = (dp11) onmVar;
            int i = dp11Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                dp11Var.c = i - Integer.MIN_VALUE;
            } else {
                dp11Var = new dp11(this, onmVar);
            }
        } else {
            dp11Var = new dp11(this, onmVar);
        }
        dp11 dp11Var2 = dp11Var;
        Object obj = dp11Var2.a;
        int i2 = dp11Var2.c;
        if (i2 == 0) {
            hm5.M(obj);
            bq11 bq11Var = (bq11) ((idd1) this.b).getValue();
            dp11Var2.c = 1;
            d9n d9nVarC = bq11.c(bq11Var, str, str2, list, (String) null, (Long) null, (wp11) null, z, dp11Var2, 120);
            d9n d9nVar = d9n.a;
            if (d9nVarC == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
            Object obj2 = ((e331) obj).a;
        }
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0079, code lost:
    
        if (p.fc11.i(r6, r0) == r5) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object n(int r7, java.lang.String r8, p.onm r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof p.uuz0
            if (r0 == 0) goto L13
            r0 = r9
            p.uuz0 r0 = (p.uuz0) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            p.uuz0 r0 = new p.uuz0
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.c
            int r1 = r0.e
            r2 = 2
            r3 = 1
            r4 = 0
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L39
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2b
            p.hm5.M(r9)
            goto L7c
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r6)
            return r4
        L31:
            int r7 = r0.b
            java.lang.String r8 = r0.a
            p.hm5.M(r9)
            goto L61
        L39:
            p.hm5.M(r9)
            p.zrz0 r9 = com.spotify.ratingsandreviews.ratings.model.proto.RateRequest.n()
            r9.n(r7)
            com.google.protobuf.h r9 = r9.build()
            com.spotify.ratingsandreviews.ratings.model.proto.RateRequest r9 = (com.spotify.ratingsandreviews.ratings.model.proto.RateRequest) r9
            java.lang.Object r1 = r6.c
            p.itz0 r1 = (p.itz0) r1
            r9.getClass()
            io.reactivex.rxjava3.core.Completable r9 = r1.b(r8, r9)
            r0.a = r8
            r0.b = r7
            r0.e = r3
            java.lang.Object r9 = p.fc11.i(r9, r0)
            if (r9 != r5) goto L61
            goto L7b
        L61:
            java.lang.Object r6 = r6.d
            p.kv00 r6 = (p.kv00) r6
            java.util.List r8 = java.util.Collections.singletonList(r8)
            java.lang.Class<p.v6v0> r9 = p.v6v0.class
            io.reactivex.rxjava3.core.Completable r6 = r6.a(r9, r8)
            r0.a = r4
            r0.b = r7
            r0.e = r2
            java.lang.Object r6 = p.fc11.i(r6, r0)
            if (r6 != r5) goto L7c
        L7b:
            return r5
        L7c:
            p.rih1 r6 = p.rih1.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p.kdy0.n(int, java.lang.String, p.onm):java.lang.Object");
    }

    public CompletableOnErrorComplete o(adz0 adz0Var, ou80 ou80Var) {
        Completable completableFlatMapCompletable = rqt0.F((q8n) this.e, new l4f0(this, (lnm) null, (byte) 25)).flatMapCompletable(new l0x0(this, adz0Var, ou80Var, (byte) 18));
        completableFlatMapCompletable.getClass();
        return completableFlatMapCompletable.o(Functions.h);
    }

    public Object p(onm onmVar) {
        Object objI = ((bq11) ((idd1) this.b).getValue()).i(onmVar);
        return objI == d9n.a ? objI : rih1.a;
    }

    public void q(View view) {
        n7h1 n7h1Var;
        jdy0 jdy0Var = (jdy0) ((LinkedHashMap) this.b).remove(view);
        if (jdy0Var != null) {
            jdy0Var.a.b();
            t480 t480Var = jdy0Var.c;
            if (t480Var == null || (n7h1Var = (n7h1) this.d) == null) {
                return;
            }
            n7h1Var.e(t480Var);
        }
    }

    public kdy0(pp11 pp11Var, iac0 iac0Var, PlayOrigin playOrigin) {
        this.a = (byte) 18;
        this.c = pp11Var;
        this.d = iac0Var;
        this.e = playOrigin;
        this.b = new idd1(new vwz0(this, (byte) 20));
    }

    public kdy0(nm31 nm31Var, yqg yqgVar, zg4 zg4Var, q8n q8nVar) {
        this.a = (byte) 27;
        this.c = nm31Var;
        this.d = yqgVar;
        this.e = zg4Var;
        this.b = us71.h(q8nVar);
    }

    public kdy0(itz0 itz0Var, kv00 kv00Var, h481 h481Var, mka mkaVar, Optional optional) {
        this.a = (byte) 10;
        this.c = itz0Var;
        this.d = kv00Var;
        this.e = h481Var;
        this.b = optional;
    }

    public kdy0(dg90 dg90Var, pob pobVar, bah1 bah1Var) {
        this.a = (byte) 4;
        this.c = pobVar;
        this.d = bah1Var;
        this.e = new f5y0(dg90Var.d(), this, (byte) 5);
        this.b = new h5y0(dg90Var.d(), (byte) 5);
    }

    public /* synthetic */ kdy0(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = obj4;
    }

    public kdy0(q8n q8nVar, cir0 cir0Var) {
        this.a = (byte) 9;
        this.c = q8nVar;
        dt71 dt71VarE = mgo1.e(0, 1, 2, 1);
        this.d = dt71VarE;
        this.e = d5p1.g(dt71VarE);
        this.b = cir0Var.h().a(i7w0.d, new wj1(this, (byte) 27));
    }

    public kdy0(zwz0 zwz0Var, q8n q8nVar, r3b1 r3b1Var, vwz0 vwz0Var) {
        this.a = (byte) 11;
        hhp0 hhp0Var = hhp0.a;
        this.c = r3b1Var;
        this.d = vwz0Var;
        this.e = hhp0Var;
        llm llmVarE = smo1.e(flo1.l(q8nVar, new z8n("ReachabilityEventIntegration")));
        this.b = llmVarE;
        fn31.T(llmVarE, (o8n) null, 0, new pew0(zwz0Var, this, false, (lnm) null, (byte) 28), 3);
    }

    public kdy0(nma0 nma0Var) {
        this.a = (byte) 28;
        this.e = "";
        this.b = "";
        this.c = nma0Var;
        this.d = nma0Var.getDescriptor().h();
    }

    public kdy0(i8h1 i8h1Var, n7h1 n7h1Var) {
        this.a = (byte) 0;
        this.c = i8h1Var;
        this.d = n7h1Var;
        this.e = new i7h1(cnx0.X0, cnx0.Y0);
        this.b = new LinkedHashMap();
    }

    public kdy0(ftr ftrVar, Context context, i3h i3hVar) {
        this.a = (byte) 14;
        this.c = ftrVar;
        this.d = context;
        this.e = i3hVar;
        Locale locale = new Locale(upn1.m());
        this.b = new SimpleDateFormat(cy30.o("EEEE", cy30.o("MMMM", ((SimpleDateFormat) DateFormat.getDateInstance(0, locale)).toPattern(), "MMM"), "EEE"), locale);
    }

    public kdy0(Context context) {
        this.a = (byte) 22;
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        this.c = context;
        this.d = executorServiceNewSingleThreadExecutor;
        this.e = new xjn1(context, jz40.c, (byte) 1);
        this.b = new a321(context);
    }

    public kdy0(muz muzVar, rb00 rb00Var, m141 m141Var, r630 r630Var, op31 op31Var, Scheduler scheduler, Scheduler scheduler2, q8n q8nVar, q8n q8nVar2, i8h1 i8h1Var, rrl0 rrl0Var, url0 url0Var, ccc0 ccc0Var, Context context, ayl aylVar, iyc0 iyc0Var, xrm1 xrm1Var, vlo vloVar, uu00 uu00Var, RxRouter rxRouter, iqr iqrVar, rvy0 rvy0Var) {
        this.a = (byte) 3;
        this.c = i8h1Var;
        this.d = rrl0Var;
        this.e = url0Var;
        this.b = rxRouter;
    }
}
