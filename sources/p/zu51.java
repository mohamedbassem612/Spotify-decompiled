package p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class zu51 implements awh0 {
    public final p7s a;
    public final g0l b;
    public final jks c;
    public final q8n d;
    public c9n e;

    public zu51(p7s p7sVar, g0l g0lVar, jks jksVar, q8n q8nVar) {
        this.a = p7sVar;
        this.b = g0lVar;
        this.c = jksVar;
        this.d = q8nVar;
        this.e = i3a.k(q8nVar);
    }

    public final void a() {
        smo1.p(this.e, (CancellationException) null);
    }

    public final void b() {
        c9n c9nVarV = qmo1.v(this.e, new l451(this, (byte) 9));
        this.e = c9nVarV;
        fn31.T(c9nVarV, (o8n) null, 0, new yu51(this, null, (byte) 0), 3);
    }
}
