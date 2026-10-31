package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class p861 extends q861 {
    public final ArrayList a;
    public final String b;

    public p861(ArrayList arrayList, String str) {
        this.a = arrayList;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p861)) {
            return false;
        }
        p861 p861Var = (p861) obj;
        return this.a.equals(p861Var.a) && u890.j(this.b, p861Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
