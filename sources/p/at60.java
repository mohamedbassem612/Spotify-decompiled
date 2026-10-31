package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class at60 extends jto1 {
    public final String b;
    public final kda0 c;
    public final String d;
    public final wea0 e;
    public final boolean f;
    public final Set g;

    public at60(String str, kda0 kda0Var, String str2, wea0 wea0Var, boolean z, Set set) {
        this.b = str;
        this.c = kda0Var;
        this.d = str2;
        this.e = wea0Var;
        this.f = z;
        this.g = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof at60)) {
            return false;
        }
        at60 at60Var = (at60) obj;
        return u890.j(this.b, at60Var.b) && this.c == at60Var.c && u890.j(this.d, at60Var.d) && this.e.equals(at60Var.e) && this.f == at60Var.f && this.g.equals(at60Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + xcg1.g((this.e.hashCode() + cy30.d((this.c.hashCode() + (this.b.hashCode() * 31)) * 31, 31, this.d)) * 31, 31, this.f);
    }
}
