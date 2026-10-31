package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ds70 implements vpl {
    public final dq70 a;
    public final iw9 b;
    public final boolean c;
    public final boolean d;

    public ds70(dq70 dq70Var, iw9 iw9Var, boolean z) {
        this.a = dq70Var;
        this.b = iw9Var;
        this.c = z;
        this.d = iw9Var != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ds70)) {
            return false;
        }
        ds70 ds70Var = (ds70) obj;
        return this.a.equals(ds70Var.a) && u890.j(this.b, ds70Var.b) && this.c == ds70Var.c;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        iw9 iw9Var = this.b;
        return Boolean.hashCode(this.c) + ((iHashCode + (iw9Var == null ? 0 : iw9Var.hashCode())) * 31);
    }

    @Override // p.vpl
    public final String j() {
        return "";
    }

    @Override // p.vpl
    public final boolean k() {
        return this.d;
    }

    @Override // p.vpl
    public final List l() {
        iw9 iw9Var = this.b;
        return iw9Var != null ? Collections.singletonList(m87.w(iw9Var.a)) : z6x.a;
    }
}
