package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class kka {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final List e;

    public kka(String str, String str2, String str3, String str4, List list) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kka)) {
            return false;
        }
        kka kkaVar = (kka) obj;
        return u890.j(this.a, kkaVar.a) && u890.j(this.b, kkaVar.b) && u890.j(this.c, kkaVar.c) && u890.j(this.d, kkaVar.d) && u890.j(this.e, kkaVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }
}
