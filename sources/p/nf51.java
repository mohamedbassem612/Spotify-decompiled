package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class nf51 extends zf51 {
    public final String a;
    public final String b;
    public final String c;
    public final ArrayList d;
    public final String e;

    public nf51(String str, String str2, String str3, String str4, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = arrayList;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nf51)) {
            return false;
        }
        nf51 nf51Var = (nf51) obj;
        return u890.j(this.a, nf51Var.a) && u890.j(this.b, nf51Var.b) && u890.j(this.c, nf51Var.c) && this.d.equals(nf51Var.d) && this.e.equals(nf51Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + p3d1.f(this.d, cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31);
    }
}
