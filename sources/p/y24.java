package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class y24 {
    public final String a;
    public final x360 b;
    public final ArrayList c;
    public final boolean d;

    public y24(String str, x360 x360Var, ArrayList arrayList, boolean z) {
        this.a = str;
        this.b = x360Var;
        this.c = arrayList;
        this.d = z;
    }

    public final List a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y24)) {
            return false;
        }
        y24 y24Var = (y24) obj;
        return this.a.equals(y24Var.a) && u890.j(this.b, y24Var.b) && this.c.equals(y24Var.c) && this.d == y24Var.d;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        x360 x360Var = this.b;
        return Boolean.hashCode(this.d) + p3d1.f(this.c, (iHashCode + (x360Var == null ? 0 : x360Var.hashCode())) * 31, 31);
    }
}
