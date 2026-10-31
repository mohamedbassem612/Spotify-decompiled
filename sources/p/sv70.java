package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class sv70 {
    public final String a;
    public final String b;
    public final ArrayList c;
    public final String d;

    public sv70(String str, String str2, String str3, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = arrayList;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sv70)) {
            return false;
        }
        sv70 sv70Var = (sv70) obj;
        return u890.j(this.a, sv70Var.a) && u890.j(this.b, sv70Var.b) && this.c.equals(sv70Var.c) && u890.j(this.d, sv70Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p3d1.f(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31);
    }
}
