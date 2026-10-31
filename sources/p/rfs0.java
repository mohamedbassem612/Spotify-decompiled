package p;

import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class rfs0 {
    public final String a;
    public final byte[] b;
    public final String c;
    public final boolean d;
    public final long e;

    public rfs0(String str, byte[] bArr, String str2, boolean z, long j) {
        this.a = str;
        this.b = bArr;
        this.c = str2;
        this.d = z;
        this.e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (rfs0.class.equals(obj != null ? obj.getClass() : null)) {
            rfs0 rfs0Var = (rfs0) obj;
            if (u890.j(this.a, rfs0Var.a) && Arrays.equals(this.b, rfs0Var.b) && nhc1.S(this.c, rfs0Var.c, false) && this.d == rfs0Var.d && this.e == rfs0Var.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iF = ktd.f(this.a.hashCode() * 31, this.b, 31);
        String str = this.c;
        return Long.hashCode(this.e) + xcg1.g((iF + (str != null ? str.hashCode() : 0)) * 31, 31, this.d);
    }
}
