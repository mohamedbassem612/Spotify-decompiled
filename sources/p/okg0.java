package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class okg0 extends tkg0 {
    public final boolean a;
    public final List b;
    public final String c;

    public okg0(String str, ArrayList arrayList, boolean z) {
        this.a = z;
        this.b = arrayList;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof okg0)) {
            return false;
        }
        okg0 okg0Var = (okg0) obj;
        return this.a == okg0Var.a && this.b.equals(okg0Var.b) && u890.j(this.c, okg0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + f4i1.b(xcg1.g(Boolean.hashCode(true) * 31, 31, this.a), 961, this.b);
    }
}
