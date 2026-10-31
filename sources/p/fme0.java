package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class fme0 extends gme0 {
    public final String a;
    public final ArrayList b;

    public fme0(String str, ArrayList arrayList) {
        this.a = str;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fme0)) {
            return false;
        }
        fme0 fme0Var = (fme0) obj;
        return u890.j(this.a, fme0Var.a) && this.b.equals(fme0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
