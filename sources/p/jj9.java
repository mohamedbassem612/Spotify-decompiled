package p;

import java.util.Arrays;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class jj9 implements uj9 {
    public final String a;
    public final UUID b;
    public final byte[] c;

    public jj9(String str, UUID uuid, byte[] bArr) {
        this.a = str;
        this.b = uuid;
        this.c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!jj9.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        jj9 jj9Var = (jj9) obj;
        return u890.j(this.a, jj9Var.a) && u890.j(this.b, jj9Var.b) && Arrays.equals(this.c, jj9Var.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
