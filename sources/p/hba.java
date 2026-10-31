package p;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class hba implements p8v, cba, lpa0 {
    public float A;
    public BlurMaskFilter B;
    public final Path a = new Path();
    public final Matrix b = new Matrix();
    public final Matrix c = new Matrix();
    public final p9b0 d = new p9b0(1);
    public final p9b0 e;
    public final p9b0 f;
    public final p9b0 g;
    public final p9b0 h;
    public final RectF i;
    public final RectF j;
    public final RectF k;
    public final RectF l;
    public final RectF m;
    public final Matrix n;
    public final cdf0 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final qkb0 f48p;
    public final o3e0 q;
    public final cr20 r;
    public hba s;
    public hba t;
    public List u;
    public final ArrayList v;
    public final nfg1 w;
    public boolean x;
    public boolean y;
    public p9b0 z;

    public hba(cdf0 cdf0Var, qkb0 qkb0Var) {
        PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
        this.e = new p9b0(mode);
        PorterDuff.Mode mode2 = PorterDuff.Mode.DST_OUT;
        this.f = new p9b0(mode2);
        p9b0 p9b0Var = new p9b0(1);
        this.g = p9b0Var;
        PorterDuff.Mode mode3 = PorterDuff.Mode.CLEAR;
        p9b0 p9b0Var2 = new p9b0();
        p9b0Var2.setXfermode(new PorterDuffXfermode(mode3));
        this.h = p9b0Var2;
        this.i = new RectF();
        this.j = new RectF();
        this.k = new RectF();
        this.l = new RectF();
        this.m = new RectF();
        this.n = new Matrix();
        this.v = new ArrayList();
        this.x = true;
        this.A = 0.0f;
        this.o = cdf0Var;
        this.f48p = qkb0Var;
        List list = qkb0Var.h;
        if (qkb0Var.u == 3) {
            p9b0Var.setXfermode(new PorterDuffXfermode(mode2));
        } else {
            p9b0Var.setXfermode(new PorterDuffXfermode(mode));
        }
        w95 w95Var = qkb0Var.i;
        w95Var.getClass();
        nfg1 nfg1Var = new nfg1(w95Var);
        this.w = nfg1Var;
        nfg1Var.b(this);
        if (list != null && !list.isEmpty()) {
            o3e0 o3e0Var = new o3e0(list);
            this.q = o3e0Var;
            Iterator it = o3e0Var.i().iterator();
            while (it.hasNext()) {
                ((fba) it.next()).a(this);
            }
            for (fba fbaVar : this.q.l()) {
                d(fbaVar);
                fbaVar.a(this);
            }
        }
        qkb0 qkb0Var2 = this.f48p;
        if (qkb0Var2.t.isEmpty()) {
            if (true != this.x) {
                this.x = true;
                this.o.invalidateSelf();
                return;
            }
            return;
        }
        cr20 cr20Var = new cr20(qkb0Var2.t);
        this.r = cr20Var;
        cr20Var.b = true;
        cr20Var.a(new gba(this));
        boolean z = ((Float) this.r.e()).floatValue() == 1.0f;
        if (z != this.x) {
            this.x = z;
            this.o.invalidateSelf();
        }
        d(this.r);
    }

    @Override // p.cba
    public final void a() {
        this.o.invalidateSelf();
    }

    @Override // p.p8v
    public void c(RectF rectF, Matrix matrix, boolean z) {
        this.i.set(0.0f, 0.0f, 0.0f, 0.0f);
        h();
        Matrix matrix2 = this.n;
        matrix2.set(matrix);
        if (z) {
            List list = this.u;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    matrix2.preConcat(((hba) this.u.get(size)).w.e());
                }
            } else {
                hba hbaVar = this.t;
                if (hbaVar != null) {
                    matrix2.preConcat(hbaVar.w.e());
                }
            }
        }
        matrix2.preConcat(this.w.e());
    }

    public final void d(fba fbaVar) {
        if (fbaVar == null) {
            return;
        }
        this.v.add(fbaVar);
    }

    @Override // p.lpa0
    public final void e(kpa0 kpa0Var, int i, ArrayList arrayList, kpa0 kpa0Var2) {
        hba hbaVar = this.s;
        qkb0 qkb0Var = this.f48p;
        if (hbaVar != null) {
            kpa0 kpa0VarA = kpa0Var2.a(hbaVar.f48p.c);
            if (kpa0Var.b(i, this.s.f48p.c)) {
                arrayList.add(kpa0VarA.g(this.s));
            }
            if (kpa0Var.f(i, qkb0Var.c)) {
                this.s.p(kpa0Var, kpa0Var.d(i, this.s.f48p.c) + i, arrayList, kpa0VarA);
            }
        }
        String str = qkb0Var.c;
        String str2 = qkb0Var.c;
        if (kpa0Var.e(i, str)) {
            if (!"__container".equals(str2)) {
                kpa0Var2 = kpa0Var2.a(str2);
                if (kpa0Var.b(i, str2)) {
                    arrayList.add(kpa0Var2.g(this));
                }
            }
            if (kpa0Var.f(i, str2)) {
                p(kpa0Var, kpa0Var.d(i, str2) + i, arrayList, kpa0Var2);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:52:0x0105  */
    /* JADX WARN: Code duplicated, block: B:53:0x0109  */
    @Override // p.p8v
    public final void f(Canvas canvas, Matrix matrix, int i) {
        float f;
        RectF rectF;
        p9b0 p9b0Var;
        int i2;
        char c;
        Integer num;
        if (this.x) {
            qkb0 qkb0Var = this.f48p;
            if (qkb0Var.v) {
                return;
            }
            h();
            Matrix matrix2 = this.b;
            matrix2.reset();
            matrix2.set(matrix);
            int i3 = 1;
            for (int size = this.u.size() - 1; size >= 0; size--) {
                matrix2.preConcat(((hba) this.u.get(size)).w.e());
            }
            nfg1 nfg1Var = this.w;
            fba fbaVar = nfg1Var.j;
            int iIntValue = (int) ((((i / 255.0f) * ((fbaVar == null || (num = (Integer) fbaVar.e()) == null) ? 100 : num.intValue())) / 100.0f) * 255.0f);
            if (this.s == null && !m()) {
                matrix2.preConcat(nfg1Var.e());
                j(canvas, matrix2, iIntValue);
                n();
                return;
            }
            RectF rectF2 = this.i;
            c(rectF2, matrix2, false);
            int i4 = 3;
            if (this.s != null && qkb0Var.u != 3) {
                RectF rectF3 = this.l;
                rectF3.set(0.0f, 0.0f, 0.0f, 0.0f);
                this.s.c(rectF3, matrix, true);
                if (!rectF2.intersect(rectF3)) {
                    rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
                }
            }
            matrix2.preConcat(nfg1Var.e());
            RectF rectF4 = this.k;
            rectF4.set(0.0f, 0.0f, 0.0f, 0.0f);
            boolean zM = m();
            int i5 = 2;
            o3e0 o3e0Var = this.q;
            Path path = this.a;
            if (zM) {
                int size2 = o3e0Var.j().size();
                int i6 = 0;
                while (true) {
                    if (i6 < size2) {
                        b8h0 b8h0Var = (b8h0) o3e0Var.j().get(i6);
                        Path path2 = (Path) ((fba) o3e0Var.i().get(i6)).e();
                        if (path2 != null) {
                            path.set(path2);
                            path.transform(matrix2);
                            int iC = l1d.C(b8h0Var.a());
                            if (iC != 0) {
                                if (iC != i3) {
                                    if (iC != i5) {
                                        if (iC == i4) {
                                        }
                                        rectF = this.m;
                                        path.computeBounds(rectF, false);
                                        if (i6 == 0) {
                                            rectF4.set(rectF);
                                        } else {
                                            rectF4.set(Math.min(rectF4.left, rectF.left), Math.min(rectF4.top, rectF.top), Math.max(rectF4.right, rectF.right), Math.max(rectF4.bottom, rectF.bottom));
                                        }
                                    }
                                }
                            }
                            if (b8h0Var.b()) {
                            }
                            rectF = this.m;
                            path.computeBounds(rectF, false);
                            if (i6 == 0) {
                                rectF4.set(rectF);
                            } else {
                                rectF4.set(Math.min(rectF4.left, rectF.left), Math.min(rectF4.top, rectF.top), Math.max(rectF4.right, rectF.right), Math.max(rectF4.bottom, rectF.bottom));
                            }
                        }
                        i6++;
                        i3 = 1;
                        i5 = 2;
                        i4 = 3;
                    } else if (!rectF2.intersect(rectF4)) {
                        f = 0.0f;
                        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
                        break;
                    }
                    f = 0.0f;
                    break;
                }
            } else {
                f = 0.0f;
            }
            float width = canvas.getWidth();
            float height = canvas.getHeight();
            RectF rectF5 = this.j;
            rectF5.set(f, f, width, height);
            Matrix matrix3 = this.c;
            canvas.getMatrix(matrix3);
            if (!matrix3.isIdentity()) {
                matrix3.invert(matrix3);
                matrix3.mapRect(rectF5);
            }
            if (!rectF2.intersect(rectF5)) {
                rectF2.set(f, f, f, f);
            }
            if (rectF2.width() >= 1.0f && rectF2.height() >= 1.0f) {
                p9b0 p9b0Var2 = this.d;
                p9b0Var2.setAlpha(255);
                p5r p5rVar = qpi1.a;
                canvas.saveLayer(rectF2, p9b0Var2);
                i(canvas);
                j(canvas, matrix2, iIntValue);
                if (m()) {
                    p9b0 p9b0Var3 = this.e;
                    canvas.saveLayer(rectF2, p9b0Var3);
                    if (Build.VERSION.SDK_INT < 28) {
                        i(canvas);
                    }
                    int i7 = 0;
                    while (i7 < o3e0Var.j().size()) {
                        b8h0 b8h0Var2 = (b8h0) o3e0Var.j().get(i7);
                        fba fbaVar2 = (fba) o3e0Var.i().get(i7);
                        fba fbaVar3 = (fba) o3e0Var.l().get(i7);
                        int iC2 = l1d.C(b8h0Var2.a());
                        p9b0 p9b0Var4 = this.f;
                        if (iC2 != 0) {
                            i2 = i7;
                            if (iC2 != 1) {
                                if (iC2 != 2) {
                                    if (iC2 == 3 && !o3e0Var.i().isEmpty()) {
                                        int i8 = 0;
                                        while (true) {
                                            if (i8 >= o3e0Var.j().size()) {
                                                p9b0Var2.setAlpha(255);
                                                canvas.drawRect(rectF2, p9b0Var2);
                                                break;
                                            } else if (((b8h0) o3e0Var.j().get(i8)).a() != 4) {
                                                break;
                                            } else {
                                                i8++;
                                            }
                                        }
                                    }
                                } else if (b8h0Var2.b()) {
                                    p5r p5rVar2 = qpi1.a;
                                    canvas.saveLayer(rectF2, p9b0Var3);
                                    canvas.drawRect(rectF2, p9b0Var2);
                                    p9b0Var4.setAlpha((int) (((Integer) fbaVar3.e()).intValue() * 2.55f));
                                    path.set((Path) fbaVar2.e());
                                    path.transform(matrix2);
                                    canvas.drawPath(path, p9b0Var4);
                                    canvas.restore();
                                } else {
                                    p5r p5rVar3 = qpi1.a;
                                    canvas.saveLayer(rectF2, p9b0Var3);
                                    path.set((Path) fbaVar2.e());
                                    path.transform(matrix2);
                                    p9b0Var2.setAlpha((int) (((Integer) fbaVar3.e()).intValue() * 2.55f));
                                    canvas.drawPath(path, p9b0Var2);
                                    canvas.restore();
                                }
                                c = 255;
                            } else {
                                if (i2 == 0) {
                                    p9b0Var2.setColor(-16777216);
                                    c = 255;
                                    p9b0Var2.setAlpha(255);
                                    canvas.drawRect(rectF2, p9b0Var2);
                                } else {
                                    c = 255;
                                }
                                if (b8h0Var2.b()) {
                                    p5r p5rVar4 = qpi1.a;
                                    canvas.saveLayer(rectF2, p9b0Var4);
                                    canvas.drawRect(rectF2, p9b0Var2);
                                    p9b0Var4.setAlpha((int) (((Integer) fbaVar3.e()).intValue() * 2.55f));
                                    path.set((Path) fbaVar2.e());
                                    path.transform(matrix2);
                                    canvas.drawPath(path, p9b0Var4);
                                    canvas.restore();
                                } else {
                                    path.set((Path) fbaVar2.e());
                                    path.transform(matrix2);
                                    canvas.drawPath(path, p9b0Var4);
                                }
                            }
                        } else {
                            i2 = i7;
                            c = 255;
                            if (b8h0Var2.b()) {
                                p5r p5rVar5 = qpi1.a;
                                canvas.saveLayer(rectF2, p9b0Var2);
                                canvas.drawRect(rectF2, p9b0Var2);
                                path.set((Path) fbaVar2.e());
                                path.transform(matrix2);
                                p9b0Var2.setAlpha((int) (((Integer) fbaVar3.e()).intValue() * 2.55f));
                                canvas.drawPath(path, p9b0Var4);
                                canvas.restore();
                            } else {
                                path.set((Path) fbaVar2.e());
                                path.transform(matrix2);
                                p9b0Var2.setAlpha((int) (((Integer) fbaVar3.e()).intValue() * 2.55f));
                                canvas.drawPath(path, p9b0Var2);
                            }
                        }
                        i7 = i2 + 1;
                    }
                    canvas.restore();
                }
                if (this.s != null) {
                    canvas.saveLayer(rectF2, this.g);
                    i(canvas);
                    this.s.f(canvas, matrix, iIntValue);
                    canvas.restore();
                }
                canvas.restore();
            }
            if (this.y && (p9b0Var = this.z) != null) {
                p9b0Var.setStyle(Paint.Style.STROKE);
                this.z.setColor(-251901);
                this.z.setStrokeWidth(4.0f);
                canvas.drawRect(rectF2, this.z);
                this.z.setStyle(Paint.Style.FILL);
                this.z.setColor(1357638635);
                canvas.drawRect(rectF2, this.z);
            }
            n();
        }
    }

    @Override // p.lpa0
    public void g(Object obj, j2e0 j2e0Var) {
        this.w.c(obj, j2e0Var);
    }

    public final void h() {
        if (this.u != null) {
            return;
        }
        if (this.t == null) {
            this.u = Collections.EMPTY_LIST;
            return;
        }
        this.u = new ArrayList();
        for (hba hbaVar = this.t; hbaVar != null; hbaVar = hbaVar.t) {
            this.u.add(hbaVar);
        }
    }

    public final void i(Canvas canvas) {
        RectF rectF = this.i;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.h);
    }

    public dp5 k() {
        return this.f48p.w;
    }

    public tjq l() {
        return this.f48p.x;
    }

    public final boolean m() {
        o3e0 o3e0Var = this.q;
        return (o3e0Var == null || o3e0Var.i().isEmpty()) ? false : true;
    }

    public final void n() {
        dks0 dks0Var = this.o.a.a;
        String str = this.f48p.c;
        HashMap map = dks0Var.c;
        if (dks0Var.a) {
            zeh0 zeh0Var = (zeh0) map.get(str);
            if (zeh0Var == null) {
                zeh0Var = new zeh0();
                map.put(str, zeh0Var);
            }
            zeh0Var.a();
            if (str.equals("__container")) {
                w36 w36Var = new w36(dks0Var.b);
                if (w36Var.hasNext()) {
                    pze0.m(w36Var.next());
                    throw null;
                }
            }
        }
    }

    public final void o(fba fbaVar) {
        this.v.remove(fbaVar);
    }

    public void q(boolean z) {
        if (z && this.z == null) {
            this.z = new p9b0();
        }
        this.y = z;
    }

    public void r(float f) {
        nfg1 nfg1Var = this.w;
        fba fbaVar = nfg1Var.j;
        if (fbaVar != null) {
            fbaVar.i(f);
        }
        fba fbaVar2 = nfg1Var.m;
        if (fbaVar2 != null) {
            fbaVar2.i(f);
        }
        fba fbaVar3 = nfg1Var.n;
        if (fbaVar3 != null) {
            fbaVar3.i(f);
        }
        fba fbaVar4 = nfg1Var.f;
        if (fbaVar4 != null) {
            fbaVar4.i(f);
        }
        fba fbaVar5 = nfg1Var.g;
        if (fbaVar5 != null) {
            fbaVar5.i(f);
        }
        fba fbaVar6 = nfg1Var.h;
        if (fbaVar6 != null) {
            fbaVar6.i(f);
        }
        fba fbaVar7 = nfg1Var.i;
        if (fbaVar7 != null) {
            fbaVar7.i(f);
        }
        cr20 cr20Var = nfg1Var.k;
        if (cr20Var != null) {
            cr20Var.i(f);
        }
        cr20 cr20Var2 = nfg1Var.l;
        if (cr20Var2 != null) {
            cr20Var2.i(f);
        }
        int i = 0;
        o3e0 o3e0Var = this.q;
        if (o3e0Var != null) {
            for (int i2 = 0; i2 < o3e0Var.i().size(); i2++) {
                ((fba) o3e0Var.i().get(i2)).i(f);
            }
        }
        cr20 cr20Var3 = this.r;
        if (cr20Var3 != null) {
            cr20Var3.i(f);
        }
        hba hbaVar = this.s;
        if (hbaVar != null) {
            hbaVar.r(f);
        }
        while (true) {
            ArrayList arrayList = this.v;
            if (i >= arrayList.size()) {
                return;
            }
            ((fba) arrayList.get(i)).i(f);
            i++;
        }
    }

    @Override // p.wpl
    public final void b(List list, List list2) {
    }

    public void j(Canvas canvas, Matrix matrix, int i) {
    }

    public void p(kpa0 kpa0Var, int i, ArrayList arrayList, kpa0 kpa0Var2) {
    }
}
