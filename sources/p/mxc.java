package p;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class mxc {
    public final List a = new ArrayList();
    public int b = 0;
    public boolean c = false;
    public boolean d = false;
    public ln21 e = null;
    public v360 f = null;
    public IOException g = null;
    public boolean h = false;
    public n4g1 i = null;
    public boolean j = false;
    public st60 k = null;

    public final void a(long j, voe1 voe1Var, String str) {
        this.a.add(new sp21(j, voe1Var, str));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mxc)) {
            return false;
        }
        mxc mxcVar = (mxc) obj;
        return this.a.equals(mxcVar.a) && this.b == mxcVar.b && this.c == mxcVar.c && this.d == mxcVar.d && u890.j(this.e, mxcVar.e) && u890.j(this.f, mxcVar.f) && u890.j(this.g, mxcVar.g) && this.h == mxcVar.h && u890.j(this.i, mxcVar.i) && this.j == mxcVar.j && u890.j(this.k, mxcVar.k);
    }

    public final int hashCode() {
        int iG = xcg1.g(xcg1.g(kaa0.f(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31, this.d);
        ln21 ln21Var = this.e;
        int iHashCode = (iG + (ln21Var == null ? 0 : ln21Var.hashCode())) * 31;
        v360 v360Var = this.f;
        int iHashCode2 = (iHashCode + (v360Var == null ? 0 : Arrays.hashCode(v360Var.a))) * 31;
        IOException iOException = this.g;
        int iG2 = xcg1.g((iHashCode2 + (iOException == null ? 0 : iOException.hashCode())) * 31, 31, this.h);
        n4g1 n4g1Var = this.i;
        int iG3 = xcg1.g((iG2 + (n4g1Var == null ? 0 : n4g1Var.hashCode())) * 31, 31, this.j);
        st60 st60Var = this.k;
        return iG3 + (st60Var != null ? st60Var.hashCode() : 0);
    }
}
