package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.ColorFilter;
import com.spotify.contentdelivery.mediaprocessing.NativeMediaProcessor;
import p.be50;
import p.cab;
import p.flb0;
import p.hrt;
import p.iu30;
import p.phc1;
import p.u8s0;
import p.uw4;
import p.wat;
import p.wrs;
import p.yk4;
import p.z520;
import p.zno1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public interface DrawScope extends wat {
    static void G(DrawScope drawScope, yk4 yk4Var, long j, long j2, long j3, long j4, float f, ColorFilter colorFilter, int i, int i2) {
        long width;
        long j5 = (i2 & 2) != 0 ? 0L : j;
        if ((i2 & 4) != 0) {
            width = (((long) yk4Var.a.getWidth()) << 32) | (((long) yk4Var.a.getHeight()) & 4294967295L);
        } else {
            width = j2;
        }
        drawScope.Z(yk4Var, j5, width, (i2 & 8) == 0 ? j3 : 0L, (i2 & 16) != 0 ? width : j4, (i2 & 32) != 0 ? 1.0f : f, (i2 & 128) != 0 ? null : colorFilter, (i2 & 256) != 0 ? 3 : 5, (i2 & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) != 0 ? 1 : i);
    }

    static long R0(long j, long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (j2 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (j2 & 4294967295L));
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
    }

    static /* synthetic */ void S0(DrawScope drawScope, Brush brush, long j, long j2, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2) {
        if ((i2 & 2) != 0) {
            j = 0;
        }
        long j3 = j;
        drawScope.C0(brush, j3, (i2 & 4) != 0 ? R0(drawScope.j(), j3) : j2, (i2 & 8) != 0 ? 1.0f : f, (i2 & 16) != 0 ? z520.a : drawStyle, (i2 & 32) != 0 ? null : colorFilter, (i2 & 64) != 0 ? 3 : i);
    }

    static /* synthetic */ void b0(DrawScope drawScope, long j, float f, long j2, float f2, DrawStyle drawStyle, int i) {
        if ((i & 2) != 0) {
            f = hrt.f(drawScope, 2.0f);
        }
        float f3 = f;
        if ((i & 4) != 0) {
            j2 = drawScope.g1();
        }
        drawScope.u0(j, f3, j2, (i & 8) != 0 ? 1.0f : f2, (i & 16) != 0 ? z520.a : drawStyle, (i & 64) != 0 ? 3 : 0);
    }

    static /* synthetic */ void c0(DrawScope drawScope, Brush brush, long j, long j2, long j3, float f, DrawStyle drawStyle, int i) {
        if ((i & 2) != 0) {
            j = 0;
        }
        if ((i & 4) != 0) {
            j2 = R0(drawScope.j(), j);
        }
        if ((i & 8) != 0) {
            j3 = 0;
        }
        if ((i & 16) != 0) {
            f = 1.0f;
        }
        if ((i & 32) != 0) {
            drawStyle = z520.a;
        }
        drawScope.m0(brush, j, j2, j3, f, drawStyle, (i & 128) != 0 ? 3 : 24);
    }

    static /* synthetic */ void d0(DrawScope drawScope, long j, long j2, long j3, float f, phc1 phc1Var, ColorFilter colorFilter, int i) {
        long j4 = (i & 2) != 0 ? 0L : j2;
        drawScope.F0(j, j4, (i & 4) != 0 ? R0(drawScope.j(), j4) : j3, (i & 8) != 0 ? 1.0f : f, (i & 16) != 0 ? z520.a : phc1Var, (i & 32) != 0 ? null : colorFilter, (i & 64) != 0 ? 3 : 0);
    }

    static /* synthetic */ void g0(DrawScope drawScope, long j, long j2, long j3, long j4, DrawStyle drawStyle, float f, int i, int i2) {
        long j5 = (i2 & 2) != 0 ? 0L : j2;
        drawScope.F(j, j5, (i2 & 4) != 0 ? R0(drawScope.j(), j5) : j3, j4, (i2 & 16) != 0 ? z520.a : drawStyle, (i2 & 32) != 0 ? 1.0f : f, (i2 & 128) != 0 ? 3 : i);
    }

    static /* synthetic */ void i1(DrawScope drawScope, long j, float f, float f2, long j2, long j3, DrawStyle drawStyle, int i) {
        long j4 = (i & 16) != 0 ? 0L : j2;
        drawScope.o1(j, f, f2, j4, (i & 32) != 0 ? R0(drawScope.j(), j4) : j3, drawStyle);
    }

    static /* synthetic */ void j1(DrawScope drawScope, u8s0 u8s0Var, Brush brush, float f, DrawStyle drawStyle, int i) {
        if ((i & 4) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        if ((i & 8) != 0) {
            drawStyle = z520.a;
        }
        drawScope.n0(u8s0Var, brush, f2, drawStyle, (i & 32) != 0 ? 3 : 0);
    }

    static /* synthetic */ void m(DrawScope drawScope, yk4 yk4Var, long j, float f, ColorFilter colorFilter, int i, int i2) {
        if ((i2 & 2) != 0) {
            j = 0;
        }
        long j2 = j;
        if ((i2 & 4) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        if ((i2 & 32) != 0) {
            i = 3;
        }
        drawScope.D(yk4Var, j2, f2, colorFilter, i);
    }

    static /* synthetic */ void o(DrawScope drawScope, Brush brush, float f, long j, float f2, phc1 phc1Var, int i) {
        if ((i & 4) != 0) {
            j = drawScope.g1();
        }
        long j2 = j;
        if ((i & 8) != 0) {
            f2 = 1.0f;
        }
        float f3 = f2;
        if ((i & 16) != 0) {
            phc1Var = z520.a;
        }
        drawScope.N(brush, f, j2, f3, phc1Var);
    }

    static /* synthetic */ void v(DrawScope drawScope, long j, long j2, long j3, int i) {
        if ((i & 2) != 0) {
            j2 = 0;
        }
        long j4 = j2;
        if ((i & 4) != 0) {
            j3 = R0(drawScope.j(), j4);
        }
        drawScope.H0(j, j4, j3);
    }

    static /* synthetic */ void w0(DrawScope drawScope, u8s0 u8s0Var, long j, DrawStyle drawStyle, int i) {
        float f = (i & 4) != 0 ? 1.0f : 0.78f;
        if ((i & 8) != 0) {
            drawStyle = z520.a;
        }
        drawScope.j0(u8s0Var, j, f, drawStyle, 3);
    }

    void C0(Brush brush, long j, long j2, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i);

    void D(yk4 yk4Var, long j, float f, ColorFilter colorFilter, int i);

    void F(long j, long j2, long j3, long j4, DrawStyle drawStyle, float f, int i);

    void F0(long j, long j2, long j3, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i);

    void H0(long j, long j2, long j3);

    void N(Brush brush, float f, long j, float f2, DrawStyle drawStyle);

    default void V(long j, iu30 iu30Var, be50 be50Var) {
        be50Var.f(this, getLayoutDirection(), j, new wrs(this, iu30Var, (byte) 18));
    }

    void Z(yk4 yk4Var, long j, long j2, long j3, long j4, float f, ColorFilter colorFilter, int i, int i2);

    cab a1();

    void e1(long j, long j2, long j3, float f, int i, uw4 uw4Var);

    default long g1() {
        return zno1.o(a1().u());
    }

    flb0 getLayoutDirection();

    default long j() {
        return a1().u();
    }

    void j0(u8s0 u8s0Var, long j, float f, DrawStyle drawStyle, int i);

    void m0(Brush brush, long j, long j2, long j3, float f, DrawStyle drawStyle, int i);

    void n0(u8s0 u8s0Var, Brush brush, float f, DrawStyle drawStyle, int i);

    void o1(long j, float f, float f2, long j2, long j3, DrawStyle drawStyle);

    void p1(Brush brush, long j, long j2, float f, float f2);

    void u0(long j, float f, long j2, float f2, DrawStyle drawStyle, int i);
}
