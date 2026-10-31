package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class v630 {
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public final ArrayList e;

    public v630(String str, String str2, String str3, long j, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = j;
        this.e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v630)) {
            return false;
        }
        v630 v630Var = (v630) obj;
        return u890.j(this.a, v630Var.a) && u890.j(this.b, v630Var.b) && u890.j(this.c, v630Var.c) && this.d == v630Var.d && this.e.equals(v630Var.e);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return this.e.hashCode() + cy30.f((iD + (str == null ? 0 : str.hashCode())) * 31, this.d, 31);
    }
}
