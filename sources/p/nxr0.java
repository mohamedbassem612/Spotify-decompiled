package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class nxr0 {
    public final String a;
    public final boolean b;
    public final ArrayList c;
    public final ArrayList d;

    public nxr0(String str, ArrayList arrayList, ArrayList arrayList2, boolean z) {
        this.a = str;
        this.b = z;
        this.c = arrayList;
        this.d = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nxr0)) {
            return false;
        }
        nxr0 nxr0Var = (nxr0) obj;
        return this.a.equals(nxr0Var.a) && this.b == nxr0Var.b && this.c.equals(nxr0Var.c) && this.d.equals(nxr0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p3d1.f(this.c, xcg1.g(this.a.hashCode() * 31, 31, this.b), 31);
    }
}
