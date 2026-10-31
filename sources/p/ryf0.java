package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ryf0 implements Parcelable {
    public static final Parcelable.Creator<ryf0> CREATOR = new isf0((byte) 11);
    public final Parcelable a;
    public final Boolean b;

    public ryf0(Parcelable parcelable, Boolean bool) {
        this.a = parcelable;
        this.b = bool;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ryf0)) {
            return false;
        }
        ryf0 ryf0Var = (ryf0) obj;
        return u890.j(this.a, ryf0Var.a) && u890.j(this.b, ryf0Var.b);
    }

    public final int hashCode() {
        Parcelable parcelable = this.a;
        int iHashCode = (parcelable == null ? 0 : parcelable.hashCode()) * 31;
        Boolean bool = this.b;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        Boolean bool = this.b;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            i3a.m(parcel, 1, bool);
        }
    }
}
