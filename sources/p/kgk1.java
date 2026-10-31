package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class kgk1 implements wgk1 {
    public static final Parcelable.Creator<kgk1> CREATOR = new tfk1((byte) 4);
    public final String a;
    public final xhc0 b;
    public final xfk1 c;
    public final wfk1 d;
    public final fgk1 e;
    public final jgk1 f;
    public final sce g;
    public final rgk1 h;
    public final boolean i;

    public kgk1(String str, xhc0 xhc0Var, xfk1 xfk1Var, wfk1 wfk1Var, fgk1 fgk1Var, jgk1 jgk1Var, sce sceVar, rgk1 rgk1Var, boolean z) {
        this.a = str;
        this.b = xhc0Var;
        this.c = xfk1Var;
        this.d = wfk1Var;
        this.e = fgk1Var;
        this.f = jgk1Var;
        this.g = sceVar;
        this.h = rgk1Var;
        this.i = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kgk1)) {
            return false;
        }
        kgk1 kgk1Var = (kgk1) obj;
        return u890.j(this.a, kgk1Var.a) && u890.j(this.b, kgk1Var.b) && u890.j(this.c, kgk1Var.c) && u890.j(this.d, kgk1Var.d) && u890.j(this.e, kgk1Var.e) && u890.j(this.f, kgk1Var.f) && u890.j(this.g, kgk1Var.g) && u890.j(this.h, kgk1Var.h) && this.i == kgk1Var.i;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        xfk1 xfk1Var = this.c;
        int iHashCode2 = (iHashCode + (xfk1Var == null ? 0 : xfk1Var.hashCode())) * 31;
        wfk1 wfk1Var = this.d;
        int iHashCode3 = (iHashCode2 + (wfk1Var == null ? 0 : wfk1Var.hashCode())) * 31;
        fgk1 fgk1Var = this.e;
        int iHashCode4 = (iHashCode3 + (fgk1Var == null ? 0 : fgk1Var.hashCode())) * 31;
        jgk1 jgk1Var = this.f;
        int iHashCode5 = (iHashCode4 + (jgk1Var == null ? 0 : jgk1Var.hashCode())) * 31;
        sce sceVar = this.g;
        int iHashCode6 = (iHashCode5 + (sceVar == null ? 0 : sceVar.hashCode())) * 31;
        rgk1 rgk1Var = this.h;
        return Boolean.hashCode(this.i) + ((iHashCode6 + (rgk1Var != null ? rgk1Var.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeParcelable(this.b, i);
        xfk1 xfk1Var = this.c;
        if (xfk1Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            xfk1Var.writeToParcel(parcel, i);
        }
        wfk1 wfk1Var = this.d;
        if (wfk1Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            wfk1Var.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.e, i);
        parcel.writeParcelable(this.f, i);
        parcel.writeParcelable(this.g, i);
        rgk1 rgk1Var = this.h;
        if (rgk1Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            rgk1Var.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.i ? 1 : 0);
    }
}
