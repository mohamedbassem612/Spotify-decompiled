package p;

import java.util.Arrays;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class df9 implements pf9 {
    public final String a;
    public final UUID b;
    public final byte[] c;

    public df9(String str, UUID uuid, byte[] bArr) {
        this.a = str;
        this.b = uuid;
        this.c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!df9.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        df9 df9Var = (df9) obj;
        return this.a.equals(df9Var.a) && this.b.equals(df9Var.b) && Arrays.equals(this.c, df9Var.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
