package p;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import androidx.car.app.model.Alert;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class a5u implements lqc1 {
    public Object g;
    public static final String h = new String("FIXED_DIMENSION");
    public static final String i = new String("WRAP_DIMENSION");
    public static final String t = new String("SPREAD_DIMENSION");
    public static final String X = new String("PARENT_DIMENSION");
    public static final String Y = new String("PERCENT_DIMENSION");
    public static final String Z = new String("RATIO_DIMENSION");
    public int b = 0;
    public int c = Alert.DURATION_SHOW_INDEFINITELY;
    public float e = 1.0f;
    public int f = 0;
    public String d = null;
    public boolean a = false;

    public a5u(String str) {
        this.g = str;
    }

    public static void b(SpannableStringBuilder spannableStringBuilder, int i2, int i3, int i4, int i5, int i6) {
        if (i2 != i3) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i2 >>> 8) | ((i2 & 255) << 24)), i4, i5, i6 | 33);
        }
    }

    public static void c(SpannableStringBuilder spannableStringBuilder, int i2, int i3, int i4, int i5, int i6) {
        if (i2 != i3) {
            int i7 = i6 | 33;
            boolean z = (i2 & 1) != 0;
            boolean z2 = (i2 & 2) != 0;
            if (z) {
                if (z2) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i4, i5, i7);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i4, i5, i7);
                }
            } else if (z2) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i4, i5, i7);
            }
            boolean z3 = (i2 & 4) != 0;
            if (z3) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i4, i5, i7);
            }
            if (z3 || z || z2) {
                return;
            }
            spannableStringBuilder.setSpan(new StyleSpan(0), i4, i5, i7);
        }
    }

    public static a5u e(int i2) {
        a5u a5uVar = new a5u(h);
        a5uVar.g = null;
        a5uVar.f = i2;
        return a5uVar;
    }

    public static a5u f() {
        return new a5u(X);
    }

    public static a5u h(float f) {
        a5u a5uVar = new a5u(Y);
        a5uVar.e = f;
        return a5uVar;
    }

    public static a5u j(String str) {
        a5u a5uVar = new a5u(Z);
        a5uVar.d = str;
        return a5uVar;
    }

    public static a5u k(String str) {
        a5u a5uVar = new a5u();
        a5uVar.b = 0;
        a5uVar.c = Alert.DURATION_SHOW_INDEFINITELY;
        a5uVar.e = 1.0f;
        a5uVar.f = 0;
        a5uVar.d = null;
        a5uVar.g = i;
        a5uVar.a = false;
        a5uVar.r(str);
        return a5uVar;
    }

    public static a5u l() {
        return new a5u(i);
    }

    public void a(cjl cjlVar, int i2) {
        String str = this.d;
        if (str != null) {
            cjlVar.L(str);
        }
        boolean z = this.a;
        bjl bjlVar = bjl.a;
        bjl bjlVar2 = bjl.d;
        String str2 = X;
        bjl bjlVar3 = bjl.b;
        int i3 = 2;
        String str3 = Y;
        bjl bjlVar4 = bjl.c;
        String str4 = i;
        if (i2 == 0) {
            if (z) {
                cjlVar.P(bjlVar4);
                String str5 = (String) this.g;
                if (str5 == str4) {
                    i3 = 1;
                } else if (str5 != str3) {
                    i3 = 0;
                }
                cjlVar.Q(this.e, i3, this.b, this.c);
                return;
            }
            int i4 = this.b;
            if (i4 > 0) {
                if (i4 < 0) {
                    cjlVar.d0 = 0;
                } else {
                    cjlVar.d0 = i4;
                }
            }
            int i5 = this.c;
            if (i5 < Integer.MAX_VALUE) {
                cjlVar.D[0] = i5;
            }
            String str6 = (String) this.g;
            if (str6 == str4) {
                cjlVar.P(bjlVar3);
                return;
            }
            if (str6 == str2) {
                cjlVar.P(bjlVar2);
                return;
            } else {
                if (str6 == null) {
                    cjlVar.P(bjlVar);
                    cjlVar.T(this.f);
                    return;
                }
                return;
            }
        }
        if (z) {
            cjlVar.R(bjlVar4);
            String str7 = (String) this.g;
            if (str7 == str4) {
                i3 = 1;
            } else if (str7 != str3) {
                i3 = 0;
            }
            cjlVar.S(this.e, i3, this.b, this.c);
            return;
        }
        int i6 = this.b;
        if (i6 > 0) {
            if (i6 < 0) {
                cjlVar.e0 = 0;
            } else {
                cjlVar.e0 = i6;
            }
        }
        int i7 = this.c;
        if (i7 < Integer.MAX_VALUE) {
            cjlVar.D[1] = i7;
        }
        String str8 = (String) this.g;
        if (str8 == str4) {
            cjlVar.R(bjlVar3);
            return;
        }
        if (str8 == str2) {
            cjlVar.R(bjlVar2);
        } else if (str8 == null) {
            cjlVar.R(bjlVar);
            cjlVar.O(this.f);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void g(byte[] bArr, int i2, int i3, kqc1 kqc1Var, akl aklVar) {
        String strC;
        izr0 izr0Var = (izr0) this.g;
        izr0Var.P(bArr, i2 + i3);
        izr0Var.R(i2);
        int i4 = 1;
        int i5 = 0;
        dm5.m(izr0Var.a() >= 2);
        int iL = izr0Var.L();
        if (iL == 0) {
            strC = "";
        } else {
            int i6 = izr0Var.b;
            Charset charsetN = izr0Var.N();
            int i7 = iL - (izr0Var.b - i6);
            if (charsetN == null) {
                charsetN = StandardCharsets.UTF_8;
            }
            strC = izr0Var.C(i7, charsetN);
        }
        if (strC.isEmpty()) {
            w280 w280Var = b380.b;
            aklVar.accept(new bfo(-9223372036854775807L, -9223372036854775807L, bg11.e));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strC);
        c(spannableStringBuilder, this.b, 0, 0, spannableStringBuilder.length(), 16711680);
        b(spannableStringBuilder, this.c, -1, 0, spannableStringBuilder.length(), 16711680);
        String str = this.d;
        int length = spannableStringBuilder.length();
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length, 16711713);
        }
        float fI = this.e;
        while (izr0Var.a() >= 8) {
            int i8 = izr0Var.b;
            int iQ = izr0Var.q();
            int iQ2 = izr0Var.q();
            if (iQ2 == 1937013100) {
                dm5.m(izr0Var.a() >= 2 ? i4 : i5);
                int iL2 = izr0Var.L();
                int i9 = i5;
                while (i9 < iL2) {
                    dm5.m(izr0Var.a() >= 12 ? i4 : i5);
                    int iL3 = izr0Var.L();
                    int iL4 = izr0Var.L();
                    izr0Var.S(2);
                    int i10 = i9;
                    int iE = izr0Var.E();
                    izr0Var.S(i4);
                    int iQ3 = izr0Var.q();
                    if (iL4 > spannableStringBuilder.length()) {
                        StringBuilder sbR = cy30.r(iL4, "Truncating styl end (", ") to cueText.length() (");
                        sbR.append(spannableStringBuilder.length());
                        sbR.append(").");
                        oon1.H(sbR.toString());
                        iL4 = spannableStringBuilder.length();
                    }
                    if (iL3 >= iL4) {
                        oon1.H("Ignoring styl with start (" + iL3 + ") >= end (" + iL4 + ").");
                    } else {
                        int i11 = iL4;
                        c(spannableStringBuilder, iE, this.b, iL3, i11, 0);
                        b(spannableStringBuilder, iQ3, this.c, iL3, i11, 0);
                    }
                    i9 = i10 + 1;
                    i4 = 1;
                    i5 = 0;
                }
            } else if (iQ2 == 1952608120 && this.a) {
                dm5.m(izr0Var.a() >= 2);
                fI = zoi1.i(izr0Var.L() / this.f, 0.0f, 0.95f);
            }
            izr0Var.R(i8 + iQ);
            i4 = 1;
            i5 = 0;
        }
        aklVar.accept(new bfo(-9223372036854775807L, -9223372036854775807L, b380.t(new feo(spannableStringBuilder, null, null, null, fI, 0, 0, -3.4028235E38f, os00.INVALID_ID, os00.INVALID_ID, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, os00.INVALID_ID, 0.0f, 0))));
    }

    public int i() {
        return 2;
    }

    public void m() {
        if (this.a) {
            this.g = i;
            this.c = Alert.DURATION_SHOW_INDEFINITELY;
        }
    }

    public void n(int i2) {
        if (this.c >= 0) {
            this.c = i2;
        }
    }

    public void o() {
        this.b = -2;
    }

    public void p(int i2) {
        if (i2 >= 0) {
            this.b = i2;
        }
    }

    public void q() {
        this.a = true;
        this.c = 0;
    }

    public void r(String str) {
        this.g = str;
        this.a = true;
    }
}
