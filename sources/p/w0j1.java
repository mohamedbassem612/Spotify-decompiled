package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class w0j1 implements x0j1 {
    public final String a;
    public final ArrayList b;

    public w0j1(String str, ArrayList arrayList) {
        this.a = str;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0j1)) {
            return false;
        }
        w0j1 w0j1Var = (w0j1) obj;
        return this.a.equals(w0j1Var.a) && this.b.equals(w0j1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
