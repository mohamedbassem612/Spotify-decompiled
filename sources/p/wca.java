package p;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.MaskFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class wca implements cba, mpa0, p8v {
    public final cdf0 e;
    public final hba f;
    public final float[] h;
    public final p9b0 i;
    public final cr20 j;
    public final y8h k;
    public final ArrayList l;
    public final cr20 m;
    public isi1 n;
    public fba o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f164p;
    public final u9v q;
    public final PathMeasure a = new PathMeasure();
    public final Path b = new Path();
    public final Path c = new Path();
    public final RectF d = new RectF();
    public final ArrayList g = new ArrayList();

    public wca(cdf0 cdf0Var, hba hbaVar, Paint.Cap cap, Paint.Join join, float f, p95 p95Var, q95 q95Var, ArrayList arrayList, q95 q95Var2) {
        p9b0 p9b0Var = new p9b0(1);
        this.i = p9b0Var;
        this.f164p = 0.0f;
        this.e = cdf0Var;
        this.f = hbaVar;
        p9b0Var.setStyle(Paint.Style.STROKE);
        p9b0Var.setStrokeCap(cap);
        p9b0Var.setStrokeJoin(join);
        p9b0Var.setStrokeMiter(f);
        this.k = p95Var.c0();
        this.j = q95Var.c0();
        if (q95Var2 == null) {
            this.m = null;
        } else {
            this.m = q95Var2.c0();
        }
        this.l = new ArrayList(arrayList.size());
        this.h = new float[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            this.l.add(((q95) arrayList.get(i)).c0());
        }
        hbaVar.d(this.k);
        hbaVar.d(this.j);
        for (int i2 = 0; i2 < this.l.size(); i2++) {
            hbaVar.d((fba) this.l.get(i2));
        }
        cr20 cr20Var = this.m;
        if (cr20Var != null) {
            hbaVar.d(cr20Var);
        }
        this.k.a(this);
        this.j.a(this);
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            ((fba) this.l.get(i3)).a(this);
        }
        cr20 cr20Var2 = this.m;
        if (cr20Var2 != null) {
            cr20Var2.a(this);
        }
        if (hbaVar.k() != null) {
            fba fbaVarC0 = ((q95) hbaVar.k().b).c0();
            this.o = fbaVarC0;
            fbaVarC0.a(this);
            hbaVar.d(this.o);
        }
        if (hbaVar.l() != null) {
            this.q = new u9v(this, hbaVar, hbaVar.l());
        }
    }

    public final void a() {
        this.e.invalidateSelf();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0050  */
    /* JADX WARN: Code duplicated, block: B:25:0x0054 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0056  */
    /* JADX WARN: Code duplicated, block: B:39:0x0062 A[SYNTHETIC] */
    public final void b(List list, List list2) {
        ArrayList arrayList;
        ArrayList arrayList2 = (ArrayList) list;
        vca vcaVar = null;
        vvg1 vvg1Var = null;
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            wpl wplVar = (wpl) arrayList2.get(size);
            if (wplVar instanceof vvg1) {
                vvg1 vvg1Var2 = (vvg1) wplVar;
                if (vvg1Var2.c == 2) {
                    vvg1Var = vvg1Var2;
                }
            }
        }
        if (vvg1Var != null) {
            vvg1Var.d(this);
        }
        int size2 = list2.size();
        while (true) {
            size2--;
            arrayList = this.g;
            if (size2 < 0) {
                break;
            }
            vvg1 vvg1Var3 = (wpl) list2.get(size2);
            if (vvg1Var3 instanceof vvg1) {
                vvg1 vvg1Var4 = vvg1Var3;
                if (vvg1Var4.c == 2) {
                    if (vcaVar != null) {
                        arrayList.add(vcaVar);
                    }
                    vca vcaVar2 = new vca(vvg1Var4);
                    vvg1Var4.d(this);
                    vcaVar = vcaVar2;
                } else if (!(vvg1Var3 instanceof x8s0)) {
                    if (vcaVar == null) {
                        vcaVar = new vca(vvg1Var);
                    }
                    vcaVar.a.add((x8s0) vvg1Var3);
                }
            } else if (!(vvg1Var3 instanceof x8s0)) {
                if (vcaVar == null) {
                    vcaVar = new vca(vvg1Var);
                }
                vcaVar.a.add((x8s0) vvg1Var3);
            }
        }
        if (vcaVar != null) {
            arrayList.add(vcaVar);
        }
    }

    public final void c(RectF rectF, Matrix matrix, boolean z) {
        Path path = this.b;
        path.reset();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.g;
            if (i >= arrayList.size()) {
                RectF rectF2 = this.d;
                path.computeBounds(rectF2, false);
                float fK = this.j.k() / 2.0f;
                rectF2.set(rectF2.left - fK, rectF2.top - fK, rectF2.right + fK, rectF2.bottom + fK);
                rectF.set(rectF2);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            }
            vca vcaVar = (vca) arrayList.get(i);
            for (int i2 = 0; i2 < vcaVar.a.size(); i2++) {
                path.addPath(((x8s0) vcaVar.a.get(i2)).getPath(), matrix);
            }
            i++;
        }
    }

    public final void e(kpa0 kpa0Var, int i, ArrayList arrayList, kpa0 kpa0Var2) {
        itj0.f(kpa0Var, i, arrayList, kpa0Var2, this);
    }

    /* JADX WARN: Code duplicated, block: B:80:0x020a  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void f(Canvas canvas, Matrix matrix, int i) {
        int i2;
        float f;
        MaskFilter maskFilter;
        float[] fArr;
        wca wcaVar = this;
        float[] fArr2 = (float[]) qpi1.d.get();
        boolean z = false;
        fArr2[0] = 0.0f;
        int i3 = 1;
        fArr2[1] = 0.0f;
        fArr2[2] = 37394.73f;
        fArr2[3] = 39575.234f;
        matrix.mapPoints(fArr2);
        if (fArr2[0] == fArr2[2] || fArr2[1] == fArr2[3]) {
            return;
        }
        y8h y8hVar = wcaVar.k;
        float fL = (i / 255.0f) * y8hVar.l(((fba) y8hVar).c.c(), y8hVar.c());
        float f2 = 100.0f;
        PointF pointF = itj0.a;
        int iMax = Math.max(0, Math.min(255, (int) ((fL / 100.0f) * 255.0f)));
        Paint paint = wcaVar.i;
        paint.setAlpha(iMax);
        paint.setStrokeWidth(qpi1.d(matrix) * wcaVar.j.k());
        if (paint.getStrokeWidth() <= 0.0f) {
            return;
        }
        ArrayList arrayList = wcaVar.l;
        if (!arrayList.isEmpty()) {
            float fD = qpi1.d(matrix);
            int i4 = 0;
            while (true) {
                int size = arrayList.size();
                fArr = wcaVar.h;
                if (i4 >= size) {
                    break;
                }
                float fFloatValue = ((Float) ((fba) arrayList.get(i4)).e()).floatValue();
                fArr[i4] = fFloatValue;
                if (i4 % 2 == 0) {
                    if (fFloatValue < 1.0f) {
                        fArr[i4] = 1.0f;
                    }
                } else if (fFloatValue < 0.1f) {
                    fArr[i4] = 0.1f;
                }
                fArr[i4] = fArr[i4] * fD;
                i4++;
            }
            cr20 cr20Var = wcaVar.m;
            paint.setPathEffect(new DashPathEffect(fArr, cr20Var == null ? 0.0f : ((Float) cr20Var.e()).floatValue() * fD));
        }
        isi1 isi1Var = wcaVar.n;
        if (isi1Var != null) {
            paint.setColorFilter((ColorFilter) isi1Var.e());
        }
        fba fbaVar = wcaVar.o;
        if (fbaVar != null) {
            float fFloatValue2 = ((Float) fbaVar.e()).floatValue();
            if (fFloatValue2 == 0.0f) {
                paint.setMaskFilter(null);
            } else if (fFloatValue2 != wcaVar.f164p) {
                hba hbaVar = wcaVar.f;
                if (hbaVar.A == fFloatValue2) {
                    maskFilter = hbaVar.B;
                } else {
                    BlurMaskFilter blurMaskFilter = new BlurMaskFilter(fFloatValue2 / 2.0f, BlurMaskFilter.Blur.NORMAL);
                    hbaVar.B = blurMaskFilter;
                    hbaVar.A = fFloatValue2;
                    maskFilter = blurMaskFilter;
                }
                paint.setMaskFilter(maskFilter);
            }
            wcaVar.f164p = fFloatValue2;
        }
        u9v u9vVar = wcaVar.q;
        if (u9vVar != null) {
            u9vVar.b(paint);
        }
        int i5 = 0;
        while (true) {
            ArrayList arrayList2 = wcaVar.g;
            if (i5 >= arrayList2.size()) {
                return;
            }
            vca vcaVar = (vca) arrayList2.get(i5);
            vvg1 vvg1Var = vcaVar.b;
            ArrayList arrayList3 = vcaVar.a;
            Path path = wcaVar.b;
            if (vvg1Var != null) {
                path.reset();
                for (int size2 = arrayList3.size() - i3; size2 >= 0; size2--) {
                    path.addPath(((x8s0) arrayList3.get(size2)).getPath(), matrix);
                }
                float fFloatValue3 = ((Float) vvg1Var.d.e()).floatValue() / f2;
                float fFloatValue4 = ((Float) vvg1Var.e.e()).floatValue() / f2;
                float fFloatValue5 = ((Float) vvg1Var.f.e()).floatValue() / 360.0f;
                if (fFloatValue3 >= 0.01f || fFloatValue4 <= 0.99f) {
                    PathMeasure pathMeasure = wcaVar.a;
                    pathMeasure.setPath(path, z);
                    float length = pathMeasure.getLength();
                    while (pathMeasure.nextContour()) {
                        length = pathMeasure.getLength() + length;
                    }
                    float f3 = fFloatValue5 * length;
                    float f4 = (fFloatValue3 * length) + f3;
                    float fMin = Math.min((fFloatValue4 * length) + f3, (f4 + length) - 1.0f);
                    int size3 = arrayList3.size() - i3;
                    float f5 = 0.0f;
                    while (size3 >= 0) {
                        int i6 = i3;
                        Path path2 = ((x8s0) arrayList3.get(size3)).getPath();
                        Path path3 = wcaVar.c;
                        path3.set(path2);
                        path3.transform(matrix);
                        pathMeasure.setPath(path3, z);
                        float length2 = pathMeasure.getLength();
                        if (fMin > length) {
                            float f6 = fMin - length;
                            if (f6 >= f5 + length2 || f5 >= f6) {
                                f = f5 + length2;
                                if (f < f4 && f5 <= fMin) {
                                    if (f > fMin || f4 >= f5) {
                                        qpi1.a(path3, f4 < f5 ? 0.0f : (f4 - f5) / length2, fMin > f ? 1.0f : (fMin - f5) / length2, 0.0f);
                                        canvas.drawPath(path3, paint);
                                    } else {
                                        canvas.drawPath(path3, paint);
                                    }
                                }
                            } else {
                                qpi1.a(path3, f4 > length ? (f4 - length) / length2 : 0.0f, Math.min(f6 / length2, 1.0f), 0.0f);
                                canvas.drawPath(path3, paint);
                            }
                        } else {
                            f = f5 + length2;
                            if (f < f4) {
                            }
                        }
                        f5 += length2;
                        size3--;
                        wcaVar = this;
                        i3 = i6;
                        z = false;
                    }
                } else {
                    canvas.drawPath(path, paint);
                }
                i2 = i3;
            } else {
                i2 = i3;
                path.reset();
                for (int size4 = arrayList3.size() - 1; size4 >= 0; size4--) {
                    path.addPath(((x8s0) arrayList3.get(size4)).getPath(), matrix);
                }
                canvas.drawPath(path, paint);
            }
            i5++;
            wcaVar = this;
            i3 = i2;
            z = false;
            f2 = 100.0f;
        }
    }

    public void g(Object obj, j2e0 j2e0Var) {
        PointF pointF = ndf0.a;
        if (obj == 4) {
            this.k.j(j2e0Var);
            return;
        }
        if (obj == ndf0.n) {
            this.j.j(j2e0Var);
            return;
        }
        ColorFilter colorFilter = ndf0.F;
        hba hbaVar = this.f;
        if (obj == colorFilter) {
            isi1 isi1Var = this.n;
            if (isi1Var != null) {
                hbaVar.o(isi1Var);
            }
            if (j2e0Var == null) {
                this.n = null;
                return;
            }
            isi1 isi1Var2 = new isi1((Object) null, j2e0Var);
            this.n = isi1Var2;
            isi1Var2.a(this);
            hbaVar.d(this.n);
            return;
        }
        if (obj == ndf0.e) {
            fba fbaVar = this.o;
            if (fbaVar != null) {
                fbaVar.j(j2e0Var);
                return;
            }
            isi1 isi1Var3 = new isi1((Object) null, j2e0Var);
            this.o = isi1Var3;
            isi1Var3.a(this);
            hbaVar.d(this.o);
            return;
        }
        u9v u9vVar = this.q;
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
}
