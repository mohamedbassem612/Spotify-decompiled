package p;

import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class y9c extends jmr0 {
    public final mic0 f;
    public float g = 1.0f;
    public ColorFilter h;

    public y9c(mic0 mic0Var) {
        this.f = mic0Var;
    }

    public final boolean a(float f) {
        this.g = f;
        return true;
    }

    public final boolean c(ColorFilter colorFilter) {
        this.h = colorFilter;
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof y9c) {
            return this.f.equals(((y9c) obj).f);
        }
        return false;
    }

    public final int hashCode() {
        return this.f.hashCode();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0039  */
    public final long i() {
        float fAbs;
        mic0 mic0Var = this.f;
        long j = mic0Var.g;
        long j2 = mic0Var.f;
        int i = (int) (j2 >> 32);
        float fAbs2 = Float.NaN;
        if (Math.abs(Float.intBitsToFloat(i)) <= Float.MAX_VALUE) {
            int i2 = (int) (j >> 32);
            if (Math.abs(Float.intBitsToFloat(i2)) <= Float.MAX_VALUE) {
                fAbs = Math.abs(Float.intBitsToFloat(i) - Float.intBitsToFloat(i2));
            } else {
                fAbs = Float.NaN;
            }
        } else {
            fAbs = Float.NaN;
        }
        int i3 = (int) (j2 & 4294967295L);
        if (Math.abs(Float.intBitsToFloat(i3)) <= Float.MAX_VALUE) {
            int i4 = (int) (j & 4294967295L);
            if (Math.abs(Float.intBitsToFloat(i4)) <= Float.MAX_VALUE) {
                fAbs2 = Math.abs(Float.intBitsToFloat(i3) - Float.intBitsToFloat(i4));
            }
        }
        return (((long) Float.floatToRawIntBits(fAbs)) << 32) | (((long) Float.floatToRawIntBits(fAbs2)) & 4294967295L);
    }

    public final void j(DrawScope drawScope) {
        DrawScope.S0(drawScope, this.f, 0L, 0L, this.g, (DrawStyle) null, this.h, 0, 86);
    }

    public final String toString() {
        return "BrushPainter(brush=" + this.f + ")";
    }
}
