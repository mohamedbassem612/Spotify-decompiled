package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class umc0 {
    public final String a;
    public final List b;
    public final int c;

    public umc0(String str, List list, int i) {
        this.a = str;
        this.b = list;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof umc0)) {
            return false;
        }
        umc0 umc0Var = (umc0) obj;
        return this.a.equals(umc0Var.a) && this.b.equals(umc0Var.b) && this.c == umc0Var.c;
    }

    public final int hashCode() {
        return l1d.C(this.c) + f4i1.b(this.a.hashCode() * 31, 31, this.b);
    }
}
