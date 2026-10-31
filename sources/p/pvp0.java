package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class pvp0 implements Parcelable {
    public static final Parcelable.Creator<pvp0> CREATOR = new ump0((byte) 17);
    public final String a;
    public final zxp0 b;
    public final nrp0 c;
    public final gup0 d;
    public final ArrayList e;

    public pvp0(String str, zxp0 zxp0Var, nrp0 nrp0Var, gup0 gup0Var, ArrayList arrayList) {
        this.a = str;
        this.b = zxp0Var;
        this.c = nrp0Var;
        this.d = gup0Var;
        this.e = arrayList;
    }

    public final int a() {
        zxp0 zxp0Var = this.b;
        int size = zxp0Var != null ? zxp0Var.a.size() : 0;
        nrp0 nrp0Var = this.c;
        int size2 = size + (nrp0Var != null ? nrp0Var.a.size() : 0);
        gup0 gup0Var = this.d;
        return this.e.size() + size2 + (gup0Var != null ? gup0Var.a.size() : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pvp0)) {
            return false;
        }
        pvp0 pvp0Var = (pvp0) obj;
        return u890.j(this.a, pvp0Var.a) && u890.j(this.b, pvp0Var.b) && u890.j(this.c, pvp0Var.c) && u890.j(this.d, pvp0Var.d) && this.e.equals(pvp0Var.e);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        zxp0 zxp0Var = this.b;
        int iHashCode2 = (iHashCode + (zxp0Var == null ? 0 : zxp0Var.a.hashCode())) * 31;
        nrp0 nrp0Var = this.c;
        int iHashCode3 = (iHashCode2 + (nrp0Var == null ? 0 : nrp0Var.a.hashCode())) * 31;
        gup0 gup0Var = this.d;
        return this.e.hashCode() + ((iHashCode3 + (gup0Var != null ? gup0Var.a.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        zxp0 zxp0Var = this.b;
        if (zxp0Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            zxp0Var.writeToParcel(parcel, i);
        }
        nrp0 nrp0Var = this.c;
        if (nrp0Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            nrp0Var.writeToParcel(parcel, i);
        }
        gup0 gup0Var = this.d;
        if (gup0Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            gup0Var.writeToParcel(parcel, i);
        }
        Iterator itO = xvj1.o(this.e, parcel);
        while (itO.hasNext()) {
            ((znp0) itO.next()).writeToParcel(parcel, i);
        }
    }
}
