package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class do30 {
    public final String a;
    public final String b;
    public final String c;
    public final Integer d;
    public final Function0 e;

    public do30(String str, String str2, String str3, Integer num, Function0 function0) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = num;
        this.e = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof do30)) {
            return false;
        }
        do30 do30Var = (do30) obj;
        return u890.j(this.a, do30Var.a) && u890.j(this.b, do30Var.b) && u890.j(this.c, do30Var.c) && u890.j(this.d, do30Var.d) && u890.j(this.e, do30Var.e);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.d;
        return this.e.hashCode() + ((iHashCode + (num != null ? num.hashCode() : 0)) * 31);
    }
}
