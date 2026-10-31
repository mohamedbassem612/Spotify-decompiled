package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class il50 {
    public final String a;
    public final String b;
    public final ArrayList c;
    public final long d;

    public il50(long j, String str, String str2, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = arrayList;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof il50)) {
            return false;
        }
        il50 il50Var = (il50) obj;
        return u890.j(this.a, il50Var.a) && u890.j(this.b, il50Var.b) && this.c.equals(il50Var.c) && this.d == il50Var.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + p3d1.f(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31);
    }
}
