package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class e181 {
    public final String a;
    public final x360 b;
    public final ArrayList c;

    public e181(String str, ArrayList arrayList, x360 x360Var) {
        this.a = str;
        this.b = x360Var;
        this.c = arrayList;
    }

    public final List a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e181)) {
            return false;
        }
        e181 e181Var = (e181) obj;
        return this.a.equals(e181Var.a) && u890.j(this.b, e181Var.b) && this.c.equals(e181Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        x360 x360Var = this.b;
        return this.c.hashCode() + ((iHashCode + (x360Var == null ? 0 : x360Var.hashCode())) * 31);
    }
}
