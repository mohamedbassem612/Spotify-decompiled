package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class sq60 {
    public final String a;
    public final ArrayList b;
    public final x360 c;
    public final String d;
    public final boolean e;
    public final int f;

    public sq60(String str, ArrayList arrayList, x360 x360Var, String str2, boolean z, int i) {
        this.a = str;
        this.b = arrayList;
        this.c = x360Var;
        this.d = str2;
        this.e = z;
        this.f = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sq60)) {
            return false;
        }
        sq60 sq60Var = (sq60) obj;
        return this.a.equals(sq60Var.a) && this.b.equals(sq60Var.b) && u890.j(this.c, sq60Var.c) && this.d.equals(sq60Var.d) && this.e == sq60Var.e && this.f == sq60Var.f;
    }

    public final int hashCode() {
        int iF = p3d1.f(this.b, this.a.hashCode() * 31, 31);
        x360 x360Var = this.c;
        return Integer.hashCode(this.f) + xcg1.g(cy30.d((iF + (x360Var == null ? 0 : x360Var.hashCode())) * 31, 31, this.d), 31, this.e);
    }
}
