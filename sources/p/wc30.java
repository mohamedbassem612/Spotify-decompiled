package p;

import android.app.Activity;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class wc30 implements bbr0 {
    public final bbr0 a;
    public final arq0 b;
    public final Activity c;
    public final llm d;
    public Integer e;

    public wc30(bbr0 bbr0Var, arq0 arq0Var, Activity activity, q8n q8nVar) {
        this.a = bbr0Var;
        this.b = arq0Var;
        this.c = activity;
        this.d = smo1.e(flo1.l(q8nVar, op71.f()));
    }

    public final void a() {
        fn31.T(this.d, (o8n) null, 0, new j020(this, (lnm) null, (byte) 10), 3);
    }

    public final void b() {
        smo1.p(this.d, (CancellationException) null);
    }

    public final war0 b0(Class cls) {
        return this.a.b0(cls);
    }
}
