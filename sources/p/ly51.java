package p;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ly51 {
    public final String a;
    public final int b;
    public final int c;
    public final List d;
    public final List e;
    public final Set f;
    public final int g;
    public final int h;
    public final int i;

    public ly51(String str, int i, int i2, List list, List list2, Set set, int i3, int i4, int i5) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = list;
        this.e = list2;
        this.f = set;
        this.g = i3;
        this.h = i4;
        this.i = i5;
    }

    public static ly51 a(ly51 ly51Var, String str, int i, int i2, ArrayList arrayList, List list, Set set, int i3, int i4) {
        if ((i4 & 1) != 0) {
            str = ly51Var.a;
        }
        String str2 = str;
        if ((i4 & 2) != 0) {
            i = ly51Var.b;
        }
        return new ly51(str2, i, (i4 & 4) != 0 ? ly51Var.c : i2, (i4 & 8) != 0 ? ly51Var.d : arrayList, (i4 & 16) != 0 ? ly51Var.e : list, (i4 & 32) != 0 ? ly51Var.f : set, (i4 & 64) != 0 ? ly51Var.g : i3, (i4 & 128) != 0 ? ly51Var.h : 5, (i4 & 256) != 0 ? ly51Var.i : 200);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ly51)) {
            return false;
        }
        ly51 ly51Var = (ly51) obj;
        return this.a.equals(ly51Var.a) && this.b == ly51Var.b && this.c == ly51Var.c && u890.j(this.d, ly51Var.d) && u890.j(this.e, ly51Var.e) && u890.j(this.f, ly51Var.f) && this.g == ly51Var.g && this.h == ly51Var.h && this.i == ly51Var.i;
    }

    public final int hashCode() {
        return Integer.hashCode(this.i) + kaa0.f(this.h, kaa0.f(this.g, gvg.c(f4i1.b(f4i1.b(kaa0.f(this.c, kaa0.f(this.b, this.a.hashCode() * 31, 31), 31), 31, this.d), 31, this.e), 31, this.f), 31), 31);
    }
}
