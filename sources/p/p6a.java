package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class p6a implements jn60 {
    public final String a;
    public final String b;
    public final yz21 c;
    public final ld5 d;

    public p6a(String str, String str2, yz21 yz21Var, ld5 ld5Var) {
        this.a = str;
        this.b = str2;
        this.c = yz21Var;
        this.d = ld5Var;
    }

    public final List d(op80 op80Var) {
        return Collections.singletonList(new kd5(this.d, this.a, op80Var));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p6a)) {
            return false;
        }
        p6a p6aVar = (p6a) obj;
        return this.a.equals(p6aVar.a) && this.b.equals(p6aVar.b) && this.c.equals(p6aVar.c) && this.d.equals(p6aVar.d);
    }

    public final yz21 f() {
        return this.c;
    }

    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.d.hashCode() + bb00.g(this.c, cy30.d(this.a.hashCode() * 31, 961, this.b), 31);
    }
}
