package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class bxs0 {
    public static final bxs0 g;
    public final String a;
    public final boolean b;
    public final String c;
    public final List d;
    public final Integer e;
    public final float f;

    static {
        String str = "";
        g = new bxs0(str, str, z6x.a, false);
    }

    public bxs0(String str, boolean z, String str2, List list, Integer num, float f) {
        this.a = str;
        this.b = z;
        this.c = str2;
        this.d = list;
        this.e = num;
        this.f = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bxs0)) {
            return false;
        }
        bxs0 bxs0Var = (bxs0) obj;
        return u890.j(this.a, bxs0Var.a) && this.b == bxs0Var.b && u890.j(this.c, bxs0Var.c) && u890.j(this.d, bxs0Var.d) && u890.j(this.e, bxs0Var.e) && Float.compare(this.f, bxs0Var.f) == 0;
    }

    public final int hashCode() {
        int iB = f4i1.b(cy30.d(xcg1.g(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        Integer num = this.e;
        return Float.hashCode(this.f) + ((iB + (num == null ? 0 : num.hashCode())) * 31);
    }

    public /* synthetic */ bxs0(String str, String str2, List list, boolean z) {
        this(str, z, str2, list, null, 0.0f);
    }
}
