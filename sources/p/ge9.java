package p;

import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ge9 {
    public final String a;
    public final ee9 b;
    public final byte[] c;
    public final rvz0 d;

    public ge9(String str, ee9 ee9Var, byte[] bArr, rvz0 rvz0Var) {
        this.a = str;
        this.b = ee9Var;
        this.c = bArr;
        this.d = rvz0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!ge9.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        ge9 ge9Var = (ge9) obj;
        return this.a.equals(ge9Var.a) && this.b.equals(ge9Var.b) && Arrays.equals(this.c, ge9Var.c) && this.d.equals(ge9Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ktd.f((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, this.c, 31);
    }
}
