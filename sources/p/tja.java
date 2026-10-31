package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class tja {
    public final String a;
    public final ArrayList b;
    public final String c;
    public final String d;

    public tja(String str, String str2, String str3, ArrayList arrayList) {
        this.a = str;
        this.b = arrayList;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tja)) {
            return false;
        }
        tja tjaVar = (tja) obj;
        return u890.j(this.a, tjaVar.a) && this.b.equals(tjaVar.b) && this.c.equals(tjaVar.c) && u890.j(this.d, tjaVar.d);
    }

    public final int hashCode() {
        return cy30.d(cy30.d(xcg1.g(p3d1.f(this.b, this.a.hashCode() * 31, 31), 31, false), 31, this.c), 961, this.d);
    }
}
