package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class c7a1 {
    public final String a;
    public final ArrayList b;

    public c7a1(String str, ArrayList arrayList) {
        this.a = str;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c7a1)) {
            return false;
        }
        c7a1 c7a1Var = (c7a1) obj;
        return this.a.equals(c7a1Var.a) && this.b.equals(c7a1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
