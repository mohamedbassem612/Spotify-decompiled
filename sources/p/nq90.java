package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class nq90 {
    public final String a;
    public final String b;
    public final String c;
    public final ArrayList d;

    public nq90(String str, String str2, String str3, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nq90)) {
            return false;
        }
        nq90 nq90Var = (nq90) obj;
        return u890.j(this.a, nq90Var.a) && u890.j(this.b, nq90Var.b) && u890.j(this.c, nq90Var.c) && this.d.equals(nq90Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + xcg1.g(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, true);
    }
}
