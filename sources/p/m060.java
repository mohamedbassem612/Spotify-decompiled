package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class m060 {
    public final String a;
    public final int b;
    public final boolean c;
    public final boolean d;
    public final Function0 e;
    public final Function0 f;

    public m060(String str, int i, boolean z, boolean z2, Function0 function0, Function0 function1) {
        this.a = str;
        this.b = i;
        this.c = z;
        this.d = z2;
        this.e = function0;
        this.f = function1;
    }

    public final Function0 a() {
        return this.e;
    }

    public final Function0 b() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m060)) {
            return false;
        }
        m060 m060Var = (m060) obj;
        return u890.j(this.a, m060Var.a) && this.b == m060Var.b && this.c == m060Var.c && this.d == m060Var.d && u890.j(this.e, m060Var.e) && u890.j(this.f, m060Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + rjx.n(xcg1.g(xcg1.g(ab80.k(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31, this.d), 31, this.e);
    }
}
