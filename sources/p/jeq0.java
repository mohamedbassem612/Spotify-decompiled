package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class jeq0 {
    public final String a;
    public final String b;
    public final List c;
    public final String d;
    public final boolean e;

    public jeq0(String str, String str2, String str3, ArrayList arrayList, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = arrayList;
        this.d = str3;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jeq0)) {
            return false;
        }
        jeq0 jeq0Var = (jeq0) obj;
        return u890.j(this.a, jeq0Var.a) && u890.j(this.b, jeq0Var.b) && this.c.equals(jeq0Var.c) && u890.j(this.d, jeq0Var.d) && this.e == jeq0Var.e;
    }

    public final int hashCode() {
        int iB = f4i1.b(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return Boolean.hashCode(this.e) + ((iB + (str == null ? 0 : str.hashCode())) * 31);
    }
}
