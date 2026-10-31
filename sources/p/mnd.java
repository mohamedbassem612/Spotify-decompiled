package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class mnd {
    public final boolean a;
    public final String b;
    public final String c;
    public final hpc1 d;
    public final List e;
    public final boolean f;

    public mnd(boolean z, String str, String str2, hpc1 hpc1Var, List list, boolean z2) {
        this.a = z;
        this.b = str;
        this.c = str2;
        this.d = hpc1Var;
        this.e = list;
        this.f = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mnd)) {
            return false;
        }
        mnd mndVar = (mnd) obj;
        return this.a == mndVar.a && this.b.equals(mndVar.b) && this.c.equals(mndVar.c) && u890.j(this.d, mndVar.d) && u890.j(this.e, mndVar.e) && this.f == mndVar.f;
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        hpc1 hpc1Var = this.d;
        return Boolean.hashCode(this.f) + f4i1.b((iD + (hpc1Var == null ? 0 : hpc1Var.hashCode())) * 31, 31, this.e);
    }
}
