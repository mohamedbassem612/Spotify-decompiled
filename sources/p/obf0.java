package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class obf0 implements vpl {
    public final String a;
    public final iw9 b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public obf0(String str, iw9 iw9Var, boolean z, boolean z2) {
        this.a = str;
        this.b = iw9Var;
        this.c = z;
        this.d = z2;
        this.e = iw9Var != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof obf0)) {
            return false;
        }
        obf0 obf0Var = (obf0) obj;
        return this.a.equals(obf0Var.a) && u890.j(this.b, obf0Var.b) && this.c == obf0Var.c && this.d == obf0Var.d;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        iw9 iw9Var = this.b;
        return Boolean.hashCode(this.d) + xcg1.g((iHashCode + (iw9Var == null ? 0 : iw9Var.hashCode())) * 31, 31, this.c);
    }

    @Override // p.vpl
    public final String j() {
        return "";
    }

    @Override // p.vpl
    public final boolean k() {
        return this.e;
    }

    @Override // p.vpl
    public final List l() {
        iw9 iw9Var = this.b;
        return iw9Var != null ? Collections.singletonList(m87.w(iw9Var.a)) : z6x.a;
    }
}
