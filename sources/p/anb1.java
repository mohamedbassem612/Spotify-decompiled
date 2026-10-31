package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class anb1 implements pnb1 {
    public static final Parcelable.Creator<anb1> CREATOR = new olb1((byte) 11);
    public final String a;
    public final zmb1 b;

    public anb1(String str, zmb1 zmb1Var) {
        this.a = str;
        this.b = zmb1Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof anb1)) {
            return false;
        }
        anb1 anb1Var = (anb1) obj;
        return u890.j(this.a, anb1Var.a) && u890.j(this.b, anb1Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        zmb1 zmb1Var = this.b;
        return iHashCode + (zmb1Var == null ? 0 : Integer.hashCode(zmb1Var.a));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeParcelable(this.b, i);
    }
}
