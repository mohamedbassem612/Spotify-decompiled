package p;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Log;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class axn1 extends gsa {
    public final Context L;
    public volatile byte M;
    public volatile apn1 N;
    public volatile v7y O;
    public volatile ScheduledExecutorService P;

    public axn1(twa twaVar, Context context, pra praVar) {
        super(twaVar, context, praVar);
        this.M = (byte) 0;
        this.L = context;
    }

    public final synchronized boolean b0() {
        return (this.M != 2 || this.N == null || this.O == null) ? false : true;
    }

    public final gyn1 c0(int i) {
        if (!b0()) {
            int i2 = vsn1.a;
            Log.isLoggable("BillingClientTesting", 5);
            d0(94, 28, iyn1.a(-1, "Billing Override Service connection is disconnected."));
            return new zxn1(0);
        }
        ovn1 ovn1Var = new ovn1(this, i);
        f1p1 f1p1Var = new f1p1();
        f1p1Var.c = new wdp1();
        z9p1 z9p1Var = new z9p1(f1p1Var);
        f1p1Var.b = z9p1Var;
        f1p1Var.a = ovn1.class;
        try {
            ovn1Var.a(f1p1Var);
            f1p1Var.a = "billingOverrideService.getBillingOverride";
            return z9p1Var;
        } catch (Exception e) {
            z9p1Var.a(e);
            return z9p1Var;
        }
    }

    public final void d0(int i, int i2, iua iuaVar) {
        int i3 = hxn1.a;
        nlo1 nlo1VarB = hxn1.b(i, i2, iuaVar, null, jno1.b);
        Objects.requireNonNull(nlo1VarB, "ApiFailure should not be null");
        this.j.i(nlo1VarB);
    }

    public final void e0(int i) {
        int i2 = hxn1.a;
        gmo1 gmo1VarC = hxn1.c(i, jno1.b);
        Objects.requireNonNull(gmo1VarC, "ApiSuccess should not be null");
        bym1 bym1Var = this.j;
        bym1Var.getClass();
        try {
            bym1Var.v(gmo1VarC, (doo1) bym1Var.b);
        } catch (Throwable unused) {
            vsn1.i("BillingLogger");
        }
    }

    @Override // p.gsa
    public final void r() {
        synchronized (this) {
            e0(27);
            try {
                try {
                    if (this.O != null && this.N != null) {
                        vsn1.g("BillingClientTesting", "Unbinding from Billing Override Service.");
                        this.L.unbindService(this.O);
                        this.O = new v7y((Object) this, (byte) 4);
                    }
                    this.N = null;
                    if (this.P != null) {
                        this.P.shutdownNow();
                        this.P = null;
                    }
                } catch (RuntimeException unused) {
                    vsn1.i("BillingClientTesting");
                }
                this.M = (byte) 3;
            } catch (Throwable th) {
                this.M = (byte) 3;
                throw th;
            }
        }
        super.r();
    }

    @Override // p.gsa
    public final iua s(Activity activity, kl1 kl1Var) {
        int iIntValue = 0;
        try {
            iIntValue = ((Integer) c0(2).get(28500L, TimeUnit.MILLISECONDS)).intValue();
        } catch (TimeoutException unused) {
            d0(102, 28, iyn1.C);
            vsn1.i("BillingClientTesting");
        } catch (Exception e) {
            if (e instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            d0(95, 28, iyn1.C);
            vsn1.i("BillingClientTesting");
        }
        if (iIntValue > 0) {
            iua iuaVarA = iyn1.a(iIntValue, "Billing override value was set by a license tester.");
            d0(93, 2, iuaVarA);
            Z(iuaVarA);
            return iuaVarA;
        }
        try {
            return super.s(activity, kl1Var);
        } catch (Exception unused2) {
            iua iuaVar = iyn1.f;
            d0(103, 2, iuaVar);
            vsn1.i("BillingClientTesting");
            return iuaVar;
        }
    }

    @Override // p.gsa
    public final void t(vqv0 vqv0Var, do0 do0Var) {
        ScheduledExecutorService scheduledExecutorService;
        uh30 uh30Var = new uh30(do0Var, (byte) 1);
        sl21 sl21Var = new sl21(this, vqv0Var, do0Var, (byte) 13);
        gyn1 gyn1VarC0 = c0(7);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        synchronized (this) {
            try {
                if (this.P == null) {
                    this.P = Executors.newSingleThreadScheduledExecutor();
                }
                scheduledExecutorService = this.P;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!gyn1VarC0.isDone()) {
            gyn1 yyn1Var = new yyn1();
            ((yyn1) yyn1Var).h = gyn1VarC0;
            Runnable seg1Var = new seg1();
            ((seg1) seg1Var).b = yyn1Var;
            ((yyn1) yyn1Var).i = scheduledExecutorService.schedule(seg1Var, 28500L, timeUnit);
            gyn1VarC0.c(seg1Var, hwn1.a);
            gyn1VarC0 = yyn1Var;
        }
        fqn1 fqn1Var = new fqn1(this, uh30Var, sl21Var, (byte) 1);
        gyn1VarC0.c(new xwn1(gyn1VarC0, fqn1Var, (byte) 0), v());
    }

    @Override // p.gsa
    public final void u(vqv0 vqv0Var) {
        synchronized (this) {
            if (b0()) {
                vsn1.g("BillingClientTesting", "Billing Override Service connection is valid. No need to re-initialize.");
                e0(26);
            } else {
                int i = 1;
                if (this.M == 1) {
                    int i2 = vsn1.a;
                    Log.isLoggable("BillingClientTesting", 5);
                } else if (this.M == 3) {
                    int i3 = vsn1.a;
                    Log.isLoggable("BillingClientTesting", 5);
                    d0(38, 26, iyn1.a(-1, "Billing Override Service connection is disconnected."));
                } else {
                    this.M = (byte) 1;
                    vsn1.g("BillingClientTesting", "Starting Billing Override Service setup.");
                    this.O = new v7y((Object) this, (byte) 4);
                    Intent intent = new Intent("com.google.android.apps.play.billingtestcompanion.BillingOverrideService.BIND");
                    intent.setPackage("com.google.android.apps.play.billingtestcompanion");
                    Context context = this.L;
                    List<ResolveInfo> listQueryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
                    if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
                        i = 41;
                    } else {
                        ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
                        if (serviceInfo != null) {
                            String str = serviceInfo.packageName;
                            String str2 = serviceInfo.name;
                            if (!Objects.equals(str, "com.google.android.apps.play.billingtestcompanion") || str2 == null) {
                                Log.isLoggable("BillingClientTesting", 5);
                            } else {
                                ComponentName componentName = new ComponentName(str, str2);
                                Intent intent2 = new Intent(intent);
                                intent2.setComponent(componentName);
                                if (context.bindService(intent2, this.O, 1)) {
                                    vsn1.g("BillingClientTesting", "Billing Override Service was bonded successfully.");
                                } else {
                                    Log.isLoggable("BillingClientTesting", 5);
                                }
                            }
                            i = 39;
                        }
                    }
                    this.M = (byte) 0;
                    vsn1.g("BillingClientTesting", "Billing Override Service unavailable on device.");
                    d0(i, 26, iyn1.a(2, "Billing Override Service unavailable on device."));
                }
            }
        }
        L(vqv0Var, 0);
    }

    public axn1(twa twaVar, Context context, s141 s141Var, pra praVar) {
        super(twaVar, context, s141Var, praVar);
        this.M = (byte) 0;
        this.L = context;
    }
}
