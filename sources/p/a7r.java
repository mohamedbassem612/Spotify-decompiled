package p;

import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class a7r extends hab0 implements vu30 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ n811 d;
    public final /* synthetic */ n811 e;
    public final /* synthetic */ qim0 f;
    public final /* synthetic */ l811 g;
    public final /* synthetic */ Function0 h;
    public final /* synthetic */ int i;
    public final /* synthetic */ l811 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a7r(boolean z, boolean z2, boolean z3, n811 n811Var, n811 n811Var2, qim0 qim0Var, l811 l811Var, Function0 function0, int i, l811 l811Var2) {
        super(2);
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = n811Var;
        this.e = n811Var2;
        this.f = qim0Var;
        this.g = l811Var;
        this.h = function0;
        this.i = i;
        this.t = l811Var2;
    }

    public final Object invoke(Object obj, Object obj2) {
        long jB;
        long j;
        long j2;
        uwr uwrVar = cbx.a;
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            boolean z = this.a;
            if (z && this.b) {
                x340Var2.i0(-2091599403);
                jB = cbx.a(x340Var2).b.a;
                x340Var2.r(false);
            } else if (z) {
                x340Var2.i0(1595101748);
                jB = u7h.b(cbx.a(x340Var2).b.a, 0.3f, 0.0f, 0.0f, 0.0f, 14);
                x340Var2.r(false);
            } else {
                x340Var2.i0(-2091529870);
                jB = cbx.a(x340Var2).b.b;
                x340Var2.r(false);
            }
            long j3 = jB;
            p811 p811Var = new p811();
            lee1 lee1Var = cbx.d(x340Var2).h;
            p811Var.a = lee1Var;
            if (this.c) {
                p811Var.a = lee1.a(lee1Var, 0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, TextDecoration.c, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16773119);
            }
            int i = this.d.a;
            int i2 = this.e.a;
            cr31 cr31Var = er31.a;
            cr31 cr31Var2 = new cr31(nko1.e(i), nko1.e(i2), nko1.e(i2), nko1.e(i));
            int i3 = this.i;
            l811 l811Var = this.g;
            qim0 qim0VarB = s161.b(this.f, true, new ym(i3, l811Var, (byte) 12));
            if (l811Var.a) {
                x340Var2.i0(1595123598);
                j = cbx.a(x340Var2).c.c;
                x340Var2.r(false);
            } else {
                x340Var2.i0(1595125446);
                j = cbx.a(x340Var2).c.a;
                x340Var2.r(false);
            }
            qim0 qim0VarA = py20.a(qim0VarB, j, cr31Var2, x340Var2, 0, 12);
            if (l811Var.a) {
                x340Var2.i0(1595131239);
                j2 = cbx.a(x340Var2).a.e;
                x340Var2.r(false);
            } else {
                x340Var2.i0(1595131789);
                x340Var2.r(false);
                j2 = u7h.j;
            }
            w3d1.b(this.h, qim0VarA, this.b, cr31Var2, j2, 0L, 0.0f, 0.0f, (idn0) null, apo.r(1611788781, new je3(this.t, this.i, p811Var, j3), x340Var2), x340Var2, 0, 992);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
