package p;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import java.util.Map;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class rbf0 extends hab0 implements iu30 {
    public final /* synthetic */ boolean N0;
    public final /* synthetic */ boolean O0;
    public final /* synthetic */ boolean P0;
    public final /* synthetic */ boolean Q0;
    public final /* synthetic */ Function0 R0;
    public final /* synthetic */ ven0 S0;
    public final /* synthetic */ Map X;
    public final /* synthetic */ ddf0 Y;
    public final /* synthetic */ boolean Z;
    public final /* synthetic */ Rect a;
    public final /* synthetic */ j6m b;
    public final /* synthetic */ tl3 c;
    public final /* synthetic */ Matrix d;
    public final /* synthetic */ cdf0 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ xc21 h;
    public final /* synthetic */ jj7 i;
    public final /* synthetic */ fcf0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rbf0(Rect rect, j6m j6mVar, tl3 tl3Var, Matrix matrix, cdf0 cdf0Var, boolean z, boolean z2, xc21 xc21Var, jj7 jj7Var, fcf0 fcf0Var, Map map, ddf0 ddf0Var, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, Function0 function0, ven0 ven0Var) {
        super(1);
        this.a = rect;
        this.b = j6mVar;
        this.c = tl3Var;
        this.d = matrix;
        this.e = cdf0Var;
        this.f = z;
        this.g = z2;
        this.h = xc21Var;
        this.i = jj7Var;
        this.t = fcf0Var;
        this.X = map;
        this.Y = ddf0Var;
        this.Z = z3;
        this.N0 = z4;
        this.O0 = z5;
        this.P0 = z6;
        this.Q0 = z7;
        this.R0 = function0;
        this.S0 = ven0Var;
    }

    public final Object invoke(Object obj) {
        DrawScope drawScope = (DrawScope) obj;
        u84 u84VarP = drawScope.a1().p();
        Rect rect = this.a;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(rect.height())) & 4294967295L) | (((long) Float.floatToRawIntBits(rect.width())) << 32);
        long jC = o0c.c(jch0.U(Size.f(drawScope.j())), jch0.U(Size.d(drawScope.j())));
        long jA = this.b.a(jFloatToRawIntBits, drawScope.j());
        float f = Size.f(jFloatToRawIntBits);
        int i = lg41.a;
        int i2 = (int) (jA >> 32);
        int i3 = (int) (jA & 4294967295L);
        long jA2 = this.c.a(o0c.c((int) (Float.intBitsToFloat(i2) * f), (int) (Float.intBitsToFloat(i3) * Size.d(jFloatToRawIntBits))), jC, drawScope.getLayoutDirection());
        Matrix matrix = this.d;
        matrix.reset();
        matrix.preTranslate((int) (jA2 >> 32), (int) (jA2 & 4294967295L));
        matrix.preScale(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3));
        cdf0 cdf0Var = this.e;
        boolean z = cdf0Var.Y;
        boolean z2 = this.f;
        if (z != z2) {
            cdf0Var.Y = z2;
            if (cdf0Var.a != null) {
                cdf0Var.c();
            }
        }
        cdf0Var.e = this.g;
        cdf0Var.U0 = this.h;
        cdf0Var.e();
        cdf0Var.j1 = this.i;
        cdf0Var.n(this.t);
        Map map = cdf0Var.t;
        Map map2 = this.X;
        if (map2 != map) {
            cdf0Var.t = map2;
            cdf0Var.invalidateSelf();
        }
        ven0 ven0Var = this.S0;
        ddf0 ddf0Var = (ddf0) ven0Var.getValue();
        ddf0 ddf0Var2 = this.Y;
        if (ddf0Var2 != ddf0Var) {
            ddf0 ddf0Var3 = (ddf0) ven0Var.getValue();
            if (ddf0Var3 != null) {
                for (edf0 edf0Var : ddf0Var3.a) {
                    cdf0Var.a(edf0Var.b, edf0Var.a, (j2e0) null);
                }
                for (edf0 edf0Var2 : ddf0Var3.b) {
                    cdf0Var.a(edf0Var2.b, edf0Var2.a, (j2e0) null);
                }
                for (edf0 edf0Var3 : ddf0Var3.c) {
                    cdf0Var.a(edf0Var3.b, edf0Var3.a, (j2e0) null);
                }
                for (edf0 edf0Var4 : ddf0Var3.d) {
                    cdf0Var.a(edf0Var4.b, edf0Var4.a, (j2e0) null);
                }
                for (edf0 edf0Var5 : ddf0Var3.e) {
                    cdf0Var.a(edf0Var5.b, edf0Var5.a, (j2e0) null);
                }
                for (edf0 edf0Var6 : ddf0Var3.f) {
                    cdf0Var.a(edf0Var6.b, edf0Var6.a, (j2e0) null);
                }
                for (edf0 edf0Var7 : ddf0Var3.g) {
                    cdf0Var.a(edf0Var7.b, edf0Var7.a, (j2e0) null);
                }
                for (edf0 edf0Var8 : ddf0Var3.h) {
                    cdf0Var.a(edf0Var8.b, edf0Var8.a, (j2e0) null);
                }
                for (edf0 edf0Var9 : ddf0Var3.i) {
                    cdf0Var.a(edf0Var9.b, edf0Var9.a, (j2e0) null);
                }
                for (edf0 edf0Var10 : ddf0Var3.j) {
                    cdf0Var.a(edf0Var10.b, edf0Var10.a, (j2e0) null);
                }
            }
            if (ddf0Var2 != null) {
                for (edf0 edf0Var11 : ddf0Var2.a) {
                    cdf0Var.a(edf0Var11.b, edf0Var11.a, new t9v(edf0Var11.c, (byte) 1));
                }
                for (edf0 edf0Var12 : ddf0Var2.b) {
                    cdf0Var.a(edf0Var12.b, edf0Var12.a, new t9v(edf0Var12.c, (byte) 1));
                }
                for (edf0 edf0Var13 : ddf0Var2.c) {
                    cdf0Var.a(edf0Var13.b, edf0Var13.a, new t9v(edf0Var13.c, (byte) 1));
                }
                for (edf0 edf0Var14 : ddf0Var2.d) {
                    cdf0Var.a(edf0Var14.b, edf0Var14.a, new t9v(edf0Var14.c, (byte) 1));
                }
                for (edf0 edf0Var15 : ddf0Var2.e) {
                    cdf0Var.a(edf0Var15.b, edf0Var15.a, new t9v(edf0Var15.c, (byte) 1));
                }
                for (edf0 edf0Var16 : ddf0Var2.f) {
                    cdf0Var.a(edf0Var16.b, edf0Var16.a, new t9v(edf0Var16.c, (byte) 1));
                }
                for (edf0 edf0Var17 : ddf0Var2.g) {
                    cdf0Var.a(edf0Var17.b, edf0Var17.a, new t9v(edf0Var17.c, (byte) 1));
                }
                for (edf0 edf0Var18 : ddf0Var2.h) {
                    cdf0Var.a(edf0Var18.b, edf0Var18.a, new t9v(edf0Var18.c, (byte) 1));
                }
                for (edf0 edf0Var19 : ddf0Var2.i) {
                    cdf0Var.a(edf0Var19.b, edf0Var19.a, new t9v(edf0Var19.c, (byte) 1));
                }
                for (edf0 edf0Var20 : ddf0Var2.j) {
                    cdf0Var.a(edf0Var20.b, edf0Var20.a, new t9v(edf0Var20.c, (byte) 1));
                }
            }
            ven0Var.setValue(ddf0Var2);
        }
        boolean z3 = cdf0Var.R0;
        boolean z4 = this.Z;
        if (z3 != z4) {
            cdf0Var.R0 = z4;
            i4k i4kVar = cdf0Var.O0;
            if (i4kVar != null) {
                i4kVar.q(z4);
            }
        }
        cdf0Var.S0 = this.N0;
        cdf0Var.Z = this.O0;
        boolean z5 = cdf0Var.N0;
        boolean z6 = this.P0;
        if (z6 != z5) {
            cdf0Var.N0 = z6;
            i4k i4kVar2 = cdf0Var.O0;
            if (i4kVar2 != null) {
                i4kVar2.I = z6;
            }
            cdf0Var.invalidateSelf();
        }
        boolean z7 = cdf0Var.T0;
        boolean z8 = this.Q0;
        if (z8 != z7) {
            cdf0Var.T0 = z8;
            cdf0Var.invalidateSelf();
        }
        cdf0Var.v(((Number) this.R0.invoke()).floatValue());
        cdf0Var.setBounds(0, 0, rect.width(), rect.height());
        Canvas canvas = v84.a;
        Canvas canvas2 = u84VarP.a;
        Runnable runnable = cdf0Var.n1;
        ThreadPoolExecutor threadPoolExecutor = cdf0.s1;
        sdf0 sdf0Var = cdf0Var.b;
        Semaphore semaphore = cdf0Var.k1;
        i4k i4kVar3 = cdf0Var.O0;
        fcf0 fcf0Var = cdf0Var.a;
        if (i4kVar3 != null && fcf0Var != null) {
            jj7 jj7Var = cdf0Var.j1;
            if (jj7Var == null) {
                jj7Var = jj7.a;
            }
            boolean z9 = jj7Var == jj7.b;
            if (z9) {
                try {
                    semaphore.acquire();
                    if (cdf0Var.y()) {
                        cdf0Var.v(sdf0Var.j());
                    }
                } catch (InterruptedException unused) {
                    if (z9) {
                        semaphore.release();
                        if (i4kVar3.H != sdf0Var.j()) {
                        }
                    }
                    return rih1.a;
                } catch (Throwable th) {
                    if (z9) {
                        semaphore.release();
                        if (i4kVar3.H != sdf0Var.j()) {
                            threadPoolExecutor.execute(runnable);
                        }
                    }
                    throw th;
                }
            }
            if (cdf0Var.V0) {
                canvas2.save();
                canvas2.concat(matrix);
                cdf0Var.l(canvas2, i4kVar3);
                canvas2.restore();
            } else {
                i4kVar3.f(canvas2, matrix, cdf0Var.P0);
            }
            cdf0Var.i1 = false;
            if (z9) {
                semaphore.release();
                if (i4kVar3.H != sdf0Var.j()) {
                    threadPoolExecutor.execute(runnable);
                }
            }
        }
        return rih1.a;
    }
}
