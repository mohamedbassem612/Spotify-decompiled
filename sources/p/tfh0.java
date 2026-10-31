package p;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class tfh0 {
    public final String a;
    public final long b;
    public final long c;
    public final ArrayList d;
    public final LinkedHashMap e;

    public tfh0(String str, long j, long j2, ArrayList arrayList, LinkedHashMap linkedHashMap) {
        this.a = str;
        this.b = j;
        this.c = j2;
        this.d = arrayList;
        this.e = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tfh0)) {
            return false;
        }
        tfh0 tfh0Var = (tfh0) obj;
        return u890.j(this.a, tfh0Var.a) && this.b == tfh0Var.b && this.c == tfh0Var.c && this.d.equals(tfh0Var.d) && this.e.equals(tfh0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + p3d1.f(this.d, cy30.f(cy30.f(this.a.hashCode() * 31, this.b, 31), this.c, 31), 31);
    }
}
