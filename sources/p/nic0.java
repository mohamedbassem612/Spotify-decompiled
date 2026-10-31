package p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class nic0 implements vpl {
    public final ArrayList a;
    public final iw9 b;
    public final boolean c;
    public final boolean d;

    public nic0(ArrayList arrayList, iw9 iw9Var, boolean z) {
        this.a = arrayList;
        this.b = iw9Var;
        this.c = z;
        this.d = iw9Var != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nic0)) {
            return false;
        }
        nic0 nic0Var = (nic0) obj;
        return this.a.equals(nic0Var.a) && u890.j(this.b, nic0Var.b) && this.c == nic0Var.c;
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
