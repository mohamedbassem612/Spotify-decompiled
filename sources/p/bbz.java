package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class bbz {
    public final String a;
    public final ArrayList b;
    public final ArrayList c;
    public final boolean d;

    public bbz(String str, ArrayList arrayList, ArrayList arrayList2, boolean z) {
        this.a = str;
        this.b = arrayList;
        this.c = arrayList2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bbz)) {
            return false;
        }
        bbz bbzVar = (bbz) obj;
        return this.a.equals(bbzVar.a) && this.b.equals(bbzVar.b) && this.c.equals(bbzVar.c) && this.d == bbzVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + p3d1.f(this.c, p3d1.f(this.b, this.a.hashCode() * 31, 31), 961);
    }
}
