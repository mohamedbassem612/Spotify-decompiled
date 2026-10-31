package p;

import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class h141 implements ipb1 {
    public final Object a;
    public final ipb1 b;
    public final v7v c;
    public Bundle d;

    public h141(Object obj, ipb1 ipb1Var, v7v v7vVar) {
        this.a = obj;
        this.b = ipb1Var;
        this.c = v7vVar;
    }

    @Override // p.ipb1
    public final void a(jpb1 jpb1Var) {
        ipb1 ipb1Var = this.b;
        ipb1Var.a(jpb1Var);
        boolean zB = ipb1Var.b();
        Object obj = this.a;
        if (!zB) {
            jpb1Var.onStateUpdate(obj);
            return;
        }
        try {
            ipb1Var.getState();
        } catch (Exception unused) {
            jpb1Var.onStateUpdate(obj);
        }
    }

    @Override // p.ipb1
    public final Bundle c() {
        return this.d;
    }

    @Override // p.ipb1
    public final void d(jpb1 jpb1Var) {
        this.b.d(jpb1Var);
    }

    @Override // p.ipb1
    public final void e(Object obj) {
        if (((Boolean) this.c.invoke()).booleanValue()) {
            return;
        }
        this.b.e(obj);
    }

    @Override // p.ipb1
    public final Object getState() {
        ipb1 ipb1Var = this.b;
        boolean zB = ipb1Var.b();
        Object obj = this.a;
        if (!zB) {
            return obj;
        }
        try {
            return ipb1Var.getState();
        } catch (Exception unused) {
            return obj;
        }
    }

    @Override // p.ipb1
    public final void j(Bundle bundle) {
        this.d = bundle;
    }
}
