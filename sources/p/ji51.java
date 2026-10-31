package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ji51 extends ki51 {
    public final int a;
    public final ArrayList b;
    public final String c;

    public ji51(int i, String str, ArrayList arrayList) {
        this.a = i;
        this.b = arrayList;
        this.c = str;
    }

    public final int a() {
        return this.a;
    }

    public final List b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ji51)) {
            return false;
        }
        ji51 ji51Var = (ji51) obj;
        return this.a == ji51Var.a && this.b.equals(ji51Var.b) && this.c.equals(ji51Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + p3d1.f(this.b, l1d.C(this.a) * 31, 31);
    }
}
