package p;

import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class vd00 {
    public final String a;
    public final String b;
    public final byte[] c;
    public final String d;
    public final Long e;
    public final long f;
    public final long g;

    public vd00(String str, String str2, byte[] bArr, String str3, Long l, long j, long j2) {
        this.a = str;
        this.b = str2;
        this.c = bArr;
        this.d = str3;
        this.e = l;
        this.f = j;
        this.g = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!vd00.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        vd00 vd00Var = (vd00) obj;
        return u890.j(this.a, vd00Var.a) && u890.j(this.b, vd00Var.b) && Arrays.equals(this.c, vd00Var.c) && u890.j(this.d, vd00Var.d) && u890.j(this.e, vd00Var.e) && this.f == vd00Var.f && this.g == vd00Var.g;
    }

    public final int hashCode() {
        int iD = cy30.d(ktd.f(cy30.d(this.b.hashCode() * 31, 31, this.a), this.c, 31), 31, this.d);
        Long l = this.e;
        return Long.hashCode(this.g) + cy30.f((iD + (l != null ? Long.hashCode(l.longValue()) : 0)) * 31, this.f, 31);
    }
}
