package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class nix extends pix {
    public final String a;
    public final String b;
    public final List c;
    public final String d;

    public /* synthetic */ nix(String str, String str2, c9 c9Var, String str3, int i) {
        this(str, (i & 4) != 0 ? z6x.a : c9Var, str2, (i & 8) != 0 ? null : str3);
    }

    public final String a() {
        return this.d;
    }

    public final String b() {
        return this.a;
    }

    public final String c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nix)) {
            return false;
        }
        nix nixVar = (nix) obj;
        return u890.j(this.a, nixVar.a) && u890.j(this.b, nixVar.b) && u890.j(this.c, nixVar.c) && u890.j(this.d, nixVar.d);
    }

    public final int hashCode() {
        int iB = f4i1.b(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return iB + (str == null ? 0 : str.hashCode());
    }

    public nix(String str, List list, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = str3;
    }
}
