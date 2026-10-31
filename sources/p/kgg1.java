package p;

import android.content.Context;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class kgg1 {
    public static final long w;
    public final Context a;
    public final zfg1 b;
    public final boolean c;
    public final b380 d;
    public final boolean e;
    public final long f;
    public final h9d0 g;
    public final z57 h;
    public final hfb i;
    public final yys j;
    public final gwg k;
    public final zgn0 l;
    public final Looper m;
    public final wdd1 n;
    public final a1g1 o = new a1g1(this, (byte) 2);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final vnr f81p;
    public myr q;
    public b3k r;
    public b3k s;
    public String t;
    public n4w u;
    public azj v;

    static {
        hph0.a("media3.transformer");
        w = zoi1.S() ? 25000L : 10000L;
    }

    public kgg1(Context context, zfg1 zfg1Var, boolean z, b380 b380Var, boolean z2, long j, h9d0 h9d0Var, z57 z57Var, hfb hfbVar, yys yysVar, gwg gwgVar, zgn0 zgn0Var, Looper looper, vnr vnrVar) {
        this.a = context;
        this.b = zfg1Var;
        this.c = z;
        this.d = b380Var;
        this.e = z2;
        this.f = j;
        this.g = h9d0Var;
        this.h = z57Var;
        this.i = hfbVar;
        this.j = yysVar;
        this.k = gwgVar;
        this.l = zgn0Var;
        this.m = looper;
        this.f81p = vnrVar;
        this.n = new wdd1(new Handler(looper, null));
    }

    public final boolean a() {
        return Build.VERSION.SDK_INT >= 35 && this.e;
    }

    public final void b() {
        int iB;
        int i;
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.m;
        if (looperMyLooper != looper) {
            eg.m("Transformer is accessed on the wrong thread.");
            return;
        }
        myr myrVar = this.q;
        if (myrVar == null) {
            c();
            return;
        }
        try {
            myrVar.a();
            ij81 ij81Var = new ij81((byte) 25);
            if (Looper.myLooper() != looper) {
                eg.m("Transformer is accessed on the wrong thread.");
                return;
            }
            myr myrVar2 = this.q;
            iB = myrVar2 != null ? myrVar2.b(ij81Var) : 0;
            if (a()) {
                i = iB == 2 ? ij81Var.b : -1;
                if (this.u == null) {
                    d();
                }
                n4w n4wVar = this.u;
                n4wVar.getClass();
                n4wVar.e(i);
            }
            this.q = null;
            c();
        } catch (Throwable th) {
            ij81 ij81Var2 = new ij81((byte) 25);
            if (Looper.myLooper() != looper) {
                eg.m("Transformer is accessed on the wrong thread.");
                return;
            }
            myr myrVar3 = this.q;
            iB = myrVar3 != null ? myrVar3.b(ij81Var2) : 0;
            if (a()) {
                i = iB == 2 ? ij81Var2.b : -1;
                if (this.u == null) {
                    d();
                }
                n4w n4wVar2 = this.u;
                n4wVar2.getClass();
                n4wVar2.e(i);
            }
            this.q = null;
            c();
            throw th;
        }
    }

    public final void c() {
        azj azjVar = this.v;
        if (azjVar != null) {
            ScheduledFuture scheduledFuture = (ScheduledFuture) azjVar.d;
            scheduledFuture.getClass();
            scheduledFuture.cancel(false);
            ((ScheduledExecutorService) azjVar.c).shutdownNow();
            this.v = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0051  */
    /* JADX WARN: Code duplicated, block: B:31:0x0098  */
    public final LogSessionId d() {
        boolean z;
        boolean z2;
        String str = null;
        if (!a()) {
            return null;
        }
        vnr vnrVar = this.f81p;
        vnrVar.getClass();
        m4w m4wVar = new m4w(vnrVar.a);
        LogSessionId logSessionIdA = m4wVar.a();
        zgn0 zgn0Var = this.l;
        if (zgn0Var instanceof i580) {
            str = "androidx.media3:media3-muxer:1.11.0";
        } else if (zgn0Var instanceof acs) {
            str = bcs.b;
        }
        b3k b3kVar = this.r;
        b3kVar.getClass();
        if (((cnw) b3kVar.d).a.isEmpty()) {
            b3k b3kVar2 = this.r;
            b3kVar2.getClass();
            if (hr80.k((b380) b3kVar2.b, new fv7((byte) 5))) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = true;
        }
        b3k b3kVar3 = this.r;
        b3kVar3.getClass();
        if (((cnw) b3kVar3.d).b.isEmpty()) {
            b3k b3kVar4 = this.r;
            b3kVar4.getClass();
            Iterator it = ((b380) b3kVar4.b).iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                if (hr80.k(((f4w) it.next()).a, new fv7((byte) 6))) {
                    break;
                }
                i++;
            }
            z2 = i != -1;
        }
        this.u = new n4w(m4wVar, str, z, z2);
        return logSessionIdA;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0207 A[PHI: r4
      0x0207: PHI (r4v8 boolean) = (r4v0 boolean), (r4v11 boolean) binds: [B:38:0x01f1, B:40:0x0205] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:55:0x02b9 A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:62:0x02ac A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final void e(b3k b3kVar, String str) {
        pgg1 pgg1Var;
        boolean z;
        boolean z2;
        f4w f4wVar;
        wdd1 wdd1Var = this.n;
        if (Looper.myLooper() != this.m) {
            eg.m("Transformer is accessed on the wrong thread.");
            return;
        }
        boolean z3 = true;
        dm5.z(this.q == null, "There is already an export in progress.");
        long j = this.f;
        if (j != -9223372036854775807L) {
            ifb1 ifb1Var = new ifb1(this, (byte) 20);
            azj azjVar = new azj(j, ifb1Var);
            this.v = azjVar;
            azjVar.d = ((ScheduledExecutorService) azjVar.c).schedule(new v241(ifb1Var, (byte) 20), j, TimeUnit.MILLISECONDS);
        }
        this.s = b3kVar;
        ArrayList arrayList = new ArrayList();
        w280 w280VarR = ((b380) b3kVar.b).r(0);
        while (w280VarR.hasNext()) {
            f4w f4wVar2 = (f4w) w280VarR.next();
            ArrayList arrayList2 = new ArrayList();
            w280 w280VarR2 = f4wVar2.a.r(0);
            while (w280VarR2.hasNext()) {
                e4w e4wVar = (e4w) w280VarR2.next();
                dm5.y(e4wVar.h.isEmpty());
                d4w d4wVarA = e4wVar.a();
                d4wVarA.h = b380.p(b380.t(new vye1((byte) 1)));
                arrayList2.add(new e4w(d4wVarA));
            }
            dm5.m(!arrayList2.isEmpty());
            t380 t380Var = f4wVar2.b;
            if (t380Var.contains(-2)) {
                otu otuVar = new otu(arrayList2);
                boolean z4 = f4wVar2.c;
                dm5.y(((t380) otuVar.c).contains(-2));
                if (z4) {
                    r380 r380Var = new r380(4);
                    r380Var.h((t380) otuVar.c);
                    r380Var.g(1);
                    otuVar.c = r380Var.i();
                } else {
                    t380 t380Var2 = (t380) otuVar.c;
                    int i = t380.c;
                    b291 b291Var = new b291(1);
                    dm5.s(t380Var2, "set1");
                    otuVar.c = t380.p(new zl61(t380Var2, b291Var, (byte) 1));
                }
                boolean z5 = f4wVar2.d;
                dm5.y(((t380) otuVar.c).contains(-2));
                if (z5) {
                    r380 r380Var2 = new r380(4);
                    r380Var2.h((t380) otuVar.c);
                    r380Var2.g(2);
                    otuVar.c = r380Var2.i();
                } else {
                    t380 t380Var3 = (t380) otuVar.c;
                    int i2 = t380.c;
                    b291 b291Var2 = new b291(2);
                    dm5.s(t380Var3, "set1");
                    otuVar.c = t380.p(new zl61(t380Var3, b291Var2, (byte) 1));
                }
                f4wVar = new f4w(otuVar);
            } else {
                otu otuVar2 = new otu(t380Var);
                ((v280) otuVar2.b).e(arrayList2);
                f4wVar = new f4w(otuVar2);
            }
            arrayList.add(f4wVar);
        }
        b3k b3kVar2 = new b3k();
        b3kVar2.b = (b380) b3kVar.b;
        b3kVar2.c = (m9x0) b3kVar.c;
        b3kVar2.d = (cnw) b3kVar.d;
        b3kVar2.e = b3kVar.e;
        b3kVar2.f = b3kVar.f;
        b3kVar2.g = b3kVar.g;
        b3kVar2.h = b3kVar.h;
        dm5.n(!arrayList.isEmpty(), "The composition must contain at least one EditedMediaItemSequence.");
        b3kVar2.b = b380.p(arrayList);
        b3k b3kVarA = b3kVar2.a();
        this.r = b3kVarA;
        this.t = str;
        zfg1 zfg1VarC = this.b;
        if (b3kVarA.g != 0) {
            w4c0 w4c0VarA = zfg1VarC.a();
            w4c0VarA.c = this.r.g;
            zfg1VarC = w4c0VarA.c();
        }
        LogSessionId logSessionIdD = d();
        b3k b3kVar3 = this.s;
        b3kVar3.getClass();
        yjq yjqVar = new yjq(b3kVar3, this.g, wdd1Var, zfg1VarC);
        z57 z57Var = this.h;
        x8r.b();
        zfg1 zfg1Var = zfg1VarC;
        Context context = this.a;
        b3k b3kVar4 = this.r;
        b3kVar4.getClass();
        hfb hfbVar = this.i;
        yys yysVar = this.j;
        gwg gwgVar = this.k;
        b380 b380Var = this.d;
        a1g1 a1g1Var = this.o;
        if (this.c) {
            b3k b3kVar5 = this.r;
            b3kVar5.getClass();
            if (((b380) b3kVar5.b).size() <= 1) {
                z3 = true;
                if (((f4w) ((b380) this.r.b).get(0)).a.d > 1) {
                    z = z3;
                    z2 = false;
                } else {
                    b3k b3kVar6 = this.r;
                    b3kVar6.getClass();
                    z = true;
                    z2 = !((e4w) ((f4w) ((b380) b3kVar6.b).get(0)).a.get(0)).a.e.equals(moh0.i);
                }
            } else {
                z = z3;
                z2 = false;
            }
            boolean z6 = z2 ? z : false;
            zgn0 zgn0Var = this.l;
            String str2 = this.t;
            str2.getClass();
            myr myrVar = new myr(context, b3kVar4, zfg1Var, z57Var, hfbVar, yysVar, gwgVar, b380Var, a1g1Var, yjqVar, wdd1Var, logSessionIdD, z6, zgn0Var, str2);
            this.q = myrVar;
            String str3 = myrVar.o;
            zgn0 zgn0Var2 = myrVar.n;
            lqr lqrVar = myrVar.q;
            pgg1Var = new pgg1(myrVar.a, myrVar.b, myrVar.c, myrVar.d, myrVar.e, myrVar.f, myrVar.g, myrVar.h, new dhn0(str3, zgn0Var2, lqrVar, 0, null), lqrVar, myrVar.j, myrVar.k, 0L, myrVar.l, myrVar.m);
            myrVar.r = pgg1Var;
            pgg1Var.d();
            pgg1Var.i.j(1);
            synchronized (pgg1Var.q) {
                pgg1Var.z = 1;
                pgg1Var.A = 0;
            }
            String str4 = zoi1.a;
            LinkedHashMap linkedHashMap = x8r.a;
            synchronized (x8r.class) {
            }
        }
        zgn0 zgn0Var3 = this.l;
        String str5 = this.t;
        str5.getClass();
        myr myrVar2 = new myr(context, b3kVar4, zfg1Var, z57Var, hfbVar, yysVar, gwgVar, b380Var, a1g1Var, yjqVar, wdd1Var, logSessionIdD, z6, zgn0Var3, str5);
        this.q = myrVar2;
        String str6 = myrVar2.o;
        zgn0 zgn0Var4 = myrVar2.n;
        lqr lqrVar2 = myrVar2.q;
        pgg1Var = new pgg1(myrVar2.a, myrVar2.b, myrVar2.c, myrVar2.d, myrVar2.e, myrVar2.f, myrVar2.g, myrVar2.h, new dhn0(str6, zgn0Var4, lqrVar2, 0, null), lqrVar2, myrVar2.j, myrVar2.k, 0L, myrVar2.l, myrVar2.m);
        myrVar2.r = pgg1Var;
        pgg1Var.d();
        pgg1Var.i.j(1);
        synchronized (pgg1Var.q) {
            pgg1Var.z = 1;
            pgg1Var.A = 0;
            String str7 = zoi1.a;
            LinkedHashMap linkedHashMap2 = x8r.a;
            synchronized (x8r.class) {
            }
        }
    }
}
