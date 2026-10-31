package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class sie0 {
    public final rne0 a;
    public final String b;
    public final int c;
    public final uwc1 d;
    public final List e;

    public /* synthetic */ sie0(rne0 rne0Var, int i) {
        this((i & 1) != 0 ? null : rne0Var, "", (i & 4) != 0 ? 1 : 3, swc1.a, z6x.a);
    }

    public static sie0 a(sie0 sie0Var, rne0 rne0Var, String str, int i, uwc1 uwc1Var, List list, int i2) {
        if ((i2 & 1) != 0) {
            rne0Var = sie0Var.a;
        }
        rne0 rne0Var2 = rne0Var;
        if ((i2 & 2) != 0) {
            str = sie0Var.b;
        }
        String str2 = str;
        if ((i2 & 4) != 0) {
            i = sie0Var.c;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            uwc1Var = sie0Var.d;
        }
        uwc1 uwc1Var2 = uwc1Var;
        if ((i2 & 16) != 0) {
            list = sie0Var.e;
        }
        sie0Var.getClass();
        return new sie0(rne0Var2, str2, i3, uwc1Var2, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sie0)) {
            return false;
        }
        sie0 sie0Var = (sie0) obj;
        return u890.j(this.a, sie0Var.a) && u890.j(this.b, sie0Var.b) && this.c == sie0Var.c && u890.j(this.d, sie0Var.d) && u890.j(this.e, sie0Var.e);
    }

    public final int hashCode() {
        rne0 rne0Var = this.a;
        return this.e.hashCode() + ((this.d.hashCode() + ab80.k(this.c, cy30.d((rne0Var == null ? 0 : rne0Var.hashCode()) * 31, 31, this.b), 31)) * 31);
    }

    public sie0(rne0 rne0Var, String str, int i, uwc1 uwc1Var, List list) {
        this.a = rne0Var;
        this.b = str;
        this.c = i;
        this.d = uwc1Var;
        this.e = list;
    }
}
