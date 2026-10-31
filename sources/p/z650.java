package p;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class z650 implements p8v, cba, mpa0 {
    public final String a;
    public final boolean b;
    public final hba c;
    public final q5f0 d = new q5f0((Object) null);
    public final q5f0 e = new q5f0((Object) null);
    public final Path f;
    public final p9b0 g;
    public final RectF h;
    public final ArrayList i;
    public final int j;
    public final p650 k;
    public final y8h l;
    public final aav0 m;
    public final aav0 n;
    public isi1 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public isi1 f182p;
    public final cdf0 q;
    public final int r;
    public fba s;
    public float t;
    public final u9v u;

    public z650(cdf0 cdf0Var, fcf0 fcf0Var, hba hbaVar, y650 y650Var) {
        Path path = new Path();
        this.f = path;
        this.g = new p9b0(1);
        this.h = new RectF();
        this.i = new ArrayList();
        this.t = 0.0f;
        this.c = hbaVar;
        this.a = y650Var.g;
        this.b = y650Var.h;
        this.q = cdf0Var;
        this.j = y650Var.a;
        path.setFillType(y650Var.b);
        this.r = (int) (fcf0Var.b() / 32.0f);
        p650 p650VarC0 = y650Var.c.c0();
        this.k = p650VarC0;
        p650VarC0.a(this);
        hbaVar.d(p650VarC0);
        y8h y8hVarC0 = y650Var.d.c0();
        this.l = y8hVarC0;
        y8hVarC0.a(this);
        hbaVar.d(y8hVarC0);
        aav0 aav0VarC0 = y650Var.e.c0();
        this.m = aav0VarC0;
        aav0VarC0.a(this);
        hbaVar.d(aav0VarC0);
        aav0 aav0VarC1 = y650Var.f.c0();
        this.n = aav0VarC1;
        aav0VarC1.a(this);
        hbaVar.d(aav0VarC1);
        if (hbaVar.k() != null) {
            fba fbaVarC0 = ((q95) hbaVar.k().b).c0();
            this.s = fbaVarC0;
            fbaVarC0.a(this);
            hbaVar.d(this.s);
        }
        if (hbaVar.l() != null) {
            this.u = new u9v(this, hbaVar, hbaVar.l());
        }
    }

    public final void a() {
        this.q.invalidateSelf();
    }

    public final void b(List list, List list2) {
        for (int i = 0; i < list2.size(); i++) {
            x8s0 x8s0Var = (wpl) list2.get(i);
            if (x8s0Var instanceof x8s0) {
                this.i.add(x8s0Var);
            }
        }
    }

    public final void c(RectF rectF, Matrix matrix, boolean z) {
        Path path = this.f;
        path.reset();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.i;
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

    public final int[] d(int[] iArr) {
        isi1 isi1Var = this.f182p;
        if (isi1Var != null) {
            Integer[] numArr = (Integer[]) isi1Var.e();
            int i = 0;
            if (iArr.length == numArr.length) {
                while (i < iArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i < numArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            }
        }
        return iArr;
    }

    public final void e(kpa0 kpa0Var, int i, ArrayList arrayList, kpa0 kpa0Var2) {
        itj0.f(kpa0Var, i, arrayList, kpa0Var2, this);
    }

    public final void f(Canvas canvas, Matrix matrix, int i) {
        Shader shader;
        Shader radialGradient;
        if (this.b) {
            return;
        }
        Path path = this.f;
        path.reset();
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.i;
            if (i2 >= arrayList.size()) {
                break;
            }
            path.addPath(((x8s0) arrayList.get(i2)).getPath(), matrix);
            i2++;
        }
        path.computeBounds(this.h, false);
        int i3 = this.j;
        p650 p650Var = this.k;
        aav0 aav0Var = this.n;
        aav0 aav0Var2 = this.m;
        if (i3 == 1) {
            long jH = h();
            q5f0 q5f0Var = this.d;
            shader = (LinearGradient) q5f0Var.b(jH);
            if (shader == null) {
                PointF pointF = (PointF) aav0Var2.e();
                PointF pointF2 = (PointF) aav0Var.e();
                o650 o650Var = (o650) p650Var.e();
                radialGradient = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, d(o650Var.b), o650Var.a, Shader.TileMode.CLAMP);
                q5f0Var.g(jH, radialGradient);
                shader = radialGradient;
            }
        } else {
            long jH2 = h();
            q5f0 q5f0Var2 = this.e;
            shader = (RadialGradient) q5f0Var2.b(jH2);
            if (shader == null) {
                PointF pointF3 = (PointF) aav0Var2.e();
                PointF pointF4 = (PointF) aav0Var.e();
                o650 o650Var2 = (o650) p650Var.e();
                int[] iArrD = d(o650Var2.b);
                float[] fArr = o650Var2.a;
                float f = pointF3.x;
                float f2 = pointF3.y;
                float fHypot = (float) Math.hypot(pointF4.x - f, pointF4.y - f2);
                if (fHypot <= 0.0f) {
                    fHypot = 0.001f;
                }
                radialGradient = new RadialGradient(f, f2, fHypot, iArrD, fArr, Shader.TileMode.CLAMP);
                q5f0Var2.g(jH2, radialGradient);
                shader = radialGradient;
            }
        }
        shader.setLocalMatrix(matrix);
        p9b0 p9b0Var = this.g;
        p9b0Var.setShader(shader);
        isi1 isi1Var = this.o;
        if (isi1Var != null) {
            p9b0Var.setColorFilter((ColorFilter) isi1Var.e());
        }
        fba fbaVar = this.s;
        if (fbaVar != null) {
            float fFloatValue = ((Float) fbaVar.e()).floatValue();
            if (fFloatValue == 0.0f) {
                p9b0Var.setMaskFilter(null);
            } else if (fFloatValue != this.t) {
                p9b0Var.setMaskFilter(new BlurMaskFilter(fFloatValue, BlurMaskFilter.Blur.NORMAL));
            }
            this.t = fFloatValue;
        }
        u9v u9vVar = this.u;
        if (u9vVar != null) {
            u9vVar.b(p9b0Var);
        }
        int iIntValue = (int) ((((i / 255.0f) * ((Integer) this.l.e()).intValue()) / 100.0f) * 255.0f);
        PointF pointF5 = itj0.a;
        p9b0Var.setAlpha(Math.max(0, Math.min(255, iIntValue)));
        canvas.drawPath(path, p9b0Var);
    }

    public final void g(Object obj, j2e0 j2e0Var) {
        PointF pointF = ndf0.a;
        if (obj == 4) {
            this.l.j(j2e0Var);
            return;
        }
        ColorFilter colorFilter = ndf0.F;
        hba hbaVar = this.c;
        if (obj == colorFilter) {
            isi1 isi1Var = this.o;
            if (isi1Var != null) {
                hbaVar.o(isi1Var);
            }
            if (j2e0Var == null) {
                this.o = null;
                return;
            }
            isi1 isi1Var2 = new isi1((Object) null, j2e0Var);
            this.o = isi1Var2;
            isi1Var2.a(this);
            hbaVar.d(this.o);
            return;
        }
        if (obj == ndf0.G) {
            isi1 isi1Var3 = this.f182p;
            if (isi1Var3 != null) {
                hbaVar.o(isi1Var3);
            }
            if (j2e0Var == null) {
                this.f182p = null;
                return;
            }
            this.d.a();
            this.e.a();
            isi1 isi1Var4 = new isi1((Object) null, j2e0Var);
            this.f182p = isi1Var4;
            isi1Var4.a(this);
            hbaVar.d(this.f182p);
            return;
        }
        if (obj == ndf0.e) {
            fba fbaVar = this.s;
            if (fbaVar != null) {
                fbaVar.j(j2e0Var);
                return;
            }
            isi1 isi1Var5 = new isi1((Object) null, j2e0Var);
            this.s = isi1Var5;
            isi1Var5.a(this);
            hbaVar.d(this.s);
            return;
        }
        u9v u9vVar = this.u;
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

    public final String getName() {
        return this.a;
    }

    public final int h() {
        float f = ((fba) this.m).d;
        float f2 = this.r;
        int iRound = Math.round(f * f2);
        int iRound2 = Math.round(((fba) this.n).d * f2);
        int iRound3 = Math.round(((fba) this.k).d * f2);
        int i = iRound != 0 ? 527 * iRound : 17;
        if (iRound2 != 0) {
            i = i * 31 * iRound2;
        }
        return iRound3 != 0 ? i * 31 * iRound3 : i;
    }
}
