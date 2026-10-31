package p;

import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import androidx.car.app.model.Alert;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class a6e1 implements tob1, ypb1 {
    public yae1 c;
    public final hrr0 a = new hrr0((Object) null, z5e1.f);
    public final hrr0 b = new hrr0((Object) null, y5e1.g);
    public x5e1 d = new x5e1();

    public final y9e1 c(z5e1 z5e1Var, y5e1 y5e1Var) {
        smc0 arrayList;
        ehe0 ehe0VarB;
        CharSequence charSequence;
        lee1 lee1Var;
        Object objG;
        i4e1 i4e1VarH = z5e1Var.a.h();
        smc0 smc0VarK = i4e1VarH.a;
        b8e1 b8e1Var = i4e1VarH.c;
        if (b8e1Var != null) {
            mee1 mee1Var = b8e1Var.a;
            arrayList = new ArrayList();
            kr80 kr80Var = mee1Var.b;
            if (kr80Var.d != kr80Var.e) {
                int i = 4;
                while (true) {
                    ldn0 ldn0Var = kr80Var.b;
                    if (i >= ldn0Var.b) {
                        break;
                    }
                    if (!sbl.H(ldn0Var.d(i)) && (objG = kr80Var.a.g(i / 4)) != null) {
                        long jN = kr80Var.n(i);
                        int I = sbl.I(jN);
                        if (I > mee1Var.c) {
                            I -= mee1Var.c();
                        }
                        int iC = (int) (jN & 2147483647L);
                        if (iC > mee1Var.c) {
                            iC -= mee1Var.c();
                        }
                        arrayList.add(new ze5(I, iC, objG));
                    }
                    i += 4;
                }
            }
        } else {
            arrayList = null;
        }
        Collection collection = (Collection) smc0VarK;
        if ((collection == null || collection.isEmpty()) && (arrayList == null || arrayList.isEmpty())) {
            smc0VarK = null;
        } else if (collection == null || collection.isEmpty()) {
            smc0VarK = arrayList;
        } else if (arrayList != null && !arrayList.isEmpty()) {
            smc0 smc0VarN = k4p1.n();
            smc0VarN.addAll(collection);
            smc0VarN.addAll(arrayList);
            smc0VarK = k4p1.k(smc0VarN);
        }
        x5e1 x5e1Var = (x5e1) pv91.f(this.d);
        y9e1 y9e1Var = x5e1Var.n;
        if (y9e1Var != null && (charSequence = x5e1Var.c) != null && nhc1.O(charSequence, i4e1VarH) && u890.j(x5e1Var.d, smc0VarK) && u890.j(x5e1Var.e, i4e1VarH.f) && x5e1Var.g == z5e1Var.c && x5e1Var.h == z5e1Var.d && x5e1Var.k == y5e1Var.b && x5e1Var.i == y5e1Var.a.h() && x5e1Var.j == y5e1Var.a.U0() && hjl.c(x5e1Var.m, y5e1Var.d) && u890.j(x5e1Var.l, y5e1Var.c) && !y9e1Var.b.a.a()) {
            lee1 lee1Var2 = x5e1Var.f;
            boolean z = false;
            boolean zD = lee1Var2 != null ? lee1Var2.d(z5e1Var.b) : false;
            lee1 lee1Var3 = x5e1Var.f;
            if (lee1Var3 != null && (lee1Var3 == (lee1Var = z5e1Var.b) || lee1Var3.a.c(lee1Var.a))) {
                z = true;
            }
            if (zD && z) {
                return y9e1Var;
            }
            if (zD) {
                x9e1 x9e1Var = y9e1Var.a;
                return new y9e1(new x9e1(x9e1Var.a, z5e1Var.b, x9e1Var.c, x9e1Var.d, x9e1Var.e, x9e1Var.f, x9e1Var.g, x9e1Var.h, x9e1Var.i, x9e1Var.j), y9e1Var.b, y9e1Var.c);
            }
        }
        yae1 yae1Var = this.c;
        if (yae1Var == null) {
            yae1Var = new yae1(y5e1Var.c, y5e1Var.a, y5e1Var.b, 1);
            this.c = yae1Var;
        }
        yae1 yae1Var2 = yae1Var;
        boolean z2 = z5e1Var.e;
        lee1 lee1VarE = z5e1Var.b;
        if (z2) {
            LocaleList localeList = lee1VarE.a.k;
            if (localeList == null || (ehe0VarB = localeList.b()) == null) {
                ehe0VarB = uct0.a.i().b();
            }
            byte bL = Build.VERSION.SDK_INT >= 28 ? ph5.L(ehe0VarB) : Character.getDirectionality(DecimalFormatSymbols.getInstance(ehe0VarB.a).getZeroDigit());
            lee1VarE = lee1VarE.e(new lee1(0L, 0L, (FontWeight) null, (FontFamily) null, 0L, 0L, 0, (bL == 1 || bL == 2) ? 2 : 1, 0L, (shc0) null, 0, 16711679));
        }
        y9e1 y9e1VarB = yae1.b(yae1Var2, new af5(i4e1VarH.d.toString(), smc0VarK == null ? z6x.a : smc0VarK), lee1VarE, 0, z5e1Var.d, z5e1Var.c ? 1 : Alert.DURATION_SHOW_INDEFINITELY, y5e1Var.d, y5e1Var.b, y5e1Var.a, y5e1Var.c, 1060);
        if (!y9e1VarB.equals(y9e1Var)) {
            jv91 jv91VarH = pv91.h();
            if (!jv91VarH.f()) {
                x5e1 x5e1Var2 = this.d;
                synchronized (pv91.c) {
                    x5e1 x5e1Var3 = (x5e1) pv91.u(x5e1Var2, this, jv91VarH);
                    x5e1Var3.c = i4e1VarH;
                    x5e1Var3.d = smc0VarK;
                    x5e1Var3.e = i4e1VarH.f;
                    x5e1Var3.g = z5e1Var.c;
                    x5e1Var3.h = z5e1Var.d;
                    x5e1Var3.f = z5e1Var.b;
                    x5e1Var3.k = y5e1Var.b;
                    x5e1Var3.i = y5e1Var.e;
                    x5e1Var3.j = y5e1Var.f;
                    x5e1Var3.m = y5e1Var.d;
                    x5e1Var3.l = y5e1Var.c;
                    x5e1Var3.n = y9e1VarB;
                }
                pv91.l(jv91VarH, this);
                return y9e1VarB;
            }
        }
        return y9e1VarB;
    }

    public final Object getValue() {
        y5e1 y5e1Var;
        z5e1 z5e1Var = (z5e1) this.a.getValue();
        if (z5e1Var == null || (y5e1Var = (y5e1) this.b.getValue()) == null) {
            return null;
        }
        return c(z5e1Var, y5e1Var);
    }

    public final cqb1 k() {
        return this.d;
    }

    public final void l(cqb1 cqb1Var) {
        this.d = (x5e1) cqb1Var;
    }

    public final cqb1 n(cqb1 cqb1Var, cqb1 cqb1Var2, cqb1 cqb1Var3) {
        return cqb1Var3;
    }
}
