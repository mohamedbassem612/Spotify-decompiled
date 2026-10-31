package p;

import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class jd9 implements md9 {
    public final String a;
    public final ee9 b;
    public final byte[] c;
    public final rvz0 d;

    public jd9(String str, ee9 ee9Var, byte[] bArr, rvz0 rvz0Var) {
        this.a = str;
        this.b = ee9Var;
        this.c = bArr;
        this.d = rvz0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!jd9.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        jd9 jd9Var = (jd9) obj;
        return this.a.equals(jd9Var.a) && this.b.equals(jd9Var.b) && Arrays.equals(this.c, jd9Var.c) && this.d.equals(jd9Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ktd.f((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, this.c, 31);
    }
}
