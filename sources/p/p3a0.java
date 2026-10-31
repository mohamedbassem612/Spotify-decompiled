package p;

import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class p3a0 implements q3a0 {
    public final String a;
    public final ee9 b;
    public final byte[] c;

    public p3a0(String str, ee9 ee9Var, byte[] bArr) {
        this.a = str;
        this.b = ee9Var;
        this.c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!p3a0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        p3a0 p3a0Var = (p3a0) obj;
        return this.a.equals(p3a0Var.a) && this.b.equals(p3a0Var.b) && Arrays.equals(this.c, p3a0Var.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
