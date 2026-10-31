package p;

import android.graphics.Matrix;
import android.graphics.PointF;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class nfg1 {
    public final Matrix a = new Matrix();
    public final Matrix b;
    public final Matrix c;
    public final Matrix d;
    public final float[] e;
    public fba f;
    public fba g;
    public fba h;
    public fba i;
    public fba j;
    public cr20 k;
    public cr20 l;
    public fba m;
    public fba n;
    public final boolean o;

    public nfg1(w95 w95Var) {
        r95 r95Var = w95Var.a;
        this.f = r95Var == null ? null : r95Var.c0();
        y95 y95Var = w95Var.b;
        this.g = y95Var == null ? null : y95Var.c0();
        p95 p95Var = w95Var.c;
        this.h = p95Var == null ? null : p95Var.c0();
        q95 q95Var = w95Var.d;
        this.i = q95Var == null ? null : q95Var.c0();
        q95 q95Var2 = w95Var.f;
        cr20 cr20Var = q95Var2 == null ? null : (cr20) q95Var2.c0();
        this.k = cr20Var;
        this.o = w95Var.j;
        if (cr20Var != null) {
            this.b = new Matrix();
            this.c = new Matrix();
            this.d = new Matrix();
            this.e = new float[9];
        } else {
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = null;
        }
        q95 q95Var3 = w95Var.g;
        this.l = q95Var3 == null ? null : (cr20) q95Var3.c0();
        p95 p95Var2 = w95Var.e;
        if (p95Var2 != null) {
            this.j = p95Var2.c0();
        }
        q95 q95Var4 = w95Var.h;
        if (q95Var4 != null) {
            this.m = q95Var4.c0();
        } else {
            this.m = null;
        }
        q95 q95Var5 = w95Var.i;
        if (q95Var5 != null) {
            this.n = q95Var5.c0();
        } else {
            this.n = null;
        }
    }

    public final void a(hba hbaVar) {
        hbaVar.d(this.j);
        hbaVar.d(this.m);
        hbaVar.d(this.n);
        hbaVar.d(this.f);
        hbaVar.d(this.g);
        hbaVar.d(this.h);
        hbaVar.d(this.i);
        hbaVar.d(this.k);
        hbaVar.d(this.l);
    }

    public final void b(cba cbaVar) {
        fba fbaVar = this.j;
        if (fbaVar != null) {
            fbaVar.a(cbaVar);
        }
        fba fbaVar2 = this.m;
        if (fbaVar2 != null) {
            fbaVar2.a(cbaVar);
        }
        fba fbaVar3 = this.n;
        if (fbaVar3 != null) {
            fbaVar3.a(cbaVar);
        }
        fba fbaVar4 = this.f;
        if (fbaVar4 != null) {
            fbaVar4.a(cbaVar);
        }
        fba fbaVar5 = this.g;
        if (fbaVar5 != null) {
            fbaVar5.a(cbaVar);
        }
        fba fbaVar6 = this.h;
        if (fbaVar6 != null) {
            fbaVar6.a(cbaVar);
        }
        fba fbaVar7 = this.i;
        if (fbaVar7 != null) {
            fbaVar7.a(cbaVar);
        }
        cr20 cr20Var = this.k;
        if (cr20Var != null) {
            cr20Var.a(cbaVar);
        }
        cr20 cr20Var2 = this.l;
        if (cr20Var2 != null) {
            cr20Var2.a(cbaVar);
        }
    }

    public final boolean c(Object obj, j2e0 j2e0Var) {
        Float fValueOf = Float.valueOf(100.0f);
        Float fValueOf2 = Float.valueOf(0.0f);
        if (obj == ndf0.a) {
            fba fbaVar = this.f;
            if (fbaVar == null) {
                this.f = new isi1(new PointF(), j2e0Var);
                return true;
            }
            fbaVar.j(j2e0Var);
            return true;
        }
        if (obj == ndf0.b) {
            fba fbaVar2 = this.g;
            if (fbaVar2 == null) {
                this.g = new isi1(new PointF(), j2e0Var);
                return true;
            }
            fbaVar2.j(j2e0Var);
            return true;
        }
        if (obj == ndf0.c) {
            jya1 jya1Var = this.g;
            if (jya1Var instanceof jya1) {
                jya1Var.l(j2e0Var);
                return true;
            }
        }
        if (obj == ndf0.d) {
            jya1 jya1Var2 = this.g;
            if (jya1Var2 instanceof jya1) {
                jya1Var2.m(j2e0Var);
                return true;
            }
        }
        if (obj == ndf0.j) {
            fba fbaVar3 = this.h;
            if (fbaVar3 == null) {
                this.h = new isi1(new pg41(), j2e0Var);
                return true;
            }
            fbaVar3.j(j2e0Var);
            return true;
        }
        if (obj == ndf0.k) {
            fba fbaVar4 = this.i;
            if (fbaVar4 == null) {
                this.i = new isi1(fValueOf2, j2e0Var);
                return true;
            }
            fbaVar4.j(j2e0Var);
            return true;
        }
        if (obj == 3) {
            fba fbaVar5 = this.j;
            if (fbaVar5 == null) {
                this.j = new isi1(100, j2e0Var);
                return true;
            }
            fbaVar5.j(j2e0Var);
            return true;
        }
        if (obj == ndf0.x) {
            fba fbaVar6 = this.m;
            if (fbaVar6 == null) {
                this.m = new isi1(fValueOf, j2e0Var);
                return true;
            }
            fbaVar6.j(j2e0Var);
            return true;
        }
        if (obj == ndf0.y) {
            fba fbaVar7 = this.n;
            if (fbaVar7 == null) {
                this.n = new isi1(fValueOf, j2e0Var);
                return true;
            }
            fbaVar7.j(j2e0Var);
            return true;
        }
        if (obj == ndf0.l) {
            cr20 cr20Var = this.k;
            if (cr20Var == null) {
                cr20Var = new cr20(Collections.singletonList(new sua0(fValueOf2)));
                this.k = cr20Var;
            }
            cr20Var.j(j2e0Var);
            return true;
        }
        if (obj != ndf0.m) {
            return false;
        }
        cr20 cr20Var2 = this.l;
        if (cr20Var2 == null) {
            cr20Var2 = new cr20(Collections.singletonList(new sua0(fValueOf2)));
            this.l = cr20Var2;
        }
        cr20Var2.j(j2e0Var);
        return true;
    }

    public final void d() {
        for (int i = 0; i < 9; i++) {
            this.e[i] = 0.0f;
        }
    }

    public final Matrix e() {
        PointF pointF;
        pg41 pg41Var;
        PointF pointF2;
        Matrix matrix = this.a;
        matrix.reset();
        fba fbaVar = this.g;
        if (fbaVar != null && (pointF2 = (PointF) fbaVar.e()) != null) {
            float f = pointF2.x;
            if (f != 0.0f || pointF2.y != 0.0f) {
                matrix.preTranslate(f, pointF2.y);
            }
        }
        if (!this.o) {
            fba fbaVar2 = this.i;
            if (fbaVar2 != null) {
                float fFloatValue = fbaVar2 instanceof isi1 ? ((Float) fbaVar2.e()).floatValue() : ((cr20) fbaVar2).k();
                if (fFloatValue != 0.0f) {
                    matrix.preRotate(fFloatValue);
                }
            }
        } else if (fbaVar != null) {
            float f2 = fbaVar.d;
            PointF pointF3 = (PointF) fbaVar.e();
            float f3 = pointF3.x;
            float f4 = pointF3.y;
            fbaVar.i(1.0E-4f + f2);
            PointF pointF4 = (PointF) fbaVar.e();
            fbaVar.i(f2);
            matrix.preRotate((float) Math.toDegrees(Math.atan2(pointF4.y - f4, pointF4.x - f3)));
        }
        cr20 cr20Var = this.k;
        if (cr20Var != null) {
            cr20 cr20Var2 = this.l;
            float fCos = cr20Var2 == null ? 0.0f : (float) Math.cos(Math.toRadians((-cr20Var2.k()) + 90.0f));
            cr20 cr20Var3 = this.l;
            float fSin = cr20Var3 == null ? 1.0f : (float) Math.sin(Math.toRadians((-cr20Var3.k()) + 90.0f));
            float fTan = (float) Math.tan(Math.toRadians(cr20Var.k()));
            d();
            float[] fArr = this.e;
            fArr[0] = fCos;
            fArr[1] = fSin;
            float f5 = -fSin;
            fArr[3] = f5;
            fArr[4] = fCos;
            fArr[8] = 1.0f;
            Matrix matrix2 = this.b;
            matrix2.setValues(fArr);
            d();
            fArr[0] = 1.0f;
            fArr[3] = fTan;
            fArr[4] = 1.0f;
            fArr[8] = 1.0f;
            Matrix matrix3 = this.c;
            matrix3.setValues(fArr);
            d();
            fArr[0] = fCos;
            fArr[1] = f5;
            fArr[3] = fSin;
            fArr[4] = fCos;
            fArr[8] = 1.0f;
            Matrix matrix4 = this.d;
            matrix4.setValues(fArr);
            matrix3.preConcat(matrix2);
            matrix4.preConcat(matrix3);
            matrix.preConcat(matrix4);
        }
        fba fbaVar3 = this.h;
        if (fbaVar3 != null && (pg41Var = (pg41) fbaVar3.e()) != null) {
            float f6 = pg41Var.a;
            if (f6 != 1.0f || pg41Var.b != 1.0f) {
                matrix.preScale(f6, pg41Var.b);
            }
        }
        fba fbaVar4 = this.f;
        if (fbaVar4 != null && (pointF = (PointF) fbaVar4.e()) != null) {
            float f7 = pointF.x;
            if (f7 != 0.0f || pointF.y != 0.0f) {
                matrix.preTranslate(-f7, -pointF.y);
            }
        }
        return matrix;
    }

    public final Matrix f(float f) {
        fba fbaVar = this.g;
        PointF pointF = fbaVar == null ? null : (PointF) fbaVar.e();
        fba fbaVar2 = this.h;
        pg41 pg41Var = fbaVar2 == null ? null : (pg41) fbaVar2.e();
        Matrix matrix = this.a;
        matrix.reset();
        if (pointF != null) {
            matrix.preTranslate(pointF.x * f, pointF.y * f);
        }
        if (pg41Var != null) {
            double d = f;
            matrix.preScale((float) Math.pow(pg41Var.a, d), (float) Math.pow(pg41Var.b, d));
        }
        fba fbaVar3 = this.i;
        if (fbaVar3 != null) {
            float fFloatValue = ((Float) fbaVar3.e()).floatValue();
            fba fbaVar4 = this.f;
            PointF pointF2 = fbaVar4 != null ? (PointF) fbaVar4.e() : null;
            matrix.preRotate(fFloatValue * f, pointF2 == null ? 0.0f : pointF2.x, pointF2 != null ? pointF2.y : 0.0f);
        }
        return matrix;
    }
}
