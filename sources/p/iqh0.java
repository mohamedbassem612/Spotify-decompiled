package p;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.media3.session.legacy.MediaConstants;
import com.spotify.base.java.logging.Logger;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class iqh0 extends fzh0 {
    public final kph0 H;
    public final uph0 I;
    public final zt50 J;
    public final zt50 K;
    public final byte L;

    public iqh0(kph0 kph0Var, Context context, String str, r8u0 r8u0Var, b380 b380Var, b380 b380Var2, b380 b380Var3, uph0 uph0Var, Bundle bundle, Bundle bundle2, nxa nxaVar) {
        super(kph0Var, context, str, r8u0Var, b380Var, b380Var2, b380Var3, uph0Var, bundle, bundle2, nxaVar);
        this.H = kph0Var;
        this.I = uph0Var;
        this.L = (byte) 2;
        this.J = new zt50();
        this.K = new zt50();
    }

    public static s7c0 D(iph0 iph0Var, jxh0 jxh0Var) {
        b380 b380Var = jxh0Var.a;
        return b380Var.isEmpty() ? new s7c0(-2, SystemClock.elapsedRealtime(), iph0Var, new ke61("no error message provided", -2, Bundle.EMPTY), null, 4) : s7c0.d(b380.t((yoh0) b380Var.get(Math.max(0, Math.min(jxh0Var.b, b380Var.size() - 1)))), iph0Var);
    }

    public static Object O(Future future) {
        dm5.y(future.isDone());
        try {
            return future.get();
        } catch (InterruptedException | CancellationException | ExecutionException e) {
            oon1.I("Library operation failed", e);
            return null;
        }
    }

    public static void P(int i, s7c0 s7c0Var) {
        if (s7c0Var.a == 0) {
            b380 b380Var = (b380) s7c0Var.c;
            b380Var.getClass();
            if (b380Var.size() <= i) {
                return;
            }
            qpp0.l(b380Var.size(), i, ", pageSize=", "Invalid size=");
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0045 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x0047  */
    public final void E(ixh0 ixh0Var, s7c0 s7c0Var) {
        byte b = this.L;
        if (b == 0 || ixh0Var.b != 0) {
            return;
        }
        int i = s7c0Var.a;
        e0i0 e0i0Var = this.h;
        if (i == -102 || i == -105) {
            boolean z = b == 1;
            e0i0Var.getClass();
            iph0 iph0Var = s7c0Var.e;
            ke61 ke61Var = s7c0Var.f;
            int iC = yzb0.c(i);
            b2c b2cVar = e0i0Var.r;
            if (b2cVar == null || b2cVar.a != iC) {
                String str = ke61Var != null ? ke61Var.b : "no error message provided";
                Bundle bundle = Bundle.EMPTY;
                if (iph0Var != null) {
                    Bundle bundle2 = iph0Var.a;
                    if (bundle2.containsKey(MediaConstants.PLAYBACK_STATE_EXTRAS_KEY_ERROR_RESOLUTION_ACTION_INTENT)) {
                        bundle = bundle2;
                    } else if (ke61Var != null) {
                        bundle = ke61Var.c;
                    }
                } else if (ke61Var != null) {
                    bundle = ke61Var.c;
                }
                e0i0Var.r = new b2c(z, iC, str, bundle);
                fzh0 fzh0Var = e0i0Var.d;
                fzh0Var.C();
                e0i0Var.n(fzh0Var.t);
            }
        }
        if (i != 0 || e0i0Var.r == null) {
            return;
        }
        e0i0Var.r = null;
        fzh0 fzh0Var2 = e0i0Var.d;
        fzh0Var2.C();
        e0i0Var.n(fzh0Var2.t);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final n8d0 F(ixh0 ixh0Var, String str, int i, int i2, final iph0 iph0Var) {
        boolean zEquals = Objects.equals(str, "androidx.media3.session.recent.root");
        Object[] objArr = 0;
        uph0 uph0Var = this.I;
        if (!zEquals) {
            ixh0 ixh0VarA = A(ixh0Var);
            uph0Var.getClass();
            Logger.b("MLS: onGetChildren: parentId=%s, package=%s, isRecent=%s", new Object[]{str, ixh0VarA.a.getPackageName(), iph0Var != null ? Boolean.valueOf(iph0Var.b) : null});
            n8d0 n8d0VarF = uph0Var.c.a().f(this.H, str, iph0Var);
            n8d0VarF.b(new dqh0(this, n8d0VarF, ixh0Var, i2, (byte) 0), new fqh0(this, (byte) 0));
            return n8d0VarF;
        }
        if (this.h.l == null) {
            return fc11.J(s7c0.b(-6));
        }
        C();
        final byte b = 1;
        if (this.t.getPlaybackState() == 1) {
            if (this.B) {
                g();
            }
            uph0Var.getClass();
            c280 c280Var = new c280(new UnsupportedOperationException());
            final Object[] objArr2 = objArr == true ? 1 : 0;
            su30 su30Var = new su30() { // from class: p.hqh0
                public final Object apply(Object obj) {
                    switch (objArr2) {
                        case 0:
                            return iqh0.D(iph0Var, (jxh0) obj);
                        default:
                            oon1.w("Failed fetching recent media item at boot time.", (Throwable) obj);
                            return new s7c0(-1, SystemClock.elapsedRealtime(), iph0Var, new ke61("no error message provided", -1, Bundle.EMPTY), null, 4);
                    }
                }
            };
            l5u l5uVar = l5u.a;
            return w5.y(ia.y(c280Var, su30Var, l5uVar), new su30() { // from class: p.hqh0
                public final Object apply(Object obj) {
                    switch (b) {
                        case 0:
                            return iqh0.D(iph0Var, (jxh0) obj);
                        default:
                            oon1.w("Failed fetching recent media item at boot time.", (Throwable) obj);
                            return new s7c0(-1, SystemClock.elapsedRealtime(), iph0Var, new ke61("no error message provided", -1, Bundle.EMPTY), null, 4);
                    }
                }
            }, l5uVar);
        }
        loh0 loh0Var = new loh0();
        ooh0 ooh0Var = new ooh0();
        List list = Collections.EMPTY_LIST;
        w280 w280Var = b380.b;
        bg11 bg11Var = bg11.e;
        qoh0 qoh0Var = new qoh0();
        toh0 toh0Var = toh0.d;
        upq upqVar = new upq();
        upqVar.r = Boolean.FALSE;
        upqVar.s = Boolean.TRUE;
        tqh0 tqh0Var = new tqh0(upqVar);
        dm5.y(((Uri) ooh0Var.e) == null || ((UUID) ooh0Var.d) != null);
        return fc11.J(s7c0.d(b380.t(new yoh0("androidx.media3.session.recent.item", new noh0(loh0Var), null, new roh0(qoh0Var), tqh0Var, toh0Var)), iph0Var));
    }

    public final f280 G(ixh0 ixh0Var) {
        A(ixh0Var);
        this.I.getClass();
        f280 f280VarJ = fc11.J(s7c0.b(-6));
        f280VarJ.b(new gqh0(this, f280VarJ, ixh0Var, (byte) 0), new fqh0(this, (byte) 0));
        return f280VarJ;
    }

    public final n8d0 H(ixh0 ixh0Var, iph0 iph0Var) {
        if (iph0Var == null || !iph0Var.b || !fzh0.q(ixh0Var)) {
            return this.I.c.a().d(this.H, A(ixh0Var), iph0Var);
        }
        if (this.h.l == null) {
            return fc11.J(s7c0.b(-6));
        }
        loh0 loh0Var = new loh0();
        ooh0 ooh0Var = new ooh0();
        List list = Collections.EMPTY_LIST;
        w280 w280Var = b380.b;
        bg11 bg11Var = bg11.e;
        qoh0 qoh0Var = new qoh0();
        toh0 toh0Var = toh0.d;
        upq upqVar = new upq();
        upqVar.r = Boolean.TRUE;
        upqVar.s = Boolean.FALSE;
        tqh0 tqh0Var = new tqh0(upqVar);
        dm5.y(((Uri) ooh0Var.e) == null || ((UUID) ooh0Var.d) != null);
        return fc11.J(s7c0.c(new yoh0("androidx.media3.session.recent.root", new noh0(loh0Var), null, new roh0(qoh0Var), tqh0Var, toh0Var), iph0Var));
    }

    public final n8d0 I(ixh0 ixh0Var, String str, int i, int i2, iph0 iph0Var) {
        n8d0 n8d0VarB = this.I.c.a().b(this.H, A(ixh0Var), str, iph0Var);
        n8d0VarB.b(new dqh0(this, n8d0VarB, ixh0Var, i2, (byte) 1), new fqh0(this, (byte) 0));
        return n8d0VarB;
    }

    public final f280 J(ixh0 ixh0Var, String str, iph0 iph0Var) {
        ixh0 ixh0VarA = A(ixh0Var);
        this.I.getClass();
        dm5.m(!TextUtils.isEmpty(str));
        iqh0 iqh0Var = this.H.a;
        iqh0Var.getClass();
        iqh0Var.M(new m2d((Object) iqh0Var, (Object) ixh0VarA, (Object) str, (Object) iph0Var, (byte) 12));
        f280 f280VarJ = fc11.J(s7c0.e());
        f280VarJ.b(new gqh0(this, f280VarJ, ixh0Var, (byte) 1), new fqh0(this, (byte) 0));
        return f280VarJ;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x005f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p.f280 K(p.ixh0 r7, java.lang.String r8, p.iph0 r9) throws java.lang.Throwable {
        /*
            r6 = this;
            p.hxh0 r9 = r7.e
            r9.getClass()
            monitor-enter(r6)
            p.zt50 r0 = r6.K     // Catch: java.lang.Throwable -> L5a
            r0.o(r9, r8)     // Catch: java.lang.Throwable -> L5a
            p.zt50 r9 = r6.J     // Catch: java.lang.Throwable -> L5a
            r9.o(r8, r7)     // Catch: java.lang.Throwable -> L5a
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L5a
            p.uph0 r9 = r6.I
            p.kph0 r0 = r6.H
            p.ixh0 r1 = r6.A(r7)
            r9.getClass()
            java.lang.String r2 = "MLS: onSubscribe: parentId=%s, package=%s, uid=%d"
            androidx.media3.session.legacy.MediaSessionManager$RemoteUserInfo r3 = r1.a
            java.lang.String r3 = r3.getPackageName()
            androidx.media3.session.legacy.MediaSessionManager$RemoteUserInfo r1 = r1.a
            int r1 = r1.getUid()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r8, r3, r1}
            com.spotify.base.java.logging.Logger.b(r2, r1)
            p.zph0 r9 = r9.c
            p.xph0 r9 = r9.a()
            r9.h(r0, r8)
            p.s7c0 r9 = p.s7c0.e()
            p.f280 r2 = p.fc11.J(r9)
            p.m2d r0 = new p.m2d
            r5 = 11
            r1 = r6
            r3 = r7
            r4 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            p.fqh0 r6 = new p.fqh0
            r7 = 1
            r6.<init>(r1, r7)
            r2.b(r0, r6)
            return r2
        L5a:
            r0 = move-exception
            r1 = r6
        L5c:
            r6 = r0
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5f
            throw r6
        L5f:
            r0 = move-exception
            goto L5c
        */
        throw new UnsupportedOperationException("Method not decompiled: p.iqh0.K(p.ixh0, java.lang.String, p.iph0):p.f280");
    }

    public final f280 L(ixh0 ixh0Var, String str) {
        A(ixh0Var);
        this.I.c.a().a(this.H, str);
        f280 f280VarJ = fc11.J(s7c0.e());
        f280VarJ.b(new c45((Object) this, (Object) ixh0Var, (Object) str, (byte) 29), new fqh0(this, (byte) 0));
        return f280VarJ;
    }

    public final void M(Runnable runnable) {
        zoi1.c0(this.l, runnable);
    }

    public final synchronized void N(ixh0 ixh0Var, String str) {
        hxh0 hxh0Var = ixh0Var.e;
        hxh0Var.getClass();
        this.J.l(str, ixh0Var);
        this.K.l(hxh0Var, str);
    }

    @Override // p.fzh0
    public final bg11 f() {
        tph0 tph0Var;
        bg11 bg11VarF = super.f();
        synchronized (this.a) {
            tph0Var = this.y;
        }
        if (tph0Var == null) {
            return bg11VarF;
        }
        b380 b380VarM = tph0Var.c.m();
        v280 v280VarN = b380.n(b380VarM.size() + bg11VarF.d);
        v280VarN.e(bg11VarF);
        v280VarN.e(b380VarM);
        return v280VarN.g();
    }
}
