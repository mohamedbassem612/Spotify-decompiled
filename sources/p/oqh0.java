package p;

import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Point;
import android.media.session.MediaSession;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.media.session.MediaSessionCompat;
import android.util.TypedValue;
import android.view.Display;
import android.view.WindowManager;
import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class oqh0 implements y490 {
    public final x5b1 a;
    public final uph0 b;
    public final wph0 c;
    public final bqh0 d;
    public final cqh0 e;
    public final m89 f;
    public final aqh0 g;
    public final Context h;
    public final fer i;
    public final onr j;
    public final v8l k;
    public final ark1 l;
    public final Executor m;
    public kph0 n;
    public boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final llm f109p;
    public final BehaviorSubject q = BehaviorSubject.f();
    public av7 r;
    public String s;

    public oqh0(x5b1 x5b1Var, uph0 uph0Var, wph0 wph0Var, bqh0 bqh0Var, cqh0 cqh0Var, m89 m89Var, aqh0 aqh0Var, q8n q8nVar, Context context, fer ferVar, onr onrVar, v8l v8lVar, ark1 ark1Var, Executor executor) {
        this.a = x5b1Var;
        this.b = uph0Var;
        this.c = wph0Var;
        this.d = bqh0Var;
        this.e = cqh0Var;
        this.f = m89Var;
        this.g = aqh0Var;
        this.h = context;
        this.i = ferVar;
        this.j = onrVar;
        this.k = v8lVar;
        this.l = ark1Var;
        this.m = executor;
        this.f109p = us71.h(q8nVar);
    }

    public final MediaSessionCompat.Token a() {
        MediaSession.Token tokenH = n().a.h();
        if (tokenH != null) {
            return new MediaSessionCompat.Token(tokenH, (lh70) null, 0);
        }
        return null;
    }

    public final void b(r0i0 r0i0Var) throws Exception {
        o(r0i0Var);
    }

    public final void c(av7 av7Var) {
        this.r = av7Var;
    }

    public final void d() {
        this.r = null;
    }

    public final void e(mmr0 mmr0Var) {
        kph0 kph0VarN = n();
        cqh0 cqh0Var = this.e;
        cqh0Var.a.putBoolean((String) mmr0Var.a, ((Boolean) mmr0Var.b).booleanValue());
        kph0VarN.k(cqh0.a(new Bundle[]{cqh0Var.b, cqh0Var.a}));
    }

    public final void f(Context context) {
        lnm lnmVar = null;
        this.s = null;
        kph0 kph0Var = this.n;
        if (kph0Var != null) {
            Logger.b("MLS: createSession overwriting existing session=%s", new Object[]{Integer.valueOf(System.identityHashCode(kph0Var))});
        }
        uph0 uph0Var = this.b;
        x5b1 x5b1Var = this.a;
        jph0 jph0Var = new jph0(context, x5b1Var, uph0Var);
        jph0Var.c = "spotify-media3-session-id";
        dm5.y(!jph0Var.k);
        jph0Var.k = true;
        Object obj = kph0.b;
        int iIntValue = ((Integer) fzh0.G.get()).intValue();
        int i = Build.VERSION.SDK_INT;
        Context context2 = jph0Var.a;
        if (i < 27) {
            iIntValue = Math.max(iIntValue, (int) TypedValue.applyDimension(1, 320.0f, context2.getResources().getDisplayMetrics()));
        }
        nxa nxaVar = jph0Var.g;
        if (nxaVar == null) {
            b8p1 b8p1Var = new b8p1(context2);
            b8p1Var.b = (iIntValue * 2) - 1;
            q2r q2rVar = new q2r(b8p1Var);
            jph0Var.g = q2rVar;
            nxaVar = q2rVar;
        }
        nxa sw9Var = new sw9(nxaVar, iIntValue, (byte) 29);
        jph0Var.g = sw9Var;
        byte b = 0;
        if (i == 29) {
            AtomicReference atomicReference = jph0.l;
            u280 u280VarC = (u280) atomicReference.get();
            if (u280VarC == null) {
                Display defaultDisplay = ((WindowManager) context2.getSystemService(WindowManager.class)).getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                Point point2 = new Point();
                defaultDisplay.getRealSize(point2);
                int i2 = point2.y;
                int i3 = point2.x;
                Point point3 = new Point(i2 - (i3 - point.x), i3 - (i2 - point.y));
                u280VarC = u280.c(Math.max(point.x / 6, point.y / 6), Math.max(point3.x / 6, point3.y / 6));
                atomicReference.set(u280VarC);
            }
            nxa nn61Var = new nn61(sw9Var, u280VarC, false, (byte) 24);
            jph0Var.g = nn61Var;
            sw9Var = nn61Var;
        }
        jph0Var.g = new q59(sw9Var);
        kph0 kph0Var2 = new kph0(context2, jph0Var.c, jph0Var.b, jph0Var.h, jph0Var.i, jph0Var.j, jph0Var.d, jph0Var.e, jph0Var.f, jph0Var.g);
        this.n = kph0Var2;
        Logger.b("MLS: createSession created session=%s", new Object[]{Integer.valueOf(System.identityHashCode(kph0Var2))});
        x5b1Var.n = new n0g0(0, this, oqh0.class, "resolveCallingPackage", "resolveCallingPackage()Ljava/lang/String;", 0, (byte) 3);
        x5b1Var.f166p = new zud0(this, (byte) 10);
        fu20 fu20Var = new fu20(new b8d0(rqt0.u(this.f.b), this, (byte) 25), new lqh0(this, lnmVar, b), (byte) 1);
        llm llmVar = this.f109p;
        l4p1.u(llmVar, fu20Var);
        l4p1.u(llmVar, new fu20(rqt0.u(new b8d0(new f8f0((mr20) this.i.d.getValue(), (byte) 15), this, (byte) 26)), new lqh0(this, lnmVar, (byte) 1), (byte) 1));
        hi61 hi61Var = n().a.j;
        Context context3 = this.h;
        context3.getClass();
        hi61Var.getClass();
        Bundle bundle = Bundle.EMPTY;
        pvc pvcVar = new pvc((byte) 15);
        Looper looperD = zoi1.D();
        Bundle bundle2 = new Bundle(pzm.g("androidx.media3.session.MediaNotificationManager", true));
        xkh0 xkh0Var = new xkh0(looperD);
        zoi1.c0(new Handler(looperD), new rkh0(xkh0Var, new tkh0(context3, hi61Var, bundle2, pvcVar, looperD, xkh0Var), (byte) 0));
        xkh0Var.b(new nx30(xkh0Var, new yla((byte) 16), (byte) 24), this.m);
    }

    public final void h() {
        this.o = false;
        wph0 wph0Var = this.c;
        wph0Var.d.c();
        wph0Var.e.clear();
    }

    public final boolean isActive() {
        return this.o;
    }

    public final void j() {
        this.o = true;
    }

    public final BehaviorSubject k() {
        return this.q;
    }

    public final void l(r0i0 r0i0Var) throws Exception {
        if (!this.o) {
            n57.s("MediaSession should have been active already!");
        }
        if (this.o) {
            o(r0i0Var);
        }
    }

    public final kph0 m() {
        return this.n;
    }

    public final kph0 n() {
        kph0 kph0Var = this.n;
        if (kph0Var != null) {
            return kph0Var;
        }
        eg.m("Accessing mediaLibrarySession before it is initialized or after it was destroyed");
        return null;
    }

    public final void o(r0i0 r0i0Var) throws Exception {
        ke61 ke61Var;
        g1i0 g1i0Var;
        int i;
        int i2;
        mgz mgzVar = r0i0Var.e;
        List list = r0i0Var.l;
        int i3 = r0i0Var.a;
        Bundle bundle = r0i0Var.d;
        if (mgzVar != null) {
            switch (mgzVar.ordinal()) {
                case 0:
                    i2 = -1;
                    break;
                case 1:
                    i2 = -2;
                    break;
                case 2:
                    i2 = -6;
                    break;
                case 3:
                    i2 = -102;
                    break;
                case 4:
                    i2 = -103;
                    break;
                case 5:
                    i2 = -104;
                    break;
                case 6:
                    i2 = -105;
                    break;
                case 7:
                    i2 = -106;
                    break;
                case 8:
                    i2 = -110;
                    break;
                case 9:
                    i2 = -107;
                    break;
                case 10:
                    i2 = 1;
                    break;
                case 11:
                    i2 = -109;
                    break;
                default:
                    eg.o();
                    return;
            }
            String str = r0i0Var.f;
            if (str == null) {
                str = "";
            }
            ke61Var = new ke61(str, i2, bundle);
        } else {
            ke61Var = null;
        }
        if (ke61Var != null) {
            iqh0 iqh0Var = n().a;
            iqh0Var.getClass();
            iqh0Var.y(new zyh0(iqh0Var, ke61Var, (byte) 1));
        }
        x5b1 x5b1Var = this.a;
        x5b1Var.getClass();
        j2i0 j2i0Var = r0i0Var.k;
        int i4 = 0;
        if (u890.j(Looper.myLooper(), x5b1Var.c)) {
            r4z0 r4z0VarA = r0i0Var.i.a();
            int iE1 = x5b1.E1(r0i0Var);
            if (r4z0VarA.c.size() >= 2 || j2i0Var != null || iE1 == 1 || iE1 == 4) {
                x5b1Var.m = list;
                boolean z = !x5b1.B1(r4z0VarA, j2i0Var).isEmpty();
                tv81 tv81Var = new tv81();
                x5b1Var.A1(tv81Var, r4z0VarA, j2i0Var);
                if (iE1 == 1) {
                    tv81Var.e = x5b1.C1(r0i0Var);
                }
                tv81Var.d = iE1;
                if (i3 == 3) {
                    float f = r0i0Var.c;
                    if (j2i0Var != null && j2i0Var.u) {
                        x5b1.z1(tv81Var, 1.0f);
                    } else if (f > 0.0f) {
                        x5b1.z1(tv81Var, f);
                    }
                }
                x5b1.x1(tv81Var, x5b1Var.o);
                tv81Var.g = r0i0Var.g == 2;
                int iOrdinal = r0i0Var.h.ordinal();
                if (iOrdinal == 0) {
                    i = 0;
                } else if (iOrdinal == 1) {
                    i = 1;
                } else {
                    if (iOrdinal != 2) {
                        eg.o();
                        return;
                    }
                    i = 2;
                }
                tv81Var.f = i;
                tv81Var.b = i3 == 3 || i3 == 4;
                tv81Var.c = true;
                tv81Var.a = x5b1.D1(list, z);
                tv81Var.A = 0;
                tv81Var.D = Long.valueOf(r0i0Var.b);
                x5b1Var.l = new uv81(tv81Var);
                x5b1Var.q1();
            } else {
                n57.s("Empty queue and no active track not compatible with player state " + iE1 + ". PlaybackState: " + r0i0Var);
            }
        } else {
            x5b1Var.k.post(new jyh0(r0i0Var, x5b1Var, (byte) 24));
        }
        ArrayList<igh0> arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof igh0) {
                arrayList.add(obj);
            }
        }
        kph0 kph0VarN = n();
        aqh0 aqh0Var = this.g;
        aqh0Var.getClass();
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        for (igh0 igh0Var : arrayList) {
            tdh tdhVar = new tdh(i4);
            tdhVar.b(new pa61(igh0Var.c, Bundle.EMPTY));
            tdhVar.f = aqh0Var.a.getResources().getString(igh0Var.b);
            tdhVar.d = igh0Var.a;
            String str2 = igh0Var.c;
            int iHashCode = str2.hashCode();
            if (iHashCode != -1650614831) {
                if (iHashCode != -361190085) {
                    if (iHashCode == 19030885 && str2.equals("SKIP_TO_NEXT_CHAPTER")) {
                        tdhVar.d(3, 6);
                    }
                } else if (str2.equals("SEEK_15_SECONDS_BACK")) {
                    tdhVar.d(2, 6);
                }
            } else if (str2.equals("SEEK_15_SECONDS_FORWARD")) {
                tdhVar.d(3, 6);
            }
            arrayList2.add(tdhVar.a());
            i4 = 0;
        }
        bqh0 bqh0Var = this.d;
        if (!arrayList2.equals(bqh0Var.a)) {
            bqh0Var.a = arrayList2;
            bqh0Var.a(kph0VarN);
        }
        int iC = l1d.C(i3);
        if (iC == 0) {
            g1i0Var = g1i0.a;
        } else if (iC == 1) {
            g1i0Var = g1i0.d;
        } else if (iC == 2) {
            g1i0Var = g1i0.c;
        } else if (iC == 3) {
            g1i0Var = g1i0.g;
        } else if (iC == 4) {
            g1i0Var = g1i0.f;
        } else {
            if (iC != 5) {
                eg.o();
                return;
            }
            g1i0Var = g1i0.b;
        }
        this.q.onNext(g1i0Var);
        kph0 kph0VarN2 = n();
        cqh0 cqh0Var = this.e;
        cqh0Var.getClass();
        if (bundle.equals(Bundle.EMPTY)) {
            bundle = new Bundle();
        }
        cqh0Var.a = bundle;
        kph0VarN2.k(cqh0.a(new Bundle[]{cqh0Var.b, bundle}));
    }

    public final void release() {
        kph0 kph0Var = this.n;
        Logger.b("MLS: releasing session=%s", new Object[]{kph0Var != null ? Integer.valueOf(System.identityHashCode(kph0Var)) : "null"});
        this.s = null;
        x5b1 x5b1Var = this.a;
        x5b1Var.w1();
        if (x5b1Var.t1(32)) {
            eg.m("Missing implementation to handle COMMAND_RELEASE");
            return;
        }
        op71.q(this.f109p.a, (CancellationException) null);
        bqh0 bqh0Var = this.d;
        z6x z6xVar = z6x.a;
        bqh0Var.a = z6xVar;
        bqh0Var.b = z6xVar;
        cqh0 cqh0Var = this.e;
        cqh0Var.getClass();
        cqh0Var.a = new Bundle();
        cqh0Var.b = new Bundle();
        kph0 kph0VarN = n();
        try {
            synchronized (kph0.b) {
                kph0.c.remove(kph0VarN.a.i);
            }
            kph0VarN.a.z();
        } catch (Exception unused) {
        }
    }

    public final void reset() {
        x5b1 x5b1Var = this.a;
        x5b1Var.getClass();
        boolean zJ = u890.j(Looper.myLooper(), x5b1Var.c);
        z6x z6xVar = z6x.a;
        if (zJ) {
            x5b1Var.o = new imo(0, 0);
            x5b1Var.m = z6xVar;
            tv81 tv81Var = new tv81();
            tv81Var.a = x5b1.q;
            x5b1Var.l = new uv81(tv81Var);
            x5b1Var.q1();
        } else {
            x5b1Var.k.post(new xfz0(x5b1Var, (byte) 18));
        }
        this.r = null;
        kph0 kph0VarN = n();
        bqh0 bqh0Var = this.d;
        if (!z6xVar.equals(bqh0Var.a)) {
            bqh0Var.a = z6xVar;
            bqh0Var.a(kph0VarN);
        }
        this.q.onNext(g1i0.a);
    }

    public final void setExtras(Bundle bundle) {
        kph0 kph0VarN = n();
        cqh0 cqh0Var = this.e;
        cqh0Var.b = bundle;
        kph0VarN.k(cqh0.a(new Bundle[]{bundle, cqh0Var.a}));
    }

    public final void setSessionActivity(PendingIntent pendingIntent) {
        kph0 kph0VarN = n();
        if (Build.VERSION.SDK_INT >= 31) {
            dm5.m(mb4.w(pendingIntent));
        }
        iqh0 iqh0Var = kph0VarN.a;
        iqh0Var.getClass();
        iqh0Var.y(new zyh0(iqh0Var, pendingIntent, (byte) 0));
    }

    public final void i() {
    }

    public final void g(p7s p7sVar) {
    }
}
