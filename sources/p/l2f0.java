package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class l2f0 {
    public final xd a;
    public final rl8 b;
    public final Set c;
    public final Set d;

    public l2f0(xd xdVar, rl8 rl8Var, Set set, Set set2) {
        this.a = xdVar;
        this.b = rl8Var;
        this.c = set;
        this.d = set2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l2f0)) {
            return false;
        }
        l2f0 l2f0Var = (l2f0) obj;
        return this.a.equals(l2f0Var.a) && u890.j(this.b, l2f0Var.b) && this.c.equals(l2f0Var.c) && this.d.equals(l2f0Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        rl8 rl8Var = this.b;
        return this.d.hashCode() + gvg.c((iHashCode + (rl8Var == null ? 0 : rl8Var.hashCode())) * 31, 31, this.c);
    }

    public final String toString() {
        return "LoginResult(accessToken=" + this.a + ", authenticationToken=" + this.b + ", recentlyGrantedPermissions=" + this.c + ", recentlyDeniedPermissions=" + this.d + ')';
    }
}
