package p;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
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
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class oq51 {
    public final Context a;

    public oq51(Context context) {
        this.a = context;
    }

    public static af5 b(c380 c380Var, ai4 ai4Var, b0k b0kVar) {
        x340 x340Var;
        int i;
        zma1 zma1Var;
        zma1 zma1Var2;
        uwr uwrVar = cbx.a;
        long j = cbx.a(b0kVar).b.a;
        long j2 = cbx.a(b0kVar).b.b;
        long j3 = ((gmt) zex.a.c).i().t;
        FontFamily fontFamily = cbx.d(b0kVar).h.a.f;
        x340 x340Var2 = (x340) b0kVar;
        boolean zG = ((x340) b0kVar).g(c380Var) | ((x340) b0kVar).e(ai4Var.ordinal()) | x340Var2.f(j) | x340Var2.f(j2) | x340Var2.f(j3) | x340Var2.g(fontFamily);
        Object objT = x340Var2.T();
        if (zG || objT == fkj0.X) {
            int iOrdinal = ai4Var.ordinal();
            if (iOrdinal == 0) {
                x340Var = x340Var2;
                i = 1;
                zma1Var = new zma1(j3, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65534);
            } else if (iOrdinal == 1) {
                i = 1;
                x340Var = x340Var2;
                zma1Var = new zma1(j, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, fontFamily, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65502);
            } else {
                if (iOrdinal != 2) {
                    eg.o();
                    return null;
                }
                i = 1;
                x340Var = x340Var2;
                zma1Var = new zma1(j2, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65534);
            }
            int iOrdinal2 = ai4Var.ordinal();
            if (iOrdinal2 == 0) {
                zma1Var2 = new zma1(j, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65534);
            } else if (iOrdinal2 != i) {
                if (iOrdinal2 != 2) {
                    eg.o();
                    return null;
                }
                zma1Var2 = new zma1(j, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65534);
            } else {
                zma1Var2 = new zma1(j2, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65534);
            }
            ye5 ye5Var = new ye5();
            Iterator<E> it = c380Var.iterator();
            while (it.hasNext()) {
                gp51 gp51Var = (gp51) it.next();
                int iO = ye5Var.o(gp51Var.a() ? zma1Var : zma1Var2);
                try {
                    ye5Var.g(gp51Var.getText());
                    ye5Var.k(iO);
                } catch (Throwable th) {
                    ye5Var.k(iO);
                    throw th;
                }
            }
            objT = ye5Var.p();
            x340Var.s0(objT);
        }
        return (af5) objT;
    }

    public final SpannedString a(List list, boolean z, ai4 ai4Var) {
        nq51 nq51Var;
        int size = list.size();
        Context context = this.a;
        if (size == 1 && !((gp51) o7h.q0(list)).a()) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append(((gp51) o7h.q0(list)).getText(), new l0e1(context, 2132017508), 33);
            return new SpannedString(spannableStringBuilder);
        }
        int iOrdinal = ai4Var.ordinal();
        if (iOrdinal == 0) {
            nq51Var = new nq51(2132017478, 2132017479);
        } else if (iOrdinal == 1) {
            nq51Var = new nq51(2132017460, 2132017461);
        } else {
            if (iOrdinal != 2) {
                eg.o();
                return null;
            }
            nq51Var = new nq51(2132017506, 2132017508);
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            gp51 gp51Var = (gp51) it.next();
            spannableStringBuilder2.append(gp51Var.getText(), new l0e1(context, z == gp51Var.a() ? nq51Var.a() : nq51Var.b()), 33);
        }
        return new SpannedString(spannableStringBuilder2);
    }
}
