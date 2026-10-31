package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class msg0 {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final List d;
    public final int e;

    public msg0(int i, String str, List list, boolean z, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = list;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof msg0)) {
            return false;
        }
        msg0 msg0Var = (msg0) obj;
        return u890.j(this.a, msg0Var.a) && this.b == msg0Var.b && this.c == msg0Var.c && this.d.equals(msg0Var.d) && this.e == msg0Var.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + f4i1.b(xcg1.g(xcg1.g(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }
}
