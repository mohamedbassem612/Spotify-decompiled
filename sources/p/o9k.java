package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class o9k {
    public final String a;
    public final String b;
    public final String c;
    public final Function0 d;
    public final Function0 e;

    public o9k(String str, String str2, String str3, Function0 function0, Function0 function1) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = function0;
        this.e = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o9k)) {
            return false;
        }
        o9k o9kVar = (o9k) obj;
        return u890.j(this.a, o9kVar.a) && u890.j(this.b, o9kVar.b) && u890.j(this.c, o9kVar.c) && u890.j(this.d, o9kVar.d) && u890.j(this.e, o9kVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + rjx.n(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }
}
