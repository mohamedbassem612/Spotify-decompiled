package p;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class fba {
    public final dba c;
    public j2e0 e;
    public final ArrayList a = new ArrayList(1);
    public boolean b = false;
    public float d = 0.0f;
    public Object f = null;
    public float g = -1.0f;
    public float h = -1.0f;

    public fba(List list) {
        djx0 hk0Var;
        if (list.isEmpty()) {
            hk0Var = new djx0((byte) 29);
        } else {
            hk0Var = list.size() == 1 ? new hk0(list) : new eba(list);
        }
        this.c = hk0Var;
    }

    public final void a(cba cbaVar) {
        this.a.add(cbaVar);
    }

    public float b() {
        float f = this.h;
        if (f != -1.0f) {
            return f;
        }
        float f2 = this.c.f();
        this.h = f2;
        return f2;
    }

    public final float c() {
        Interpolator interpolator;
        sua0 sua0VarC = this.c.c();
        if (sua0VarC == null || sua0VarC.c() || (interpolator = sua0VarC.d) == null) {
            return 0.0f;
        }
        return interpolator.getInterpolation(d());
    }

    public final float d() {
        if (this.b) {
            return 0.0f;
        }
        sua0 sua0VarC = this.c.c();
        if (sua0VarC.c()) {
            return 0.0f;
        }
        return (this.d - sua0VarC.b()) / (sua0VarC.a() - sua0VarC.b());
    }

    public Object e() {
        float fD = d();
        j2e0 j2e0Var = this.e;
        dba dbaVar = this.c;
        if (j2e0Var == null && dbaVar.b(fD)) {
            return this.f;
        }
        sua0 sua0VarC = dbaVar.c();
        Interpolator interpolator = sua0VarC.e;
        Interpolator interpolator2 = sua0VarC.f;
        Object objF = (interpolator == null || interpolator2 == null) ? f(sua0VarC, c()) : g(sua0VarC, fD, interpolator.getInterpolation(fD), interpolator2.getInterpolation(fD));
        this.f = objF;
        return objF;
    }

    public Object f(sua0 sua0Var, float f) {
        Object obj;
        Object obj2 = sua0Var.b;
        j2e0 j2e0Var = this.e;
        if (j2e0Var == null) {
            return (f != 1.0f || (obj = sua0Var.c) == null) ? (zpu) obj2 : (zpu) obj;
        }
        float f2 = sua0Var.g;
        Float f3 = sua0Var.h;
        float fFloatValue = f3 == null ? Float.MAX_VALUE : f3.floatValue();
        zpu zpuVar = (zpu) obj2;
        Object obj3 = sua0Var.c;
        return (zpu) j2e0Var.j(f2, fFloatValue, zpuVar, obj3 == null ? zpuVar : (zpu) obj3, f, c(), this.d);
    }

    public Object g(sua0 sua0Var, float f, float f2, float f3) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    public void h() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i >= arrayList.size()) {
                return;
            }
            ((cba) arrayList.get(i)).a();
            i++;
        }
    }

    public void i(float f) {
        dba dbaVar = this.c;
        if (dbaVar.isEmpty()) {
            return;
        }
        float fE = this.g;
        if (fE == -1.0f) {
            fE = dbaVar.e();
            this.g = fE;
        }
        float f2 = fE;
        if (f < fE) {
            if (f2 == -1.0f) {
                f = dbaVar.e();
                this.g = f;
            } else {
                f = f2;
            }
        } else if (f > b()) {
            f = b();
        }
        if (f == this.d) {
            return;
        }
        this.d = f;
        if (dbaVar.d(f)) {
            h();
        }
    }

    public final void j(j2e0 j2e0Var) {
        j2e0 j2e0Var2 = this.e;
        if (j2e0Var2 != null) {
            j2e0Var2.getClass();
        }
        this.e = j2e0Var;
    }
}
