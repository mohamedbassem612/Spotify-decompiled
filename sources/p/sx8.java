package p;

import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.TextUnit;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class sx8 implements m0e1 {
    public final long a;
    public final long b;
    public final long c;
    public final lee1 d;
    public final f930 e;
    public final byte f;

    /* JADX WARN: Multi-variable type inference failed */
    public sx8(long j, long j2, long j3, lee1 lee1Var, f930 f930Var, int i) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = lee1Var;
        this.e = f930Var;
        this.f = i;
        long j4 = TextUnit.c;
        if (TextUnit.a(j, j4)) {
            throw new IllegalArgumentException(String.format("AutoSize.StepBased: TextUnit.Unspecified is not a valid value for %s. Try using other values e.g. %s.sp", Arrays.copyOf(new Object[]{"minFontSize", "10"}, 2)).toString());
        }
        if (TextUnit.a(j2, j4)) {
            throw new IllegalArgumentException(String.format("AutoSize.StepBased: TextUnit.Unspecified is not a valid value for %s. Try using other values e.g. %s.sp", Arrays.copyOf(new Object[]{"maxFontSize", "100"}, 2)).toString());
        }
        if (TextUnit.a(j3, j4)) {
            throw new IllegalArgumentException(String.format("AutoSize.StepBased: TextUnit.Unspecified is not a valid value for %s. Try using other values e.g. %s.sp", Arrays.copyOf(new Object[]{"stepSize", "0,25"}, 2)).toString());
        }
        if (wee1.a(TextUnit.b(j3), 4294967296L)) {
            long jY = fc11.Y(1.0E-4f, 4294967296L);
            fc11.p(j3, jY);
            if (Float.compare(TextUnit.c(j3), TextUnit.c(jY)) >= 0) {
                if (wee1.a(TextUnit.b(j), TextUnit.b(j2))) {
                    fc11.p(j, j2);
                    if (Float.compare(TextUnit.c(j), TextUnit.c(j2)) > 0) {
                        this.a = j2;
                        j = j2;
                    }
                }
                if (TextUnit.c(j) < 0.0f) {
                    hhg1.n("AutoSize.StepBased: minFontSize must not be negative");
                    throw null;
                }
                if (TextUnit.c(j2) >= 0.0f) {
                    return;
                }
                hhg1.n("AutoSize.StepBased: maxFontSize must not be negative");
                throw null;
            }
        }
        hhg1.f("AutoSize.StepBased: stepSize must be greater than or equal to 0.0001f.sp, was ".concat(TextUnit.f(j3)));
        throw null;
    }

    public final long a(bsm0 bsm0Var, long j, af5 af5Var) {
        float fQ0 = bsm0Var.q0(this.c);
        float fQ1 = bsm0Var.q0(this.a);
        float fQ2 = bsm0Var.q0(this.b);
        float f = (fQ1 + fQ2) / 2.0f;
        float f2 = fQ1;
        float f3 = fQ2;
        while (f3 - f2 >= fQ0) {
            if (b(bsm0Var, af5Var, lee1.a(this.d, 0L, bsm0Var.L(f), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16777213), j)) {
                f3 = f;
            } else {
                f2 = f;
            }
            f = (f2 + f3) / 2.0f;
        }
        float fFloor = fQ1 + (((float) Math.floor((f2 - fQ1) / fQ0)) * fQ0);
        float f4 = fQ0 + fFloor;
        if (f4 <= fQ2) {
            if (!b(bsm0Var, af5Var, lee1.a(this.d, 0L, bsm0Var.L(f4), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16777213), j)) {
                fFloor = f4;
            }
        }
        return bsm0Var.L(fFloor);
    }

    public final boolean b(bsm0 bsm0Var, af5 af5Var, lee1 lee1Var, long j) {
        zrm0 zrm0Var = new zrm0(new wp20((List) z6x.a, af5Var, (wat) j2h1.c(bsm0Var.h()), this.e, lee1Var, true), j, this.f, 1);
        return zrm0Var.c || zrm0Var.i(0);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof sx8)) {
            return false;
        }
        sx8 sx8Var = (sx8) obj;
        return TextUnit.a(sx8Var.a, this.a) && TextUnit.a(sx8Var.b, this.b) && TextUnit.a(sx8Var.c, this.c) && u890.j(sx8Var.d, this.d) && u890.j(sx8Var.e, this.e);
    }

    public final int hashCode() {
        wee1[] wee1VarArr = TextUnit.b;
        return this.e.hashCode() + p3d1.h(this.d, cy30.f(cy30.f(Long.hashCode(this.a) * 31, this.b, 31), this.c, 31), 31);
    }
}
