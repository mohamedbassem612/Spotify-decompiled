package p;

import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class hj1 implements ij1 {
    public final int a;
    public final int b;
    public final Map c;
    public final List d;
    public final w4i1 e;

    static {
        Parcelable.Creator creator = w4i1.CREATOR;
    }

    public hj1(int i, int i2, Map map, ArrayList arrayList, w4i1 w4i1Var) {
        this.a = i;
        this.b = i2;
        this.c = map;
        this.d = arrayList;
        this.e = w4i1Var;
    }

    public final Map a() {
        return this.c;
    }

    public final int b() {
        return this.a;
    }

    public final int c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hj1)) {
            return false;
        }
        hj1 hj1Var = (hj1) obj;
        return this.a == hj1Var.a && this.b == hj1Var.b && this.c.equals(hj1Var.c) && u890.j(this.d, hj1Var.d) && u890.j(this.e, hj1Var.e);
    }

    public final int hashCode() {
        int iE = cy30.e(kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c);
        List list = this.d;
        return this.e.hashCode() + ((iE + (list == null ? 0 : list.hashCode())) * 31);
    }
}
