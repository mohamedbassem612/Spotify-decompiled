package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class xcy0 implements jn60 {
    public final String a;
    public final String b;
    public final x360 c;
    public final yz21 d;
    public final String e;

    public xcy0(String str, String str2, x360 x360Var, yz21 yz21Var, String str3) {
        this.a = str;
        this.b = str2;
        this.c = x360Var;
        this.d = yz21Var;
        this.e = str3;
    }

    public final List d(op80 op80Var) {
        x360 x360Var = this.c;
        return Collections.singletonList(new zby0(new ncy0(this.e, x360Var != null ? nho1.x(x360Var) : null), this.a, op80Var));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xcy0)) {
            return false;
        }
        xcy0 xcy0Var = (xcy0) obj;
        return this.a.equals(xcy0Var.a) && this.b.equals(xcy0Var.b) && u890.j(this.c, xcy0Var.c) && this.d.equals(xcy0Var.d) && this.e.equals(xcy0Var.e);
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
        return this.e.hashCode() + bb00.g(this.d, (iD + (x360Var == null ? 0 : x360Var.hashCode())) * 31, 31);
    }
}
