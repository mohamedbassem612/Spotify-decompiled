package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class m78 {
    public final akm0 a;
    public final ArrayList b;
    public final ngf1 c;
    public final tlz0 d;

    public m78(akm0 akm0Var, ArrayList arrayList, ngf1 ngf1Var, tlz0 tlz0Var) {
        this.a = akm0Var;
        this.b = arrayList;
        this.c = ngf1Var;
        this.d = tlz0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m78)) {
            return false;
        }
        m78 m78Var = (m78) obj;
        return this.a.equals(m78Var.a) && this.b.equals(m78Var.b) && this.c.equals(m78Var.c) && this.d.equals(m78Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + p3d1.f(this.b, this.a.hashCode() * 31, 31)) * 31);
    }
}
