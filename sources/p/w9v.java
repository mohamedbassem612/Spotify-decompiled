package p;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.BlurMaskFilter;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class w9v {
    public final z1a1 a;
    public u8s0 b;
    public f2b c;
    public long d;
    public long e;
    public long f;
    public flb0 g;
    public float h;
    public final bw61 i;
    public final lw4 j;
    public yk4 k;
    public q2k l;

    public w9v(bw61 bw61Var, z1a1 z1a1Var) {
        this.a = z1a1Var;
        int i = u7h.l;
        this.d = u7h.k;
        this.e = 0L;
        this.f = 9205357640488583168L;
        this.g = flb0.a;
        this.h = 1.0f;
        this.i = bw61Var;
        this.j = fdg1.l();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x005b  */
    public final void a(DrawScope drawScope, ColorFilter colorFilter, long j, long j2, Brush brush, float f, int i) {
        ColorFilter f2bVar;
        char c;
        long j3;
        yk4 yk4VarB;
        Brush w9cVar = brush;
        htq0 htq0Var = this.a;
        if (htq0Var instanceof htq0) {
            this.b = htq0Var.c;
            this.e = 0L;
        } else if (htq0Var instanceof jtq0) {
            jtq0 jtq0Var = (jtq0) htq0Var;
            vq31 vq31Var = jtq0Var.c;
            if (ila0.w(vq31Var)) {
                this.b = null;
                this.e = vq31Var.e;
            } else {
                this.b = jtq0Var.d;
                this.e = 0L;
            }
        } else if (!(htq0Var instanceof itq0)) {
            eg.o();
            return;
        } else {
            this.b = null;
            this.e = 0L;
        }
        if (colorFilter != null) {
            f2bVar = colorFilter;
        } else if (w9cVar != null || j2 == 16) {
            f2bVar = null;
        } else {
            f2bVar = this.c;
            if (f2bVar != null) {
                long j4 = this.d;
                int i2 = u7h.l;
                if (!z4h1.b(j4, j2)) {
                    f2bVar = new f2b(j2, 5);
                    this.d = j2;
                    this.c = f2bVar;
                }
            } else {
                f2bVar = new f2b(j2, 5);
                this.d = j2;
                this.c = f2bVar;
            }
        }
        long j5 = this.f;
        if (j5 != 9205357640488583168L && Size.c(j5, j) && this.g == drawScope.getLayoutDirection() && this.h == drawScope.h()) {
            c = ' ';
            j3 = 4294967295L;
        } else {
            long j6 = this.e;
            u8s0 u8s0Var = this.b;
            bw61 bw61Var = this.i;
            float fX0 = drawScope.X0(bw61Var.a);
            float fX1 = drawScope.X0(bw61Var.b);
            c = ' ';
            lw4 lw4Var = this.j;
            if (u8s0Var != null) {
                float f2 = fX1 * 2.0f;
                float f3 = (fX0 * 2.0f) + f2;
                j3 = 4294967295L;
                yk4VarB = h1p1.b((int) Math.ceil(Float.intBitsToFloat((int) (j >> 32)) + f3), (int) Math.ceil(Float.intBitsToFloat((int) (j & 4294967295L)) + f3), 1);
                u84 u84VarA = v84.a(yk4VarB);
                if (fX1 > 0.0f) {
                    float f4 = fX1 + fX0;
                    u84VarA.h(f4, f4);
                    eqr0.q(lw4Var, fX0 > 0.0f ? new BlurMaskFilter(fX0, BlurMaskFilter.Blur.NORMAL) : null, 11);
                    u84VarA.u(u8s0Var, lw4Var);
                    eqr0.q(lw4Var, fX0 > 0.0f ? new BlurMaskFilter(fX0, BlurMaskFilter.Blur.NORMAL) : null, 3);
                    lw4Var.f(f2);
                    u84VarA.u(u8s0Var, lw4Var);
                } else {
                    eqr0.q(lw4Var, fX0 > 0.0f ? new BlurMaskFilter(fX0, BlurMaskFilter.Blur.NORMAL) : null, 11);
                    u84VarA.h(fX0, fX0);
                    u84VarA.u(u8s0Var, lw4Var);
                }
            } else {
                j3 = 4294967295L;
                float f5 = (fX1 * 2.0f) + (fX0 * 2.0f);
                float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) + f5;
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) + f5;
                yk4 yk4VarB2 = h1p1.b((int) Math.ceil(fIntBitsToFloat), (int) Math.ceil(fIntBitsToFloat2), 1);
                u84 u84VarA2 = v84.a(yk4VarB2);
                float f6 = fIntBitsToFloat - fX0;
                float f7 = fIntBitsToFloat2 - fX0;
                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j6 >> 32));
                float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j6 & 4294967295L));
                eqr0.q(lw4Var, fX0 > 0.0f ? new BlurMaskFilter(fX0, BlurMaskFilter.Blur.NORMAL) : null, 11);
                u84VarA2.a.drawRoundRect(fX0, fX0, f6, f7, fIntBitsToFloat3, fIntBitsToFloat4, lw4Var.a);
                yk4VarB = yk4VarB2;
            }
            this.k = yk4VarB;
            this.f = j;
            this.g = drawScope.getLayoutDirection();
            this.h = drawScope.h();
        }
        yk4 yk4Var = this.k;
        if (yk4Var != null) {
            Bitmap bitmap = yk4Var.a;
            bw61 bw61Var2 = this.i;
            float f8 = -(drawScope.X0(bw61Var2.b) + drawScope.X0(bw61Var2.a));
            if (w9cVar == null || f2bVar != null) {
                DrawScope.m(drawScope, yk4Var, (((long) Float.floatToRawIntBits(f8)) & j3) | (((long) Float.floatToRawIntBits(f8)) << c), f, f2bVar, i, 8);
                return;
            }
            Brush q2kVar = this.l;
            if (q2kVar == null || !q2kVar.e.equals(w9cVar)) {
                w9c w9cVar2 = new w9c(new BitmapShader(no80.m(yk4Var), oon1.D(0), oon1.D(0)));
                if (w9cVar instanceof zv61) {
                    w9cVar = new w9c(((zv61) w9cVar).c((((long) Float.floatToRawIntBits(bitmap.getHeight())) & j3) | (((long) Float.floatToRawIntBits(bitmap.getWidth())) << c)));
                }
                q2kVar = new q2k(anm1.P(w9cVar2), anm1.P(w9cVar));
                this.l = q2kVar;
            }
            Brush brush2 = q2kVar;
            ((dg8) drawScope.a1().b).z(f8, f8);
            try {
                DrawScope.S0(drawScope, brush2, 0L, (((long) Float.floatToRawIntBits(bitmap.getHeight())) & j3) | (((long) Float.floatToRawIntBits(bitmap.getWidth())) << c), f, (DrawStyle) null, (ColorFilter) null, i, 50);
            } finally {
                float f9 = -f8;
                ((dg8) drawScope.a1().b).z(f9, f9);
            }
        }
    }
}
