package p;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.ArrayMap;
import android.util.Log;
import io.reactivex.rxjava3.core.ObservableEmitter;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.LinkedBlockingDeque;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class v7y implements ServiceConnection {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ v7y(gzo1 gzo1Var) {
        this.a = (byte) 5;
        Objects.requireNonNull(gzo1Var);
        this.b = gzo1Var;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        y9n1 tg70Var = null;
        switch (this.a) {
            case 0:
                mv2 mv2Var = (mv2) this.b;
                synchronized (mv2Var.a) {
                    if (((ArrayMap) mv2Var.e).isEmpty()) {
                        ((Context) mv2Var.d).unbindService((v7y) mv2Var.g);
                    } else {
                        int i = ug70.a;
                        if (iBinder != null) {
                            y9n1 y9n1VarQueryLocalInterface = iBinder.queryLocalInterface(vg70.e);
                            if (y9n1VarQueryLocalInterface == null || !(y9n1VarQueryLocalInterface instanceof vg70)) {
                                tg70Var = new tg70();
                                tg70Var.a = iBinder;
                            } else {
                                tg70Var = (vg70) y9n1VarQueryLocalInterface;
                            }
                        }
                        mv2Var.b = 10L;
                        if (tg70Var != null) {
                            try {
                                ((tg70) tg70Var).s((u7y) mv2Var.h);
                                break;
                            } catch (RemoteException unused) {
                            }
                        }
                    }
                }
                return;
            case 1:
                ObservableEmitter observableEmitter = (ObservableEmitter) this.b;
                if (observableEmitter.isDisposed()) {
                    return;
                }
                int i2 = ck70.a;
                if (iBinder != null) {
                    y9n1 y9n1VarQueryLocalInterface2 = iBinder.queryLocalInterface("com.msc.sa.aidl.ISAService");
                    if (y9n1VarQueryLocalInterface2 == null || !(y9n1VarQueryLocalInterface2 instanceof dk70)) {
                        tg70Var = new bk70();
                        tg70Var.a = iBinder;
                    } else {
                        tg70Var = (dk70) y9n1VarQueryLocalInterface2;
                    }
                }
                if (tg70Var == null) {
                    observableEmitter.tryOnError(new Exception("Failed to create ISAService"));
                }
                observableEmitter.onNext(tg70Var);
                return;
            case 2:
                y441 y441Var = (y441) this.b;
                LinkedBlockingDeque linkedBlockingDeque = (LinkedBlockingDeque) y441Var.c;
                linkedBlockingDeque.size();
                y441Var.b = new Messenger(iBinder);
                ArrayList arrayList = new ArrayList();
                linkedBlockingDeque.drainTo(arrayList);
                fn31.T(smo1.e((o8n) y441Var.a), null, 0, new lc41(y441Var, arrayList, (lnm) null, (byte) 26), 3);
                return;
            case 3:
                c5n1 c5n1Var = (c5n1) this.b;
                c5n1Var.b.b("ServiceConnectionImpl.onServiceConnected(%s)", new Object[]{componentName});
                c5n1Var.a().post(new a5n1(this, iBinder));
                return;
            case 4:
                vsn1.g("BillingClientTesting", "Billing Override Service connected.");
                axn1 axn1Var = (axn1) this.b;
                int i3 = uon1.l;
                if (iBinder != null) {
                    y9n1 y9n1VarQueryLocalInterface3 = iBinder.queryLocalInterface("com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService");
                    tg70Var = y9n1VarQueryLocalInterface3 instanceof apn1 ? (apn1) y9n1VarQueryLocalInterface3 : new ron1(iBinder, "com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService", (byte) 6);
                }
                axn1Var.N = tg70Var;
                axn1Var.M = (byte) 2;
                axn1Var.e0(26);
                return;
            case 5:
                gzo1 gzo1Var = (gzo1) this.b;
                gzo1Var.b.b("ServiceConnectionImpl.onServiceConnected(%s)", new Object[]{componentName});
                gzo1Var.a().post(new fpo1(this, iBinder));
                return;
            case 6:
                hzo1 hzo1Var = (hzo1) this.b;
                hzo1Var.b.g("ServiceConnectionImpl.onServiceConnected(%s)", new Object[]{componentName});
                hzo1Var.a().post(new gpo1(this, iBinder));
                return;
            default:
                rzo1 rzo1Var = (rzo1) this.b;
                rzo1Var.b.d("ServiceConnectionImpl.onServiceConnected(%s)", new Object[]{componentName});
                rzo1Var.a().post(new mpo1(this, iBinder));
                return;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        switch (this.a) {
            case 0:
                mv2 mv2Var = (mv2) this.b;
                synchronized (mv2Var.a) {
                    mv2Var.f = null;
                    if (!((ArrayMap) mv2Var.e).isEmpty()) {
                        ((Handler) mv2Var.c).postDelayed(new fss((Object) mv2Var, (byte) 17), mv2Var.b);
                        mv2Var.b = Math.min(mv2Var.b * 10, 5000L);
                    }
                    break;
                }
                return;
            case 1:
                ObservableEmitter observableEmitter = (ObservableEmitter) this.b;
                if (observableEmitter.isDisposed()) {
                    return;
                }
                observableEmitter.onComplete();
                return;
            case 2:
                ((y441) this.b).b = null;
                return;
            case 3:
                c5n1 c5n1Var = (c5n1) this.b;
                c5n1Var.b.b("ServiceConnectionImpl.onServiceDisconnected(%s)", new Object[]{componentName});
                c5n1Var.a().post(new b5n1(this));
                return;
            case 4:
                int i = vsn1.a;
                Log.isLoggable("BillingClientTesting", 5);
                axn1 axn1Var = (axn1) this.b;
                axn1Var.N = null;
                axn1Var.M = (byte) 0;
                return;
            case 5:
                gzo1 gzo1Var = (gzo1) this.b;
                gzo1Var.b.b("ServiceConnectionImpl.onServiceDisconnected(%s)", new Object[]{componentName});
                gzo1Var.a().post(new qio1(this));
                return;
            case 6:
                hzo1 hzo1Var = (hzo1) this.b;
                hzo1Var.b.g("ServiceConnectionImpl.onServiceDisconnected(%s)", new Object[]{componentName});
                hzo1Var.a().post(new jio1(this));
                return;
            default:
                rzo1 rzo1Var = (rzo1) this.b;
                rzo1Var.b.d("ServiceConnectionImpl.onServiceDisconnected(%s)", new Object[]{componentName});
                rzo1Var.a().post(new nio1(this, (byte) 1));
                return;
        }
    }

    public /* synthetic */ v7y(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public /* synthetic */ v7y(hzo1 hzo1Var) {
        this.a = (byte) 6;
        Objects.requireNonNull(hzo1Var);
        this.b = hzo1Var;
    }

    public v7y(zgz0 zgz0Var, ObservableEmitter observableEmitter) {
        this.a = (byte) 1;
        this.b = observableEmitter;
    }
}
