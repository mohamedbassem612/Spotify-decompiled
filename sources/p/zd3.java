package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class zd3 implements ez00 {
    public final String a;
    public final h53 b;
    public final ArrayList c;
    public final long d;
    public final boolean e;

    public zd3(String str, h53 h53Var, ArrayList arrayList, long j, boolean z) {
        this.a = str;
        this.b = h53Var;
        this.c = arrayList;
        this.d = j;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zd3)) {
            return false;
        }
        zd3 zd3Var = (zd3) obj;
        return this.a.equals(zd3Var.a) && this.b.equals(zd3Var.b) && this.c.equals(zd3Var.c) && this.d == zd3Var.d && this.e == zd3Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + cy30.f(p3d1.f(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31), this.d, 31);
    }
}
