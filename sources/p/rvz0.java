package p;

import java.util.Arrays;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class rvz0 {
    public final UUID a;
    public final byte[] b;

    public rvz0(UUID uuid, byte[] bArr) {
        this.a = uuid;
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rvz0)) {
            return false;
        }
        rvz0 rvz0Var = (rvz0) obj;
        return this.a.equals(rvz0Var.a) && Arrays.equals(this.b, rvz0Var.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
