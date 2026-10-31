package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class jju {
    public final String a;
    public final String b;
    public final List c;

    public jju(String str, String str2, smc0 smc0Var) {
        this.a = str;
        this.b = str2;
        this.c = smc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jju)) {
            return false;
        }
        jju jjuVar = (jju) obj;
        return u890.j(this.a, jjuVar.a) && u890.j(this.b, jjuVar.b) && this.c.equals(jjuVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
