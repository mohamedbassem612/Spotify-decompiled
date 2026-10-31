package p;

import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class qi9 implements bj9 {
    public final String a;
    public final be9 b;
    public final byte[] c;

    public qi9(String str, be9 be9Var, byte[] bArr) {
        this.a = str;
        this.b = be9Var;
        this.c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!qi9.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        qi9 qi9Var = (qi9) obj;
        return u890.j(this.a, qi9Var.a) && this.b.equals(qi9Var.b) && Arrays.equals(this.c, qi9Var.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
