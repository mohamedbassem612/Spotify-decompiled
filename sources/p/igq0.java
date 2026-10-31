package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class igq0 {
    public final String a;
    public final String b;
    public final List c;
    public final boolean d;

    public igq0(String str, String str2, ArrayList arrayList, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = arrayList;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof igq0)) {
            return false;
        }
        igq0 igq0Var = (igq0) obj;
        return u890.j(this.a, igq0Var.a) && u890.j(this.b, igq0Var.b) && this.c.equals(igq0Var.c) && this.d == igq0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + f4i1.b(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
