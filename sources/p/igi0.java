package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class igi0 {
    public final String a;
    public final ArrayList b;
    public final x360 c;
    public final boolean d;
    public final boolean e;

    public igi0(String str, ArrayList arrayList, x360 x360Var, boolean z, boolean z2) {
        this.a = str;
        this.b = arrayList;
        this.c = x360Var;
        this.d = z;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof igi0)) {
            return false;
        }
        igi0 igi0Var = (igi0) obj;
        return u890.j(this.a, igi0Var.a) && this.b.equals(igi0Var.b) && u890.j(this.c, igi0Var.c) && this.d == igi0Var.d && this.e == igi0Var.e;
    }

    public final int hashCode() {
        int iF = p3d1.f(this.b, this.a.hashCode() * 31, 31);
        x360 x360Var = this.c;
        return Boolean.hashCode(this.e) + xcg1.g((iF + (x360Var == null ? 0 : x360Var.hashCode())) * 31, 31, this.d);
    }
}
