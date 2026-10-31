package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class wjl {
    public final String a;
    public final String b;
    public final ArrayList c;
    public ArrayList d;

    public wjl(String str, String str2, ArrayList arrayList, ArrayList arrayList2) {
        this.a = str;
        this.b = str2;
        this.c = arrayList;
        this.d = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wjl)) {
            return false;
        }
        wjl wjlVar = (wjl) obj;
        return u890.j(this.a, wjlVar.a) && u890.j(this.b, wjlVar.b) && this.c.equals(wjlVar.c) && this.d.equals(wjlVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p3d1.f(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31);
    }
}
