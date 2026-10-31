package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class xl implements Parcelable {
    public static final Parcelable.Creator<xl> CREATOR = new ad((byte) 19);
    public final boolean a;
    public final Boolean b;
    public final Boolean c;
    public final Boolean d;
    public final Boolean e;

    public xl(boolean z, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
        this.a = z;
        this.b = bool;
        this.c = bool2;
        this.d = bool3;
        this.e = bool4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xl)) {
            return false;
        }
        xl xlVar = (xl) obj;
        return this.a == xlVar.a && u890.j(this.b, xlVar.b) && u890.j(this.c, xlVar.c) && u890.j(this.d, xlVar.d) && u890.j(this.e, xlVar.e);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        Boolean bool = this.b;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.c;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.d;
        int iHashCode4 = (iHashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.e;
        return iHashCode4 + (bool4 != null ? bool4.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a ? 1 : 0);
        Boolean bool = this.b;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            i3a.m(parcel, 1, bool);
        }
        Boolean bool2 = this.c;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            i3a.m(parcel, 1, bool2);
        }
        Boolean bool3 = this.d;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            i3a.m(parcel, 1, bool3);
        }
        Boolean bool4 = this.e;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            i3a.m(parcel, 1, bool4);
        }
    }
}
