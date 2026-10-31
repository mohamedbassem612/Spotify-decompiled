package p;

import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.TextUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class bsm0 implements wat {
    public y9e1 a;
    public final /* synthetic */ csm0 b;

    public bsm0(csm0 csm0Var) {
        this.b = csm0Var;
    }

    public final float U0() {
        wat watVar = this.b.k;
        watVar.getClass();
        return watVar.U0();
    }

    public final y9e1 a() {
        return this.a;
    }

    public final y9e1 b(long j, long j2) {
        long jH;
        csm0 csm0Var = this.b;
        lee1 lee1Var = csm0Var.l;
        long jB = TextUnit.d(j2) ? dsm0.b(csm0Var.l.a.b, j2) : j2;
        if (!TextUnit.a(jB, csm0Var.l.a.b)) {
            csm0Var.f(lee1.a(csm0Var.l, 0L, jB, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16777213));
        }
        if (csm0Var.f > 1) {
            flb0 flb0Var = csm0Var.n;
            flb0Var.getClass();
            jH = csm0Var.h(j, flb0Var);
        } else {
            jH = j;
        }
        flb0 flb0Var2 = csm0Var.n;
        flb0Var2.getClass();
        zrm0 zrm0VarB = csm0Var.b(jH, flb0Var2);
        flb0 flb0Var3 = csm0Var.n;
        flb0Var3.getClass();
        y9e1 y9e1VarG = csm0Var.g(flb0Var3, jH, zrm0VarB);
        this.a = y9e1VarG;
        csm0Var.f(lee1Var);
        return y9e1VarG;
    }

    public final float h() {
        wat watVar = this.b.k;
        watVar.getClass();
        return watVar.h();
    }

    public final float q0(long j) {
        if (!TextUnit.d(j)) {
            return h() * y(j);
        }
        csm0 csm0Var = this.b;
        if (TextUnit.d(csm0Var.l.a.b)) {
            eg.m("InternalAutoSize -> toPx(): Cannot convert Em to Px when style.fontSize is Em\nDeclare the composable's style.fontSize with Sp units instead.");
            return 0.0f;
        }
        if (TextUnit.a(csm0Var.l.a.b, TextUnit.c)) {
            eg.m("InternalAutoSize -> toPx(): Cannot convert Em to Px when style.fontSize is not set. Please specify a font size.");
            return 0.0f;
        }
        return TextUnit.c(j) * q0(csm0Var.l.a.b);
    }
}
