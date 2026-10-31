package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class h0f0 {
    public final String a;
    public final Function0 b;

    public h0f0(String str, Function0 function0) {
        this.a = str;
        this.b = function0;
    }

    public final String a() {
        return this.a;
    }

    public final Function0 b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0f0)) {
            return false;
        }
        h0f0 h0f0Var = (h0f0) obj;
        return u890.j(this.a, h0f0Var.a) && u890.j(this.b, h0f0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
