package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class l39 implements pd51 {
    public final String a;
    public final d8r0 b;
    public final String c;
    public final String d;
    public final String e;
    public final ArrayList f;
    public final int g;
    public final boolean h;

    public l39(String str, d8r0 d8r0Var, String str2, String str3, String str4, ArrayList arrayList, int i, boolean z) {
        this.a = str;
        this.b = d8r0Var;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = arrayList;
        this.g = i;
        this.h = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l39)) {
            return false;
        }
        l39 l39Var = (l39) obj;
        return this.a.equals(l39Var.a) && this.b.equals(l39Var.b) && u890.j(this.c, l39Var.c) && u890.j(this.d, l39Var.d) && this.e.equals(l39Var.e) && this.f.equals(l39Var.f) && this.g == l39Var.g && this.h == l39Var.h;
    }

    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + ab80.k(this.g, p3d1.f(this.f, cy30.d(cy30.d(cy30.d(hrt.i(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31, this.d), 31, this.e), 31), 31);
    }
}
