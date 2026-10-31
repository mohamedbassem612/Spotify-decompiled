package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class lkd0 {
    public final String a;
    public final String b;
    public final long c;
    public final ArrayList d;

    public lkd0(long j, String str, String str2, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lkd0)) {
            return false;
        }
        lkd0 lkd0Var = (lkd0) obj;
        return this.a.equals(lkd0Var.a) && this.b.equals(lkd0Var.b) && this.c == lkd0Var.c && this.d.equals(lkd0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.f(cy30.d(this.a.hashCode() * 31, 31, this.b), this.c, 31);
    }
}
