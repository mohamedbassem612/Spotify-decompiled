package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class n700 {
    public final long a;
    public final String b;
    public final phc c;
    public final long d;
    public final ArrayList e;
    public final boolean f;

    public n700(long j, String str, phc phcVar, long j2, ArrayList arrayList, boolean z) {
        this.a = j;
        this.b = str;
        this.c = phcVar;
        this.d = j2;
        this.e = arrayList;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n700)) {
            return false;
        }
        n700 n700Var = (n700) obj;
        return this.a == n700Var.a && u890.j(this.b, n700Var.b) && this.c.equals(n700Var.c) && this.d == n700Var.d && this.e.equals(n700Var.e) && this.f == n700Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + p3d1.f(this.e, cy30.f((this.c.hashCode() + cy30.d(Long.hashCode(this.a) * 31, 31, this.b)) * 31, this.d, 31), 31);
    }
}
