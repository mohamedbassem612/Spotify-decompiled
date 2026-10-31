package p;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.util.Log;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class dqo1 extends px40 {
    public final ExecutorService B;
    public final f2g1 C;
    public final f2g1 D;
    public final f2g1 E;
    public final f2g1 F;
    public final f2g1 G;
    public final f2g1 H;
    public final f2g1 I;
    public final f2g1 J;
    public final f2g1 K;
    public final f2g1 L;
    public final kro1 M;
    public final pin1 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqo1(Context context, Looper looper, d520 d520Var, h8n1 h8n1Var, h8n1 h8n1Var2) {
        super(context, looper, 14, d520Var, h8n1Var, h8n1Var2);
        ExecutorService executorServiceUnconfigurableExecutorService = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool(new x2o1((byte) 1)));
        kro1 kro1VarA = kro1.a(context);
        this.C = new f2g1();
        this.D = new f2g1();
        this.E = new f2g1();
        this.F = new f2g1();
        this.G = new f2g1();
        this.H = new f2g1();
        this.I = new f2g1();
        this.J = new f2g1();
        this.K = new f2g1();
        this.L = new f2g1();
        new HashMap();
        new HashMap();
        executorServiceUnconfigurableExecutorService.getClass();
        this.B = executorServiceUnconfigurableExecutorService;
        this.M = kro1VarA;
        this.N = new pin1(new no5(context));
    }

    public final boolean A() {
        return !this.M.b();
    }

    public final boolean E() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(waa waaVar) {
        opn1 opn1Var = this.f;
        AtomicInteger atomicInteger = this.x;
        Context context = this.c;
        if (!A()) {
            try {
                Bundle bundle = context.getPackageManager().getApplicationInfo("com.google.android.wearable.app.cn", 128).metaData;
                int i = bundle != null ? bundle.getInt("com.google.android.wearable.api.version", 0) : 0;
                if (i < 8600000) {
                    new StringBuilder(String.valueOf(i).length() + 71);
                    Intent intent = new Intent("com.google.android.wearable.app.cn.UPDATE_ANDROID_WEAR").setPackage("com.google.android.wearable.app.cn");
                    if (context.getPackageManager().resolveActivity(intent, 65536) == null) {
                        intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.wearable.app.cn").build());
                    }
                    PendingIntent activity = PendingIntent.getActivity(context, 0, intent, pso1.a);
                    this.j = (kl1) waaVar;
                    opn1Var.sendMessage(opn1Var.obtainMessage(3, atomicInteger.get(), 6, activity));
                    return;
                }
            } catch (PackageManager.NameNotFoundException unused) {
                this.j = (kl1) waaVar;
                opn1Var.sendMessage(opn1Var.obtainMessage(3, atomicInteger.get(), 16, null));
                return;
            }
        }
        super/*p.xaa*/.a(waaVar);
    }

    public final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableService");
        return iInterfaceQueryLocalInterface instanceof xdo1 ? (xdo1) iInterfaceQueryLocalInterface : new xdo1(iBinder);
    }

    public final pl10[] e() {
        return oqo1.b;
    }

    public final int l() {
        return 8600000;
    }

    public final String o() {
        return "com.google.android.gms.wearable.internal.IWearableService";
    }

    public final String p() {
        return "com.google.android.gms.wearable.BIND";
    }

    public final String q() {
        return this.M.b() ? "com.google.android.wearable.app.cn" : "com.google.android.gms";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void y(int i, IBinder iBinder, Bundle bundle, int i2) {
        if (Log.isLoggable("WearableClient", 2)) {
            new StringBuilder(String.valueOf(i).length() + 30);
        }
        if (i == 0) {
            this.C.g(iBinder);
            this.D.g(iBinder);
            this.E.g(iBinder);
            this.G.g(iBinder);
            this.H.g(iBinder);
            this.I.g(iBinder);
            this.J.g(iBinder);
            this.K.g(iBinder);
            this.L.g(iBinder);
            this.F.g(iBinder);
            i = 0;
        }
        super/*p.xaa*/.y(i, iBinder, bundle, i2);
    }
}
