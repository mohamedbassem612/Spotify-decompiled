package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class gnp0 implements Parcelable {
    public static final Parcelable.Creator<gnp0> CREATOR = new ump0((byte) 3);
    public final String a;
    public final String b;

    public gnp0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gnp0)) {
            return false;
        }
        gnp0 gnp0Var = (gnp0) obj;
        return u890.j(this.a, gnp0Var.a) && u890.j(this.b, gnp0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return gvg.h("basePlanId: ", this.a, " - offerId: ", this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
    }
}
