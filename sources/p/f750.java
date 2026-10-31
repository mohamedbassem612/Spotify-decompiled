package p;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class f750 extends wca {
    public final aav0 A;
    public isi1 B;
    public final String r;
    public final boolean s;
    public final q5f0 t;
    public final q5f0 u;
    public final RectF v;
    public final int w;
    public final int x;
    public final p650 y;
    public final aav0 z;

    /* JADX WARN: Illegal instructions before constructor call */
    public f750(cdf0 cdf0Var, hba hbaVar, e750 e750Var) {
        Paint.Join join;
        Paint.Join join2;
        int iC = l1d.C(e750Var.h);
        Paint.Cap cap = iC != 0 ? iC != 1 ? Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        int iC2 = l1d.C(e750Var.i);
        if (iC2 == 0) {
            join = Paint.Join.MITER;
        } else {
            if (iC2 != 1) {
                if (iC2 != 2) {
                    join2 = null;
                } else {
                    join = Paint.Join.BEVEL;
                }
                super(cdf0Var, hbaVar, cap, join2, e750Var.j, e750Var.d, e750Var.g, e750Var.k, e750Var.l);
                this.t = new q5f0((Object) null);
                this.u = new q5f0((Object) null);
                this.v = new RectF();
                this.r = e750Var.a;
                this.w = e750Var.b;
                this.s = e750Var.m;
                this.x = (int) (cdf0Var.a.b() / 32.0f);
                p650 p650VarC0 = e750Var.c.c0();
                this.y = p650VarC0;
                p650VarC0.a(this);
                hbaVar.d(p650VarC0);
                aav0 aav0VarC0 = e750Var.e.c0();
                this.z = aav0VarC0;
                aav0VarC0.a(this);
                hbaVar.d(aav0VarC0);
                aav0 aav0VarC1 = e750Var.f.c0();
                this.A = aav0VarC1;
                aav0VarC1.a(this);
                hbaVar.d(aav0VarC1);
            }
            join = Paint.Join.ROUND;
        }
        join2 = join;
        super(cdf0Var, hbaVar, cap, join2, e750Var.j, e750Var.d, e750Var.g, e750Var.k, e750Var.l);
        this.t = new q5f0((Object) null);
        this.u = new q5f0((Object) null);
        this.v = new RectF();
        this.r = e750Var.a;
        this.w = e750Var.b;
        this.s = e750Var.m;
        this.x = (int) (cdf0Var.a.b() / 32.0f);
        p650 p650VarC1 = e750Var.c.c0();
        this.y = p650VarC1;
        p650VarC1.a(this);
        hbaVar.d(p650VarC1);
        aav0 aav0VarC2 = e750Var.e.c0();
        this.z = aav0VarC2;
        aav0VarC2.a(this);
        hbaVar.d(aav0VarC2);
        aav0 aav0VarC3 = e750Var.f.c0();
        this.A = aav0VarC3;
        aav0VarC3.a(this);
        hbaVar.d(aav0VarC3);
    }

    public final int[] d(int[] iArr) {
        isi1 isi1Var = this.B;
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

    @Override // p.wca
    public final void f(Canvas canvas, Matrix matrix, int i) {
        Shader shader;
        Shader radialGradient;
        if (this.s) {
            return;
        }
        c(this.v, matrix, false);
        int i2 = this.w;
        p650 p650Var = this.y;
        aav0 aav0Var = this.A;
        aav0 aav0Var2 = this.z;
        if (i2 == 1) {
            long jH = h();
            q5f0 q5f0Var = this.t;
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
            q5f0 q5f0Var2 = this.u;
            shader = (RadialGradient) q5f0Var2.b(jH2);
            if (shader == null) {
                PointF pointF3 = (PointF) aav0Var2.e();
                PointF pointF4 = (PointF) aav0Var.e();
                o650 o650Var2 = (o650) p650Var.e();
                int[] iArrD = d(o650Var2.b);
                float[] fArr = o650Var2.a;
                float f = pointF3.x;
                float f2 = pointF3.y;
                radialGradient = new RadialGradient(f, f2, (float) Math.hypot(pointF4.x - f, pointF4.y - f2), iArrD, fArr, Shader.TileMode.CLAMP);
                q5f0Var2.g(jH2, radialGradient);
                shader = radialGradient;
            }
        }
        shader.setLocalMatrix(matrix);
        this.i.setShader(shader);
        super.f(canvas, matrix, i);
    }

    @Override // p.wca
    public final void g(Object obj, j2e0 j2e0Var) {
        super.g(obj, j2e0Var);
        if (obj == ndf0.G) {
            isi1 isi1Var = this.B;
            hba hbaVar = this.f;
            if (isi1Var != null) {
                hbaVar.o(isi1Var);
            }
            if (j2e0Var == null) {
                this.B = null;
                return;
            }
            isi1 isi1Var2 = new isi1((Object) null, j2e0Var);
            this.B = isi1Var2;
            isi1Var2.a(this);
            hbaVar.d(this.B);
        }
    }

    public final String getName() {
        return this.r;
    }

    public final int h() {
        float f = ((fba) this.z).d;
        float f2 = this.x;
        int iRound = Math.round(f * f2);
        int iRound2 = Math.round(((fba) this.A).d * f2);
        int iRound3 = Math.round(((fba) this.y).d * f2);
        int i = iRound != 0 ? 527 * iRound : 17;
        if (iRound2 != 0) {
            i = i * 31 * iRound2;
        }
        return iRound3 != 0 ? i * 31 * iRound3 : i;
    }
}
