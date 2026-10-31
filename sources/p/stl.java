package p;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class stl implements p8v, x8s0, cba, lpa0 {
    public final p9b0 a;
    public final RectF b;
    public final Matrix c;
    public final Path d;
    public final RectF e;
    public final String f;
    public final boolean g;
    public final ArrayList h;
    public final cdf0 i;
    public ArrayList j;
    public final nfg1 k;

    public stl(cdf0 cdf0Var, hba hbaVar, String str, boolean z, ArrayList arrayList, w95 w95Var) {
        this.a = new p9b0();
        this.b = new RectF();
        this.c = new Matrix();
        this.d = new Path();
        this.e = new RectF();
        this.f = str;
        this.i = cdf0Var;
        this.g = z;
        this.h = arrayList;
        if (w95Var != null) {
            nfg1 nfg1Var = new nfg1(w95Var);
            this.k = nfg1Var;
            nfg1Var.a(hbaVar);
            nfg1Var.b(this);
        }
        ArrayList arrayList2 = new ArrayList();
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            wpl wplVar = (wpl) arrayList.get(size);
            if (wplVar instanceof oe50) {
                arrayList2.add((oe50) wplVar);
            }
        }
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ((oe50) arrayList2.get(size2)).d(arrayList.listIterator(arrayList.size()));
        }
    }

    @Override // p.cba
    public final void a() {
        this.i.invalidateSelf();
    }

    @Override // p.wpl
    public final void b(List list, List list2) {
        int size = list.size();
        ArrayList arrayList = this.h;
        ArrayList arrayList2 = new ArrayList(arrayList.size() + size);
        arrayList2.addAll(list);
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            wpl wplVar = (wpl) arrayList.get(size2);
            wplVar.b(arrayList2, arrayList.subList(0, size2));
            arrayList2.add(wplVar);
        }
    }

    @Override // p.p8v
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        Matrix matrix2 = this.c;
        matrix2.set(matrix);
        nfg1 nfg1Var = this.k;
        if (nfg1Var != null) {
            matrix2.preConcat(nfg1Var.e());
        }
        RectF rectF2 = this.e;
        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
        ArrayList arrayList = this.h;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            wpl wplVar = (wpl) arrayList.get(size);
            if (wplVar instanceof p8v) {
                ((p8v) wplVar).c(rectF2, matrix2, z);
                rectF.union(rectF2);
            }
        }
    }

    public final List d() {
        if (this.j == null) {
            this.j = new ArrayList();
            int i = 0;
            while (true) {
                ArrayList arrayList = this.h;
                if (i >= arrayList.size()) {
                    break;
                }
                wpl wplVar = (wpl) arrayList.get(i);
                if (wplVar instanceof x8s0) {
                    this.j.add((x8s0) wplVar);
                }
                i++;
            }
        }
        return this.j;
    }

    @Override // p.lpa0
    public final void e(kpa0 kpa0Var, int i, ArrayList arrayList, kpa0 kpa0Var2) {
        String str = this.f;
        if (!kpa0Var.e(i, str) && !"__container".equals(str)) {
            return;
        }
        if (!"__container".equals(str)) {
            kpa0Var2 = kpa0Var2.a(str);
            if (kpa0Var.b(i, str)) {
                arrayList.add(kpa0Var2.g(this));
            }
        }
        if (!kpa0Var.f(i, str)) {
            return;
        }
        int iD = kpa0Var.d(i, str) + i;
        int i2 = 0;
        while (true) {
            ArrayList arrayList2 = this.h;
            if (i2 >= arrayList2.size()) {
                return;
            }
            wpl wplVar = (wpl) arrayList2.get(i2);
            if (wplVar instanceof lpa0) {
                ((lpa0) wplVar).e(kpa0Var, iD, arrayList, kpa0Var2);
            }
            i2++;
        }
    }

    @Override // p.p8v
    public final void f(Canvas canvas, Matrix matrix, int i) {
        if (this.g) {
            return;
        }
        Matrix matrix2 = this.c;
        matrix2.set(matrix);
        nfg1 nfg1Var = this.k;
        if (nfg1Var != null) {
            matrix2.preConcat(nfg1Var.e());
            fba fbaVar = nfg1Var.j;
            i = (int) (((((fbaVar == null ? 100 : ((Integer) fbaVar.e()).intValue()) / 100.0f) * i) / 255.0f) * 255.0f);
        }
        boolean z = this.i.S0;
        boolean z2 = false;
        ArrayList arrayList = this.h;
        if (z) {
            int i2 = 0;
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                if ((arrayList.get(i3) instanceof p8v) && (i2 = i2 + 1) >= 2) {
                    if (i == 255) {
                        break;
                    }
                    z2 = true;
                    break;
                }
            }
        }
        if (z2) {
            RectF rectF = this.b;
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
            c(rectF, matrix2, true);
            p9b0 p9b0Var = this.a;
            p9b0Var.setAlpha(i);
            p5r p5rVar = qpi1.a;
            canvas.saveLayer(rectF, p9b0Var);
        }
        if (z2) {
            i = 255;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Object obj = arrayList.get(size);
            if (obj instanceof p8v) {
                ((p8v) obj).f(canvas, matrix2, i);
            }
        }
        if (z2) {
            canvas.restore();
        }
    }

    @Override // p.lpa0
    public final void g(Object obj, j2e0 j2e0Var) {
        nfg1 nfg1Var = this.k;
        if (nfg1Var != null) {
            nfg1Var.c(obj, j2e0Var);
        }
    }

    @Override // p.wpl
    public final String getName() {
        throw null;
    }

    @Override // p.x8s0
    public final Path getPath() {
        Matrix matrix = this.c;
        matrix.reset();
        nfg1 nfg1Var = this.k;
        if (nfg1Var != null) {
            matrix.set(nfg1Var.e());
        }
        Path path = this.d;
        path.reset();
        if (!this.g) {
            ArrayList arrayList = this.h;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                wpl wplVar = (wpl) arrayList.get(size);
                if (wplVar instanceof x8s0) {
                    path.addPath(((x8s0) wplVar).getPath(), matrix);
                }
            }
        }
        return path;
    }

    public stl(cdf0 cdf0Var, hba hbaVar, qw61 qw61Var, fcf0 fcf0Var) {
        w95 w95Var;
        String str = qw61Var.a;
        boolean z = qw61Var.c;
        List list = qw61Var.b;
        ArrayList arrayList = new ArrayList(list.size());
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            wpl wplVarA = ((myl) list.get(i2)).a(cdf0Var, fcf0Var, hbaVar);
            if (wplVarA != null) {
                arrayList.add(wplVarA);
            }
        }
        while (true) {
            if (i >= list.size()) {
                w95Var = null;
                break;
            }
            myl mylVar = (myl) list.get(i);
            if (mylVar instanceof w95) {
                w95Var = (w95) mylVar;
                break;
            }
            i++;
        }
        this(cdf0Var, hbaVar, str, z, arrayList, w95Var);
    }
}
