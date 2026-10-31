package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class bsx0 extends ktx0 {
    public final String a;
    public final String b;
    public final Set c;
    public final Set d;

    public bsx0(String str, String str2, Set set, Set set2) {
        this.a = str;
        this.b = str2;
        this.c = set;
        this.d = set2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bsx0)) {
            return false;
        }
        bsx0 bsx0Var = (bsx0) obj;
        return u890.j(this.a, bsx0Var.a) && u890.j(this.b, bsx0Var.b) && u890.j(this.c, bsx0Var.c) && u890.j(this.d, bsx0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + gvg.c(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
