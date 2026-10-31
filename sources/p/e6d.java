package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class e6d {
    public final ArrayList a;
    public final String b;
    public final x360 c;

    public e6d(String str, ArrayList arrayList, x360 x360Var) {
        this.a = arrayList;
        this.b = str;
        this.c = x360Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e6d)) {
            return false;
        }
        e6d e6dVar = (e6d) obj;
        return this.a.equals(e6dVar.a) && this.b.equals(e6dVar.b) && u890.j(this.c, e6dVar.c);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        x360 x360Var = this.c;
        return iD + (x360Var == null ? 0 : x360Var.hashCode());
    }
}
