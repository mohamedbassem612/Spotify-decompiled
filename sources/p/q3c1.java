package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class q3c1 implements l3c1 {
    public final String a;
    public final ArrayList b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;
    public final int g;

    public q3c1(String str, ArrayList arrayList, String str2, String str3, String str4, int i, int i2) {
        this.a = str;
        this.b = arrayList;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = i;
        this.g = i2;
    }

    public final List a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q3c1)) {
            return false;
        }
        q3c1 q3c1Var = (q3c1) obj;
        return u890.j(this.a, q3c1Var.a) && this.b.equals(q3c1Var.b) && u890.j(this.c, q3c1Var.c) && u890.j(this.d, q3c1Var.d) && u890.j(this.e, q3c1Var.e) && this.f == q3c1Var.f && this.g == q3c1Var.g;
    }

    public final int getFormat() {
        return this.g;
    }

    public final String getId() {
        return this.a;
    }

    public final int getRevision() {
        return this.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.g) + kaa0.f(this.f, cy30.d(cy30.d(cy30.d(p3d1.f(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31, this.d), 31, this.e), 31);
    }
}
