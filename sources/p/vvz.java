package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class vvz implements o700 {
    public final String a;
    public final String b;
    public final ArrayList c;

    public vvz(String str, String str2, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vvz)) {
            return false;
        }
        vvz vvzVar = (vvz) obj;
        return u890.j(this.a, vvzVar.a) && this.b.equals(vvzVar.b) && this.c.equals(vvzVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
