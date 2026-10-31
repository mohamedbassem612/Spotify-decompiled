package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class vb81 extends zb81 {
    public final String a;
    public final String b;
    public final String c;
    public final ArrayList d;

    public vb81(String str, String str2, String str3, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vb81)) {
            return false;
        }
        vb81 vb81Var = (vb81) obj;
        return this.a.equals(vb81Var.a) && this.b.equals(vb81Var.b) && u890.j(this.c, vb81Var.c) && this.d.equals(vb81Var.d);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return this.d.hashCode() + ((iD + (str == null ? 0 : str.hashCode())) * 31);
    }
}
