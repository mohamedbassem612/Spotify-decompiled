package p;

import com.spotify.base.java.logging.Logger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class v480 implements rs31, xwh0 {
    public final p7s a;
    public final ewh0 b;
    public final yqg c;
    public final jo20 d;
    public final q8n e;
    public c9n f;
    public w2z g;
    public faa0 i;
    public boolean j;
    public int h = 1;
    public final dt71 k = mgo1.e(0, 64, 0, 5);

    public v480(p7s p7sVar, ewh0 ewh0Var, yqg yqgVar, jo20 jo20Var, q8n q8nVar) {
        this.a = p7sVar;
        this.b = ewh0Var;
        this.c = yqgVar;
        this.d = jo20Var;
        this.e = q8nVar;
        this.f = cy30.t(q8nVar);
    }

    @Override // p.xwh0
    public final void a() {
        if (this.d.isEnabled()) {
            this.j = false;
            i();
            smo1.r(this.f, "ImprovedRoutesDiscoverer stopped");
        }
    }

    @Override // p.xwh0
    public final void b() {
        if (this.d.isEnabled()) {
            c9n c9nVarC = foo1.C(this.f, new cc00(this, (byte) 17));
            this.f = c9nVarC;
            c921.y(c9nVarC, (o8n) null, 0, new mx(this, (lnm) null, (byte) 25), 3);
        }
    }

    @Override // p.rs31
    public final void c() {
        if (this.d.isEnabled()) {
            this.j = false;
            i();
            if (h()) {
                k(3);
            }
        }
    }

    @Override // p.rs31
    public final void d() {
        if (this.d.isEnabled()) {
            int i = this.h;
            if (i == 2) {
                w2z w2zVar = this.g;
                if (w2zVar != null) {
                    this.a.a(this.b, w2zVar, 1);
                } else {
                    Logger.k("MediaRouterX->%s", new Object[]{"MediaRouter.Callback is null, cannot refresh active scan"});
                }
                j();
                return;
            }
            if (i == 1) {
                this.j = true;
            } else {
                k(2);
                j();
            }
        }
    }

    @Override // p.rs31
    public final dt71 e() {
        return this.k;
    }

    @Override // p.rs31
    public final void f() {
        if (this.d.isEnabled()) {
            this.j = false;
            i();
            if (h()) {
                k(3);
            }
        }
    }

    @Override // p.rs31
    public final void g() {
        if (this.d.isEnabled()) {
            i();
            if (this.h != 3) {
                return;
            }
            smo1.r(this.f, "Stopping passive discovery");
        }
    }

    public final boolean h() {
        int i = this.h;
        if (u480.a[l1d.C(i)] != 1) {
            return i != 3;
        }
        Logger.k("MediaRouterX->%s", new Object[]{"Discovery not started"});
        return false;
    }

    public final void i() {
        faa0 faa0Var = this.i;
        if (faa0Var != null) {
            faa0Var.d(null);
        }
        this.i = null;
    }

    public final void j() {
        i();
        this.i = c921.y(this.f, (o8n) null, 0, new no70(this, (lnm) null, (byte) 2), 3);
    }

    public final void k(int i) {
        int iC = l1d.C(i);
        if (iC != 0) {
            int i2 = 1;
            if (iC != 1) {
                if (iC != 2) {
                    eg.o();
                    return;
                }
                i2 = 4;
            }
            w2z w2zVar = this.g;
            if (w2zVar == null) {
                Logger.k("MediaRouterX->%s", new Object[]{"MediaRouter.Callback is null, cannot switch discovery"});
                return;
            }
            ewh0 ewh0Var = this.b;
            p7s p7sVar = this.a;
            p7sVar.a(ewh0Var, w2zVar, i2);
            this.h = i;
            this.k.a(new xyc(this.c.b(), p7sVar.d()));
        }
    }
}
