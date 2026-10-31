package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ab0 {
    public final String a;
    public final String b;
    public final int c;
    public final boolean d;
    public final Function0 e;

    public ab0(int i, String str, String str2, Function0 function0, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = z;
        this.e = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ab0)) {
            return false;
        }
        ab0 ab0Var = (ab0) obj;
        return u890.j(this.a, ab0Var.a) && u890.j(this.b, ab0Var.b) && this.c == ab0Var.c && this.d == ab0Var.d && this.e.equals(ab0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + xcg1.g(kaa0.f(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31), 31, this.d);
    }
}
