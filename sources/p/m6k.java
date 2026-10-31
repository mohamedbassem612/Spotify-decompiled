package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class m6k implements ez00 {
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final ArrayList e;
    public final ArrayList f;
    public final String g;
    public final Long h;
    public final int i;

    public m6k(String str, String str2, String str3, int i, ArrayList arrayList, ArrayList arrayList2, String str4, Long l, int i2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = arrayList;
        this.f = arrayList2;
        this.g = str4;
        this.h = l;
        this.i = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m6k)) {
            return false;
        }
        m6k m6kVar = (m6k) obj;
        return this.a.equals(m6kVar.a) && this.b.equals(m6kVar.b) && this.c.equals(m6kVar.c) && this.d == m6kVar.d && this.e.equals(m6kVar.e) && this.f.equals(m6kVar.f) && this.g.equals(m6kVar.g) && u890.j(this.h, m6kVar.h) && this.i == m6kVar.i;
    }

    public final int hashCode() {
        int iD = cy30.d(p3d1.f(this.f, p3d1.f(this.e, ab80.k(this.d, cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31), 31), 31, this.g);
        Long l = this.h;
        return Integer.hashCode(this.i) + ((iD + (l == null ? 0 : l.hashCode())) * 31);
    }
}
