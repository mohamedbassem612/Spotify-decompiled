package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class lju0 implements tju0 {
    public final ArrayList a;
    public final String b;
    public final boolean c;

    public lju0(String str, ArrayList arrayList, boolean z) {
        this.a = arrayList;
        this.b = str;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lju0)) {
            return false;
        }
        lju0 lju0Var = (lju0) obj;
        return this.a.equals(lju0Var.a) && u890.j(this.b, lju0Var.b) && this.c == lju0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
