package p;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class esn1 implements ServiceConnection {
    public final vsa a;
    public final xqn1 b;
    public final xqn1 c;
    public final int d;
    public final /* synthetic */ gsa e;

    public esn1(gsa gsaVar, vsa vsaVar, int i) {
        this.e = gsaVar;
        a6o1 a6o1Var = gsaVar.K;
        this.b = new xqn1(a6o1Var);
        this.c = new xqn1(a6o1Var);
        this.a = vsaVar;
        this.d = i;
    }

    public static void a(esn1 esn1Var) {
        Bundle bundleG;
        lln1 lln1Var;
        int i;
        int i2;
        gsa gsaVar = esn1Var.e;
        synchronized (gsaVar.c) {
            try {
                if (gsaVar.d == 3) {
                    return;
                }
                boolean z = true;
                boolean z2 = gsaVar.d == 1;
                if (TextUtils.isEmpty(null)) {
                    bundleG = null;
                } else {
                    bundleG = cy30.g("accountName", (String) null);
                    vsn1.b(gsaVar.J.longValue(), gsaVar.e, gsaVar.f, bundleG);
                }
                synchronized (gsaVar.c) {
                    lln1Var = gsaVar.k;
                }
                gsa gsaVar2 = esn1Var.e;
                if (lln1Var == null) {
                    gsaVar2.K(0);
                    int i3 = esn1Var.d;
                    iua iuaVar = iyn1.h;
                    gsaVar2.J(107, i3, iuaVar);
                    esn1Var.d(iuaVar);
                    return;
                }
                String packageName = gsaVar2.i.getPackageName();
                int iG1 = 3;
                int i4 = 27;
                while (true) {
                    if (i4 < 3) {
                        i4 = 0;
                        break;
                    }
                    try {
                        vsn1.g("BillingClient", "trying subs apiVersion: " + i4);
                        if (bundleG == null) {
                            vjn1 vjn1Var = (vjn1) lln1Var;
                            Parcel parcelE1 = vjn1Var.e1();
                            parcelE1.writeInt(i4);
                            parcelE1.writeString(packageName);
                            parcelE1.writeString("subs");
                            Parcel parcelF1 = vjn1Var.f1(1, parcelE1);
                            int i5 = parcelF1.readInt();
                            parcelF1.recycle();
                            iG1 = i5;
                        } else {
                            iG1 = ((vjn1) lln1Var).g1(i4, bundleG, packageName, "subs");
                        }
                        if (iG1 == 0) {
                            vsn1.g("BillingClient", "highestLevelSupportedForSubs: " + i4);
                            break;
                        }
                        i4--;
                    } catch (Exception e) {
                        vsn1.i("BillingClient");
                        boolean z3 = e instanceof DeadObjectException;
                        if (z3) {
                            i = 91;
                        } else if (e instanceof RemoteException) {
                            i = 90;
                        } else {
                            i = e instanceof SecurityException ? 92 : 42;
                        }
                        String strA = l1d.d(i, 42) ? hxn1.a(e) : null;
                        esn1Var.e.K(0);
                        esn1Var.c(z3 ? iyn1.h : iyn1.f, i, strA, z2);
                        esn1Var.d(z3 ? iyn1.h : iyn1.f);
                        return;
                    }
                }
                gsaVar2.n = i4 >= 5;
                gsaVar2.m = i4 >= 3;
                if (i4 < 3) {
                    vsn1.g("BillingClient", "In-app billing API does not support subscription on this device.");
                    i2 = 9;
                } else {
                    i2 = 1;
                }
                for (int i6 = 27; i6 >= 3; i6--) {
                    vsn1.g("BillingClient", "trying inapp apiVersion: " + i6);
                    if (bundleG == null) {
                        vjn1 vjn1Var2 = (vjn1) lln1Var;
                        Parcel parcelE2 = vjn1Var2.e1();
                        parcelE2.writeInt(i6);
                        parcelE2.writeString(packageName);
                        parcelE2.writeString("inapp");
                        Parcel parcelF2 = vjn1Var2.f1(1, parcelE2);
                        int i7 = parcelF2.readInt();
                        parcelF2.recycle();
                        iG1 = i7;
                    } else {
                        iG1 = ((vjn1) lln1Var).g1(i6, bundleG, packageName, "inapp");
                    }
                    if (iG1 == 0) {
                        gsaVar2.o = i6;
                        vsn1.g("BillingClient", "mHighestLevelSupportedForInApp: " + i6);
                        break;
                    }
                }
                gsa.A(gsaVar2, gsaVar2.o);
                if (gsaVar2.o < 3) {
                    int i8 = vsn1.a;
                    Log.isLoggable("BillingClient", 5);
                    i2 = 36;
                }
                gsa.B(gsaVar2, iG1);
                if (iG1 != 0) {
                    iua iuaVar2 = iyn1.a;
                    esn1Var.c(iuaVar2, i2, null, z2);
                    esn1Var.d(iuaVar2);
                    return;
                }
                try {
                    Long lB = esn1Var.b(z2);
                    if (z2) {
                        qlo1 qlo1VarR = gmo1.r();
                        qlo1VarR.b();
                        gmo1.q(((t9o1) qlo1VarR).b, 6);
                        vro1 vro1VarQ = bso1.q();
                        int i9 = esn1Var.d;
                        if (i9 <= 0) {
                            z = false;
                        }
                        vro1VarQ.d(z);
                        vro1VarQ.e(i9);
                        vro1VarQ.b();
                        bso1.u(((t9o1) vro1VarQ).b);
                        if (lB != null) {
                            long jLongValue = lB.longValue();
                            vro1VarQ.b();
                            bso1.t(((t9o1) vro1VarQ).b, jLongValue);
                        }
                        gsa gsaVar3 = esn1Var.e;
                        qlo1VarR.b();
                        gmo1.w(((t9o1) qlo1VarR).b, vro1VarQ.a());
                        gsaVar3.I((gmo1) qlo1VarR.a());
                    } else {
                        xqo1 xqo1VarQ = dro1.q();
                        lmo1 lmo1VarR = umo1.r();
                        lmo1VarR.b();
                        umo1.q(((t9o1) lmo1VarR).b, 0);
                        lmo1VarR.b();
                        umo1.u(((t9o1) lmo1VarR).b);
                        xqo1VarQ.b();
                        dro1.r(((t9o1) xqo1VarQ).b, lmo1VarR.a());
                        if (lB != null) {
                            long jLongValue2 = lB.longValue();
                            xqo1VarQ.b();
                            dro1.s(((t9o1) xqo1VarQ).b, jLongValue2);
                        }
                        esn1Var.e.j.t((dro1) xqo1VarQ.a());
                    }
                } catch (Throwable unused) {
                    vsn1.i("BillingClient");
                }
                esn1Var.d(iyn1.g);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Long b(boolean z) {
        Object obj = this.e.c;
        try {
            if (z) {
                synchronized (obj) {
                    try {
                        xqn1 xqn1Var = this.b;
                        if (!xqn1Var.b) {
                            return null;
                        }
                        long jV = xqn1Var.a.v();
                        if (!xqn1Var.b) {
                            throw new IllegalStateException("This stopwatch is already stopped.");
                        }
                        xqn1Var.b = false;
                        long j = (jV - xqn1Var.d) + xqn1Var.c;
                        xqn1Var.c = j;
                        return Long.valueOf(j / 1000000);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            synchronized (obj) {
                try {
                    xqn1 xqn1Var2 = this.c;
                    if (!xqn1Var2.b) {
                        return null;
                    }
                    long jV2 = xqn1Var2.a.v();
                    if (!xqn1Var2.b) {
                        throw new IllegalStateException("This stopwatch is already stopped.");
                    }
                    xqn1Var2.b = false;
                    long j2 = (jV2 - xqn1Var2.d) + xqn1Var2.c;
                    xqn1Var2.c = j2;
                    return Long.valueOf(j2 / 1000000);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Throwable unused) {
            vsn1.i("BillingClient");
            return null;
        }
        vsn1.i("BillingClient");
        return null;
    }

    public final void c(iua iuaVar, int i, String str, boolean z) {
        try {
            lmo1 lmo1VarR = umo1.r();
            int i2 = iuaVar.a;
            lmo1VarR.b();
            umo1.q(((t9o1) lmo1VarR).b, i2);
            String str2 = iuaVar.c;
            lmo1VarR.b();
            umo1.t(((t9o1) lmo1VarR).b, str2);
            lmo1VarR.d(i);
            lmo1VarR.b();
            umo1.u(((t9o1) lmo1VarR).b);
            if (str != null) {
                lmo1VarR.b();
                umo1.s(((t9o1) lmo1VarR).b, str);
            }
            Long lB = b(z);
            gsa gsaVar = this.e;
            if (!z) {
                xqo1 xqo1VarQ = dro1.q();
                xqo1VarQ.b();
                dro1.r(((t9o1) xqo1VarQ).b, lmo1VarR.a());
                if (lB != null) {
                    long jLongValue = lB.longValue();
                    xqo1VarQ.b();
                    dro1.s(((t9o1) xqo1VarQ).b, jLongValue);
                }
                gsaVar.j.t((dro1) xqo1VarQ.a());
                return;
            }
            vro1 vro1VarQ = bso1.q();
            int i3 = this.d;
            vro1VarQ.d(i3 > 0);
            vro1VarQ.e(i3);
            vro1VarQ.b();
            bso1.u(((t9o1) vro1VarQ).b);
            if (lB != null) {
                long jLongValue2 = lB.longValue();
                vro1VarQ.b();
                bso1.t(((t9o1) vro1VarQ).b, jLongValue2);
            }
            hlo1 hlo1VarT = nlo1.t();
            hlo1VarT.d(lmo1VarR);
            hlo1VarT.g(6);
            hlo1VarT.e(vro1VarQ);
            gsaVar.H((nlo1) hlo1VarT.a());
        } catch (Throwable unused) {
            vsn1.i("BillingClient");
        }
    }

    public final void d(iua iuaVar) {
        gsa gsaVar = this.e;
        synchronized (gsaVar.c) {
            try {
                if (gsaVar.d == 3) {
                    return;
                }
                try {
                    this.a.c(iuaVar);
                } catch (Throwable unused) {
                    vsn1.i("BillingClient");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        boolean z;
        boolean z2;
        int i = vsn1.a;
        Log.isLoggable("BillingClient", 5);
        try {
            gsa gsaVar = this.e;
            synchronized (gsaVar.c) {
                z = true;
                z2 = gsaVar.d == 1;
            }
            bym1 bym1Var = gsaVar.j;
            if (z2) {
                hlo1 hlo1VarT = nlo1.t();
                hlo1VarT.g(6);
                lmo1 lmo1VarR = umo1.r();
                lmo1VarR.d(110);
                hlo1VarT.d(lmo1VarR);
                vro1 vro1VarQ = bso1.q();
                int i2 = this.d;
                if (i2 <= 0) {
                    z = false;
                }
                vro1VarQ.d(z);
                vro1VarQ.e(i2);
                hlo1VarT.e(vro1VarQ);
                bym1Var.i((nlo1) hlo1VarT.a());
            } else {
                dno1 dno1VarQ = dno1.q();
                bym1Var.getClass();
                try {
                    cqo1 cqo1VarR = kqo1.r();
                    cqo1VarR.d((doo1) bym1Var.b);
                    cqo1VarR.b();
                    kqo1.u(((t9o1) cqo1VarR).b, dno1VarQ);
                    ((fjs0) bym1Var.c).n(cqo1VarR.a());
                } catch (Throwable unused) {
                    vsn1.i("BillingLogger");
                }
            }
        } catch (Throwable unused2) {
            vsn1.i("BillingClient");
        }
        gsa gsaVar2 = this.e;
        synchronized (gsaVar2.c) {
            if (gsaVar2.d != 3 && gsaVar2.d != 0) {
                gsaVar2.K(0);
                gsaVar2.M();
                try {
                    this.a.b();
                } catch (Throwable unused3) {
                    vsn1.i("BillingClient");
                }
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        lln1 vjn1Var;
        vsn1.g("BillingClient", "Billing service connected.");
        gsa gsaVar = this.e;
        synchronized (gsaVar.c) {
            try {
                if (gsaVar.d == 3) {
                    return;
                }
                int i = nkn1.l;
                if (iBinder == null) {
                    vjn1Var = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.android.vending.billing.IInAppBillingService");
                    vjn1Var = iInterfaceQueryLocalInterface instanceof lln1 ? (lln1) iInterfaceQueryLocalInterface : new vjn1(iBinder, "com.android.vending.billing.IInAppBillingService", (byte) 6);
                }
                gsaVar.k = vjn1Var;
                if (gsa.w(new w0c1(this, (byte) 1), 30000L, new seg1(this, (byte) 17), gsaVar.C(), gsaVar.v()) == null) {
                    int i2 = this.d;
                    iua iuaVarF = gsaVar.F();
                    gsaVar.J(25, i2, iuaVarF);
                    d(iuaVarF);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        boolean z;
        boolean z2;
        int i = vsn1.a;
        Log.isLoggable("BillingClient", 5);
        try {
            gsa gsaVar = this.e;
            synchronized (gsaVar.c) {
                z = true;
                z2 = gsaVar.d == 1;
            }
            bym1 bym1Var = gsaVar.j;
            if (z2) {
                hlo1 hlo1VarT = nlo1.t();
                hlo1VarT.g(6);
                lmo1 lmo1VarR = umo1.r();
                lmo1VarR.d(109);
                hlo1VarT.d(lmo1VarR);
                vro1 vro1VarQ = bso1.q();
                int i2 = this.d;
                if (i2 <= 0) {
                    z = false;
                }
                vro1VarQ.d(z);
                vro1VarQ.e(i2);
                hlo1VarT.e(vro1VarQ);
                bym1Var.i((nlo1) hlo1VarT.a());
            } else {
                sro1 sro1VarQ = sro1.q();
                bym1Var.getClass();
                if (sro1VarQ != null) {
                    try {
                        cqo1 cqo1VarR = kqo1.r();
                        cqo1VarR.d((doo1) bym1Var.b);
                        cqo1VarR.b();
                        kqo1.q(((t9o1) cqo1VarR).b, sro1VarQ);
                        ((fjs0) bym1Var.c).n(cqo1VarR.a());
                    } catch (Throwable unused) {
                        vsn1.i("BillingLogger");
                    }
                }
            }
        } catch (Throwable unused2) {
            vsn1.i("BillingClient");
        }
        gsa gsaVar2 = this.e;
        synchronized (gsaVar2.c) {
            try {
                xqn1 xqn1Var = this.c;
                xqn1Var.c = 0L;
                xqn1Var.b = false;
                xqn1Var.a();
                if (gsaVar2.d == 3) {
                    return;
                }
                gsaVar2.K(0);
                try {
                    this.a.b();
                } catch (Throwable unused3) {
                    vsn1.i("BillingClient");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
