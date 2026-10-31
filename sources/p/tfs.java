package p;

import android.content.res.Resources;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class tfs {
    public final Resources a;
    public final yqg b;
    public final ggv c;
    public final htr d;
    public final zcz e;
    public final boolean j;
    public final boolean n;
    public int f = 1;
    public boolean g = false;
    public boolean h = false;
    public boolean i = false;
    public SimpleDateFormat k = null;
    public SimpleDateFormat l = null;
    public iix0 m = null;

    public tfs(Resources resources, yqg yqgVar, ggv ggvVar, htr htrVar, zcz zczVar, boolean z, boolean z2) {
        this.a = resources;
        this.b = yqgVar;
        this.c = ggvVar;
        this.d = htrVar;
        this.e = zczVar;
        this.j = z;
        this.n = z2;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0075  */
    public final String a() {
        String strB;
        String strB2;
        zcz zczVar = this.e;
        int i = zczVar.b;
        boolean z = this.g;
        int i2 = 0;
        htr htrVar = this.d;
        if (!z || this.k == null || this.l == null) {
            strB = z ? b(htrVar.b(i)) : zczVar.a;
        } else {
            long j = i;
            Calendar calendarD = this.b.d();
            Calendar calendar = (Calendar) calendarD.clone();
            calendar.setTimeInMillis(1000 * j);
            if (calendar.get(0) == calendarD.get(0) && calendar.get(1) == calendarD.get(1) && calendar.get(6) == calendarD.get(6)) {
                strB2 = b(htrVar.b(j));
            } else {
                int i3 = calendarD.get(6) - calendar.get(6);
                if (calendarD.get(1) == calendar.get(1) && i3 == 1) {
                    strB2 = b(htrVar.b(j));
                } else {
                    int i4 = calendarD.get(6) - calendar.get(6);
                    if (calendarD.get(1) == calendar.get(1) && i4 > 0 && i4 <= 7) {
                        strB2 = b(htrVar.b(j));
                    } else if (calendarD.get(1) == calendar.get(1)) {
                        SimpleDateFormat simpleDateFormat = this.k;
                        simpleDateFormat.getClass();
                        strB2 = simpleDateFormat.format(calendar.getTime());
                        strB2.getClass();
                    } else {
                        SimpleDateFormat simpleDateFormat2 = this.l;
                        simpleDateFormat2.getClass();
                        strB2 = simpleDateFormat2.format(calendar.getTime());
                        strB2.getClass();
                    }
                }
            }
            strB = b(strB2);
        }
        iix0 iix0Var = this.m;
        Resources resources = this.a;
        if (iix0Var != null) {
            return this.h ? e(iix0Var) : resources.getString(2131962984, strB, e(iix0Var));
        }
        Integer num = zczVar.d;
        int iIntValue = num != null ? num.intValue() : -1;
        boolean z2 = zczVar.e;
        boolean z3 = this.i;
        int i5 = zczVar.c;
        if (z2 || iIntValue == 0) {
            i2 = 2;
        } else {
            int i6 = i5 - iIntValue;
            if (iIntValue >= 0 && (z3 || i6 > 0)) {
                i2 = 1;
            }
        }
        return this.h ? d(iIntValue, i2) : resources.getString(2131962984, strB, d(iIntValue, i2));
    }

    public final String b(String str) {
        return this.f == 1 ? str.toUpperCase(Locale.getDefault()) : str;
    }

    public final String c(int i, boolean z) {
        return this.c.a(i, new fgv(z ? 3 : 4, this.f));
    }

    public final String d(int i, int i2) {
        String strC;
        int i3 = this.e.c;
        boolean z = this.n;
        Resources resources = this.a;
        if (z) {
            boolean z2 = i >= 0 && i < 61;
            if (i3 == i || !this.i) {
                strC = c(i, z2);
            } else if (z2) {
                strC = resources.getString(2131962990);
                strC.getClass();
            } else {
                strC = b(resources.getString(2131962989, c(i, false)));
            }
            return this.j ? xcg1.i(strC, " • ", b(resources.getString(2131962983))) : strC;
        }
        boolean z3 = this.i;
        boolean z4 = z3 && 1 <= i && i < 61;
        boolean z5 = !z3 && 1 <= i && i < 61;
        if (i2 == 2) {
            return b(resources.getString(2131962983));
        }
        if (z4) {
            String string = resources.getString(2131962990);
            string.getClass();
            return string;
        }
        if (z5) {
            return c(i, true);
        }
        return i2 == 1 ? b(resources.getString(2131962989, c(i, false))) : c(i3, false);
    }

    public final String e(iix0 iix0Var) {
        String str;
        boolean z = iix0Var instanceof hix0;
        ngv ngvVar = ngv.d;
        Resources resources = this.a;
        if (z) {
            long j = ((hix0) iix0Var).b;
            if (j != 0) {
                ogv ogvVar = new ogv(resources, (byte) 1);
                ytw0 ytw0Var = jfv.b;
                str = ((rle1) ogvVar.invoke(new jfv(fdg1.l0(j, ngvVar)))).a;
            } else {
                str = "";
            }
        } else {
            if (!(iix0Var instanceof gix0)) {
                eg.o();
                return null;
            }
            ogv ogvVar2 = new ogv(resources, (byte) 0);
            ytw0 ytw0Var2 = jfv.b;
            gix0 gix0Var = (gix0) iix0Var;
            str = ((rle1) ogvVar2.invoke(new jfv(fdg1.l0(gix0Var.b - gix0Var.c, ngvVar)))).a;
        }
        return iix0Var.g() ? f4i1.f(str, " • ", b(resources.getString(2131962983))) : str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof tfs) {
            tfs tfsVar = (tfs) obj;
            if (this.a.equals(tfsVar.a) && this.b.equals(tfsVar.b) && this.c == tfsVar.c && this.d == tfsVar.d && this.e.equals(tfsVar.e) && this.f == tfsVar.f && this.g == tfsVar.g && this.h == tfsVar.h && this.i == tfsVar.i && this.j == tfsVar.j && u890.j(this.k, tfsVar.k) && u890.j(this.l, tfsVar.l) && u890.j(this.m, tfsVar.m) && this.n == tfsVar.n) {
                return true;
            }
        }
        return false;
    }

    public final void f() {
        this.g = true;
    }

    public final void g(String str) {
        this.k = new SimpleDateFormat("d MMM", Locale.getDefault());
        this.l = new SimpleDateFormat(str, Locale.getDefault());
    }

    public final void h() {
        this.f = 2;
    }

    public final int hashCode() {
        int iG = xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(ab80.k(this.f, (this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31, 31), 31, this.g), 31, false), 31, this.h), 31, this.i), 31, this.j), 31, true), 31, false), 31, false);
        SimpleDateFormat simpleDateFormat = this.k;
        int iHashCode = (iG + (simpleDateFormat == null ? 0 : simpleDateFormat.hashCode())) * 31;
        SimpleDateFormat simpleDateFormat2 = this.l;
        int iHashCode2 = (iHashCode + (simpleDateFormat2 == null ? 0 : simpleDateFormat2.hashCode())) * 31;
        iix0 iix0Var = this.m;
        return Boolean.hashCode(this.n) + ((iHashCode2 + (iix0Var != null ? iix0Var.hashCode() : 0)) * 31);
    }

    public final void i() {
        this.h = false;
    }
}
