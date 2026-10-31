package p;

import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class g2u0 implements uv80, wwn0 {
    public static final Set c;
    public static final Set d;
    public final c2u0 a;
    public volatile String b;

    static {
        new m4c((byte) 19);
        c = Collections.singleton("resume");
        d = dm61.z0("play", "shuffle_play", "skip_to_next", "skip_to_previous");
    }

    public g2u0(c2u0 c2u0Var) {
        this.a = c2u0Var;
    }

    @Override // p.wwn0
    public final void a(rj41 rj41Var, hwn0 hwn0Var, hwn0 hwn0Var2, nsn0 nsn0Var, List list, List list2, Long l, Set set, String str) {
        this.b = hwn0Var.b.b;
    }

    @Override // p.uv80
    public final void b(rj41 rj41Var, w7h1 w7h1Var, tv80 tv80Var) {
        String str;
        String strB = w7h1Var.d.a().b();
        if (c.contains(strB)) {
            e2u0 e2u0Var = (e2u0) this.a;
            if (e2u0Var.c) {
                if (!e2u0Var.b.d()) {
                    e2u0Var.b();
                    return;
                }
                synchronized (e2u0Var.d) {
                    d2u0 d2u0Var = e2u0Var.e;
                    if (d2u0Var == null) {
                        return;
                    }
                    long jA = e2u0Var.a.a();
                    d2u0Var.c().setAttribute("outcome", "superseded");
                    d2u0Var.c().setAttribute("superseded_by", strB);
                    d2u0Var.a().a(Long.valueOf(jA));
                    d2u0Var.b().a(Long.valueOf(jA));
                    d2u0Var.d().a(jA);
                    d2u0Var.c().a(jA);
                    e2u0Var.e = null;
                    return;
                }
            }
            return;
        }
        boolean zContains = d.contains(strB);
        boolean z = u890.j(strB, "ui_navigate") && (str = (String) w7h1Var.d.a().c().get("destination")) != null && ihc1.h0(str, "watch-feed", false);
        if (zContains || z) {
            String str2 = tv80Var.a.a;
            a7h1 a7h1Var = (a7h1) o7h.s0(w7h1Var.c.b().b());
            String str3 = a7h1Var != null ? a7h1Var.a : null;
            String strG = m4c.g(w7h1Var);
            c2u0 c2u0Var = this.a;
            mwt0 mwt0Var = new mwt0((String) null, str2, (String) null, (String) null, w7h1Var.c.b().h.b, this.b, z ? (String) w7h1Var.d.a().c().get("destination") : null, strB, w7h1Var.d.c().b(), str3, strG, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 260109);
            e2u0 e2u0Var2 = (e2u0) c2u0Var;
            if (e2u0Var2.c) {
                if (!e2u0Var2.b.d()) {
                    e2u0Var2.b();
                    return;
                }
                long jA2 = e2u0Var2.a.a();
                synchronized (e2u0Var2.d) {
                    try {
                        d2u0 d2u0Var2 = e2u0Var2.e;
                        if (d2u0Var2 != null) {
                            d2u0Var2.c().setAttribute("outcome", "superseded");
                            d2u0Var2.a().a(Long.valueOf(jA2));
                            d2u0Var2.b().a(Long.valueOf(jA2));
                            d2u0Var2.d().a(jA2);
                            d2u0Var2.c().a(jA2);
                        }
                        hhp0 hhp0Var = hhp0.a;
                        kj41 kj41VarU = hhp0Var.u("playback.start");
                        kj41VarU.d(jA2);
                        kj41VarU.setAttribute("trigger", k4s0.a(1));
                        kj41VarU.setAttribute("capture.coverage", "full");
                        kj41VarU.setAttribute("capture.callsite", "PlaybackOopsInteractionObserver.onInteractionEvent");
                        Set set = e2u0.f;
                        q3c.q(kj41VarU, mwt0Var);
                        nif1 nif1VarL = ihp0.l(hhp0Var, "playback.start", null, 6);
                        e2u0Var2.e = new d2u0(kj41VarU, nif1VarL, nif1VarL.c(Long.valueOf(jA2), "playback.start"), nif1VarL.c(Long.valueOf(jA2), "PlaybackOopsInteractionObserver.onInteractionEvent"));
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }
}
