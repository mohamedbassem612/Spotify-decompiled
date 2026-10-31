package p;

import java.util.Arrays;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class be9 implements ee9 {
    public final UUID a;
    public final byte[] b;

    public be9(UUID uuid, byte[] bArr) {
        this.a = uuid;
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!be9.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        be9 be9Var = (be9) obj;
        if (!u890.j(this.a, be9Var.a)) {
            return false;
        }
        byte[] bArr = be9Var.b;
        byte[] bArr2 = this.b;
        if (bArr2 != null) {
            if (bArr == null || !Arrays.equals(bArr2, bArr)) {
                return false;
            }
        } else if (bArr != null) {
            return false;
        }
        return true;
    }

    @Override // p.ee9
    public final UUID getUuid() {
        return this.a;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        byte[] bArr = this.b;
        return iHashCode + (bArr != null ? Arrays.hashCode(bArr) : 0);
    }
}
