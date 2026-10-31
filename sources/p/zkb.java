package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class zkb implements dlb {
    public final String a;
    public final String b;
    public final String c;
    public final ArrayList d;
    public final xkb e;

    public zkb(String str, String str2, String str3, ArrayList arrayList, xkb xkbVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = arrayList;
        this.e = xkbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zkb)) {
            return false;
        }
        zkb zkbVar = (zkb) obj;
        return this.a.equals(zkbVar.a) && this.b.equals(zkbVar.b) && u890.j(this.c, zkbVar.c) && this.d.equals(zkbVar.d) && this.e.equals(zkbVar.e);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return this.e.hashCode() + p3d1.f(this.d, (iD + (str == null ? 0 : str.hashCode())) * 31, 31);
    }
}
