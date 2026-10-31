package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class f901 implements i901 {
    public final String a;
    public final String b;
    public final int c;
    public final int d;
    public final int e;
    public final List f;
    public final boolean g;
    public final int h;
    public final boolean i;

    public f901(String str, String str2, int i, int i2, int i3, List list, boolean z, int i4, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = list;
        this.g = z;
        this.h = i4;
        this.i = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f901)) {
            return false;
        }
        f901 f901Var = (f901) obj;
        return u890.j(this.a, f901Var.a) && u890.j(this.b, f901Var.b) && this.c == f901Var.c && this.d == f901Var.d && this.e == f901Var.e && u890.j(this.f, f901Var.f) && this.g == f901Var.g && this.h == f901Var.h && this.i == f901Var.i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + ab80.k(this.h, xcg1.g(f4i1.b(kaa0.f(this.e, kaa0.f(this.d, kaa0.f(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31), 31), 31), 31, this.f), 31, this.g), 31);
    }
}
