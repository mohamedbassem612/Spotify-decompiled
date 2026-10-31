package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class o24 {
    public Object a;
    public Object b;
    public float c = Float.NaN;
    public final /* synthetic */ t24 d;

    public o24(t24 t24Var) {
        this.d = t24Var;
    }

    public final void a(float f, float f2) {
        t24 t24Var = this.d;
        hrr0 hrr0Var = t24Var.g;
        drr0 drr0Var = t24Var.j;
        float fS = drr0Var.s();
        drr0Var.t(f);
        t24Var.k.t(f2);
        if (Float.isNaN(fS)) {
            return;
        }
        boolean z = f >= fS;
        if (drr0Var.s() == t24Var.c().f(hrr0Var.getValue())) {
            Object objB = t24Var.c().b(drr0Var.s() + (z ? 1.0f : -1.0f), z);
            if (objB == null) {
                objB = hrr0Var.getValue();
            }
            if (z) {
                this.a = hrr0Var.getValue();
                this.b = objB;
            } else {
                this.a = objB;
                this.b = hrr0Var.getValue();
            }
        } else {
            Object objB2 = t24Var.c().b(drr0Var.s(), false);
            if (objB2 == null) {
                objB2 = hrr0Var.getValue();
            }
            Object objB3 = t24Var.c().b(drr0Var.s(), true);
            if (objB3 == null) {
                objB3 = hrr0Var.getValue();
            }
            this.a = objB2;
            this.b = objB3;
        }
        wvr wvrVarC = t24Var.c();
        Object obj = this.a;
        obj.getClass();
        float f3 = wvrVarC.f(obj);
        wvr wvrVarC2 = t24Var.c();
        Object obj2 = this.b;
        obj2.getClass();
        this.c = Math.abs(f3 - wvrVarC2.f(obj2));
        if (Math.abs(drr0Var.s() - t24Var.c().f(hrr0Var.getValue())) >= this.c / 2.0f) {
            Object value = z ? this.b : this.a;
            if (value == null) {
                value = hrr0Var.getValue();
            }
            if (((Boolean) t24Var.a.invoke(value)).booleanValue()) {
                hrr0Var.setValue(value);
            }
        }
    }
}
