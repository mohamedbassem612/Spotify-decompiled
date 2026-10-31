package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class hqv0 extends ayq0 {
    public final String b;
    public final ArrayList c;
    public final ave0 d;

    public hqv0(String str, ArrayList arrayList, ave0 ave0Var) {
        super(5);
        this.b = str;
        this.c = arrayList;
        this.d = ave0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hqv0)) {
            return false;
        }
        hqv0 hqv0Var = (hqv0) obj;
        return u890.j(this.b, hqv0Var.b) && this.c.equals(hqv0Var.c) && this.d.equals(hqv0Var.d);
    }

    public final int hashCode() {
        String str = this.b;
        return this.d.hashCode() + p3d1.f(this.c, (str == null ? 0 : str.hashCode()) * 31, 31);
    }
}
