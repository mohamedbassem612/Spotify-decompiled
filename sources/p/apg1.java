package p;

import android.os.Bundle;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class apg1 implements vih0 {
    public final nba a;
    public final oih0 b;
    public final q881 c;
    public xab1 d;
    public final llm e;

    public apg1(ruk rukVar, x610 x610Var, lxh0 lxh0Var, kjq kjqVar, oih0 oih0Var, q881 q881Var, q8n q8nVar) {
        this.a = kjqVar.b(rukVar, x610Var, lxh0Var);
        this.b = oih0Var;
        this.c = q881Var;
        this.e = smo1.e(q8nVar);
    }

    public final Set a() {
        return this.a.a();
    }

    public final void b(vsr0 vsr0Var) {
        this.a.b(vsr0Var);
    }

    public final void c(vsr0 vsr0Var, Bundle bundle, iu30 iu30Var) {
        this.a.c(vsr0Var, bundle, iu30Var);
    }

    public final void d(String str, Bundle bundle, String str2, q1m q1mVar, iu30 iu30Var, vu30 vu30Var, Function0 function0) {
        xab1 xab1Var = this.d;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        this.d = fn31.T(this.e, (o8n) null, 0, new zn0(this, str2, str, q1mVar, iu30Var, function0, vu30Var, (lnm) null, (byte) 19), 3);
    }

    public final void destroy() {
        this.a.destroy();
        smo1.p(this.e, (CancellationException) null);
    }

    public final vsr0 e() {
        return this.a.a.c();
    }

    public final lxh0 f() {
        return this.a.c;
    }

    public final long g() {
        return this.a.n;
    }

    public final boolean h() {
        return this.a.h();
    }

    public final void i(vsr0 vsr0Var) {
        this.a.i(vsr0Var);
    }

    public final void j(vsr0 vsr0Var) {
        this.a.j(vsr0Var);
    }

    public final boolean k() {
        return true;
    }

    public final String l() {
        return this.a.a.b();
    }
}
