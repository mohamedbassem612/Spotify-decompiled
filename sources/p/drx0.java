package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class drx0 extends frx0 {
    public final String a;
    public final String b;
    public final Set c;
    public final Set d;

    public drx0(String str, String str2, Set set, Set set2) {
        this.a = str;
        this.b = str2;
        this.c = set;
        this.d = set2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof drx0)) {
            return false;
        }
        drx0 drx0Var = (drx0) obj;
        return u890.j(this.a, drx0Var.a) && u890.j(this.b, drx0Var.b) && u890.j(this.c, drx0Var.c) && u890.j(this.d, drx0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + gvg.c(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
