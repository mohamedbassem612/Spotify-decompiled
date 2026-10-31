package p;

import com.spotify.home.evopage.mobius.Event;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class dzz implements Event {
    public final List a;
    public final Set b;
    public final Set c;
    public final ioj0 d;
    public final yz21 e;
    public final boolean f;
    public final x4e0 g;
    public final String h;
    public final Set i;
    public final ice0 j;
    public final String k;
    public final String l;

    public dzz(List list, Set set, Set set2, ioj0 ioj0Var, yz21 yz21Var, boolean z, x4e0 x4e0Var, String str, Set set3, ice0 ice0Var, String str2, String str3) {
        this.a = list;
        this.b = set;
        this.c = set2;
        this.d = ioj0Var;
        this.e = yz21Var;
        this.f = z;
        this.g = x4e0Var;
        this.h = str;
        this.i = set3;
        this.j = ice0Var;
        this.k = str2;
        this.l = str3;
    }

    @Override // com.spotify.home.evopage.mobius.Event
    public final String breadcrumb() {
        int size = this.a.size();
        StringBuilder sb = new StringBuilder("GotHomeStructure: ");
        sb.append(size);
        sb.append(" sections, isConnected: ");
        sb.append(this.f);
        sb.append(", loadSource: ");
        sb.append(this.g);
        sb.append(", loadingStrategy: ");
        sb.append(this.j);
        sb.append(", filterValue: ");
        bb00.j(sb, this.h, ", pageToken ", this.k, ", refreshToken ");
        sb.append(this.l);
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dzz)) {
            return false;
        }
        dzz dzzVar = (dzz) obj;
        return this.a.equals(dzzVar.a) && this.b.equals(dzzVar.b) && u890.j(this.c, dzzVar.c) && u890.j(this.d, dzzVar.d) && this.e.equals(dzzVar.e) && this.f == dzzVar.f && this.g == dzzVar.g && u890.j(this.h, dzzVar.h) && u890.j(this.i, dzzVar.i) && this.j == dzzVar.j && this.k.equals(dzzVar.k) && u890.j(this.l, dzzVar.l);
    }

    public final int hashCode() {
        int iC = gvg.c(gvg.c(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        ioj0 ioj0Var = this.d;
        int iD = cy30.d((this.g.hashCode() + xcg1.g(bb00.g(this.e, (iC + (ioj0Var == null ? 0 : ioj0Var.a.hashCode())) * 31, 31), 31, this.f)) * 31, 31, this.h);
        Set set = this.i;
        int iD2 = cy30.d((this.j.hashCode() + ((iD + (set == null ? 0 : set.hashCode())) * 31)) * 31, 31, this.k);
        String str = this.l;
        return iD2 + (str != null ? str.hashCode() : 0);
    }
}
