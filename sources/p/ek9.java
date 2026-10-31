package p;

import java.util.Arrays;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ek9 {
    public final UUID a;
    public final cih1 b;
    public final byte[] c;

    public ek9(UUID uuid, cih1 cih1Var, byte[] bArr) {
        this.a = uuid;
        this.b = cih1Var;
        this.c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ek9)) {
            return false;
        }
        ek9 ek9Var = (ek9) obj;
        return u890.j(this.a, ek9Var.a) && this.b == ek9Var.b && this.c.equals(ek9Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        cih1 cih1Var = this.b;
        return Arrays.hashCode(this.c) + ((iHashCode + (cih1Var == null ? 0 : cih1Var.hashCode())) * 31);
    }
}
