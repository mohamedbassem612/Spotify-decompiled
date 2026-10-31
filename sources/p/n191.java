package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class n191 extends k9 {
    public Object c;
    public Object d;
    public oen0 e;
    public oen0 f;
    public r261 g;
    public final waq0 h;
    public final iv91 i;

    public n191() {
        super((byte) 16);
        this.h = new waq0(this, (byte) 21);
        this.i = ekb.A(new w9(this, (byte) 23));
    }

    public final void J0() {
        this.i.a();
        this.d = null;
        this.f = null;
        synchronized (R0()) {
            this.g = null;
            this.c = null;
            this.e = null;
        }
    }

    public final iu30 l1(r261 r261Var) {
        r261 r261Var2 = this.g;
        if (r261Var2 != null && !r261Var2.equals(r261Var)) {
            bmv0.b("Requested a SingleSubscriptionSnapshotFlowManager to manage multiple subscriptions");
        }
        this.g = r261Var;
        return this.h;
    }

    public final void m1(jfe jfeVar) {
        this.g = null;
        this.d = null;
        this.f = null;
        z0();
    }

    public final void y0(r261 r261Var) {
        this.d = null;
        this.f = null;
    }

    public final void z0() {
        synchronized (R0()) {
            try {
                this.c = this.d;
                if (this.f == null) {
                    this.e = null;
                } else {
                    oen0 oen0Var = this.e;
                    if (oen0Var == null) {
                        oen0 oen0Var2 = ij41.a;
                        oen0Var = new oen0();
                        this.e = oen0Var;
                    }
                    this.e = this.f;
                    this.f = oen0Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
