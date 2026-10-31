package p;

import com.spotify.connectivity.auth.NativeSession;
import com.spotify.esperanto.p000esperantoimpl.SchedulingTransport;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ph61 implements f961 {
    public final Map a;
    public final a8n b;
    public final obl c;
    public final ajg d;
    public final kmn0 e;
    public final tg8 f;
    public NativeSession g;
    public final nl51 h;

    public ph61(Map map, a8n a8nVar, c8n c8nVar, obl oblVar, ajg ajgVar, kmn0 kmn0Var, tg8 tg8Var) {
        this.a = map;
        this.b = a8nVar;
        this.c = oblVar;
        this.d = ajgVar;
        this.e = kmn0Var;
        this.f = tg8Var;
        ((d8n) a8nVar).c.runBlocking(new g54(this, (byte) 13));
        this.h = new nl51(l0o1.e(new SchedulingTransport(c8nVar.a, a().getInternalTransportToNative())), (byte) 4);
    }

    public final NativeSession a() {
        NativeSession nativeSession = this.g;
        if (nativeSession != null) {
            return nativeSession;
        }
        u890.C("nativeSession");
        throw null;
    }

    public final void shutdown() {
        a().blockingLogout();
        ((d8n) this.b).c.runBlocking(new xfz0(this, (byte) 12));
    }

    public final Object getApi() {
        return this;
    }
}
