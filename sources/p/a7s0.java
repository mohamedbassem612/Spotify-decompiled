package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class a7s0 {
    public final String a;
    public final String b;
    public final String c;
    public final Function0 d;

    public a7s0(String str, String str2, String str3, Function0 function0) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a7s0)) {
            return false;
        }
        a7s0 a7s0Var = (a7s0) obj;
        return this.a.equals(a7s0Var.a) && this.b.equals(a7s0Var.b) && this.c.equals(a7s0Var.c) && this.d.equals(a7s0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
