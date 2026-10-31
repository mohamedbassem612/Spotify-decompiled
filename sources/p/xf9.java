package p;

import java.util.Arrays;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class xf9 extends qg9 {
    public final String a;
    public final UUID b;
    public final byte[] c;

    public xf9(String str, UUID uuid, byte[] bArr) {
        this.a = str;
        this.b = uuid;
        this.c = bArr;
    }

    @Override // p.qg9
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!xf9.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        xf9 xf9Var = (xf9) obj;
        return u890.j(this.a, xf9Var.a) && u890.j(this.b, xf9Var.b) && Arrays.equals(this.c, xf9Var.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
