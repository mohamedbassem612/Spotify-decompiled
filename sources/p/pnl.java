package p;

import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class pnl {
    public final ah91 a;
    public final UUID b;
    public final boolean c;

    public pnl(ah91 ah91Var, UUID uuid, boolean z) {
        this.a = ah91Var;
        this.b = uuid;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pnl)) {
            return false;
        }
        pnl pnlVar = (pnl) obj;
        return u890.j(this.a, pnlVar.a) && u890.j(this.b, pnlVar.b) && this.c == pnlVar.c;
    }

    public final int hashCode() {
        ah91 ah91Var = this.a;
        int iHashCode = (ah91Var == null ? 0 : ah91Var.hashCode()) * 31;
        UUID uuid = this.b;
        return Boolean.hashCode(this.c) + ((iHashCode + (uuid != null ? uuid.hashCode() : 0)) * 31);
    }
}
