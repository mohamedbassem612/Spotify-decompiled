package p;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class gf21 implements p8v, x8s0, oe50, cba, mpa0 {
    public final Matrix a = new Matrix();
    public final Path b = new Path();
    public final cdf0 c;
    public final hba d;
    public final String e;
    public final boolean f;
    public final cr20 g;
    public final cr20 h;
    public final nfg1 i;
    public stl j;

    public gf21(cdf0 cdf0Var, hba hbaVar, u511 u511Var) {
        this.c = cdf0Var;
        this.d = hbaVar;
        this.e = u511Var.b;
        this.f = u511Var.d;
        cr20 cr20VarC0 = u511Var.c.c0();
        this.g = cr20VarC0;
        hbaVar.d(cr20VarC0);
        cr20VarC0.a(this);
        cr20 cr20VarC1 = u511Var.e.c0();
        this.h = cr20VarC1;
        hbaVar.d(cr20VarC1);
        cr20VarC1.a(this);
        w95 w95Var = (w95) u511Var.f;
        w95Var.getClass();
        nfg1 nfg1Var = new nfg1(w95Var);
        this.i = nfg1Var;
        nfg1Var.a(hbaVar);
        nfg1Var.b(this);
    }

    public final void a() {
        this.c.invalidateSelf();
    }

    public final void b(List list, List list2) {
        this.j.b(list, list2);
    }

    public final void c(RectF rectF, Matrix matrix, boolean z) {
        this.j.c(rectF, matrix, z);
    }

    public final void d(ListIterator listIterator) {
        if (this.j != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add((wpl) listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(arrayList);
        this.j = new stl(this.c, this.d, "Repeater", this.f, arrayList, (w95) null);
    }

    public final void e(kpa0 kpa0Var, int i, ArrayList arrayList, kpa0 kpa0Var2) {
        itj0.f(kpa0Var, i, arrayList, kpa0Var2, this);
        for (int i2 = 0; i2 < this.j.h.size(); i2++) {
            mpa0 mpa0Var = (wpl) this.j.h.get(i2);
            if (mpa0Var instanceof mpa0) {
                itj0.f(kpa0Var, i, arrayList, kpa0Var2, mpa0Var);
            }
        }
    }

    public final void f(Canvas canvas, Matrix matrix, int i) {
        float fFloatValue = ((Float) this.g.e()).floatValue();
        float fFloatValue2 = ((Float) this.h.e()).floatValue();
        nfg1 nfg1Var = this.i;
        float fFloatValue3 = ((Float) nfg1Var.m.e()).floatValue() / 100.0f;
        float fFloatValue4 = ((Float) nfg1Var.n.e()).floatValue() / 100.0f;
        for (int i2 = ((int) fFloatValue) - 1; i2 >= 0; i2--) {
            Matrix matrix2 = this.a;
            matrix2.set(matrix);
            float f = i2;
            matrix2.preConcat(nfg1Var.f(f + fFloatValue2));
            this.j.f(canvas, matrix2, (int) (itj0.e(fFloatValue3, fFloatValue4, f / fFloatValue) * i));
        }
    }

    public final void g(Object obj, j2e0 j2e0Var) {
        if (this.i.c(obj, j2e0Var)) {
            return;
        }
        if (obj == ndf0.f102p) {
            this.g.j(j2e0Var);
        } else if (obj == ndf0.q) {
            this.h.j(j2e0Var);
        }
    }

    public final String getName() {
        return this.e;
    }

    public final Path getPath() {
        Path path = this.j.getPath();
        Path path2 = this.b;
        path2.reset();
        float fFloatValue = ((Float) this.g.e()).floatValue();
        float fFloatValue2 = ((Float) this.h.e()).floatValue();
        for (int i = ((int) fFloatValue) - 1; i >= 0; i--) {
            Matrix matrixF = this.i.f(i + fFloatValue2);
            Matrix matrix = this.a;
            matrix.set(matrixF);
            path2.addPath(path, matrix);
        }
        return path2;
    }
}
