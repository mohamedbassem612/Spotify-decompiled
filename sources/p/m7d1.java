package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class m7d1 {
    public final String a;
    public final int b;
    public final String c;
    public final String d;
    public final ArrayList e;

    public m7d1(int i, String str, String str2, String str3, ArrayList arrayList) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = str3;
        this.e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m7d1)) {
            return false;
        }
        m7d1 m7d1Var = (m7d1) obj;
        return this.a.equals(m7d1Var.a) && this.b == m7d1Var.b && this.c.equals(m7d1Var.c) && this.d.equals(m7d1Var.d) && this.e.equals(m7d1Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + cy30.d(cy30.d(ab80.k(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31, this.d);
    }
}
