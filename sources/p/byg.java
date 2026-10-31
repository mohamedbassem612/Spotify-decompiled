package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class byg extends u2p1 {
    public final String c;
    public final String d;
    public final ArrayList e;
    public final String f;

    public byg(String str, String str2, String str3, ArrayList arrayList) {
        this.c = str;
        this.d = str2;
        this.e = arrayList;
        this.f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof byg)) {
            return false;
        }
        byg bygVar = (byg) obj;
        return u890.j(this.c, bygVar.c) && u890.j(this.d, bygVar.d) && this.e.equals(bygVar.e) && u890.j(this.f, bygVar.f);
    }

    public final int hashCode() {
        int iHashCode = this.c.hashCode() * 31;
        String str = this.d;
        return this.f.hashCode() + p3d1.f(this.e, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
    }
}
