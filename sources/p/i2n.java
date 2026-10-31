package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class i2n {
    public final String a;
    public final ArrayList b;
    public final d8r0 c;
    public final String d;
    public final int e;
    public final String f;

    public i2n(int i, String str, String str2, String str3, ArrayList arrayList, d8r0 d8r0Var) {
        this.a = str;
        this.b = arrayList;
        this.c = d8r0Var;
        this.d = str2;
        this.e = i;
        this.f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i2n)) {
            return false;
        }
        i2n i2nVar = (i2n) obj;
        return u890.j(this.a, i2nVar.a) && this.b.equals(i2nVar.b) && this.c.equals(i2nVar.c) && u890.j(this.d, i2nVar.d) && this.e == i2nVar.e && u890.j(this.f, i2nVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + kaa0.f(this.e, cy30.d(hrt.i(this.c, p3d1.f(this.b, this.a.hashCode() * 31, 31), 31), 31, this.d), 31);
    }
}
