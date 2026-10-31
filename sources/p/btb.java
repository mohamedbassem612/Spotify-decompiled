package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class btb implements z0i {
    public final lfx0 a;
    public final sdp0 b;
    public final ArrayList c;
    public final Long d;

    public btb(lfx0 lfx0Var, sdp0 sdp0Var, ArrayList arrayList, Long l) {
        this.a = lfx0Var;
        this.b = sdp0Var;
        this.c = arrayList;
        this.d = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof btb)) {
            return false;
        }
        btb btbVar = (btb) obj;
        return u890.j(this.a, btbVar.a) && u890.j(this.b, btbVar.b) && this.c.equals(btbVar.c) && u890.j(this.d, btbVar.d);
    }

    public final int hashCode() {
        lfx0 lfx0Var = this.a;
        int iHashCode = (lfx0Var == null ? 0 : lfx0Var.hashCode()) * 31;
        sdp0 sdp0Var = this.b;
        int iF = p3d1.f(this.c, (iHashCode + (sdp0Var == null ? 0 : sdp0Var.hashCode())) * 31, 31);
        Long l = this.d;
        return iF + (l != null ? l.hashCode() : 0);
    }
}
