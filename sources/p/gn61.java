package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class gn61 {
    public final gu61 a;
    public final String b;
    public final String c;
    public final an61 d;
    public final Function0 e;
    public final boolean f;

    public gn61(gu61 gu61Var, String str, String str2, an61 an61Var, Function0 function0, boolean z) {
        this.a = gu61Var;
        this.b = str;
        this.c = str2;
        this.d = an61Var;
        this.e = function0;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gn61)) {
            return false;
        }
        gn61 gn61Var = (gn61) obj;
        return u890.j(this.a, gn61Var.a) && u890.j(this.b, gn61Var.b) && u890.j(this.c, gn61Var.c) && this.d.equals(gn61Var.d) && u890.j(this.e, gn61Var.e) && this.f == gn61Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + rjx.n((this.d.hashCode() + cy30.d(cy30.d(this.a.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31, 31, this.e);
    }
}
