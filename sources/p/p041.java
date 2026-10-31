package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class p041 {
    public final String a;
    public final String b;
    public final ArrayList c;
    public final String d;

    public p041(String str, String str2, String str3, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = arrayList;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p041)) {
            return false;
        }
        p041 p041Var = (p041) obj;
        return this.a.equals(p041Var.a) && this.b.equals(p041Var.b) && this.c.equals(p041Var.c) && this.d.equals(p041Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p3d1.f(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31);
    }
}
