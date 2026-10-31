package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class exf1 {
    public final String a;
    public final ArrayList b;
    public final boolean c;
    public final String d;
    public final k4m e;
    public final int f;
    public final boolean g;

    public exf1(String str, ArrayList arrayList, boolean z, String str2, k4m k4mVar, int i, boolean z2) {
        this.a = str;
        this.b = arrayList;
        this.c = z;
        this.d = str2;
        this.e = k4mVar;
        this.f = i;
        this.g = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof exf1)) {
            return false;
        }
        exf1 exf1Var = (exf1) obj;
        return this.a.equals(exf1Var.a) && this.b.equals(exf1Var.b) && this.c == exf1Var.c && u890.j(this.d, exf1Var.d) && this.e == exf1Var.e && this.f == exf1Var.f && this.g == exf1Var.g;
    }

    public final int hashCode() {
        int iG = xcg1.g(p3d1.f(this.b, this.a.hashCode() * 31, 31), 31, this.c);
        String str = this.d;
        return Boolean.hashCode(this.g) + ab80.k(this.f, p3d1.g(this.e, (iG + (str == null ? 0 : str.hashCode())) * 31, 31), 31);
    }
}
