package p;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v4.media.session.d;
import io.reactivex.rxjava3.subjects.BehaviorSubject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class kyh0 implements y490 {
    public final gtv0 a;
    public final nxh0 b;
    public final qyh0 c;
    public final s0i0 d;
    public final cua e;
    public final n2i0 f;
    public final yqg g;
    public final BehaviorSubject h;
    public eyh0 i;
    public hyh0 j;
    public final Handler k;
    public volatile p7s l;
    public volatile boolean m;
    public w0i0 n;
    public final BehaviorSubject o;

    public kyh0(gtv0 gtv0Var, nxh0 nxh0Var, twa twaVar, qyh0 qyh0Var, ypa ypaVar, lqc lqcVar, s0i0 s0i0Var, cua cuaVar, n2i0 n2i0Var, Looper looper, yqg yqgVar) {
        this.a = gtv0Var;
        this.b = nxh0Var;
        this.c = qyh0Var;
        this.d = s0i0Var;
        this.e = cuaVar;
        this.f = n2i0Var;
        this.g = yqgVar;
        BehaviorSubject behaviorSubjectF = BehaviorSubject.f();
        this.h = behaviorSubjectF;
        this.k = new Handler(looper);
        this.o = behaviorSubjectF;
    }

    public static g1i0 n(PlaybackStateCompat playbackStateCompat) {
        int i = playbackStateCompat.a;
        if (i == 0) {
            return g1i0.a;
        }
        if (i == 1) {
            return g1i0.e;
        }
        if (i == 2) {
            return g1i0.d;
        }
        if (i == 3) {
            return g1i0.c;
        }
        if (i == 6) {
            return g1i0.g;
        }
        if (i == 7) {
            return g1i0.f;
        }
        if (i == 8) {
            return g1i0.b;
        }
        hhg1.n(f4i1.c(i, "Unknown playback state: "));
        return null;
    }

    @Override // p.y490
    public final MediaSessionCompat.Token a() {
        eyh0 eyh0Var = this.i;
        if (eyh0Var != null) {
            return eyh0Var.i();
        }
        u890.C("mediaSessionCompat");
        throw null;
    }

    @Override // p.y490
    public final void c(av7 av7Var) {
        int i;
        int i2;
        ysk1 ysk1VarE = av7Var.e();
        int iC = l1d.C(ysk1VarE.a());
        if (iC != 0) {
            if (iC != 1) {
                i = 2;
                if (iC != 2) {
                    eg.o();
                    return;
                }
            } else {
                i2 = 1;
            }
            ev40 ev40Var = new ev40(av7Var, this, ysk1VarE, i2, ysk1VarE.c(), ysk1VarE.b());
            av7Var.k(new yfc0(ev40Var, (byte) 14));
            this.f.a().post(new jyh0(this, ev40Var, (byte) 1));
        }
        i = 0;
        i2 = i;
        ev40 ev40Var2 = new ev40(av7Var, this, ysk1VarE, i2, ysk1VarE.c(), ysk1VarE.b());
        av7Var.k(new yfc0(ev40Var2, (byte) 14));
        this.f.a().post(new jyh0(this, ev40Var2, (byte) 1));
    }

    @Override // p.y490
    public final void d() {
        this.f.a().post(new iyh0(this, (byte) 2));
    }

    @Override // p.y490
    public final void e(mmr0 mmr0Var) {
        eyh0 eyh0Var = this.i;
        if (eyh0Var == null || eyh0Var.e().f() == null) {
            return;
        }
        this.f.a().post(new aih0(this, mmr0Var, false, (byte) 6));
    }

    @Override // p.y490
    public final void f(Context context) {
        n2i0 n2i0Var = this.f;
        if (n2i0Var.a == null) {
            HandlerThread handlerThread = new HandlerThread("MediaSession worker");
            handlerThread.start();
            n2i0Var.a = new Handler(handlerThread.getLooper());
        }
        eyh0 eyh0VarF = ypa.f(context, lqc.t(context));
        this.i = eyh0VarF;
        this.j = new hyh0(eyh0VarF, this.b, this.a, this.c, this.g);
    }

    @Override // p.y490
    public final void g(p7s p7sVar) {
        this.k.post(new jyh0(this, p7sVar, (byte) 0));
    }

    @Override // p.y490
    public final void h() {
        this.m = false;
        this.f.a().post(new iyh0(this, (byte) 1));
    }

    @Override // p.y490
    public final void i() {
        this.k.post(new iyh0(this, (byte) 0));
    }

    @Override // p.y490
    public final boolean isActive() {
        return this.m;
    }

    @Override // p.y490
    public final void j() {
        this.m = true;
        this.f.a().post(new g54(this, (byte) 10));
    }

    @Override // p.y490
    public final BehaviorSubject k() {
        return this.o;
    }

    @Override // p.y490
    public final void l(r0i0 r0i0Var) {
        w0i0 w0i0Var = this.n;
        w0i0 w0i0Var2 = r0i0Var.i;
        boolean zJ = u890.j(w0i0Var, w0i0Var2);
        n2i0 n2i0Var = this.f;
        if (!zJ) {
            n2i0Var.a().post(new jyh0(this, w0i0Var2.a(), (byte) 2));
            this.n = w0i0Var2;
        }
        n2i0Var.a().post(new aih0(this, r0i0Var, false, (byte) 4));
    }

    public final boolean m() {
        eyh0 eyh0Var = this.i;
        if (eyh0Var == null) {
            u890.C("mediaSessionCompat");
            throw null;
        }
        if (!eyh0Var.o()) {
            n57.s("MediaSession should have been active already!");
        }
        eyh0 eyh0Var2 = this.i;
        if (eyh0Var2 != null) {
            return eyh0Var2.o();
        }
        u890.C("mediaSessionCompat");
        throw null;
    }

    @Override // p.y490
    public final void release() {
        this.m = false;
        n2i0 n2i0Var = this.f;
        Handler handler = n2i0Var.a;
        n2i0Var.a = null;
        eyh0 eyh0Var = this.i;
        if (eyh0Var != null) {
            this.k.post(new uu1(this, handler, eyh0Var, (byte) 20));
        } else {
            u890.C("mediaSessionCompat");
            throw null;
        }
    }

    @Override // p.y490
    public final void reset() {
        this.f.a().post(new xwn1(this, new d().a(), (byte) 29));
    }

    @Override // p.y490
    public final void setExtras(Bundle bundle) {
        this.f.a().post(new aih0(this, bundle, false, (byte) 3));
    }

    @Override // p.y490
    public final void setSessionActivity(PendingIntent pendingIntent) {
        this.f.a().post(new aih0(this, pendingIntent, false, (byte) 5));
    }

    @Override // p.y490
    public final void b(r0i0 r0i0Var) {
    }
}
