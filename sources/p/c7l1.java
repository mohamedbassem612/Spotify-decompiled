package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class c7l1 extends sqe {
    public final String d;
    public final String e;
    public final String f;
    public final ArrayList g;
    public final e7l1 h;
    public final String i;

    public c7l1(String str, String str2, String str3, ArrayList arrayList, e7l1 e7l1Var, String str4) {
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = arrayList;
        this.h = e7l1Var;
        this.i = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c7l1)) {
            return false;
        }
        c7l1 c7l1Var = (c7l1) obj;
        return this.d.equals(c7l1Var.d) && this.e.equals(c7l1Var.e) && this.f.equals(c7l1Var.f) && this.g.equals(c7l1Var.g) && this.h.equals(c7l1Var.h) && this.i.equals(c7l1Var.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + ((this.h.hashCode() + p3d1.f(this.g, cy30.d(cy30.d(this.d.hashCode() * 31, 31, this.e), 31, this.f), 31)) * 31);
    }
}
