package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class yt60 extends ru60 {
    public final String a;
    public final kda0 b;
    public final String c;
    public final wea0 d;
    public final boolean e;
    public final Set f;

    public yt60(String str, kda0 kda0Var, String str2, wea0 wea0Var, boolean z, Set set) {
        this.a = str;
        this.b = kda0Var;
        this.c = str2;
        this.d = wea0Var;
        this.e = z;
        this.f = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yt60)) {
            return false;
        }
        yt60 yt60Var = (yt60) obj;
        return u890.j(this.a, yt60Var.a) && this.b == yt60Var.b && u890.j(this.c, yt60Var.c) && this.d.equals(yt60Var.d) && this.e == yt60Var.e && this.f.equals(yt60Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + xcg1.g((this.d.hashCode() + cy30.d((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c)) * 31, 31, this.e);
    }
}
