package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class va60 {
    public final ya60 a;
    public final String b;
    public final ArrayList c;

    public va60(ya60 ya60Var, String str, ArrayList arrayList) {
        this.a = ya60Var;
        this.b = str;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof va60)) {
            return false;
        }
        va60 va60Var = (va60) obj;
        return u890.j(this.a, va60Var.a) && this.b.equals(va60Var.b) && this.c.equals(va60Var.c);
    }

    public final int hashCode() {
        ya60 ya60Var = this.a;
        return this.c.hashCode() + cy30.d((ya60Var == null ? 0 : ya60Var.hashCode()) * 31, 31, this.b);
    }
}
