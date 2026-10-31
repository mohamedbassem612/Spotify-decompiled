package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class p3c1 implements l3c1 {
    public final String a;
    public final ArrayList b;
    public final int c;
    public final int d;

    public p3c1(int i, int i2, String str, ArrayList arrayList) {
        this.a = str;
        this.b = arrayList;
        this.c = i;
        this.d = i2;
    }

    public final List a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p3c1)) {
            return false;
        }
        p3c1 p3c1Var = (p3c1) obj;
        return u890.j(this.a, p3c1Var.a) && this.b.equals(p3c1Var.b) && this.c == p3c1Var.c && this.d == p3c1Var.d;
    }

    public final int getFormat() {
        return this.d;
    }

    public final String getId() {
        return this.a;
    }

    public final int getRevision() {
        return this.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + kaa0.f(this.c, p3d1.f(this.b, this.a.hashCode() * 31, 31), 31);
    }
}
