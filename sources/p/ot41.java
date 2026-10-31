package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ot41 {
    public static final ot41 e = new ot41(nt41.b, 0.0f, oa41.X, new sg0(1, (lnm) null, (byte) 27));
    public final nt41 a;
    public final float b;
    public final Function0 c;
    public final iu30 d;

    public ot41(nt41 nt41Var, float f, Function0 function0, iu30 iu30Var) {
        this.a = nt41Var;
        this.b = f;
        this.c = function0;
        this.d = iu30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ot41)) {
            return false;
        }
        ot41 ot41Var = (ot41) obj;
        return this.a == ot41Var.a && Float.compare(this.b, ot41Var.b) == 0 && this.c.equals(ot41Var.c) && this.d.equals(ot41Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + rjx.n(x0d.f(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
