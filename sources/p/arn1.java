package p;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class arn1 extends kz40 {
    public static final pue0 H = new pue0("CastClient", (String) null);
    public static final em3 I = new em3("Cast.API_CXLESS", new a8n1(9), nin1.a);
    public kkn1 A;
    public final CastDevice B;
    public final HashMap C;
    public final HashMap D;
    public final zdp1 E;
    public final List F;
    public byte G;
    public final uqn1 l;
    public jim0 m;
    public boolean n;
    public boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public bsd1 f3p;
    public bsd1 q;
    public final AtomicLong r;
    public final Object s;
    public final Object t;
    public yz5 u;
    public String v;
    public double w;
    public boolean x;
    public int y;
    public int z;

    public arn1(Context context, n2e n2eVar) {
        super(context, (Activity) null, I, n2eVar, jz40.c);
        this.l = new uqn1(this);
        this.s = new Object();
        this.t = new Object();
        this.F = Collections.synchronizedList(new ArrayList());
        this.E = n2eVar.b;
        this.B = n2eVar.a;
        this.C = new HashMap();
        this.D = new HashMap();
        this.r = new AtomicLong(0L);
        this.G = (byte) 1;
        v();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(o2e o2eVar, String str, vhp1 vhp1Var, bsd1 bsd1Var) {
        zod.v("Not active connection", this.G != 1);
        if (o2eVar != null) {
            cgn1 cgn1Var = (cgn1) vhp1Var.n();
            hi5 hi5VarA = oho1.A();
            Parcel parcelA1 = cgn1Var.a1();
            parcelA1.writeString(str);
            osn1.b(parcelA1, hi5VarA);
            cgn1Var.d1(12, parcelA1);
        }
        bsd1Var.b((Object) null);
    }

    public final void g(int i) {
        synchronized (this.t) {
            try {
                bsd1 bsd1Var = this.q;
                if (bsd1Var == null) {
                    return;
                }
                if (i == 0) {
                    bsd1Var.b(new Status(0, (String) null, (PendingIntent) null, (lal) null));
                } else {
                    bsd1Var.a(rzn1.r(new Status(i, (String) null, (PendingIntent) null, (lal) null)));
                }
                this.q = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h(int i, long j) {
        bsd1 bsd1Var;
        HashMap map = this.C;
        synchronized (map) {
            Long lValueOf = Long.valueOf(j);
            bsd1Var = (bsd1) map.get(lValueOf);
            map.remove(lValueOf);
        }
        if (bsd1Var != null) {
            if (i == 0) {
                bsd1Var.b((Object) null);
            } else {
                bsd1Var.a(rzn1.r(new Status(i, (String) null, (PendingIntent) null, (lal) null)));
            }
        }
    }

    public final Handler i() {
        jim0 jim0Var = this.m;
        if (jim0Var != null) {
            return jim0Var;
        }
        jim0 jim0Var2 = new jim0(((kz40) this).g, (byte) 5);
        this.m = jim0Var2;
        return jim0Var2;
    }

    public final void j() {
        H.a("removing all MessageReceivedCallbacks", new Object[0]);
        HashMap map = this.D;
        synchronized (map) {
            map.clear();
        }
    }

    public final boolean k() {
        return this.G == 3;
    }

    public final void l(int i) {
        synchronized (this.s) {
            try {
                bsd1 bsd1Var = this.f3p;
                if (bsd1Var != null) {
                    bsd1Var.a(rzn1.r(new Status(i, (String) null, (PendingIntent) null, (lal) null)));
                }
                this.f3p = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void m(uhp1 uhp1Var) {
        this.F.add(uhp1Var);
    }

    public final void n() {
        dbm dbmVarJ = dzo1.j(this.l, ((kz40) this).g, "castDeviceControllerListenerKey");
        nf11 nf11Var = new nf11();
        nf11Var.e = true;
        yrg0 yrg0Var = new yrg0(this, (byte) 27);
        een1 een1Var = een1.c;
        this.G = (byte) 2;
        nf11Var.c = dbmVarJ;
        nf11Var.a = yrg0Var;
        nf11Var.b = een1Var;
        nf11Var.d = new pl10[]{hm5.e};
        nf11Var.f = (char) 8428;
        b(nf11Var.a());
    }

    public final void o() {
        asd1 asd1VarB = asd1.b();
        asd1VarB.d = fen1.c;
        asd1VarB.c = (char) 8403;
        e(1, asd1VarB.a());
        j();
        c9d0 c9d0Var = (c9d0) dzo1.j(this.l, ((kz40) this).g, "castDeviceControllerListenerKey").b;
        zod.t(c9d0Var, "Key must not be null");
        c(c9d0Var, 8415);
    }

    public final hfp1 p(String str, String str2) {
        o4e.b(str);
        if (TextUtils.isEmpty(str2)) {
            hhg1.n("The message payload cannot be null or empty");
            return null;
        }
        if (str2.length() <= 524288) {
            asd1 asd1VarB = asd1.b();
            asd1VarB.d = new dzp0(this, str, str2, (byte) 18);
            asd1VarB.c = (char) 8405;
            return e(1, asd1VarB.a());
        }
        H.c("Message send failed. Message exceeds maximum size", new Object[0]);
        hhg1.n("Message exceeds maximum size524288");
        return null;
    }

    public final hfp1 q(String str, ckb0 ckb0Var) {
        asd1 asd1VarB = asd1.b();
        asd1VarB.d = new dzp0(this, str, ckb0Var, (byte) 19);
        asd1VarB.c = (char) 8406;
        return e(1, asd1VarB.a());
    }

    public final void r(String str) {
        asd1 asd1VarB = asd1.b();
        asd1VarB.d = new a6n1(this, str, (byte) 4);
        asd1VarB.c = (char) 8409;
        e(1, asd1VarB.a());
    }

    public final void s(String str, o2e o2eVar) {
        o4e.b(str);
        if (o2eVar != null) {
            HashMap map = this.D;
            synchronized (map) {
                map.put(str, o2eVar);
            }
        }
        asd1 asd1VarB = asd1.b();
        asd1VarB.d = new zrj1((Object) this, (Object) str, (Object) o2eVar, (byte) 29);
        asd1VarB.c = (char) 8413;
        e(1, asd1VarB.a());
    }

    public final void t(String str) {
        o2e o2eVar;
        if (TextUtils.isEmpty(str)) {
            hhg1.n("Channel namespace cannot be null or empty");
            return;
        }
        HashMap map = this.D;
        synchronized (map) {
            o2eVar = (o2e) map.remove(str);
        }
        asd1 asd1VarB = asd1.b();
        asd1VarB.d = new dzp0(this, o2eVar, str, (byte) 17);
        asd1VarB.c = (char) 8414;
        e(1, asd1VarB.a());
    }

    public final hfp1 u(String str, String str2) {
        asd1 asd1VarB = asd1.b();
        asd1VarB.d = new zrj1((Object) this, (Object) str, (Object) str2, (byte) 28);
        asd1VarB.c = (char) 8407;
        return e(1, asd1VarB.a());
    }

    public final void v() {
        CastDevice castDevice = this.B;
        ho41 ho41Var = castDevice.i;
        if (ho41Var.c(2048) || !ho41Var.c(4) || ho41Var.c(1)) {
            return;
        }
        "Chromecast Audio".equals(castDevice.e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void w(String str, String str2, vhp1 vhp1Var, bsd1 bsd1Var) {
        HashMap map = this.C;
        long jIncrementAndGet = this.r.incrementAndGet();
        zod.v("Not connected to device", k());
        try {
            map.put(Long.valueOf(jIncrementAndGet), bsd1Var);
            Context context = vhp1Var.c;
            hi5 hi5VarA = oho1.A();
            cgn1 cgn1Var = (cgn1) vhp1Var.n();
            Parcel parcelA1 = cgn1Var.a1();
            parcelA1.writeString(str);
            parcelA1.writeString(str2);
            parcelA1.writeLong(jIncrementAndGet);
            osn1.b(parcelA1, hi5VarA);
            cgn1Var.d1(9, parcelA1);
        } catch (RemoteException e) {
            map.remove(Long.valueOf(jIncrementAndGet));
            bsd1Var.a(e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void x(String str, ckb0 ckb0Var, vhp1 vhp1Var, bsd1 bsd1Var) {
        zod.v("Not connected to device", k());
        cgn1 cgn1Var = (cgn1) vhp1Var.n();
        hi5 hi5VarA = oho1.A();
        Parcel parcelA1 = cgn1Var.a1();
        parcelA1.writeString(str);
        osn1.b(parcelA1, ckb0Var);
        osn1.b(parcelA1, hi5VarA);
        cgn1Var.d1(13, parcelA1);
        synchronized (this.s) {
            try {
                if (this.f3p != null) {
                    l(2477);
                }
                this.f3p = bsd1Var;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void y(String str, vhp1 vhp1Var, bsd1 bsd1Var) {
        zod.v("Not connected to device", k());
        cgn1 cgn1Var = (cgn1) vhp1Var.n();
        hi5 hi5VarA = oho1.A();
        Parcel parcelA1 = cgn1Var.a1();
        parcelA1.writeString(str);
        osn1.b(parcelA1, hi5VarA);
        cgn1Var.d1(5, parcelA1);
        synchronized (this.t) {
            try {
                if (this.q != null) {
                    bsd1Var.a(rzn1.r(new Status(2001, (String) null, (PendingIntent) null, (lal) null)));
                } else {
                    this.q = bsd1Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
