package com.spotify.tap.go.service;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import com.spotify.base.java.logging.Logger;
import com.spotify.messages.BetamaxPlaybackSession;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.MaybeSource;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableRetryWhen;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableSingleMaybe;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeCreate;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeFlatten;
import java.util.HashMap;
import kotlin.Metadata;
import p.a2x0;
import p.a84;
import p.bm0;
import p.fy40;
import p.g6a1;
import p.gy40;
import p.hpq;
import p.i961;
import p.k530;
import p.k961;
import p.ki4;
import p.m4e0;
import p.n381;
import p.o4o0;
import p.od30;
import p.poj0;
import p.q3c;
import p.t45;
import p.u890;
import p.w8l;
import p.we90;
import p.zfb;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/spotify/tap/go/service/GoBluetoothService;", "Lp/hpq;", "<init>", "()V", "src_main_java_com_spotify_tap_go-go"}, k = 1, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
public final class GoBluetoothService extends hpq {
    public static final /* synthetic */ int h = 0;
    public i961 a;
    public ki4 b;
    public a84 c;
    public o4o0 d;
    public gy40 e;
    public boolean f;
    public Disposable g;

    public final gy40 a() {
        gy40 gy40Var = this.e;
        if (gy40Var != null) {
            return gy40Var;
        }
        u890.C("goFlowManager");
        throw null;
    }

    public final IBinder onBind(Intent intent) {
        return null;
    }

    public final void onCreate() {
        super.onCreate();
        Logger.b("Go: Service created", new Object[0]);
        ki4 ki4Var = this.b;
        if (ki4Var == null) {
            u890.C("remoteProperties");
            throw null;
        }
        if (!ki4Var.i()) {
            Logger.b("Go: Feature disabled", new Object[0]);
            this.f = true;
            return;
        }
        a84 a84Var = this.c;
        if (a84Var == null) {
            u890.C("bluetoothAdapterProxy");
            throw null;
        }
        if (a84Var.a == null) {
            Logger.b("Go: BT not supported", new Object[0]);
            this.f = true;
            return;
        }
        o4o0 o4o0Var = this.d;
        if (o4o0Var == null) {
            u890.C("permissionState");
            throw null;
        }
        if (o4o0Var.a()) {
            this.g = a().g.doOnNext(new od30(this, (byte) 5)).subscribe();
        } else {
            Logger.b("Go: BT permission not granted", new Object[0]);
            this.f = true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onDestroy() {
        gy40 gy40VarA = a();
        Logger.b("Go: Ending go session for all devices", new Object[0]);
        gy40VarA.f.dispose();
        Disposable disposable = this.g;
        if (disposable != null) {
            disposable.dispose();
        }
        k961 k961Var = this.a;
        if (k961Var == null) {
            u890.C("serviceForegroundManager");
            throw null;
        }
        k961Var.f(this, "com.spotify.tap.go.service.GoBluetoothService");
        super/*android.app.Service*/.onDestroy();
        Logger.b("Go: Service destroyed", new Object[0]);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0058  */
    /* JADX WARN: Multi-variable type inference failed */
    public final int onStartCommand(Intent intent, int i, int i2) {
        zfb zfbVar;
        Logger.b("Go: onStartCommand", new Object[0]);
        k961 k961Var = this.a;
        w8l w8lVar = null;
        if (k961Var == null) {
            u890.C("serviceForegroundManager");
            throw null;
        }
        k961Var.e(this, "com.spotify.tap.go.service.GoBluetoothService", Build.VERSION.SDK_INT >= 31 ? 16 : null);
        if (this.f) {
            Logger.b("Go: Force stopping service", new Object[0]);
            stopSelf();
            return 2;
        }
        String stringExtra = intent.getStringExtra("address");
        if (stringExtra == null) {
            zfbVar = null;
        } else {
            a84 a84Var = this.c;
            if (a84Var == null) {
                u890.C("bluetoothAdapterProxy");
                throw null;
            }
            BluetoothAdapter bluetoothAdapter = a84Var.a;
            if (bluetoothAdapter == null || !BluetoothAdapter.checkBluetoothAddress(stringExtra)) {
                zfbVar = null;
            } else {
                zfbVar = new zfb(bluetoothAdapter.getRemoteDevice(stringExtra));
            }
        }
        if (zfbVar == null) {
            Logger.d("Go: null device received", new Object[0]);
            if (a().c().isEmpty()) {
                Logger.b("Go: No active connections, stopping service", new Object[0]);
                stopSelf();
                return 2;
            }
        } else {
            boolean booleanExtra = intent.getBooleanExtra("connected", false);
            Logger.b("Go: Is connected: " + booleanExtra, new Object[0]);
            if (booleanExtra) {
                gy40 gy40VarA = a();
                BluetoothDevice bluetoothDevice = zfbVar.a;
                Logger.b("Go: Starting go session for device: %s", new Object[]{bluetoothDevice.getAddress()});
                HashMap map = gy40VarA.a.a;
                if (map.get(bluetoothDevice.getAddress()) == null) {
                    w8lVar = new w8l(bluetoothDevice);
                    map.put(bluetoothDevice.getAddress(), w8lVar);
                }
                if (w8lVar == null) {
                    Logger.b("Go: Device is already connecting/connected", new Object[0]);
                    return 2;
                }
                t45 t45VarA = gy40VarA.e.a("spotify-tap");
                t45VarA.h = "android-system-tap";
                t45.m(t45VarA, "create_bluetooth_socket", 4);
                w8lVar.b = 2;
                gy40VarA.g.onNext(w8lVar);
                g6a1 g6a1Var = gy40VarA.b;
                BluetoothDevice bluetoothDevice2 = w8lVar.a;
                q3c q3cVar = g6a1Var.d;
                byte b = 25;
                MaybeSource maybeSourceF = new FlowableSingleMaybe(new FlowableRetryWhen(new MaybeCreate(new we90(bluetoothDevice2)).m(), a2x0.Q0)).f(new n381(g6a1Var, bluetoothDevice2, (byte) 25));
                poj0 poj0Var = g6a1Var.c;
                if (((ki4) poj0Var.e).f()) {
                    maybeSourceF = new MaybeFlatten(maybeSourceF, new m4e0(poj0Var, b));
                }
                Disposable disposableSubscribe = Maybe.o(maybeSourceF).j(g6a1Var.b).d(new fy40(gy40VarA, w8lVar, t45VarA)).n().compose(gy40VarA.c).compose(gy40VarA.d).doFinally(new bm0(gy40VarA, w8lVar, (byte) 28)).doFinally(new bm0(bluetoothDevice, gy40VarA, (byte) 27)).subscribe(k530.g, new od30(bluetoothDevice, (byte) 6));
                w8lVar.c = disposableSubscribe;
                gy40VarA.f.b(disposableSubscribe);
                return 2;
            }
            gy40 gy40VarA2 = a();
            BluetoothDevice bluetoothDevice3 = zfbVar.a;
            w8l w8lVar2 = (w8l) gy40VarA2.a.a.get(bluetoothDevice3.getAddress());
            if (w8lVar2 != null) {
                Logger.b("Go: Ending go session for device: %s", new Object[]{bluetoothDevice3.getAddress()});
                Disposable disposable = w8lVar2.c;
                if (disposable != null) {
                    gy40VarA2.f.a(disposable);
                }
            }
        }
        return 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onTaskRemoved(Intent intent) {
        Logger.b("Go: Task removed", new Object[0]);
        ki4 ki4Var = this.b;
        if (ki4Var == null) {
            u890.C("remoteProperties");
            throw null;
        }
        if (ki4Var.v()) {
            stopSelf();
        } else if ("android.intent.action.MAIN".equals(intent.getAction())) {
            gy40 gy40VarA = a();
            Logger.b("Go: Ending go session for all devices", new Object[0]);
            gy40VarA.f.dispose();
        }
    }
}
