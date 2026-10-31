package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class b7a1 {
    public final String a;
    public final String b;
    public final c7a1 c;
    public final ArrayList d;
    public final boolean e;

    public b7a1(String str, String str2, c7a1 c7a1Var, ArrayList arrayList, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = c7a1Var;
        this.d = arrayList;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b7a1)) {
            return false;
        }
        b7a1 b7a1Var = (b7a1) obj;
        return u890.j(this.a, b7a1Var.a) && this.b.equals(b7a1Var.b) && this.c.equals(b7a1Var.c) && this.d.equals(b7a1Var.d) && this.e == b7a1Var.e;
    }

    public final int hashCode() {
        String str = this.a;
        return Boolean.hashCode(this.e) + p3d1.f(this.d, (this.c.hashCode() + cy30.d((str == null ? 0 : str.hashCode()) * 31, 31, this.b)) * 31, 31);
    }
}
