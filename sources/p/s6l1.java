package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class s6l1 {
    public final String a;
    public final x360 b;
    public final ArrayList c;
    public final String d;

    public s6l1(String str, String str2, ArrayList arrayList, x360 x360Var) {
        this.a = str;
        this.b = x360Var;
        this.c = arrayList;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s6l1)) {
            return false;
        }
        s6l1 s6l1Var = (s6l1) obj;
        return this.a.equals(s6l1Var.a) && u890.j(this.b, s6l1Var.b) && this.c.equals(s6l1Var.c) && this.d.equals(s6l1Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        x360 x360Var = this.b;
        return this.d.hashCode() + p3d1.f(this.c, (iHashCode + (x360Var == null ? 0 : x360Var.hashCode())) * 31, 31);
    }
}
