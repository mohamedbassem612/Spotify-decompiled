package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class wgw extends j0o1 {
    public final int c;
    public final String d;
    public final ArrayList e;
    public final bff0 f;
    public final String g;

    public wgw(int i, String str, ArrayList arrayList, bff0 bff0Var, String str2) {
        this.c = i;
        this.d = str;
        this.e = arrayList;
        this.f = bff0Var;
        this.g = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wgw)) {
            return false;
        }
        wgw wgwVar = (wgw) obj;
        return this.c == wgwVar.c && u890.j(this.d, wgwVar.d) && this.e.equals(wgwVar.e) && this.f.equals(wgwVar.f) && u890.j(this.g, wgwVar.g);
    }

    public final int hashCode() {
        int iHashCode = (this.f.hashCode() + p3d1.f(this.e, cy30.d(Integer.hashCode(this.c) * 31, 31, this.d), 31)) * 31;
        String str = this.g;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
