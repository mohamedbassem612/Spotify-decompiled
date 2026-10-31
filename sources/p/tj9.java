package p;

import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class tj9 implements uj9 {
    public final String a;
    public final ee9 b;
    public final byte[] c;

    public tj9(String str, ee9 ee9Var, byte[] bArr) {
        this.a = str;
        this.b = ee9Var;
        this.c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!tj9.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        tj9 tj9Var = (tj9) obj;
        return u890.j(this.a, tj9Var.a) && u890.j(this.b, tj9Var.b) && Arrays.equals(this.c, tj9Var.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
