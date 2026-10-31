package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class hev0 {
    public final String a;
    public final ArrayList b;
    public final boolean c;

    public hev0(String str, ArrayList arrayList, boolean z) {
        this.a = str;
        this.b = arrayList;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hev0)) {
            return false;
        }
        hev0 hev0Var = (hev0) obj;
        return u890.j(this.a, hev0Var.a) && this.b.equals(hev0Var.b) && this.c == hev0Var.c;
    }

    public final int hashCode() {
        String str = this.a;
        return Boolean.hashCode(this.c) + p3d1.f(this.b, (str == null ? 0 : str.hashCode()) * 31, 31);
    }
}
