package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class vni0 {
    public final String a;
    public final String b;
    public final uji0 c;
    public final ArrayList d;
    public final boolean e;
    public final String f;

    public vni0(String str, String str2, uji0 uji0Var, ArrayList arrayList, boolean z, String str3) {
        this.a = str;
        this.b = str2;
        this.c = uji0Var;
        this.d = arrayList;
        this.e = z;
        this.f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vni0)) {
            return false;
        }
        vni0 vni0Var = (vni0) obj;
        return this.a.equals(vni0Var.a) && this.b.equals(vni0Var.b) && u890.j(this.c, vni0Var.c) && this.d.equals(vni0Var.d) && this.e == vni0Var.e && this.f.equals(vni0Var.f);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        uji0 uji0Var = this.c;
        return this.f.hashCode() + xcg1.g(p3d1.f(this.d, (iD + (uji0Var == null ? 0 : uji0Var.hashCode())) * 31, 31), 31, this.e);
    }
}
