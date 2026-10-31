package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class j701 implements vpl {
    public final i701 a;
    public final iw9 b;
    public final dq70 c;
    public final Integer d;
    public final Integer e;
    public final String f;

    public j701(i701 i701Var, iw9 iw9Var, dq70 dq70Var, Integer num, Integer num2) {
        this.a = i701Var;
        this.b = iw9Var;
        this.c = dq70Var;
        this.d = num;
        this.e = num2;
        this.f = iw9Var.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j701)) {
            return false;
        }
        j701 j701Var = (j701) obj;
        return this.a.equals(j701Var.a) && this.b.equals(j701Var.b) && this.c.equals(j701Var.c) && u890.j(this.d, j701Var.d) && u890.j(this.e, j701Var.e);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + xcg1.g((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, true)) * 31;
        Integer num = this.d;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.e;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    @Override // p.vpl
    public final String j() {
        return "";
    }

    @Override // p.vpl
    public final boolean k() {
        return true;
    }

    @Override // p.vpl
    public final List l() {
        return Collections.singletonList(m87.w(this.b.a));
    }
}
