package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ff51 extends zf51 {
    public final String a;
    public final String b;
    public final String c;
    public final ArrayList d;
    public final boolean e;

    public ff51(String str, String str2, String str3, ArrayList arrayList, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = arrayList;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ff51)) {
            return false;
        }
        ff51 ff51Var = (ff51) obj;
        return u890.j(this.a, ff51Var.a) && u890.j(this.b, ff51Var.b) && u890.j(this.c, ff51Var.c) && this.d.equals(ff51Var.d) && this.e == ff51Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + p3d1.f(this.d, cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31);
    }
}
