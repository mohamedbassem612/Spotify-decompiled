package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class l1z0 {
    public final String a;
    public final String b;
    public final ArrayList c;
    public final String d;

    public l1z0(String str, String str2, String str3, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = arrayList;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l1z0)) {
            return false;
        }
        l1z0 l1z0Var = (l1z0) obj;
        return this.a.equals(l1z0Var.a) && u890.j(this.b, l1z0Var.b) && this.c.equals(l1z0Var.c) && this.d.equals(l1z0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p3d1.f(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31);
    }
}
