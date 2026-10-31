package p;

import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class he91 implements le91 {
    public final ef91 a;
    public final List b;
    public final ice0 c;
    public final x4e0 d;
    public final String e;
    public final String f;
    public final String g;
    public final Set h;
    public final ioj0 i;

    public he91(ef91 ef91Var, List list, ice0 ice0Var, x4e0 x4e0Var, String str, String str2, String str3, Set set, ioj0 ioj0Var) {
        this.a = ef91Var;
        this.b = list;
        this.c = ice0Var;
        this.d = x4e0Var;
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.h = set;
        this.i = ioj0Var;
    }

    @Override // p.le91
    public final String breadcrumb() {
        return "GotSlotContent: " + this.a + ", " + this.b.size() + " sections, strategy=" + this.c + ", source=" + this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof he91)) {
            return false;
        }
        he91 he91Var = (he91) obj;
        return this.a == he91Var.a && u890.j(this.b, he91Var.b) && this.c == he91Var.c && this.d == he91Var.d && u890.j(this.e, he91Var.e) && u890.j(this.f, he91Var.f) && u890.j(this.g, he91Var.g) && u890.j(this.h, he91Var.h) && u890.j(this.i, he91Var.i);
    }

    public final int hashCode() {
        int iD = cy30.d((this.d.hashCode() + ((this.c.hashCode() + f4i1.b(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31, 31, this.e);
        String str = this.f;
        int iD2 = cy30.d((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.g);
        Set set = this.h;
        int iHashCode = (iD2 + (set == null ? 0 : set.hashCode())) * 31;
        ioj0 ioj0Var = this.i;
        return iHashCode + (ioj0Var != null ? ioj0Var.a.hashCode() : 0);
    }
}
