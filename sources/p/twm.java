package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class twm {
    public final jo70 a;
    public final jo70 b;
    public final k1r c;
    public final k1r d;
    public final List e;
    public final List f;

    public twm(jo70 jo70Var, jo70 jo70Var2, k1r k1rVar, k1r k1rVar2, List list, List list2) {
        this.a = jo70Var;
        this.b = jo70Var2;
        this.c = k1rVar;
        this.d = k1rVar2;
        this.e = list;
        this.f = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof twm)) {
            return false;
        }
        twm twmVar = (twm) obj;
        return this.a.equals(twmVar.a) && this.b.equals(twmVar.b) && this.c.equals(twmVar.c) && this.d.equals(twmVar.d) && u890.j(this.e, twmVar.e) && u890.j(this.f, twmVar.f);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31;
        List list = this.e;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f;
        return iHashCode2 + (list2 != null ? list2.hashCode() : 0);
    }
}
