package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class xe51 extends l4o1 {
    public final String e;
    public final Function0 f;

    public xe51(String str, Function0 function0) {
        this.e = str;
        this.f = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xe51)) {
            return false;
        }
        xe51 xe51Var = (xe51) obj;
        return u890.j(this.e, xe51Var.e) && u890.j(this.f, xe51Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + (this.e.hashCode() * 31);
    }
}
