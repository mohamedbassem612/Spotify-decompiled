package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class zaq0 {
    public final String a;
    public final String b;
    public final ArrayList c;
    public final String d;

    public zaq0(String str, String str2, String str3, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = arrayList;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zaq0)) {
            return false;
        }
        zaq0 zaq0Var = (zaq0) obj;
        return this.a.equals(zaq0Var.a) && this.b.equals(zaq0Var.b) && this.c.equals(zaq0Var.c) && u890.j(this.d, zaq0Var.d);
    }

    public final int hashCode() {
        int iF = p3d1.f(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31);
        String str = this.d;
        return iF + (str == null ? 0 : str.hashCode());
    }
}
