package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class pzg1 {
    public final String a;
    public final String b;
    public final ArrayList c;
    public final long d;
    public final long e;
    public final ira f;

    public pzg1(String str, String str2, ArrayList arrayList, long j, long j2, ira iraVar) {
        this.a = str;
        this.b = str2;
        this.c = arrayList;
        this.d = j;
        this.e = j2;
        this.f = iraVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof pzg1) {
            pzg1 pzg1Var = (pzg1) obj;
            if (this.a.equals(pzg1Var.a) && this.b.equals(pzg1Var.b) && this.c.equals(pzg1Var.c)) {
                long j = pzg1Var.d;
                int i = u7h.l;
                return z4h1.b(this.d, j) && z4h1.b(this.e, pzg1Var.e) && this.f == pzg1Var.f;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iF = p3d1.f(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31);
        int i = u7h.l;
        return this.f.hashCode() + cy30.f(cy30.f(iF, this.d, 31), this.e, 31);
    }
}
