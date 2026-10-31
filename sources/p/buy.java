package p;

import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class buy extends x7e0 {
    public final String d;
    public final Function0 e;
    public final llm f;
    public xab1 h;
    public final bpb1 g = gio1.b(new gwq(null, z6x.a, false));
    public final o3r i = w3p1.n(new l4r(hvm.c, 1, auy.b, new j4r(rqy.d1), auy.c), new l4r(pwc0.b, 1, auy.d, new j4r(rqy.e1), auy.e), yty.b);

    public buy(String str, Function0 function0, q8n q8nVar) {
        this.d = str;
        this.e = function0;
        this.f = smo1.e(q8nVar);
    }

    public final void e() {
        j();
        this.h = fn31.T(this.f, (o8n) null, 0, new ett((Object) this, (lnm) null, (byte) 20), 3);
    }

    public final void f() {
        xab1 xab1Var = this.h;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        this.h = null;
    }
}
