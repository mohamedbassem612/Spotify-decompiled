package p;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class a620 implements p8v, cba, mpa0 {
    public final Path a;
    public final p9b0 b;
    public final hba c;
    public final String d;
    public final boolean e;
    public final ArrayList f;
    public final y8h g;
    public final y8h h;
    public isi1 i;
    public final cdf0 j;
    public fba k;
    public float l;
    public final u9v m;

    public a620(cdf0 cdf0Var, hba hbaVar, ow61 ow61Var) {
        Path path = new Path();
        this.a = path;
        p9b0 p9b0Var = new p9b0(1);
        this.b = p9b0Var;
        this.f = new ArrayList();
        this.c = hbaVar;
        String str = ow61Var.c;
        p95 p95Var = ow61Var.e;
        p95 p95Var2 = ow61Var.d;
        this.d = str;
        this.e = ow61Var.f;
        this.j = cdf0Var;
        if (hbaVar.k() != null) {
            fba fbaVarC0 = ((q95) hbaVar.k().b).c0();
            this.k = fbaVarC0;
            fbaVarC0.a(this);
            hbaVar.d(this.k);
        }
        if (hbaVar.l() != null) {
            this.m = new u9v(this, hbaVar, hbaVar.l());
        }
        if (p95Var2 == null) {
            this.g = null;
            this.h = null;
            return;
        }
        int iC = kaa0.c(hbaVar.f48p.y);
        if (Build.VERSION.SDK_INT >= 29) {
            x74.k0(p9b0Var, iC != 0 ? x74.c0(iC) : null);
        } else if (iC != 0) {
            PorterDuff.Mode modeM = bmq0.M(iC);
            p9b0Var.setXfermode(modeM != null ? new PorterDuffXfermode(modeM) : null);
        } else {
            p9b0Var.setXfermode(null);
        }
        path.setFillType(ow61Var.b);
        y8h y8hVarC0 = p95Var2.c0();
        this.g = y8hVarC0;
        y8hVarC0.a(this);
        hbaVar.d(y8hVarC0);
        y8h y8hVarC1 = p95Var.c0();
        this.h = y8hVarC1;
        y8hVarC1.a(this);
        hbaVar.d(y8hVarC1);
    }

    @Override // p.cba
    public final void a() {
        this.j.invalidateSelf();
    }

    @Override // p.wpl
    public final void b(List list, List list2) {
        for (int i = 0; i < list2.size(); i++) {
            wpl wplVar = (wpl) list2.get(i);
            if (wplVar instanceof x8s0) {
                this.f.add((x8s0) wplVar);
            }
        }
    }

    @Override // p.p8v
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        Path path = this.a;
        path.reset();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f;
            if (i >= arrayList.size()) {
                path.computeBounds(rectF, false);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            } else {
                path.addPath(((x8s0) arrayList.get(i)).getPath(), matrix);
                i++;
            }
        }
    }

    @Override // p.lpa0
    public final void e(kpa0 kpa0Var, int i, ArrayList arrayList, kpa0 kpa0Var2) {
        itj0.f(kpa0Var, i, arrayList, kpa0Var2, this);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p.p8v
    public final void f(Canvas canvas, Matrix matrix, int i) {
        BlurMaskFilter blurMaskFilter;
        if (this.e) {
            return;
        }
        int iK = this.g.k();
        int iIntValue = (int) ((((i / 255.0f) * ((Integer) this.h.e()).intValue()) / 100.0f) * 255.0f);
        PointF pointF = itj0.a;
        int i2 = 0;
        int iMax = (Math.max(0, Math.min(255, iIntValue)) << 24) | (iK & 16777215);
        p9b0 p9b0Var = this.b;
        p9b0Var.setColor(iMax);
        isi1 isi1Var = this.i;
        if (isi1Var != null) {
            p9b0Var.setColorFilter((ColorFilter) isi1Var.e());
        }
        fba fbaVar = this.k;
        if (fbaVar != null) {
            float fFloatValue = ((Float) fbaVar.e()).floatValue();
            if (fFloatValue == 0.0f) {
                p9b0Var.setMaskFilter(null);
            } else if (fFloatValue != this.l) {
                hba hbaVar = this.c;
                if (hbaVar.A == fFloatValue) {
                    blurMaskFilter = hbaVar.B;
                } else {
                    BlurMaskFilter blurMaskFilter2 = new BlurMaskFilter(fFloatValue / 2.0f, BlurMaskFilter.Blur.NORMAL);
                    hbaVar.B = blurMaskFilter2;
                    hbaVar.A = fFloatValue;
                    blurMaskFilter = blurMaskFilter2;
                }
                p9b0Var.setMaskFilter(blurMaskFilter);
            }
            this.l = fFloatValue;
        }
        u9v u9vVar = this.m;
        if (u9vVar != null) {
            u9vVar.b(p9b0Var);
        }
        Path path = this.a;
        path.reset();
        while (true) {
            ArrayList arrayList = this.f;
            if (i2 >= arrayList.size()) {
                canvas.drawPath(path, p9b0Var);
                return;
            } else {
                path.addPath(((x8s0) arrayList.get(i2)).getPath(), matrix);
                i2++;
            }
        }
    }

    @Override // p.lpa0
    public final void g(Object obj, j2e0 j2e0Var) {
        PointF pointF = ndf0.a;
        if (obj == 1) {
            this.g.j(j2e0Var);
            return;
        }
        if (obj == 4) {
            this.h.j(j2e0Var);
            return;
        }
        ColorFilter colorFilter = ndf0.F;
        hba hbaVar = this.c;
        if (obj == colorFilter) {
            isi1 isi1Var = this.i;
            if (isi1Var != null) {
                hbaVar.o(isi1Var);
            }
            if (j2e0Var == null) {
                this.i = null;
                return;
            }
            isi1 isi1Var2 = new isi1(null, j2e0Var);
            this.i = isi1Var2;
            isi1Var2.a(this);
            hbaVar.d(this.i);
            return;
        }
        if (obj == ndf0.e) {
            fba fbaVar = this.k;
            if (fbaVar != null) {
                fbaVar.j(j2e0Var);
                return;
            }
            isi1 isi1Var3 = new isi1(null, j2e0Var);
            this.k = isi1Var3;
            isi1Var3.a(this);
            hbaVar.d(this.k);
            return;
        }
        u9v u9vVar = this.m;
        if (obj == 5 && u9vVar != null) {
            u9vVar.c(j2e0Var);
            return;
        }
        if (obj == ndf0.B && u9vVar != null) {
            u9vVar.f(j2e0Var);
            return;
        }
        if (obj == ndf0.C && u9vVar != null) {
            u9vVar.d(j2e0Var);
            return;
        }
        if (obj == ndf0.D && u9vVar != null) {
            u9vVar.e(j2e0Var);
        } else {
            if (obj != ndf0.E || u9vVar == null) {
                return;
            }
            u9vVar.g(j2e0Var);
        }
    }

    @Override // p.wpl
    public final String getName() {
        return this.d;
    }
}
