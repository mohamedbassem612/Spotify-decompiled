package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class yoa1 {
    public final String a;
    public final List b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;
    public final int g;

    public yoa1(String str, List list, String str2, String str3, String str4, int i, int i2) {
        this.a = str;
        this.b = list;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = i;
        this.g = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yoa1)) {
            return false;
        }
        yoa1 yoa1Var = (yoa1) obj;
        return u890.j(this.a, yoa1Var.a) && this.b.equals(yoa1Var.b) && u890.j(this.c, yoa1Var.c) && u890.j(this.d, yoa1Var.d) && u890.j(this.e, yoa1Var.e) && this.f == yoa1Var.f && this.g == yoa1Var.g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.g) + kaa0.f(this.f, cy30.d(cy30.d(cy30.d(f4i1.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31);
    }
}
