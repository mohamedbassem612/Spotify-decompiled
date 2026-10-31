package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class pk0 {
    public final int a;
    public final String b;
    public final String c;
    public final ArrayList d;
    public final List e;

    public pk0(int i, String str, String str2, ArrayList arrayList) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = arrayList;
        this.e = o7h.a1(arrayList, new k0d((byte) 16));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pk0)) {
            return false;
        }
        pk0 pk0Var = (pk0) obj;
        return this.a == pk0Var.a && u890.j(this.b, pk0Var.b) && u890.j(this.c, pk0Var.c) && this.d.equals(pk0Var.d);
    }

    public final int hashCode() {
        int iD = cy30.d(l1d.C(this.a) * 31, 31, this.b);
        String str = this.c;
        return this.d.hashCode() + ((iD + (str == null ? 0 : str.hashCode())) * 31);
    }
}
