package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class nuo0 extends puo0 {
    public final ArrayList a;
    public final int b;
    public final String c;

    public nuo0(int i, String str, ArrayList arrayList) {
        this.a = arrayList;
        this.b = i;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nuo0)) {
            return false;
        }
        nuo0 nuo0Var = (nuo0) obj;
        return this.a.equals(nuo0Var.a) && this.b == nuo0Var.b && this.c.equals(nuo0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + kaa0.f(this.b, this.a.hashCode() * 31, 31);
    }
}
