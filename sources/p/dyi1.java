package p;

import com.google.android.gms.maps.model.LatLng;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class dyi1 {
    public final String a;
    public final String b;
    public final String c;
    public final LatLng d;
    public final byi1 e;

    public dyi1(String str, String str2, String str3, LatLng latLng, byi1 byi1Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = latLng;
        this.e = byi1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dyi1)) {
            return false;
        }
        dyi1 dyi1Var = (dyi1) obj;
        return this.a.equals(dyi1Var.a) && this.b.equals(dyi1Var.b) && u890.j(this.c, dyi1Var.c) && this.d.equals(dyi1Var.d) && u890.j(this.e, dyi1Var.e);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (this.d.hashCode() + ((iD + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        byi1 byi1Var = this.e;
        return iHashCode + (byi1Var != null ? byi1Var.hashCode() : 0);
    }
}
