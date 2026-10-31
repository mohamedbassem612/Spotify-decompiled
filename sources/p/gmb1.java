package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class gmb1 implements pnb1 {
    public static final Parcelable.Creator<gmb1> CREATOR = new olb1((byte) 7);
    public final String a;
    public final td90 b;

    public gmb1(String str, td90 td90Var) {
        this.a = str;
        this.b = td90Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gmb1)) {
            return false;
        }
        gmb1 gmb1Var = (gmb1) obj;
        return u890.j(this.a, gmb1Var.a) && u890.j(this.b, gmb1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeParcelable(this.b, i);
    }
}
