package p;

import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class sy21<T> {
    public final ry21 a;
    public final Object b;
    public final uz21 c;

    public sy21(ry21 ry21Var, Object obj, uz21 uz21Var) {
        this.a = ry21Var;
        this.b = obj;
        this.c = uz21Var;
    }

    public static sy21 a(int i, uz21 uz21Var) {
        Objects.requireNonNull(uz21Var, "body == null");
        if (i < 400) {
            hhg1.n(f4i1.c(i, "code < 400: "));
            return null;
        }
        tz21 tz21Var = uz21.a;
        ArrayList arrayList = new ArrayList(20);
        vyp0 vyp0Var = new vyp0(uz21Var.e(), uz21Var.d());
        ne neVar = new ne((byte) 9);
        neVar.e0("http://localhost/");
        ln21 ln21Var = new ln21(neVar);
        if (i >= 0) {
            return b(uz21Var, new ry21(ln21Var, bjy0.HTTP_1_1, "Response.error()", i, null, new v360((String[]) arrayList.toArray(new String[0])), vyp0Var, null, null, null, null, 0L, 0L, null, a6g1.u0));
        }
        bhn0.f(f4i1.c(i, "code < 0: "));
        return null;
    }

    public static sy21 b(uz21 uz21Var, ry21 ry21Var) {
        Objects.requireNonNull(uz21Var, "body == null");
        if (!ry21Var.Q0) {
            return new sy21(ry21Var, null, uz21Var);
        }
        hhg1.n("rawResponse should not be successful response");
        return null;
    }

    public static sy21 c(Boolean bool) {
        tz21 tz21Var = uz21.a;
        ArrayList arrayList = new ArrayList(20);
        ne neVar = new ne((byte) 9);
        neVar.e0("http://localhost/");
        return d(bool, new ry21(new ln21(neVar), bjy0.HTTP_1_1, "OK", 200, null, new v360((String[]) arrayList.toArray(new String[0])), tz21Var, null, null, null, null, 0L, 0L, null, a6g1.u0));
    }

    public static sy21 d(Object obj, ry21 ry21Var) {
        if (ry21Var.Q0) {
            return new sy21(ry21Var, obj, null);
        }
        hhg1.n("rawResponse must be successful response");
        return null;
    }

    public final String toString() {
        return this.a.toString();
    }
}
