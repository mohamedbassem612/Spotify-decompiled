package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class wjr {
    public final zf30 a;
    public final String b;
    public final Function0 c;
    public final Function0 d;

    public wjr(zf30 zf30Var, String str, Function0 function0, Function0 function1) {
        this.a = zf30Var;
        this.b = str;
        this.c = function0;
        this.d = function1;
    }

    public final zf30 a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wjr)) {
            return false;
        }
        wjr wjrVar = (wjr) obj;
        return u890.j(this.a, wjrVar.a) && u890.j(this.b, wjrVar.b) && this.c.equals(wjrVar.c) && this.d.equals(wjrVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.d.hashCode() + rjx.n((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
    }
}
