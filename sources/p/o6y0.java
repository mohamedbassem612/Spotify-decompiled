package p;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class o6y0 {
    public final UUID a;
    public final boolean b;
    public final List c;

    public o6y0(UUID uuid, boolean z, List list) {
        this.a = uuid;
        this.b = z;
        this.c = list;
    }

    public static o6y0 a(o6y0 o6y0Var, ArrayList arrayList, int i) {
        UUID uuid = o6y0Var.a;
        boolean z = (i & 2) != 0 ? o6y0Var.b : true;
        List list = arrayList;
        if ((i & 4) != 0) {
            list = o6y0Var.c;
        }
        o6y0Var.getClass();
        return new o6y0(uuid, z, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o6y0)) {
            return false;
        }
        o6y0 o6y0Var = (o6y0) obj;
        return u890.j(this.a, o6y0Var.a) && this.b == o6y0Var.b && this.c.equals(o6y0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + xcg1.g(this.a.hashCode() * 31, 31, this.b);
    }
}
