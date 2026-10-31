package p;

import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class tfc extends oqq0 implements Serializable {
    public final su30 a;
    public final oqq0 b;

    public tfc(su30 su30Var, oqq0 oqq0Var) {
        this.a = su30Var;
        this.b = oqq0Var;
    }

    public final int compare(Object obj, Object obj2) {
        su30 su30Var = this.a;
        return this.b.compare(su30Var.apply(obj), su30Var.apply(obj2));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof tfc)) {
            return false;
        }
        tfc tfcVar = (tfc) obj;
        return this.a.equals(tfcVar.a) && this.b.equals(tfcVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        return this.b + ".onResultOf(" + this.a + ")";
    }
}
