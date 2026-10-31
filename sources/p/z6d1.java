package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class z6d1 {
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final List e;
    public final boolean f;

    public z6d1(int i, String str, String str2, String str3, List list, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = list;
        this.f = z;
    }

    public static z6d1 a(z6d1 z6d1Var, ArrayList arrayList, boolean z) {
        String str = z6d1Var.a;
        String str2 = z6d1Var.b;
        String str3 = z6d1Var.c;
        int i = z6d1Var.d;
        z6d1Var.getClass();
        return new z6d1(i, str, str2, str3, arrayList, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z6d1)) {
            return false;
        }
        z6d1 z6d1Var = (z6d1) obj;
        return this.a.equals(z6d1Var.a) && this.b.equals(z6d1Var.b) && this.c.equals(z6d1Var.c) && this.d == z6d1Var.d && this.e.equals(z6d1Var.e) && this.f == z6d1Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + f4i1.b(ab80.k(this.d, cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31, this.e);
    }
}
