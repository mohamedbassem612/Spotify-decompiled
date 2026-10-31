package p;

import io.reactivex.rxjava3.subjects.CompletableSubject;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class j6w implements odx0 {
    public final s6w a;
    public final m980 b;
    public final xrc0 c;
    public final u9c0 d;
    public final xu30 e;
    public final CompletableSubject f = new CompletableSubject();
    public final qy81 g = new qy81();
    public xab1 h;

    public j6w(s6w s6wVar, m980 m980Var, xrc0 xrc0Var, u9c0 u9c0Var, xu30 xu30Var) {
        this.a = s6wVar;
        this.b = m980Var;
        this.c = xrc0Var;
        this.d = u9c0Var;
        this.e = xu30Var;
    }

    public final String a() {
        return this.a.a();
    }

    public final z511 b() {
        return this.g;
    }

    public final boolean c(boolean z) {
        return z && this.b.b;
    }

    public final void d(udx0 udx0Var) {
        Set set = s4b1.f;
        String strS = uic.x(udx0Var.a).s();
        if (strS == null) {
            this.f.onComplete();
            return;
        }
        this.h = fn31.T(this.d, (o8n) null, 0, new hxn((Object) this, (Object) this.a.b(strS), (Object) udx0Var, (lnm) null, (byte) 23), 3);
    }

    public final CompletableSubject e() {
        return this.f;
    }

    public final void stop() {
        xab1 xab1Var = this.h;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        this.h = null;
    }
}
