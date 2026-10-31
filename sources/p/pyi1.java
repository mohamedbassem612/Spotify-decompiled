package p;

import com.google.android.gms.maps.model.LatLng;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class pyi1 extends yoi1 {
    public final String h;
    public final String i;
    public final LatLng j;
    public final myi1 k;

    public pyi1(String str, String str2, LatLng latLng, myi1 myi1Var) {
        super((byte) 21);
        this.h = str;
        this.i = str2;
        this.j = latLng;
        this.k = myi1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pyi1)) {
            return false;
        }
        pyi1 pyi1Var = (pyi1) obj;
        return this.h.equals(pyi1Var.h) && this.i.equals(pyi1Var.i) && this.j.equals(pyi1Var.j) && u890.j(this.k, pyi1Var.k);
    }

    public final int hashCode() {
        int iHashCode = (this.j.hashCode() + cy30.d(this.h.hashCode() * 31, 31, this.i)) * 31;
        myi1 myi1Var = this.k;
        return iHashCode + (myi1Var == null ? 0 : myi1Var.hashCode());
    }
}
