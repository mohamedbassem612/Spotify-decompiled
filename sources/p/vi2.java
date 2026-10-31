package p;

import com.spotify.cosmos.rxrouter.RxRouter;
import io.reactivex.rxjava3.core.Flowable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class vi2 {
    public final kly0 a;
    public final kly0 b;
    public final kly0 c;
    public final kly0 d;
    public final kly0 e;
    public final kly0 f;
    public final kly0 g;

    public /* synthetic */ vi2(caq caqVar, caq caqVar2, jly0 jly0Var, jly0 jly0Var2, kly0 kly0Var, kly0 kly0Var2, kly0 kly0Var3) {
        this.a = jly0Var;
        this.b = caqVar;
        this.c = caqVar2;
        this.d = jly0Var2;
        this.e = kly0Var;
        this.f = kly0Var2;
        this.g = kly0Var3;
    }

    public lxg a() {
        return (lxg) this.f.get();
    }

    public q8n b() {
        return (q8n) this.g.get();
    }

    public RxRouter c() {
        return (RxRouter) this.b.get();
    }

    public Flowable d() {
        return (Flowable) this.a.get();
    }
}
