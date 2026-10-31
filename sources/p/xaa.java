package p;

import android.accounts.Account;
import android.content.AttributionSource;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class xaa {
    public static final pl10[] y = new pl10[0];
    public volatile String a;
    public l1q0 b;
    public final Context c;
    public final Looper d;
    public final b3p1 e;
    public final opn1 f;
    public final Object g;
    public final Object h;
    public mbn1 i;
    public waa j;
    public IInterface k;
    public final ArrayList l;
    public n2o1 m;
    public byte n;
    public final y1t0 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final csj1 f41p;
    public final short q;
    public final String r;
    public volatile String s;
    public volatile cp5 t;
    public lal u;
    public boolean v;
    public volatile dmo1 w;
    public final AtomicInteger x;

    /* JADX WARN: Multi-variable type inference failed */
    public xaa(Context context, Looper looper, b3p1 b3p1Var, int i, y1t0 y1t0Var, csj1 csj1Var, String str) {
        Object obj = lz40.d;
        this.a = null;
        this.g = new Object();
        this.h = new Object();
        this.l = new ArrayList();
        this.n = (byte) 1;
        this.u = null;
        this.v = false;
        this.w = null;
        this.x = new AtomicInteger(0);
        zod.t(context, "Context must not be null");
        this.c = context;
        zod.t(looper, "Looper must not be null");
        this.d = looper;
        this.e = b3p1Var;
        this.f = new opn1(this, looper);
        this.q = i;
        this.o = y1t0Var;
        this.f41p = csj1Var;
        this.r = str;
    }

    public boolean A() {
        return true;
    }

    public boolean B() {
        return false;
    }

    public final void C(cp5 cp5Var) {
        this.t = cp5Var;
    }

    public final void D(String str) {
        this.s = str;
    }

    public boolean E() {
        return this instanceof mzo1;
    }

    public final void F(int i, int i2, Bundle bundle) {
        sbo1 sbo1Var = new sbo1(this, i, bundle);
        opn1 opn1Var = this.f;
        opn1Var.sendMessage(opn1Var.obtainMessage(7, i2, -1, sbo1Var));
    }

    public final void G(dmo1 dmo1Var) {
        this.w = dmo1Var;
        if (E()) {
            cbl cblVar = dmo1Var.d;
            yo31 yo31VarG = yo31.g();
            zo31 zo31Var = cblVar == null ? null : cblVar.a;
            synchronized (yo31VarG) {
                try {
                    if (zo31Var == null) {
                        yo31VarG.b = yo31.d;
                        return;
                    }
                    zo31 zo31Var2 = (zo31) yo31VarG.b;
                    if (zo31Var2 == null || zo31Var2.a < zo31Var.a) {
                        yo31VarG.b = zo31Var;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final /* synthetic */ void H(int i) {
        S(i, null);
    }

    public final /* synthetic */ boolean I(int i, int i2, IInterface iInterface) {
        synchronized (this.g) {
            try {
                if (this.n != i) {
                    return false;
                }
                S(i2, iInterface);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final /* synthetic */ void J() {
        byte b;
        int i;
        synchronized (this.g) {
            b = this.n;
        }
        if (b == 3) {
            this.v = true;
            i = 5;
        } else {
            i = 4;
        }
        opn1 opn1Var = this.f;
        opn1Var.sendMessage(opn1Var.obtainMessage(i, this.x.get(), 16));
    }

    public final boolean K() {
        if (this.v || TextUtils.isEmpty(o()) || TextUtils.isEmpty(null)) {
            return false;
        }
        try {
            Class.forName(o());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public final /* synthetic */ Object L() {
        return this.h;
    }

    public final /* synthetic */ void M(mbn1 mbn1Var) {
        this.i = mbn1Var;
    }

    public final /* synthetic */ y1t0 N() {
        return this.o;
    }

    public final /* synthetic */ csj1 O() {
        return this.f41p;
    }

    public final /* synthetic */ lal P() {
        return this.u;
    }

    public final /* synthetic */ void Q(lal lalVar) {
        this.u = lalVar;
    }

    public final /* synthetic */ boolean R() {
        return this.v;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void S(int i, IInterface iInterface) {
        l1q0 l1q0Var;
        zod.k((i == 4) == (iInterface != null));
        synchronized (this.g) {
            try {
                this.n = i;
                this.k = iInterface;
                Bundle bundle = null;
                if (i == 1) {
                    n2o1 n2o1Var = this.m;
                    if (n2o1Var != null) {
                        b3p1 b3p1Var = this.e;
                        String str = (String) this.b.b;
                        zod.s(str);
                        String str2 = (String) this.b.c;
                        if (this.r == null) {
                            this.c.getClass();
                        }
                        b3p1Var.b(str, str2, n2o1Var, this.b.a);
                        this.m = null;
                    }
                } else if (i == 2 || i == 3) {
                    n2o1 n2o1Var2 = this.m;
                    if (n2o1Var2 != null && (l1q0Var = this.b) != null) {
                        new StringBuilder(String.valueOf((String) l1q0Var.b).length() + 70 + String.valueOf((String) l1q0Var.c).length());
                        b3p1 b3p1Var2 = this.e;
                        String str3 = (String) this.b.b;
                        zod.s(str3);
                        String str4 = (String) this.b.c;
                        if (this.r == null) {
                            this.c.getClass();
                        }
                        b3p1Var2.b(str3, str4, n2o1Var2, this.b.a);
                        this.x.incrementAndGet();
                    }
                    n2o1 n2o1Var3 = new n2o1(this, this.x.get());
                    this.m = n2o1Var3;
                    String strQ = q();
                    String strP = p();
                    boolean zS = s();
                    this.b = new l1q0(strQ, strP, zS);
                    if (zS && l() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf((String) this.b.b)));
                    }
                    b3p1 b3p1Var3 = this.e;
                    String str5 = (String) this.b.b;
                    zod.s(str5);
                    String str6 = (String) this.b.c;
                    String name = this.r;
                    if (name == null) {
                        name = this.c.getClass().getName();
                    }
                    lal lalVarA = b3p1Var3.a(new rxo1(str5, str6, this.b.a), n2o1Var3, name);
                    if (!lalVarA.j()) {
                        l1q0 l1q0Var2 = this.b;
                        new StringBuilder(String.valueOf((String) l1q0Var2.b).length() + 34 + String.valueOf((String) l1q0Var2.c).length());
                        int i2 = lalVarA.b;
                        if (i2 == -1) {
                            i2 = 16;
                        }
                        if (lalVarA.c != null) {
                            bundle = new Bundle();
                            bundle.putParcelable("pendingIntent", lalVarA.c);
                        }
                        F(i2, this.x.get(), bundle);
                    }
                } else if (i == 4) {
                    zod.s(iInterface);
                    System.currentTimeMillis();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(waa waaVar) {
        this.j = waaVar;
        S(2, null);
    }

    public IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        z7n1 z7n1VarQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return z7n1VarQueryLocalInterface instanceof z8n1 ? (z8n1) z7n1VarQueryLocalInterface : new z8n1(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    public void c() {
        this.x.incrementAndGet();
        ArrayList arrayList = this.l;
        synchronized (arrayList) {
            try {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    san1 san1Var = (san1) arrayList.get(i);
                    synchronized (san1Var) {
                        san1Var.a = null;
                    }
                }
                arrayList.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.h) {
            this.i = null;
        }
        S(1, null);
    }

    public final void d(String str) {
        this.a = str;
        c();
    }

    public pl10[] e() {
        return y;
    }

    public final pl10[] f() {
        dmo1 dmo1Var = this.w;
        if (dmo1Var == null) {
            return null;
        }
        return dmo1Var.b;
    }

    public Bundle g() {
        return null;
    }

    public final String h() {
        l1q0 l1q0Var;
        if (u() && (l1q0Var = this.b) != null) {
            return (String) l1q0Var.c;
        }
        jah.g("Failed to connect when checking package");
        return null;
    }

    public final int i() {
        return this.q;
    }

    public Bundle j() {
        return new Bundle();
    }

    public final String k() {
        return this.a;
    }

    public int l() {
        return 12451000;
    }

    public final void m(zf70 zf70Var, Set set) {
        AttributionSource attributionSource;
        Bundle bundleJ = j();
        String attributionTag = (Build.VERSION.SDK_INT < 31 || this.t == null || (attributionSource = (AttributionSource) this.t.b) == null || attributionSource.getAttributionTag() == null) ? this.s : attributionSource.getAttributionTag();
        String str = attributionTag;
        short s = this.q;
        int i = mz40.a;
        Scope[] scopeArr = vp40.O0;
        Bundle bundle = new Bundle();
        pl10[] pl10VarArr = vp40.P0;
        vp40 vp40Var = new vp40(6, s, i, (String) null, (IBinder) null, scopeArr, bundle, (Account) null, pl10VarArr, pl10VarArr, true, 0, false, str);
        vp40Var.d = this.c.getPackageName();
        vp40Var.g = bundleJ;
        if (set != null) {
            vp40Var.f = (Scope[]) set.toArray(new Scope[0]);
        }
        if (B()) {
            Account account = ((px40) this).A;
            if (account == null) {
                account = new Account("<<default account>>", "com.google");
            }
            vp40Var.h = account;
            if (zf70Var != null) {
                vp40Var.e = zf70Var.asBinder();
            }
        }
        vp40Var.i = y;
        vp40Var.t = e();
        if (E()) {
            vp40Var.Z = true;
        }
        try {
            try {
                synchronized (this.h) {
                    try {
                        mbn1 mbn1Var = this.i;
                        if (mbn1Var != null) {
                            mbn1Var.s(new xxn1(this, this.x.get()), vp40Var);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (RemoteException | RuntimeException unused) {
                y(8, null, null, this.x.get());
            }
        } catch (DeadObjectException unused2) {
            int i2 = this.x.get();
            opn1 opn1Var = this.f;
            opn1Var.sendMessage(opn1Var.obtainMessage(6, i2, 3));
        } catch (SecurityException e) {
            throw e;
        }
    }

    public final IInterface n() {
        IInterface iInterface;
        synchronized (this.g) {
            try {
                if (this.n == 5) {
                    throw new DeadObjectException();
                }
                if (!u()) {
                    throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
                }
                IInterface iInterface2 = this.k;
                zod.t(iInterface2, "Client is connected but service is null");
                iInterface = iInterface2;
            } catch (Throwable th) {
                throw th;
            }
        }
        return iInterface;
    }

    public String o() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    public String p() {
        return "com.google.android.gms.signin.service.START";
    }

    public String q() {
        return "com.google.android.gms";
    }

    public final cbl r() {
        dmo1 dmo1Var = this.w;
        if (dmo1Var == null) {
            return null;
        }
        return dmo1Var.d;
    }

    public boolean s() {
        return l() >= 211700000;
    }

    public final boolean t() {
        return this.w != null;
    }

    public final boolean u() {
        boolean z;
        synchronized (this.g) {
            z = this.n == 4;
        }
        return z;
    }

    public final boolean v() {
        boolean z;
        synchronized (this.g) {
            byte b = this.n;
            z = true;
            if (b != 2 && b != 3) {
                z = false;
            }
        }
        return z;
    }

    public void w(lal lalVar) {
        int i = lalVar.b;
        System.currentTimeMillis();
    }

    public void x() {
        System.currentTimeMillis();
    }

    public void y(int i, IBinder iBinder, Bundle bundle, int i2) {
        i7o1 i7o1Var = new i7o1(this, i, iBinder, bundle);
        opn1 opn1Var = this.f;
        opn1Var.sendMessage(opn1Var.obtainMessage(1, i2, -1, i7o1Var));
    }

    public final void z(dmj1 dmj1Var) {
        ((h8n1) dmj1Var.b).w.N0.post(new seg1(dmj1Var, (byte) 13));
    }
}
