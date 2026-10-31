package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class nra implements Parcelable {
    public static final Parcelable.Creator<nra> CREATOR = new mra((byte) 0);
    public final String a;
    public final tco b;

    public nra(String str, tco tcoVar) {
        this.a = str;
        this.b = tcoVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nra)) {
            return false;
        }
        nra nraVar = (nra) obj;
        return u890.j(this.a, nraVar.a) && u890.j(this.b, nraVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        tco tcoVar = this.b;
        return iHashCode + (tcoVar == null ? 0 : tcoVar.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        tco tcoVar = this.b;
        if (tcoVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            tcoVar.writeToParcel(parcel, i);
        }
    }
}
