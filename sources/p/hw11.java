package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class hw11 {
    public final String a;
    public final String b;
    public final List c;
    public final String d;
    public final ArrayList e;
    public final boolean f;

    public hw11(String str, String str2, List list, String str3, ArrayList arrayList, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = str3;
        this.e = arrayList;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hw11)) {
            return false;
        }
        hw11 hw11Var = (hw11) obj;
        return u890.j(this.a, hw11Var.a) && u890.j(this.b, hw11Var.b) && u890.j(this.c, hw11Var.c) && this.d.equals(hw11Var.d) && this.e.equals(hw11Var.e) && this.f == hw11Var.f;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return Boolean.hashCode(this.f) + p3d1.f(this.e, cy30.d(f4i1.b((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31, this.d), 31);
    }
}
