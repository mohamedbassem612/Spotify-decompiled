package p;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class e2u0 implements c2u0 {
    public static final Set f;
    public static final List g;
    public final pjm0 a;
    public final c3s b;
    public volatile boolean c;
    public final Object d;
    public d2u0 e;

    static {
        new q3c();
        f = Collections.singleton("ubi.interaction_id");
        g = p7h.M("playback.id", "playback.clip_uri", "playback.content_type");
    }

    public e2u0(pjm0 pjm0Var, c3s c3sVar) {
        hhp0 hhp0Var = hhp0.a;
        this.a = pjm0Var;
        this.b = c3sVar;
        this.d = new Object();
    }

    public static void c(e2u0 e2u0Var, String str, mwt0 mwt0Var, String str2, Long l, int i) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            l = null;
        }
        synchronized (e2u0Var.d) {
            try {
                d2u0 d2u0Var = e2u0Var.e;
                if (d2u0Var == null) {
                    return;
                }
                if (q3c.t(d2u0Var.c(), mwt0Var) != 1) {
                    return;
                }
                q3c.q(d2u0Var.c(), mwt0Var);
                d2u0Var.c().setAttribute("outcome", str);
                if (str2 != null) {
                    d2u0Var.c().setAttribute("error", str2);
                }
                if (l != null) {
                    d2u0Var.a().a(l);
                    d2u0Var.b().a(l);
                    d2u0Var.d().a(l.longValue());
                    d2u0Var.c().a(l.longValue());
                } else {
                    d2u0Var.a().a(null);
                    d2u0Var.b().a(null);
                    d2u0Var.d().stop();
                    d2u0Var.c().stop();
                }
                e2u0Var.e = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        synchronized (this.d) {
            d2u0 d2u0Var = this.e;
            if (d2u0Var == null) {
                return;
            }
            d2u0Var.a().a(null);
            d2u0Var.b().a(null);
            d2u0Var.d().stop();
            d2u0Var.c().cancel();
            this.e = null;
        }
    }

    public final void d(String str, mwt0 mwt0Var) {
        Integer numC0;
        if (this.c) {
            if (!this.b.d()) {
                b();
                return;
            }
            if (!str.equals("timeline_conductor_media_skipped")) {
                c(this, "failed", mwt0Var, str, null, 8);
                return;
            }
            synchronized (this.d) {
                try {
                    d2u0 d2u0Var = this.e;
                    if (d2u0Var == null) {
                        return;
                    }
                    Iterator it = g.iterator();
                    while (it.hasNext()) {
                        d2u0Var.c().setAttribute((String) it.next(), "");
                    }
                    String str2 = (String) d2u0Var.c().getAttributes().get("playback.skipped_clip_count");
                    d2u0Var.c().setAttribute("playback.skipped_clip_count", String.valueOf(((str2 == null || (numC0 = nhc1.c0(str2)) == null) ? 0 : numC0.intValue()) + 1));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void e(long j, mwt0 mwt0Var) {
        if (this.c) {
            if (this.b.d()) {
                c(this, "rendered", mwt0Var, null, Long.valueOf(j), 4);
            } else {
                b();
            }
        }
    }

    public final void f(String str, mwt0 mwt0Var, mtj0 mtj0Var, Long l) {
        if (this.c) {
            if (!this.b.d()) {
                b();
                return;
            }
            long jLongValue = l != null ? l.longValue() : this.a.a();
            synchronized (this.d) {
                try {
                    d2u0 d2u0Var = this.e;
                    if (d2u0Var != null) {
                        int iT = q3c.t(d2u0Var.c(), mwt0Var);
                        if (iT != 1 && (iT != 3 || mtj0Var != mtj0.a)) {
                            if (mtj0Var == mtj0.a) {
                                return;
                            }
                            d2u0Var.c().setAttribute("outcome", "superseded");
                            d2u0Var.a().a(Long.valueOf(jLongValue));
                            d2u0Var.b().a(Long.valueOf(jLongValue));
                            d2u0Var.d().a(jLongValue);
                            d2u0Var.c().a(jLongValue);
                        }
                        q3c.u(d2u0Var.c(), mwt0Var);
                        q3c.q(d2u0Var.c(), mwt0Var);
                        d2u0Var.a().a(Long.valueOf(jLongValue));
                        this.e = new d2u0(d2u0Var.c(), d2u0Var.d(), d2u0Var.b(), d2u0Var.d().c(Long.valueOf(jLongValue), str));
                        return;
                    }
                    hhp0 hhp0Var = hhp0.a;
                    kj41 kj41VarU = hhp0Var.u("playback.start");
                    kj41VarU.d(jLongValue);
                    kj41VarU.setAttribute("capture.coverage", "partial");
                    kj41VarU.setAttribute("capture.callsite", str);
                    q3c.q(kj41VarU, mwt0Var);
                    nif1 nif1VarL = ihp0.l(hhp0Var, "playback.start", null, 6);
                    this.e = new d2u0(kj41VarU, nif1VarL, nif1VarL.c(Long.valueOf(jLongValue), "playback.start"), nif1VarL.c(Long.valueOf(jLongValue), str));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
