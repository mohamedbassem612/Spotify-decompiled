package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class bwb1 {
    public final String a;
    public final boolean b;
    public final Function0 c;
    public final boolean d;

    public bwb1(String str, boolean z, Function0 function0, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = function0;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bwb1)) {
            return false;
        }
        bwb1 bwb1Var = (bwb1) obj;
        return u890.j(this.a, bwb1Var.a) && this.b == bwb1Var.b && u890.j(this.c, bwb1Var.c) && this.d == bwb1Var.d;
    }

    public final int hashCode() {
        int iG = xcg1.g(this.a.hashCode() * 31, 31, this.b);
        Function0 function0 = this.c;
        return Boolean.hashCode(this.d) + ((iG + (function0 == null ? 0 : function0.hashCode())) * 31);
    }

    public /* synthetic */ bwb1(String str) {
        this(str, false, null, false);
    }
}
