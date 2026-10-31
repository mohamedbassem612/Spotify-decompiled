package p;

import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class py8 {
    public final qs31 a;
    public final String b;
    public final String c;
    public final Single d;

    public py8(qs31 qs31Var, String str, String str2, Single single) {
        this.a = qs31Var;
        if (str == null) {
            bhn0.i("Null description");
            throw null;
        }
        this.b = str;
        if (str2 == null) {
            bhn0.i("Null factoryDescription");
            throw null;
        }
        this.c = str2;
        this.d = single;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof py8)) {
            return false;
        }
        py8 py8Var = (py8) obj;
        return this.a.equals(py8Var.a) && this.b.equals(py8Var.b) && this.c.equals(py8Var.c) && this.d.equals(py8Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() ^ ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.a);
        return rjx.o(gvg.n("Command{input=", strValueOf, ", description=", this.b, ", factoryDescription="), this.c, ", asSingle=", String.valueOf(this.d), "}");
    }
}
