package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class xf51 {
    public final String a;
    public final String b;
    public final String c;
    public final ArrayList d;

    public xf51(String str, String str2, String str3, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xf51)) {
            return false;
        }
        xf51 xf51Var = (xf51) obj;
        return this.a.equals(xf51Var.a) && this.b.equals(xf51Var.b) && this.c.equals(xf51Var.c) && this.d.equals(xf51Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
