package p;

import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class aj1 extends ej1 {
    public final List a;
    public final int b;
    public final w4i1 c;

    static {
        Parcelable.Creator creator = w4i1.CREATOR;
    }

    public aj1(List list, int i, w4i1 w4i1Var) {
        this.a = list;
        this.b = i;
        this.c = w4i1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aj1)) {
            return false;
        }
        aj1 aj1Var = (aj1) obj;
        return u890.j(this.a, aj1Var.a) && this.b == aj1Var.b && u890.j(this.c, aj1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + kaa0.f(this.b, this.a.hashCode() * 31, 31);
    }
}
