package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class gaq0 extends jaq0 {
    public final ArrayList a;
    public final String b;

    public gaq0(ArrayList arrayList, String str) {
        this.a = arrayList;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gaq0)) {
            return false;
        }
        gaq0 gaq0Var = (gaq0) obj;
        return this.a.equals(gaq0Var.a) && this.b.equals(gaq0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
