package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class mgk0 extends tgk0 {
    public final ArrayList a;
    public final String b;

    public mgk0(ArrayList arrayList, String str) {
        this.a = arrayList;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mgk0)) {
            return false;
        }
        mgk0 mgk0Var = (mgk0) obj;
        return this.a.equals(mgk0Var.a) && this.b.equals(mgk0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
