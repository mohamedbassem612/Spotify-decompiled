package p;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class jya1 extends fba {
    public final PointF i;
    public final PointF j;
    public final cr20 k;
    public final cr20 l;
    public j2e0 m;
    public j2e0 n;

    public jya1(cr20 cr20Var, cr20 cr20Var2) {
        super(Collections.EMPTY_LIST);
        this.i = new PointF();
        this.j = new PointF();
        this.k = cr20Var;
        this.l = cr20Var2;
        i(((fba) this).d);
    }

    public final Object e() {
        return k(0.0f);
    }

    public final /* bridge */ /* synthetic */ Object f(sua0 sua0Var, float f) {
        return k(f);
    }

    public final void i(float f) {
        cr20 cr20Var = this.k;
        cr20Var.i(f);
        cr20 cr20Var2 = this.l;
        cr20Var2.i(f);
        this.i.set(((Float) cr20Var.e()).floatValue(), ((Float) cr20Var2.e()).floatValue());
        int i = 0;
        while (true) {
            ArrayList arrayList = ((fba) this).a;
            if (i >= arrayList.size()) {
                return;
            }
            ((cba) arrayList.get(i)).a();
            i++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0036  */
    public final PointF k(float f) {
        float f2;
        Float f3;
        Float f4 = null;
        if (this.m != null) {
            cr20 cr20Var = this.k;
            sua0 sua0VarC = ((fba) cr20Var).c.c();
            if (sua0VarC != null) {
                float fC = cr20Var.c();
                Float f5 = sua0VarC.h;
                j2e0 j2e0Var = this.m;
                float f6 = sua0VarC.g;
                f2 = f;
                f3 = (Float) j2e0Var.j(f6, f5 == null ? f6 : f5.floatValue(), (Float) sua0VarC.b, (Float) sua0VarC.c, f, f, fC);
            } else {
                f2 = f;
                f3 = null;
            }
        } else {
            f2 = f;
            f3 = null;
        }
        if (this.n != null) {
            cr20 cr20Var2 = this.l;
            sua0 sua0VarC2 = ((fba) cr20Var2).c.c();
            if (sua0VarC2 != null) {
                float fC2 = cr20Var2.c();
                Float f7 = sua0VarC2.h;
                j2e0 j2e0Var2 = this.n;
                float f8 = sua0VarC2.g;
                f4 = (Float) j2e0Var2.j(f8, f7 == null ? f8 : f7.floatValue(), (Float) sua0VarC2.b, (Float) sua0VarC2.c, f2, f2, fC2);
            }
        }
        PointF pointF = this.i;
        PointF pointF2 = this.j;
        if (f3 == null) {
            pointF2.set(pointF.x, 0.0f);
        } else {
            pointF2.set(f3.floatValue(), 0.0f);
        }
        if (f4 == null) {
            pointF2.set(pointF2.x, pointF.y);
            return pointF2;
        }
        pointF2.set(pointF2.x, f4.floatValue());
        return pointF2;
    }

    public final void l(j2e0 j2e0Var) {
        j2e0 j2e0Var2 = this.m;
        if (j2e0Var2 != null) {
            j2e0Var2.getClass();
        }
        this.m = j2e0Var;
    }

    public final void m(j2e0 j2e0Var) {
        j2e0 j2e0Var2 = this.n;
        if (j2e0Var2 != null) {
            j2e0Var2.getClass();
        }
        this.n = j2e0Var;
    }
}
