package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class pl11 {
    public final String a;
    public final ArrayList b;

    public pl11(String str, ArrayList arrayList) {
        this.a = str;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pl11)) {
            return false;
        }
        pl11 pl11Var = (pl11) obj;
        return this.a.equals(pl11Var.a) && this.b.equals(pl11Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
