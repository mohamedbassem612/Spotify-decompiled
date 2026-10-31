package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class nkd1 {
    public final String a;
    public final String b;
    public final String c;
    public final List d;
    public final List e;

    public nkd1(List list, List list2, String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
        this.e = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nkd1)) {
            return false;
        }
        nkd1 nkd1Var = (nkd1) obj;
        if (u890.j(this.a, nkd1Var.a) && u890.j(this.b, nkd1Var.b) && u890.j(this.c, nkd1Var.c) && this.d.equals(nkd1Var.d)) {
            return this.e.equals(nkd1Var.e);
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + f4i1.b(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        return jhc1.C(jhc1.K("\n            |ForeignKey {\n            |   referenceTable = '" + this.a + "',\n            |   onDelete = '" + this.b + "',\n            |   onUpdate = '" + this.c + "',\n            |   columnNames = {" + tyo1.o(o7h.Z0(this.d)) + "\n            |   referenceColumnNames = {" + tyo1.n(o7h.Z0(this.e)) + "\n            |}\n        "));
    }
}
