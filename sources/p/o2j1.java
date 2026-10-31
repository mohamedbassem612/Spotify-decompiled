package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class o2j1 {
    public final String a;
    public final ArrayList b;

    public o2j1(String str, ArrayList arrayList) {
        this.a = str;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o2j1)) {
            return false;
        }
        o2j1 o2j1Var = (o2j1) obj;
        return this.a.equals(o2j1Var.a) && this.b.equals(o2j1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
