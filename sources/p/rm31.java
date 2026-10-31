package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class rm31 {
    public final String a;
    public final ArrayList b;

    public rm31(String str, ArrayList arrayList) {
        this.a = str;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rm31)) {
            return false;
        }
        rm31 rm31Var = (rm31) obj;
        return this.a.equals(rm31Var.a) && this.b.equals(rm31Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
