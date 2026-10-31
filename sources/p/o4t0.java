package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class o4t0 {
    public final String a;
    public final ArrayList b;

    public o4t0(String str, ArrayList arrayList) {
        this.a = str;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o4t0)) {
            return false;
        }
        o4t0 o4t0Var = (o4t0) obj;
        return this.a.equals(o4t0Var.a) && this.b.equals(o4t0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
