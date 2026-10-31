package p;

import android.content.Context;
import android.media.metrics.LogSessionId;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class myr {
    public final Context a;
    public final b3k b;
    public final zfg1 c;
    public final z57 d;
    public final hfb e;
    public final yys f;
    public final gwg g;
    public final b380 h;
    public final a1g1 i;
    public final yjq j;
    public final wdd1 k;
    public final LogSessionId l;
    public final boolean m;
    public final zgn0 n;
    public final String o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final bt00 f98p = new bt00();
    public final lqr q = new lqr(this, (byte) 3);
    public pgg1 r;

    public myr(Context context, b3k b3kVar, zfg1 zfg1Var, z57 z57Var, hfb hfbVar, yys yysVar, gwg gwgVar, b380 b380Var, a1g1 a1g1Var, yjq yjqVar, wdd1 wdd1Var, LogSessionId logSessionId, boolean z, zgn0 zgn0Var, String str) {
        this.a = context;
        this.b = b3kVar;
        this.c = zfg1Var;
        this.d = z57Var;
        this.e = hfbVar;
        this.f = yysVar;
        this.g = gwgVar;
        this.h = b380Var;
        this.i = a1g1Var;
        this.j = yjqVar;
        this.k = wdd1Var;
        this.l = logSessionId;
        this.n = zgn0Var;
        this.o = str;
        this.m = z;
    }

    public final void a() {
        pgg1 pgg1Var = this.r;
        if (pgg1Var != null) {
            synchronized (pgg1Var.s) {
                try {
                    if (pgg1Var.B) {
                        return;
                    }
                    pgg1Var.d();
                    pgg1Var.i.d(null, 4, 1, 0).b();
                    pgg1Var.o.b();
                    pgg1Var.o.d();
                    RuntimeException runtimeException = pgg1Var.y;
                    if (runtimeException != null) {
                        throw runtimeException;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final int b(ij81 ij81Var) {
        int i;
        pgg1 pgg1Var = this.r;
        if (pgg1Var == null) {
            return 0;
        }
        synchronized (pgg1Var.q) {
            try {
                i = pgg1Var.z;
                if (i == 2) {
                    ij81Var.b = pgg1Var.A;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i;
    }
}
