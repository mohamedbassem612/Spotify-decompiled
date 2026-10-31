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
import java.util.regex.Pattern;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class k9m extends hab0 implements iu30 {
    public final /* synthetic */ zma1 N0;
    public final /* synthetic */ iu30 X;
    public final /* synthetic */ ven0 Y;
    public final /* synthetic */ String Z;
    public final /* synthetic */ r8v a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ yae1 e;
    public final /* synthetic */ lee1 f;
    public final /* synthetic */ String g;
    public final /* synthetic */ long h;
    public final /* synthetic */ long i;
    public final /* synthetic */ iu30 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k9m(r8v r8vVar, Function0 function0, String str, String str2, yae1 yae1Var, lee1 lee1Var, String str3, long j, long j2, iu30 iu30Var, iu30 iu30Var2, ven0 ven0Var, String str4, zma1 zma1Var) {
        super(1);
        this.a = r8vVar;
        this.b = function0;
        this.c = str;
        this.d = str2;
        this.e = yae1Var;
        this.f = lee1Var;
        this.g = str3;
        this.h = j;
        this.i = j2;
        this.t = iu30Var;
        this.X = iu30Var2;
        this.Y = ven0Var;
        this.Z = str4;
        this.N0 = zma1Var;
    }

    public final Object invoke(Object obj) {
        Function0 function0;
        int iA0;
        y9e1 y9e1Var = (y9e1) obj;
        if (this.a != r8v.c) {
            boolean zD = y9e1Var.d();
            if (zD) {
                ven0 ven0Var = this.Y;
                if (((af5) ven0Var.getValue()) == null && (function0 = this.b) != null) {
                    long j = y9e1Var.c;
                    int i = (int) (j >> 32);
                    af5 af5Var = new af5("Xg");
                    int i2 = 0;
                    long jB = jjl.b(0, i, 0, 0, 13);
                    yae1 yae1Var = this.e;
                    lee1 lee1Var = this.f;
                    int i3 = (int) (yae1.b(yae1Var, af5Var, lee1Var, 0, false, 0, jB, (flb0) null, (wat) null, (f930) null, 1980).c & 4294967295L);
                    int i4 = ((int) (j & 4294967295L)) - i3;
                    if (i4 >= i3) {
                        i3 = i4;
                    }
                    String str = this.c;
                    int length = str.length();
                    int i5 = 0;
                    String str2 = "";
                    while (i5 <= length) {
                        int i6 = (i5 + length) / 2;
                        String strSubstring = str.substring(i2, i6);
                        i3 = i3;
                        if (((int) (yae1.b(yae1Var, new af5(Pattern.compile("\\[([^]]+)]\\(([^)]+)\\)").matcher(nhc1.W(strSubstring, "*", "")).replaceAll("$1").concat(this.d)), lee1Var, 0, false, 0, jjl.b(0, i, 0, 0, 13), (flb0) null, (wat) null, (f930) null, 1980).c & 4294967295L)) <= i3) {
                            i5 = i6 + 1;
                            str2 = strSubstring;
                        } else {
                            length = i6 - 1;
                        }
                        i2 = 0;
                    }
                    String string = ihc1.f1(str2).toString();
                    if (string.length() > 20 && (iA0 = ihc1.A0(string, ' ', 0, 6)) > 0) {
                        string = string.substring(0, iA0);
                    }
                    String str3 = string;
                    String str4 = this.g;
                    af5 af5VarN = str4 != null ? irn1.N(" ".concat(str4), this.h, this.i, this.t) : null;
                    af5 af5VarN2 = irn1.N(str3, this.h, this.i, this.t);
                    ye5 ye5Var = new ye5();
                    ye5Var.h(af5VarN2);
                    if (af5VarN != null) {
                        ye5Var.h(af5VarN);
                    }
                    int iO = ye5Var.o(new zma1(this.i, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65534));
                    try {
                        ye5Var.g("… ");
                        ye5Var.k(iO);
                        vhg.a(ye5Var, this.Z, "SEE_MORE", this.N0, new vj0(function0, (byte) 25));
                        ven0Var.setValue(ye5Var.p());
                    } catch (Throwable th) {
                        ye5Var.k(iO);
                        throw th;
                    }
                }
            }
            this.X.invoke(new b9m(zD));
        }
        return rih1.a;
    }
}
