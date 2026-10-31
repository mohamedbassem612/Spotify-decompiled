package p;

import android.util.Base64;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class s29 {
    public final String a;
    public final byte[] b;
    public final xnw0 c;

    public s29(String str, byte[] bArr, xnw0 xnw0Var) {
        this.a = str;
        this.b = bArr;
        this.c = xnw0Var;
    }

    public static ix7 a() {
        ix7 ix7Var = new ix7((byte) 15);
        ix7Var.x(xnw0.a);
        return ix7Var;
    }

    public final s29 b(xnw0 xnw0Var) {
        ix7 ix7VarA = a();
        ix7VarA.s(this.a);
        ix7VarA.x(xnw0Var);
        ix7VarA.u(this.b);
        return ix7VarA.j();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof s29) {
            s29 s29Var = (s29) obj;
            if (this.a.equals(s29Var.a) && Arrays.equals(this.b, s29Var.b) && this.c.equals(s29Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b)) * 1000003);
    }

    public final String toString() {
        byte[] bArr = this.b;
        String strEncodeToString = bArr == null ? "" : Base64.encodeToString(bArr, 2);
        StringBuilder sb = new StringBuilder("TransportContext(");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.c);
        sb.append(", ");
        return l1d.n(strEncodeToString, ")", sb);
    }
}
