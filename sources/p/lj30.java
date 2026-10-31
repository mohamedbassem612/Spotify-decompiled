package p;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class lj30 implements ot50, qe41, sck1 {
    public final zf30 a;
    public final rck1 b;
    public final n6 c;
    public eck1 d;
    public tac0 e = null;
    public nt21 f = null;

    public lj30(zf30 zf30Var, rck1 rck1Var, n6 n6Var) {
        this.a = zf30Var;
        this.b = rck1Var;
        this.c = n6Var;
    }

    @Override // p.ot50
    public final eck1 N() {
        Application application;
        zf30 zf30Var = this.a;
        eck1 eck1VarN = zf30Var.N();
        if (eck1VarN != zf30Var.w1) {
            this.d = eck1VarN;
            return eck1VarN;
        }
        eck1 eck1Var = this.d;
        if (eck1Var != null) {
            return eck1Var;
        }
        for (Context applicationContext = zf30Var.P0().getApplicationContext(); applicationContext instanceof ContextWrapper; applicationContext = ((ContextWrapper) applicationContext).getBaseContext()) {
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                we41 we41Var = new we41(application, zf30Var, zf30Var.f);
                this.d = we41Var;
                return we41Var;
            }
        }
        application = null;
        we41 we41Var2 = new we41(application, zf30Var, zf30Var.f);
        this.d = we41Var2;
        return we41Var2;
    }

    @Override // p.ot50
    public final wcn0 O() {
        Application application;
        zf30 zf30Var = this.a;
        Context applicationContext = zf30Var.P0().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        wcn0 wcn0Var = new wcn0(0);
        if (application != null) {
            wcn0Var.a(dck1.d, application);
        }
        wcn0Var.a(a6o1.a, zf30Var);
        wcn0Var.a(a6o1.b, this);
        Bundle bundle = zf30Var.f;
        if (bundle != null) {
            wcn0Var.a(a6o1.c, bundle);
        }
        return wcn0Var;
    }

    public final void a(k8c0 k8c0Var) {
        this.e.g(k8c0Var);
    }

    public final void b() {
        if (this.e == null) {
            this.e = new tac0(this, true);
            nt21 nt21VarH = nt21.h(this);
            this.f = nt21VarH;
            nt21VarH.m();
            this.c.run();
        }
    }

    @Override // p.iac0
    public final x8c0 getLifecycle() {
        b();
        return this.e;
    }

    @Override // p.sck1
    public final rck1 o() {
        b();
        return this.b;
    }

    @Override // p.qe41
    public final oe41 p() {
        b();
        return this.f.j();
    }
}
