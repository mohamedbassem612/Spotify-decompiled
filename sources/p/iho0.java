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
public final class iho0 extends hab0 implements xu30 {
    public final /* synthetic */ Function0 X;
    public final /* synthetic */ yae1 Y;
    public final /* synthetic */ xho0 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ lee1 c;
    public final /* synthetic */ cqs0 d;
    public final /* synthetic */ s2o e;
    public final /* synthetic */ long f;
    public final /* synthetic */ cvm g;
    public final /* synthetic */ Function0 h;
    public final /* synthetic */ long i;
    public final /* synthetic */ String t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iho0(xho0 xho0Var, String str, lee1 lee1Var, cqs0 cqs0Var, s2o s2oVar, long j, cvm cvmVar, Function0 function0, long j2, String str2, Function0 function1, yae1 yae1Var) {
        super(3);
        this.a = xho0Var;
        this.b = str;
        this.c = lee1Var;
        this.d = cqs0Var;
        this.e = s2oVar;
        this.f = j;
        this.g = cvmVar;
        this.h = function0;
        this.i = j2;
        this.t = str2;
        this.X = function1;
        this.Y = yae1Var;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x015e  */
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j;
        int iO;
        ((Number) obj3).intValue();
        Object obj4 = fkj0.X;
        x340 x340Var = (b0k) obj2;
        int iX0 = (int) ((wat) x340Var.k(t4k.h)).X0(((i2c) obj).d());
        x340Var.i0(1420556666);
        String str = this.a.c;
        ye5 ye5Var = new ye5();
        String str2 = this.e.a;
        x340Var.i0(288031274);
        StringBuilder sb = ye5Var.a;
        int length = sb.length();
        z6p1.r(ye5Var, "avatar", "[avatar]");
        ye5Var.g("\u2005");
        long j2 = this.f;
        if (str2 != null) {
            int iO2 = ye5Var.o(new zma1(j2, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65534));
            try {
                ye5Var.g("\u2066" + str2 + "\u2069");
                ye5Var.k(iO2);
            } catch (Throwable th) {
                ye5Var.k(iO2);
                throw th;
            }
        }
        cvm cvmVar = cvm.b;
        cvm cvmVar2 = this.g;
        if (cvmVar2 == cvmVar) {
            ye5Var.g("\u2005");
            z6p1.r(ye5Var, "badge", "[badge]");
        }
        int length2 = sb.length();
        Function0 function0 = this.h;
        if (function0 != null) {
            x340Var.i0(288469366);
            pae1 pae1Var = new pae1(new zma1(j2, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65534), (zma1) null, 14);
            boolean zG = x340Var.g(function0);
            Object objT = x340Var.T();
            if (zG || objT == obj4) {
                objT = new nbg(function0, (byte) 4);
                x340Var.s0(objT);
            }
            ye5Var.a(new kjc0("author", pae1Var, (rjc0) objT), length, length2);
            x340Var.r(false);
        } else {
            x340Var.i0(288782652);
            x340Var.r(false);
        }
        int iOrdinal = cvmVar2.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    eg.o();
                    return null;
                }
                if (str != null) {
                    j = j2;
                    iO = ye5Var.o(new zma1(j, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65534));
                    ye5Var.g(" • ");
                    ye5Var.k(iO);
                }
            } else if (str != null) {
                z6p1.r(ye5Var, "editor_timestamp_spacer", " ");
            }
            j = j2;
        } else if (str != null) {
            j = j2;
            iO = ye5Var.o(new zma1(j, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65534));
            try {
                ye5Var.g(" • ");
                ye5Var.k(iO);
            } catch (Throwable th2) {
                ye5Var.k(iO);
                throw th2;
            }
        } else {
            j = j2;
        }
        if (str != null) {
            int iO3 = ye5Var.o(new zma1(j, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65534));
            try {
                ye5Var.g("\u2066" + str + "\u2069");
                ye5Var.k(iO3);
            } catch (Throwable th3) {
                ye5Var.k(iO3);
                throw th3;
            }
        }
        long j3 = this.i;
        int iO4 = ye5Var.o(new zma1(j3, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65534));
        try {
            ye5Var.g(" • ");
            ye5Var.k(iO4);
            x340Var.r(false);
            x340Var.i0(289801467);
            x340Var.r(false);
            int iO5 = ye5Var.o(new zma1(j3, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65534));
            try {
                ye5Var.g("\u2066");
                String str3 = this.t;
                if (cvmVar2 == cvmVar) {
                    zg90.a(ye5Var, str3);
                } else {
                    ye5Var.g(str3);
                }
                ye5Var.g("\u2069");
                ye5Var.k(iO5);
                af5 af5VarP = ye5Var.p();
                x340Var.r(false);
                x340Var.i0(1089598688);
                boolean zG2 = x340Var.g(af5VarP) | x340Var.e(iX0) | x340Var.g(this.b);
                Object objT2 = x340Var.T();
                lee1 lee1Var = this.c;
                if (zG2 || objT2 == obj4) {
                    zma1 zma1Var = new zma1(this.i, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65534);
                    long j4 = this.f;
                    objT2 = eqn1.q(af5VarP, zma1Var, new zma1(j4, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65534), new zma1(u7h.b(j4, 0.7f, 0.0f, 0.0f, 0.0f, 14), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65534), this.b, this.X, this.Y, lee1Var, iX0);
                    lee1Var = lee1Var;
                    x340Var.s0(objT2);
                }
                x340Var.r(false);
                uwo1.f((af5) objT2, null, lee1Var, null, null, null, 0, false, null, 0, null, this.d, x340Var, 0, 0, 2042);
                return rih1.a;
            } catch (Throwable th4) {
                ye5Var.k(iO5);
                throw th4;
            }
        } catch (Throwable th5) {
            ye5Var.k(iO4);
            throw th5;
        }
    }
}
