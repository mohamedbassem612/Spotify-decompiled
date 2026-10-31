package p;

import com.spotify.base.java.logging.Logger;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class c8o0 {
    public static final List n = p7h.M(new String[]{"spotify.com", "scdn.co", "spotifycdn.com", "megaphone.fm"});
    public final yqg a;
    public final nbc b;
    public final ihp0 c;
    public final boolean d;
    public final ConcurrentHashMap e;
    public final idd1 f;
    public final idd1 g;
    public final idd1 h;
    public final idd1 i;
    public final idd1 j;
    public final idd1 k;
    public final llm l;
    public final xab1 m;

    public c8o0(q8n q8nVar, v4g1 v4g1Var, yqg yqgVar, boolean z) {
        nbc nbcVar = new nbc((byte) 16);
        hhp0 hhp0Var = hhp0.a;
        this.a = yqgVar;
        this.b = nbcVar;
        this.c = hhp0Var;
        this.d = z;
        this.e = new ConcurrentHashMap();
        this.f = new idd1(new b8o0(this, (byte) 1));
        this.g = new idd1(new b8o0(this, (byte) 3));
        this.h = new idd1(new b8o0(this, (byte) 0));
        this.i = new idd1(new b8o0(this, (byte) 2));
        this.j = new idd1(new b8o0(this, (byte) 5));
        this.k = new idd1(new b8o0(this, (byte) 4));
        llm llmVarE = smo1.e(flo1.l(q8nVar, new z8n("NetworkReporterDaemon")));
        this.l = llmVarE;
        this.m = l4p1.u(llmVarE, new fu20(d5p1.g(v4g1Var.f), new u98(2, this, c8o0.class, "handleTrafficEvent", "handleTrafficEvent(Lcom/spotify/connectivity/traffic/TrafficEvent;)V", 4, (byte) 11), (byte) 1));
    }

    public final long a(r4g1 r4g1Var) {
        this.b.getClass();
        return Math.max(jfv.u(nbc.e(), ngv.c) - (Math.max(this.a.b() - r4g1Var.getTimestamp(), 0L) * 1000), 0L);
    }

    public final void b(r4g1 r4g1Var) {
        xma1 xma1Var = (wma1) this.e.remove(r4g1Var.getId());
        if (xma1Var == null) {
            Logger.d("[NetworkReporterDaemon] Received end traffic event for unknown ID", new Object[0]);
            return;
        }
        long jA = a(r4g1Var);
        xma1 xma1Var2 = xma1Var instanceof xma1 ? xma1Var : null;
        xma1Var.a(Long.valueOf(Math.max(xma1Var2 != null ? xma1Var2.c : 0L, jA)));
    }
}
