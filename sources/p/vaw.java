package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class vaw extends iiw {
    public final boolean a;
    public final String b;
    public final String c;
    public final String d;
    public final Set e;
    public final boolean f;
    public final Set g;
    public final int h;

    public vaw(boolean z, String str, String str2, String str3, Set set, boolean z2, Set set2, int i) {
        this.a = z;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = set;
        this.f = z2;
        this.g = set2;
        this.h = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vaw)) {
            return false;
        }
        vaw vawVar = (vaw) obj;
        return this.a == vawVar.a && u890.j(this.b, vawVar.b) && u890.j(this.c, vawVar.c) && u890.j(this.d, vawVar.d) && u890.j(this.e, vawVar.e) && this.f == vawVar.f && u890.j(this.g, vawVar.g) && this.h == vawVar.h;
    }

    public final int hashCode() {
        return Integer.hashCode(this.h) + gvg.c(xcg1.g(gvg.c(cy30.d(cy30.d(cy30.d(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }
}
