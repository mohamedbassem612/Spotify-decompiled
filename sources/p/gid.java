package p;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.address.endpoint.model.v1.proto.AddressCollection;
import com.spotify.address.endpoint.model.v1.proto.AddressForm;
import com.spotify.address.endpoint.model.v1.proto.SavedAddress;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.mobius.functions.Consumer;
import com.spotify.player.model.Context$Metadata;
import com.spotify.player.model.PlayerState;
import com.spotify.voiceassistants.playermodels.CommandPlayResponse;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function3;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import io.reactivex.rxjava3.internal.operators.completable.CompletableObserveOn;
import io.reactivex.rxjava3.internal.operators.completable.CompletablePeek;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromPublisher;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class gid implements Function3, Function, l381, Init, vwx0 {
    public static ExecutorService e;
    public final /* synthetic */ byte a;
    public Object b;
    public final Object c;
    public static final Object d = new Object();
    public static final ygm f = new ygm(2);

    public gid(r8n0 r8n0Var, q8n q8nVar) {
        this.a = (byte) 2;
        this.b = r8n0Var;
        this.c = us71.h(q8nVar);
    }

    public ow3 a() {
        ExecutorService executorService;
        Executor executor = (Executor) this.b;
        Object obj = executor;
        if (executor == null) {
            synchronized (d) {
                try {
                    ExecutorService executorService2 = e;
                    executorService = executorService2;
                    if (executorService2 == null) {
                        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(2);
                        e = executorServiceNewFixedThreadPool;
                        executorService = executorServiceNewFixedThreadPool;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.b = executorService;
            obj = executorService;
        }
        return new ow3(obj, (anm1) this.c, (byte) 18);
    }

    public Object apply(Object obj) {
        byte b = this.a;
        byte b2 = 1;
        Object obj2 = this.c;
        switch (b) {
            case 4:
                q981 q981Var = (s981) obj;
                hi hiVar = (hi) obj2;
                q981Var.toString();
                uj ujVar = (uj) this.b;
                boolean z = q981Var instanceof r981;
                r981 r981Var = z ? (r981) q981Var : null;
                ujVar.e = r981Var != null ? r981Var.a : null;
                if (z) {
                    Consumer consumer = ujVar.d;
                    if (consumer != null) {
                        consumer.accept(new mcr(new hj(hiVar)));
                    }
                } else {
                    if (!(q981Var instanceof q981)) {
                        eg.o();
                        return null;
                    }
                    Consumer consumer2 = ujVar.d;
                    if (consumer2 != null) {
                        consumer2.accept(new mcr(new ij(hiVar, q981Var.a)));
                    }
                }
                return CompletableEmpty.a;
            case 5:
                po poVar = (po) obj;
                bza0 bza0Var = (bza0) this.b;
                return Single.just(iwe0.a(bza0Var.b, (Context) obj2, poVar.b, poVar.a)).toObservable().map(pzs0.c).onErrorReturn(qzs0.c);
            case 6:
                return ((Observable) this.b).firstOrError().flatMapCompletable(new ycc1((oob1) obj, (pq) obj2, (byte) 4));
            case 7:
                PlayerState playerState = (PlayerState) obj;
                fc0 fc0Var = (fc0) this.b;
                qro1 qro1VarA = fc0Var.d.a.l.a(fc0Var.b.a((String) obj2));
                return qro1VarA instanceof k610 ? new eeh(2, cy30.g("com.spotify.music.extra.ERROR", "Restriction id is not available")) : new eeh(1, pzm.g("com.spotify.music.extra.IS_ACTIVE_PLAYBACK_RESTRICTED", u890.j(playerState.playOrigin().restrictionIdentifier(), qro1VarA.p())));
            case 8:
            case 10:
            case 12:
            case 14:
            case 17:
            case 18:
            case 19:
            case 20:
            case 22:
            case 23:
            case 25:
            case 27:
            default:
                mmr0 mmr0Var = (mmr0) obj;
                String str = (String) mmr0Var.a;
                String str2 = (String) mmr0Var.b;
                ajq0 ajq0Var = (ajq0) this.b;
                slc0 slc0Var = (slc0) obj2;
                return ((qi3) ((fl1) ((yo31) ajq0Var.c).b).b).a(new pjc0(str2, str)).g(new bm0(ajq0Var, slc0Var, (byte) 8)).h(new a21(ajq0Var, slc0Var, (byte) 5));
            case 9:
                li0 li0Var = (li0) this.b;
                String str3 = li0Var.a;
                ArrayList arrayListN0 = o7h.N0(li0Var.e, (List) obj2);
                b291 b291Var = li0Var.f;
                ArrayList arrayListN1 = o7h.N0(b291Var, arrayListN0);
                soa soaVarF = li0Var.c.a((qma) obj).f();
                soaVarF.w = str3;
                soaVarF.v = new ArrayList(arrayListN1);
                soaVarF.u = new w2k1();
                soaVarF.z = li0Var.d;
                soaVarF.x = false;
                soaVarF.y = true;
                uoa uoaVarA = soaVarF.a();
                Iterator it = b291Var.iterator();
                while (it.hasNext()) {
                    ((taq) it.next()).a = uoaVarA;
                }
                return uoaVarA;
            case 11:
                return new CompletableFromAction(new wf0((tm) this.b, (bpt0) obj2, (String) obj, b2));
            case 13:
                j71 j71Var = (j71) this.b;
                return j71Var.c.firstOrError().doOnSuccess(new a21(j71Var, (Intent) obj2, (byte) 1));
            case 15:
                return new ryz(((Context) ((zd1) obj2).c).getString(2131955714), ((f9w) this.b).b);
            case 16:
                tj1 tj1Var = (tj1) this.b;
                tv80 tv80Var = ((dqx0) obj2).b;
                CompletablePeek completablePeekH = ((c23) tj1Var.b.c).a().ignoreElement().h(xfs0.e1);
                Predicate predicate = Functions.h;
                return completablePeekH.o(predicate).h(nm.f).o(predicate).c(tj1Var.c.z(new hvx0((String) obj, tv80Var)));
            case 21:
                return ((qns0) ((kr60) this.b).b).b("cwp-episode-age-assurance", Collections.singletonList((String) obj2), false).onErrorReturn(qbo1.c).map(cxo1.e).toObservable();
            case 24:
                CommandPlayResponse commandPlayResponse = (CommandPlayResponse) obj;
                b13 b13Var = (b13) this.b;
                m210 m210Var = (m210) obj2;
                j2e0 j2e0Var = b13Var.c;
                com.spotify.player.model.Context context = commandPlayResponse.getContext();
                return g510.f((g510) j2e0Var.c, m210Var, context.uri(), (w7h1) null, (ou80) null, 28).flatMap(new age0(commandPlayResponse.getLoggingParams(), j2e0Var, context, commandPlayResponse.getPlayOptions(), commandPlayResponse.getPlayOrigin())).doOnSuccess(new a21(commandPlayResponse, b13Var, (byte) 4)).ignoreElement();
            case 26:
                String str4 = (String) obj;
                gid gidVar = (gid) this.b;
                return ((sjj0) gidVar.b).b(str4).map(ios.e).map(new cp5((Set) obj2, (byte) 9)).flatMap(new ycc1(gidVar, str4, (byte) 25));
            case 28:
                Map map = (Map) obj;
                return j2h1.D(o6x.a, new hl0((dc3) this.b, (String) obj2, y7y0.L(map) || rh11.c(map), (lnm) null, (byte) 2));
        }
    }

    public o3r b() {
        switch (this.a) {
            case 14:
                break;
        }
        return (o3r) this.b;
    }

    public Notification c() {
        Context context = (Context) this.b;
        dko0 dko0Var = new dko0(context, "spotify_updates_channel");
        dko0Var.g = (PendingIntent) ((xs80) this.c).d.getValue();
        Notification notification = dko0Var.D;
        notification.icon = 2131233418;
        dko0Var.e = dko0.d(context.getString(2131960369));
        dko0Var.u = context.getColor(2131102443);
        dko0Var.v = 1;
        notification.vibrate = new long[]{0};
        dko0Var.j = -1;
        dko0Var.r(new jko0());
        return dko0Var.c();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public Object d(String str, onm onmVar) {
        ty2 ty2Var;
        if (onmVar instanceof ty2) {
            ty2Var = (ty2) onmVar;
            int i = ty2Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ty2Var.c = i - Integer.MIN_VALUE;
            } else {
                ty2Var = new ty2(this, onmVar);
            }
        } else {
            ty2Var = new ty2(this, onmVar);
        }
        ty2 ty2Var2 = ty2Var;
        Object objA = ty2Var2.a;
        int i2 = ty2Var2.c;
        swx0 swx0Var = swx0.a;
        String str2 = null;
        try {
            if (i2 == 0) {
                hm5.M(objA);
                vqv0 vqv0Var = (vqv0) this.c;
                m210 m210Var = new m210("AndroidUnauth", "", "", "", "", "", "", "", "", "", str);
                Iterator it = ((b291) vqv0Var.b).iterator();
                while (it.hasNext()) {
                    String strA = ((sig) it.next()).a(m210Var);
                    if (strA != null) {
                        str2 = strA;
                        break;
                    }
                }
                if (str2 == null) {
                    n57.e("No client context registered for calling package: ".concat(str));
                    return swx0Var;
                }
                oyx0 oyx0Var = (oyx0) this.b;
                ty2Var2.c = 1;
                objA = oyx0.a(oyx0Var, str2, (String) null, ty2Var2, 2, (Object) null);
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
            List list = ((gfh1) objA).a;
            ArrayList arrayList = new ArrayList(q7h.U(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(((dfh1) it2.next()).a);
            }
            return new twx0(arrayList);
        } catch (CancellationException e2) {
            throw e2;
        } catch (Exception unused) {
            return swx0Var;
        }
    }

    public ObservableFromPublisher e() {
        Flowable flowable = (Flowable) this.b;
        Flowable flowableH = Flowable.h(flowable.x(ios.d).J(fmv.d).t(Functions.a), flowable.j(mo9.t), new w4b1(this, (byte) 11));
        flowableH.getClass();
        return new ObservableFromPublisher(flowableH);
    }

    public First e0(Object obj) {
        AddressCollection addressCollectionU;
        sgm0 sgm0Var = (jhm0) this.b;
        m12 m12Var = ((q22) this.c).a;
        boolean z = sgm0Var instanceof ugm0;
        k12 k12Var = k12.b;
        k12 k12Var2 = k12.a;
        if (z) {
            if (m12Var instanceof l12) {
                return First.c(sgm0Var, Collections.singleton(mbw.a));
            }
            if (!(m12Var instanceof m12)) {
                eg.o();
                return null;
            }
            try {
                addressCollectionU = AddressCollection.u(m12Var.d.q());
            } catch (Exception e2) {
                n57.g("Impossible to convert Any to AddressCollection", e2);
                addressCollectionU = null;
            }
            xgm0 xgm0Var = xgm0.a;
            if (addressCollectionU == null) {
                return First.b(xgm0Var);
            }
            if (AddressForm.q().equals(addressCollectionU.n())) {
                return First.b(xgm0Var);
            }
            return SavedAddress.q().equals(addressCollectionU.r()) ? First.c(new sgm0(addressCollectionU, new lgm0((Map) null, 3), false), f46.S0(new liw[]{new jhw(k12Var2), new ecw(addressCollectionU.q().o(), 1)})) : First.c(new sgm0(addressCollectionU, ogm0.a, false), f46.S0(new liw[]{new jhw(k12Var), new ecw(addressCollectionU.q().o(), 2)}));
        }
        if ((sgm0Var instanceof hgm0) || (sgm0Var instanceof xgm0)) {
            return First.b(sgm0Var);
        }
        if (!(sgm0Var instanceof sgm0)) {
            eg.o();
            return null;
        }
        ngm0 ngm0Var = sgm0Var.b;
        if ((ngm0Var instanceof lgm0) || (ngm0Var instanceof mgm0)) {
            return First.c(sgm0Var, Collections.singleton(new jhw(k12Var2)));
        }
        if (ngm0Var instanceof ogm0) {
            return First.c(sgm0Var, Collections.singleton(new jhw(k12Var)));
        }
        if (ngm0Var instanceof ngm0) {
            return First.c(sgm0Var, f46.S0(new liw[]{new uew(ngm0Var.a), new jhw(k12Var2)}));
        }
        eg.o();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object f(g9w g9wVar, onm onmVar) {
        sy1 sy1Var;
        if (onmVar instanceof sy1) {
            sy1Var = (sy1) onmVar;
            int i = sy1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                sy1Var.c = i - Integer.MIN_VALUE;
            } else {
                sy1Var = new sy1(this, onmVar);
            }
        } else {
            sy1Var = new sy1(this, onmVar);
        }
        Object obj = sy1Var.a;
        int i2 = sy1Var.c;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                aas aasVar = (aas) this.b;
                String str = g9wVar.a;
                y6r0 y6r0Var = ((b7r0) this.c).get();
                String str2 = y6r0Var != null ? y6r0Var.a : null;
                if (str2 == null) {
                    str2 = "";
                }
                CompletableObserveOn completableObserveOnB = aasVar.b(str, str2, 2, g9wVar.b);
                sy1Var.c = 1;
                Object objI = fc11.i(completableObserveOnB, sy1Var);
                d9n d9nVar = d9n.a;
                if (objI == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
            }
            return uw00.a;
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th) {
            String message = th.getMessage();
            if (message == null) {
                message = "Failed to add to queue";
            }
            return new sw00(message);
        }
    }

    public void g(String str) {
        i8h1 i8h1Var = (i8h1) this.b;
        py9 py9Var = (py9) this.c;
        x6h1 x6h1VarC = py9Var.c.c();
        x6h1VarC.i.add(new a7h1("age_verification_popup", (String) null, (Integer) null, str, (String) null));
        x6h1VarC.j = true;
        x6h1 x6h1VarC2 = x6h1VarC.a().c();
        x6h1VarC2.i.add(new a7h1("next_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC2.j = false;
        i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("navigate_to_external_uri", 1, Collections.singletonMap("destination", "")), x6h1VarC2.a(), py9Var.b, System.currentTimeMillis()), (xj61) null);
    }

    public void h(fq0 fq0Var, String str, String str2, String str3) {
        jjh1 jjh1Var = (jjh1) this.b;
        ji0 ji0Var = (ji0) jjh1Var.a.get(fq0Var.a());
        xn0 xn0Var = (xn0) this.c;
        if (ji0Var != null) {
            xn0Var.a(new ijh1(fq0Var.a(), ji0Var.h, str, str2, ji0Var.t, str3, null));
        } else {
            xn0Var.a(new jhg0(fq0Var.a(), str, str2, fq0Var.k(), str3));
        }
    }

    public void j(vi7 vi7Var) {
        this.b = vi7Var;
    }

    public void k() {
        ((ohv0) this.b).a(new nhv0("adaptive_authentication", ((b2r0) this.c).Y.c.a));
    }

    public void l(int i, int i2) {
        p6r0 p6r0VarG1;
        ohv0 ohv0Var = (ohv0) this.b;
        int iC = l1d.C(i);
        if (iC == 0) {
            AtomicReferenceArray atomicReferenceArray = p6r0.e;
            p6r0VarG1 = yon1.G1("AGE_SIGNAL_SIGNUP_CONFIRM_AGE", "age-signal/signup/confirm-age", 134, "age-signal");
        } else if (iC == 1) {
            AtomicReferenceArray atomicReferenceArray2 = p6r0.e;
            p6r0VarG1 = yon1.G1("AGE_SIGNAL_SIGNUP_ASK_PARENT", "age-signal/signup/ask-parent", 133, "age-signal");
        } else if (iC != 2) {
            eg.o();
            return;
        } else {
            AtomicReferenceArray atomicReferenceArray3 = p6r0.e;
            p6r0VarG1 = yon1.G1("AGE_SIGNAL_SIGNUP_MANAGED_ACCOUNT", "age-signal/signup/managed-account", 135, "age-signal");
        }
        ohv0Var.a(new lhv0(p6r0VarG1.c, kk0.y(i2).toLowerCase(Locale.ROOT)));
    }

    public void m(int i, String str) {
        ((ohv0) this.b).a(new jhv0("adaptive_authentication", zjy.h(i), Context$Metadata.SHUFFLE_ALGORITHM_NONE, str));
    }

    /* JADX WARN: Code duplicated, block: B:57:0x0109  */
    public Object n(Object obj, Object obj2, Object obj3) {
        String str;
        String str2;
        String str3;
        String strConcat;
        r98 r98Var;
        io70 io70Var;
        uv00 uv00Var = (uv00) obj;
        mmr0 mmr0Var = (mmr0) obj2;
        i1r i1rVar = (k1r) obj3;
        boolean zBooleanValue = ((Boolean) mmr0Var.a).booleanValue();
        boolean zBooleanValue2 = ((Boolean) mmr0Var.b).booleanValue();
        String str4 = (String) this.b;
        zc8 zc8Var = uv00Var.a(zc8.class, str4).b;
        jo70 jo70Var = uv00Var.a(jo70.class, str4).b;
        String str5 = jo70Var != null ? jo70Var.a : null;
        pnt pntVar = uv00Var.a(pnt.class, str4).b;
        String str6 = pntVar != null ? pntVar.a : null;
        l98 l98Var = uv00Var.a(l98.class, str4).b;
        ArrayList<j98> arrayListJ = l98Var != null ? pwo1.j(l98Var.a) : null;
        f7l1 f7l1Var = uv00Var.a(f7l1.class, str4).b;
        sqe sqeVar = f7l1Var != null ? f7l1Var.a : null;
        y6l1 y6l1Var = sqeVar instanceof y6l1 ? (y6l1) sqeVar : null;
        j7o j7oVar = uv00Var.a(j7o.class, str4).b;
        ArrayList arrayList = new ArrayList();
        e4 e4Var = (e4) this.c;
        if (y6l1Var == null || (i1rVar instanceof j1r)) {
            str = str5;
            str2 = null;
        } else {
            if (i1rVar instanceof i1r) {
                gix0 gix0Var = (iix0) i1rVar.a;
                if (gix0Var instanceof gix0) {
                    str = str5;
                    str2 = null;
                    long j = gix0Var.c;
                    ytw0 ytw0Var = jfv.b;
                    if (j < jfv.h(fdg1.k0(10, ngv.f))) {
                    }
                } else {
                    str = str5;
                    str2 = null;
                }
            } else {
                str = str5;
                str2 = null;
                if (!(i1rVar instanceof h1r)) {
                    eg.o();
                    return null;
                }
            }
            oid1 oid1Var = oid1.a;
            arrayList.add(new h8k1(oid1Var, oid1Var));
        }
        boolean z = (zc8Var == null || !(ihc1.y0(zc8Var.h) ^ true) || (ihc1.y0(zc8Var.g) && ihc1.y0(zc8Var.i))) ? false : true;
        if (jo70Var == null || (io70Var = jo70Var.e) == null) {
            str3 = str2;
        } else {
            str3 = io70Var.b;
            if (ihc1.y0(str3)) {
                str3 = str2;
            }
        }
        boolean z2 = e4Var.e && str3 != null && z;
        if (z && !z2) {
            kid1 kid1Var = kid1.a;
            arrayList.add(new h8k1(kid1Var, kid1Var));
        }
        if (str != null && str.length() > 67) {
            mid1 mid1Var = new mid1(str);
            arrayList.add(new h8k1(mid1Var, mid1Var));
        }
        if ((zc8Var != null ? a8o.z(zc8Var) : str2) instanceof onb) {
            iid1 iid1Var = iid1.a;
            arrayList.add(new h8k1(iid1Var, iid1Var));
        }
        if (str6 != null && (!ihc1.y0(str6))) {
            whd1 whd1Var = whd1.a;
            arrayList.add(new h8k1(whd1Var, whd1Var));
        }
        if (z2) {
            wid1 wid1Var = wid1.a;
            arrayList.add(new h8k1(wid1Var, wid1Var));
        }
        if (e4Var.c && zBooleanValue) {
            a7q0 a7q0Var = uv00Var.a(a7q0.class, str4).b;
            String str7 = a7q0Var != null ? a7q0Var.d : str2;
            boolean z3 = (str7 == null || ((y6q0) str7).c == null || ((y6q0) str7).b < 5) ? false : true;
            if (z3 || !zBooleanValue2) {
                tid1 tid1Var = tid1.a;
                arrayList.add(new h8k1(tid1Var, tid1Var));
            }
            if (z3) {
                vid1 vid1Var = vid1.a;
                arrayList.add(new h8k1(vid1Var, vid1Var));
            }
            if (!zBooleanValue2) {
                uid1 uid1Var = uid1.a;
                arrayList.add(new h8k1(uid1Var, uid1Var));
            }
        }
        if (e4Var.d && (r98Var = uv00Var.a(r98.class, str4).b) != null && !r98Var.a.isEmpty()) {
            sid1 sid1Var = sid1.a;
            arrayList.add(new h8k1(sid1Var, sid1Var));
        }
        if (arrayListJ != null && (!arrayListJ.isEmpty())) {
            gid1 gid1Var = gid1.a;
            arrayList.add(new h8k1(gid1Var, gid1Var));
            ArrayList arrayList2 = new ArrayList(q7h.U(arrayListJ, 10));
            for (j98 j98Var : arrayListJ) {
                arrayList2.add(new cid1(j98Var.b, j98Var.a));
            }
            eid1 eid1Var = new eid1(arrayList2);
            arrayList.add(new h8k1(eid1Var, eid1Var));
        }
        if (j7oVar != null) {
            ArrayList arrayList3 = j7oVar.a;
            if (!arrayList3.isEmpty()) {
                boolean z4 = e4Var.g.a;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj4 : arrayList3) {
                    String str8 = ((g7o) obj4).a;
                    Object objH = linkedHashMap.get(str8);
                    if (objH == null) {
                        objH = cfm0.h(str8, linkedHashMap);
                    }
                    ((List) objH).add(obj4);
                }
                ArrayList arrayList4 = new ArrayList(linkedHashMap.size());
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    String str9 = (String) entry.getKey();
                    List<g7o> list = (List) entry.getValue();
                    ArrayList arrayList5 = new ArrayList(q7h.U(list, 10));
                    for (g7o g7oVar : list) {
                        arrayList5.add(new rid1(g7oVar.b, z4 && g7oVar.f != null));
                    }
                    Iterator it = list.iterator();
                    do {
                        if (!it.hasNext()) {
                            strConcat = str2;
                            break;
                        }
                        strConcat = ((g7o) it.next()).c;
                    } while (strConcat == null);
                    if (strConcat == null) {
                        strConcat = "spotify:search:".concat(d1o1.i(str9));
                        if (!e4Var.b) {
                            strConcat = str2;
                        }
                    }
                    arrayList4.add(new pid1(str9, strConcat, arrayList5));
                }
                qid1 qid1Var = new qid1(arrayList4);
                arrayList.add(new h8k1(qid1Var, qid1Var));
                List<pid1> listD1 = o7h.d1(arrayList4, 3);
                ArrayList arrayList6 = new ArrayList(q7h.U(listD1, 10));
                for (pid1 pid1Var : listD1) {
                    arrayList6.add(new h8k1(pid1Var, pid1Var));
                }
                arrayList.addAll(arrayList6);
            }
        }
        if (zc8Var != null && jo70Var != null) {
            aid1 aid1Var = aid1.a;
            arrayList.add(new h8k1(aid1Var, aid1Var));
            yhd1 yhd1Var = yhd1.a;
            arrayList.add(new h8k1(yhd1Var, yhd1Var));
        }
        return arrayList;
    }

    public void o() {
        ((ohv0) this.b).a(new lhv0("adaptive_authentication", "registration_disabled_popup"));
    }

    public void p() {
        ((ohv0) this.b).a(new lhv0("adaptive_authentication", "too_young_error"));
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003d  */
    public boolean t(Object obj) {
        byte b = this.a;
        Object obj2 = this.c;
        switch (b) {
            case 14:
                qxc0 qxc0Var = (qxc0) obj;
                if (qxc0Var.t.b) {
                    return ((id1) obj2).c || !gyo1.L(qxc0Var.O0);
                }
                return false;
            default:
                ym1 ym1Var = (ym1) obj;
                bn1 bn1Var = (bn1) obj2;
                qxc0 qxc0Var2 = ym1Var.a;
                qp31 qp31Var = ym1Var.b;
                if (qxc0Var2.h || u890.j(qxc0Var2.X.get("owner_username"), (String) bn1Var.f)) {
                    if (qp31Var != null || !qp31Var.a || ym1Var.c) {
                        return false;
                    }
                } else if (qp31Var == null || !qp31Var.a) {
                    Set set = s4b1.f;
                    if (uic.x(bn1Var.b).c != blc0.g1) {
                        return qp31Var != null ? false : false;
                    }
                }
                return true;
        }
    }

    public /* synthetic */ gid(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public gid(ConstraintLayout constraintLayout, a0b a0bVar, ProgressBar progressBar) {
        this.a = (byte) 8;
        this.b = constraintLayout;
        this.c = progressBar;
    }

    public gid(id1 id1Var) {
        this.a = (byte) 14;
        this.c = id1Var;
        this.b = id1Var.f;
    }

    public gid(bn1 bn1Var) {
        this.a = (byte) 17;
        this.c = bn1Var;
        this.b = bn1Var.e;
    }

    public gid(anm1 anm1Var) {
        this.a = (byte) 1;
        this.c = anm1Var;
    }
}
