package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class dey {
    public final ArrayList a;
    public final String b;
    public final int c;
    public final int d;
    public final String e;

    public dey(ArrayList arrayList, String str, int i, int i2, String str2) {
        this.a = arrayList;
        this.b = str;
        this.c = i;
        this.d = i2;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dey)) {
            return false;
        }
        dey deyVar = (dey) obj;
        return this.a.equals(deyVar.a) && u890.j(this.b, deyVar.b) && this.c == deyVar.c && this.d == deyVar.d && u890.j(this.e, deyVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ab80.k(this.d, kaa0.f(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31), 31);
    }
}
