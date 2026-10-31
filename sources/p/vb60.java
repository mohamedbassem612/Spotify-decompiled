package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class vb60 {
    public final String a;
    public final ArrayList b;
    public final cmt c;
    public final String d;
    public final ArrayList e;

    public vb60(String str, ArrayList arrayList, cmt cmtVar, String str2, ArrayList arrayList2) {
        this.a = str;
        this.b = arrayList;
        this.c = cmtVar;
        this.d = str2;
        this.e = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vb60)) {
            return false;
        }
        vb60 vb60Var = (vb60) obj;
        return this.a.equals(vb60Var.a) && this.b.equals(vb60Var.b) && this.c.equals(vb60Var.c) && u890.j(this.d, vb60Var.d) && this.e.equals(vb60Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + cy30.d((this.c.hashCode() + p3d1.f(this.b, this.a.hashCode() * 31, 31)) * 31, 31, this.d);
    }
}
