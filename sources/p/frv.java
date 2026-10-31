package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class frv implements irv {
    public final List a;
    public final List b;
    public final List c;
    public final bhk0 d;
    public final arv e;

    public frv(List list, List list2, List list3, bhk0 bhk0Var, arv arvVar) {
        this.a = list;
        this.b = list2;
        this.c = list3;
        this.d = bhk0Var;
        this.e = arvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof frv)) {
            return false;
        }
        frv frvVar = (frv) obj;
        return u890.j(this.a, frvVar.a) && u890.j(this.b, frvVar.b) && u890.j(this.c, frvVar.c) && this.d.equals(frvVar.d) && this.e.equals(frvVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + f4i1.b(f4i1.b(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31);
    }
}
