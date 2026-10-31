package p;

import java.util.ArrayList;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ypy {
    public final String a;
    public final ArrayList b;
    public final Integer c;
    public final int d;
    public final iu30 e;
    public final Function0 f;
    public final iu30 g;

    public ypy(String str, ArrayList arrayList, Integer num, int i, iu30 iu30Var, Function0 function0, iu30 iu30Var2) {
        this.a = str;
        this.b = arrayList;
        this.c = num;
        this.d = i;
        this.e = iu30Var;
        this.f = function0;
        this.g = iu30Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ypy)) {
            return false;
        }
        ypy ypyVar = (ypy) obj;
        return u890.j(this.a, ypyVar.a) && this.b.equals(ypyVar.b) && u890.j(this.c, ypyVar.c) && this.d == ypyVar.d && u890.j(this.e, ypyVar.e) && u890.j(this.f, ypyVar.f) && u890.j(this.g, ypyVar.g);
    }

    public final int hashCode() {
        int iF = p3d1.f(this.b, this.a.hashCode() * 31, 31);
        Integer num = this.c;
        return this.g.hashCode() + rjx.n(ktd.g(this.e, ab80.k(this.d, (iF + (num == null ? 0 : num.hashCode())) * 31, 31), 31), 31, this.f);
    }
}
