package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ccd1 {
    public final String a;
    public final Function0 b;

    public ccd1(String str, Function0 function0) {
        this.a = str;
        this.b = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ccd1)) {
            return false;
        }
        ccd1 ccd1Var = (ccd1) obj;
        return this.a.equals(ccd1Var.a) && u890.j(this.b, ccd1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
