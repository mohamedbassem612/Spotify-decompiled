package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class n8q0 implements p8q0 {
    public final String a;
    public final String b;
    public final int c;
    public final ArrayList d;
    public final String e;

    public n8q0(int i, String str, String str2, String str3, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = arrayList;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n8q0)) {
            return false;
        }
        n8q0 n8q0Var = (n8q0) obj;
        return this.a.equals(n8q0Var.a) && this.b.equals(n8q0Var.b) && this.c == n8q0Var.c && this.d.equals(n8q0Var.d) && this.e.equals(n8q0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + p3d1.f(this.d, kaa0.f(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31), 31);
    }
}
