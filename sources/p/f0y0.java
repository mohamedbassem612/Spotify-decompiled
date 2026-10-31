package p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class f0y0 implements jn60 {
    public final String a;
    public final String b;
    public final x360 c;
    public final yz21 d;
    public final String e;
    public final ArrayList f;

    public f0y0(String str, String str2, x360 x360Var, yz21 yz21Var, String str3, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = x360Var;
        this.d = yz21Var;
        this.e = str3;
        this.f = arrayList;
    }

    public final List d(op80 op80Var) {
        String strX;
        x360 x360Var = this.c;
        if (x360Var == null || (strX = nho1.x(x360Var)) == null) {
            strX = "";
        }
        return Collections.singletonList(new lzx0(new wzx0(strX, this.e, this.f), this.a, op80Var));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0y0)) {
            return false;
        }
        f0y0 f0y0Var = (f0y0) obj;
        return this.a.equals(f0y0Var.a) && this.b.equals(f0y0Var.b) && u890.j(this.c, f0y0Var.c) && this.d.equals(f0y0Var.d) && this.e.equals(f0y0Var.e) && this.f.equals(f0y0Var.f);
    }

    public final yz21 f() {
        return this.d;
    }

    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        x360 x360Var = this.c;
        return this.f.hashCode() + cy30.d(bb00.g(this.d, (iD + (x360Var == null ? 0 : x360Var.hashCode())) * 31, 31), 31, this.e);
    }
}
