package p;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class hpc1 {
    public final String a;
    public final Boolean b;
    public final int c;
    public final int d;
    public final int e;
    public final String f;
    public final boolean g;
    public final String h;
    public final String i;

    public hpc1(String str, Boolean bool, int i, int i2, int i3) {
        List listX;
        List listD1;
        boolean zJ;
        String str2;
        this.a = str;
        this.b = bool;
        this.c = i;
        this.d = i2;
        this.e = i3;
        Pattern patternCompile = Pattern.compile("-x-");
        ihc1.N0(0);
        Matcher matcher = patternCompile.matcher(str);
        if (matcher.find()) {
            ArrayList arrayList = new ArrayList(10);
            int iEnd = 0;
            do {
                arrayList.add(str.subSequence(iEnd, matcher.start()).toString());
                iEnd = matcher.end();
            } while (matcher.find());
            arrayList.add(str.subSequence(iEnd, str.length()).toString());
            listX = arrayList;
        } else {
            listX = k4p1.x(str.toString());
        }
        if (!listX.isEmpty()) {
            ListIterator listIterator = listX.listIterator(listX.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    listD1 = z6x.a;
                    break;
                } else if (((String) listIterator.previous()).length() != 0) {
                    listD1 = o7h.d1(listX, listIterator.nextIndex() + 1);
                    break;
                }
            }
        } else {
            listD1 = z6x.a;
            break;
        }
        String[] strArr = (String[]) listD1.toArray(new String[0]);
        if (strArr.length == 1) {
            str2 = this.a;
            this.f = str2;
            zJ = u890.j(this.b, Boolean.TRUE);
            this.g = zJ;
        } else {
            String str3 = strArr[0];
            this.f = str3;
            boolean zEquals = "cc".equals(strArr[1]);
            this.g = zEquals;
            zJ = zEquals;
            str2 = str3;
        }
        this.h = f4i1.e(str2, zJ ? "-x-cc" : "");
        this.i = str2.length() >= 2 ? str2.substring(0, 2) : "";
    }

    public final String a() {
        return this.f;
    }

    public final int b() {
        return this.e;
    }

    public final boolean c() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hpc1)) {
            return false;
        }
        hpc1 hpc1Var = (hpc1) obj;
        return hpc1Var.g == this.g && u890.j(hpc1Var.f, this.f) && hpc1Var.c == this.c && hpc1Var.d == this.d && hpc1Var.e == this.e;
    }

    public final int hashCode() {
        return (this.f.hashCode() * 31) + (this.g ? 1 : 0);
    }

    public /* synthetic */ hpc1(String str, Boolean bool, int i, int i2, int i3, l1d l1dVar) {
        this(str, (i3 & 2) != 0 ? null : bool, 0, (i3 & 8) != 0 ? 0 : i, (i3 & 16) != 0 ? 0 : i2);
    }
}
