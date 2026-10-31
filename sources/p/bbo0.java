package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class bbo0 {
    public final String a;
    public final Function0 b;

    public bbo0(String str, Function0 function0) {
        this.a = str;
        this.b = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bbo0)) {
            return false;
        }
        bbo0 bbo0Var = (bbo0) obj;
        return u890.j(this.a, bbo0Var.a) && u890.j(this.b, bbo0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
