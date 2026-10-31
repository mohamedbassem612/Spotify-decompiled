package p;

import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class xih0 {
    public final String a;
    public final Bundle b;
    public final String c;
    public final q1m d;
    public final z6h0 e;
    public final yih0 f;
    public final tzf0 g;

    public xih0(String str, Bundle bundle, String str2, q1m q1mVar, z6h0 z6h0Var, yih0 yih0Var, tzf0 tzf0Var) {
        this.a = str;
        this.b = bundle;
        this.c = str2;
        this.d = q1mVar;
        this.e = z6h0Var;
        this.f = yih0Var;
        this.g = tzf0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof xih0) {
            xih0 xih0Var = (xih0) obj;
            return u890.j(this.a, xih0Var.a) && u890.j(this.b, xih0Var.b) && u890.j(this.c, xih0Var.c) && this.d == xih0Var.d && this.e == xih0Var.e && this.f == xih0Var.f && this.g == xih0Var.g;
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Bundle bundle = this.b;
        int iHashCode2 = (iHashCode + (bundle == null ? 0 : bundle.hashCode())) * 31;
        String str = this.c;
        return this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31)) * 31)) * 31)) * 31);
    }
}
