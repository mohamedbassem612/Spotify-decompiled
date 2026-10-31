package p;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import com.google.protobuf.Empty;
import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.callbackrouter.CallbackRouter;
import com.spotify.decipher.agent.v1.ClientSideEventRequest;
import com.spotify.decipher.agent.v1.PushNotificationTappedEvent;
import com.spotify.esperanto.esperantocosmos.CosmosCoroutineTransport;
import com.spotify.messages.ZeroFrictionAuthentication;
import com.spotify.tap.go.service.GoBluetoothService;
import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableDistinctUntilChanged;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class g9r implements dwo {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;
    public final Object d;

    public g9r(vpp0 vpp0Var, ps7 ps7Var, Scheduler scheduler, kly0 kly0Var, m94 m94Var) {
        this.a = (byte) 9;
        this.c = kly0Var;
        rku rkuVar = new rku();
        this.d = rkuVar;
        exp0 exp0Var = new exp0(eqq.m("daemon-", UUID.randomUUID()), m94Var.a(), null, 12);
        this.b = exp0Var;
        boolean zA = ((t7f0) ps7Var.b).a();
        exp0Var.b("subscribe bulk_enabled=" + zA + " seeded_false=true");
        Observable map = vpp0Var.callStream("spotify.offline_esperanto.proto.Offline", "SubscribeTotalProgress", Empty.n()).map(dj20.S0).map(new jkp0(this, (byte) 3));
        Boolean bool = Boolean.FALSE;
        Observable observableStartWithItem = map.startWithItem(bool);
        byte b = 0;
        if (zA) {
            observableStartWithItem = Observable.combineLatest(observableStartWithItem, vpp0Var.callStream("spotify.offline_esperanto.proto.Offline", "SubscribeBulkRedownloadProgress", Empty.n()).map(rh20.T0).map(new jxp0(this, b)).startWithItem(bool), a020.U0);
            observableStartWithItem.getClass();
        }
        rkuVar.b(observableStartWithItem.distinctUntilChanged().observeOn(scheduler).doOnError(new dy40(this, (byte) 13)).subscribe(new ixp0(this, (byte) 0)));
    }

    public static final /* synthetic */ jfd0 a(boolean z, boolean z2, boolean z3) {
        return new jfd0(z, z2, z3);
    }

    public static final /* synthetic */ Context b(g9r g9rVar) {
        return (Context) g9rVar.c;
    }

    public static final /* synthetic */ kly0 c(g9r g9rVar) {
        return (kly0) g9rVar.c;
    }

    public static final /* synthetic */ t961 d(g9r g9rVar) {
        return (t961) g9rVar.d;
    }

    public static final void e(g9r g9rVar, vpu vpuVar) {
        boolean z = vpuVar == vpu.a;
        mzm0 mzm0Var = mzm0.a;
        wo70 wo70Var = (oo70) g9rVar.c;
        if (z) {
            wo70Var.a(mzm0Var);
        } else {
            wo70Var.g(mzm0Var);
        }
    }

    public static String g(String str) {
        if (str == null) {
            return null;
        }
        return (ihc1.h0(str, "SystemMediaRoute2Provider", false) && ihc1.h0(str, ":", false)) ? ihc1.U0(str, ":", str) : str;
    }

    public Intent f(String str) {
        int i = GoBluetoothService.h;
        Intent intent = new Intent((Context) this.c, (Class<?>) GoBluetoothService.class);
        intent.putExtra("address", str);
        intent.putExtra("connected", true);
        return intent;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object h(i9r i9rVar, onm onmVar) {
        f9r f9rVar;
        if (onmVar instanceof f9r) {
            f9rVar = (f9r) onmVar;
            int i = f9rVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                f9rVar.d = i - Integer.MIN_VALUE;
            } else {
                f9rVar = new f9r(this, onmVar);
            }
        } else {
            f9rVar = new f9r(this, onmVar);
        }
        Object obj = f9rVar.b;
        int i2 = f9rVar.d;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                if (!(i9rVar instanceof h9r)) {
                    eg.o();
                    return null;
                }
                clg clgVarN = ClientSideEventRequest.n();
                clgVarN.n(UUID.randomUUID().toString());
                mwy0 mwy0VarN = PushNotificationTappedEvent.n();
                mwy0VarN.q();
                j851 j851Var = ((h9r) i9rVar).a;
                String str = j851Var != null ? j851Var.a : null;
                if (str == null) {
                    str = "";
                }
                mwy0VarN.r(str);
                String str2 = j851Var != null ? j851Var.b : null;
                if (str2 == null) {
                    str2 = "";
                }
                mwy0VarN.s(str2);
                String str3 = j851Var != null ? j851Var.c : null;
                if (str3 == null) {
                    str3 = "";
                }
                mwy0VarN.t(str3);
                String str4 = j851Var != null ? j851Var.d : null;
                mwy0VarN.n(str4 != null ? str4 : "");
                clgVarN.q(mwy0VarN);
                ClientSideEventRequest clientSideEventRequestBuild = clgVarN.build();
                jn7 jn7Var = (jn7) this.d;
                clientSideEventRequestBuild.getClass();
                f9rVar.a = (h9r) i9rVar;
                f9rVar.d = 1;
                Object objM0 = jn7Var.m0(clientSideEventRequestBuild, f9rVar);
                d9n d9nVar = d9n.a;
                if (objM0 == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i9rVar = f9rVar.a;
                hm5.M(obj);
            }
            rc11.a.b(i9rVar.getClass()).r();
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Logger.d(gvg.h("Decipher: failed to send client-side event type=", rc11.a.b(i9rVar.getClass()).r(), ": ", e2.getMessage()), new Object[0]);
        }
        return rih1.a;
    }

    public final void shutdown() {
        Object value;
        switch (this.a) {
            case 0:
                j9r j9rVar = (j9r) this.c;
                synchronized (j9rVar.a) {
                    j9rVar.c = null;
                }
                smo1.p((llm) this.b, (CancellationException) null);
                return;
            case 1:
                smo1.p((llm) this.b, (CancellationException) null);
                return;
            case 2:
                xab1 xab1Var = (xab1) this.d;
                if (xab1Var != null) {
                    xab1Var.d((CancellationException) null);
                }
                smo1.p((llm) this.b, (CancellationException) null);
                return;
            case 3:
                ((rku) this.b).a();
                return;
            case 4:
                ((n4f0) this.d).b(new g050(this, (byte) 24));
                ((rku) this.b).a();
                return;
            case 5:
                ((bz81) this.c).a.a();
                smo1.p((llm) this.b, (CancellationException) null);
                return;
            case 6:
                smo1.p((llm) this.b, (CancellationException) null);
                bpb1 bpb1Var = ((z5s) this.d).a;
                do {
                    value = bpb1Var.getValue();
                } while (!bpb1Var.k(value, b7x.a));
                return;
            case 7:
                ((zce0) this.c).d((jlb) this.b);
                return;
            case 8:
                ((n4f0) ((kly0) this.d).get()).b(new ivn0(this, (byte) 10));
                return;
            case 9:
                ((exp0) this.b).b("shutdown cancel_requested=true");
                ((rku) this.d).a();
                ((r0z0) ((kly0) this.c).get()).cancel();
                return;
            case 10:
                smo1.p((llm) this.b, (CancellationException) null);
                return;
            case 11:
                smo1.p((llm) this.b, (CancellationException) null);
                return;
            case 12:
                wo70 wo70Var = (oo70) this.c;
                Disposable disposable = (Disposable) this.d;
                if (disposable != null) {
                    disposable.dispose();
                }
                Disposable disposable2 = (Disposable) this.b;
                if (disposable2 != null) {
                    disposable2.dispose();
                }
                wo70 wo70Var2 = wo70Var;
                wo70Var2.g(lzm0.a);
                wo70Var2.g(mzm0.a);
                return;
            default:
                Object objH = ((ai8) ((kly0) this.b).get()).c.h();
                if (objH == null) {
                    hhg1.n("Required value was null.");
                    return;
                }
                if (((nl8) objH).a()) {
                    hma1 hma1VarEdit = ((xte0) this.d).a.edit();
                    hma1VarEdit.a(xte0.b, true);
                    hma1VarEdit.g();
                }
                ((jqt) this.c).c = null;
                return;
        }
    }

    public g9r(bz81 bz81Var, Observable observable, Scheduler scheduler, n4f0 n4f0Var) {
        this.a = (byte) 4;
        this.c = bz81Var;
        this.d = n4f0Var;
        rku rkuVar = new rku();
        this.b = rkuVar;
        rkuVar.b(observable.observeOn(scheduler).subscribe(new od30(this, (byte) 19)));
        bz81Var.b.set(false);
    }

    public g9r(oo70 oo70Var, crd crdVar, Observable observable) {
        this.a = (byte) 12;
        this.c = oo70Var;
        this.b = observable.subscribe(new dy40(this, (byte) 28));
        this.d = ((drd) crdVar).c.subscribe(new z2a1(this, (byte) 26));
    }

    public g9r(Context context, vno0 vno0Var, kly0 kly0Var, zg4 zg4Var) {
        this.a = (byte) 8;
        NotificationManager notificationManager = vno0Var.b;
        this.c = vno0Var;
        this.d = kly0Var;
        this.b = zg4Var;
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            wu7.m();
            NotificationChannel notificationChannelH = wu7.h(context.getString(2131954915));
            if (i >= 26) {
                kw7.q(notificationManager, notificationChannelH);
            }
            if (zg4Var.m()) {
                wu7.m();
                NotificationChannel notificationChannelJ = wu7.j(context.getString(2131958571));
                if (i >= 26) {
                    kw7.q(notificationManager, notificationChannelJ);
                }
            }
        }
    }

    public g9r(jqt jqtVar, p3n1 p3n1Var, xte0 xte0Var, kly0 kly0Var) {
        List<ZeroFrictionAuthentication> listL1;
        this.a = (byte) 13;
        this.c = jqtVar;
        this.d = xte0Var;
        this.b = kly0Var;
        nt71 nt71Var = p3n1Var.b;
        synchronized ("authenticated_message_lock") {
            dma1 dma1Var = nt71Var.a;
            bma1 bma1Var = nt71.b;
            String strE = dma1Var.e(bma1Var, (String) null);
            listL1 = o7h.l1(strE != null ? x3p1.k(strE) : z6x.a);
            z6x z6xVar = z6x.a;
            hma1 hma1VarEdit = nt71Var.a.edit();
            hma1VarEdit.d(bma1Var, x3p1.p(z6xVar));
            hma1VarEdit.g();
        }
        for (ZeroFrictionAuthentication zeroFrictionAuthentication : listL1) {
            zeroFrictionAuthentication.getClass();
            p3n1Var.a.a(zeroFrictionAuthentication);
        }
        hma1 hma1VarEdit2 = ((xte0) this.d).a.edit();
        hma1VarEdit2.a(xte0.b, false);
        hma1VarEdit2.g();
    }

    public g9r(n4f0 n4f0Var, kmn0 kmn0Var, q8n q8nVar, t2j0 t2j0Var) {
        this.a = (byte) 2;
        this.c = t2j0Var;
        llm llmVarE = smo1.e(flo1.l(q8nVar, new z8n("ForcedLogoutService")));
        this.b = llmVarE;
        this.d = fn31.T(llmVarE, (o8n) null, 0, new f530(kmn0Var, this, n4f0Var, (lnm) null, (byte) 3), 3);
    }

    public g9r(q8n q8nVar, le4 le4Var, Flowable flowable, kly0 kly0Var) {
        this.a = (byte) 1;
        this.c = flowable;
        this.d = kly0Var;
        llm llmVarE = smo1.e(flo1.l(q8nVar, guo1.B()).y(new v62(olj0.T0, (byte) 7)));
        this.b = llmVarE;
        if (le4Var.a()) {
            fn31.T(llmVarE, (o8n) null, 0, new ett(this, (lnm) null, (byte) 17), 3);
        }
    }

    public g9r(zce0 zce0Var, djh0 djh0Var) {
        this.a = (byte) 7;
        this.c = zce0Var;
        this.d = djh0Var;
        jlb jlbVar = new jlb(this, (byte) 15);
        this.b = jlbVar;
        zce0Var.b(jlbVar, new IntentFilter("PausingMediaEventsLifecycleDecoupler.optionalaction.pause"));
    }

    public g9r(bz81 bz81Var, ltp0 ltp0Var, zwz0 zwz0Var, ecl eclVar, hb4 hb4Var, q8n q8nVar) {
        this.a = (byte) 5;
        this.c = bz81Var;
        this.d = ltp0Var;
        llm llmVarH = us71.h(q8nVar);
        this.b = llmVarH;
        boolean zT = hb4Var.t();
        if (zT) {
            ltp0Var.a = !(zwz0Var.a() instanceof twz0);
        }
        fn31.T(llmVarH, (o8n) null, 0, new on1(hb4Var, zT, zwz0Var, eclVar, this, (lnm) null), 3);
        bz81Var.a.b();
    }

    public g9r(Flowable flowable, g0l g0lVar, kt91 kt91Var) {
        this.a = (byte) 11;
        this.c = kt91Var;
        j0d1 j0d1VarB = guo1.B();
        fns fnsVar = igu.a;
        llm llmVarE = smo1.e(flo1.l(j0d1VarB, pyf0.a.f));
        this.b = llmVarE;
        Flowable flowable2 = ((inr) g0lVar).d().toFlowable(BackpressureStrategy.d);
        vbm[] vbmVarArr = q601.a;
        this.d = rqt0.u(new dy20(new kge(flowable2), (byte) 17));
        fn31.T(llmVarE, (o8n) null, 0, new cto0(this, flowable, (lnm) null, (byte) 25), 3);
    }

    public g9r(j9r j9rVar, CallbackRouter callbackRouter, oc4 oc4Var) {
        List listL1;
        this.a = (byte) 0;
        this.c = j9rVar;
        this.d = new jn7(new CosmosCoroutineTransport(new ny5(callbackRouter, (byte) 7)));
        this.b = smo1.e(flo1.l(guo1.B(), igu.a));
        if (oc4Var.d()) {
            m4r m4rVar = new m4r(this, (byte) 6);
            synchronized (j9rVar.a) {
                j9rVar.c = m4rVar;
                listL1 = o7h.l1(j9rVar.b);
                j9rVar.b.clear();
            }
            Iterator it = listL1.iterator();
            while (it.hasNext()) {
                m4rVar.invoke(it.next());
            }
        }
    }

    public g9r(lfd0 lfd0Var, z5s z5sVar, kly0 kly0Var, ov20 ov20Var, q8n q8nVar) {
        this.a = (byte) 6;
        this.c = lfd0Var;
        this.d = z5sVar;
        llm llmVarH = us71.h(q8nVar);
        this.b = llmVarH;
        bw20 bw20Var = (bw20) ov20Var;
        l4p1.u(llmVarH, new fu20(hu20.e(h5p1.s(yoi1.g(((hgd0) kly0Var.get()).p()), bw20Var.a("listening-activity", false), bw20Var.a("view-listening-activity", true), ifd0.h), new zz90((lnm) null, this, (byte) 8)), new e9c0(this, (lnm) null, (byte) 8), (byte) 1));
    }

    public g9r(Flowable flowable, kly0 kly0Var, q8n q8nVar) {
        this.a = (byte) 10;
        this.c = kly0Var;
        llm llmVarK = i3a.k(q8nVar);
        this.b = llmVarK;
        FlowableDistinctUntilChanged flowableDistinctUntilChangedT = flowable.x(new ypa(this, (byte) 19)).J(ws10.X0).t(Functions.a);
        vbm[] vbmVarArr = q601.a;
        this.d = new kge(flowableDistinctUntilChangedT);
        fn31.T(llmVarK, (o8n) null, 0, new i2p0(new oxa0(this, (lnm) null, (byte) 28), (lnm) null, (byte) 18), 3);
    }

    public g9r(Context context, t961 t961Var, a84 a84Var, kly0 kly0Var, Observable observable) {
        this.a = (byte) 3;
        this.c = context;
        this.d = t961Var;
        rku rkuVar = new rku();
        this.b = rkuVar;
        if (a84Var.a != null) {
            rkuVar.b(observable.filter(wdu0.S0).firstOrError().flatMapObservable(new hcs(kly0Var)).flatMapSingle(new gqr(observable, false)).subscribe(new dy40(this, (byte) 0), p.S0));
        } else {
            Logger.d("Go: Bluetooth is not supported on this hardware platform", new Object[0]);
        }
    }
}
