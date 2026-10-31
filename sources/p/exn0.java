package p;

import android.content.Intent;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class exn0 implements fyf0, d8q0 {
    public final jeh a;
    public th61 b;

    public exn0(jeh jehVar) {
        this.a = jehVar;
    }

    @Override // p.d8q0
    public final void a(th61 th61Var) {
        this.b = th61Var;
    }

    @Override // p.fyf0
    public final boolean b(Intent intent) {
        th61 th61Var = this.b;
        if (th61Var != null) {
            return this.a.a(new qs31(intent, th61Var));
        }
        hhg1.o(th61Var, "Unable to route intent because session state is missing: sessionState=");
        return false;
    }
}
