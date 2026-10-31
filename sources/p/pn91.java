package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class pn91 {
    public final on91 a;
    public final kkt0 b;
    public final List c;

    public pn91(on91 on91Var, kkt0 kkt0Var, List list) {
        this.a = on91Var;
        this.b = kkt0Var;
        this.c = list;
    }

    public static pn91 a(pn91 pn91Var, on91 on91Var, kkt0 kkt0Var, List list, int i) {
        if ((i & 1) != 0) {
            on91Var = pn91Var.a;
        }
        if ((i & 2) != 0) {
            kkt0Var = pn91Var.b;
        }
        if ((i & 4) != 0) {
            list = pn91Var.c;
        }
        return new pn91(on91Var, kkt0Var, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pn91)) {
            return false;
        }
        pn91 pn91Var = (pn91) obj;
        return u890.j(this.a, pn91Var.a) && u890.j(this.b, pn91Var.b) && u890.j(this.c, pn91Var.c);
    }

    public final int hashCode() {
        on91 on91Var = this.a;
        int iHashCode = (on91Var == null ? 0 : on91Var.hashCode()) * 31;
        kkt0 kkt0Var = this.b;
        return this.c.hashCode() + ((iHashCode + (kkt0Var != null ? kkt0Var.hashCode() : 0)) * 31);
    }
}
