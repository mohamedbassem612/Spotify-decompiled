package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class y42 implements c52 {
    public final ArrayList a;
    public final String b;
    public final boolean c;

    public y42(String str, ArrayList arrayList, boolean z) {
        this.a = arrayList;
        this.b = str;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y42)) {
            return false;
        }
        y42 y42Var = (y42) obj;
        return this.a.equals(y42Var.a) && u890.j(this.b, y42Var.b) && this.c == y42Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
