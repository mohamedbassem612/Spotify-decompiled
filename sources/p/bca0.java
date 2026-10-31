package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class bca0 implements cca0 {
    public final wea0 a;
    public final String b;
    public final Set c;
    public final String d;

    public bca0(wea0 wea0Var, String str, Set set, String str2) {
        this.a = wea0Var;
        this.b = str;
        this.c = set;
        this.d = str2;
    }

    public final wea0 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bca0)) {
            return false;
        }
        bca0 bca0Var = (bca0) obj;
        return u890.j(this.a, bca0Var.a) && u890.j(this.b, bca0Var.b) && u890.j(this.c, bca0Var.c) && u890.j(this.d, bca0Var.d);
    }

    public final int hashCode() {
        int iC = gvg.c(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
