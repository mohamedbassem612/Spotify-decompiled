package p;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattServer;
import android.bluetooth.BluetoothGattService;
import android.bluetooth.BluetoothManager;
import android.bluetooth.le.AdvertiseData;
import android.bluetooth.le.AdvertiseSettings;
import android.bluetooth.le.BluetoothLeAdvertiser;
import android.content.Context;
import android.os.Build;
import android.os.ParcelUuid;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobius.EventSource;
import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.performancesdk.observationplatform.integrations.cpp.OopsBridge;
import com.spotify.playbacknative.AudioDeviceInfoFacade;
import com.spotify.playbacknative.AudioRenderer;
import com.spotify.playbacknative.AudioRouteListenerHandler;
import com.spotify.playbacknative.AudioTrackAdapter;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromPublisher;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class km0 implements dwo {
    public final /* synthetic */ byte a;
    public Object b;
    public final Object c;

    public km0(aqd1 aqd1Var, gqd1 gqd1Var) {
        this.a = (byte) 26;
        this.c = aqd1Var;
        this.b = gqd1Var;
        if (aqd1Var.a.isEnabled() && aqd1Var.b.isEnabled() && !aqd1Var.c.isEnabled()) {
            fn31.T(aqd1Var.g, (o8n) null, 0, new pec1(aqd1Var, (lnm) null, (byte) 8), 3);
        }
        if (gqd1Var.a.isEnabled() && gqd1Var.b.isEnabled() && gqd1Var.c.isEnabled()) {
            vi11 vi11Var = gqd1Var.d;
            Context context = (Context) vi11Var.b;
            Object systemService = context.getSystemService("bluetooth");
            BluetoothManager bluetoothManager = systemService instanceof BluetoothManager ? (BluetoothManager) systemService : null;
            if (bluetoothManager == null) {
                Logger.d("Tap BLE Peripheral: Bluetooth not available", new Object[0]);
            } else {
                BluetoothAdapter adapter = bluetoothManager.getAdapter();
                if (adapter == null) {
                    Logger.d("Tap BLE Peripheral: Bluetooth not available", new Object[0]);
                } else {
                    BluetoothGattServer bluetoothGattServerOpenGattServer = bluetoothManager.openGattServer(context, (wpd1) vi11Var.f);
                    if (bluetoothGattServerOpenGattServer == null) {
                        Logger.d("Tap BLE Peripheral: Failed to open GATT server", new Object[0]);
                    } else {
                        vi11Var.d = bluetoothGattServerOpenGattServer;
                        BluetoothGattCharacteristic bluetoothGattCharacteristic = new BluetoothGattCharacteristic(bqd1.b, 8, 32);
                        UUID uuid = bqd1.a;
                        BluetoothGattService bluetoothGattService = new BluetoothGattService(uuid, 0);
                        bluetoothGattService.addCharacteristic(bluetoothGattCharacteristic);
                        bluetoothGattServerOpenGattServer.addService(bluetoothGattService);
                        BluetoothLeAdvertiser bluetoothLeAdvertiser = adapter.getBluetoothLeAdvertiser();
                        if (bluetoothLeAdvertiser == null) {
                            Logger.d("Tap BLE Peripheral: BLE advertiser not available", new Object[0]);
                        } else {
                            AdvertiseSettings advertiseSettingsBuild = new AdvertiseSettings.Builder().setAdvertiseMode(0).setConnectable(true).build();
                            AdvertiseData advertiseDataBuild = new AdvertiseData.Builder().addServiceUuid(new ParcelUuid(uuid)).setIncludeDeviceName(false).build();
                            xpd1 xpd1Var = new xpd1();
                            vi11Var.e = xpd1Var;
                            bluetoothLeAdvertiser.startAdvertising(advertiseSettingsBuild, advertiseDataBuild, xpd1Var);
                        }
                    }
                }
            }
            fn31.T(gqd1Var.f, (o8n) null, 0, new xba1(gqd1Var, (lnm) null, (byte) 21), 3);
        }
    }

    public static final /* synthetic */ a3e a(km0 km0Var) {
        return (a3e) km0Var.c;
    }

    public static final /* synthetic */ juq0 b(km0 km0Var) {
        return (juq0) km0Var.c;
    }

    public static final /* synthetic */ i4s0 c(km0 km0Var) {
        return (i4s0) km0Var.c;
    }

    public static final /* synthetic */ ceh1 d(km0 km0Var) {
        return (ceh1) km0Var.c;
    }

    public static final /* synthetic */ Context e(km0 km0Var) {
        return (Context) km0Var.c;
    }

    public static final /* synthetic */ vhb1 f(km0 km0Var) {
        return (vhb1) km0Var.c;
    }

    public static final /* synthetic */ wpu g(km0 km0Var) {
        return (wpu) km0Var.c;
    }

    public static final /* synthetic */ dp60 h(km0 km0Var) {
        return (dp60) km0Var.c;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005e, code lost:
    
        if (p.be91.a((p.be91) r9, r2, r3, (java.util.Map) null, r5, 12) == r8) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object i(p.onm r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof p.jm0
            if (r0 == 0) goto L14
            r0 = r10
            p.jm0 r0 = (p.jm0) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.c = r1
        L12:
            r5 = r0
            goto L1a
        L14:
            p.jm0 r0 = new p.jm0
            r0.<init>(r9, r10)
            goto L12
        L1a:
            java.lang.Object r10 = r5.a
            int r0 = r5.c
            java.lang.Object r9 = r9.c
            p.qc91 r3 = p.qc91.d
            r7 = 2
            r1 = 1
            p.d9n r8 = p.d9n.a
            if (r0 == 0) goto L3b
            if (r0 == r1) goto L37
            if (r0 != r7) goto L30
            p.hm5.M(r10)
            goto L61
        L30:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r9)
            r9 = 0
            return r9
        L37:
            p.hm5.M(r10)
            goto L50
        L3b:
            p.hm5.M(r10)
            r10 = r1
            r1 = r9
            p.be91 r1 = (p.be91) r1
            p.jx0 r2 = p.jx0.c
            r5.c = r10
            r4 = 0
            r6 = 12
            java.lang.Object r10 = p.be91.a(r1, r2, r3, r4, r5, r6)
            if (r10 != r8) goto L50
            goto L60
        L50:
            r1 = r9
            p.be91 r1 = (p.be91) r1
            p.jx0 r2 = p.jx0.b
            r5.c = r7
            r4 = 0
            r6 = 12
            java.lang.Object r9 = p.be91.a(r1, r2, r3, r4, r5, r6)
            if (r9 != r8) goto L61
        L60:
            return r8
        L61:
            p.rih1 r9 = p.rih1.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p.km0.i(p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object j(String str, lnm lnmVar) {
        c9o0 c9o0Var;
        if (lnmVar instanceof c9o0) {
            c9o0Var = (c9o0) lnmVar;
            int i = c9o0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                c9o0Var.c = i - Integer.MIN_VALUE;
            } else {
                c9o0Var = new c9o0(this, lnmVar);
            }
        } else {
            c9o0Var = new c9o0(this, lnmVar);
        }
        Object obj = c9o0Var.a;
        int i2 = c9o0Var.c;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                gwy0 gwy0Var = (gwy0) ((kly0) this.c).get();
                List listSingletonList = Collections.singletonList(new iwy0(str));
                c9o0Var.c = 1;
                Object objA = gwy0Var.a("podcast_new_episode_notification", listSingletonList, 1);
                d9n d9nVar = d9n.a;
                if (objA == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            n57.g("[NewEpisodePushRemoval] Exception while removing new episode push notifications", th);
        }
        return rih1.a;
    }

    public final void shutdown() {
        BluetoothAdapter adapter;
        switch (this.a) {
            case 0:
                smo1.p((llm) this.b, (CancellationException) null);
                return;
            case 1:
                smo1.p((llm) this.b, (CancellationException) null);
                return;
            case 2:
                ((Disposable) this.b).dispose();
                return;
            case 3:
                ((Disposable) this.b).dispose();
                return;
            case 4:
                ((y2g0) this.b).a(new bb6(this, (byte) 1));
                return;
            case 5:
                njr njrVar = (njr) this.b;
                llm llmVar = njrVar.i;
                if (llmVar != null) {
                    smo1.p(llmVar, (CancellationException) null);
                }
                njrVar.i = null;
                njrVar.g = null;
                njrVar.h = 0L;
                Iterator it = ((Set) this.c).iterator();
                while (it.hasNext()) {
                    ((hi9) it.next()).stop();
                }
                return;
            case 6:
                ((y2g0) this.b).a(new ptb(this, (byte) 19));
                return;
            case 7:
                ((Disposable) this.b).dispose();
                return;
            case 8:
                ((rku) this.b).a();
                return;
            case 9:
                llm llmVar2 = (llm) this.b;
                if (llmVar2 != null) {
                    smo1.p(llmVar2, (CancellationException) null);
                    return;
                }
                return;
            case 10:
                ((vku) this.b).c();
                return;
            case 11:
                ((n4f0) this.c).b(new pdy(this, (byte) 20));
                return;
            case 12:
                d48 d48Var = (d48) this.c;
                if (!d48Var.i) {
                    a48 a48Var = d48Var.j;
                    String str = d48Var.k;
                    if (a48Var != null && str != null) {
                        d48Var.b(a48Var, str);
                    }
                }
                d48Var.h.c();
                d48Var.j = null;
                d48Var.k = null;
                ((u38) this.b).a.b = new a4x0((byte) 29);
                AudioRenderer.setAudioRouteListenerHandler((AudioRouteListenerHandler) null);
                return;
            case 13:
                smo1.p((llm) this.b, (CancellationException) null);
                return;
            case 14:
                ((Disposable) this.b).dispose();
                return;
            case 15:
                ((vku) this.c).c();
                return;
            case 16:
                ((rku) this.b).a();
                return;
            case 17:
                smo1.p((llm) this.b, (CancellationException) null);
                return;
            case 18:
                ((n4f0) this.b).b(new ivn0(this, (byte) 24));
                return;
            case 19:
                ((CompositeDisposable) this.b).g();
                return;
            case 20:
                smo1.p((llm) ((ajq0) this.b).e, (CancellationException) null);
                return;
            case 21:
                ((y2g0) this.b).a(new pdp0(this, (byte) 27));
                return;
            case 22:
                ((y2g0) this.b).a(new gyq0(this, (byte) 24));
                return;
            case 23:
                smo1.p((llm) this.b, (CancellationException) null);
                return;
            case 24:
                ((rku) this.c).a();
                ((rku) this.b).a();
                return;
            case 25:
                ((y2g0) this.b).a(new gga1(this, (byte) 24));
                return;
            case 26:
                aqd1 aqd1Var = (aqd1) this.c;
                smo1.p(aqd1Var.g, (CancellationException) null);
                ArrayList arrayList = aqd1Var.j;
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((eqd1) it2.next()).a();
                }
                arrayList.clear();
                aqd1Var.i.clear();
                gqd1 gqd1Var = (gqd1) this.b;
                if (gqd1Var.a.isEnabled()) {
                    smo1.p(gqd1Var.f, (CancellationException) null);
                    vi11 vi11Var = gqd1Var.d;
                    Object systemService = ((Context) vi11Var.b).getSystemService("bluetooth");
                    BluetoothManager bluetoothManager = systemService instanceof BluetoothManager ? (BluetoothManager) systemService : null;
                    BluetoothLeAdvertiser bluetoothLeAdvertiser = (bluetoothManager == null || (adapter = bluetoothManager.getAdapter()) == null) ? null : adapter.getBluetoothLeAdvertiser();
                    xpd1 xpd1Var = (xpd1) vi11Var.e;
                    if (xpd1Var != null && bluetoothLeAdvertiser != null) {
                        bluetoothLeAdvertiser.stopAdvertising(xpd1Var);
                    }
                    vi11Var.e = null;
                    BluetoothGattServer bluetoothGattServer = (BluetoothGattServer) vi11Var.d;
                    if (bluetoothGattServer != null) {
                        bluetoothGattServer.clearServices();
                    }
                    BluetoothGattServer bluetoothGattServer2 = (BluetoothGattServer) vi11Var.d;
                    if (bluetoothGattServer2 != null) {
                        bluetoothGattServer2.close();
                    }
                    vi11Var.d = null;
                    return;
                }
                return;
            case 27:
                ((y2g0) this.b).a(new dch1(this, (byte) 5));
                return;
            default:
                tzn0 tzn0Var = (tzn0) this.b;
                if (tzn0Var != null) {
                    uzn0 uzn0Var = (uzn0) tzn0Var;
                    synchronized (uzn0Var) {
                        try {
                            MobiusLoop mobiusLoop = uzn0Var.e;
                            if (mobiusLoop != null) {
                                mobiusLoop.dispose();
                            }
                            uzn0Var.e = null;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                this.b = null;
                fcu fcuVar = (fcu) ((mbu) this.c);
                synchronized (fcuVar) {
                    try {
                        MobiusLoop mobiusLoop2 = fcuVar.f;
                        if (mobiusLoop2 != null) {
                            mobiusLoop2.dispose();
                        }
                        fcuVar.f = null;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
        }
    }

    public km0(juq0 juq0Var, y2g0 y2g0Var) {
        this.a = (byte) 21;
        this.c = juq0Var;
        this.b = y2g0Var;
        y2g0Var.a(new u6j0(this, (byte) 21));
    }

    public km0(i4s0 i4s0Var, y2g0 y2g0Var) {
        this.a = (byte) 22;
        this.c = i4s0Var;
        this.b = y2g0Var;
        y2g0Var.a(new u6j0(this, (byte) 27));
    }

    public km0(vhb1 vhb1Var, y2g0 y2g0Var) {
        this.a = (byte) 25;
        this.c = vhb1Var;
        this.b = y2g0Var;
        y2g0Var.a(new l5v0(this, (byte) 25));
    }

    public km0(ceh1 ceh1Var, y2g0 y2g0Var) {
        this.a = (byte) 27;
        this.c = ceh1Var;
        this.b = y2g0Var;
        y2g0Var.a(new l5v0(this, (byte) 28));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [p.v38] */
    public km0(d48 d48Var, u38 u38Var) {
        this.a = (byte) 12;
        this.c = d48Var;
        this.b = u38Var;
        final x38 x38Var = u38Var.a;
        x38Var.getClass();
        x38Var.c = new AudioTrackAdapter.OnRoutingChangedListener() { // from class: p.v38
            public final void onRoutingChanged(AudioDeviceInfoFacade audioDeviceInfoFacade) {
                x38 x38Var2 = x38Var;
                if (audioDeviceInfoFacade != null) {
                    x38Var2.b.a(audioDeviceInfoFacade.getDeviceId(), audioDeviceInfoFacade.getProductName(), audioDeviceInfoFacade.getAudioDeviceInfoType(), audioDeviceInfoFacade.getAddress());
                } else {
                    x38Var2.getClass();
                }
            }
        };
        x38Var.b = u38Var;
        AudioRenderer.setAudioRouteListenerHandler(x38Var);
        ObservableFromPublisher observableFromPublisher = new ObservableFromPublisher(d48Var.c.J(uwg.t).x(m9h.t).J(p9w.t).t(Functions.a));
        Observable observableCombineLatest = Observable.combineLatest(d48Var.a.c.observeOn(d48Var.d).throttleLatest(500L, TimeUnit.MILLISECONDS, d48Var.d, true).map(new x6o0(d48Var, (byte) 28)), observableFromPublisher, q9w.t);
        vku vkuVar = d48Var.h;
        vkuVar.a(observableFromPublisher.subscribe(new xu(d48Var, (byte) 4), p.d));
        vkuVar.a(observableCombineLatest.subscribe(new c48(d48Var, (byte) 0), nm.S0));
        vkuVar.a(((Observable) d48Var.g.e.getValue()).subscribe(new c48(d48Var, (byte) 1), nm.T0));
        vkuVar.a(d48Var.f.d().map(wdu0.e).distinctUntilChanged().subscribe(new c48(d48Var, (byte) 2), nm.U0));
    }

    public km0(a3e a3eVar, y2g0 y2g0Var) {
        this.a = (byte) 6;
        this.c = a3eVar;
        this.b = y2g0Var;
        y2g0Var.a(new q30(this, (byte) 29));
    }

    public km0(itz itzVar, y2g0 y2g0Var) {
        this.a = (byte) 4;
        this.c = itzVar;
        this.b = y2g0Var;
        y2g0Var.a(new bb6(this, (byte) 0));
    }

    public km0(cn5 cn5Var, bfs bfsVar, Scheduler scheduler) {
        this.a = (byte) 3;
        this.c = cn5Var;
        this.b = bfsVar.c().distinct().replay(1).f().observeOn(scheduler).subscribe(new tg(this, (byte) 17));
    }

    public km0(wbh wbhVar, Flowable flowable, Scheduler scheduler) {
        this.a = (byte) 7;
        this.c = wbhVar;
        this.b = flowable.J(mif1.N0).t(Functions.a).L(scheduler).subscribe(new mba(this, (byte) 26));
    }

    public km0(ypd ypdVar, kly0 kly0Var) {
        this.a = (byte) 2;
        this.c = kly0Var;
        this.b = ((Observable) ypdVar.e.getValue()).skipWhile(wdu0.d).subscribe(new tg(this, (byte) 16));
    }

    public km0(wpu wpuVar, Scheduler scheduler, Observable observable) {
        this.a = (byte) 10;
        this.c = wpuVar;
        vku vkuVar = new vku();
        this.b = vkuVar;
        vkuVar.b(new Disposable[]{observable.doOnSubscribe(new xu(this, (byte) 24)).subscribeOn(scheduler).map(y580.Y0).subscribe(new cfs(this, (byte) 13))});
    }

    public km0(n4f0 n4f0Var, lmy0 lmy0Var, t2j0 t2j0Var) {
        this.a = (byte) 14;
        this.c = t2j0Var;
        this.b = EmptyDisposable.a;
        this.b = lmy0Var.b("client:logout", k8b0.g).subscribe(new w090(this, n4f0Var, (byte) 12));
    }

    public /* synthetic */ km0(Object obj, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
    }

    public km0(Set set, njr njrVar) {
        this.a = (byte) 5;
        this.c = set;
        this.b = njrVar;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((hi9) it.next()).start();
        }
        njr njrVar2 = (njr) this.b;
        if (njrVar2.e.l.isEnabled()) {
            q8n q8nVar = njrVar2.f;
            j0d1 j0d1VarB = guo1.B();
            q8nVar.getClass();
            llm llmVarE = smo1.e(flo1.l(q8nVar, j0d1VarB));
            njrVar2.i = llmVarE;
            fn31.T(llmVarE, (o8n) null, 0, new mx(njrVar2, (lnm) null, (byte) 13), 3);
            fn31.T(llmVarE, (o8n) null, 0, new n1o(njrVar2, (lnm) null, (byte) 9), 3);
        }
    }

    public km0(lmy0 lmy0Var, dp60 dp60Var, q8n q8nVar) {
        this.a = (byte) 13;
        this.c = dp60Var;
        llm llmVarH = us71.h(q8nVar);
        this.b = llmVarH;
        l4p1.u(llmVarH, new fu20(lmy0Var.a("hm://casita/v1/new-content", a9o.W0), new q82(this, (lnm) null, (byte) 8), (byte) 1));
    }

    public km0(r2b1 r2b1Var, g3s0 g3s0Var, n2b1 n2b1Var, g0l g0lVar, Scheduler scheduler, Scheduler scheduler2) {
        this.a = (byte) 16;
        this.c = n2b1Var;
        rku rkuVar = new rku();
        this.b = rkuVar;
        dma1 dma1Var = n2b1Var.a;
        String str = null;
        String strE = dma1Var.e(n2b1.c, (String) null);
        long jG = dma1Var.g(n2b1.d, -1L);
        if (!u890.j(strE, (Object) null) && jG != -1 && n2b1Var.b.b() - jG < 300000) {
            str = strE;
        }
        if (str != null) {
            r2b1Var.d(new k7a1(r2b1Var, str, (byte) 7));
        } else {
            rkuVar.b(((inr) g0lVar).m().filter(y580.j1).take(1L).switchMapSingle(new eea0(g3s0Var, (byte) 27)).retryWhen(new cgp0(5, 1000L, scheduler)).subscribeOn(scheduler).observeOn(scheduler2).subscribe(new w090(r2b1Var, this, (byte) 19), p.W0));
        }
    }

    public km0(trd1 trd1Var, qr20 qr20Var, q8n q8nVar) {
        this.a = (byte) 1;
        this.c = trd1Var;
        llm llmVarE = smo1.e(q8nVar);
        this.b = llmVarE;
        l4p1.u(llmVarE, new fu20(new huz(new any(qr20Var.a.a("ads", false), (byte) 17), (byte) 5), new qm(this, (lnm) null, (byte) 8), (byte) 1));
    }

    public km0(o241 o241Var, eur eurVar, Context context, Scheduler scheduler) {
        this.a = (byte) 15;
        vku vkuVar = new vku();
        this.c = vkuVar;
        vkuVar.a(((p241) o241Var).a.map(wdu0.X0).distinctUntilChanged().observeOn(scheduler).subscribe(new qg7(this, eurVar, context, (byte) 16)));
    }

    public km0(be91 be91Var, crd crdVar, q8n q8nVar) {
        this.a = (byte) 0;
        this.c = be91Var;
        llm llmVarE = smo1.e(q8nVar);
        this.b = llmVarE;
        l4p1.u(llmVarE, new fu20(yoi1.g(((drd) crdVar).c), new q4(this, (lnm) null, (byte) 12), (byte) 1));
    }

    public km0(z6a0 z6a0Var, z6a0 z6a0Var2, ax4 ax4Var, mr20 mr20Var, q8n q8nVar) {
        Observable observableH;
        this.a = (byte) 20;
        this.c = hhp0.a;
        bjq0 bjq0Var = new bjq0(z6a0Var);
        djq0 djq0Var = new djq0(z6a0Var, new nbc((byte) 16));
        pdp0 pdp0Var = new pdp0(this, (byte) 24);
        if (ax4Var.q != null) {
            observableH = ((Observable) ax4Var.s.getValue()).map(e4y.h).distinctUntilChanged();
            observableH.getClass();
        } else {
            observableH = l1d.h(ax4Var.g);
        }
        ezc ezcVarG = yoi1.g(observableH);
        ajq0 ajq0Var = new ajq0();
        ajq0Var.a = z6a0Var2;
        ajq0Var.b = bjq0Var;
        ajq0Var.c = djq0Var;
        ajq0Var.d = pdp0Var;
        llm llmVarE = smo1.e(flo1.l(q8nVar, new z8n("OopsStutterIntegration")));
        ajq0Var.e = llmVarE;
        fn31.T(llmVarE, (o8n) null, 0, new wkk0(ezcVarG, mr20Var, ajq0Var, (lnm) null, (byte) 26), 3);
        this.b = ajq0Var;
    }

    public km0(Context context, q8n q8nVar) {
        this.a = (byte) 23;
        this.c = context;
        llm llmVarE = smo1.e(flo1.l(q8nVar, new z8n("ProfileInstallerDaemon")));
        this.b = llmVarE;
        fn31.T(llmVarE, (o8n) null, 0, new kdt0(this, (lnm) null, (byte) 6), 3);
    }

    public km0(o241 o241Var, j7p j7pVar, Scheduler scheduler) {
        this.a = (byte) 8;
        this.c = j7pVar;
        rku rkuVar = new rku();
        this.b = rkuVar;
        rkuVar.b(((p241) o241Var).a.map(vf61.P0).observeOn(scheduler).doOnNext(new cfs(this, (byte) 11)).subscribe());
    }

    public km0(mbu mbuVar, hsq hsqVar, pni1 pni1Var) {
        this.a = (byte) 28;
        this.c = mbuVar;
        if (pni1Var.a()) {
            fcu fcuVar = (fcu) mbuVar;
            synchronized (fcuVar) {
                if (fcuVar.f == null) {
                    fcuVar.f = Mobius.d(t2m.j, fcuVar.a).h(fcuVar.b).g(new hcu(((p65) fcuVar.c.get()).b(), ((p65) fcuVar.c.get()).a(), new gcu(false, false, fcuVar.d.isEnabled(), fcuVar.e.a()), false, b7x.a));
                }
            }
            tzn0 tzn0Var = (tzn0) hsqVar.get();
            uzn0 uzn0Var = (uzn0) tzn0Var;
            synchronized (uzn0Var) {
                if (uzn0Var.e == null) {
                    MobiusLoop.Builder builderC = Mobius.d(xxb0.B, uzn0Var.b).c(uzn0Var.c, new EventSource[]{uzn0Var.d, uzn0Var.a});
                    w7x w7xVar = w7x.a;
                    uzn0Var.e = builderC.g(new k0o0(false, w7xVar, w7xVar, z6x.a, false, ruf.a));
                }
            }
            this.b = tzn0Var;
        }
    }

    public km0(Context context, ax4 ax4Var) {
        Observable observableH;
        Observable observableJust;
        OopsBridge oopsBridge;
        ByteBuffer enabledTracesBuffer;
        this.a = (byte) 19;
        idd1 idd1Var = ax4Var.s;
        this.c = context;
        CompositeDisposable compositeDisposable = new CompositeDisposable();
        this.b = compositeDisposable;
        tgp0 tgp0Var = ax4Var.q;
        if (tgp0Var != null) {
            observableH = ((Observable) idd1Var.getValue()).map(mm10.Z).distinctUntilChanged();
            observableH.getClass();
        } else {
            observableH = l1d.h(ax4Var.i);
        }
        compositeDisposable.b(observableH.distinctUntilChanged().subscribe(new dy40(this, (byte) 14)));
        if (tgp0Var != null) {
            observableJust = ((Observable) idd1Var.getValue()).map(t9w.h).distinctUntilChanged();
            observableJust.getClass();
        } else {
            observableJust = Observable.just(Integer.valueOf(ax4Var.a));
            observableJust.getClass();
        }
        compositeDisposable.b(observableJust.distinctUntilChanged().subscribe(new ixp0(this, (byte) 1)));
        int iL = ax4Var.l();
        hhp0 hhp0Var = hhp0.a;
        yiq0.c(iL, "page.visit", "baseline");
        yiq0.c(ax4Var.m(), "page.visit", "detailed");
        yiq0.c(ax4Var.q(), "scheduler.workmanager.execution", "baseline");
        yiq0.c(ax4Var.e(), "playback.connect_transfer", "baseline");
        context.getSharedPreferences("com.spotify.oops", 0).edit().putBoolean("AndroidProfilingEnabledFromRCProperty", ax4Var.c()).putBoolean("DiagnosticReportUploadEnabledFromRCProperty", ax4Var.b()).apply();
        if (!ax4Var.n() || (enabledTracesBuffer = (oopsBridge = OopsBridge.INSTANCE).getEnabledTracesBuffer()) == null) {
            return;
        }
        hhp0.a.i(enabledTracesBuffer, oopsBridge.getEnabledTracesSeqCounterAddress());
    }

    public km0(xaz0 xaz0Var, zzx zzxVar, Observable observable) {
        this.a = (byte) 24;
        rku rkuVar = new rku();
        this.c = rkuVar;
        this.b = new rku();
        Completable completableFlatMapCompletable = observable.flatMapCompletable(new uxy0(zzxVar, xaz0Var, (byte) 23));
        completableFlatMapCompletable.getClass();
        rkuVar.b(completableFlatMapCompletable.o(Functions.h).subscribe());
    }

    public km0(Context context, kly0 kly0Var, kly0 kly0Var2, kly0 kly0Var3, kly0 kly0Var4, kly0 kly0Var5) {
        this.a = (byte) 9;
        this.c = new ro30(context, kly0Var5, (byte) 2);
        if (Build.VERSION.SDK_INT >= 36) {
            q8n q8nVar = (q8n) kly0Var4.get();
            j0d1 j0d1VarB = guo1.B();
            q8nVar.getClass();
            llm llmVarE = smo1.e(flo1.l(j0d1VarB, q8nVar).y(new z0u(this)));
            this.b = llmVarE;
            fn31.T(llmVarE, (o8n) null, 0, new zn0(context, this, kly0Var, kly0Var2, kly0Var3, q8nVar, (lnm) null, (byte) 7), 3);
            return;
        }
        this.b = null;
    }

    public km0(Flowable flowable, kly0 kly0Var, nu4 nu4Var, q8n q8nVar) {
        this.a = (byte) 17;
        this.c = kly0Var;
        llm llmVarK = i3a.k(q8nVar);
        this.b = llmVarK;
        if (nu4Var.a()) {
            fn31.T(llmVarK, (o8n) null, 0, new m3n0(flowable, this, (lnm) null, (byte) 19), 3);
        }
    }
}
