package p;

import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class a6w extends hab0 implements xu30 {
    public final /* synthetic */ af5 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ lee1 c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;
    public final /* synthetic */ Function0 f;
    public final /* synthetic */ yae1 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a6w(af5 af5Var, String str, lee1 lee1Var, long j, long j2, Function0 function0, yae1 yae1Var) {
        super(3);
        this.a = af5Var;
        this.b = str;
        this.c = lee1Var;
        this.d = j;
        this.e = j2;
        this.f = function0;
        this.g = yae1Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ((Number) obj3).intValue();
        x340 x340Var = (b0k) obj2;
        int iX0 = (int) ((wat) x340Var.k(t4k.h)).X0(((i2c) obj).d());
        boolean zG = x340Var.g(this.a) | x340Var.e(iX0) | x340Var.g(this.b);
        Object objT = x340Var.T();
        lee1 lee1Var = this.c;
        if (zG || objT == fkj0.X) {
            zma1 zma1Var = new zma1(this.d, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65534);
            long j = this.e;
            objT = eqn1.q(this.a, zma1Var, new zma1(j, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65534), new zma1(u7h.b(j, 0.7f, 0.0f, 0.0f, 0.0f, 14), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65534), this.b, this.f, this.g, lee1Var, iX0);
            lee1Var = lee1Var;
            x340Var.s0(objT);
        }
        uwo1.f((af5) objT, null, lee1Var, null, null, null, 0, false, null, 0, null, null, x340Var, 0, 0, 4090);
        return rih1.a;
    }
}
