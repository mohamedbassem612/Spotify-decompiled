package p;

import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class fib {
    public final String a;
    public final ee9 b;
    public final byte[] c;
    public final rvz0 d;

    public fib(String str, ee9 ee9Var, byte[] bArr, rvz0 rvz0Var) {
        this.a = str;
        this.b = ee9Var;
        this.c = bArr;
        this.d = rvz0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!fib.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        fib fibVar = (fib) obj;
        return this.a.equals(fibVar.a) && this.b.equals(fibVar.b) && Arrays.equals(this.c, fibVar.c) && this.d.equals(fibVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ktd.f((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, this.c, 31);
    }
}
